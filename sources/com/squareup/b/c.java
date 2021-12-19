package com.squareup.b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.squareup.b.j;
import com.squareup.b.r;
import com.squareup.b.t;
import com.squareup.b.y;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class c implements Runnable {
    private static final Object t = new Object();
    private static final ThreadLocal<StringBuilder> u = new ThreadLocal<StringBuilder>() {
        /* class com.squareup.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36045);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger v = new AtomicInteger();
    private static final y w = new y() {
        /* class com.squareup.b.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(36046);
        }

        @Override // com.squareup.b.y
        public final boolean a(w wVar) {
            return true;
        }

        @Override // com.squareup.b.y
        public final y.a b(w wVar) {
            throw new IllegalStateException("Unrecognized type of request: ".concat(String.valueOf(wVar)));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int f58004a = v.incrementAndGet();

    /* renamed from: b  reason: collision with root package name */
    public final t f58005b;

    /* renamed from: c  reason: collision with root package name */
    final i f58006c;

    /* renamed from: d  reason: collision with root package name */
    final d f58007d;

    /* renamed from: e  reason: collision with root package name */
    final aa f58008e;

    /* renamed from: f  reason: collision with root package name */
    public final String f58009f;

    /* renamed from: g  reason: collision with root package name */
    public final w f58010g;

    /* renamed from: h  reason: collision with root package name */
    public final int f58011h;

    /* renamed from: i  reason: collision with root package name */
    int f58012i;

    /* renamed from: j  reason: collision with root package name */
    final y f58013j;

    /* renamed from: k  reason: collision with root package name */
    public a f58014k;

    /* renamed from: l  reason: collision with root package name */
    public List<a> f58015l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f58016m;
    Future<?> n;
    public t.d o;
    public Exception p;
    int q;
    int r;
    public t.e s;

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || i2 > i4 || i3 > i5;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        Future<?> future = this.n;
        if (future == null || !future.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        List<a> list;
        Future<?> future;
        if (this.f58014k != null || (((list = this.f58015l) != null && !list.isEmpty()) || (future = this.n) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(36044);
    }

    public final void run() {
        Throwable th;
        Thread thread;
        String hexString;
        try {
            w wVar = this.f58010g;
            if (wVar.f58115d != null) {
                hexString = String.valueOf(wVar.f58115d.getPath());
            } else {
                hexString = Integer.toHexString(wVar.f58116e);
            }
            StringBuilder sb = u.get();
            sb.ensureCapacity(hexString.length() + 8);
            sb.replace(8, sb.length(), hexString);
            Thread.currentThread().setName(sb.toString());
            if (this.f58005b.f58085m) {
                ae.a("Hunter", "executing", ae.a(this, ""));
            }
            Bitmap c2 = c();
            this.f58016m = c2;
            if (c2 == null) {
                this.f58006c.b(this);
            } else {
                i iVar = this.f58006c;
                iVar.f58037i.sendMessage(iVar.f58037i.obtainMessage(4, this));
            }
        } catch (j.b e2) {
            if (!e2.localCacheOnly || e2.responseCode != 504) {
                this.p = e2;
            }
            this.f58006c.b(this);
        } catch (r.a e3) {
            this.p = e3;
            this.f58006c.a(this);
        } catch (IOException e4) {
            this.p = e4;
            this.f58006c.a(this);
        } catch (OutOfMemoryError e5) {
            StringWriter stringWriter = new StringWriter();
            aa aaVar = this.f58008e;
            ab abVar = new ab(aaVar.f57969b.b(), aaVar.f57969b.a(), aaVar.f57971d, aaVar.f57972e, aaVar.f57973f, aaVar.f57974g, aaVar.f57975h, aaVar.f57976i, aaVar.f57977j, aaVar.f57978k, aaVar.f57979l, aaVar.f57980m, aaVar.n, System.currentTimeMillis());
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            printWriter.println(abVar.f57984a);
            printWriter.print("  Cache Size: ");
            printWriter.println(abVar.f57985b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) abVar.f57985b) / ((float) abVar.f57984a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(abVar.f57986c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(abVar.f57987d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(abVar.f57994k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(abVar.f57988e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(abVar.f57991h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(abVar.f57995l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(abVar.f57989f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(abVar.f57996m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(abVar.f57990g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(abVar.f57992i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(abVar.f57993j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            this.p = new RuntimeException(stringWriter.toString(), e5);
            this.f58006c.b(this);
            thread = Thread.currentThread();
        } catch (Exception e6) {
            this.p = e6;
            this.f58006c.b(this);
        } catch (Throwable th2) {
            th = th2;
        }
        thread = Thread.currentThread();
        thread.setName("Picasso-Idle");
        return;
        Thread.currentThread().setName("Picasso-Idle");
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f0 A[Catch:{ all -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0204 A[Catch:{ all -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020e A[Catch:{ all -> 0x0242 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap c() {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.c.c():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        boolean z = this.f58005b.f58085m;
        w wVar = aVar.f57956b;
        if (this.f58014k == null) {
            this.f58014k = aVar;
            if (z) {
                List<a> list = this.f58015l;
                if (list == null || list.isEmpty()) {
                    ae.a("Hunter", "joined", wVar.a(), "to empty hunter");
                } else {
                    ae.a("Hunter", "joined", wVar.a(), ae.a(this, "to "));
                }
            }
        } else {
            if (this.f58015l == null) {
                this.f58015l = new ArrayList(3);
            }
            this.f58015l.add(aVar);
            if (z) {
                ae.a("Hunter", "joined", wVar.a(), ae.a(this, "to "));
            }
            t.e eVar = aVar.f57956b.r;
            if (eVar.ordinal() > this.s.ordinal()) {
                this.s = eVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r0.remove(r7) != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.squareup.b.a r7) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.c.b(com.squareup.b.a):void");
    }

    private static Bitmap a(List<ac> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final ac acVar = list.get(i2);
            try {
                Bitmap a2 = acVar.a();
                if (a2 == null) {
                    final StringBuilder append = new StringBuilder("Transformation ").append(acVar.b()).append(" returned null after ").append(i2).append(" previous transformation(s).\n\nTransformation list:\n");
                    for (ac acVar2 : list) {
                        append.append(acVar2.b()).append('\n');
                    }
                    t.f58073a.post(new Runnable() {
                        /* class com.squareup.b.c.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(36048);
                        }

                        public final void run() {
                            throw new NullPointerException(append.toString());
                        }
                    });
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    t.f58073a.post(new Runnable() {
                        /* class com.squareup.b.c.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(36049);
                        }

                        public final void run() {
                            throw new IllegalStateException("Transformation " + acVar.b() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                } else if (a2 == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = a2;
                } else {
                    t.f58073a.post(new Runnable() {
                        /* class com.squareup.b.c.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(36050);
                        }

                        public final void run() {
                            throw new IllegalStateException("Transformation " + acVar.b() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e2) {
                t.f58073a.post(new Runnable() {
                    /* class com.squareup.b.c.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(36047);
                    }

                    public final void run() {
                        throw new RuntimeException("Transformation " + acVar.b() + " crashed with exception.", e2);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    static c a(t tVar, i iVar, d dVar, aa aaVar, a aVar) {
        w wVar = aVar.f57956b;
        List<y> list = tVar.f58075c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = list.get(i2);
            if (yVar.a(wVar)) {
                return new c(tVar, iVar, dVar, aaVar, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, aaVar, aVar, w);
    }

    private c(t tVar, i iVar, d dVar, aa aaVar, a aVar, y yVar) {
        this.f58005b = tVar;
        this.f58006c = iVar;
        this.f58007d = dVar;
        this.f58008e = aaVar;
        this.f58014k = aVar;
        this.f58009f = aVar.f57963i;
        this.f58010g = aVar.f57956b;
        this.s = aVar.f57956b.r;
        this.f58011h = aVar.f57959e;
        this.f58012i = aVar.f57960f;
        this.f58013j = yVar;
        this.r = yVar.a();
    }
}
