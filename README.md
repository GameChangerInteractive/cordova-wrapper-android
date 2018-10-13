# GC Cordova SDK

## Integration Steps

1. Copy **libgcmvpcordova.aar** and **libgcmvp.aar** to **app/libs** directory;
2. Add following to **app/build.gradle**:
  ```
  implementation fileTree(include: ['*.jar', '*.aar'], dir: 'libs')
  implementation "com.google.firebase:firebase-core:+"
  implementation "com.google.firebase:firebase-messaging:+"
  implementation "com.google.firebase:firebase-config:+"
  implementation 'com.google.firebase:firebase-auth:+'
  ```
3. To start GC game following code:
  ```
  Intent intent = new Intent(MainActivity.this, GCCordovaActivity.class);
  intent.putExtra(GCCordovaActivity.EXTRA_GC_URL, url);
  startActivity(intent);
  ```
  where url - string, url of the game to start.
