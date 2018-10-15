# GC Cordova SDK

## Integration Steps

1. Copy **libgcmvpcordova.aar** and **libgcmvp.aar** to **app/libs** directory;

2. To start GC game following code:
  ```
  Intent intent = new Intent(MainActivity.this, GCCordovaActivity.class);
  intent.putExtra(GCCordovaActivity.EXTRA_GC_URL, url);
  startActivity(intent);
  ```
  where url - string, url of the game to start.
