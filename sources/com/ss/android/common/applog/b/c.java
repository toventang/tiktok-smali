package com.ss.android.common.applog.b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.t;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: k  reason: collision with root package name */
    private static volatile c f59205k;
    private static volatile a n;

    /* renamed from: a  reason: collision with root package name */
    public boolean f59206a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59207b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f59208c = true;

    /* renamed from: d  reason: collision with root package name */
    public long f59209d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public d f59210e;

    /* renamed from: f  reason: collision with root package name */
    public b f59211f;

    /* renamed from: g  reason: collision with root package name */
    public final List<d> f59212g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f59213h = false;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f59214i = new Runnable() {
        /* class com.ss.android.common.applog.b.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(36609);
        }

        public final void run() {
            if (c.this.f59210e != null) {
                if (c.this.f59213h) {
                    c.this.f59211f.a(c.this.f59210e);
                } else {
                    c.this.f59212g.add(c.this.f59210e);
                }
                c.this.f59210e = null;
                c.this.f59211f.a("");
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f59215j = new Runnable() {
        /* class com.ss.android.common.applog.b.c.AnonymousClass4 */

        static {
            Covode.recordClassIndex(36610);
        }

        public final void run() {
            c.this.f59213h = true;
            for (d dVar : new ArrayList(c.this.f59212g)) {
                c.this.f59211f.a(dVar);
            }
            c.this.f59212g.clear();
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private Handler f59216l;

    /* renamed from: m  reason: collision with root package name */
    private Context f59217m;

    static {
        Covode.recordClassIndex(36606);
    }

    public final void c() {
        d().removeMessages(1);
    }

    public final void b() {
        this.f59206a = false;
        this.f59212g.clear();
        this.f59213h = false;
    }

    private Handler d() {
        MethodCollector.i(6110);
        if (this.f59216l == null) {
            synchronized (this) {
                try {
                    if (this.f59216l == null) {
                        this.f59216l = new Handler(t.a().getLooper()) {
                            /* class com.ss.android.common.applog.b.c.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(36607);
                            }

                            public final void handleMessage(Message message) {
                                boolean equals;
                                super.handleMessage(message);
                                boolean z = true;
                                if (message.what == 1) {
                                    if (c.this.f59210e != null) {
                                        Object obj = message.obj;
                                        if (obj instanceof String) {
                                            String str = (String) obj;
                                            String str2 = c.this.f59210e.f59232b;
                                            if (str != null) {
                                                equals = str.equals(str2);
                                            } else if (str2 == null) {
                                                equals = true;
                                            } else {
                                                equals = false;
                                            }
                                            if (!c.this.f59208c || !c.this.f59207b) {
                                                z = false;
                                            }
                                            if (equals && z) {
                                                c.this.f59210e.f59237g = System.currentTimeMillis();
                                                c.this.f59211f.b(c.this.f59210e);
                                                c.this.a(str);
                                                c.this.a();
                                                return;
                                            }
                                        }
                                    }
                                    c.this.f59211f.a("");
                                    c.this.a();
                                }
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6110);
                    throw th;
                }
            }
        }
        Handler handler = this.f59216l;
        MethodCollector.o(6110);
        return handler;
    }

    public final void a() {
        boolean a2 = n.a();
        if (this.f59207b == a2) {
            return;
        }
        if (a2) {
            final long currentTimeMillis = System.currentTimeMillis();
            t.a().a(new Runnable() {
                /* class com.ss.android.common.applog.b.c.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(36613);
                }

                public final void run() {
                    if (!c.this.f59207b) {
                        c.this.f59207b = true;
                        if (c.this.f59208c) {
                            c.this.f59206a = true;
                            if (c.this.f59210e == null) {
                                c.this.f59210e = new d(currentTimeMillis);
                                c.this.f59211f.a("");
                                c cVar = c.this;
                                cVar.a(cVar.f59210e.f59232b);
                                return;
                            }
                            long j2 = currentTimeMillis - c.this.f59210e.f59237g;
                            if (j2 <= 15000) {
                                t.a().c(c.this.f59214i);
                                c.this.f59210e.f59238h += j2;
                                c.this.f59210e.f59237g = currentTimeMillis;
                                c.this.f59211f.b(c.this.f59210e);
                                c cVar2 = c.this;
                                cVar2.a(cVar2.f59210e.f59232b);
                                return;
                            }
                            t.a().c(c.this.f59214i);
                            c.this.f59214i.run();
                            c.this.f59210e = new d(currentTimeMillis);
                            c.this.f59211f.a("");
                            c cVar3 = c.this;
                            cVar3.a(cVar3.f59210e.f59232b);
                        }
                    }
                }
            });
            return;
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        t.a().a(new Runnable() {
            /* class com.ss.android.common.applog.b.c.AnonymousClass5 */

            static {
                Covode.recordClassIndex(36611);
            }

            public final void run() {
                if (c.this.f59207b) {
                    c.this.f59207b = false;
                    if (c.this.f59208c && c.this.f59210e != null) {
                        c.this.f59210e.f59237g = currentTimeMillis2;
                        t.a().a(c.this.f59214i, 15000);
                        c.this.f59211f.b(c.this.f59210e);
                        c.this.c();
                    }
                }
            }
        });
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final void a(String str) {
        Handler d2 = d();
        d2.removeMessages(1);
        d2.sendMessageDelayed(Message.obtain(d2, 1, str), 5000);
    }

    private c(Context context) {
        this.f59217m = b(context);
        this.f59211f = new b(context);
    }

    public static c a(Context context) {
        MethodCollector.i(6124);
        if (f59205k == null) {
            synchronized (c.class) {
                try {
                    if (f59205k == null) {
                        f59205k = new c(b(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6124);
                    throw th;
                }
            }
        }
        c cVar = f59205k;
        MethodCollector.o(6124);
        return cVar;
    }
}
