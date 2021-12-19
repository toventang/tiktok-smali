package com.bytedance.ies.powerpermissions;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.KevaBuilder;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;

public final class PermissionsProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20581);
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
        Context context = getContext();
        if (context == null) {
            return true;
        }
        l.a((Object) context, "");
        l.c(context, "");
        KevaBuilder instance = KevaBuilder.getInstance();
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        instance.setContext(applicationContext);
        return true;
    }
}
