package com.ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.a;
import com.ss.android.ugc.awemepushlib.e.b;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter;
import com.ss.android.ugc.awemepushlib.task.CancelNotificationTask;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PushService implements IPushApi {
    static {
        Covode.recordClassIndex(95081);
    }

    public static int com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return MessageShowHandler.f145486d;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public w getCancelNotiTask() {
        return new CancelNotificationTask();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
        g.a(d.a());
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
        f.a(new a() {
            /* class com.ss.android.ugc.awemepushlib.interaction.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95106);
            }

            @Override // com.ss.android.ugc.awemepushapi.a
            public final String getDefaultUninstallQuestionUrl() {
                return "";
            }
        });
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i2) {
        aa.f145425a = i2;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return e.f145439a.contains(str);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public int isPushVideoPreload(long j2) {
        return b.a(j2);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
        AwemeRedBadgerManager.f145477b.b(context);
    }

    private boolean getNotifyEnabled(Context context) {
        return com.ss.android.ugc.awemepushlib.manager.a.a().d(context);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return g.a(str, com.ss.android.ugc.awemepushlib.f.d.a());
    }

    public static IPushApi createIPushApibyMonsterPlugin(boolean z) {
        Object a2 = com.ss.android.ugc.b.a(IPushApi.class, z);
        if (a2 != null) {
            return (IPushApi) a2;
        }
        return new PushService();
    }

    private synchronized boolean getConfirmPush(Context context) {
        boolean c2;
        MethodCollector.i(8826);
        c2 = com.ss.android.ugc.awemepushlib.manager.a.a().c(context);
        MethodCollector.o(8826);
        return c2;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
        NotificationManager notificationManager = (NotificationManager) com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        } else {
            com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_LogLancet_d("xzqtest", "notification manager is null!");
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        String b2 = f.b(context);
        if (b2 == null) {
            return false;
        }
        if (b2.endsWith(":push") || b2.endsWith(":pushservice")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initPushAccountService(boolean z) {
        Context a2 = d.a();
        if (z) {
            i.b(new o(a2), i.f4824a);
            return;
        }
        AccountManager accountManager = AccountManager.get(a2);
        String packageName = a2.getPackageName();
        String string = a2.getString(a2.getApplicationInfo().labelRes);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(packageName)) {
            try {
                accountManager.removeAccount(new Account(string, packageName), null, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private void setNotifyEnabled(Context context, boolean z) {
        com.ss.android.ugc.awemepushlib.manager.a.a().b(context, z);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, a aVar) {
        pushInit(context, aVar, false);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, a aVar) {
        pushInit(context, aVar, true);
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        MethodCollector.i(8828);
        com.ss.android.ugc.awemepushlib.manager.a.a().a(context, z);
        MethodCollector.o(8828);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        String realChannelId = getRealChannelId(str);
        NotificationManager notificationManager = (NotificationManager) com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "notification");
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null || notificationManager.getNotificationChannel(realChannelId).getImportance() != 0) {
            return true;
        }
        return false;
    }

    public static Object com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(8840);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8840);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i2) {
        NotificationManager notificationManager = (NotificationManager) com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "notification");
        if (notificationManager != null) {
            notificationManager.cancel(str, i2);
        } else {
            com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_LogLancet_d("clearNotificationId", "notification manager is null!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        if (r3 != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pushInit(android.content.Context r8, com.ss.android.ugc.awemepushapi.a r9, java.lang.Boolean r10) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.interaction.PushService.pushInit(android.content.Context, com.ss.android.ugc.awemepushapi.a, java.lang.Boolean):void");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        String str;
        long j2;
        if (!z) {
            i.a(uri.toString(), false);
            return;
        }
        try {
            int a2 = com.ss.android.push.a.a(intent, "msg_from", -1);
            long a3 = com.ss.android.push.a.a(intent, "msg_id");
            HashMap hashMap = (HashMap) intent.getSerializableExtra("log_data_extra_to_adsapp");
            if (hashMap == null) {
                hashMap = new HashMap(8);
                com.ss.android.ugc.awemepushlib.c.a.a(uri.toString(), hashMap);
            }
            String com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "post_back");
            String str2 = (String) hashMap.get("rule_id");
            if (TextUtils.isEmpty(com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "rule_id"))) {
                intent.putExtra("rule_id", str2);
            }
            String parameterString = getParameterString(uri, "push_params");
            if (!TextUtils.isEmpty(parameterString)) {
                hashMap.put("feed_batch_params", parameterString);
            }
            String parameterString2 = getParameterString(uri, "gids");
            if (!TextUtils.isEmpty(parameterString2) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString2.contains(",")) {
                    parameterString2 = parameterString2.substring(0, parameterString2.indexOf(","));
                }
                hashMap.put("group_id", parameterString2);
            }
            if (AccountService.a().e().isLogin()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_login", str);
            com.ss.android.push.a.a(intent, "message_from", -1);
            String com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_extra");
            JSONObject jSONObject = new JSONObject(hashMap);
            if (TextUtils.isEmpty(str2)) {
                j2 = a3;
            } else {
                j2 = Long.valueOf(str2).longValue();
            }
            if (a2 == 1) {
                i.a(context, "news_notify_view", a3, -1, new JSONObject[0]);
                trackClickPush(context, j2, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "action_id"), true, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            } else if (a2 == 2) {
                i.a(context, "news_notify_view", a3, -1, new JSONObject[0]);
                trackClickPush(context, j2, null, false, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, jSONObject, com_ss_android_ugc_awemepushlib_interaction_PushService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            }
        } catch (Exception e2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", e2.toString());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            com.bytedance.apm.b.a("push_click_error_event", jSONObject2, (JSONObject) null, (JSONObject) null);
        }
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i2, String str, int i3, String str2) {
        try {
            jSONObject.optInt("preload_article", 0);
            String optString = jSONObject.optString("open_url");
            Intent intent = null;
            if (m.a(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("app_data");
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("t", 0);
                    int optInt2 = optJSONObject.optInt("p", 0);
                    long optLong = optJSONObject.optLong("uid", 0);
                    if (optInt == 1) {
                        if (optInt2 == 1) {
                            throw new NullPointerException("addFlags");
                        } else if (optInt2 == 3) {
                            throw new NullPointerException("addFlags");
                        } else if (optInt2 == 4) {
                            if (optLong > 0) {
                                e.a(null);
                            }
                        }
                    }
                }
            } else {
                Uri parse = Uri.parse(optString);
                String scheme = parse.getScheme();
                if ("sslocal".equals(scheme)) {
                    parse = Uri.parse(com.ss.android.ugc.aweme.deeplink.m.f79501a.b(optString));
                }
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (com.ss.android.ugc.aweme.deeplink.m.f79501a.a(scheme)) {
                    intent.putExtra("is_from_self", true);
                }
                intent.setData(parse);
            }
            String packageName = activity.getPackageName();
            if (intent != null || (intent = f.a(activity, packageName)) != null) {
                intent.addFlags(268435456);
                e.a(intent);
                intent.putExtra("msg_from", 2);
                intent.putExtra("msg_id", i2);
                intent.putExtra("message_from", str);
                if (!m.a(str2)) {
                    intent.putExtra("message_extra", str2);
                }
                if (!e.a(i3, activity, intent) && !activity.isFinishing()) {
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                    activity.startActivity(intent);
                }
            }
        } catch (Exception unused) {
            com.bytedance.ies.f.a.a();
        }
    }

    private void trackClickPush(Context context, final long j2, final String str, final boolean z, final String str2, final JSONObject jSONObject, String str3) {
        Exception e2;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception e3) {
                e2 = e3;
                e2.printStackTrace();
                com.ss.android.ugc.aweme.framework.d.a.f96678a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
                    /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(95082);
                    }

                    @Override // com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter
                    public final void onActivityResumed(Activity activity) {
                        com.ss.android.ugc.aweme.framework.d.a.f96678a.unregisterActivityLifecycleCallbacks(this);
                        com.ss.android.b.a.a.a.b(new Runnable() {
                            /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(95083);
                            }

                            public final void run() {
                                long j2 = j2;
                                boolean z = z;
                                String str = str;
                                String str2 = str2;
                                JSONObject jSONObject = jSONObject;
                                if (jSONObject == null) {
                                    try {
                                        jSONObject = new JSONObject();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        return;
                                    }
                                }
                                if (z) {
                                    jSONObject.put("click_position", "notify");
                                    if (str != null) {
                                        jSONObject.put("position", str);
                                    } else {
                                        jSONObject.put("position", "push_body");
                                    }
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("post_back", str2);
                                }
                                jSONObject.put("rule_id", String.valueOf(j2));
                                r.a("push_click_v2", jSONObject);
                            }
                        });
                    }
                });
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
            if (str != null) {
                jSONObject2.put("position", str);
            } else {
                jSONObject2.put("position", "push_body");
            }
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject2.put("post_back", str2);
            } catch (Exception e4) {
                e2 = e4;
                e2.printStackTrace();
                com.ss.android.ugc.aweme.framework.d.a.f96678a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
                    /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(95082);
                    }

                    @Override // com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter
                    public final void onActivityResumed(Activity activity) {
                        com.ss.android.ugc.aweme.framework.d.a.f96678a.unregisterActivityLifecycleCallbacks(this);
                        com.ss.android.b.a.a.a.b(new Runnable() {
                            /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(95083);
                            }

                            public final void run() {
                                long j2 = j2;
                                boolean z = z;
                                String str = str;
                                String str2 = str2;
                                JSONObject jSONObject = jSONObject;
                                if (jSONObject == null) {
                                    try {
                                        jSONObject = new JSONObject();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        return;
                                    }
                                }
                                if (z) {
                                    jSONObject.put("click_position", "notify");
                                    if (str != null) {
                                        jSONObject.put("position", str);
                                    } else {
                                        jSONObject.put("position", "push_body");
                                    }
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("post_back", str2);
                                }
                                jSONObject.put("rule_id", String.valueOf(j2));
                                r.a("push_click_v2", jSONObject);
                            }
                        });
                    }
                });
            }
        }
        jSONObject2.put("rule_id", String.valueOf(j2));
        r.a("push_click", jSONObject2);
        i.a(false, str3);
        com.ss.android.ugc.aweme.framework.d.a.f96678a.registerActivityLifecycleCallbacks(new LifecycleCallbackAdapter() {
            /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95082);
            }

            @Override // com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter
            public final void onActivityResumed(Activity activity) {
                com.ss.android.ugc.aweme.framework.d.a.f96678a.unregisterActivityLifecycleCallbacks(this);
                com.ss.android.b.a.a.a.b(new Runnable() {
                    /* class com.ss.android.ugc.awemepushlib.interaction.PushService.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(95083);
                    }

                    public final void run() {
                        long j2 = j2;
                        boolean z = z;
                        String str = str;
                        String str2 = str2;
                        JSONObject jSONObject = jSONObject;
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        if (z) {
                            jSONObject.put("click_position", "notify");
                            if (str != null) {
                                jSONObject.put("position", str);
                            } else {
                                jSONObject.put("position", "push_body");
                            }
                        } else {
                            jSONObject.put("click_position", "alert");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("post_back", str2);
                        }
                        jSONObject.put("rule_id", String.valueOf(j2));
                        r.a("push_click_v2", jSONObject);
                    }
                });
            }
        });
    }
}
