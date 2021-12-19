package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import h.f.b.j;
import h.f.b.l;
import h.m.p;
import h.z;

public final class bl {

    /* renamed from: a  reason: collision with root package name */
    public static final bl f75683a = new bl();

    public static final class a extends com.bytedance.ies.uikit.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75684a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(46676);
        }

        @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.bytedance.ies.uikit.a.a
        public final void onStop() {
            super.onStop();
            if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
                try {
                    getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private bl() {
    }

    static {
        Covode.recordClassIndex(46675);
    }

    public static final /* synthetic */ class b extends j implements h.f.a.b<Activity, z> {
        static {
            Covode.recordClassIndex(46677);
        }

        public b(a aVar) {
            super(1, aVar, a.class, "proxyPause", "proxyPause(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Activity activity) {
            Activity activity2 = activity;
            l.d(activity2, "");
            l.d(activity2, "");
            d.a a2 = com.bytedance.ies.uikit.a.d.a();
            if (a2 != null) {
                a2.b(activity2);
            }
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class c extends j implements h.f.a.b<Activity, z> {
        static {
            Covode.recordClassIndex(46678);
        }

        public c(a aVar) {
            super(1, aVar, a.class, "proxyResume", "proxyResume(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Activity activity) {
            Activity activity2 = activity;
            l.d(activity2, "");
            l.d(activity2, "");
            d.a a2 = com.bytedance.ies.uikit.a.d.a();
            if (a2 != null) {
                a2.a(activity2);
            }
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class d extends j implements h.f.a.b<Activity, z> {
        static {
            Covode.recordClassIndex(46679);
        }

        public d(a aVar) {
            super(1, aVar, a.class, "proxyStart", "proxyStart(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Activity activity) {
            l.d(activity, "");
            l.d(activity, "");
            com.bytedance.ies.uikit.a.a.f35355k++;
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class e extends j implements h.f.a.b<Activity, z> {
        static {
            Covode.recordClassIndex(46680);
        }

        public e(a aVar) {
            super(1, aVar, a.class, "proxyStop", "proxyStop(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Activity activity) {
            l.d(activity, "");
            l.d(activity, "");
            com.bytedance.ies.uikit.a.a.f35355k--;
            return z.f158842a;
        }
    }

    public static void a(Activity activity, h.f.a.b<? super Activity, z> bVar) {
        Class<?> cls;
        String canonicalName;
        if (!(activity instanceof com.bytedance.ies.uikit.a.a) && activity != null && (cls = activity.getClass()) != null && (canonicalName = cls.getCanonicalName()) != null && p.b(canonicalName, "com.rocket.", false)) {
            bVar.invoke(activity);
        }
    }
}
