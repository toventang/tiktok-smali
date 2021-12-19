package com.ss.ugc.live.a.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.ugc.live.a.a.b.b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f154000a;

    static {
        Covode.recordClassIndex(102700);
    }

    public c() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 3;
        this.f154000a = g.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    public static class a extends IOException {
        int code;

        static {
            Covode.recordClassIndex(102702);
        }

        public a(String str, int i2) {
            super(str);
            this.code = i2;
        }
    }

    @Override // com.ss.ugc.live.a.a.b.b
    public final void a(final a aVar, final b.a aVar2) {
        if (com.ss.ugc.live.a.a.e.c.a(aVar.f153998a)) {
            aVar2.a(new IllegalArgumentException("request is not valid"), 0);
        } else {
            this.f154000a.submit(new Runnable() {
                /* class com.ss.ugc.live.a.a.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(102701);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
                    r1 = e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
                    r2 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
                    r0 = ((com.ss.ugc.live.a.a.b.c.a) r1).code;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
                    r0 = 0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[Catch:{ all -> 0x0050 }] */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[Catch:{ all -> 0x0050 }] */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[DONT_GENERATE] */
                /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.ss.ugc.live.a.a.b.c r2 = com.ss.ugc.live.a.a.b.c.this
                        com.ss.ugc.live.a.a.b.a r1 = r3
                        com.ss.ugc.live.a.a.b.b$a r4 = r4
                        r0 = 5
                        r3 = 0
                        java.net.HttpURLConnection r2 = r2.a(r1, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0061 }
                        if (r2 == 0) goto L_0x004f
                        java.io.InputStream r3 = r2.getInputStream()     // Catch:{ IOException -> 0x002d }
                        java.lang.String r1 = "Content-Length"
                        r0 = -1
                        int r0 = r2.getHeaderFieldInt(r1, r0)     // Catch:{ IOException -> 0x002d }
                        long r0 = (long) r0     // Catch:{ IOException -> 0x002d }
                        r4.a(r3, r0)     // Catch:{ IOException -> 0x002d }
                        if (r3 == 0) goto L_0x0027
                        r3.close()     // Catch:{ IOException -> 0x0023 }
                        goto L_0x0027
                    L_0x0023:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x0027:
                        if (r2 == 0) goto L_0x004f
                        r2.disconnect()
                        return
                    L_0x002d:
                        r1 = move-exception
                        goto L_0x0031
                    L_0x002f:
                        r1 = move-exception
                        r2 = r3
                    L_0x0031:
                        boolean r0 = r1 instanceof com.ss.ugc.live.a.a.b.c.a     // Catch:{ all -> 0x0050 }
                        if (r0 == 0) goto L_0x003e
                        r0 = r1
                        com.ss.ugc.live.a.a.b.c$a r0 = (com.ss.ugc.live.a.a.b.c.a) r0     // Catch:{ all -> 0x0050 }
                        int r0 = r0.code     // Catch:{ all -> 0x0050 }
                    L_0x003a:
                        r4.a(r1, r0)     // Catch:{ all -> 0x0050 }
                        goto L_0x0040
                    L_0x003e:
                        r0 = 0
                        goto L_0x003a
                    L_0x0040:
                        if (r3 == 0) goto L_0x004a
                        r3.close()     // Catch:{ IOException -> 0x0046 }
                        goto L_0x004a
                    L_0x0046:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x004a:
                        if (r2 == 0) goto L_0x004f
                        r2.disconnect()
                    L_0x004f:
                        return
                    L_0x0050:
                        r1 = move-exception
                        if (r3 == 0) goto L_0x005b
                        r3.close()     // Catch:{ IOException -> 0x0057 }
                        goto L_0x005b
                    L_0x0057:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x005b:
                        if (r2 == 0) goto L_0x0062
                        r2.disconnect()
                        goto L_0x0062
                    L_0x0061:
                        r1 = move-exception
                    L_0x0062:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.a.a.b.c.AnonymousClass1.run():void");
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection a(com.ss.ugc.live.a.a.b.a r8, int r9) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.a.a.b.c.a(com.ss.ugc.live.a.a.b.a, int):java.net.HttpURLConnection");
    }
}
