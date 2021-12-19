package com.ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.watcher.IWatcher;
import com.bytedance.ies.watcher.b;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.HashMap;

public final class WatcherImpl implements IWatcher {
    static {
        Covode.recordClassIndex(68880);
    }

    public static final class a extends com.bytedance.ies.watcher.a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f107671a = {"extra", "play_count", "share_count", "comment_count", "digg_count", "download_count", "photosensitiveMaskInfo", "reportMaskInfo", "generalMaskInfo", "createTime", "user_count", "view_count"};

        /* renamed from: b  reason: collision with root package name */
        public final String[] f107672b = {"tiktokcdn", "/obj/"};

        static {
            Covode.recordClassIndex(68881);
        }

        @Override // com.bytedance.ies.watcher.b, com.bytedance.ies.watcher.a
        public final String[] a() {
            return this.f107671a;
        }

        a() {
        }

        @Override // com.bytedance.ies.watcher.b, com.bytedance.ies.watcher.a
        public final void a(String str, long j2) {
            l.d(str, "");
            super.a(str, j2);
            HashMap hashMap = new HashMap();
            hashMap.put(str, String.valueOf(j2));
            r.a("metrics_watcher", hashMap);
        }
    }

    @Override // com.bytedance.ies.watcher.IWatcher
    public final b a() {
        return new a();
    }

    public static IWatcher b() {
        MethodCollector.i(5968);
        Object a2 = com.ss.android.ugc.b.a(IWatcher.class, false);
        if (a2 != null) {
            IWatcher iWatcher = (IWatcher) a2;
            MethodCollector.o(5968);
            return iWatcher;
        }
        if (com.ss.android.ugc.b.co == null) {
            synchronized (IWatcher.class) {
                try {
                    if (com.ss.android.ugc.b.co == null) {
                        com.ss.android.ugc.b.co = new WatcherImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5968);
                    throw th;
                }
            }
        }
        WatcherImpl watcherImpl = (WatcherImpl) com.ss.android.ugc.b.co;
        MethodCollector.o(5968);
        return watcherImpl;
    }
}
