package com.bytedance.android.a.a;

import android.view.View;
import com.bytedance.android.a.a.g.c;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, com.bytedance.android.a.a.g.a> f6595a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(3174);
    }

    @Override // com.bytedance.android.a.a.g.c
    public final void a() {
        for (com.bytedance.android.a.a.g.a aVar : this.f6595a.values()) {
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.bytedance.android.a.a.g.c
    public final void a(View view, com.bytedance.android.a.a.d.a aVar) {
        com.bytedance.android.a.a.h.a.a("track_call_start:" + aVar.toString());
        String str = aVar.f6620b;
        com.bytedance.android.a.a.g.a aVar2 = this.f6595a.get(str);
        if (aVar2 == null) {
            com.bytedance.android.a.a.h.a.a("track_tracker_invalid:no tracker available for ".concat(String.valueOf(str)));
        } else {
            aVar2.a(view, aVar);
        }
    }
}
