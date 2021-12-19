package com.ss.android.deviceregister.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.deviceregister.a.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static volatile a f59457f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f59458a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59459b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<String, String> f59460c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<Context> f59461d;

    /* renamed from: e  reason: collision with root package name */
    private String f59462e;

    static {
        Covode.recordClassIndex(36710);
    }

    public final boolean a() {
        if (TextUtils.isEmpty(this.f59462e)) {
            this.f59462e = d.f59405a;
        }
        return "local_test".equals(this.f59462e);
    }

    public static a a(Context context) {
        MethodCollector.i(3880);
        if (f59457f == null) {
            synchronized (a.class) {
                try {
                    if (f59457f == null) {
                        f59457f = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3880);
                    throw th;
                }
            }
        }
        a aVar = f59457f;
        MethodCollector.o(3880);
        return aVar;
    }

    private a(Context context) {
        this.f59461d = new WeakReference<>(context);
        if (a()) {
            String str = "";
            String string = com.ss.android.ugc.aweme.bf.d.a(this.f59461d.get(), "debug_new_user_mode_sp", 0).getString("new_user_mode_json_str", str);
            if (TextUtils.isEmpty(string)) {
                String b2 = b.b(this.f59461d.get());
                if (b2 != null && b2.startsWith("newUserModeUtil:")) {
                    str = b2.substring(16);
                }
                string = str;
            }
            try {
                a(string);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.f59461d.get(), "debug_new_user_mode_sp", 0).edit();
            edit.putString("new_user_mode_json_str", string);
            edit.apply();
        }
    }

    private void a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f59458a = jSONObject.optBoolean("is_new_user_mode", false);
        this.f59459b = jSONObject.optBoolean("auto_mode", false);
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("debug_custom_param", ""));
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f59460c.put(next, jSONObject2.optString(next));
        }
    }
}
