package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.a;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

public class i extends j {

    /* renamed from: m  reason: collision with root package name */
    private static final String f29198m = i.class.getSimpleName();
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private int t = 100;
    private boolean u;

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final int b() {
        return -1;
    }

    static {
        Covode.recordClassIndex(17069);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final boolean a(JSONObject jSONObject, List<Boolean> list) {
        boolean z;
        b(jSONObject);
        this.f29174i = jSONObject.optString("service_name");
        this.n = jSONObject.optString("scheme_replace");
        this.o = jSONObject.optString("host_replace");
        this.p = jSONObject.optString("path_replace");
        this.r = jSONObject.optString("url_contain");
        this.q = jSONObject.optString("replace");
        if (jSONObject.optInt("drop") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.s = z;
        int optInt = jSONObject.optInt("possibility", 100);
        if (optInt >= 0 && optInt <= 100) {
            this.t = optInt;
        }
        if ((this.f29167b.isEmpty() && this.f29168c.isEmpty() && this.f29169d.isEmpty() && this.f29170e.isEmpty() && this.f29171f.isEmpty()) || (!this.s && this.n.isEmpty() && this.o.isEmpty() && this.p.isEmpty() && this.q.isEmpty())) {
            this.u = true;
        }
        list.set(0, false);
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final a.EnumC0625a a(String str, List<String> list) {
        String str2;
        if (this.u) {
            list.set(0, str);
            return a.EnumC0625a.DISPATCH_NONE;
        }
        list.set(0, str);
        Uri parse = Uri.parse(str);
        if (this.s) {
            int i2 = this.t;
            if ((i2 < 100 && (i2 <= 0 || new Random().nextInt(100) >= this.t)) || !a(parse)) {
                return a.EnumC0625a.DISPATCH_NONE;
            }
            list.set(0, "");
            return a.EnumC0625a.DISPATCH_DROP;
        } else if (!this.o.isEmpty() || !this.n.isEmpty() || !this.p.isEmpty()) {
            if (!a(parse)) {
                return a.EnumC0625a.DISPATCH_NONE;
            }
            if (parse.getScheme() != null) {
                String scheme = parse.getScheme();
                String str3 = this.n;
                if (!TextUtils.isEmpty(str3) && (scheme.equals(str3) || (((scheme.equals("http") || scheme.equals("https")) && (str3.equals("http") || str3.equals("https"))) || ((scheme.equals("ws") || scheme.equals("wss")) && (str3.equals("ws") || str3.equals("wss")))))) {
                    str = str.replaceFirst(parse.getScheme(), this.n);
                }
            }
            if (parse.getHost() != null && !TextUtils.isEmpty(this.o)) {
                str = str.replaceFirst(parse.getHost(), this.o);
            }
            if (parse.getPath() != null && !TextUtils.isEmpty(this.p)) {
                str = str.replaceFirst(parse.getPath(), this.p);
            }
            list.set(0, str);
            return a.EnumC0625a.DISPATCH_HIT;
        } else if (this.f29171f.size() != 1) {
            return a.EnumC0625a.DISPATCH_NONE;
        } else {
            if (!this.r.isEmpty() && parse.getPath() != null && !parse.getPath().contains(this.r)) {
                return a.EnumC0625a.DISPATCH_NONE;
            }
            if (!TextUtils.isEmpty(this.q)) {
                str2 = str.replaceAll((String) this.f29171f.get(0), this.q);
            } else {
                str2 = str;
            }
            if (str2.equals(str)) {
                return a.EnumC0625a.DISPATCH_NONE;
            }
            list.set(0, str2);
            return a.EnumC0625a.DISPATCH_HIT;
        }
    }
}
