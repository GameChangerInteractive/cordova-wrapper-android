package com.it.gcmvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Android on 9/29/2017.
 */

public class GcmvpCordovaActivity extends Activity {

    GcmvpWebView gcmvpWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gcmvp_main);

        gcmvpWebView = (GcmvpWebView) findViewById(R.id.tutorialView);
        gcmvpWebView.onCreate(savedInstanceState);
//        loadUrl("https://www.gcmvp.com");
    }

    /**
     * load site
     * @param aUrl
     */
    public void loadUrl(String aUrl) {
        gcmvpWebView.loadUrl(aUrl);
    }

    @Override
    protected void onResume() {
        super.onResume();
        gcmvpWebView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gcmvpWebView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gcmvpWebView.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        gcmvpWebView.onNewIntent(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        gcmvpWebView.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        gcmvpWebView.onStart();
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
        gcmvpWebView.startActivityForResult(intent, requestCode, options);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        gcmvpWebView.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return gcmvpWebView.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return gcmvpWebView.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return gcmvpWebView.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        gcmvpWebView.onSaveInstanceState(outState);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        gcmvpWebView.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
