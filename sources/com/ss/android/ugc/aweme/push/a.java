package com.ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.utils.ActivityStack;

public final class a {
    static {
        Covode.recordClassIndex(77205);
    }

    private static boolean b(Activity activity) {
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack.length != 1 || !activityStack[0].equals(activity)) {
            return false;
        }
        return true;
    }

    public static void a(Activity activity) {
        Intent intent;
        String concat;
        if (activity != null && (intent = activity.getIntent()) != null) {
            String a2 = a(intent, "backurl");
            if (intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY") == null) {
                if (!TextUtils.isEmpty(a2) && !TextUtils.equals("__BACKURL__", a2) && !a2.startsWith("http")) {
                    try {
                        Uri parse = Uri.parse(a2);
                        Intent intent2 = new Intent();
                        intent2.setData(parse);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.addCategory("android.intent.category.BROWSABLE");
                        intent2.setComponent(null);
                        intent2.setSelector(null);
                        activity.startActivityIfNeeded(intent2, -1);
                        activity.moveTaskToBack(true);
                        return;
                    } catch (Exception unused) {
                    }
                }
                String a3 = a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                int intExtra = intent.getIntExtra("extra_story_is_friend", -1);
                boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
                if (!intent.getBooleanExtra("is_have_intents", false)) {
                    if ((!AwemeApplicationServiceImpl.c().b() || booleanExtra) && b(activity)) {
                        if (TextUtils.isEmpty(a3)) {
                            concat = "aweme://main";
                        } else {
                            concat = "aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=".concat(String.valueOf(a3));
                        }
                        if (intExtra != -1) {
                            t.a().f71171c.b("extra_story_is_friend");
                            concat = concat + "&extra_story_is_friend=" + intExtra;
                        }
                        t.a(t.a(), null, concat);
                    }
                }
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
