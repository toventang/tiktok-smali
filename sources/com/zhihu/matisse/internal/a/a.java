package com.zhihu.matisse.internal.a;

import android.content.ContentUris;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.loader.a.b;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.Album;
import java.util.HashMap;
import java.util.HashSet;

public final class a extends b {
    private static final String[] A = {"_id", "bucket_id", "bucket_display_name", "mime_type"};
    private static final String[] B = {"_id", "bucket_id", "bucket_display_name", "mime_type"};
    public static final String[] v = {"1", "3"};
    private static final Uri w = MediaStore.Files.getContentUri("external");
    private static final String[] x = {"_id", "bucket_id", "bucket_display_name", "mime_type", "uri", "count"};
    private static final String[] y = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};
    private static final String[] z = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};

    @Override // androidx.loader.a.c
    public final void o() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.loader.a.b, androidx.loader.a.a
    public final /* synthetic */ Cursor d() {
        return d();
    }

    static {
        Covode.recordClassIndex(103874);
    }

    @Override // androidx.loader.a.b
    public final Cursor f() {
        Uri uri;
        int i2;
        long valueOf;
        int i3;
        Uri uri2;
        String uri3;
        char c2;
        Cursor f2 = super.d();
        String[] strArr = x;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (Build.VERSION.SDK_INT < 29) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (f2 != null) {
                i3 = 0;
                while (f2.moveToNext()) {
                    long j2 = f2.getLong(f2.getColumnIndex("_id"));
                    long j3 = f2.getLong(f2.getColumnIndex("bucket_id"));
                    String string = f2.getString(f2.getColumnIndex("bucket_display_name"));
                    String string2 = f2.getString(f2.getColumnIndex("mime_type"));
                    Uri a2 = a(f2);
                    int i4 = f2.getInt(f2.getColumnIndex("count"));
                    matrixCursor2.addRow(new String[]{Long.toString(j2), Long.toString(j3), string, string2, a2.toString(), String.valueOf(i4)});
                    i3 += i4;
                }
                if (f2.moveToFirst()) {
                    uri2 = a(f2);
                } else {
                    uri2 = null;
                }
            } else {
                uri2 = null;
                i3 = 0;
            }
            String[] strArr2 = new String[6];
            strArr2[0] = Album.f156416a;
            strArr2[1] = Album.f156416a;
            strArr2[2] = "All";
            strArr2[3] = null;
            if (uri2 == null) {
                c2 = 4;
                uri3 = null;
            } else {
                uri3 = uri2.toString();
                c2 = 4;
            }
            strArr2[c2] = uri3;
            strArr2[5] = String.valueOf(i3);
            matrixCursor.addRow(strArr2);
            return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor2});
        }
        HashMap hashMap = new HashMap();
        if (f2 != null) {
            while (f2.moveToNext()) {
                long j4 = f2.getLong(f2.getColumnIndex("bucket_id"));
                Long l2 = (Long) hashMap.get(Long.valueOf(j4));
                if (l2 == null) {
                    valueOf = 1L;
                } else {
                    valueOf = Long.valueOf(l2.longValue() + 1);
                }
                hashMap.put(Long.valueOf(j4), valueOf);
            }
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(x);
        if (f2 == null || !f2.moveToFirst()) {
            uri = null;
            i2 = 0;
        } else {
            uri = a(f2);
            HashSet hashSet = new HashSet();
            i2 = 0;
            do {
                long j5 = f2.getLong(f2.getColumnIndex("bucket_id"));
                if (!hashSet.contains(Long.valueOf(j5))) {
                    long j6 = f2.getLong(f2.getColumnIndex("_id"));
                    String string3 = f2.getString(f2.getColumnIndex("bucket_display_name"));
                    String string4 = f2.getString(f2.getColumnIndex("mime_type"));
                    Uri a3 = a(f2);
                    long longValue = ((Long) hashMap.get(Long.valueOf(j5))).longValue();
                    matrixCursor3.addRow(new String[]{Long.toString(j6), Long.toString(j5), string3, string4, a3.toString(), String.valueOf(longValue)});
                    hashSet.add(Long.valueOf(j5));
                    i2 = (int) (((long) i2) + longValue);
                }
            } while (f2.moveToNext());
        }
        String[] strArr3 = new String[6];
        strArr3[0] = Album.f156416a;
        strArr3[1] = Album.f156416a;
        strArr3[2] = "All";
        String str = null;
        strArr3[3] = null;
        if (uri != null) {
            str = uri.toString();
        }
        strArr3[4] = str;
        strArr3[5] = String.valueOf(i2);
        matrixCursor.addRow(strArr3);
        return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor3});
    }

    public static String[] a(int i2) {
        return new String[]{String.valueOf(i2)};
    }

    private static Uri a(Cursor cursor) {
        Uri contentUri;
        long j2 = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (com.zhihu.matisse.b.isImage(string)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (com.zhihu.matisse.b.isVideo(string)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r7 = this;
            android.net.Uri r2 = com.zhihu.matisse.internal.a.a.w
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0014
            java.lang.String[] r3 = com.zhihu.matisse.internal.a.a.z
        L_0x000a:
            java.lang.String r6 = "datetaken DESC"
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0014:
            java.lang.String[] r3 = com.zhihu.matisse.internal.a.a.B
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.a.a.<init>(android.content.Context, java.lang.String, java.lang.String[]):void");
    }
}
