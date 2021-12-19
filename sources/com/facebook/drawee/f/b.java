package com.facebook.drawee.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.drawee.e.q;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final q.b f47460a = q.b.f47441g;

    /* renamed from: b  reason: collision with root package name */
    public static final q.b f47461b = q.b.f47442h;

    /* renamed from: c  reason: collision with root package name */
    public Resources f47462c;

    /* renamed from: d  reason: collision with root package name */
    public int f47463d = 300;

    /* renamed from: e  reason: collision with root package name */
    public float f47464e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f47465f = null;

    /* renamed from: g  reason: collision with root package name */
    public q.b f47466g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f47467h;

    /* renamed from: i  reason: collision with root package name */
    public q.b f47468i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f47469j;

    /* renamed from: k  reason: collision with root package name */
    public q.b f47470k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f47471l;

    /* renamed from: m  reason: collision with root package name */
    public q.b f47472m;
    public q.b n;
    public PointF o;
    public ColorFilter p;
    public Drawable q;
    public List<Drawable> r;
    public Drawable s;
    public e t;
    private Matrix u;

    static {
        Covode.recordClassIndex(28798);
    }

    public final a a() {
        b();
        return new a(this);
    }

    private void b() {
        List<Drawable> list = this.r;
        if (list != null) {
            for (Drawable drawable : list) {
                i.a(drawable);
            }
        }
    }

    public static b a(Resources resources) {
        return new b(resources);
    }

    public final b a(Drawable drawable) {
        if (drawable == null) {
            this.s = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.s = stateListDrawable;
        }
        return this;
    }

    public b(Resources resources) {
        this.f47462c = resources;
        q.b bVar = f47460a;
        this.f47466g = bVar;
        this.f47467h = null;
        this.f47468i = bVar;
        this.f47469j = null;
        this.f47470k = bVar;
        this.f47471l = null;
        this.f47472m = bVar;
        this.n = f47461b;
        this.u = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }

    public final b a(q.b bVar) {
        this.n = bVar;
        this.u = null;
        return this;
    }
}
