# Basic setup

1. Put the apk file for an app in your Downloads folder
2. Connect an Android device to your computer
3. Enable developer mode - https://en-gb.support.motorola.com/app/answers/detail/a_id/159678/~/developer-options
4. Open the Appium Server - https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4
2. Open project in IntelliJ - https://www.jetbrains.com/idea/
   1. You may need to install a Java JDK IntelliJ usually will try to install an open JDK so you might not need to install one.
2. It should import as a Gradle project on its own and add a Gradle tool bar on the right
   1. Click the Gradle toolbar
   2. Click the wrench icon in the pane that opens
   3. Make the dropdown for Use Gradle from is set to 'gradle-wrapper.properties' file
3. On a Windows machine use the keyboard shortcut CTRL + N to open a popup that will search the project for a class. Type main and hit enter.
4. Update the 2nd line in the main method which looks like this ```File appFile = new File(appPath, "app-debug.apk")``` to have your apps apk file name
5. Next to the line number in IntelliJ if you click it should create a break point indicated by a red circle put one on line 22 this will just prevent it from closing when done.
6. Right click inside the method and select Debug 'Main'

This will get you to the point of the app installing and launching.
While the app is running you can use the Appium inspector to find IDs etc. for automating
