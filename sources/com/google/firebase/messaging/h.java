package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.e;

final /* synthetic */ class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f54613a;

    static {
        Covode.recordClassIndex(33885);
    }

    h(FirebaseMessaging firebaseMessaging) {
        this.f54613a = firebaseMessaging;
    }

    @Override // com.google.android.gms.c.e
    public final void a(Object obj) {
        v vVar = (v) obj;
        if (this.f54613a.f54593a.isFcmAutoInitEnabled() && vVar.f54641a.a() != null && !vVar.b()) {
            vVar.a(0);
        }
    }
}
