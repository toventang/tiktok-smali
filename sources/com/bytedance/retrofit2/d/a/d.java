package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import java.util.Objects;

public final class d extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient u<?> f42488a;
    private final int code;

    static {
        Covode.recordClassIndex(26021);
    }

    public final int code() {
        return this.code;
    }

    public final u<?> response() {
        return this.f42488a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(u<?> uVar) {
        super("HTTP " + uVar.f42629a.f42474b);
        Objects.requireNonNull(uVar, "response == null");
        this.code = uVar.f42629a.f42474b;
        this.f42488a = uVar;
    }
}
