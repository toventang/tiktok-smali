package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a;

public class TimeLockRuler {
    public static boolean sLastContentFilterState;

    static {
        Covode.recordClassIndex(68398);
    }

    public static boolean isSelfContentFilterOn() {
        return false;
    }

    public static boolean isTeenModeON() {
        return false;
    }

    public static boolean isTeenagerAbEnable() {
        return true;
    }

    public static int getLockTimeInMin() {
        return a.b();
    }

    public static boolean isContentFilterOn() {
        boolean isSelfContentFilterOn = isSelfContentFilterOn();
        sLastContentFilterState = isSelfContentFilterOn;
        return isSelfContentFilterOn;
    }

    public static boolean isRuleValid() {
        return a.c();
    }

    public static boolean isSelfTimeLockOn() {
        return a.a();
    }

    public static boolean isTimeLockOn() {
        return isSelfTimeLockOn();
    }

    public static String getContentFilterFlagText() {
        return Integer.toString(getContentFilterFlag());
    }

    public static int getTeenageModeStatus() {
        if (isContentFilterOn()) {
            return 1;
        }
        return 0;
    }

    public static int getContentFilterFlag() {
        if (!isContentFilterOn()) {
            return 0;
        }
        if (isTeenagerAbEnable()) {
            return 2;
        }
        return 1;
    }

    public static void disableStartActivityIfNeeded(Activity activity) {
        if (isTeenModeON() && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean isEnableShowTeenageTip(int i2) {
        if (!isTeenModeON()) {
            return false;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(i2).a();
        return true;
    }

    public static void doTeenagerModeAction(Context context, String str, final Runnable runnable) {
        if (isSelfContentFilterOn()) {
            b.a(new b<Boolean>() {
                /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(68399);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.session.b
                public final /* synthetic */ void a() {
                    runnable.run();
                }
            }, str);
        } else {
            runnable.run();
        }
    }
}
