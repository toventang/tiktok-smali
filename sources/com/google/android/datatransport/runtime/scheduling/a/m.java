package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class m implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f49514a;

    static {
        Covode.recordClassIndex(30982);
    }

    m(long j2) {
        this.f49514a = j2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(4489);
        Integer valueOf = Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f49514a)}));
        MethodCollector.o(4489);
        return valueOf;
    }
}
