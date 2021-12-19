package com.google.android.datatransport.runtime.scheduling.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.e.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class j implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f49509a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49510b;

    static {
        Covode.recordClassIndex(30979);
    }

    j(long j2, k kVar) {
        this.f49509a = j2;
        this.f49510b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(3291);
        long j2 = this.f49509a;
        k kVar = this.f49510b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{kVar.a(), String.valueOf(a.a(kVar.c()))}) <= 0) {
            contentValues.put("backend_name", kVar.a());
            contentValues.put("priority", Integer.valueOf(a.a(kVar.c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        MethodCollector.o(3291);
        return null;
    }
}
