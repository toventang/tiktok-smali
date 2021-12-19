package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.utils.c;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static int f93086a = -1;

    static {
        Covode.recordClassIndex(59035);
    }

    public static int a() {
        int b2 = b();
        if (b2 == 1) {
            return 2;
        }
        if (b2 == 2) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    public static PreloadStrategyConfig d() {
        try {
            PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) b.a().a(true, "preload_strategy_hp", PreloadStrategyConfig.class);
            if (preloadStrategyConfig == null) {
                return c();
            }
            return preloadStrategyConfig;
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int a2;
        if (c.f142752a) {
            if (f93086a == -1) {
                f93086a = b.a().a(true, "share_guide", 0);
            }
            a2 = f93086a;
        } else {
            a2 = b.a().a(true, "share_guide", 0);
        }
        if (a2 < 0 || a2 > 2) {
            return 0;
        }
        return a2;
    }

    public static PreloadStrategyConfig c() {
        try {
            PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) b.a().a(true, "preload_strategy", PreloadStrategyConfig.class);
            if (preloadStrategyConfig == null) {
                return PreloadStrategyConfig.convertOldConfig(b.a().a(true, "video_preload_number", 5), b.a().a(true, "video_preload_size", 800));
            }
            return preloadStrategyConfig;
        } catch (Throwable unused) {
        }
    }
}
