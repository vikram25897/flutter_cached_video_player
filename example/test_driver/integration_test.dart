// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// TODO(egarciad): Remove once Flutter driver is migrated to null safety.
// @dart = 2.9

import 'dart:async';
import 'dart:convert';
import 'dart:io';
import 'package:flutter_driver/flutter_driver.dart';

Future<void> main() async {
  final FlutterDriver driver = await FlutterDriver.connect();
  final String data =
      await driver.requestData(null, timeout: const Duration(minutes: 1));
  await driver.close();
  final Map<String, dynamic> result = jsonDecode(data);
  exit(result['result'] == 'true' ? 0 : 1);
}
