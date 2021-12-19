package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.d.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f54329a;

    static {
        Covode.recordClassIndex(33729);
    }

    k(Set set) {
        this.f54329a = set;
    }

    @Override // com.google.firebase.d.a
    public final Object a() {
        Set<s> set = this.f54329a;
        HashSet hashSet = new HashSet();
        for (s sVar : set) {
            hashSet.add(sVar.a());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
