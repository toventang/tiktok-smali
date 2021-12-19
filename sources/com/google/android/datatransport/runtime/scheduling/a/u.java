package com.google.android.datatransport.runtime.scheduling.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.e.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.h;
import com.kakao.usermgmt.StringSet;
import java.util.Map;

final /* synthetic */ class u implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49523a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49524b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.h f49525c;

    static {
        Covode.recordClassIndex(30990);
    }

    u(h hVar, k kVar, com.google.android.datatransport.runtime.h hVar2) {
        this.f49523a = hVar;
        this.f49524b = kVar;
        this.f49525c = hVar2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        long insert;
        MethodCollector.i(1634);
        h hVar = this.f49523a;
        k kVar = this.f49524b;
        com.google.android.datatransport.runtime.h hVar2 = this.f49525c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (hVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong() * hVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() >= hVar.f49502b.a()) {
            MethodCollector.o(1634);
            return -1L;
        }
        Long a2 = h.a(sQLiteDatabase, kVar);
        if (a2 != null) {
            insert = a2.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", kVar.a());
            contentValues.put("priority", Integer.valueOf(a.a(kVar.c())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (kVar.b() != null) {
                contentValues.put("extras", Base64.encodeToString(kVar.b(), 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", hVar2.a());
        contentValues2.put("timestamp_ms", Long.valueOf(hVar2.d()));
        contentValues2.put("uptime_ms", Long.valueOf(hVar2.e()));
        contentValues2.put("payload_encoding", hVar2.c().f49447a.f49297a);
        contentValues2.put("payload", hVar2.c().f49448b);
        contentValues2.put("code", hVar2.b());
        contentValues2.put("num_attempts", (Integer) 0);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        for (Map.Entry<String, String> entry : hVar2.g().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert2));
            contentValues3.put(StringSet.name, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        Long valueOf = Long.valueOf(insert2);
        MethodCollector.o(1634);
        return valueOf;
    }
}
