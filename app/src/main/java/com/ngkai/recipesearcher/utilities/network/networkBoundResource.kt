package com.ngkai.recipesearcher.utilities.network

import kotlinx.coroutines.flow.*


/**
 * Network bound resource class
 */
inline fun <ResultType, RequestType> networkBoundResource(
    crossinline query: () -> Flow<ResultType>,
    crossinline fetch: suspend () -> RequestType,
    crossinline saveFetchResult: suspend (RequestType) -> Unit,
    crossinline shouldFetch: (ResultType) -> Boolean
) = flow {
    // Get cache data
    val data = query().first()

    // Check if data should be fetched from network
    val flow = if (shouldFetch(data)) {
        // Set Resource to loading with cache data if exists
        emit(Resource.Loading(data))
        try {
            // Save result to database once network call is successful
            saveFetchResult(fetch())
            query().map { Resource.Success(it) }
        } catch (throwable: Throwable) {
            // Throw error if unsuccessful with cache data if exists
            query().map { Resource.Error(throwable, it) }
        }
    } else {
        // Use cache data
        query().map { Resource.Success(it) }
    }

    emitAll(flow)
}