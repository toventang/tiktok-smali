package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f54463a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54464b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54465c;

    static {
        Covode.recordClassIndex(33806);
    }

    j(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f54463a = firebaseInstanceId;
        this.f54464b = str;
        this.f54465c = str2;
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        return this.f54463a.lambda$getInstanceId$3$FirebaseInstanceId(this.f54464b, this.f54465c, hVar);
    }
}
