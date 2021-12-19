package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bu implements f {

    /* renamed from: a  reason: collision with root package name */
    private final bs f14651a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14652b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14653c;

    static {
        Covode.recordClassIndex(8134);
    }

    bu(bs bsVar, a aVar, Context context) {
        this.f14651a = bsVar;
        this.f14652b = aVar;
        this.f14653c = context;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f14651a.a(this.f14652b, this.f14653c);
    }
}
