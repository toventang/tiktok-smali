package com.facebook.imagepipeline.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.e.a;
import com.facebook.common.g.i;
import com.facebook.common.k.g;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public class y extends aa implements bc<e> {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f48424a = y.class;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f48425b = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f48426c = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f48427d = new Rect(0, 0, 512, 384);

    /* renamed from: e  reason: collision with root package name */
    private static final Rect f48428e = new Rect(0, 0, 96, 96);

    /* renamed from: f  reason: collision with root package name */
    private final ContentResolver f48429f;

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    static {
        Covode.recordClassIndex(29191);
    }

    @Override // com.facebook.imagepipeline.n.bc
    public final boolean a(d dVar) {
        Rect rect = f48427d;
        return bd.a(rect.width(), rect.height(), dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        e a2;
        Uri uri = bVar.mSourceUri;
        if (!g.e(uri) || (a2 = a(uri, bVar.mResizeOptions)) == null) {
            return null;
        }
        return a2;
    }

    private static int a(String str) {
        if (str != null) {
            try {
                return com.facebook.imageutils.g.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                a.b(f48424a, e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    private e a(Uri uri, d dVar) {
        e a2;
        MethodCollector.i(14086);
        Cursor query = this.f48429f.query(uri, f48425b, null, null, null);
        if (query == null) {
            MethodCollector.o(14086);
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (dVar == null || (a2 = a(dVar, query.getInt(query.getColumnIndex("_id")))) == null) {
                query.close();
                MethodCollector.o(14086);
                return null;
            }
            a2.f47992d = a(string);
            query.close();
            MethodCollector.o(14086);
            return a2;
        } finally {
            query.close();
            MethodCollector.o(14086);
        }
    }

    private e a(d dVar, int i2) {
        int i3;
        Throwable th;
        int i4;
        MethodCollector.i(14119);
        Rect rect = f48428e;
        if (bd.a(rect.width(), rect.height(), dVar)) {
            i3 = 3;
        } else {
            Rect rect2 = f48427d;
            if (bd.a(rect2.width(), rect2.height(), dVar)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        }
        if (i3 == 0) {
            MethodCollector.o(14119);
            return null;
        }
        try {
            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f48429f, (long) i2, i3, f48426c);
            if (queryMiniThumbnail == null) {
                MethodCollector.o(14119);
                return null;
            }
            try {
                queryMiniThumbnail.moveToFirst();
                if (queryMiniThumbnail.getCount() > 0) {
                    String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        FileInputStream fileInputStream = new FileInputStream(string);
                        if (string == null) {
                            i4 = -1;
                        } else {
                            i4 = (int) new File(string).length();
                        }
                        e b2 = b(fileInputStream, i4);
                        queryMiniThumbnail.close();
                        MethodCollector.o(14119);
                        return b2;
                    }
                }
                queryMiniThumbnail.close();
                MethodCollector.o(14119);
                return null;
            } catch (Throwable th2) {
                th = th2;
                queryMiniThumbnail.close();
                MethodCollector.o(14119);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.o(14119);
            throw th;
        }
    }

    public y(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f48429f = contentResolver;
    }
}
