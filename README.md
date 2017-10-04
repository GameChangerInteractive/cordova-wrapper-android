# wrapper-android
:iphone: native cordova-enabled android webview

GcmvpCordovaActivity is an Activity by using the Cordova WebView Wrapper including plugins like below:

cordova-plugin-audioinput<br>
cordova-plugin-flashlight<br>
cordova-plugin-insomnia<br>
cordova-plugin-vibration<br>
cordova-plugin-whitelist<br>

# How to use in your AndroidManifest.xml

You must include "GcmvpCordovaActivity" in <application>

<?xml version='1.0' encoding='utf-8'?>

<manifest 
    android:hardwareAccelerated="true" 
    android:versionCode="10000" 
    android:versionName="1.0.0" 
    package="com.it.gcmvp" 
    xmlns:android="http://schemas.android.com/apk/res/android">

    <supports-screens 
        android:anyDensity="true" 
        android:largeScreens="true" 
        android:normalScreens="true" 
        android:resizeable="true" 
        android:smallScreens="true" 
        android:xlargeScreens="true" />

    <uses-sdk android:minSdkVersion="16" android:targetSdkVersion="25" />

    <application 
        android:hardwareAccelerated="true" 
        android:icon="@mipmap/gcmvp_icon" 
        android:label="@string/gcmvp_app_name" 
        android:supportsRtl="true">

        <activity 
            android:configChanges="orientation|keyboardHidden|keyboard|screenSize|locale" 
            android:label="@string/gcmvp_activity_name" 
            android:launchMode="singleTop" 
            android:name=".MainActivity" 
            android:theme="@android:style/Theme.DeviceDefault.NoActionBar" 
            android:windowSoftInputMode="adjustResize">
            <intent-filter android:label="@string/gcmvp_launcher_name">
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
        <activity 
            android:configChanges="orientation|keyboardHidden|keyboard|screenSize|locale" 
            android:name=".GcmvpCordovaActivity" 
            android:launchMode="singleTop" 
            android:theme="@android:style/Theme.DeviceDefault.NoActionBar" 
            android:windowSoftInputMode="adjustResize"/>
        
    </application>
    
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.VIBRATE" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    
</manifest>

# How to use in your Activity

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.go_game_site).setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, GcmvpCordovaActivity.class);
        intent.putExtra(GcmvpCordovaActivity.EXTRA_GCMVP_URL, "https://games.gamechanger.studio/develop"); //for example you replace your custom URL.
        startActivity(intent);
    }
}

# How to use in your xml Layout - activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/go_game_site"
        android:text="Go"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    
</LinearLayout>