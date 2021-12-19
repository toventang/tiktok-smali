package com.bytedance.sdk.a.n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f43463a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, com.ss.android.account.b.a> f43464b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public String f43465c;

    /* renamed from: d  reason: collision with root package name */
    public int f43466d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43467e;

    /* renamed from: f  reason: collision with root package name */
    public String f43468f;

    /* renamed from: g  reason: collision with root package name */
    public String f43469g;

    /* renamed from: h  reason: collision with root package name */
    public String f43470h;

    /* renamed from: i  reason: collision with root package name */
    public String f43471i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f43472j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f43473k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f43474l;

    /* renamed from: m  reason: collision with root package name */
    public JSONObject f43475m;
    public JSONObject n;
    public JSONObject o;

    static {
        Covode.recordClassIndex(26617);
    }

    public a() {
    }

    public void a() {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject jSONObject = this.o;
        long j2 = 0;
        this.f43463a = jSONObject.optLong("user_id", 0);
        this.f43465c = jSONObject.optString("sec_user_id", "");
        this.f43468f = jSONObject.optString("session_key", "");
        this.f43465c = jSONObject.optString("sec_user_id", "");
        if (jSONObject.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f43467e = z;
        this.f43469g = jSONObject.optString("mobile", "");
        if (jSONObject.optInt("has_password") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f43472j = z2;
        this.f43471i = jSONObject.optString("sec_user_id", "");
        this.f43473k = jSONObject.optBoolean("is_visitor_account", false);
        this.f43470h = jSONObject.optString("email", "");
        com.ss.android.account.b.a a2 = com.ss.android.account.b.a.a("mobile");
        com.ss.android.account.b.a a3 = com.ss.android.account.b.a.a("email");
        a3.f58181d = this.f43470h;
        if (!TextUtils.isEmpty(this.f43470h)) {
            this.f43464b.put(a3.f58179b, a3);
        }
        a2.f58181d = this.f43469g;
        if (!TextUtils.isEmpty(this.f43469g)) {
            this.f43464b.put(a2.f58179b, a2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("platform");
                if (!(string == null || string.length() == 0)) {
                    com.ss.android.account.b.a a4 = com.ss.android.account.b.a.a(string);
                    if (jSONObject2.has("screen_name")) {
                        a4.f58181d = jSONObject2.optString("screen_name");
                    } else if (jSONObject2.has("platform_screen_name")) {
                        a4.f58181d = jSONObject2.optString("platform_screen_name");
                    }
                    a4.f58182e = jSONObject2.optString("profile_image_url");
                    a4.f58183f = jSONObject2.optString("platform_uid");
                    a4.f58184g = jSONObject2.optString("sec_platform_uid");
                    a4.f58186i = jSONObject2.optLong("modify_time");
                    a4.f58185h = jSONObject2.optString("create_time");
                    a4.f58189l = jSONObject.optLong("user_id", j2);
                    long optLong = jSONObject2.optLong("expires_in");
                    if (optLong > j2) {
                        a4.f58187j = currentTimeMillis + (1000 * optLong);
                    }
                    a4.f58188k = optLong;
                    com.ss.android.account.b.a aVar = this.f43464b.get(string);
                    if (aVar == null || aVar.f58186i <= 0 || aVar.f58186i <= a4.f58186i) {
                        this.f43464b.put(string, a4);
                    }
                }
                i2++;
                j2 = 0;
            }
        }
        this.f43466d = jSONObject.optInt("country_code", -1);
        if (jSONObject.optInt("is_kids_mode") == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f43474l = z3;
    }

    public a(JSONObject jSONObject) {
        this.n = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        this.f43475m = optJSONObject;
        this.o = optJSONObject;
    }

    public a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.n = jSONObject;
        this.f43475m = jSONObject.optJSONObject("data");
        this.o = jSONObject2;
    }
}
