package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.bytedance.android.monitorV2.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Map<String, Object>> f23845a;

    static {
        Covode.recordClassIndex(14113);
    }

    public a(List<Map<String, Object>> list) {
        l.c(list, "");
        this.f23845a = list;
    }

    public a(Map<String, ? extends Object> map) {
        this(new ArrayList());
        if (map != null) {
            this.f23845a.add(map);
        }
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        Iterator<T> it = this.f23845a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : it.next().entrySet()) {
                f.a(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
    }
}
