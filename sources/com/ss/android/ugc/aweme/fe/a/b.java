package com.ss.android.ugc.aweme.fe.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import c.d.a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f91015a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(57233);
    }

    private static Uri a(Uri uri) {
        Uri uri2;
        String documentId = DocumentsContract.getDocumentId(uri);
        l.b(documentId, "");
        List<String> b2 = p.b(documentId, new String[]{":"});
        String str = b2.get(0);
        if (TextUtils.equals("image", str)) {
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (c.d.b.b()) {
                uri2 = MediaStore.Images.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("video", str)) {
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            if (c.d.b.b()) {
                uri2 = MediaStore.Video.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals(DataType.AUDIO, str)) {
            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            if (c.d.b.b()) {
                uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
            }
        } else {
            uri2 = null;
        }
        if (TextUtils.isEmpty(b2.get(1))) {
            return null;
        }
        if (uri2 == null) {
            l.b();
        }
        return ContentUris.withAppendedId(uri2, Long.parseLong(b2.get(1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x010c A[SYNTHETIC, Splitter:B:76:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0111 A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0116 A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.a.b.a(java.lang.String):java.lang.String");
    }

    public static Long a(Context context, Uri uri) {
        ContentResolver contentResolver;
        ParcelFileDescriptor openFileDescriptor;
        MethodCollector.i(12259);
        l.d(uri, "");
        int i2 = Build.VERSION.SDK_INT;
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            uri = a(uri);
            if (uri == null) {
                MethodCollector.o(12259);
                return null;
            }
        } else if (!TextUtils.equals("media", uri.getAuthority())) {
            Long valueOf = Long.valueOf(new File(a.a(context, uri)).length());
            MethodCollector.o(12259);
            return valueOf;
        }
        if (context == null || (contentResolver = context.getContentResolver()) == null || (openFileDescriptor = contentResolver.openFileDescriptor(uri, "r")) == null) {
            MethodCollector.o(12259);
            return null;
        }
        Long valueOf2 = Long.valueOf(openFileDescriptor.getStatSize());
        MethodCollector.o(12259);
        return valueOf2;
    }
}
