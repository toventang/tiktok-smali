package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.a;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.experiment.b;
import com.ss.android.ugc.aweme.experiment.cr;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.ss.android.ugc.aweme.utils.cy;
import com.ss.android.ugc.aweme.utils.fr;
import java.util.List;

public class RegisterLifecycle implements w {
    static {
        Covode.recordClassIndex(69103);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static String a(Activity activity) {
        Fragment a2 = cy.a(activity);
        if (a2 != null) {
            return a2.toString();
        }
        return activity.toString();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69104);
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            private static void a(e eVar) {
                eVar.getLifecycle().a(new AnalysisActivityComponent(eVar));
                eVar.getLifecycle().a(new EventActivityComponent(eVar));
            }

            public final void onActivityResumed(Activity activity) {
                if (!s.a().booleanValue()) {
                    g.a.a();
                    g.a().b(activity);
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (b.f89586a && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
                    fr.a((long) (b.f89590e * 1000));
                }
                if (cr.f89715a && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
                    fr.b(5000);
                }
                if (activity instanceof a) {
                    a((e) activity);
                }
                if (activity instanceof com.bytedance.ies.foundation.activity.a) {
                    a((e) activity);
                }
                if (activity instanceof e) {
                    ((e) activity).getSupportFragmentManager().a((i.b) new com.ss.android.ugc.aweme.base.component.b(), true);
                }
                z.f105220a.b();
            }
        });
        application.registerActivityLifecycleCallbacks(new a.C2793a());
        application.registerActivityLifecycleCallbacks(new PreventServerSideCrashes.a());
        application.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.util.b());
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69105);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                ALog.i("ActivityLifeCycleLog", activity + " onDestroyed");
            }

            public final void onActivityPaused(Activity activity) {
                ALog.i("ActivityLifeCycleLog", RegisterLifecycle.a(activity) + " onPaused");
            }

            public final void onActivityResumed(Activity activity) {
                ALog.i("ActivityLifeCycleLog", RegisterLifecycle.a(activity) + " onResumed");
            }

            public final void onActivityStarted(Activity activity) {
                ALog.i("ActivityLifeCycleLog", RegisterLifecycle.a(activity) + " onStarted");
            }

            public final void onActivityStopped(Activity activity) {
                ALog.i("ActivityLifeCycleLog", RegisterLifecycle.a(activity) + " onStopped");
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ALog.i("ActivityLifeCycleLog", RegisterLifecycle.a(activity) + " onCreated");
            }
        });
    }
}
