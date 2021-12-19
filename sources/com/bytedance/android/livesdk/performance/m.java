package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20272a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f20273b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20274c;

    /* renamed from: d  reason: collision with root package name */
    private final String f20275d;

    /* renamed from: e  reason: collision with root package name */
    private final String f20276e;

    /* renamed from: f  reason: collision with root package name */
    private final String f20277f;

    /* renamed from: g  reason: collision with root package name */
    private final String f20278g;

    static {
        Covode.recordClassIndex(11967);
    }

    m(LivePerformanceManager livePerformanceManager, Map map, String str, String str2, String str3, String str4, String str5) {
        this.f20272a = livePerformanceManager;
        this.f20273b = map;
        this.f20274c = str;
        this.f20275d = str2;
        this.f20276e = str3;
        this.f20277f = str4;
        this.f20278g = str5;
    }

    public final void run() {
        this.f20272a.lambda$reportPerformance$4$LivePerformanceManager(this.f20273b, this.f20274c, this.f20275d, this.f20276e, this.f20277f, this.f20278g);
    }
}
