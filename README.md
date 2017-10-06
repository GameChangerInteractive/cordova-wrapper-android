# wrapper-android v1.0.0
:iphone: native cordova-enabled android webview

# How to use in your settings.gradle
```
include ':libgcmvp', ':libgcmvpcordova'
```
# How to use in your module gradle
```
compile project(path: ':libgcmvp')

compile project(path: ':libgcmvpcordova')
```
# How to use in your Activity
```
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
        intent.putExtra(GcmvpCordovaActivity.EXTRA_GCMVP_URL, 
        "https://games.gamechanger.studio/develop"); //For example: you can replace your custom URL.
        startActivity(intent);
    }
    
}
```
# How to use in your xml Layout - activity_main.xml
```
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
```
