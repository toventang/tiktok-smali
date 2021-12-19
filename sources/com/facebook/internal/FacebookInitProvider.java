package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final String f48481a = FacebookInitProvider.class.getSimpleName();

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        Covode.recordClassIndex(29239);
    }
}
