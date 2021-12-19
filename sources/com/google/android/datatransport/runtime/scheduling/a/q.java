package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.a;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class q implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final q f49519a = new q();

    static {
        Covode.recordClassIndex(30986);
    }

    private q() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        throw new a("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
