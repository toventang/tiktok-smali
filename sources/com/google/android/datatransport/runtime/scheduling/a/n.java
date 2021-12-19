package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.b;
import com.google.android.datatransport.runtime.g;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.h;
import java.util.List;

final /* synthetic */ class n implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f49515a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49516b;

    static {
        Covode.recordClassIndex(30983);
    }

    n(List list, k kVar) {
        this.f49515a = list;
        this.f49516b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        b a2;
        List list = this.f49515a;
        k kVar = this.f49516b;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            h.a b2 = com.google.android.datatransport.runtime.h.i().a(cursor.getString(1)).a(cursor.getLong(2)).b(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string == null) {
                a2 = h.f49501a;
            } else {
                a2 = b.a(string);
            }
            h.a a3 = b2.a(new g(a2, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                a3.a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(g.a(j2, kVar, a3.b()));
        }
        return null;
    }
}
