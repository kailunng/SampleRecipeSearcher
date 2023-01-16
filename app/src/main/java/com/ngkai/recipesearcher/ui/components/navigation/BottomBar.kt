package com.ngkai.recipesearcher.ui.components.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun BottomBar(modifier: Modifier = Modifier, screens: List<Screens.BottomNavScreens>, navController: NavController, currentNavScreen: String) {
    BottomNavigation(
        modifier = modifier
    ) {
        screens.forEach { screen ->
            BottomNavigationItem(
                selectedContentColor = MyTheme.colors.buttonPrimary,
                unselectedContentColor = MyTheme.colors.buttonSecondaryEnabled,
                icon = {
                    if (currentNavScreen == screen.route) {
                        Icon(
                            imageVector = screen.selectedIcon,
                            contentDescription = stringResource(id = screen.title)
                        )
                    } else {
                        Icon(
                            imageVector = screen.unSelectedIcon,
                            contentDescription = stringResource(id = screen.title)
                        )
                    }
                },
                label = { Text(
                    text = stringResource(id = screen.title),
                    fontSize = 3.em,
                    overflow = TextOverflow.Visible)
                },
                selected = currentNavScreen == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpToId
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}