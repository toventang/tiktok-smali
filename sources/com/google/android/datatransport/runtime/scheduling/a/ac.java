package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.aa;

final /* synthetic */ class ac implements aa.a {

    /* renamed from: a  reason: collision with root package name */
    static final ac f49491a = new ac();

    static {
        Covode.recordClassIndex(30964);
    }

    private ac() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.aa.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(2816);
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
        MethodCollector.o(2816);
    }
}
