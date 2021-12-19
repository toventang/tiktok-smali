package com.bytedance.librarian;

import android.content.Context;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.application.n;

public class Librarian {

    /* renamed from: a  reason: collision with root package name */
    static Context f39763a;

    /* renamed from: b  reason: collision with root package name */
    static volatile String f39764b;

    /* renamed from: c  reason: collision with root package name */
    static LibrarianMonitor f39765c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f39766d = new Object();

    public static void b(String str, boolean z, Context context) {
        a(str, z, context);
    }

    public static void a(String str) {
        a(str, false, (Context) null);
    }

    public static void a(String str, Context context) {
        a(str, true, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r4 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        com.bytedance.librarian.Librarian.f39763a = r3;
        com.bytedance.librarian.Librarian.f39764b = r4;
        com.bytedance.librarian.Librarian.f39765c = r5;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12459);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = new java.lang.IllegalStateException("context or version is null in init");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12459);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r3 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r3, java.lang.String r4, com.bytedance.librarian.LibrarianMonitor r5) {
        /*
            r2 = 12459(0x30ab, float:1.7459E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            java.lang.Object r1 = com.bytedance.librarian.Librarian.f39766d
            monitor-enter(r1)
            java.lang.String r0 = com.bytedance.librarian.Librarian.f39764b     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0011:
            monitor-exit(r1)
            if (r3 == 0) goto L_0x0020
            if (r4 == 0) goto L_0x0020
            com.bytedance.librarian.Librarian.f39763a = r3
            com.bytedance.librarian.Librarian.f39764b = r4
            com.bytedance.librarian.Librarian.f39765c = r5
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0020:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "context or version is null in init"
            r1.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r1
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.Librarian.a(android.content.Context, java.lang.String, com.bytedance.librarian.LibrarianMonitor):void");
    }

    public static void a(String str, boolean z, Context context) {
        MethodCollector.i(12706);
        n.a(context, str, false, true);
        if (z && f39763a == null) {
            f39763a = context;
        }
        LibrarianImpl librarianImpl = LibrarianImpl.f39767a;
        if (librarianImpl != null) {
            librarianImpl.a(str, false);
        } else {
            LibrarianMonitor librarianMonitor = f39765c;
            if (librarianMonitor != null) {
                librarianMonitor.a(str);
            } else {
                System.loadLibrary(str);
            }
        }
        n.a(context, str, false, false);
        MethodCollector.o(12706);
    }
}
