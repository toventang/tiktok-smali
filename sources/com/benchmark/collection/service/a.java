package com.benchmark.collection.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.benchmark.c;
import com.benchmark.collection.c;
import com.benchmark.d;
import com.benchmark.tools.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f6170h;

    /* renamed from: a  reason: collision with root package name */
    public c f6171a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6172b;

    /* renamed from: c  reason: collision with root package name */
    public b f6173c;

    /* renamed from: d  reason: collision with root package name */
    public BinderC0082a f6174d = new BinderC0082a(this, (byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public c.a f6175e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBenchProcessInterface f6176f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f6177g = false;

    static {
        Covode.recordClassIndex(2991);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(10551);
            if (f6170h == null) {
                f6170h = new a();
            }
            aVar = f6170h;
            MethodCollector.o(10551);
        }
        return aVar;
    }

    /* renamed from: com.benchmark.collection.service.a$a  reason: collision with other inner class name */
    public class BinderC0082a extends d.a {
        static {
            Covode.recordClassIndex(2992);
        }

        private BinderC0082a() {
        }

        @Override // com.benchmark.d
        public final void a(String str) {
            if (com.benchmark.a.c.f6028a != null) {
                com.benchmark.a.c.f6028a.a(new RuntimeException(str));
            }
        }

        /* synthetic */ BinderC0082a(a aVar, byte b2) {
            this();
        }

        @Override // com.benchmark.d
        public final void a(String str, String str2) {
            com.benchmark.a.a.a(str, str2);
        }

        @Override // com.benchmark.d
        public final void a(int i2, String str) {
            if (a.this.f6175e != null) {
                a.this.f6175e.a(i2, str);
            }
        }

        @Override // com.benchmark.d
        public final void a(int i2, int i3, String str) {
            if (a.this.f6175e != null) {
                a.this.f6175e.a(i2, i3, str);
            }
        }
    }

    public class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public String f6179a;

        /* renamed from: b  reason: collision with root package name */
        public int f6180b;

        /* renamed from: c  reason: collision with root package name */
        public String f6181c;

        /* renamed from: e  reason: collision with root package name */
        private BinderC0082a f6183e;

        static {
            Covode.recordClassIndex(2993);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            a.this.f6171a = null;
            if (a.this.f6175e != null) {
                a.this.f6175e.a(104, -1, "onServiceDisconnected");
            }
        }

        public b(BinderC0082a aVar) {
            this.f6183e = aVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.benchmark.c aVar;
            a aVar2 = a.this;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBTCManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof com.benchmark.c)) {
                    aVar = new c.a.C0081a(iBinder);
                } else {
                    aVar = (com.benchmark.c) queryLocalInterface;
                }
            }
            aVar2.f6171a = aVar;
            if (a.this.f6171a != null) {
                l.a(new Callable<Void>() {
                    /* class com.benchmark.collection.service.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(2994);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() {
                        if (a.this.f6171a == null) {
                            return null;
                        }
                        try {
                            if (b.this.f6179a == null) {
                                return null;
                            }
                            a.this.f6171a.a(b.this.f6180b, b.this.f6181c, b.this.f6179a, a.this.f6174d);
                            return null;
                        } catch (RemoteException e2) {
                            com.benchmark.a.c.a(e2);
                            return null;
                        }
                    }
                }, l.f6393a);
            } else if (a.this.f6175e != null) {
                a.this.f6175e.a(101, -1, "init start failed");
            }
        }
    }

    public final int a(c.a aVar) {
        String str;
        Context context = com.benchmark.c.b.f6095l.f6096a;
        this.f6172b = context;
        if (context == null) {
            return -1;
        }
        this.f6176f = new ByteBenchProcessInterface();
        String str2 = "";
        if (!com.benchmark.collection.b.f6115a.f6116b.f6112e) {
            try {
                Context context2 = this.f6172b;
                if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107194b = context2.getCacheDir();
                }
                File file = com.ss.android.ugc.aweme.lancet.d.f107194b;
                if (file != null) {
                    str = file.getPath();
                } else {
                    str = str2;
                }
                Context context3 = this.f6172b;
                if (com.ss.android.ugc.aweme.lancet.d.f107193a == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107193a = context3.getExternalCacheDir();
                }
                File file2 = com.ss.android.ugc.aweme.lancet.d.f107193a;
                if (file2 != null) {
                    str2 = file2.getPath();
                }
            } catch (Exception unused) {
                return -104;
            }
        } else {
            str = str2;
            str2 = str;
        }
        int init = this.f6176f.init(com.benchmark.collection.b.f6115a.f6116b.f6110c, str, str2, this.f6172b.getApplicationInfo().nativeLibraryDir, this.f6172b);
        if (init < 0) {
            return init;
        }
        this.f6176f.setByteBenchCallback(this.f6174d);
        this.f6175e = aVar;
        return 0;
    }
}
