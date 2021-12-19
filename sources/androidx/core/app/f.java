package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class f extends Service {
    static final HashMap<ComponentName, h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<d> mCompatQueue;
    h mCompatWorkEnqueuer;
    a mCurProcessor;
    boolean mDestroyed;
    public boolean mInterruptIfStopped;
    b mJobImpl;
    public boolean mStopped;

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(663);
        }

        IBinder a();

        e b();
    }

    /* access modifiers changed from: package-private */
    public interface e {
        static {
            Covode.recordClassIndex(666);
        }

        Intent a();

        void b();
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final Intent f2144a;

        /* renamed from: b  reason: collision with root package name */
        final int f2145b;

        static {
            Covode.recordClassIndex(665);
        }

        @Override // androidx.core.app.f.e
        public final Intent a() {
            return this.f2144a;
        }

        @Override // androidx.core.app.f.e
        public final void b() {
            f.this.stopSelf(this.f2145b);
        }

        d(Intent intent, int i2) {
            this.f2144a = intent;
            this.f2145b = i2;
        }
    }

    /* renamed from: androidx.core.app.f$f  reason: collision with other inner class name */
    static final class job.JobServiceEngineC0027f extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final f f2147a;

        /* renamed from: b  reason: collision with root package name */
        final Object f2148b = new Object();

        /* renamed from: c  reason: collision with root package name */
        JobParameters f2149c;

        static {
            Covode.recordClassIndex(667);
        }

        /* renamed from: androidx.core.app.f$f$a */
        final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f2150a;

            static {
                Covode.recordClassIndex(668);
            }

            @Override // androidx.core.app.f.e
            public final Intent a() {
                return this.f2150a.getIntent();
            }

            @Override // androidx.core.app.f.e
            public final void b() {
                synchronized (job.JobServiceEngineC0027f.this.f2148b) {
                    if (job.JobServiceEngineC0027f.this.f2149c != null) {
                        job.JobServiceEngineC0027f.this.f2149c.completeWork(this.f2150a);
                    }
                }
            }

            a(JobWorkItem jobWorkItem) {
                this.f2150a = jobWorkItem;
            }
        }

        @Override // androidx.core.app.f.b
        public final IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r2.getIntent().setExtrasClassLoader(r4.f2147a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.f.job.JobServiceEngineC0027f.a(r4, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r2 == null) goto L_0x0024;
         */
        @Override // androidx.core.app.f.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.core.app.f.e b() {
            /*
                r4 = this;
                java.lang.Object r3 = r4.f2148b
                monitor-enter(r3)
                android.app.job.JobParameters r1 = r4.f2149c     // Catch:{ all -> 0x0025 }
                r0 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return r0
            L_0x000a:
                android.app.job.JobWorkItem r2 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r2 == 0) goto L_0x0024
                android.content.Intent r1 = r2.getIntent()
                androidx.core.app.f r0 = r4.f2147a
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r1.setExtrasClassLoader(r0)
                androidx.core.app.f$f$a r0 = new androidx.core.app.f$f$a
                r0.<init>(r2)
                return r0
            L_0x0024:
                return r0
            L_0x0025:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.f.job.JobServiceEngineC0027f.b():androidx.core.app.f$e");
        }

        job.JobServiceEngineC0027f(f fVar) {
            super(fVar);
            this.f2147a = fVar;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f2149c = jobParameters;
            this.f2147a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f2147a.doStopCurrentWork();
            synchronized (this.f2148b) {
                this.f2149c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h {

        /* renamed from: a  reason: collision with root package name */
        boolean f2139a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2140b;

        /* renamed from: f  reason: collision with root package name */
        private final Context f2141f;

        /* renamed from: g  reason: collision with root package name */
        private final PowerManager.WakeLock f2142g;

        /* renamed from: h  reason: collision with root package name */
        private final PowerManager.WakeLock f2143h;

        static {
            Covode.recordClassIndex(664);
        }

        @Override // androidx.core.app.f.h
        public final void a() {
            synchronized (this) {
                this.f2139a = false;
            }
        }

        @Override // androidx.core.app.f.h
        public final void b() {
            synchronized (this) {
                if (!this.f2140b) {
                    this.f2140b = true;
                    this.f2143h.acquire(600000);
                    this.f2142g.release();
                }
            }
        }

        @Override // androidx.core.app.f.h
        public final void c() {
            synchronized (this) {
                if (this.f2140b) {
                    if (this.f2139a) {
                        this.f2142g.acquire(60000);
                    }
                    this.f2140b = false;
                    this.f2143h.release();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.f.h
        public final void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2154c);
            if (a(this.f2141f, intent2) != null) {
                synchronized (this) {
                    if (!this.f2139a) {
                        this.f2139a = true;
                        if (!this.f2140b) {
                            this.f2142g.acquire(60000);
                        }
                    }
                }
            }
        }

        c(Context context, ComponentName componentName) {
            super(componentName);
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f2141f = applicationContext;
            PowerManager powerManager = (PowerManager) a(context, "power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2142g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2143h = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.f.c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        private static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }
    }

    static {
        Covode.recordClassIndex(661);
    }

    public f() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e dequeueWork() {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            return this.mCompatQueue.remove(0);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new job.JobServiceEngineC0027f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<d> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class a extends AsyncTask<Void, Void, Void> {
        static {
            Covode.recordClassIndex(662);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onCancelled(Void r2) {
            f.this.processorFinished();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Void r2) {
            f.this.processorFinished();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            while (true) {
                e dequeueWork = f.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                f.this.onHandleWork(dequeueWork.a());
                dequeueWork.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class h {

        /* renamed from: c  reason: collision with root package name */
        final ComponentName f2154c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2155d;

        /* renamed from: e  reason: collision with root package name */
        int f2156e;

        static {
            Covode.recordClassIndex(670);
        }

        public void a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }

        h(ComponentName componentName) {
            this.f2154c = componentName;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if (!this.f2155d) {
                this.f2155d = true;
                this.f2156e = i2;
            } else if (this.f2156e != i2) {
                throw new IllegalArgumentException("Given job ID " + i2 + " is different than previous " + this.f2156e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h {

        /* renamed from: a  reason: collision with root package name */
        private final JobInfo f2152a;

        /* renamed from: b  reason: collision with root package name */
        private final JobScheduler f2153b;

        static {
            Covode.recordClassIndex(669);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.f.h
        public final void a(Intent intent) {
            this.f2153b.enqueue(this.f2152a, new JobWorkItem(intent));
        }

        private static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }

        g(Context context, ComponentName componentName, int i2) {
            super(componentName);
            a(i2);
            this.f2152a = new JobInfo.Builder(i2, this.f2154c).setOverrideDeadline(0).build();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f2153b = (JobScheduler) a(applicationContext, "jobscheduler");
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a();
            h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z) {
                hVar.b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.a();
        synchronized (this.mCompatQueue) {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i2, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i2, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i2, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                h workEnqueuer = getWorkEnqueuer(context, componentName, true, i2);
                workEnqueuer.a(i2);
                workEnqueuer.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i2) {
        HashMap<ComponentName, h> hashMap = sClassWorkEnqueuer;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                hVar = new c(context, componentName);
            } else if (z) {
                hVar = new g(context, componentName, i2);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            hashMap.put(componentName, hVar);
        }
        return hVar;
    }
}
