package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.a;
import com.google.android.datatransport.runtime.scheduling.a.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final t f49522a = new t();

    static {
        Covode.recordClassIndex(30989);
    }

    private t() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        throw new a("Timed out while trying to open db.", (Throwable) obj);
    }
}
