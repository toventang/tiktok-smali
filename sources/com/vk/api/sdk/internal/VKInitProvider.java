package com.vk.api.sdk.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.VK;
import h.f.b.l;

public final class VKInitProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(103826);
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
        try {
            Context context = getContext();
            if (context == null) {
                l.a();
            }
            l.a((Object) context, "");
            VK.a(context);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
