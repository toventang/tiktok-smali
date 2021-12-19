package com.ss.android.ugc.aweme.deeplink.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.utils.bn;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.d.e;
import com.ss.android.ugc.aweme.deeplink.q;
import com.ss.android.ugc.aweme.main.bd;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public String f79444a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f79445b;

    static {
        Covode.recordClassIndex(49353);
    }

    public abstract p<Boolean, String> a(d dVar, HashMap<String, Object> hashMap);

    public final void a(String str) {
        l.d(str, "");
        this.f79444a = str;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity, Uri uri) {
        l.d(activity, "");
        l.d(uri, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_url", uri.toString());
            n.a("service_monitor", "no_matched_deep_link", jSONObject);
        } catch (Exception unused) {
        }
        e.a(uri.toString(), false, "abs intent == null");
        activity.finish();
        if (!q.a.a()) {
            SmartRouter.buildRoute(activity, "//main").open();
        }
    }

    public static void a(Uri uri, d dVar, HashMap<String, Object> hashMap) {
        String str;
        l.d(uri, "");
        l.d(dVar, "");
        l.d(hashMap, "");
        Intent intent = dVar.f79466f;
        com.ss.android.ugc.aweme.deeplink.p pVar = dVar.f79463c;
        l.d(dVar, "");
        Intent intent2 = dVar.f79466f;
        Uri uri2 = dVar.f79465e;
        HashMap hashMap2 = new HashMap();
        String scheme = uri2.getScheme();
        String host = uri2.getHost();
        if (!(scheme == null || host == null)) {
            String a2 = q.a.a(intent2, "from_token");
            if (a2 == null) {
                a2 = "";
            }
            hashMap2.put("from_token", a2);
            if (TextUtils.isEmpty(uri2.getQueryParameter("enter_from"))) {
                if (TextUtils.equals("token", q.a.a(intent2, "enter_from"))) {
                    hashMap2.put("enter_from", "token");
                } else {
                    Object obj = dVar.f79462b.get("is_from_notification");
                    if (obj != null) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj).booleanValue()) {
                            str = "push";
                            hashMap2.put("enter_from", str);
                        }
                    }
                    str = "deeplink";
                    hashMap2.put("enter_from", str);
                }
            }
            if (intent2 != null) {
                if (!q.a.a() && !intent2.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                    String a3 = bd.a.a(uri2.getQueryParameter("tab_index"));
                    if ((!l.a((Object) "aweme", (Object) host) || !l.a((Object) "click_push_newvideo", (Object) uri2.getQueryParameter("gd_label")) || !TextUtils.equals(a3, "DISCOVER")) && !TextUtils.isEmpty(a3)) {
                        hashMap2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a3);
                    }
                    hashMap2.put("is_from_push", true);
                }
                if (uri2.getQueryParameter("backurl") != null) {
                    hashMap2.put("backurl", "backUrl");
                }
            }
            j a4 = j.a();
            l.b(a4, "");
            a4.f66808a = false;
            bn.a(uri2, intent2);
            String queryParameter = uri2.getQueryParameter("gd_label");
            if (queryParameter != null && h.m.p.b(queryParameter, "click_wap", false)) {
                hashMap2.put("ads_app_activity_by_wap_click", true);
            }
            hashMap.putAll(hashMap2);
        }
        Object obj2 = dVar.f79462b.get("is_from_notification");
        if (obj2 != null) {
            l.b(obj2, "");
            hashMap.put("from_notification", obj2);
        }
        Object obj3 = dVar.f79462b.get("notification_id");
        if (obj3 != null) {
            l.b(obj3, "");
            hashMap.put("from_notification_uuid", obj3);
        }
        Object obj4 = dVar.f79462b.get("rule_id");
        if (obj4 != null) {
            l.b(obj4, "");
            hashMap.put("rule_id", obj4);
        }
        if (a(intent, "share_url_user_id") != null) {
            String a5 = a(intent, "share_url_user_id");
            if (a5 == null) {
                a5 = "";
            }
            pVar.f(a5);
        } else if (a(intent, "share_sec_url_user_id") != null) {
            String a6 = a(intent, "share_sec_url_user_id");
            if (a6 == null) {
                a6 = "";
            }
            pVar.f(a6);
        }
        if (a(intent, "share_url_link_id") != null) {
            String a7 = a(intent, "share_url_link_id");
            if (a7 == null) {
                a7 = "";
            }
            pVar.g(a7);
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            l.b();
        }
        l.b(component, "");
        String className = component.getClassName();
        l.b(className, "");
        q.a.a(uri, className);
    }
}
