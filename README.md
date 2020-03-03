# Cached Video Player

A flutter plugin that has been forked from the official [video_player](https://pub.dev/packages/video_player) package except that it supports caching.


#### `Note: Caching is supported in only Android for now. iOS support will be added later. Feel free to make a PR`.

## Installation

First, add `cached_video_player` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).

Follow the Android and iOS configuration steps of the official [video_player](https://pub.dev/packages/video_player#installation) package. This plugin won't work in Web or Desktop.

### Issues
* iOS not supported for now. It will work like normal `video_player` in iOS.
* `maxFileSize` and `maxCacheSize` are hardcoded at 100MiB and 1GiB respectively.
