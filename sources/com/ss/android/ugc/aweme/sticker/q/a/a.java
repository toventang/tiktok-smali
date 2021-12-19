package com.ss.android.ugc.aweme.sticker.q.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.camera.d;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public class a implements com.ss.android.ugc.aweme.sticker.senor.a, c {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.effect.a f135433a;

    /* renamed from: b  reason: collision with root package name */
    public final d f135434b;

    /* renamed from: c  reason: collision with root package name */
    private final c f135435c = this;

    static {
        Covode.recordClassIndex(88479);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final c a() {
        return this.f135435c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.c
    public final void a(float f2) {
        this.f135434b.a(0.0f, 0.0f, f2);
    }

    public a(com.ss.android.ugc.asve.recorder.effect.a aVar, d dVar) {
        l.d(aVar, "");
        l.d(dVar, "");
        this.f135433a = aVar;
        this.f135434b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final void a(double[] dArr, double d2) {
        l.d(dArr, "");
        this.f135433a.a(dArr, d2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.c
    public final void a(float[] fArr, double d2) {
        l.d(fArr, "");
        this.f135434b.a(fArr, d2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final void a(double d2, double d3, double d4, double d5) {
        this.f135433a.a(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final void b(double d2, double d3, double d4, double d5) {
        this.f135433a.b(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final void c(double d2, double d3, double d4, double d5) {
        this.f135433a.c(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.a
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f135433a.a(z, z2, z3, z4);
    }
}
