package com.bytedance.scene.d;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(26256);
    }

    public static void a(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    public static void c(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    public static C1042a b(View view) {
        return new C1042a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
    }

    public static void a(View view, C1042a aVar) {
        view.setTranslationX(aVar.f42757a);
        view.setTranslationY(aVar.f42758b);
        view.setScaleX(aVar.f42759c);
        view.setScaleY(aVar.f42760d);
        view.setRotation(aVar.f42761e);
        view.setRotationX(aVar.f42762f);
        view.setRotationY(aVar.f42763g);
        view.setAlpha(aVar.f42764h);
    }

    /* renamed from: com.bytedance.scene.d.a$a  reason: collision with other inner class name */
    public static class C1042a {

        /* renamed from: a  reason: collision with root package name */
        public final float f42757a;

        /* renamed from: b  reason: collision with root package name */
        public final float f42758b;

        /* renamed from: c  reason: collision with root package name */
        public final float f42759c;

        /* renamed from: d  reason: collision with root package name */
        public final float f42760d;

        /* renamed from: e  reason: collision with root package name */
        public final float f42761e;

        /* renamed from: f  reason: collision with root package name */
        public final float f42762f;

        /* renamed from: g  reason: collision with root package name */
        public final float f42763g;

        /* renamed from: h  reason: collision with root package name */
        public final float f42764h;

        static {
            Covode.recordClassIndex(26257);
        }

        public C1042a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.f42757a = f2;
            this.f42758b = f3;
            this.f42759c = f4;
            this.f42760d = f5;
            this.f42761e = f6;
            this.f42762f = f7;
            this.f42763g = f8;
            this.f42764h = f9;
        }
    }
}
