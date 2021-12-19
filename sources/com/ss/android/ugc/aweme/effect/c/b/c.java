package com.ss.android.ugc.aweme.effect.c.b;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.a.s;
import h.f.b.l;
import h.p;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f88926a = true;

    /* renamed from: b  reason: collision with root package name */
    private final e f88927b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Boolean> f88928c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.b<Float, Long> f88929d;

    /* renamed from: e  reason: collision with root package name */
    private final s<Boolean, Float, Float, Integer, Float, Float> f88930e;

    static {
        Covode.recordClassIndex(55929);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<p<Float, Float>> b() {
        Float valueOf = Float.valueOf(0.0f);
        return a.C3283a.b(new p(valueOf, valueOf));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final String a() {
        String simpleName = getClass().getSimpleName();
        l.b(simpleName, "");
        return simpleName;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> a(float f2, int i2, float f3, float f4) {
        return a(false, f3, f2, i2, f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Float, java.lang.Long> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.s<? super java.lang.Boolean, ? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Integer, ? super java.lang.Float, java.lang.Float> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, h.f.a.a<Boolean> aVar, h.f.a.b<? super Float, Long> bVar, s<? super Boolean, ? super Float, ? super Float, ? super Integer, ? super Float, Float> sVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(sVar, "");
        this.f88927b = eVar;
        this.f88928c = aVar;
        this.f88929d = bVar;
        this.f88930e = sVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> b(float f2, int i2, float f3, float f4) {
        return a(true, f2, f3, i2, f4);
    }

    private final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> a(boolean z, float f2, float f3, int i2, float f4) {
        p<Boolean, Float> b2 = b(z, f2, f3, i2, f4);
        if (!b2.getFirst().booleanValue()) {
            this.f88926a = true;
        } else if (this.f88926a) {
            d.c(this.f88927b, R.string.bly).b();
            this.f88926a = false;
        }
        if (b2.getFirst().booleanValue()) {
            return a.C3283a.a(b2.getSecond());
        }
        return a.C3283a.b(Float.valueOf(0.0f));
    }

    private final p<Boolean, Float> b(boolean z, float f2, float f3, int i2, float f4) {
        boolean booleanValue = this.f88928c.invoke().booleanValue();
        Float valueOf = Float.valueOf(0.0f);
        if (!booleanValue) {
            return new p<>(false, valueOf);
        }
        if (!a.a(this.f88929d.invoke(Float.valueOf(Math.abs((f3 - f2) - ((float) i2)) * f4)).longValue())) {
            return new p<>(false, valueOf);
        }
        return new p<>(true, Float.valueOf(this.f88930e.invoke(Boolean.valueOf(z), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2), Float.valueOf(f4)).floatValue()));
    }
}
