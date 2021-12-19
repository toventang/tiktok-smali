package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class s implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final s f49521a = new s();

    static {
        Covode.recordClassIndex(30988);
    }

    private s() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
