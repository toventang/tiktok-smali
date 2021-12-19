package com.ss.android.common.applog.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

public class d extends a {
    static {
        Covode.recordClassIndex(36599);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.common.applog.a.a
    public final boolean a(String str) {
        if (!this.f59190a.contains(str)) {
            return true;
        }
        return false;
    }

    protected d(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.common.applog.a.a
    public final boolean a(HashSet<String> hashSet, String str) {
        if (!hashSet.contains(str)) {
            return true;
        }
        return false;
    }
}
