package com.squareup.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.b.t;
import com.squareup.b.y;

/* access modifiers changed from: package-private */
public final class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f58063b = {"orientation"};

    static {
        Covode.recordClassIndex(36069);
    }

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        static {
            Covode.recordClassIndex(36070);
        }

        private a(int i2, int i3, int i4) {
            this.androidKind = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    o(Context context) {
        super(context);
    }

    @Override // com.squareup.b.y, com.squareup.b.g
    public final boolean a(w wVar) {
        Uri uri = wVar.f58115d;
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.b.y, com.squareup.b.g
    public final y.a b(w wVar) {
        boolean z;
        a aVar;
        Bitmap thumbnail;
        int i2;
        ContentResolver contentResolver = this.f58025a.getContentResolver();
        int a2 = a(contentResolver, wVar.f58115d);
        String type = contentResolver.getType(wVar.f58115d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (wVar.c()) {
            int i3 = wVar.f58119h;
            int i4 = wVar.f58120i;
            if (i3 <= a.MICRO.width && i4 <= a.MICRO.height) {
                aVar = a.MICRO;
            } else if (i3 > a.MINI.width || i4 > a.MINI.height) {
                aVar = a.FULL;
            } else {
                aVar = a.MINI;
            }
            if (!z && aVar == a.FULL) {
                return new y.a(null, c(wVar), t.d.DISK, a2);
            }
            long parseId = ContentUris.parseId(wVar.f58115d);
            BitmapFactory.Options d2 = d(wVar);
            d2.inJustDecodeBounds = true;
            a(wVar.f58119h, wVar.f58120i, aVar.width, aVar.height, d2, wVar);
            if (z) {
                if (aVar == a.FULL) {
                    i2 = 1;
                } else {
                    i2 = aVar.androidKind;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i2, d2);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, aVar.androidKind, d2);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, t.d.DISK, a2);
            }
        }
        return new y.a(null, c(wVar), t.d.DISK, a2);
    }

    private static int a(ContentResolver contentResolver, Uri uri) {
        MethodCollector.i(3717);
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f58063b, null, null, null);
            if (query != null) {
                if (!query.moveToFirst()) {
                    query.close();
                } else {
                    int i2 = query.getInt(0);
                    query.close();
                    MethodCollector.o(3717);
                    return i2;
                }
            }
            MethodCollector.o(3717);
            return 0;
        } catch (RuntimeException unused) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(3717);
            return 0;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(3717);
            throw th;
        }
    }
}
