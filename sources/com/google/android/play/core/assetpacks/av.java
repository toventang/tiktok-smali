package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import java.util.concurrent.atomic.AtomicBoolean;

final class av {

    /* renamed from: a  reason: collision with root package name */
    static final b f52835a = new b("ExtractorLooper");

    /* renamed from: b  reason: collision with root package name */
    final as f52836b;

    /* renamed from: c  reason: collision with root package name */
    final cq f52837c;

    /* renamed from: d  reason: collision with root package name */
    final ca f52838d;

    /* renamed from: e  reason: collision with root package name */
    final ce f52839e;

    /* renamed from: f  reason: collision with root package name */
    final cj f52840f;

    /* renamed from: g  reason: collision with root package name */
    final bg<dj> f52841g;

    /* renamed from: h  reason: collision with root package name */
    final bp f52842h;

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f52843i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final bm f52844j;

    static {
        Covode.recordClassIndex(32687);
    }

    av(bm bmVar, bg<dj> bgVar, as asVar, cq cqVar, ca caVar, ce ceVar, cj cjVar, bp bpVar) {
        this.f52844j = bmVar;
        this.f52841g = bgVar;
        this.f52836b = asVar;
        this.f52837c = cqVar;
        this.f52838d = caVar;
        this.f52839e = ceVar;
        this.f52840f = cjVar;
        this.f52842h = bpVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Exception exc) {
        try {
            this.f52844j.c(i2);
            this.f52844j.a(i2);
        } catch (au unused) {
            f52835a.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
