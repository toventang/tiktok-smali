package com.ss.android.ugc.aweme.story.draft;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(89572);
    }

    public static final int a(Cursor cursor, String str) {
        l.d(cursor, "");
        l.d(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        return 0;
    }

    public static final long b(Cursor cursor, String str) {
        l.d(cursor, "");
        l.d(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getLong(columnIndex);
        }
        return 0;
    }

    public static final String c(Cursor cursor, String str) {
        l.d(cursor, "");
        l.d(str, "");
        return cursor.getString(cursor.getColumnIndex(str));
    }
}
