package com.google.android.datatransport.runtime.scheduling.a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.a.h;

final /* synthetic */ class l implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final l f49513a = new l();

    static {
        Covode.recordClassIndex(30981);
    }

    private l() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        MethodCollector.i(3280);
        Object a2 = h.a(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), r.f49520a);
        MethodCollector.o(3280);
        return a2;
    }
}
