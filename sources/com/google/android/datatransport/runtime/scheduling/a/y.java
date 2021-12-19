package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class y implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49529a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49530b;

    static {
        Covode.recordClassIndex(30994);
    }

    y(h hVar, k kVar) {
        this.f49529a = hVar;
        this.f49530b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(4385);
        h hVar = this.f49529a;
        Long a2 = h.a((SQLiteDatabase) obj, this.f49530b);
        if (a2 == null) {
            MethodCollector.o(4385);
            return false;
        }
        Object a3 = h.a(hVar.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a2.toString()}), s.f49521a);
        MethodCollector.o(4385);
        return a3;
    }
}
