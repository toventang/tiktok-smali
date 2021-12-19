package com.google.android.gms.auth.api.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f49843a = new c();

    static {
        Covode.recordClassIndex(31106);
    }

    private c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).f49958a.compareTo(((Scope) obj2).f49958a);
    }
}
