package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final v f49526a = new v();

    static {
        Covode.recordClassIndex(30991);
    }

    private v() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }
}
