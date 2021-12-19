package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.aa;

final /* synthetic */ class ab implements aa.a {

    /* renamed from: a  reason: collision with root package name */
    static final ab f49490a = new ab();

    static {
        Covode.recordClassIndex(30963);
    }

    private ab() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.aa.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(3244);
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
        MethodCollector.o(3244);
    }
}
