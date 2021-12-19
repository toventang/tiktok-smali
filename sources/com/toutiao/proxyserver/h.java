package com.toutiao.proxyserver;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    final File f154865a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, File> f154866b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f154867c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<a> f154868d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f154869e;

    /* renamed from: f  reason: collision with root package name */
    public final b f154870f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f154871g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f154872h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f154873i;

    /* renamed from: j  reason: collision with root package name */
    private final ReentrantReadWriteLock f154874j;

    /* renamed from: k  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f154875k;

    /* renamed from: l  reason: collision with root package name */
    private volatile float f154876l;

    public interface a {
        static {
            Covode.recordClassIndex(103153);
        }

        void a(String str);

        void a(Set<String> set);
    }

    static {
        Covode.recordClassIndex(103143);
    }

    public final void a() {
        this.f154873i.removeCallbacks(this.f154872h);
        this.f154873i.postDelayed(this.f154872h, 10000);
    }

    public final void a(a aVar) {
        this.f154868d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f154870f.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f154870f.b(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f154870f.a(com.toutiao.proxyserver.g.a.a(str), str);
        }
    }

    /* access modifiers changed from: package-private */
    public final class b {

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Integer> f154890b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, String> f154891c;

        static {
            Covode.recordClassIndex(103154);
        }

        private b() {
            this.f154890b = new HashMap();
            this.f154891c = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public final synchronized void c(String str) {
            MethodCollector.i(10042);
            if (!TextUtils.isEmpty(str)) {
                this.f154891c.remove(str);
            }
            MethodCollector.o(10042);
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean d(String str) {
            MethodCollector.i(10203);
            if (!TextUtils.isEmpty(str)) {
                boolean containsKey = this.f154890b.containsKey(str);
                MethodCollector.o(10203);
                return containsKey;
            }
            MethodCollector.o(10203);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final synchronized void a(String str) {
            MethodCollector.i(9703);
            if (!TextUtils.isEmpty(str)) {
                if (!this.f154891c.containsKey(str)) {
                    Integer num = this.f154890b.get(str);
                    if (num == null) {
                        this.f154890b.put(str, 1);
                        MethodCollector.o(9703);
                        return;
                    }
                    this.f154890b.put(str, Integer.valueOf(num.intValue() + 1));
                } else {
                    com.toutiao.proxyserver.d.a aVar = new com.toutiao.proxyserver.d.a();
                    MethodCollector.o(9703);
                    throw aVar;
                }
            }
            MethodCollector.o(9703);
        }

        /* access modifiers changed from: package-private */
        public final synchronized void b(String str) {
            Integer num;
            MethodCollector.i(9873);
            if (!TextUtils.isEmpty(str) && (num = this.f154890b.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f154890b.remove(str);
                    String str2 = this.f154891c.get(str);
                    if (str2 != null) {
                        h.this.f(str2);
                    }
                    MethodCollector.o(9873);
                    return;
                }
                this.f154890b.put(str, Integer.valueOf(num.intValue() - 1));
            }
            MethodCollector.o(9873);
        }

        /* synthetic */ b(h hVar, byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final synchronized void a(String str, String str2) {
            MethodCollector.i(10041);
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!this.f154890b.containsKey(str) || !file.exists()) {
                    h.this.f(str2);
                } else {
                    this.f154891c.put(str, str2);
                    MethodCollector.o(10041);
                    return;
                }
            }
            MethodCollector.o(10041);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final File e(String str) {
        if (!this.f154875k.tryLock()) {
            return null;
        }
        File file = this.f154866b.get(str);
        this.f154875k.unlock();
        return file;
    }

    public final void f(final String str) {
        if (!TextUtils.isEmpty(str)) {
            t.a().a(str);
            this.f154873i.removeCallbacks(this.f154872h);
            this.f154871g.execute(new Runnable() {
                /* class com.toutiao.proxyserver.h.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(103151);
                }

                public final void run() {
                    HashSet hashSet;
                    String a2 = com.toutiao.proxyserver.g.a.a(str);
                    h.this.f154867c.lock();
                    try {
                        File file = h.this.f154866b.get(a2);
                        if (file == null || h.this.f154870f.d(file.getName()) || !a(file)) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet(1);
                            hashSet.add(a2);
                            h.this.f154866b.remove(a2);
                            h.this.f154870f.c(a2);
                            file.getName();
                        }
                        if (hashSet != null) {
                            for (a aVar : h.this.f154868d) {
                                aVar.a(hashSet);
                            }
                        }
                    } finally {
                        h.this.f154867c.unlock();
                    }
                }

                private static boolean a(File file) {
                    MethodCollector.i(12539);
                    try {
                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                        if (e.a(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                        }
                        if (e.c(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                            MethodCollector.o(12539);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.o(12539);
                    return delete;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final File a(String str) {
        this.f154875k.lock();
        File file = this.f154866b.get(str);
        this.f154875k.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f154865a, str);
        this.f154867c.lock();
        this.f154866b.put(str, file2);
        this.f154867c.unlock();
        for (a aVar : this.f154868d) {
            aVar.a(str);
        }
        a();
        return file2;
    }

    public h(File file) {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f154874j = reentrantReadWriteLock;
        this.f154875k = reentrantReadWriteLock.readLock();
        this.f154867c = reentrantReadWriteLock.writeLock();
        this.f154868d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f154869e = 104857600;
        this.f154876l = 0.5f;
        this.f154870f = new b(this, (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactory() {
            /* class com.toutiao.proxyserver.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103144);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("DiskLruCache-cleanup-" + thread.getId());
                thread.setDaemon(true);
                return thread;
            }
        }, new RejectedExecutionHandler() {
            /* class com.toutiao.proxyserver.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103145);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
        this.f154871g = threadPoolExecutor;
        this.f154872h = new Runnable() {
            /* class com.toutiao.proxyserver.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103146);
            }

            public final void run() {
                h.this.f154871g.execute(new Runnable() {
                    /* class com.toutiao.proxyserver.h.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103147);
                    }

                    public final void run() {
                        h.this.a(h.this.f154869e);
                    }
                });
            }
        };
        this.f154873i = new Handler(Looper.getMainLooper());
        if (file == null) {
            str = " dir null";
        } else if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        } else {
            this.f154865a = file;
            threadPoolExecutor.execute(new Runnable() {
                /* class com.toutiao.proxyserver.h.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(103148);
                }

                /* JADX INFO: finally extract failed */
                public final void run() {
                    h hVar = h.this;
                    hVar.f154867c.lock();
                    try {
                        File[] listFiles = hVar.f154865a.listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            HashMap hashMap = new HashMap(listFiles.length);
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file : listFiles) {
                                if (file.isFile()) {
                                    arrayList.add(file);
                                    hashMap.put(file, Long.valueOf(file.lastModified()));
                                }
                            }
                            Collections.sort(arrayList, new Comparator<File>(hashMap) {
                                /* class com.toutiao.proxyserver.h.AnonymousClass5 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ HashMap f154882a;

                                static {
                                    Covode.recordClassIndex(103149);
                                }

                                {
                                    this.f154882a = r2;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(File file, File file2) {
                                    long longValue = ((Long) this.f154882a.get(file)).longValue() - ((Long) this.f154882a.get(file2)).longValue();
                                    if (longValue < 0) {
                                        return -1;
                                    }
                                    if (longValue > 0) {
                                        return 1;
                                    }
                                    return 0;
                                }
                            });
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                hVar.f154866b.put(file2.getName(), file2);
                            }
                        }
                        hVar.f154867c.unlock();
                        hVar.a();
                    } catch (Throwable th) {
                        hVar.f154867c.unlock();
                        throw th;
                    }
                }
            });
            return;
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    public final void a(long j2) {
        HashSet hashSet;
        MethodCollector.i(12783);
        final HashSet hashSet2 = new HashSet();
        this.f154867c.lock();
        long j3 = 0;
        try {
            for (Map.Entry<String, File> entry : this.f154866b.entrySet()) {
                j3 += entry.getValue().length();
            }
            if (j3 <= j2) {
                this.f154867c.unlock();
                MethodCollector.o(12783);
                return;
            }
            long j4 = (long) (((float) j2) * this.f154876l);
            hashSet = new HashSet();
            try {
                for (Map.Entry<String, File> entry2 : this.f154866b.entrySet()) {
                    File value = entry2.getValue();
                    if (value == null || !value.exists()) {
                        hashSet.add(entry2.getKey());
                    } else if (!this.f154870f.d(value.getName())) {
                        long length = value.length();
                        File file = new File(value.getAbsolutePath() + "-tmp");
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j3 -= length;
                            hashSet.add(entry2.getKey());
                        }
                    }
                    if (j3 <= j4) {
                        break;
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    this.f154866b.remove((String) it.next());
                }
            } catch (Throwable unused) {
            }
            this.f154867c.unlock();
            for (a aVar : this.f154868d) {
                aVar.a(hashSet);
            }
            this.f154871g.execute(new Runnable() {
                /* class com.toutiao.proxyserver.h.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(103152);
                }

                public final void run() {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        try {
                            a((File) it.next());
                        } catch (Throwable unused) {
                        }
                    }
                }

                private static boolean a(File file) {
                    MethodCollector.i(12535);
                    try {
                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                        if (e.a(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                        }
                        if (e.c(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                            MethodCollector.o(12535);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.o(12535);
                    return delete;
                }
            });
            MethodCollector.o(12783);
        } catch (Throwable unused2) {
            hashSet = null;
        }
    }
}
