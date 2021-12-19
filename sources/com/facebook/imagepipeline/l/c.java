package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.facebook.common.d.m;
import com.facebook.common.g.h;
import com.facebook.common.g.j;
import com.facebook.common.l.b;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

public final class c extends DalvikPurgeableDecoder {

    /* renamed from: a  reason: collision with root package name */
    private static Method f48009a;

    /* renamed from: b  reason: collision with root package name */
    private final b f48010b = com.facebook.common.l.c.a();

    static {
        Covode.recordClassIndex(29028);
    }

    private synchronized Method a() {
        Method method;
        MethodCollector.i(14448);
        if (f48009a == null) {
            try {
                f48009a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                RuntimeException b2 = m.b(e2);
                MethodCollector.o(14448);
                throw b2;
            }
        }
        method = f48009a;
        MethodCollector.o(14448);
        return method;
    }

    private FileDescriptor a(MemoryFile memoryFile) {
        Object invoke;
        try {
            Method a2 = a();
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a3 = a.a(a2, new Object[]{memoryFile, objArr}, 110000, "java.lang.Object", true, "com_facebook_imagepipeline_platform_GingerbreadPurgeableDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a3.first).booleanValue()) {
                invoke = a3.second;
            } else {
                invoke = a2.invoke(memoryFile, objArr);
                a.a(invoke, a2, new Object[]{memoryFile, objArr}, "com_facebook_imagepipeline_platform_GingerbreadPurgeableDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return (FileDescriptor) invoke;
        } catch (Exception e2) {
            throw m.b(e2);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(com.facebook.common.h.a<h> aVar, BitmapFactory.Options options) {
        return a(aVar, aVar.a().a(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(com.facebook.common.h.a<h> aVar, int i2, BitmapFactory.Options options) {
        byte[] bArr;
        if (endsWithEOI(aVar, i2)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        return a(aVar, i2, bArr, options);
    }

    private static MemoryFile a(com.facebook.common.h.a<h> aVar, int i2, byte[] bArr) {
        int length;
        Closeable closeable;
        com.facebook.common.j.a aVar2;
        Throwable th;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        j jVar = null;
        MemoryFile memoryFile = new MemoryFile(null, length + i2);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j(aVar.a());
            try {
                aVar2 = new com.facebook.common.j.a(jVar2, i2);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    com.facebook.common.d.a.a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i2, bArr.length);
                    }
                    com.facebook.common.h.a.c(aVar);
                    com.facebook.common.d.b.a((InputStream) jVar2);
                    com.facebook.common.d.b.a((InputStream) aVar2);
                    com.facebook.common.d.b.a(outputStream);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    jVar = jVar2;
                    com.facebook.common.h.a.c(aVar);
                    com.facebook.common.d.b.a((InputStream) jVar);
                    com.facebook.common.d.b.a((InputStream) aVar2);
                    com.facebook.common.d.b.a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                aVar2 = null;
                jVar = jVar2;
                com.facebook.common.h.a.c(aVar);
                com.facebook.common.d.b.a((InputStream) jVar);
                com.facebook.common.d.b.a((InputStream) aVar2);
                com.facebook.common.d.b.a(closeable);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            aVar2 = null;
            com.facebook.common.h.a.c(aVar);
            com.facebook.common.d.b.a((InputStream) jVar);
            com.facebook.common.d.b.a((InputStream) aVar2);
            com.facebook.common.d.b.a(closeable);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap a(com.facebook.common.h.a<com.facebook.common.g.h> r5, int r6, byte[] r7, android.graphics.BitmapFactory.Options r8) {
        /*
            r4 = this;
            r3 = 0
            android.os.MemoryFile r2 = a(r5, r6, r7)     // Catch:{ IOException -> 0x002b }
            java.io.FileDescriptor r1 = r4.a(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            com.facebook.common.l.b r0 = r4.f48010b     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            if (r0 == 0) goto L_0x001d
            android.graphics.Bitmap r1 = r0.decodeFileDescriptor(r1, r3, r8)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            java.lang.String r0 = "BitmapFactory returned null"
            java.lang.Object r0 = com.facebook.common.d.i.a(r1, r0)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r2.close()
            return r0
        L_0x001d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "WebpBitmapFactory is null"
            r1.<init>(r0)
            throw r1
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x0032
        L_0x0028:
            r0 = move-exception
            r3 = r2
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            java.lang.RuntimeException r0 = com.facebook.common.d.m.b(r0)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r3.close()
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.l.c.a(com.facebook.common.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
