package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class ak extends ao {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a.f> f50045a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ae f50046b;

    static {
        Covode.recordClassIndex(31227);
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final void a() {
        Set<Scope> hashSet;
        aq aqVar = this.f50046b.f50023a.f50080m;
        ae aeVar = this.f50046b;
        if (aeVar.f50033k == null) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet<>(aeVar.f50033k.f50383b);
            Map<a<?>, d.b> map = aeVar.f50033k.f50385d;
            for (a<?> aVar : map.keySet()) {
                if (!aeVar.f50023a.f50074g.containsKey(aVar.b())) {
                    hashSet.addAll(map.get(aVar).f50402a);
                }
            }
        }
        aqVar.f50056e = hashSet;
        ArrayList<a.f> arrayList = this.f50045a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            a.f fVar = arrayList.get(i2);
            i2++;
            fVar.a(this.f50046b.f50030h, this.f50046b.f50023a.f50080m.f50056e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(ae aeVar, ArrayList<a.f> arrayList) {
        super(aeVar, (byte) 0);
        this.f50046b = aeVar;
        this.f50045a = arrayList;
    }
}
