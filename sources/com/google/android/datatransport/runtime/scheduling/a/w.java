package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class w implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f49527a;

    static {
        Covode.recordClassIndex(30992);
    }

    w(String str) {
        this.f49527a = str;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(4380);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.compileStatement(this.f49527a).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        MethodCollector.o(4380);
        return null;
    }
}
