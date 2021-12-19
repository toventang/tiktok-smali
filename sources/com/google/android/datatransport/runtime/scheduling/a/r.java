package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.e.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.h;
import java.util.ArrayList;

final /* synthetic */ class r implements h.a {

    /* renamed from: a  reason: collision with root package name */
    static final r f49520a = new r();

    static {
        Covode.recordClassIndex(30987);
    }

    private r() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.h.a
    public final Object a(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            k.a a2 = k.d().a(cursor.getString(1)).a(a.a(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                decode = null;
            } else {
                decode = Base64.decode(string, 0);
            }
            arrayList.add(a2.a(decode).a());
        }
        return arrayList;
    }
}
