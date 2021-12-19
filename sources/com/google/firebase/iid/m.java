package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.firebase.iid.ah;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements ah.a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f54468a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54469b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54470c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54471d;

    static {
        Covode.recordClassIndex(33809);
    }

    m(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f54468a = firebaseInstanceId;
        this.f54469b = str;
        this.f54470c = str2;
        this.f54471d = str3;
    }

    @Override // com.google.firebase.iid.ah.a
    public final h a() {
        return this.f54468a.lambda$getInstanceId$2$FirebaseInstanceId(this.f54469b, this.f54470c, this.f54471d);
    }
}
