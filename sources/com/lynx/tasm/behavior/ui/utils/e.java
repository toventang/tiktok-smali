package com.lynx.tasm.behavior.ui.utils;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.utils.b;

public class e {

    /* renamed from: d  reason: collision with root package name */
    protected final j f56411d;

    /* renamed from: e  reason: collision with root package name */
    public BackgroundDrawable f56412e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable.Callback f56413f;

    /* renamed from: g  reason: collision with root package name */
    public float f56414g;

    /* renamed from: h  reason: collision with root package name */
    public int f56415h;

    static {
        Covode.recordClassIndex(35194);
    }

    /* access modifiers changed from: protected */
    public BackgroundDrawable a() {
        return new BackgroundDrawable(this.f56411d, this.f56414g);
    }

    public final b d() {
        BackgroundDrawable backgroundDrawable = this.f56412e;
        if (backgroundDrawable == null) {
            return null;
        }
        return backgroundDrawable.f56372g;
    }

    public final BackgroundDrawable c() {
        if (this.f56412e == null) {
            BackgroundDrawable a2 = a();
            this.f56412e = a2;
            a2.setCallback(this.f56413f);
        }
        return this.f56412e;
    }

    public e(j jVar) {
        this.f56411d = jVar;
    }

    public final void a(int i2) {
        this.f56415h = i2;
        if (i2 != 0 || this.f56412e != null) {
            c().setColor(i2);
        }
    }

    public final void a(int i2, b.a aVar) {
        c().a(i2, aVar);
    }

    public final void a(int i2, float f2, float f3) {
        c().a(i2, f2, f3);
    }
}
