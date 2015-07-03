# RadioPlayerService
Android service library which uses AAC Player. Ready to use Radio Player Service. (Android Background Player Service)

# Usage #

## Import .aar library ##

.aar files are like .zip files which includes all library folders (assets, jni, manifest etc.). Android Studio
will help you to easily use .aar libraries.

### STEP 1 ###

Copy "radioplayerservice.aar" file to your /libs folder under your app module. (create "libs" folder if you don't have)

### STEP 2 ###

Open you build.gradle (under your app module) and add repositories and required dependency. Here is the snippet 
from my build.gradle.

```
...

repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    ...
    compile(name:'radioplayerservice', ext:'aar')
    ...
}
```

That's all. Now, You are ready to use library. 

## Using Radio Player Service ##

In your Activity

```java
RadioManager mRadioManager = RadioManager.with(this);
```
```java
//Invoke it #onCreate
mRadioManager.registerListener(this);
```
```java
//Invoke it #onStart
mRadioManager.connect();
```
```java
//Invoke it #onDestroy
mRadioManager.disconnect();
```

Play and pause radio like 
```java
//starts radio streaming.
mRadioManager.startRadio(RADIO_URL);
//stop radio streaming.
mRadioManager.stopRadio();
```
Implement `RadioListener` to get notified on radio state changed.
```java
public class MainActivity extends Activity implements RadioListener
...
 @Override
    public void onRadioStarted() {
        
    }

    @Override
    public void onRadioStopped() {
        
    }

    @Override
    public void onMetaDataReceived(String s, String s1) {
        
    }
...
```
Any fragments can be informed when it is registered.

```java
public class Fragment1 extends Fragment implements RadioListener
...
//invoke this #onCreateView
RadioManager.with(getActivity()).registerListener(this);

//invoke this #onStop()
RadioManager.with(getActivity()).unregisterListener(this);

```




Demo project will help you to understand implementation.

## TODO LIST##

* [ ] Create Notification on Background Service.





