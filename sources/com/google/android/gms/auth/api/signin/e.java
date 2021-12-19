package com.google.android.gms.auth.api.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class e implements Comparator<Scope> {
    static {
        Covode.recordClassIndex(31108);
    }

    e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Scope scope, Scope scope2) {
        return scope.f49958a.compareTo(scope2.f49958a);
    }
}
