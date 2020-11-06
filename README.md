# Animation Library

Library to animate Views, Activities, Fragments transitions for Android Apps

<b>Adding SDK to the project:</b>
* Follow the instructions to add the latest version of the SDK: https://jitpack.io/#praveen05git/AnimationLibrary/1.1

<b>Other versions:</b>
* For previous versions of the SDK: https://jitpack.io/#praveen05git/AnimationLibrary

<b>Usage:</b>
* Add the SDK to gradle
* Create an Activity and Object for the Class AnimationLibrary
* Call the required methods through the object

<b>Available Methods:</b>
* Special Animations:
  * Shake: doShakeAnimation()
  * Fade-In: doFadeInAnimation()
* Enter Animations:
  * Enter: doEnterAnimation()
  * Enter from Left: doLeftEnterAnimation()
  * Enter from right: doRightEnterAnimation()
* Exit Animations:
  * Exit: doExitAnimation()
  * Exit through Left: doLeftExitAnimation()
  * Exit through Right: doRightExitAnimation()
* Transition Animations:
  * Activity1/Fragment1 Exit though Left and Acitivty2/Fragment2 enters from Right: rightEnterLeftOut()
  * Activity1/Fragment1 Exit though Right and Acitivty2/Fragment2 enters from Left: leftEnterRightOut()
  
<b>Sample:</b>
* Sample project and APK can be found here: https://github.com/praveen05git/AnimationLibrarySample
