package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

public final class x extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public a f3560a;

    interface a {
        static {
            Covode.recordClassIndex(1345);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(1344);
    }

    /* access modifiers changed from: package-private */
    public static class b implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(1346);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        b() {
        }

        public final void onActivityPostResumed(Activity activity) {
            x.a(activity, i.a.ON_RESUME);
        }

        public final void onActivityPostStarted(Activity activity) {
            x.a(activity, i.a.ON_START);
        }

        public final void onActivityPreDestroyed(Activity activity) {
            x.a(activity, i.a.ON_DESTROY);
        }

        public final void onActivityPrePaused(Activity activity) {
            x.a(activity, i.a.ON_PAUSE);
        }

        public final void onActivityPreStopped(Activity activity) {
            x.a(activity, i.a.ON_STOP);
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
            x.a(activity, i.a.ON_CREATE);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        a(i.a.ON_DESTROY);
        this.f3560a = null;
    }

    public final void onPause() {
        super.onPause();
        a(i.a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f3560a;
        if (aVar != null) {
            aVar.b();
        }
        a(i.a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f3560a;
        if (aVar != null) {
            aVar.a();
        }
        a(i.a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(i.a.ON_STOP);
    }

    private void a(i.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(i.a.ON_CREATE);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void a(Activity activity, i.a aVar) {
        if (activity instanceof o) {
            ((o) activity).a().a(aVar);
        } else if (activity instanceof m) {
            i lifecycle = ((m) activity).getLifecycle();
            if (lifecycle instanceof n) {
                ((n) lifecycle).a(aVar);
            }
        }
    }
}
