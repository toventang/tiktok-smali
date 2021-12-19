package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.q;

public final class j extends h {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMap f55845a;

    static {
        Covode.recordClassIndex(34916);
    }

    public j(ReadableMap readableMap) {
        super(12);
        this.f55845a = readableMap;
    }

    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        qVar.f55933c.a(this.f55845a.getMap("keyframes"));
    }
}
