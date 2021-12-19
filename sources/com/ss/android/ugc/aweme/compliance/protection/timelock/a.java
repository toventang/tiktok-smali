package com.ss.android.ugc.aweme.compliance.protection.timelock;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.d;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.p;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f78011a;

    static {
        Covode.recordClassIndex(48367);
    }

    public static com.ss.android.ugc.aweme.base.ui.session.a<Boolean> a() {
        return c.a().b(TimeUnlockActivity.f78014b);
    }

    private static com.ss.android.ugc.aweme.base.ui.session.a<Boolean> c() {
        return c.a().a(TimeUnlockActivity.f78014b);
    }

    private static void b() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (Activity activity : activityStack) {
            if (activity instanceof TimeUnlockActivity) {
                activity.finish();
                return;
            }
        }
    }

    private static void a(e eVar) {
        int e2 = eVar.getSupportFragmentManager().e();
        for (int i2 = 0; i2 < e2; i2++) {
            eVar.getSupportFragmentManager().c();
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    public static void b(e eVar, int i2) {
        a(eVar);
        ((com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a) eVar).a(p.a(i2));
    }

    public static void a(e eVar, int i2) {
        a(eVar);
        ((com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a) eVar).a(p.c(i2));
    }

    public static boolean a(b<Boolean> bVar, String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof e) && !(topActivity instanceof TimeUnlockActivity)) {
            b();
            if (topActivity != null && (topActivity instanceof com.bytedance.ies.foundation.activity.a) && !(topActivity instanceof CrossPlatformActivity)) {
                Intent intent = new Intent(topActivity, TimeUnlockActivity.class);
                if (bVar != null) {
                    c().a((d) topActivity, bVar);
                    intent.putExtra("from", str);
                } else {
                    r.a("time_lock_block_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "time_lock_block").f66730a);
                }
                a(topActivity, intent);
                return true;
            }
        }
        return false;
    }
}
