package com.bytedance.lottie;

import android.graphics.Rect;
import androidx.c.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.c;
import com.bytedance.lottie.c.c.d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final q f40705a = new q();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<d>> f40706b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, j> f40707c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, c> f40708d;

    /* renamed from: e  reason: collision with root package name */
    public h<com.bytedance.lottie.c.d> f40709e;

    /* renamed from: f  reason: collision with root package name */
    androidx.c.d<d> f40710f;

    /* renamed from: g  reason: collision with root package name */
    public List<d> f40711g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f40712h;

    /* renamed from: i  reason: collision with root package name */
    public float f40713i;

    /* renamed from: j  reason: collision with root package name */
    public float f40714j;

    /* renamed from: k  reason: collision with root package name */
    public float f40715k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f40716l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f40717m;
    public final Set<String> n = new HashSet();
    public boolean o;
    public int p = 0;
    private final HashSet<String> q = new HashSet<>();

    static {
        Covode.recordClassIndex(24985);
    }

    public final float b() {
        return this.f40714j - this.f40713i;
    }

    public final float a() {
        return (float) ((long) ((b() / this.f40715k) * 1000.0f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (d dVar : this.f40711g) {
            sb.append(dVar.a("\t"));
        }
        return sb.toString();
    }

    public final void a(int i2) {
        this.p += i2;
    }

    public final d a(long j2) {
        return this.f40710f.a(j2, null);
    }

    public final void a(String str) {
        this.q.add(str);
    }

    public final void a(boolean z) {
        this.f40705a.f40831b = z;
    }
}
