package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;

public final class k extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient u<?> f42520a;
    private final int code;

    static {
        Covode.recordClassIndex(26041);
    }

    public final int code() {
        return this.code;
    }

    public final u<?> response() {
        return this.f42520a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(u<?> uVar) {
        super("HTTP " + uVar.f42629a.f42474b);
        w.a(uVar, "response == null");
        this.code = uVar.f42629a.f42474b;
        this.f42520a = uVar;
    }
}
