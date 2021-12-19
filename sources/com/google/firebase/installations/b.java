package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f54537a;

    /* renamed from: b  reason: collision with root package name */
    private final FileLock f54538b;

    static {
        Covode.recordClassIndex(33840);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            this.f54538b.release();
            this.f54537a.close();
        } catch (IOException unused) {
        }
    }

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f54537a = fileChannel;
        this.f54538b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[SYNTHETIC, Splitter:B:18:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.installations.b a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error -> 0x0036 }
            java.io.File r0 = com.ss.android.ugc.aweme.lancet.d.f107195c     // Catch:{ IOException | Error -> 0x0036 }
            if (r0 == 0) goto L_0x000b
            boolean r0 = com.ss.android.ugc.aweme.lancet.d.f107197e     // Catch:{ IOException | Error -> 0x0036 }
            if (r0 != 0) goto L_0x0011
        L_0x000b:
            java.io.File r0 = r4.getFilesDir()     // Catch:{ IOException | Error -> 0x0036 }
            com.ss.android.ugc.aweme.lancet.d.f107195c = r0     // Catch:{ IOException | Error -> 0x0036 }
        L_0x0011:
            java.io.File r0 = com.ss.android.ugc.aweme.lancet.d.f107195c     // Catch:{ IOException | Error -> 0x0036 }
            r2.<init>(r0, r5)     // Catch:{ IOException | Error -> 0x0036 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException | Error -> 0x0036 }
            java.lang.String r0 = "rw"
            r1.<init>(r2, r0)     // Catch:{ IOException | Error -> 0x0036 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ IOException | Error -> 0x0036 }
            java.nio.channels.FileLock r1 = r2.lock()     // Catch:{ IOException | Error -> 0x0030 }
            com.google.firebase.installations.b r0 = new com.google.firebase.installations.b     // Catch:{ IOException | Error -> 0x002b }
            r0.<init>(r2, r1)     // Catch:{ IOException | Error -> 0x002b }
            return r0
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.release()
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0037
        L_0x0036:
            r0 = r3
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }
}
