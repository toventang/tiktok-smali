package com.ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.mask.b.a;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74432a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f74433b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f74434c;

    static {
        Covode.recordClassIndex(45906);
    }

    w(h hVar, boolean z, boolean z2) {
        this.f74432a = hVar;
        this.f74433b = z;
        this.f74434c = z2;
    }

    public final void run() {
        h hVar = this.f74432a;
        boolean z = this.f74433b;
        boolean z2 = this.f74434c;
        hVar.t.setVisibility(8);
        if (z) {
            hVar.I();
            if (hVar.af != null && z2) {
                hVar.af.c().a(hVar.o, hVar.ae, 2, hVar.n + 1);
            }
            c.a(new a(false, hVar.o.getAid()));
        } else if (TextUtils.equals(hVar.ad, "general_search")) {
            c.a(new a(false, hVar.o.getAid()));
        }
    }
}
