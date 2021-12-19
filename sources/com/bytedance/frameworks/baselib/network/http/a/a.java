package com.bytedance.frameworks.baselib.network.http.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f28926a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f28927b;

    /* renamed from: c  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28928c;

    /* renamed from: d  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28929d;

    /* renamed from: e  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28930e;

    /* renamed from: f  reason: collision with root package name */
    public CopyOnWriteArraySet<Pattern> f28931f;

    /* renamed from: g  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28932g;

    /* renamed from: h  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28933h;

    /* renamed from: i  reason: collision with root package name */
    public CopyOnWriteArraySet<Pattern> f28934i;

    /* renamed from: j  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f28935j;

    /* renamed from: k  reason: collision with root package name */
    private volatile String f28936k;

    static {
        Covode.recordClassIndex(16977);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f28936k) || !this.f28936k.equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f28936k = str;
                    b(jSONObject.optJSONArray("host_group"), this.f28928c);
                    b(jSONObject.optJSONArray("min_params_exclude"), this.f28935j);
                    JSONObject optJSONObject = jSONObject.optJSONObject("L0_path");
                    if (optJSONObject != null) {
                        b(optJSONObject.optJSONArray("equal_group"), this.f28929d);
                        b(optJSONObject.optJSONArray("prefix_group"), this.f28930e);
                        a(optJSONObject.optJSONArray("pattern_group"), this.f28931f);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("L1_path");
                    if (optJSONObject2 != null) {
                        b(optJSONObject2.optJSONArray("equal_group"), this.f28932g);
                        b(optJSONObject2.optJSONArray("prefix_group"), this.f28933h);
                        a(optJSONObject2.optJSONArray("pattern_group"), this.f28934i);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static void b(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    set.add(jSONArray.getString(i2));
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    private static void a(JSONArray jSONArray, Set<Pattern> set) {
        if (!(jSONArray == null || set == null)) {
            HashSet hashSet = new HashSet();
            for (Pattern pattern : set) {
                hashSet.add(pattern.toString());
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string) && !hashSet.contains(string)) {
                        set.add(Pattern.compile(string, 2));
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }
}
