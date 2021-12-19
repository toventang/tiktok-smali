package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.ac;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.common.internal.r;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    private static x f54491c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f54492a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f54493b;

    /* renamed from: d  reason: collision with root package name */
    private a f54494d = new a(this, (byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private int f54495e = 1;

    static {
        Covode.recordClassIndex(33821);
    }

    public static class e extends Exception {
        private final int errorCode;

        static {
            Covode.recordClassIndex(33826);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public e(int i2, String str) {
            super(str);
            this.errorCode = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        int f54496a;

        /* renamed from: b  reason: collision with root package name */
        final Messenger f54497b;

        /* renamed from: c  reason: collision with root package name */
        b f54498c;

        /* renamed from: d  reason: collision with root package name */
        final Queue<d<?>> f54499d;

        /* renamed from: e  reason: collision with root package name */
        final SparseArray<d<?>> f54500e;

        static {
            Covode.recordClassIndex(33822);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            x.this.f54493b.execute(new ab(this));
        }

        /* access modifiers changed from: package-private */
        public final synchronized void c() {
            MethodCollector.i(14262);
            if (this.f54496a == 1) {
                a(1, "Timed out while binding");
            }
            MethodCollector.o(14262);
        }

        /* access modifiers changed from: package-private */
        public final synchronized void b() {
            MethodCollector.i(14261);
            if (this.f54496a == 2 && this.f54499d.isEmpty() && this.f54500e.size() == 0) {
                this.f54496a = 3;
                com.google.android.gms.common.stats.a.a();
                x.this.f54492a.unbindService(this);
            }
            MethodCollector.o(14261);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            x.this.f54493b.execute(new ac(this));
        }

        private a() {
            this.f54497b = new Messenger(new com.google.android.gms.internal.f.d(Looper.getMainLooper(), new y(this)));
            this.f54499d = new ArrayDeque();
            this.f54500e = new SparseArray<>();
        }

        private void a(e eVar) {
            for (d<?> dVar : this.f54499d) {
                dVar.a(eVar);
            }
            this.f54499d.clear();
            for (int i2 = 0; i2 < this.f54500e.size(); i2++) {
                this.f54500e.valueAt(i2).a(eVar);
            }
            this.f54500e.clear();
        }

        /* access modifiers changed from: package-private */
        public final synchronized void a(int i2) {
            MethodCollector.i(14297);
            d<?> dVar = this.f54500e.get(i2);
            if (dVar != null) {
                this.f54500e.remove(i2);
                dVar.a(new e(3, "Timed out waiting for response"));
                b();
            }
            MethodCollector.o(14297);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r2 = r7.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r2.getBoolean("unsupported", false) == false) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            r4.a(new com.google.firebase.iid.x.e(4, "Not supported by GmsCore"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(14197);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
            r4.a(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.os.Message r7) {
            /*
                r6 = this;
                r5 = 14197(0x3775, float:1.9894E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                int r1 = r7.arg1
                monitor-enter(r6)
                android.util.SparseArray<com.google.firebase.iid.x$d<?>> r0 = r6.f54500e     // Catch:{ all -> 0x0041 }
                java.lang.Object r4 = r0.get(r1)     // Catch:{ all -> 0x0041 }
                com.google.firebase.iid.x$d r4 = (com.google.firebase.iid.x.d) r4     // Catch:{ all -> 0x0041 }
                r3 = 1
                if (r4 != 0) goto L_0x0018
                monitor-exit(r6)     // Catch:{ all -> 0x0041 }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r3
            L_0x0018:
                android.util.SparseArray<com.google.firebase.iid.x$d<?>> r0 = r6.f54500e
                r0.remove(r1)
                r6.b()
                monitor-exit(r6)
                android.os.Bundle r2 = r7.getData()
                java.lang.String r1 = "unsupported"
                r0 = 0
                boolean r0 = r2.getBoolean(r1, r0)
                if (r0 == 0) goto L_0x003d
                com.google.firebase.iid.x$e r2 = new com.google.firebase.iid.x$e
                r1 = 4
                java.lang.String r0 = "Not supported by GmsCore"
                r2.<init>(r1, r0)
                r4.a(r2)
            L_0x0039:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r3
            L_0x003d:
                r4.a(r2)
                goto L_0x0039
            L_0x0041:
                r0 = move-exception
                monitor-exit(r6)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.x.a.a(android.os.Message):boolean");
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean a(d<?> dVar) {
            boolean z;
            MethodCollector.i(14127);
            int i2 = this.f54496a;
            if (i2 == 0) {
                this.f54499d.add(dVar);
                if (this.f54496a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                r.a(z);
                this.f54496a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                com.google.android.gms.common.stats.a.a();
                if (!com.google.android.gms.common.stats.a.b(x.this.f54492a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    x.this.f54493b.schedule(new z(this), 30, TimeUnit.SECONDS);
                }
                MethodCollector.o(14127);
                return true;
            } else if (i2 == 1) {
                this.f54499d.add(dVar);
                MethodCollector.o(14127);
                return true;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f54496a).toString());
                        MethodCollector.o(14127);
                        throw illegalStateException;
                    }
                }
                MethodCollector.o(14127);
                return false;
            } else {
                this.f54499d.add(dVar);
                a();
                MethodCollector.o(14127);
                return true;
            }
        }

        /* synthetic */ a(x xVar, byte b2) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            x.this.f54493b.execute(new aa(this, iBinder));
        }

        /* access modifiers changed from: package-private */
        public final synchronized void a(int i2, String str) {
            MethodCollector.i(14227);
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Disconnected: ".concat(valueOf);
                } else {
                    new String("Disconnected: ");
                }
            }
            int i3 = this.f54496a;
            if (i3 == 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                MethodCollector.o(14227);
                throw illegalStateException;
            } else if (i3 == 1 || i3 == 2) {
                this.f54496a = 4;
                com.google.android.gms.common.stats.a.a();
                x.this.f54492a.unbindService(this);
                a(new e(i2, str));
                MethodCollector.o(14227);
            } else if (i3 == 3) {
                this.f54496a = 4;
                MethodCollector.o(14227);
            } else if (i3 == 4) {
                MethodCollector.o(14227);
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f54496a).toString());
                MethodCollector.o(14227);
                throw illegalStateException2;
            }
        }
    }

    public final synchronized int a() {
        int i2;
        MethodCollector.i(13193);
        i2 = this.f54495e;
        this.f54495e = i2 + 1;
        MethodCollector.o(13193);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public static abstract class d<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f54504a;

        /* renamed from: b  reason: collision with root package name */
        final i<T> f54505b = new i<>();

        /* renamed from: c  reason: collision with root package name */
        final int f54506c;

        /* renamed from: d  reason: collision with root package name */
        final Bundle f54507d;

        static {
            Covode.recordClassIndex(33825);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Bundle bundle);

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        public String toString() {
            int i2 = this.f54506c;
            int i3 = this.f54504a;
            return new StringBuilder(55).append("Request { what=").append(i2).append(" id=").append(i3).append(" oneWay=").append(a()).append("}").toString();
        }

        /* access modifiers changed from: package-private */
        public final void a(e eVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(eVar);
                String.valueOf(valueOf).length();
                String.valueOf(valueOf2).length();
            }
            this.f54505b.a(eVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                String.valueOf(valueOf).length();
                String.valueOf(valueOf2).length();
            }
            this.f54505b.a(t);
        }

        d(int i2, int i3, Bundle bundle) {
            this.f54504a = i2;
            this.f54506c = i3;
            this.f54507d = bundle;
        }
    }

    static class f extends d<Bundle> {
        static {
            Covode.recordClassIndex(33827);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.x.d
        public final boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.x.d
        public final void a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("data");
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            a((Object) bundle2);
        }

        f(int i2, Bundle bundle) {
            super(i2, 1, bundle);
        }
    }

    public final h<Bundle> a(Bundle bundle) {
        return a(new f(a(), bundle));
    }

    public static class c extends d<Void> {
        static {
            Covode.recordClassIndex(33824);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.x.d
        public final boolean a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.x.d
        public final void a(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                a((Object) null);
            } else {
                a(new e(4, "Invalid response to one way request"));
            }
        }

        public c(int i2, Bundle bundle) {
            super(i2, 2, bundle);
        }
    }

    public static synchronized x a(Context context) {
        x xVar;
        synchronized (x.class) {
            MethodCollector.i(13109);
            if (f54491c == null) {
                f54491c = new x(context, com.google.android.gms.internal.f.a.f50599a.a(new com.google.android.gms.common.util.a.b("MessengerIpcClient")));
            }
            xVar = f54491c;
            MethodCollector.o(13109);
        }
        return xVar;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final Messenger f54502a;

        /* renamed from: b  reason: collision with root package name */
        final FirebaseIidMessengerCompat f54503b;

        static {
            Covode.recordClassIndex(33823);
        }

        b(IBinder iBinder) {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.f54502a = new Messenger(iBinder);
                this.f54503b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f54503b = new FirebaseIidMessengerCompat(iBinder);
                this.f54502a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                if (valueOf.length() != 0) {
                    "Invalid interface descriptor: ".concat(valueOf);
                } else {
                    new String("Invalid interface descriptor: ");
                }
                throw new RemoteException();
            }
        }
    }

    public final synchronized <T> h<T> a(d<T> dVar) {
        ac<TResult> acVar;
        MethodCollector.i(13192);
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(String.valueOf(dVar)).length();
        }
        if (!this.f54494d.a((d<?>) dVar)) {
            a aVar = new a(this, (byte) 0);
            this.f54494d = aVar;
            aVar.a((d<?>) dVar);
        }
        acVar = dVar.f54505b.f49902a;
        MethodCollector.o(13192);
        return acVar;
    }

    private x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f54493b = scheduledExecutorService;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f54492a = applicationContext;
    }
}
