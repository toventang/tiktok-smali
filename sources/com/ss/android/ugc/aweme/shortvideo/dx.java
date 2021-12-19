package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.w;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dx implements b {

    /* renamed from: a  reason: collision with root package name */
    private final dw f126653a;

    /* renamed from: b  reason: collision with root package name */
    private final w f126654b;

    static {
        Covode.recordClassIndex(83071);
    }

    dx(dw dwVar, w wVar) {
        this.f126653a = dwVar;
        this.f126654b = wVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        dw dwVar = this.f126653a;
        dwVar.f126647a.runOnUiThread(new dy(dwVar, (Integer) obj, this.f126654b));
        return z.f158842a;
    }
}
