package com.ss.android.account.share.data.write.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.account.share.data.write.a;
import com.ss.android.account.share.data.write.b;
import h.f.b.l;
import java.util.List;

public final class SecShareDataProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58247a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final UriMatcher f58248c = new UriMatcher(-1);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.account.share.data.write.a f58249b;

    public final int delete(Uri uri, String str, String[] strArr) {
        l.c(uri, "");
        return 0;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.c(uri, "");
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(36192);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(36191);
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        this.f58249b = a.C1281a.a(context);
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        f58248c.addURI(packageName + ".SecShareProviderAuthority", "sec_share/*", 2);
        return true;
    }

    public final String getType(Uri uri) {
        l.c(uri, "");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName) && f58248c.match(uri) == 2) {
            return packageName + ".SecShareProviderAuthority";
        }
        return null;
    }

    public final synchronized Uri insert(Uri uri, ContentValues contentValues) {
        MethodCollector.i(2128);
        l.c(uri, "");
        MethodCollector.o(2128);
        return uri;
    }

    public final synchronized Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Exception e2;
        MethodCollector.i(2129);
        l.c(uri, "");
        int i2 = Build.VERSION.SDK_INT;
        MatrixCursor matrixCursor = null;
        if (!b.a(getCallingPackage())) {
            MethodCollector.o(2129);
            return null;
        } else if (f58248c.match(uri) != 2) {
            MethodCollector.o(2129);
            return null;
        } else {
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size > 0) {
                String str3 = pathSegments.get(size - 1);
                l.a((Object) str3, "");
                String str4 = str3;
                try {
                    com.ss.android.account.share.data.write.a aVar = this.f58249b;
                    if (aVar == null) {
                        l.a();
                    }
                    String a2 = aVar.a(str4);
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str4});
                    try {
                        matrixCursor2.newRow().add(str4, a2);
                        MethodCollector.o(2129);
                        return matrixCursor2;
                    } catch (Exception e3) {
                        e2 = e3;
                        matrixCursor = matrixCursor2;
                        e2.printStackTrace();
                        MethodCollector.o(2129);
                        return matrixCursor;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                    MethodCollector.o(2129);
                    return matrixCursor;
                }
            } else {
                MethodCollector.o(2129);
                return null;
            }
        }
    }
}
