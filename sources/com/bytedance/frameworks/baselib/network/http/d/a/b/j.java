package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class j extends a {

    /* renamed from: m  reason: collision with root package name */
    private static final String f29199m = j.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    public boolean f29200l;

    public abstract a.EnumC0625a a(String str, List<String> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(JSONObject jSONObject, List<Boolean> list);

    public abstract int b();

    static {
        Covode.recordClassIndex(17070);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.a
    public final boolean a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, false);
        boolean a2 = a(jSONObject, arrayList);
        this.f29200l = arrayList.get(0).booleanValue();
        return a2;
    }

    public final a.EnumC0625a a(l lVar, String str, List<String> list, List<d> list2) {
        if (!a(lVar) || TextUtils.isEmpty(str)) {
            list.set(0, str);
            return a.EnumC0625a.DISPATCH_NONE;
        }
        a.EnumC0625a a2 = a(str, list);
        d dVar = new d();
        if (a2 != a.EnumC0625a.DISPATCH_NONE) {
            dVar.f29184d = true;
            dVar.f29182b = this.f29173h;
            dVar.f29183c = this.f29172g;
            dVar.f29185e = b();
            dVar.f29181a = this.f29174i;
            if (a2 == a.EnumC0625a.DISPATCH_HIT) {
                dVar.f29187g = list.get(0);
                dVar.f29186f = this.f29200l;
            }
            lVar.f29216c = this.f29175j;
        }
        list2.add(dVar);
        return a2;
    }
}
