package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class e implements androidx.work.impl.a {

    /* renamed from: a  reason: collision with root package name */
    static final String f4653a = g.a("SystemAlarmDispatcher");

    /* renamed from: b  reason: collision with root package name */
    final Context f4654b;

    /* renamed from: c  reason: collision with root package name */
    public final g f4655c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.work.impl.b f4656d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4657e;

    /* renamed from: f  reason: collision with root package name */
    final b f4658f;

    /* renamed from: g  reason: collision with root package name */
    final List<Intent> f4659g;

    /* renamed from: h  reason: collision with root package name */
    Intent f4660h;

    /* renamed from: i  reason: collision with root package name */
    b f4661i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f4662j;

    interface b {
        static {
            Covode.recordClassIndex(1834);
        }

        void a();
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f4664a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f4665b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4666c;

        static {
            Covode.recordClassIndex(1833);
        }

        public final void run() {
            this.f4664a.a(this.f4665b, this.f4666c);
        }

        a(e eVar, Intent intent, int i2) {
            this.f4664a = eVar;
            this.f4665b = intent;
            this.f4666c = i2;
        }
    }

    static {
        Covode.recordClassIndex(1831);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f4662j.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f4667a;

        static {
            Covode.recordClassIndex(1835);
        }

        public final void run() {
            e eVar = this.f4667a;
            g.a();
            eVar.b();
            synchronized (eVar.f4659g) {
                if (eVar.f4660h != null) {
                    g.a();
                    com.a.a("Removing command %s", new Object[]{eVar.f4660h});
                    if (eVar.f4659g.remove(0).equals(eVar.f4660h)) {
                        eVar.f4660h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                if (!eVar.f4658f.a() && eVar.f4659g.isEmpty()) {
                    g.a();
                    if (eVar.f4661i != null) {
                        eVar.f4661i.a();
                    }
                } else if (!eVar.f4659g.isEmpty()) {
                    eVar.a();
                }
            }
        }

        c(e eVar) {
            this.f4667a = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        b();
        PowerManager.WakeLock a2 = androidx.work.impl.utils.f.a(this.f4654b, "ProcessCommand");
        try {
            a2.acquire();
            this.f4657e.f4702d.a(new Runnable() {
                /* class androidx.work.impl.background.systemalarm.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1832);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:101:0x03d4, code lost:
                    r3 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:102:0x03d5, code lost:
                    androidx.work.g.a();
                    com.a.a("Releasing operation wake lock (%s) %s", new java.lang.Object[]{r14, r13});
                    r13.release();
                    r15.f4663a.a(new androidx.work.impl.background.systemalarm.e.c(r15.f4663a));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:103:0x03f2, code lost:
                    throw r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
                    androidx.work.g.a();
                    r0 = new java.lang.Throwable[1];
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x03b6, code lost:
                    androidx.work.g.a();
                    com.a.a("Releasing operation wake lock (%s) %s", new java.lang.Object[]{r14, r13});
                    r13.release();
                    r2 = r15.f4663a;
                    r1 = new androidx.work.impl.background.systemalarm.e.c(r15.f4663a);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x03b1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 1015
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.e.AnonymousClass1.run():void");
                }
            });
        } finally {
            a2.release();
        }
    }

    e(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        this.f4662j.post(runnable);
    }

    private boolean a(String str) {
        b();
        synchronized (this.f4659g) {
            for (Intent intent : this.f4659g) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private e(Context context, byte b2) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f4654b = applicationContext;
        this.f4658f = new b(applicationContext);
        this.f4655c = new g();
        f b3 = f.b();
        this.f4657e = b3;
        androidx.work.impl.b bVar = b3.f4704f;
        this.f4656d = bVar;
        bVar.a(this);
        this.f4659g = new ArrayList();
        this.f4660h = null;
        this.f4662j = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        Intent intent = new Intent(this.f4654b, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        a(new a(this, intent, 0));
    }

    public final boolean a(Intent intent, int i2) {
        g.a();
        boolean z = false;
        com.a.a("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)});
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            g.a();
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.f4659g) {
                if (!this.f4659g.isEmpty()) {
                    z = true;
                }
                this.f4659g.add(intent);
                if (!z) {
                    a();
                }
            }
            return true;
        }
    }
}
