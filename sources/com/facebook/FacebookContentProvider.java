package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class FacebookContentProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46522a = FacebookContentProvider.class.getName();

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        Covode.recordClassIndex(28386);
    }

    private static Pair<UUID, String> a(Uri uri) {
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str = split[0];
            String str2 = split[1];
            if (!"..".contentEquals(str) && !"..".contentEquals(str2)) {
                return new Pair<>(UUID.fromString(str), str2);
            }
            throw new Exception();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair<UUID, String> a2 = a(uri);
        if (a2 != null) {
            try {
                File a3 = x.a((UUID) a2.first, (String) a2.second);
                if (a3 != null) {
                    return ParcelFileDescriptor.open(a3, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e2) {
                throw e2;
            }
        } else {
            throw new FileNotFoundException();
        }
    }
}
