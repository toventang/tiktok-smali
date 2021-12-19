package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.aa;

final /* synthetic */ class ad implements aa.a {

    /* renamed from: a  reason: collision with root package name */
    static final ad f49492a = new ad();

    static {
        Covode.recordClassIndex(30965);
    }

    private ad() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.aa.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(4361);
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
        MethodCollector.o(4361);
    }
}
