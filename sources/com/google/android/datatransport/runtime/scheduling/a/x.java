package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class x implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final x f49528a = new x();

    static {
        Covode.recordClassIndex(30993);
    }

    private x() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }
}
