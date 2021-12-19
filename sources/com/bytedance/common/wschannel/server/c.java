package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f27339a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends com.bytedance.common.wschannel.client.a> f27340b;

    public interface b {
        static {
            Covode.recordClassIndex(16088);
        }

        void a();

        void a(Intent intent);
    }

    static {
        Covode.recordClassIndex(16086);
    }

    /* renamed from: com.bytedance.common.wschannel.server.c$c  reason: collision with other inner class name */
    class C0585c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27343a;

        /* renamed from: b  reason: collision with root package name */
        public Messenger f27344b;

        /* renamed from: c  reason: collision with root package name */
        public ServiceConnection f27345c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27346d = false;

        /* renamed from: e  reason: collision with root package name */
        public final Object f27347e = new Object();

        /* renamed from: f  reason: collision with root package name */
        final AtomicInteger f27348f = new AtomicInteger(0);

        /* renamed from: h  reason: collision with root package name */
        private final LinkedBlockingDeque<Intent> f27350h = new LinkedBlockingDeque<>();

        /* renamed from: i  reason: collision with root package name */
        private final Runnable f27351i = new Runnable() {
            /* class com.bytedance.common.wschannel.server.c.C0585c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16090);
            }

            public final void run() {
                MethodCollector.i(6205);
                synchronized (C0585c.this.f27347e) {
                    try {
                        if (C0585c.this.f27346d) {
                            C0585c.this.f27346d = false;
                        }
                    } finally {
                        MethodCollector.o(6205);
                    }
                }
            }
        };

        /* renamed from: j  reason: collision with root package name */
        private final Runnable f27352j = new Runnable() {
            /* class com.bytedance.common.wschannel.server.c.C0585c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16091);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:7)|8|9|10) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(6269);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    r3 = 6269(0x187d, float:8.785E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this
                    java.lang.Object r2 = r0.f27347e
                    monitor-enter(r2)
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x002b }
                    android.content.ServiceConnection r0 = r0.f27345c     // Catch:{ all -> 0x002b }
                    if (r0 == 0) goto L_0x002b
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x002b }
                    android.content.Context r1 = r0.f27343a     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c r0 = com.bytedance.common.wschannel.server.c.this     // Catch:{ all -> 0x002b }
                    java.lang.Class<? extends com.bytedance.common.wschannel.client.a> r0 = r0.f27340b     // Catch:{ all -> 0x002b }
                    boolean r0 = com.bytedance.common.wschannel.e.d.a(r1, r0)     // Catch:{ all -> 0x002b }
                    if (r0 == 0) goto L_0x002b
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x002b }
                    android.content.Context r1 = r0.f27343a     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x002b }
                    android.content.ServiceConnection r0 = r0.f27345c     // Catch:{ all -> 0x002b }
                    r1.unbindService(r0)     // Catch:{ all -> 0x002b }
                L_0x002b:
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x0039 }
                    r1 = 0
                    r0.f27345c = r1     // Catch:{ all -> 0x0039 }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.c.C0585c.this     // Catch:{ all -> 0x0039 }
                    r0.f27344b = r1     // Catch:{ all -> 0x0039 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0039 }
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                    return
                L_0x0039:
                    r0 = move-exception
                    monitor-exit(r2)
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.c.C0585c.AnonymousClass2.run():void");
            }
        };

        static {
            Covode.recordClassIndex(16089);
        }

        public final void c() {
            g.a();
            g.f27215a.removeCallbacks(this.f27351i);
        }

        public final void d() {
            try {
                g.a();
                g.f27215a.removeCallbacks(this.f27352j);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        private void f() {
            c();
            g.a();
            g.f27215a.postDelayed(this.f27351i, TimeUnit.SECONDS.toMillis(7));
        }

        private void e() {
            Logger.debug();
            try {
                a(this.f27343a, new Intent(this.f27343a, c.this.f27340b));
            } catch (Throwable unused) {
            }
            try {
                this.f27345c = new a(this, (byte) 0);
                a(this.f27343a, new Intent(this.f27343a, c.this.f27340b), this.f27345c);
                f();
                this.f27346d = true;
            } catch (Throwable unused2) {
                c();
                this.f27346d = false;
            }
        }

        private synchronized void g() {
            MethodCollector.i(6377);
            d();
            g.a();
            g.f27215a.postDelayed(this.f27352j, TimeUnit.SECONDS.toMillis(10));
            MethodCollector.o(6377);
        }

        @Override // com.bytedance.common.wschannel.server.c.b
        public final void a() {
            MethodCollector.i(6353);
            if (this.f27350h.size() <= 0 || this.f27344b != null) {
                MethodCollector.o(6353);
                return;
            }
            synchronized (this.f27347e) {
                try {
                    if (this.f27350h.size() > 0 && this.f27344b == null) {
                        e();
                    }
                } finally {
                    MethodCollector.o(6353);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            r2.f27344b = null;
            r2.f27350h.offerFirst(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:3:0x0008 A[Catch:{ all -> 0x0023 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r2 = this;
            L_0x0000:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f27350h     // Catch:{ all -> 0x0023 }
                java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x0020
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f27350h     // Catch:{ all -> 0x0023 }
                java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x0023 }
                android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0013
                goto L_0x0017
            L_0x0013:
                r2.b(r1)     // Catch:{ DeadObjectException -> 0x0018, all -> 0x0000 }
                goto L_0x0000
            L_0x0017:
                return
            L_0x0018:
                r0 = 0
                r2.f27344b = r0
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f27350h
                r0.offerFirst(r1)
            L_0x0020:
                r2.g()
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.c.C0585c.b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.common.wschannel.server.c$c$a */
        public class a implements ServiceConnection {
            static {
                Covode.recordClassIndex(16092);
            }

            private a() {
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                MethodCollector.i(6976);
                Logger.debug();
                synchronized (C0585c.this.f27347e) {
                    if (componentName == null) {
                        MethodCollector.o(6976);
                        return;
                    }
                    try {
                        C0585c.this.f27344b = null;
                        C0585c.this.f27345c = null;
                        C0585c.this.f27346d = false;
                        C0585c.this.d();
                        C0585c.this.c();
                    } finally {
                        MethodCollector.o(6976);
                    }
                }
            }

            /* synthetic */ a(C0585c cVar, byte b2) {
                this();
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                MethodCollector.i(7035);
                Logger.debug();
                synchronized (C0585c.this.f27347e) {
                    try {
                        C0585c.this.c();
                        if (componentName != null) {
                            if (iBinder != null) {
                                try {
                                    C0585c.this.f27344b = new Messenger(iBinder);
                                    C0585c.this.b();
                                } catch (Throwable unused) {
                                }
                                C0585c.this.f27346d = false;
                                MethodCollector.o(7035);
                            }
                        }
                    } finally {
                        MethodCollector.o(7035);
                    }
                }
            }
        }

        private void b(Intent intent) {
            if (intent != null) {
                Logger.debug();
                Messenger messenger = this.f27344b;
                Message message = new Message();
                message.what = 10123;
                message.getData().putParcelable("DATA_INTENT", intent);
                if (messenger != null) {
                    messenger.send(message);
                }
            }
        }

        @Override // com.bytedance.common.wschannel.server.c.b
        public final void a(Intent intent) {
            MethodCollector.i(6347);
            if (intent == null) {
                MethodCollector.o(6347);
                return;
            }
            if (Logger.debug()) {
                intent.putExtra("msg_count", this.f27348f.addAndGet(1));
            }
            synchronized (this.f27347e) {
                try {
                    d();
                    this.f27350h.offer(intent);
                    if (this.f27344b != null) {
                        b();
                    } else if (!this.f27346d) {
                        e();
                    } else {
                        return;
                    }
                    MethodCollector.o(6347);
                } finally {
                    MethodCollector.o(6347);
                }
            }
        }

        C0585c(Context context) {
            this.f27343a = context;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.c.C0585c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        private static boolean a(Context context, Intent intent, ServiceConnection serviceConnection) {
            if (context == null || !(context instanceof Context)) {
                return context.bindService(intent, serviceConnection, 1);
            }
            if (d.a(context, intent)) {
                return true;
            }
            return context.bindService(intent, serviceConnection, 1);
        }
    }

    public final void a(Intent intent) {
        this.f27339a.a(intent);
    }

    class a implements b {

        /* renamed from: b  reason: collision with root package name */
        private final Context f27342b;

        static {
            Covode.recordClassIndex(16087);
        }

        @Override // com.bytedance.common.wschannel.server.c.b
        public final void a() {
        }

        @Override // com.bytedance.common.wschannel.server.c.b
        public final void a(Intent intent) {
            try {
                intent.setComponent(new ComponentName(this.f27342b, c.this.f27340b));
                a(this.f27342b, intent);
            } catch (Throwable unused) {
            }
        }

        a(Context context) {
            this.f27342b = context;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.c.a.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }
    }

    public c(Context context, Class<? extends com.bytedance.common.wschannel.client.a> cls) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            this.f27339a = new a(context);
        } else {
            this.f27339a = new C0585c(context);
        }
        this.f27340b = cls;
    }
}
