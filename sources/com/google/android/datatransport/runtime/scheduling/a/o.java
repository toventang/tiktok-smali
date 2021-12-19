package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.h;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f49517a;

    static {
        Covode.recordClassIndex(30984);
    }

    o(Map map) {
        this.f49517a = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        Map map = this.f49517a;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new h.b(cursor.getString(1), cursor.getString(2), (byte) 0));
        }
        return null;
    }
}
