package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.i;

public class h {

    /* renamed from: j  reason: collision with root package name */
    private static volatile h f93337j;

    /* renamed from: a  reason: collision with root package name */
    public i f93338a;

    /* renamed from: b  reason: collision with root package name */
    public String f93339b;

    /* renamed from: c  reason: collision with root package name */
    public long f93340c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f93341d;

    /* renamed from: e  reason: collision with root package name */
    public int f93342e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f93343f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f93344g;

    /* renamed from: h  reason: collision with root package name */
    public int f93345h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f93346i = -1;

    static {
        Covode.recordClassIndex(59166);
    }

    private h() {
    }

    public static h a() {
        MethodCollector.i(8899);
        if (f93337j == null) {
            synchronized (h.class) {
                try {
                    if (f93337j == null) {
                        f93337j = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8899);
                    throw th;
                }
            }
        }
        h hVar = f93337j;
        MethodCollector.o(8899);
        return hVar;
    }
}
