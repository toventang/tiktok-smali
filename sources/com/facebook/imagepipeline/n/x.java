package com.facebook.imagepipeline.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.common.k.g;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public final class x extends aa {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f48422a = {"_id", "_data"};

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f48423b;

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "LocalContentUriFetchProducer";
    }

    static {
        Covode.recordClassIndex(29190);
    }

    private e a(Uri uri) {
        MethodCollector.i(14084);
        Cursor query = this.f48423b.query(uri, f48422a, null, null, null);
        if (query == null) {
            MethodCollector.o(14084);
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                e b2 = b(new FileInputStream(string), (int) new File(string).length());
                query.close();
                MethodCollector.o(14084);
                return b2;
            }
            query.close();
            MethodCollector.o(14084);
            return null;
        } finally {
            query.close();
            MethodCollector.o(14084);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        boolean z;
        e a2;
        InputStream openContactPhotoInputStream;
        MethodCollector.i(14045);
        Uri uri = bVar.mSourceUri;
        if (!g.d(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(g.f47135a.getPath())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (uri.toString().endsWith("/photo")) {
                openContactPhotoInputStream = this.f48423b.openInputStream(uri);
            } else if (uri.toString().endsWith("/display_photo")) {
                try {
                    openContactPhotoInputStream = this.f48423b.openAssetFileDescriptor(uri, "r").createInputStream();
                } catch (IOException unused) {
                    IOException iOException = new IOException("Contact photo does not exist: ".concat(String.valueOf(uri)));
                    MethodCollector.o(14045);
                    throw iOException;
                }
            } else {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f48423b, uri);
                if (openContactPhotoInputStream == null) {
                    IOException iOException2 = new IOException("Contact photo does not exist: ".concat(String.valueOf(uri)));
                    MethodCollector.o(14045);
                    throw iOException2;
                }
            }
            e b2 = b(openContactPhotoInputStream, -1);
            MethodCollector.o(14045);
            return b2;
        } else if (!g.e(uri) || (a2 = a(uri)) == null) {
            e b3 = b(this.f48423b.openInputStream(uri), -1);
            MethodCollector.o(14045);
            return b3;
        } else {
            MethodCollector.o(14045);
            return a2;
        }
    }

    public x(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f48423b = contentResolver;
    }
}
