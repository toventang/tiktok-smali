package com.ss.android.ugc.aweme.canvas.a;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f69655a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f69656b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f69657c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f69658d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f69659e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f69660f;

    /* renamed from: g  reason: collision with root package name */
    final float[] f69661g;

    /* renamed from: h  reason: collision with root package name */
    final float[] f69662h;

    /* renamed from: i  reason: collision with root package name */
    final float[] f69663i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f69664j = true;

    c() {
        float[] fArr = new float[3];
        this.f69661g = fArr;
        float[] fArr2 = new float[3];
        this.f69662h = fArr2;
        float[] fArr3 = new float[3];
        this.f69663i = fArr3;
        a(fArr);
        a(fArr2);
        fArr3[0] = 0.24f;
        fArr3[1] = 0.52f;
        fArr3[2] = 0.24f;
    }

    static {
        Covode.recordClassIndex(42958);
        c cVar = new c();
        f69655a = cVar;
        c(cVar);
        d(cVar);
        c cVar2 = new c();
        f69656b = cVar2;
        b(cVar2);
        d(cVar2);
        c cVar3 = new c();
        f69657c = cVar3;
        a(cVar3);
        d(cVar3);
        c cVar4 = new c();
        f69658d = cVar4;
        c(cVar4);
        e(cVar4);
        c cVar5 = new c();
        f69659e = cVar5;
        b(cVar5);
        e(cVar5);
        c cVar6 = new c();
        f69660f = cVar6;
        a(cVar6);
        e(cVar6);
    }

    private static void a(c cVar) {
        float[] fArr = cVar.f69662h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void c(c cVar) {
        float[] fArr = cVar.f69662h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void d(c cVar) {
        float[] fArr = cVar.f69661g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void e(c cVar) {
        float[] fArr = cVar.f69661g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void b(c cVar) {
        float[] fArr = cVar.f69662h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }
}
