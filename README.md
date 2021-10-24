# Types-of-bar-in-android



There are different types of bars available in android.

Status Bar, Action Bar/Toolbar/App Bar, 
System Bar/Android Navigation Bar , 
Progress Bar, Seek Bar, Snackbar ,RatingBar

## status bar
In an Android phone, the status bar contains the clock, battery icon, and other notification icons as shown in the below image. This is provided by the system; the app does not directly manipulate the contents of this bar.

## Action Bar/Toolbar/App Bar
> java.lang.Object
↳ android.app.ActionBar

> java.lang.Object
↳ android.view.View 
↳ android.view.ViewGroup
↳ android.widget.Toolbar

### appbar and actionbar
- ActionBar was launched by Google in 2013 with the release of Android 3.0(API 11).

- All applications that use the default theme provided by the Android(Theme.AppCompat.Light.DarkActionBar), contains an ActionBar by default.

- Prior to Android 3.0(Honeycomb), the user interactive elements like any option or action are placed inside the Menu button located in the AppBar.

- Components included in the AppBar are:
  - Title
  - Menu button


- Components that can be included in the ActionBar are:
   - Navigation control button/drawer
   - App icon
   - Title and Subtitle
   - Action button
   - Action overflow menu
   
 - Action bar is a dedicated navigation or control element present at top of each screen of the application.

### toolbar
- The Toolbar is a kind of ViewGroup that can be placed anywhere,introduced during the release of android lollipop.

- it is more advanced than toolbar.

- Following are the components that can be added to a Toolbar:
    - A navigation button/drawer or an Up button
    - Brand logo/App icon
    - Title and Subtitle
    - ActionMenu items
    - Multiple custom views such as TextView, ImageView, etc.


## System Bar/Android Navigation Bar
The navigation or system bar contains the HOME, BACK, etc. buttons. it is usually present at the bottom of the screen. This is given by the system,the app doesn’t directly manage the contents of this bar.

## progress bar
ProgressBar is a UI control that shows the progress of an operation.

## seek bar
seek bar has a draggable thumb in which the users can drag the thumb back and forth to set the current progress value. We can use the seek bar in our android device like Brightness control, volume control, etc.

## rating bar
RatingBar is used to get the rating from the users. It is an extension of SeekBar and ProgressBar that shows star ratings and it allows users to give the rating by clicking on the stars.

## snack bar
Snackbar provides feedback about an operation. The message appears at the bottom of the screen on mobile and lower left on larger devices.

