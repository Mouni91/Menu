# Menu
Menus are a common user interface component in many types of applications. To provide a familiar and consistent user experience, you should use the Menu APIs to present user actions and other options in your activities.
# Options menu and app bar
The options menu is the primary collection of menu items for an activity. It's where you should place actions that have a global impact on the app, such as "Search," "Compose email," and "Settings."
See the section about Creating an Options Menu.

# Steps To Create Option Menus1.
1.XML menu resource (menu_main.xml) <br />
2.onCreateOptionsMenu() to inflate the menu <br />
3.onClick attribute or onOptionsItemSelected() <br />
4.Method to handle item click

# Create menu resource
1.Create menu resource directory <br />
2.Create XML menu resource (menu_main.xml) <br />
3.Add an entry for each menu item

 <item  android:id="@+id/option_settings"
        android:title="@string/settings" />

