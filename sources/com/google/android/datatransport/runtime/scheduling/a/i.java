package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class i implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final aa f49508a;

    static {
        Covode.recordClassIndex(30978);
    }

    i(aa aaVar) {
        this.f49508a = aaVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.c
    public final Object a() {
        MethodCollector.i(4500);
        SQLiteDatabase writableDatabase = this.f49508a.getWritableDatabase();
        MethodCollector.o(4500);
        return writableDatabase;
    }
}
