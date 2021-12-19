package com.ss.android.common.applog.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

public final class b extends a {
    static {
        Covode.recordClassIndex(36597);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.common.applog.a.a
    public final boolean a(String str) {
        return this.f59190a.contains(str);
    }

    public b(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.common.applog.a.a
    public final boolean a(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }
}
