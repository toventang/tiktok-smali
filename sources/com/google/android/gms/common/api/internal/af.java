package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.k;
import java.util.ArrayList;
import java.util.Map;

final class af extends ao {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ae f50036a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.f, ag> f50037b;

    static {
        Covode.recordClassIndex(31222);
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final void a() {
        k kVar = new k(this.f50036a.f50026d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f50037b.keySet()) {
            if (!this.f50037b.get(fVar).f50038a) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int i2 = -1;
        int i3 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                i2 = kVar.a(this.f50036a.f50025c, (a.f) obj);
                if (i2 == 0) {
                }
            }
            this.f50036a.f50023a.a(new ai(this, this.f50036a, new ConnectionResult(i2, null)));
            return;
        }
        int size2 = arrayList.size();
        while (true) {
            if (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                i2 = kVar.a(this.f50036a.f50025c, (a.f) obj2);
                if (i2 != 0) {
                    break;
                }
            } else if (i2 == 0) {
            }
        }
        this.f50036a.f50023a.a(new ai(this, this.f50036a, new ConnectionResult(i2, null)));
        return;
        if (this.f50036a.f50028f && this.f50036a.f50027e != null) {
            this.f50036a.f50027e.v();
        }
        for (a.f fVar2 : this.f50037b.keySet()) {
            ag agVar = this.f50037b.get(fVar2);
            if (kVar.a(this.f50036a.f50025c, fVar2) != 0) {
                this.f50036a.f50023a.a(new ah(this.f50036a, agVar));
            } else {
                fVar2.a(agVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(ae aeVar, Map<a.f, ag> map) {
        super(aeVar, (byte) 0);
        this.f50036a = aeVar;
        this.f50037b = map;
    }
}
