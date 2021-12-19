package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.a;
import java.util.ArrayList;
import java.util.List;

public class e implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public List f59534a = new ArrayList(16);

    static {
        Covode.recordClassIndex(36761);
    }

    @Override // java.lang.Object
    public Object clone() {
        e eVar = (e) super.clone();
        eVar.f59534a = new ArrayList(this.f59534a);
        return eVar;
    }

    public final void a(a aVar) {
        this.f59534a.add(aVar);
    }

    public final a[] a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f59534a.size(); i2++) {
            a aVar = (a) this.f59534a.get(i2);
            if (aVar.a().equalsIgnoreCase(str)) {
                arrayList.add(aVar);
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public final a b(String str) {
        for (int i2 = 0; i2 < this.f59534a.size(); i2++) {
            a aVar = (a) this.f59534a.get(i2);
            if (aVar.a().equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }
}
