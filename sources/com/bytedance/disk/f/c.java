package com.bytedance.disk.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(16798);
    }

    int a(Uri uri, ContentValues contentValues, String str);

    int a(Uri uri, String str, String[] strArr);

    Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri a(Uri uri, ContentValues contentValues);

    void a(Context context);
}
