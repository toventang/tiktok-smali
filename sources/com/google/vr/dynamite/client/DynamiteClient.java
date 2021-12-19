package com.google.vr.dynamite.client;

import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.DexClassLoader;

public final class DynamiteClient {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayMap<f, e> f54903a = new ArrayMap<>();

    private DynamiteClient() {
    }

    static {
        Covode.recordClassIndex(34123);
    }

    private static synchronized e getRemoteLibraryLoaderFromInfo(f fVar) {
        synchronized (DynamiteClient.class) {
            MethodCollector.i(11173);
            ArrayMap<f, e> arrayMap = f54903a;
            e eVar = arrayMap.get(fVar);
            if (eVar == null) {
                e eVar2 = new e(fVar);
                arrayMap.put(fVar, eVar2);
                MethodCollector.o(11173);
                return eVar2;
            }
            MethodCollector.o(11173);
            return eVar;
        }
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            MethodCollector.i(11011);
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                MethodCollector.o(11011);
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                MethodCollector.o(11011);
                return dexClassLoader;
            } catch (RuntimeException unused) {
                MethodCollector.o(11011);
                return null;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            MethodCollector.i(11009);
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                MethodCollector.o(11009);
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            MethodCollector.o(11009);
            return classLoader;
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b2;
        synchronized (DynamiteClient.class) {
            MethodCollector.i(11172);
            f fVar = new f(str, str2);
            try {
                b2 = getRemoteLibraryLoaderFromInfo(fVar).b(context);
                MethodCollector.o(11172);
            } catch (d unused) {
                String.valueOf(String.valueOf(fVar)).length();
                MethodCollector.o(11172);
                return null;
            }
        }
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r5)).length();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11008);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long loadNativeRemoteLibrary(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r7 = com.google.vr.dynamite.client.DynamiteClient.class
            monitor-enter(r7)
            r6 = 11008(0x2b00, float:1.5425E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)     // Catch:{ all -> 0x0052 }
            com.google.vr.dynamite.client.f r5 = new com.google.vr.dynamite.client.f     // Catch:{ all -> 0x0052 }
            r5.<init>(r9, r10)     // Catch:{ all -> 0x0052 }
            com.google.vr.dynamite.client.e r1 = getRemoteLibraryLoaderFromInfo(r5)     // Catch:{ all -> 0x0052 }
            r3 = 0
            android.content.Context r0 = r1.b(r8)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = r1.a(r8)
            com.google.vr.dynamite.client.IObjectWrapper r1 = com.google.vr.dynamite.client.ObjectWrapper.a(r0)
            com.google.vr.dynamite.client.IObjectWrapper r0 = com.google.vr.dynamite.client.ObjectWrapper.a(r8)
            com.google.vr.dynamite.client.INativeLibraryLoader r0 = r2.newNativeLibraryLoader(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            monitor-exit(r7)
            return r3
        L_0x0039:
            long r0 = r0.initializeAndLoadNativeLibrary(r10)     // Catch:{ RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            monitor-exit(r7)
            return r0
        L_0x0042:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            monitor-exit(r7)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.dynamite.client.DynamiteClient.loadNativeRemoteLibrary(android.content.Context, java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r4)).length();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10836);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int checkVersion(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r6 = com.google.vr.dynamite.client.DynamiteClient.class
            monitor-enter(r6)
            r5 = 10836(0x2a54, float:1.5184E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)     // Catch:{ all -> 0x0051 }
            com.google.vr.dynamite.client.f r4 = new com.google.vr.dynamite.client.f     // Catch:{ all -> 0x0051 }
            r4.<init>(r8, r9)     // Catch:{ all -> 0x0051 }
            com.google.vr.dynamite.client.e r1 = getRemoteLibraryLoaderFromInfo(r4)     // Catch:{ all -> 0x0051 }
            r3 = -1
            android.content.Context r0 = r1.b(r7)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r2 = r1.a(r7)
            com.google.vr.dynamite.client.IObjectWrapper r1 = com.google.vr.dynamite.client.ObjectWrapper.a(r0)
            com.google.vr.dynamite.client.IObjectWrapper r0 = com.google.vr.dynamite.client.ObjectWrapper.a(r7)
            com.google.vr.dynamite.client.INativeLibraryLoader r0 = r2.newNativeLibraryLoader(r1, r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            monitor-exit(r6)
            return r3
        L_0x0038:
            int r0 = r0.checkVersion(r10)     // Catch:{ RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041, RemoteException | d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x0041 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            monitor-exit(r6)
            return r0
        L_0x0041:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            monitor-exit(r6)
            return r3
        L_0x0051:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.dynamite.client.DynamiteClient.checkVersion(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }
}
