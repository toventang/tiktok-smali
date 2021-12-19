package com.ss.android.ugc.aweme.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f123096a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static Integer f123097b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f123098c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static File f123099d;

    private d() {
    }

    static {
        Covode.recordClassIndex(80848);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123100a;

        static {
            Covode.recordClassIndex(80849);
        }

        public a(Context context) {
            this.f123100a = context;
        }

        public final void run() {
            MethodCollector.i(5572);
            int a2 = SettingsManager.a().a("covode_config", 2);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(d.b(this.f123100a)));
                dataOutputStream.writeInt(a2);
                dataOutputStream.close();
                MethodCollector.o(5572);
            } catch (Throwable unused) {
                MethodCollector.o(5572);
            }
        }
    }

    public static File b(Context context) {
        File c2 = c(context);
        f123099d = new File(c2, "covode_enable");
        if (c2.exists()) {
            c2.mkdir();
        }
        File file = f123099d;
        Objects.requireNonNull(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    private static File c(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r5) {
        /*
            r4 = 5566(0x15be, float:7.8E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            int r3 = com.ss.android.ugc.aweme.settings.d.f123096a
            java.io.File r0 = b(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0015
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0015:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ all -> 0x0029 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            java.io.File r0 = com.ss.android.ugc.aweme.settings.d.f123099d     // Catch:{ all -> 0x0029 }
            r1.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r1)     // Catch:{ all -> 0x0029 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0029 }
            goto L_0x0034
        L_0x0029:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.a()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "covode_config"
            r0 = 2
            int r3 = r2.a(r1, r0)     // Catch:{ all -> 0x0034 }
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.d.a(android.content.Context):int");
    }
}
