package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Map<String, Object>> f23846a;

    static {
        Covode.recordClassIndex(14114);
    }

    public b(List<Map<String, Object>> list) {
        l.c(list, "");
        this.f23846a = list;
    }

    public b(Map<String, ? extends Object> map) {
        this(new ArrayList());
        if (map != null) {
            this.f23846a.add(map);
        }
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        Iterator<T> it = this.f23846a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : it.next().entrySet()) {
                f.a(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
    }
}
