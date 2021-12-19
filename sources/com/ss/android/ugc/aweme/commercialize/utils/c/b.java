package com.ss.android.ugc.aweme.commercialize.utils.c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.abtest.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.commercialize.o.b> f75747a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f75748b;

    /* renamed from: c  reason: collision with root package name */
    public a f75749c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    int f75750d;

    /* renamed from: e  reason: collision with root package name */
    long f75751e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.o.a f75752f = a.f75746a;

    public static final class a extends Handler {

        /* renamed from: c  reason: collision with root package name */
        public static final C1726a f75753c = new C1726a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public long f75754a = 1000;

        /* renamed from: b  reason: collision with root package name */
        public final b f75755b;

        static {
            Covode.recordClassIndex(46726);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b$a$a  reason: collision with other inner class name */
        public static final class C1726a {
            static {
                Covode.recordClassIndex(46727);
            }

            private C1726a() {
            }

            public /* synthetic */ C1726a(byte b2) {
                this();
            }
        }

        public final void a() {
            if (!hasMessages(1)) {
                sendEmptyMessage(1);
            }
        }

        public final void b() {
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }

        public a(b bVar) {
            l.d(bVar, "");
            this.f75755b = bVar;
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            if (message.what == 1) {
                b bVar = this.f75755b;
                long d2 = bVar.d();
                if (!bVar.f75747a.isEmpty()) {
                    if (d.f73632b) {
                        if (bVar.f75748b != bVar.f75750d + 1 || d2 < bVar.f75751e) {
                            bVar.f75750d = bVar.f75748b;
                            bVar.f75751e = d2;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (com.ss.android.ugc.aweme.commercialize.o.b bVar2 : bVar.f75747a) {
                        if ((bVar.f75748b == bVar2.f74920a && d2 >= ((long) bVar2.f74921b)) || bVar.f75748b > bVar2.f74920a) {
                            try {
                                Runnable runnable = bVar2.f74924e;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                if (!bVar2.f74925f) {
                                    bVar2.f74924e = null;
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            if (!bVar2.f74925f) {
                                arrayList.add(bVar2);
                            } else {
                                bVar2.f74920a++;
                            }
                        }
                    }
                    bVar.f75747a.removeAll(arrayList);
                }
                sendEmptyMessageDelayed(1, this.f75754a);
            }
        }
    }

    static {
        Covode.recordClassIndex(46725);
    }

    public final long d() {
        return this.f75752f.a();
    }

    public final void a() {
        this.f75747a.clear();
        this.f75749c.b();
        this.f75749c.f75754a = 1000;
    }

    public final void b() {
        this.f75748b = 0;
        this.f75750d = 0;
        this.f75751e = 0;
        if (!this.f75747a.isEmpty()) {
            this.f75749c.a();
        }
    }

    public final void c() {
        this.f75748b++;
        if (this.f75747a.isEmpty()) {
            this.f75749c.b();
        }
    }

    public final void a(long j2) {
        this.f75749c.f75754a = j2;
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.o.a aVar) {
        l.d(aVar, "");
        this.f75752f = aVar;
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.o.b bVar) {
        l.d(bVar, "");
        if (!this.f75747a.contains(bVar)) {
            this.f75747a.add(bVar);
        }
    }
}
