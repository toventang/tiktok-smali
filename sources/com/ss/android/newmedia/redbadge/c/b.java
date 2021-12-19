package com.ss.android.newmedia.redbadge.c;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(37106);
    }

    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
