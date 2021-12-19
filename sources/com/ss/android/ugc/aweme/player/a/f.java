package com.ss.android.ugc.aweme.player.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final e f114996a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f114997b;

    /* renamed from: c  reason: collision with root package name */
    private final int f114998c;

    /* renamed from: d  reason: collision with root package name */
    private final int f114999d;

    /* renamed from: e  reason: collision with root package name */
    private final VideoUrlModel f115000e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f115001f;

    /* renamed from: g  reason: collision with root package name */
    private final String f115002g;

    /* renamed from: h  reason: collision with root package name */
    private final int f115003h;

    /* renamed from: i  reason: collision with root package name */
    private final String f115004i;

    /* renamed from: j  reason: collision with root package name */
    private final String f115005j;

    /* renamed from: k  reason: collision with root package name */
    private final Aweme f115006k;

    /* renamed from: l  reason: collision with root package name */
    private final long f115007l;

    /* renamed from: m  reason: collision with root package name */
    private final long f115008m;

    static {
        Covode.recordClassIndex(73927);
    }

    f(e eVar, boolean z, int i2, int i3, VideoUrlModel videoUrlModel, boolean z2, String str, int i4, String str2, String str3, Aweme aweme, long j2, long j3) {
        this.f114996a = eVar;
        this.f114997b = z;
        this.f114998c = i2;
        this.f114999d = i3;
        this.f115000e = videoUrlModel;
        this.f115001f = z2;
        this.f115002g = str;
        this.f115003h = i4;
        this.f115004i = str2;
        this.f115005j = str3;
        this.f115006k = aweme;
        this.f115007l = j2;
        this.f115008m = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f114996a.a(this.f114997b, this.f114998c, this.f114999d, this.f115000e, this.f115001f, this.f115002g, this.f115003h, this.f115004i, this.f115005j, this.f115006k, this.f115007l, this.f115008m);
    }
}
