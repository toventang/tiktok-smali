package com.ss.android.ugc.aweme.music.e;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.toutiao.proxyserver.r;
import h.f.b.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class d extends r {

    /* renamed from: j  reason: collision with root package name */
    public static final a f111410j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f111411a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, File> f111412b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f111413c;

    /* renamed from: d  reason: collision with root package name */
    volatile float f111414d;

    /* renamed from: e  reason: collision with root package name */
    final Runnable f111415e;

    /* renamed from: f  reason: collision with root package name */
    final Handler f111416f;

    /* renamed from: g  reason: collision with root package name */
    final File f111417g;

    /* renamed from: h  reason: collision with root package name */
    public final long f111418h;

    /* renamed from: i  reason: collision with root package name */
    final List<String> f111419i;

    /* renamed from: l  reason: collision with root package name */
    private final ReentrantReadWriteLock f111420l;

    /* renamed from: m  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f111421m;

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$d  reason: collision with other inner class name */
    static final class RejectedExecutionHandlerC2854d implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final RejectedExecutionHandlerC2854d f111426a = new RejectedExecutionHandlerC2854d();

        static {
            Covode.recordClassIndex(71585);
        }

        RejectedExecutionHandlerC2854d() {
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        Covode.recordClassIndex(71579);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71581);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f111423a;

        static {
            Covode.recordClassIndex(71582);
        }

        b(d dVar) {
            this.f111423a = dVar;
        }

        public final void run() {
            MethodCollector.i(1718);
            this.f111423a.f111411a.execute(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.music.e.d.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f111424a;

                static {
                    Covode.recordClassIndex(71583);
                }

                {
                    this.f111424a = r1;
                }

                public final void run() {
                    MethodCollector.i(1835);
                    d dVar = this.f111424a.f111423a;
                    long j2 = this.f111424a.f111423a.f111418h;
                    HashSet hashSet = new HashSet();
                    dVar.f111413c.lock();
                    long j3 = 0;
                    try {
                        for (Map.Entry<String, File> entry : dVar.f111412b.entrySet()) {
                            j3 += entry.getValue().length();
                        }
                        if (j3 <= j2) {
                            dVar.f111413c.unlock();
                            MethodCollector.o(1835);
                            return;
                        }
                        long j4 = (long) (((float) j2) * dVar.f111414d);
                        HashSet hashSet2 = new HashSet();
                        for (Map.Entry<String, File> entry2 : dVar.f111412b.entrySet()) {
                            String key = entry2.getKey();
                            File value = entry2.getValue();
                            if (value != null && value.exists()) {
                                if (!dVar.f111419i.contains(value.getPath())) {
                                    value.getName();
                                    long length = value.length();
                                    File file = new File(value.getAbsolutePath() + "-tmp");
                                    if (value.renameTo(file)) {
                                        hashSet.add(file);
                                        j3 -= length;
                                        hashSet2.add(key);
                                    }
                                } else {
                                    value.getName();
                                }
                            }
                            if (j3 <= j4) {
                                break;
                            }
                        }
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            dVar.f111412b.remove((String) it.next());
                        }
                        dVar.f111413c.unlock();
                        dVar.f111411a.execute(new f(hashSet));
                        MethodCollector.o(1835);
                    } catch (Throwable unused) {
                    }
                }
            });
            MethodCollector.o(1718);
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashSet f111428a;

        static {
            Covode.recordClassIndex(71587);
        }

        f(HashSet hashSet) {
            this.f111428a = hashSet;
        }

        public final void run() {
            Iterator it = this.f111428a.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    StringBuilder sb = new StringBuilder("MusicDiskLruCache: music cache file: ");
                    l.b(file, "");
                    bj.d(sb.append(file.getName()).append(" really delete").toString());
                    a(file);
                } catch (Throwable unused) {
                }
            }
        }

        private static boolean a(File file) {
            MethodCollector.i(2318);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(2318);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(2318);
            return delete;
        }
    }

    public static final class e implements Comparator<File> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f111427a;

        static {
            Covode.recordClassIndex(71586);
        }

        e(HashMap hashMap) {
            this.f111427a = hashMap;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            l.d(file, "");
            l.d(file2, "");
            Long l2 = (Long) this.f111427a.get(file);
            Long l3 = -1L;
            if (l2 == null) {
                l2 = l3;
            }
            l.b(l2, "");
            long longValue = l2.longValue();
            Long l4 = (Long) this.f111427a.get(file2);
            if (l4 != null) {
                l3 = l4;
            }
            l.b(l3, "");
            long longValue2 = longValue - l3.longValue();
            if (longValue2 < 0) {
                return -1;
            }
            if (longValue2 > 0) {
                return 1;
            }
            return 0;
        }
    }

    static final class c implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public static final c f111425a = new c();

        static {
            Covode.recordClassIndex(71584);
        }

        c() {
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("MusicDiskLruCache-cleanup-" + thread.getId());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Override // com.toutiao.proxyserver.r, com.toutiao.proxyserver.b
    public final File a(String str) {
        l.d(str, "");
        this.f111421m.lock();
        File file = this.f111412b.get(str);
        if (file != null) {
            List<String> list = this.f111419i;
            String path = file.getPath();
            l.b(path, "");
            list.add(path);
        }
        this.f111421m.unlock();
        if (file != null) {
            return file;
        }
        File f2 = f(str);
        this.f111413c.lock();
        LinkedHashMap<String, File> linkedHashMap = this.f111412b;
        l.b(f2, "");
        linkedHashMap.put(str, f2);
        List<String> list2 = this.f111419i;
        String path2 = f2.getPath();
        l.b(path2, "");
        list2.add(path2);
        this.f111413c.unlock();
        return f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(File file, long j2, List<String> list) {
        super(file);
        l.d(file, "");
        l.d(list, "");
        MethodCollector.i(1777);
        this.f111417g = file;
        this.f111418h = j2;
        this.f111419i = list;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), c.f111425a, RejectedExecutionHandlerC2854d.f111426a);
        this.f111411a = threadPoolExecutor;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f111420l = reentrantReadWriteLock;
        this.f111421m = reentrantReadWriteLock.readLock();
        this.f111413c = reentrantReadWriteLock.writeLock();
        this.f111414d = 0.5f;
        this.f111415e = new b(this);
        this.f111416f = new Handler(Looper.getMainLooper());
        if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            IOException iOException = new IOException("dir error!  ".concat(String.valueOf("exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite())));
            MethodCollector.o(1777);
            throw iOException;
        }
        threadPoolExecutor.execute(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.music.e.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f111422a;

            static {
                Covode.recordClassIndex(71580);
            }

            {
                this.f111422a = r1;
            }

            /* JADX INFO: finally extract failed */
            public final void run() {
                d dVar = this.f111422a;
                dVar.f111413c.lock();
                long j2 = 0;
                try {
                    File[] listFiles = dVar.f111417g.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length != 0) {
                            HashMap hashMap = new HashMap(listFiles.length);
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file : listFiles) {
                                l.b(file, "");
                                if (file.isFile()) {
                                    arrayList.add(file);
                                    j2 += file.length();
                                    hashMap.put(file, Long.valueOf(file.lastModified()));
                                }
                            }
                            com.ss.android.ugc.aweme.common.r.a("tool_performance_effect_storage_space", new com.ss.android.ugc.aweme.app.f.d().a("music_size", j2).f66730a);
                            Collections.sort(arrayList, new e(hashMap));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                LinkedHashMap<String, File> linkedHashMap = dVar.f111412b;
                                l.b(file2, "");
                                String name = file2.getName();
                                l.b(name, "");
                                linkedHashMap.put(name, file2);
                            }
                        }
                    }
                    dVar.f111413c.unlock();
                    dVar.f111416f.removeCallbacks(dVar.f111415e);
                    dVar.f111416f.postDelayed(dVar.f111415e, 10000);
                } catch (Throwable th) {
                    dVar.f111413c.unlock();
                    throw th;
                }
            }
        });
        MethodCollector.o(1777);
    }
}
