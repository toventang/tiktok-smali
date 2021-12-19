package com.squareup.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.b.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class t {

    /* renamed from: a  reason: collision with root package name */
    static final Handler f58073a = new Handler(Looper.getMainLooper()) {
        /* class com.squareup.b.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36077);
        }

        public final void handleMessage(Message message) {
            boolean z;
            Bitmap a2;
            int i2 = message.what;
            if (i2 != 3) {
                if (i2 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        c cVar = (c) list.get(i3);
                        t tVar = cVar.f58005b;
                        a aVar = cVar.f58014k;
                        List<a> list2 = cVar.f58015l;
                        if (list2 == null || list2.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (aVar != null || z) {
                            Bitmap bitmap = cVar.f58016m;
                            d dVar = cVar.o;
                            if (aVar != null) {
                                tVar.a(bitmap, dVar, aVar);
                            }
                            if (z) {
                                int size2 = list2.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    tVar.a(bitmap, dVar, list2.get(i4));
                                }
                            }
                        }
                    }
                } else if (i2 == 13) {
                    List list3 = (List) message.obj;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        a aVar2 = (a) list3.get(i5);
                        t tVar2 = aVar2.f57955a;
                        if (!p.a(aVar2.f57959e) || (a2 = tVar2.a(aVar2.f57963i)) == null) {
                            tVar2.a(aVar2);
                            if (tVar2.f58085m) {
                                ae.a("Main", "resumed", aVar2.f57956b.a());
                            }
                        } else {
                            tVar2.a(a2, d.MEMORY, aVar2);
                            if (tVar2.f58085m) {
                                ae.a("Main", "completed", aVar2.f57956b.a(), "from " + d.MEMORY);
                            }
                        }
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                a aVar3 = (a) message.obj;
                if (aVar3.f57955a.f58085m) {
                    ae.a("Main", "canceled", aVar3.f57956b.a(), "target got garbage collected");
                }
                aVar3.f57955a.a(aVar3.c());
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    static volatile t f58074b = null;

    /* renamed from: c  reason: collision with root package name */
    public final List<y> f58075c;

    /* renamed from: d  reason: collision with root package name */
    final Context f58076d;

    /* renamed from: e  reason: collision with root package name */
    final i f58077e;

    /* renamed from: f  reason: collision with root package name */
    final d f58078f;

    /* renamed from: g  reason: collision with root package name */
    final aa f58079g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Object, a> f58080h;

    /* renamed from: i  reason: collision with root package name */
    final Map<ImageView, h> f58081i;

    /* renamed from: j  reason: collision with root package name */
    final ReferenceQueue<Object> f58082j;

    /* renamed from: k  reason: collision with root package name */
    final Bitmap.Config f58083k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f58084l;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f58085m;
    boolean n;
    private final c o;
    private final f p;
    private final b q;

    public interface c {
        static {
            Covode.recordClassIndex(36081);
        }
    }

    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f58102a = new f() {
            /* class com.squareup.b.t.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36085);
            }

            @Override // com.squareup.b.t.f
            public final w a(w wVar) {
                return wVar;
            }
        };

        w a(w wVar);

        static {
            Covode.recordClassIndex(36084);
        }
    }

    static {
        Covode.recordClassIndex(36076);
    }

    static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<Object> f58096a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f58097b;

        static {
            Covode.recordClassIndex(36079);
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C1279a aVar = (a.C1279a) this.f58096a.remove(1000);
                    Message obtainMessage = this.f58097b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f57967a;
                        this.f58097b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.f58097b.post(new Runnable() {
                        /* class com.squareup.b.t.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(36080);
                        }

                        public final void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }

        b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f58096a = referenceQueue;
            this.f58097b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    public enum d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        static {
            Covode.recordClassIndex(36082);
        }

        private d(int i2) {
            this.debugColor = i2;
        }
    }

    public enum e {
        LOW,
        NORMAL,
        HIGH;

        static {
            Covode.recordClassIndex(36083);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Context f58086a;

        /* renamed from: b  reason: collision with root package name */
        j f58087b;

        /* renamed from: c  reason: collision with root package name */
        ExecutorService f58088c;

        /* renamed from: d  reason: collision with root package name */
        d f58089d;

        /* renamed from: e  reason: collision with root package name */
        c f58090e;

        /* renamed from: f  reason: collision with root package name */
        f f58091f;

        /* renamed from: g  reason: collision with root package name */
        List<y> f58092g;

        /* renamed from: h  reason: collision with root package name */
        Bitmap.Config f58093h;

        /* renamed from: i  reason: collision with root package name */
        boolean f58094i;

        /* renamed from: j  reason: collision with root package name */
        boolean f58095j;

        static {
            Covode.recordClassIndex(36078);
        }

        public a(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                this.f58086a = applicationContext;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    public final Bitmap a(String str) {
        Bitmap a2 = this.f58078f.a(str);
        if (a2 != null) {
            this.f58079g.a();
        } else {
            this.f58079g.f57970c.sendEmptyMessage(1);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final w a(w wVar) {
        w a2 = this.p.a(wVar);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Request transformer " + this.p.getClass().getCanonicalName() + " returned null for " + wVar);
    }

    public static t a(Context context) {
        MethodCollector.i(3256);
        if (f58074b == null) {
            synchronized (t.class) {
                try {
                    if (f58074b == null) {
                        a aVar = new a(context);
                        Context context2 = aVar.f58086a;
                        if (aVar.f58087b == null) {
                            aVar.f58087b = ae.a(context2);
                        }
                        if (aVar.f58089d == null) {
                            aVar.f58089d = new m(context2);
                        }
                        if (aVar.f58088c == null) {
                            aVar.f58088c = new v();
                        }
                        if (aVar.f58091f == null) {
                            aVar.f58091f = f.f58102a;
                        }
                        aa aaVar = new aa(aVar.f58089d);
                        f58074b = new t(context2, new i(context2, aVar.f58088c, f58073a, aVar.f58087b, aVar.f58089d, aaVar), aVar.f58089d, aVar.f58090e, aVar.f58091f, aVar.f58092g, aaVar, aVar.f58093h, aVar.f58094i, aVar.f58095j);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3256);
                    throw th;
                }
            }
        }
        t tVar = f58074b;
        MethodCollector.o(3256);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        Object c2 = aVar.c();
        if (!(c2 == null || this.f58080h.get(c2) == aVar)) {
            a(c2);
            this.f58080h.put(c2, aVar);
        }
        i iVar = this.f58077e;
        iVar.f58037i.sendMessage(iVar.f58037i.obtainMessage(1, aVar));
    }

    public final void a(Object obj) {
        h remove;
        ae.a();
        a remove2 = this.f58080h.remove(obj);
        if (remove2 != null) {
            remove2.b();
            this.f58077e.a(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f58081i.remove(obj)) != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ImageView imageView, h hVar) {
        this.f58081i.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bitmap bitmap, d dVar, a aVar) {
        if (!aVar.f57966l) {
            if (!aVar.f57965k) {
                this.f58080h.remove(aVar.c());
            }
            if (bitmap == null) {
                aVar.a();
                if (this.f58085m) {
                    ae.a("Main", "errored", aVar.f57956b.a());
                }
            } else if (dVar != null) {
                aVar.a(bitmap, dVar);
                if (this.f58085m) {
                    ae.a("Main", "completed", aVar.f57956b.a(), "from ".concat(String.valueOf(dVar)));
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    private t(Context context, i iVar, d dVar, c cVar, f fVar, List<y> list, aa aaVar, Bitmap.Config config, boolean z, boolean z2) {
        int i2;
        this.f58076d = context;
        this.f58077e = iVar;
        this.f58078f = dVar;
        this.o = cVar;
        this.p = fVar;
        this.f58083k = config;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(i2 + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new o(context));
        arrayList.add(new g(context));
        arrayList.add(new b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f58032d, aaVar));
        this.f58075c = Collections.unmodifiableList(arrayList);
        this.f58079g = aaVar;
        this.f58080h = new WeakHashMap();
        this.f58081i = new WeakHashMap();
        this.f58084l = z;
        this.f58085m = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f58082j = referenceQueue;
        b bVar = new b(referenceQueue, f58073a);
        this.q = bVar;
        bVar.start();
    }
}
