package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.g;
import com.google.android.gms.c.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements g {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f54472a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54473b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54474c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54475d;

    static {
        Covode.recordClassIndex(33810);
    }

    n(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f54472a = firebaseInstanceId;
        this.f54473b = str;
        this.f54474c = str2;
        this.f54475d = str3;
    }

    @Override // com.google.android.gms.c.g
    public final h a(Object obj) {
        return this.f54472a.lambda$getInstanceId$1$FirebaseInstanceId(this.f54473b, this.f54474c, this.f54475d, (String) obj);
    }
}
