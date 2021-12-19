package leakcanary.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import leakcanary.a;
import leakcanary.g;

public final class b implements h.f.a.b<Activity, z> {

    /* renamed from: a  reason: collision with root package name */
    public final g f159413a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<a.C4197a> f159414b;

    /* renamed from: c  reason: collision with root package name */
    private final a f159415c = new a(this);

    static {
        Covode.recordClassIndex(105841);
    }

    public static final class a extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f159416a;

        static {
            Covode.recordClassIndex(105842);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f159416a = bVar;
        }

        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            l.c(fragmentManager, "");
            l.c(fragment, "");
            if (this.f159416a.f159414b.invoke().f159362c) {
                this.f159416a.f159413a.a(fragment);
            }
        }

        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            if (this.f159416a.f159414b.invoke().f159362c && fragment != null) {
                this.f159416a.f159413a.b(fragment);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Activity activity) {
        Activity activity2 = activity;
        l.c(activity2, "");
        activity2.getFragmentManager().registerFragmentLifecycleCallbacks(this.f159415c, true);
        return z.f158842a;
    }

    public b(g gVar, h.f.a.a<a.C4197a> aVar) {
        l.c(gVar, "");
        l.c(aVar, "");
        this.f159413a = gVar;
        this.f159414b = aVar;
    }
}
