package com.bytedance.frameworks.baselib.network.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f28895c = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f28896a;

    /* renamed from: b  reason: collision with root package name */
    public int f28897b;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f28898d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f28899e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private Set<String> f28900f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private Set<Pattern> f28901g = new HashSet();

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract boolean a(Request request, Map<String, List<String>> map);

    static {
        Covode.recordClassIndex(16970);
    }

    private static boolean a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public b(int i2) {
        this.f28896a = i2;
        this.f28897b = i2;
    }

    /* access modifiers changed from: protected */
    public final void b(JSONObject jSONObject) {
        a(jSONObject.optJSONArray("host_group"), this.f28898d);
        a(jSONObject.optJSONArray("equal_group"), this.f28899e);
        a(jSONObject.optJSONArray("prefix_group"), this.f28900f);
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        Set<Pattern> set = this.f28901g;
        if (!(optJSONArray == null || set == null)) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    String string = optJSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            set.add(Pattern.compile(string, 2));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (JSONException unused2) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(Request request) {
        if (a(this.f28898d)) {
            String path = request.getPath();
        } else {
            for (String str : this.f28898d) {
                if (i.a(request.getHost(), str)) {
                }
            }
            return false;
        }
        String path2 = request.getPath();
        if (TextUtils.isEmpty(path2)) {
            return false;
        }
        int length = path2.length();
        if (length > 1) {
            int i2 = length - 1;
            if (path2.substring(i2).equals("/")) {
                path2 = path2.substring(0, i2);
            }
        }
        if (!a(this.f28899e) && this.f28899e.contains(path2)) {
            return true;
        }
        if (!a(this.f28900f)) {
            for (String str2 : this.f28900f) {
                if (path2.startsWith(str2)) {
                    return true;
                }
            }
        }
        if (!a(this.f28901g)) {
            for (Pattern pattern : this.f28901g) {
                if (pattern != null && pattern.matcher(path2).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        set.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(Request request, Map<String, List<String>> map, List<a> list) {
        a aVar = new a();
        aVar.f28893c = SystemClock.uptimeMillis();
        boolean z = false;
        if (request.getQueryFilterPriority() <= this.f28896a && (z = a(request, map))) {
            request.setQueryFilterPriority(this.f28897b);
        }
        aVar.f28891a = z;
        aVar.f28892b = this.f28896a;
        aVar.f28894d = SystemClock.uptimeMillis();
        list.add(aVar);
        return z;
    }

    protected static b a(String str, int i2, int i3, JSONObject jSONObject) {
        if (!str.equals("rm")) {
            return null;
        }
        d dVar = new d(i2);
        dVar.a(jSONObject);
        dVar.f28897b = i3;
        return dVar;
    }
}
