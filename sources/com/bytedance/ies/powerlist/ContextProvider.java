package com.bytedance.ies.powerlist;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.bc;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;

public final class ContextProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20440);
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
        Context context;
        if (bc.b() || bc.c()) {
            return false;
        }
        Context context2 = getContext();
        Application application = null;
        if (context2 != null) {
            context = context2.getApplicationContext();
            if (a.f107168c && context == null) {
                context = a.f107166a;
            }
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        Application application2 = application;
        if (application2 == null) {
            return true;
        }
        c.a(application2);
        return true;
    }
}
