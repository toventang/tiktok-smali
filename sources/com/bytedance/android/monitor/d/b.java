package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.b.a;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Map<String, Object>> f23429a;

    static {
        Covode.recordClassIndex(13947);
    }

    public b(List<Map<String, Object>> list) {
        l.c(list, "");
        this.f23429a = list;
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        Iterator<T> it = this.f23429a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : it.next().entrySet()) {
                d.a(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
    }
}
