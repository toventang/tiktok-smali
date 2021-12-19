package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class p implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f49518a;

    static {
        Covode.recordClassIndex(30985);
    }

    p(SQLiteDatabase sQLiteDatabase) {
        this.f49518a = sQLiteDatabase;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.c
    public final Object a() {
        MethodCollector.i(4449);
        this.f49518a.beginTransaction();
        MethodCollector.o(4449);
        return null;
    }
}
