package com.bytedance.android.live.broadcast.c;

import com.bytedance.android.live.broadcast.p;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    private a f7826e;

    /* renamed from: f  reason: collision with root package name */
    private a f7827f;

    static {
        Covode.recordClassIndex(3872);
    }

    private void d() {
        d.d().a("beauty", this.f7827f);
        a("FaceDistortionEyeIntensity", this.f7777b);
        a("FaceDistortionCheekIntensity", this.f7778c);
    }

    public b() {
        b();
        c();
        a(com.bytedance.android.livesdk.ap.a.Q.a().floatValue());
        c(com.bytedance.android.livesdk.ap.a.S.a().floatValue());
        b(com.bytedance.android.livesdk.ap.a.R.a().floatValue());
    }

    public final a b() {
        if (this.f7826e == null) {
            a aVar = new a();
            this.f7826e = aVar;
            aVar.f22995a = 1111;
            this.f7826e.p.addAll(Arrays.asList("", "smooth/frag/smoothIntensity", "smooth/frag/brightenIntensity"));
            this.f7826e.c(p.INST.getBeautyComposerFilePath());
        }
        return this.f7826e;
    }

    public final a c() {
        if (this.f7827f == null) {
            a aVar = new a();
            this.f7827f = aVar;
            aVar.f22995a = 1112;
            this.f7827f.p.addAll(Arrays.asList("FaceDistortionCheekIntensity", "FaceDistortionEyeIntensity"));
            this.f7827f.c(p.INST.getReshapeComposerFilePath());
        }
        return this.f7827f;
    }

    @Override // com.bytedance.android.live.broadcast.c.a
    public final void e(float f2) {
        if (!a(d.d().b("beauty"), this.f7827f)) {
            d();
        } else {
            a("FaceDistortionEyeIntensity", f2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.c.a
    public final void f(float f2) {
        if (!a(d.d().b("beauty"), this.f7827f)) {
            d();
        } else {
            a("FaceDistortionCheekIntensity", f2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.c.a
    public final void d(float f2) {
        if (!a(d.d().b("beauty"), this.f7826e)) {
            d.d().a("beauty", this.f7826e);
            a("smooth/frag/smoothIntensity", this.f7776a);
            return;
        }
        a("smooth/frag/smoothIntensity", f2);
    }

    private static void a(String str, float f2) {
        d.d().a(str, f2);
    }

    private static boolean a(List<a> list, a aVar) {
        for (a aVar2 : list) {
            if (m.a(aVar2.f23001g, aVar.f23001g)) {
                return true;
            }
        }
        return false;
    }
}
