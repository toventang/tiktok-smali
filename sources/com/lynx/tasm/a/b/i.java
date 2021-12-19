package com.lynx.tasm.a.b;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxUI;

public class i extends Animation implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LynxUI f55666a;

    /* renamed from: b  reason: collision with root package name */
    private final View f55667b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55668c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55669d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55670e;

    /* renamed from: f  reason: collision with root package name */
    private final int f55671f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55672g;

    /* renamed from: h  reason: collision with root package name */
    private final int f55673h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55674i;

    /* renamed from: j  reason: collision with root package name */
    private final int f55675j;

    /* renamed from: k  reason: collision with root package name */
    private final int f55676k;

    /* renamed from: l  reason: collision with root package name */
    private final int f55677l;

    /* renamed from: m  reason: collision with root package name */
    private final int f55678m;
    private final int n;
    private final Rect o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int t;
    private int u;
    private int v;
    private int w;

    static {
        Covode.recordClassIndex(34834);
    }

    public boolean willChangeBounds() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f2, Transformation transformation) {
        this.f55666a.updateLayout(Math.round(this.p + (this.r * f2)), Math.round(this.q + (this.s * f2)), Math.round(((float) this.t) + (((float) this.v) * f2)), Math.round(((float) this.u) + (((float) this.w) * f2)), this.f55668c, this.f55669d, this.f55670e, this.f55671f, this.f55672g, this.f55673h, this.f55674i, this.f55675j, this.f55676k, this.f55677l, this.f55678m, this.n, this.o);
    }

    @Override // com.lynx.tasm.a.b.f
    public final void a(int i2, int i3, int i4, int i5) {
        b(i2, i3, i4, i5);
    }

    private void b(int i2, int i3, int i4, int i5) {
        this.p = ((float) this.f55666a.getOriginLeft()) - this.f55666a.getTranslationX();
        this.q = ((float) this.f55666a.getOriginTop()) - this.f55666a.getTranslationY();
        this.t = this.f55666a.getWidth();
        int height = this.f55666a.getHeight();
        this.u = height;
        this.r = ((float) i2) - this.p;
        this.s = ((float) i3) - this.q;
        this.v = i4 - this.t;
        this.w = i5 - height;
    }

    public i(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        this.f55666a = lynxUI;
        this.f55667b = lynxUI.mView;
        this.f55668c = i6;
        this.f55669d = i7;
        this.f55670e = i8;
        this.f55671f = i9;
        this.f55672g = i10;
        this.f55673h = i11;
        this.f55674i = i12;
        this.f55675j = i13;
        this.f55676k = i14;
        this.f55677l = i15;
        this.f55678m = i16;
        this.n = i17;
        this.o = rect;
        b(i2, i3, i4, i5);
    }
}
