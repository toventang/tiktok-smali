package com.facebook.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.a.a;
import com.facebook.a.c;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46761a = f.class.getName();

    f() {
    }

    static {
        Covode.recordClassIndex(28488);
    }

    /* access modifiers changed from: package-private */
    public static class a extends ObjectInputStream {
        static {
            Covode.recordClassIndex(28489);
        }

        /* access modifiers changed from: protected */
        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(a.C1157a.class);
            }
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(c.a.class);
            }
            return readClassDescriptor;
        }

        public a(InputStream inputStream) {
            super(inputStream);
            MethodCollector.i(952);
            MethodCollector.o(952);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r1 != null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.a.n a() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.f.a():com.facebook.a.n");
    }

    public static synchronized void a(d dVar) {
        synchronized (f.class) {
            MethodCollector.i(3836);
            if (com.facebook.internal.a.b.a.a(f.class)) {
                MethodCollector.o(3836);
                return;
            }
            try {
                n a2 = a();
                for (a aVar : dVar.a()) {
                    a2.a(aVar, dVar.a(aVar).a());
                }
                a(a2);
                MethodCollector.o(3836);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, f.class);
                MethodCollector.o(3836);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|13|15|16|17|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        com.facebook.internal.ad.a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(88);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.facebook.a.n r8) {
        /*
            java.lang.String r7 = "AppEventsLogger.persistedevents"
            java.lang.Class<com.facebook.a.f> r6 = com.facebook.a.f.class
            r5 = 88
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            boolean r0 = com.facebook.internal.a.b.a.a(r6)
            if (r0 == 0) goto L_0x0013
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0013:
            r4 = 0
            com.facebook.internal.ae.a()     // Catch:{ all -> 0x0049 }
            android.content.Context r3 = com.facebook.m.f48921g     // Catch:{ all -> 0x0049 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0033 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0033 }
            r0 = 0
            java.io.FileOutputStream r0 = r3.openFileOutput(r7, r0)     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            r2.writeObject(r8)     // Catch:{ all -> 0x0032 }
            com.facebook.internal.ad.a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0032:
            r4 = r2
        L_0x0033:
            java.io.File r0 = r3.getFileStreamPath(r7)     // Catch:{ Exception -> 0x003a, all -> 0x0041 }
            a(r0)     // Catch:{ Exception -> 0x003a, all -> 0x0041 }
        L_0x003a:
            com.facebook.internal.ad.a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0041:
            r0 = move-exception
            com.facebook.internal.ad.a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0049:
            r0 = move-exception
            com.facebook.internal.a.b.a.a(r0, r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.f.a(com.facebook.a.n):void");
    }

    private static boolean a(File file) {
        MethodCollector.i(3840);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3840);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3840);
        return delete;
    }

    public static synchronized void a(a aVar, o oVar) {
        synchronized (f.class) {
            MethodCollector.i(3833);
            if (com.facebook.internal.a.b.a.a(f.class)) {
                MethodCollector.o(3833);
                return;
            }
            try {
                n a2 = a();
                a2.a(aVar, oVar.a());
                a(a2);
                MethodCollector.o(3833);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, f.class);
                MethodCollector.o(3833);
            }
        }
    }
}
