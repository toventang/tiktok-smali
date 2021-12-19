package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.a;
import com.bytedance.frameworks.baselib.network.http.d.a.b.f;
import java.util.List;
import org.json.JSONObject;

public class g extends j {

    /* renamed from: m  reason: collision with root package name */
    private static final String f29195m = g.class.getSimpleName();
    private f n;

    static {
        Covode.recordClassIndex(17067);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final int b() {
        return this.n.f29192a.ordinal();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final a.EnumC0625a a(String str, List<String> list) {
        a.EnumC0625a aVar = a.EnumC0625a.DISPATCH_NONE;
        Uri parse = Uri.parse(str);
        if (!(parse.getHost() == null || !a(parse) || this.n == null)) {
            aVar = a.EnumC0625a.DISPATCH_HIT;
            String a2 = this.n.a(parse);
            if (!str.equals(a2)) {
                list.set(0, a2);
            } else {
                list.set(0, str);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.j
    public final boolean a(JSONObject jSONObject, List<Boolean> list) {
        f hVar;
        b(jSONObject);
        String optString = jSONObject.optString("service_name");
        if (!TextUtils.isEmpty(optString)) {
            this.f29174i = optString;
        }
        int optInt = jSONObject.optInt("dispatch_strategy", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("strategy_info");
        if (optInt < 0 || optInt > 5) {
            this.n = null;
            return false;
        }
        if (f.AnonymousClass1.f29193a[f.a.values()[optInt].ordinal()] != 1) {
            hVar = new b();
        } else {
            hVar = new h(optJSONObject);
        }
        this.n = hVar;
        list.set(0, false);
        return true;
    }
}
