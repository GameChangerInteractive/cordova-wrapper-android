cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "cordova-plugin-audioinput.AudioInput",
        "file": "plugins/cordova-plugin-audioinput/www/audioInputCapture.js",
        "pluginId": "cordova-plugin-audioinput",
        "clobbers": [
            "audioinput"
        ]
    },
    {
        "id": "cordova-plugin-insomnia.Insomnia",
        "file": "plugins/cordova-plugin-insomnia/www/Insomnia.js",
        "pluginId": "cordova-plugin-insomnia",
        "clobbers": [
            "window.plugins.insomnia"
        ]
    },
    {
        "id": "cordova-plugin-vibration.notification",
        "file": "plugins/cordova-plugin-vibration/www/vibration.js",
        "pluginId": "cordova-plugin-vibration",
        "merges": [
            "navigator.notification",
            "navigator"
        ]
    },
    {
        "id": "cordova-plugin-flashlight.Flashlight",
        "file": "plugins/cordova-plugin-flashlight/www/Flashlight.js",
        "pluginId": "cordova-plugin-flashlight",
        "clobbers": [
            "window.plugins.flashlight"
        ]
    },
    {
        "id": "cordova-plugin-dialogs.notification",
        "file": "plugins/cordova-plugin-dialogs/www/notification.js",
        "pluginId": "cordova-plugin-dialogs",
        "merges": [
            "navigator.notification"
        ]
    },
    {
        "id": "cordova-plugin-dialogs.notification_android",
        "file": "plugins/cordova-plugin-dialogs/www/android/notification.js",
        "pluginId": "cordova-plugin-dialogs",
        "merges": [
            "navigator.notification"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.3.2",
    "cordova-plugin-compat": "1.0.0",
    "cordova-plugin-audioinput": "0.3.0",
    "cordova-plugin-insomnia": "4.3.0",
    "cordova-plugin-vibration": "2.1.5",
    "cordova-plugin-flashlight": "3.2.0",
    "cordova-plugin-dialogs": "1.3.3",
    "cordova-plugin-remote-injection": "0.5.2"
};
// BOTTOM OF METADATA
});