# Cached Video Player

A flutter plugin that has been forked from the official [video_player](https://pub.dev/packages/video_player) package except that it supports caching in Android and iOS.
Web plugin will work like official [video_player](https://pub.dev/packages/video_player) i.e. without caching support.

## Installation

First, add `cached_video_player` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).

Follow the Android and iOS configuration steps of the official [video_player](https://pub.dev/packages/video_player#installation) package. This plugin won't work in Desktop.

### Issues
* `maxFileSize` and `maxCacheSize` are hardcoded at 100MiB and 1GiB respectively in Android.

### Contributors

* [Vikram Pratap Singh](https://github.com/vikram25897)
* [EnderTan](https://github.com/EnderTan)
* [Philipp Bauer](https://github.com/ciriousjoker)