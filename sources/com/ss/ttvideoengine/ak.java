package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.s.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements VideoSurface.b {

    /* renamed from: a  reason: collision with root package name */
    private final aj f152253a;

    static {
        Covode.recordClassIndex(101483);
    }

    ak(aj ajVar) {
        this.f152253a = ajVar;
    }

    @Override // com.ss.texturerender.VideoSurface.b
    public final void a(int i2) {
        aj ajVar = this.f152253a;
        ajVar.cC = i2;
        if (i2 == 1 || i2 == 2) {
            j.b("TTVideoEngine", "sr fail : ".concat(String.valueOf(i2)));
            ajVar.by.a(2, i2 == 1 ? -7896 : -7895);
        }
        if (ajVar.v == 1 || ajVar.v == 2) {
            ajVar.ae.u(0);
        }
    }
}
