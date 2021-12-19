package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.e.al;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class cw {

    /* renamed from: a  reason: collision with root package name */
    static final b f53012a = new b("AssetPackManager");

    /* renamed from: b  reason: collision with root package name */
    final ac f53013b;

    /* renamed from: c  reason: collision with root package name */
    final bg<dj> f53014c;

    /* renamed from: d  reason: collision with root package name */
    final bg<Executor> f53015d;

    /* renamed from: e  reason: collision with root package name */
    private final w f53016e;

    /* renamed from: f  reason: collision with root package name */
    private final al f53017f;

    /* renamed from: g  reason: collision with root package name */
    private final bm f53018g;

    /* renamed from: h  reason: collision with root package name */
    private final ay f53019h;

    /* renamed from: i  reason: collision with root package name */
    private final am f53020i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f53021j = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32742);
    }

    cw(ac acVar, bg<dj> bgVar, w wVar, al alVar, bm bmVar, ay ayVar, am amVar, bg<Executor> bgVar2) {
        this.f53013b = acVar;
        this.f53014c = bgVar;
        this.f53016e = wVar;
        this.f53017f = alVar;
        this.f53018g = bmVar;
        this.f53019h = ayVar;
        this.f53020i = amVar;
        this.f53015d = bgVar2;
    }

    private final void a() {
        this.f53015d.a().execute(new ct(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        boolean a2 = this.f53016e.a();
        this.f53016e.a(z);
        if (z && !a2) {
            a();
        }
    }
}
