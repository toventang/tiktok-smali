package com.lynx.tasm.a.b;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<LynxUI> f55647a;

    /* renamed from: b  reason: collision with root package name */
    public int f55648b;

    /* renamed from: c  reason: collision with root package name */
    public int f55649c;

    /* renamed from: d  reason: collision with root package name */
    public int f55650d;

    /* renamed from: e  reason: collision with root package name */
    public int f55651e;

    /* renamed from: f  reason: collision with root package name */
    public int f55652f;

    /* renamed from: g  reason: collision with root package name */
    public int f55653g;

    /* renamed from: h  reason: collision with root package name */
    public int f55654h;

    /* renamed from: i  reason: collision with root package name */
    public int f55655i;

    /* renamed from: j  reason: collision with root package name */
    public int f55656j;

    /* renamed from: k  reason: collision with root package name */
    public int f55657k;

    /* renamed from: l  reason: collision with root package name */
    public int f55658l;

    /* renamed from: m  reason: collision with root package name */
    public int f55659m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Rect r;
    public a s;
    public a t;
    public a u;
    public final SparseArray<f> v = new SparseArray<>(0);
    public float w = -1.0f;
    public boolean x = false;

    static {
        Covode.recordClassIndex(34826);
    }

    public final LynxUI a() {
        WeakReference<LynxUI> weakReference = this.f55647a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final a b() {
        if (this.s == null) {
            this.s = new d();
        }
        return this.s;
    }

    public final a c() {
        if (this.t == null) {
            this.t = new g();
        }
        return this.t;
    }

    public final a d() {
        if (this.u == null) {
            this.u = new e();
        }
        return this.u;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Map<String, Object> f55662a;

        static {
            Covode.recordClassIndex(34828);
            HashMap hashMap = new HashMap();
            f55662a = hashMap;
            hashMap.put("animation_type", "");
        }

        public static void a(LynxUI lynxUI, String str, String str2) {
            if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
                f55662a.put("animation_type", str2);
                lynxUI.mContext.f55897e.a(new com.lynx.tasm.c.b(lynxUI.getSign(), str, f55662a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<c> f55660a;

        /* renamed from: b  reason: collision with root package name */
        private String f55661b;

        static {
            Covode.recordClassIndex(34827);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            LynxUI a2;
            c cVar = this.f55660a.get();
            if (cVar != null && (a2 = cVar.a()) != null) {
                T t = a2.mView;
                b.a(a2, "animationend", this.f55661b);
                String str = this.f55661b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof f) {
                        cVar.v.remove(a2.getSign());
                    } else if ((animation instanceof h) && cVar.x) {
                        t.setLayerType(0, null);
                        cVar.x = false;
                    }
                } else if (str == "layout-animation-delete") {
                    if ((animation instanceof h) && cVar.x) {
                        t.setLayerType(0, null);
                        cVar.x = false;
                    }
                    a2.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
                }
            }
        }

        public final void onAnimationStart(Animation animation) {
            LynxUI a2;
            c cVar = this.f55660a.get();
            if (cVar != null && (a2 = cVar.a()) != null) {
                T t = a2.mView;
                b.a(a2, "animationstart", this.f55661b);
                String str = this.f55661b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof f) {
                        cVar.v.put(a2.getSign(), animation);
                    } else if ((animation instanceof h) && t.getLayerType() == 0) {
                        cVar.x = true;
                        t.setLayerType(2, null);
                    }
                } else if (str == "layout-animation-delete" && (animation instanceof h) && t.getLayerType() == 0) {
                    cVar.x = true;
                    t.setLayerType(2, null);
                }
            }
        }

        public a(c cVar, String str) {
            this.f55660a = new WeakReference<>(cVar);
            this.f55661b = str;
        }
    }

    public final void a(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        a aVar;
        T t2 = lynxUI.mView;
        if (this.w == -1.0f) {
            this.w = t2.getAlpha();
        }
        f fVar = this.v.get(lynxUI.getSign());
        if (fVar != null) {
            fVar.a(i2, i3, i4, i5);
            return;
        }
        if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
            aVar = this.s;
        } else {
            aVar = this.t;
        }
        Animation animation = null;
        a aVar2 = this.u;
        if (aVar2 == null || !aVar2.a() || i4 != 0 || i5 != 0) {
            a aVar3 = this.u;
            int i18 = i12;
            int i19 = i11;
            if ((aVar3 == null || !aVar3.a()) && i4 == 0 && i5 == 0) {
                lynxUI.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i19, i18, i13, i14, i15, i16, i17, rect);
                return;
            }
            if (aVar != null) {
                i19 = i19;
                i18 = i18;
                animation = aVar.b(lynxUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i19, i18, i13, i14, i15, i16, i17, rect, this.w);
            }
            if ((animation instanceof TranslateAnimation) && (lynxUI.mParent instanceof UIShadowProxy)) {
                t2 = ((LynxUI) lynxUI.mParent).mView;
            }
            if (animation == null) {
                float f2 = this.w;
                if (f2 != -1.0f) {
                    t2.setAlpha(f2);
                }
                WeakReference<LynxUI> weakReference = this.f55647a;
                if (weakReference != null) {
                    weakReference.clear();
                }
                lynxUI.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i19, i18, i13, i14, i15, i16, i17, rect);
                return;
            }
            this.f55647a = new WeakReference<>(lynxUI);
            this.f55648b = i2;
            this.f55649c = i3;
            this.f55650d = i4;
            this.f55651e = i5;
            this.f55652f = i6;
            this.f55653g = i7;
            this.f55654h = i8;
            this.f55655i = i9;
            this.n = i10;
            this.o = i19;
            this.p = i18;
            this.q = i13;
            this.f55656j = i14;
            this.f55657k = i15;
            this.f55658l = i16;
            this.f55659m = i17;
            this.r = rect;
            if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
                animation.setAnimationListener(new a(this, "layout-animation-create"));
            } else {
                animation.setAnimationListener(new a(this, "layout-animation-update"));
            }
            if (animation instanceof f) {
                lynxUI.requestLayout();
            } else {
                lynxUI.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i19, i18, i13, i14, i15, i16, i17, rect);
            }
            lynxUI.onBeforeAnimation(i2, i3, i4, i5, i6, i7, i8, i9);
            t2.startAnimation(animation);
            return;
        }
        T t3 = lynxUI.mView;
        this.f55647a = new WeakReference<>(lynxUI);
        Animation b2 = this.u.b(lynxUI, t3.getLeft(), t3.getTop(), t3.getWidth(), t3.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect(), this.w);
        if (b2 == null) {
            lynxUI.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
            return;
        }
        b2.setAnimationListener(new a(this, "layout-animation-delete"));
        t3.startAnimation(b2);
    }
}
