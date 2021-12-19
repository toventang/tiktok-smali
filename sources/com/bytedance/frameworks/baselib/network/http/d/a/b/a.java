package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f29165l = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected List<String> f29166a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected List<String> f29167b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    protected List<String> f29168c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    protected List<String> f29169d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    protected List<String> f29170e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    protected List<String> f29171f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f29172g;

    /* renamed from: h  reason: collision with root package name */
    public long f29173h;

    /* renamed from: i  reason: collision with root package name */
    public String f29174i;

    /* renamed from: j  reason: collision with root package name */
    protected int f29175j;

    /* renamed from: k  reason: collision with root package name */
    public List<String> f29176k = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private long f29177m;
    private long n;

    public abstract boolean a(JSONObject jSONObject);

    public final boolean a() {
        return b();
    }

    static {
        Covode.recordClassIndex(17058);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.a$a  reason: collision with other inner class name */
    public enum EnumC0625a {
        DISPATCH_NONE,
        DISPATCH_HIT,
        DISPATCH_DROP,
        DISPATCH_DELAY;

        static {
            Covode.recordClassIndex(17059);
        }
    }

    private boolean b() {
        long j2 = this.f29177m;
        if (j2 == 0 && this.n == 0) {
            return true;
        }
        if (!(j2 == -1 || this.n == -1)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= this.f29177m || currentTimeMillis >= this.n) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean a(l lVar) {
        if (lVar.f29216c > this.f29172g) {
            return false;
        }
        if (this.f29176k.isEmpty() || TextUtils.isEmpty(lVar.f29215b) || this.f29176k.contains(lVar.f29215b)) {
            return b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void b(JSONObject jSONObject) {
        a(jSONObject, "host_group", this.f29166a);
        a(jSONObject, "equal_group", this.f29167b);
        a(jSONObject, "prefixes_group", this.f29168c);
        a(jSONObject, "contain_group", this.f29169d);
        a(jSONObject, "pattern_group", this.f29170e);
        a(jSONObject, "url_group", this.f29171f);
    }

    /* access modifiers changed from: protected */
    public final boolean a(Uri uri) {
        if (this.f29166a.isEmpty()) {
            String path = uri.getPath();
        } else {
            for (String str : this.f29166a) {
                if (i.a(uri.getHost(), str)) {
                }
            }
            return false;
        }
        String path2 = uri.getPath();
        if (path2 != null) {
            if (!this.f29167b.isEmpty()) {
                for (String str2 : this.f29167b) {
                    if (path2.equals(str2)) {
                        return true;
                    }
                }
            }
            if (!this.f29168c.isEmpty()) {
                for (String str3 : this.f29168c) {
                    if (path2.startsWith(str3)) {
                        return true;
                    }
                }
            }
            if (!this.f29169d.isEmpty()) {
                for (String str4 : this.f29169d) {
                    if (path2.contains(str4)) {
                        return true;
                    }
                }
            }
            if (!this.f29170e.isEmpty()) {
                for (String str5 : this.f29170e) {
                    if (path2.matches(str5)) {
                        return true;
                    }
                }
            }
        }
        if (!this.f29171f.isEmpty()) {
            for (String str6 : this.f29171f) {
                if (uri.toString().matches(str6)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    public static a a(String str, JSONObject jSONObject, int i2, long j2, long j3, long j4, String str2, long j5, List<String> list, int i3) {
        a aVar;
        if (str.equals("tc")) {
            aVar = new i();
        } else {
            aVar = null;
        }
        if (str.equals("dispatch")) {
            aVar = new g();
        }
        if (str.equals("delay")) {
            aVar = new c();
        } else if (aVar == null) {
            return null;
        }
        aVar.f29172g = i2;
        aVar.f29177m = j2;
        aVar.n = j3;
        aVar.f29173h = j4;
        aVar.f29176k = list;
        if (i3 < 0) {
            aVar.f29175j = Integer.MAX_VALUE;
        } else {
            aVar.f29175j = i3;
        }
        if (aVar.a(jSONObject)) {
            return aVar;
        }
        return null;
    }
}
