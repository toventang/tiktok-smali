package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.c;
import com.ss.android.ugc.aweme.simkit.d;
import h.f.b.l;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f133546a = "aweme/v1/play";

    /* renamed from: b  reason: collision with root package name */
    private final String f133547b = "aweme/v2/play";

    /* renamed from: c  reason: collision with root package name */
    private final boolean f133548c;

    /* renamed from: d  reason: collision with root package name */
    private final long f133549d;

    /* renamed from: e  reason: collision with root package name */
    private final long f133550e;

    static {
        Covode.recordClassIndex(87363);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.c
    public final void a(int i2, int i3, e.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean a(int i2, int i3, e eVar) {
        return false;
    }

    public g() {
        c a2 = d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        this.f133548c = b2.getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        c a3 = d.a();
        l.a((Object) a3, "");
        ISimKitConfig b3 = a3.b();
        l.a((Object) b3, "");
        this.f133549d = b3.getSimPlayerExperiment().cdnUrlExpiredOffset();
        c a4 = d.a();
        l.a((Object) a4, "");
        ISimKitConfig b4 = a4.b();
        l.a((Object) b4, "");
        ICommonConfig commonConfig = b4.getCommonConfig();
        l.a((Object) commonConfig, "");
        this.f133550e = (long) commonConfig.getDefaultCDNTimeoutTime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (h.m.p.e((java.lang.CharSequence) r1, (java.lang.CharSequence) r16.f133547b) != false) goto L_0x00ad;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r17, int r18, com.ss.android.ugc.aweme.player.sdk.b.e r19) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.g.b(int, int, com.ss.android.ugc.aweme.player.sdk.b.e):boolean");
    }
}
