package com.ss.android.ugc.aweme.application;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class g extends ContentProvider {
    static {
        Covode.recordClassIndex(41254);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        l.d(uri, "");
        return 0;
    }

    public String getType(Uri uri) {
        l.d(uri, "");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        l.d(uri, "");
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.d(uri, "");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.d(uri, "");
        return 0;
    }
}
