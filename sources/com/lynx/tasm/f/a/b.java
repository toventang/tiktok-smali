package com.lynx.tasm.f.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class b extends a {

    /* renamed from: j  reason: collision with root package name */
    private static Method f56604j;

    /* renamed from: k  reason: collision with root package name */
    private static Method f56605k;

    /* renamed from: l  reason: collision with root package name */
    private static Method f56606l;

    /* renamed from: m  reason: collision with root package name */
    private static Method f56607m;
    private static Method n;
    private static Method o;
    private static Method p;

    /* renamed from: b  reason: collision with root package name */
    int f56608b;

    /* renamed from: c  reason: collision with root package name */
    int f56609c;

    /* renamed from: d  reason: collision with root package name */
    int f56610d;

    /* renamed from: e  reason: collision with root package name */
    int f56611e;

    /* renamed from: f  reason: collision with root package name */
    int f56612f;

    /* renamed from: g  reason: collision with root package name */
    int f56613g;

    /* renamed from: h  reason: collision with root package name */
    DisplayList f56614h;

    /* renamed from: i  reason: collision with root package name */
    Constructor<?> f56615i;

    static {
        Covode.recordClassIndex(35302);
    }

    @Override // com.lynx.tasm.f.a.a
    public boolean b() {
        try {
            if (f56604j == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("isValid", new Class[0]);
                f56604j = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return ((Boolean) f56604j.invoke(this.f56614h, new Object[0])).booleanValue();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.f.a.a
    public void a() {
        try {
            if (this.f56615i == null) {
                Constructor<?> constructor = Class.forName("android.view.GLES20DisplayList").getConstructor(new Class[0]);
                this.f56615i = constructor;
                constructor.setAccessible(true);
            }
            this.f56614h = (DisplayList) this.f56615i.newInstance(new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.f.a.a
    public void a(Canvas canvas) {
        a(canvas, this.f56614h);
    }

    @Override // com.lynx.tasm.f.a.a
    public void b(Canvas canvas) {
        try {
            if (f56607m == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("onPostDraw", new Class[0]);
                f56607m = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f56607m.invoke(canvas, new Object[0]);
            try {
                if (p == null) {
                    Method declaredMethod2 = DisplayList.class.getDeclaredMethod("end", new Class[0]);
                    p = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                p.invoke(this.f56614h, new Object[0]);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.lynx.tasm.f.a.a
    public final void a(int i2, int i3) {
        this.f56608b = 0;
        this.f56609c = 0;
        this.f56610d = i2;
        this.f56611e = i3;
    }

    @Override // com.lynx.tasm.f.a.a
    public Canvas b(int i2, int i3) {
        this.f56612f = i2;
        this.f56613g = i3;
        try {
            if (f56605k == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("start", new Class[0]);
                f56605k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Canvas canvas = (Canvas) f56605k.invoke(this.f56614h, new Object[0]);
            a(i2, i3, canvas);
            try {
                if (f56606l == null) {
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("onPreDraw", Rect.class);
                    f56606l = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f56606l.invoke(canvas, null);
                return canvas;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public void a(Canvas canvas, Object obj) {
        try {
            if (o == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("drawDisplayList", DisplayList.class, Integer.TYPE, Integer.TYPE, Rect.class);
                o = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            o.invoke(canvas, obj, Integer.valueOf(this.f56612f), Integer.valueOf(this.f56613g), null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    static void a(int i2, int i3, Canvas canvas) {
        try {
            if (n == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("setViewport", Integer.TYPE, Integer.TYPE);
                n = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            n.invoke(canvas, Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
