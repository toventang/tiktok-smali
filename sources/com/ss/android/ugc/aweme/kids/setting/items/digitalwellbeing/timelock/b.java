package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.d;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.setting.base.session.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.TimeUnlockActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

public final class b {
    static {
        Covode.recordClassIndex(68401);
    }

    public static a<Boolean> a() {
        return com.ss.android.ugc.aweme.kids.setting.base.session.b.a().b(TimeUnlockActivity.f106933b);
    }

    private static a<Boolean> c() {
        return com.ss.android.ugc.aweme.kids.setting.base.session.b.a().a(TimeUnlockActivity.f106933b);
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

    public static void a(e eVar) {
        int e2 = eVar.getSupportFragmentManager().e();
        for (int i2 = 0; i2 < e2; i2++) {
            eVar.getSupportFragmentManager().c();
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    public static boolean a(com.ss.android.ugc.aweme.base.ui.session.b<Boolean> bVar, String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof e) && !(topActivity instanceof TimeUnlockActivity)) {
            b();
            if (!"com.ss.android.ugc.aweme.bullet.BulletContainerActivity".equals(topActivity.getClass().getCanonicalName()) && !"com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity".equals(topActivity.getClass().getCanonicalName())) {
                Intent intent = new Intent(topActivity, TimeUnlockActivity.class);
                if (bVar != null) {
                    c().a((d) topActivity, bVar);
                    intent.putExtra("from", str);
                }
                a(topActivity, intent);
                return true;
            }
        }
        return false;
    }
}
