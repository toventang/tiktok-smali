package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class k implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49511a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.k f49512b;

    static {
        Covode.recordClassIndex(30980);
    }

    k(h hVar, com.google.android.datatransport.runtime.k kVar) {
        this.f49511a = hVar;
        this.f49512b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(4588);
        h hVar = this.f49511a;
        com.google.android.datatransport.runtime.k kVar = this.f49512b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = new ArrayList();
        Long a2 = h.a(sQLiteDatabase, kVar);
        if (a2 != null) {
            h.a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{a2.toString()}, null, null, null, String.valueOf(hVar.f49502b.b())), new n(arrayList, kVar));
        }
        List<g> a3 = h.a(arrayList, h.a(sQLiteDatabase, arrayList));
        MethodCollector.o(4588);
        return a3;
    }
}
