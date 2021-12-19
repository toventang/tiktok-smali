package com.airbnb.lottie.g;

import android.content.Context;
import android.os.Handler;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import java.util.Random;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5620a;

    /* renamed from: b  reason: collision with root package name */
    public static String f5621b = "LOTTIE.TRACE";

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5622c;

    /* renamed from: d  reason: collision with root package name */
    public static Handler f5623d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Random f5624e;

    public interface c {
        static {
            Covode.recordClassIndex(2342);
        }

        void a(boolean z);
    }

    /* renamed from: com.airbnb.lottie.g.d$d  reason: collision with other inner class name */
    public interface AbstractC0076d {
        static {
            Covode.recordClassIndex(2343);
        }

        void a(com.airbnb.lottie.e.c.b bVar);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f5625a;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f5626b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f5627c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f5628d;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f5629e;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f5630f;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f5631g;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f5632h;

        /* renamed from: i  reason: collision with root package name */
        public static boolean f5633i;

        /* renamed from: j  reason: collision with root package name */
        public static boolean f5634j;

        /* renamed from: k  reason: collision with root package name */
        public static boolean f5635k = true;

        static {
            Covode.recordClassIndex(2340);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f5649a;

        /* renamed from: b  reason: collision with root package name */
        public static int f5650b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f5651c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f5652d;

        static {
            Covode.recordClassIndex(2344);
        }

        public static void a(Context context) {
            if (!f5652d && context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
                float f2 = context.getResources().getDisplayMetrics().density;
                if (f2 < 2.0f && f2 > 0.01f) {
                    f5651c = true;
                } else if (a.f5631g && f5649a) {
                    f5651c = true;
                }
                f5652d = true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2339);
        e.a();
    }

    public static void a() {
        if (f5622c) {
            new Throwable("FOR LOTTIE DEBUG");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f5636a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f5637b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f5638c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f5639d;

        /* renamed from: e  reason: collision with root package name */
        protected boolean f5640e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f5641f;

        /* renamed from: g  reason: collision with root package name */
        protected boolean f5642g;

        /* renamed from: h  reason: collision with root package name */
        protected boolean f5643h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f5644i;

        /* renamed from: j  reason: collision with root package name */
        protected boolean f5645j;

        /* renamed from: k  reason: collision with root package name */
        protected boolean f5646k;

        /* renamed from: l  reason: collision with root package name */
        protected boolean f5647l;

        /* renamed from: m  reason: collision with root package name */
        protected boolean f5648m;
        protected int n = 2;

        static {
            Covode.recordClassIndex(2341);
        }

        public final b a() {
            this.f5647l = false;
            return this;
        }

        public final b b() {
            this.f5648m = false;
            return this;
        }

        public final String toString() {
            return "Builder{optSwitch=" + this.f5636a + ", optInit=" + this.f5637b + ", optFrameRate=" + this.f5638c + ", optAsyncDraw=" + this.f5639d + ", optAutoRenderMode=" + this.f5640e + ", optSafeMode=" + this.f5641f + ", optMemory=" + this.f5642g + ", optMemoryInLowDevice=" + this.f5644i + ", optBitmapDrawFlagInLowDevice=" + this.f5645j + ", optClearCache=" + this.f5643h + ", isLowDevice=" + this.f5646k + ", maxAsyncDrawThreads=" + this.n + '}';
        }

        public final b c(boolean z) {
            this.f5638c = z;
            return this;
        }

        public final b d(boolean z) {
            this.f5639d = z;
            return this;
        }

        public final b e(boolean z) {
            this.f5640e = z;
            return this;
        }

        public final b f(boolean z) {
            this.f5641f = z;
            return this;
        }

        public final b g(boolean z) {
            this.f5642g = z;
            return this;
        }

        public final b h(boolean z) {
            this.f5644i = z;
            return this;
        }

        public final b i(boolean z) {
            this.f5645j = z;
            return this;
        }

        public final b j(boolean z) {
            this.f5643h = z;
            return this;
        }

        public final b a(boolean z) {
            this.f5636a = z;
            return this;
        }

        public final b b(boolean z) {
            this.f5637b = z;
            return this;
        }
    }

    public static void b(g gVar) {
        if (f5620a) {
            gVar.hashCode();
            gVar.isVisible();
            a();
        }
    }

    public static void c(g gVar) {
        if (f5620a) {
            gVar.hashCode();
            gVar.isVisible();
            a();
        }
    }

    public static void d(g gVar) {
        if (f5620a) {
            gVar.hashCode();
            gVar.isVisible();
            a();
        }
    }

    public static void a(g gVar) {
        if (f5620a) {
            gVar.hashCode();
            gVar.isVisible();
            a();
        }
    }

    public static void e(g gVar) {
        if (f5620a) {
            if (f5624e == null) {
                f5624e = new Random();
            }
            if (((double) f5624e.nextFloat()) < 0.01d) {
                gVar.hashCode();
                gVar.isVisible();
            }
        }
    }

    public static void a(b bVar) {
        if (bVar.f5647l) {
            f5620a = true;
        }
        if (bVar.f5648m) {
            f5622c = true;
        }
        if (bVar.f5636a) {
            a.f5625a = true;
            a.f5626b = bVar.f5637b;
            a.f5627c = bVar.f5638c;
            a.f5628d = bVar.f5639d;
            a.f5629e = bVar.f5640e;
            a.f5634j = bVar.f5641f;
            a.f5630f = bVar.f5642g;
            a.f5631g = bVar.f5644i;
            a.f5632h = bVar.f5645j;
            a.f5633i = bVar.f5643h;
            e.f5649a = bVar.f5646k;
            e.f5650b = Math.max(bVar.n, 1);
            return;
        }
        a.f5625a = false;
        a.f5626b = false;
        a.f5627c = false;
        a.f5628d = false;
        a.f5629e = false;
        a.f5634j = false;
        a.f5630f = false;
        a.f5631g = false;
        a.f5632h = false;
        a.f5633i = false;
        e.f5649a = false;
    }

    public static void a(LottieAnimationView lottieAnimationView, g gVar, Object obj) {
        Integer num;
        if (f5620a) {
            StringBuilder append = new StringBuilder("traceLottieViewSetAnimation  {value=").append(obj).append("  view=").append(lottieAnimationView.hashCode()).append(" visibility:").append(lottieAnimationView.getVisibility()).append(" drawable=");
            if (gVar != null) {
                num = Integer.valueOf(gVar.hashCode());
            } else {
                num = null;
            }
            append.append(num).append(" visible:").append(lottieAnimationView.isShown()).append("}");
            a();
        }
    }
}
