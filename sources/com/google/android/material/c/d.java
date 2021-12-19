package com.google.android.material.c;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import com.google.android.material.c.c;

public interface d extends c.a {
    static {
        Covode.recordClassIndex(32493);
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C1219d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(C1219d dVar);

    /* renamed from: com.google.android.material.c.d$d  reason: collision with other inner class name */
    public static class C1219d {

        /* renamed from: a  reason: collision with root package name */
        public float f52372a;

        /* renamed from: b  reason: collision with root package name */
        public float f52373b;

        /* renamed from: c  reason: collision with root package name */
        public float f52374c;

        static {
            Covode.recordClassIndex(32497);
        }

        private C1219d() {
        }

        public final boolean a() {
            if (this.f52374c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* synthetic */ C1219d(byte b2) {
            this();
        }

        public final void a(C1219d dVar) {
            a(dVar.f52372a, dVar.f52373b, dVar.f52374c);
        }

        public C1219d(C1219d dVar) {
            this(dVar.f52372a, dVar.f52373b, dVar.f52374c);
        }

        public final void a(float f2, float f3, float f4) {
            this.f52372a = f2;
            this.f52373b = f3;
            this.f52374c = f4;
        }

        public C1219d(float f2, float f3, float f4) {
            this.f52372a = f2;
            this.f52373b = f3;
            this.f52374c = f4;
        }
    }

    public static class a implements TypeEvaluator<C1219d> {

        /* renamed from: a  reason: collision with root package name */
        public static final TypeEvaluator<C1219d> f52368a = new a();

        /* renamed from: b  reason: collision with root package name */
        private final C1219d f52369b = new C1219d((byte) 0);

        static {
            Covode.recordClassIndex(32494);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ C1219d evaluate(float f2, C1219d dVar, C1219d dVar2) {
            C1219d dVar3 = dVar;
            C1219d dVar4 = dVar2;
            this.f52369b.a(com.google.android.material.e.a.a(dVar3.f52372a, dVar4.f52372a, f2), com.google.android.material.e.a.a(dVar3.f52373b, dVar4.f52373b, f2), com.google.android.material.e.a.a(dVar3.f52374c, dVar4.f52374c, f2));
            return this.f52369b;
        }
    }

    public static class b extends Property<d, C1219d> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, C1219d> f52370a = new b("circularReveal");

        static {
            Covode.recordClassIndex(32495);
        }

        private b(String str) {
            super(C1219d.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ C1219d get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(d dVar, C1219d dVar2) {
            dVar.setRevealInfo(dVar2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f52371a = new c("circularRevealScrimColor");

        static {
            Covode.recordClassIndex(32496);
        }

        private c(String str) {
            super(Integer.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }
}
