package com.d.a.a.a.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.l;
import com.d.a.a.a.d.a;
import com.d.a.a.a.e.b;
import com.d.a.a.a.e.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f46395a;

    static {
        Covode.recordClassIndex(28323);
    }

    public c(a aVar) {
        this.f46395a = aVar;
    }

    @Override // com.d.a.a.a.d.a
    public final JSONObject a(View view) {
        return b.a(0, 0, 0, 0);
    }

    @Override // com.d.a.a.a.d.a
    public final void a(View view, JSONObject jSONObject, a.AbstractC1153a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        com.d.a.a.a.c.a aVar2 = com.d.a.a.a.c.a.f46367a;
        if (aVar2 != null) {
            Collection<l> unmodifiableCollection = Collections.unmodifiableCollection(aVar2.f46369c);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (l lVar : unmodifiableCollection) {
                View c2 = lVar.c();
                if (c2 != null && e.b(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = e.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && e.a((View) arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.a((View) it.next(), this.f46395a, jSONObject);
        }
    }
}
