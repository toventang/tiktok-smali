package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.interest.UpdateInterestActivity;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.ab;
import com.ss.android.ugc.aweme.journey.ag;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.y;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class NewUserJourneyService implements INewUserJourneyService {
    static {
        Covode.recordClassIndex(38395);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean a(boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final r a() {
        return new y();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void b() {
        if (!cr.f78303b) {
            cr.f78302a.storeLong("last_open_time", System.currentTimeMillis());
            cr.f78303b = true;
        }
    }

    public static INewUserJourneyService c() {
        MethodCollector.i(5975);
        Object a2 = b.a(INewUserJourneyService.class, false);
        if (a2 != null) {
            INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) a2;
            MethodCollector.o(5975);
            return iNewUserJourneyService;
        }
        if (b.q == null) {
            synchronized (INewUserJourneyService.class) {
                try {
                    if (b.q == null) {
                        b.q = new NewUserJourneyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5975);
                    throw th;
                }
            }
        }
        NewUserJourneyService newUserJourneyService = (NewUserJourneyService) b.q;
        MethodCollector.o(5975);
        return newUserJourneyService;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> a(Intent intent) {
        l.d(intent, "");
        intent.putExtra("redirect_from_main", true);
        return ag.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final p a(int i2) {
        if (i2 == 1) {
            return new cl();
        }
        if (i2 == 2) {
            return new da();
        }
        if (i2 == 3) {
            return new ab();
        }
        throw new IllegalArgumentException("Can't getJourneyStrategyImpl !");
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean b(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || p.a.a().c() != 1 || NewUserJourneyActivity.f104787h) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Context context) {
        l.d(context, "");
        Intent intent = new Intent(context, UpdateInterestActivity.class);
        a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean a(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || p.a.a().c() != 1 || NewUserJourneyActivity.f104787h) {
            return false;
        }
        NewUserJourneyActivity.a.a(activity, false, false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Activity activity, Intent intent) {
        if (intent != null && activity != null && intent.getBooleanExtra("reorder_new_journey_front", false) && !Keva.getRepo("new_user_journey").getBoolean("disable_reorder_new_journey", false)) {
            intent.setClassName(activity, NewUserJourneyActivity.class.getName());
            intent.setFlags(131072);
            a.a(intent, activity);
            activity.startActivity(intent);
        }
        Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Activity activity, boolean z, boolean z2) {
        l.d(activity, "");
        NewUserJourneyActivity.a.a(activity, z, z2);
    }
}
