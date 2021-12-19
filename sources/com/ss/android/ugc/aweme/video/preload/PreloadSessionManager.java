package com.ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class PreloadSessionManager {

    /* renamed from: a  reason: collision with root package name */
    public static final PreloadSessionManager f143503a = new PreloadSessionManager();

    /* renamed from: b  reason: collision with root package name */
    private LruCache<String, PreloadSession> f143504b = new LruCache<>(100);

    public static class PreloadSession {
        public String key;
        public String sourceId;
        public int speed = -3;

        static {
            Covode.recordClassIndex(93898);
        }

        private PreloadSession() {
        }

        static PreloadSession instance() {
            return new PreloadSession();
        }
    }

    static {
        Covode.recordClassIndex(93897);
    }

    private PreloadSessionManager() {
    }

    public final synchronized PreloadSession a(String str) {
        MethodCollector.i(8182);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(8182);
            return null;
        }
        PreloadSession preloadSession = this.f143504b.get(str);
        if (preloadSession == null) {
            preloadSession = PreloadSession.instance();
            preloadSession.key = str;
            preloadSession.speed = -3;
        }
        this.f143504b.put(str, preloadSession);
        MethodCollector.o(8182);
        return preloadSession;
    }

    public final synchronized PreloadSession b(String str) {
        MethodCollector.i(8232);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(8232);
            return null;
        }
        PreloadSession preloadSession = this.f143504b.get(str);
        MethodCollector.o(8232);
        return preloadSession;
    }
}
