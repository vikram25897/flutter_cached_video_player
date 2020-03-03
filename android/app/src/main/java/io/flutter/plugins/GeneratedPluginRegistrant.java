package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.lazyarts.vikram.cached_video_player.CachedVideoPlayerPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    CachedVideoPlayerPlugin.registerWith(registry.registrarFor("com.lazyarts.vikram.cached_video_player.CachedVideoPlayerPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
