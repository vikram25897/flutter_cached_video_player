package com.lazyarts.vikram.cached_video_player;

import android.content.Context;

import com.google.android.exoplayer2.database.StandaloneDatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;

import java.io.File;

public class SimpleCacheSingleton {
    LeastRecentlyUsedCacheEvictor evictor;
    SimpleCache simpleCache;

    private static SimpleCacheSingleton instance;

    private SimpleCacheSingleton(Context context, long maxCacheSize) {
        evictor = new LeastRecentlyUsedCacheEvictor(maxCacheSize);
        simpleCache = new SimpleCache(new File(context.getCacheDir(), "media"), evictor, new StandaloneDatabaseProvider(context));
    }

    public synchronized static SimpleCacheSingleton getInstance(Context context, long maxCacheSize) {
        if (instance == null) {
            synchronized (SimpleCacheSingleton.class) {
                if (instance == null)
                    instance = new SimpleCacheSingleton(context, maxCacheSize);
            }
        }
        return instance;
    }
}
