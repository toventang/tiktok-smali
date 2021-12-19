package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ck.j;
import com.ss.android.ugc.aweme.ck.v;
import h.f.b.l;
import h.m.p;

public final class a implements IInterceptor, j {
    static {
        Covode.recordClassIndex(48341);
    }

    private static String b(String str) {
        String b2 = v.b(str, StringSet.type);
        l.b(b2, "");
        return b2;
    }

    private static String d(String str) {
        String b2 = v.b(str, "user_id");
        l.b(b2, "");
        return b2;
    }

    private static String e(String str) {
        String b2 = v.b(str, "sec_user_id");
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        l.d(str, "");
        return a(null, str);
    }

    private static int a(String str) {
        String b2 = v.b(str, "search_restriction_option");
        try {
            l.b(b2, "");
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static int f(String str) {
        try {
            String b2 = v.b(str, "chat_set");
            l.b(b2, "");
            return Integer.parseInt(b2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        l.d(routeIntent, "");
        String originUrl = routeIntent.getOriginUrl();
        l.b(originUrl, "");
        return p.a((CharSequence) originUrl, (CharSequence) "privacy/setting/modify", false);
    }

    private static int h(String str) {
        String b2 = v.b(str, "cur_value");
        if (b2 == null || !(!TextUtils.isEmpty(str))) {
            b2 = v.b(str, "chat_privacy");
        }
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            l.b(b2, "");
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static String g(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1875914648:
                if (str.equals("dm_permission_set")) {
                    return "aweme://chatcontrol/setting";
                }
                return null;
            case -1354594911:
                if (str.equals("chat_privacy")) {
                    return "aweme://chatcontrol/setting/familypairing";
                }
                return null;
            case 950398559:
                if (str.equals(UGCMonitor.EVENT_COMMENT)) {
                    return "aweme://commentcontrol/setting/familypairing";
                }
                return null;
            case 1339783250:
                if (str.equals("favorite_permission")) {
                    return "aweme://mylikelistcontrol/setting/familypairing";
                }
                return null;
            case 1437733627:
                if (str.equals("chat_set")) {
                    return "aweme://chatcontrol/setting/familypairing";
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean a(Activity activity, String str) {
        l.d(str, "");
        return b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        l.d(context, "");
        l.d(routeIntent, "");
        if (!(context instanceof Activity)) {
            context = null;
        }
        String originUrl = routeIntent.getOriginUrl();
        l.b(originUrl, "");
        a((Activity) context, originUrl);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r4.equals("chat_set") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r4.equals("chat_privacy") != false) goto L_0x005f;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.app.Activity r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.familypairing.a.b(android.app.Activity, java.lang.String):boolean");
    }
}
