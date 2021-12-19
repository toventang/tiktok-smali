package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.sdk.webview.a.g;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends g implements i, j {

    /* renamed from: b  reason: collision with root package name */
    public a f145021b;

    /* renamed from: c  reason: collision with root package name */
    public String f145022c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f145023d;

    static {
        Covode.recordClassIndex(94824);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(67, new org.greenrobot.eventbus.g(e.class, "onEvent", com.ss.android.ugc.aweme.web.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.web.e eVar) {
        String str = eVar.f144907a;
        JSONObject jSONObject = eVar.f144908b;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a aVar = this.f145021b;
        if (aVar != null) {
            aVar.b("H5_nativeEvent", jSONObject2);
        }
        EventBus.a().b(this);
        this.f145023d = null;
    }

    public e(WeakReference<Context> weakReference, a aVar) {
        super(weakReference);
        this.f145021b = aVar;
    }

    @Override // com.ss.android.sdk.webview.a.g, com.bytedance.ies.web.a.d
    public void call(final h hVar, final JSONObject jSONObject) {
        final JSONObject jSONObject2;
        String string = hVar.f35533d.getString(StringSet.type);
        hVar.f35532c = "open";
        hVar.f35533d.put(StringSet.type, string);
        this.f145022c = hVar.f35531b;
        this.f145023d = jSONObject;
        if (!hVar.f35533d.has("args") || (jSONObject2 = hVar.f35533d.getJSONObject("args")) == null) {
            jSONObject2 = new JSONObject();
            hVar.f35533d.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else if ("live".equals(string)) {
            hVar.f35538i = false;
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.web.jsbridge.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(94825);
                }

                public final void run() {
                    int i2;
                    int i3;
                    final int i4 = 63;
                    final int i5 = 0;
                    try {
                        String string = jSONObject2.getString("user_id");
                        String optString = jSONObject2.optString("sec_user_id");
                        ae aeVar = ae.f115954a;
                        User queryUser = aeVar.queryUser(aeVar.userUrl(optString, string, null, 0), false, null);
                        if (queryUser.roomId == 0) {
                            i2 = 0;
                            i3 = 47;
                        } else {
                            i2 = 1;
                            i3 = 31;
                        }
                        jSONObject2.put("room_id", String.valueOf(queryUser.roomId));
                        i5 = i2;
                        i4 = i3;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {
                        /* class com.ss.android.ugc.aweme.web.jsbridge.e.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(94826);
                        }

                        public final void run() {
                            if (i4 != 47) {
                                e.this.a(hVar.f35533d);
                            }
                            try {
                                jSONObject.put("code", i5);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            e.this.f145021b.a(e.this.f145022c, jSONObject2);
                        }
                    });
                }
            });
            return;
        } else if ("login".equals(string)) {
            String optString = jSONObject2.optString("enter_from");
            if (!b.g().isLogin() && this.f60177a != null) {
                Activity a2 = a((Context) this.f60177a.get());
                EventBus.a(EventBus.a(), this);
                try {
                    c.a(a2, optString, "");
                    return;
                } catch (Throwable unused) {
                    EventBus.a().b(this);
                    return;
                }
            } else {
                return;
            }
        } else if ("webview".equals(string)) {
            try {
                if (TextUtils.equals("1", Uri.parse(hVar.f35533d.getJSONObject("args").getString("url")).getQueryParameter("live_half_charge_dialog"))) {
                    a aVar = this.f145021b;
                    if (aVar != null) {
                        aVar.a(this.f145022c, jSONObject);
                        return;
                    }
                    return;
                }
            } catch (Exception unused2) {
            }
        }
        EventBus.a(EventBus.a(), this);
        jSONObject2.put("group", "0");
        a(hVar.f35533d);
        jSONObject.put("code", 1);
    }
}
