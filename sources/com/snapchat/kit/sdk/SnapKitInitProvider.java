package com.snapchat.kit.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import java.util.concurrent.TimeUnit;

public final class SnapKitInitProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(35545);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final boolean onCreate() {
        Context context = getContext();
        k kVar = new k((byte) 0);
        kVar.a().schedule(new Runnable(context) {
            /* class com.snapchat.kit.sdk.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f57081a;

            static {
                Covode.recordClassIndex(35564);
            }

            public final void run() {
                c.a(this.f57081a, SnapKitInitType.INIT_TYPE_AUTO);
            }

            {
                this.f57081a = r1;
            }
        }, 5, TimeUnit.SECONDS);
        return false;
    }
}
