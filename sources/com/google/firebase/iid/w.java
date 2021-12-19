package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    private final String f54489a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54490b;

    static {
        Covode.recordClassIndex(33820);
    }

    @Override // com.google.firebase.iid.v
    public final String a() {
        return this.f54489a;
    }

    @Override // com.google.firebase.iid.v
    public final String b() {
        return this.f54490b;
    }

    w(String str, String str2) {
        this.f54489a = str;
        this.f54490b = str2;
    }
}
