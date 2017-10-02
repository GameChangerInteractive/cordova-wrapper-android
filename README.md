# wrapper-android
:iphone: native cordova-enabled android webview

# How to use
public class CordovaTestActivity extends Activity {

    AcmeWebView acmeWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acme_main);

        acmeWebView = (AcmeWebView) findViewById(R.id.tutorialView);
        acmeWebView.onCreate(savedInstanceState);

        String launchUrl = "https://www.gcmvp.com";
        acmeWebView.loadUrl(launchUrl);
    }

    @Override
    protected void onResume() {
        super.onResume();
        acmeWebView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        acmeWebView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        acmeWebView.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        acmeWebView.onNewIntent(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        acmeWebView.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        acmeWebView.onStart();
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
        acmeWebView.startActivityForResult(intent, requestCode, options);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        acmeWebView.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return acmeWebView.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return acmeWebView.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return acmeWebView.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        acmeWebView.onSaveInstanceState(outState);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        acmeWebView.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}