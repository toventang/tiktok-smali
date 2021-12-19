package com.bytedance.ies.powerpage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PagerProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20571);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        l.c(uri, "");
        return 0;
    }

    public final String getType(Uri uri) {
        l.c(uri, "");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        l.c(uri, "");
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.c(uri, "");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.c(uri, "");
        return 0;
    }

    public final boolean onCreate() {
        getContext();
        return true;
    }
}
