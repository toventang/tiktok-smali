package com.bytedance.ies.xbridge.i.d;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    static {
        Covode.recordClassIndex(21603);
    }

    public static String a(Context context, Uri uri) {
        Uri uri2;
        MethodCollector.i(14120);
        Uri uri3 = null;
        if (uri == null) {
            MethodCollector.o(14120);
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            String path = uri.getPath();
            MethodCollector.o(14120);
            return path;
        } else if ("http".equals(scheme)) {
            String uri4 = uri.toString();
            MethodCollector.o(14120);
            return uri4;
        } else if (!"content".equals(scheme) || !"media".equals(uri.getAuthority())) {
            int i2 = Build.VERSION.SDK_INT;
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if (TextUtils.equals("com.android.externalstorage.documents", uri.getAuthority())) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        String str = Environment.getExternalStorageDirectory() + "/" + split[1];
                        MethodCollector.o(14120);
                        return str;
                    }
                } else if (TextUtils.equals("com.android.providers.downloads.documents", uri.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId == null || !documentId.startsWith("raw:")) {
                        if (Build.VERSION.SDK_INT < 26) {
                            uri2 = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue());
                        } else {
                            uri2 = uri;
                        }
                        String a2 = a(context, uri2, null, null);
                        if (a2 == null) {
                            try {
                                if (d.f107194b == null || !d.f107197e) {
                                    d.f107194b = context.getCacheDir();
                                }
                                String absolutePath = new File(d.f107194b, "uri_tmp").getAbsolutePath();
                                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                                if (openFileDescriptor == null) {
                                    MethodCollector.o(14120);
                                    return null;
                                }
                                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read != -1) {
                                        fileOutputStream.write(bArr, 0, read);
                                    } else {
                                        fileInputStream.close();
                                        fileOutputStream.close();
                                        String absolutePath2 = new File(absolutePath).getAbsolutePath();
                                        MethodCollector.o(14120);
                                        return absolutePath2;
                                    }
                                }
                            } catch (IOException unused) {
                            }
                        }
                        MethodCollector.o(14120);
                        return a2;
                    }
                    String substring = documentId.substring(4);
                    MethodCollector.o(14120);
                    return substring;
                } else if (TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if (TextUtils.equals("image", str2)) {
                        uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (TextUtils.equals("video", str2)) {
                        uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (TextUtils.equals(DataType.AUDIO, str2)) {
                        uri3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    String a3 = a(context, uri3, "_id=?", new String[]{split2[1]});
                    MethodCollector.o(14120);
                    return a3;
                }
            }
            if ("content".equals(scheme)) {
                context.getContentResolver();
                if ("com.google.android.apps.photos.contentprovider".equals(uri.getAuthority())) {
                    String str3 = uri.getPathSegments().get(2);
                    if (str3.startsWith("content")) {
                        String a4 = a(context, Uri.parse(str3), null, null);
                        MethodCollector.o(14120);
                        return a4;
                    }
                } else if (("com.android.fileexplorer.myprovider".equals(uri.getAuthority()) || "com.mi.android.globalFileexplorer.myprovider".equals(uri.getAuthority())) && !TextUtils.isEmpty(uri.getPath())) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    arrayList.remove(0);
                    StringBuilder sb = new StringBuilder(Environment.getExternalStorageDirectory().getAbsolutePath());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append("/").append((String) it.next());
                    }
                    String sb2 = sb.toString();
                    MethodCollector.o(14120);
                    return sb2;
                }
                String lastPathSegment = uri.getLastPathSegment();
                if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.startsWith("/storage/emulated/")) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.contains(":")) {
                        lastPathSegment = lastPathSegment.split(":")[1];
                    }
                    String a5 = a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id= ?", new String[]{lastPathSegment});
                    MethodCollector.o(14120);
                    return a5;
                }
                MethodCollector.o(14120);
                return lastPathSegment;
            }
            MethodCollector.o(14120);
            return null;
        } else {
            String a6 = a(context, uri, null, null);
            MethodCollector.o(14120);
            return a6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14154);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            r4 = 14154(0x374a, float:1.9834E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.String r3 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r3}
            r2 = 0
            android.content.ContentResolver r5 = r10.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x003f, all -> 0x0035 }
            r10 = 0
            r6 = r11
            r8 = r12
            r9 = r13
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ IllegalArgumentException -> 0x003f, all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0040, all -> 0x002f }
            if (r0 == 0) goto L_0x0032
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ IllegalArgumentException -> 0x0040, all -> 0x002f }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException -> 0x0040, all -> 0x002f }
            r1.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x002f:
            r0 = move-exception
            r2 = r1
            goto L_0x0036
        L_0x0032:
            if (r1 == 0) goto L_0x0045
            goto L_0x0042
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r1.close()
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.i.d.c.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
