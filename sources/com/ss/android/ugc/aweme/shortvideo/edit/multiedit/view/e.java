package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.p;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f128021a = true;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.fragment.app.e f128022b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Boolean> f128023c;

    /* renamed from: d  reason: collision with root package name */
    private final a<Long> f128024d;

    static {
        Covode.recordClassIndex(83902);
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

    public e(androidx.fragment.app.e eVar, h.f.a.a<Boolean> aVar, h.f.a.a<Long> aVar2) {
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f128022b = eVar;
        this.f128023c = aVar;
        this.f128024d = aVar2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> a(float f2, int i2, float f3, float f4) {
        return a(false, f3, f2, i2, f4);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> b(float f2, int i2, float f3, float f4) {
        return a(true, f2, f3, i2, f4);
    }

    private final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a<Float> a(boolean z, float f2, float f3, int i2, float f4) {
        p<Boolean, Float> b2 = b(z, f2, f3, i2, f4);
        if (!b2.getFirst().booleanValue()) {
            this.f128021a = true;
        } else if (this.f128021a) {
            d.c(this.f128022b, R.string.d13).b();
            this.f128021a = false;
        }
        if (b2.getFirst().booleanValue()) {
            return a.C3283a.a(b2.getSecond());
        }
        return a.C3283a.b(Float.valueOf(0.0f));
    }

    private final p<Boolean, Float> b(boolean z, float f2, float f3, int i2, float f4) {
        float f5;
        if (!this.f128023c.invoke().booleanValue()) {
            return new p<>(false, Float.valueOf(0.0f));
        }
        float f6 = (float) i2;
        float abs = Math.abs((f3 - f2) - f6) * f4;
        float longValue = (float) this.f128024d.invoke().longValue();
        if (abs < longValue) {
            return new p<>(false, Float.valueOf(abs));
        }
        if (z) {
            f5 = (f3 - f6) - (longValue / f4);
        } else {
            f5 = f2 + f6 + (longValue / f4);
        }
        return new p<>(true, Float.valueOf(f5));
    }
}
