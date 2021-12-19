package com.ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.ttvideoengine.j.n;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class aw {

    /* renamed from: d  reason: collision with root package name */
    static String f152284d = "VideoCacheManager";

    /* renamed from: e  reason: collision with root package name */
    static volatile File f152285e;

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<String, File> f152286a;

    /* renamed from: b  reason: collision with root package name */
    final LinkedHashMap<String, n> f152287b;

    /* renamed from: c  reason: collision with root package name */
    final ReentrantReadWriteLock.WriteLock f152288c;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f152289f;

    /* renamed from: g  reason: collision with root package name */
    volatile boolean f152290g;

    /* renamed from: h  reason: collision with root package name */
    private final ReentrantReadWriteLock f152291h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f152292i;

    /* renamed from: j  reason: collision with root package name */
    private volatile float f152293j;

    /* renamed from: k  reason: collision with root package name */
    private final b f152294k;

    /* renamed from: l  reason: collision with root package name */
    private a f152295l;

    public static aw a() {
        return c.f152302a;
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Integer> f152301a;

        static {
            Covode.recordClassIndex(101502);
        }

        private b() {
            this.f152301a = new HashMap();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean a(String str) {
            MethodCollector.i(12807);
            if (!TextUtils.isEmpty(str)) {
                boolean containsKey = this.f152301a.containsKey(str);
                MethodCollector.o(12807);
                return containsKey;
            }
            MethodCollector.o(12807);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final aw f152302a = new aw((byte) 0);

        static {
            Covode.recordClassIndex(101503);
        }
    }

    static {
        Covode.recordClassIndex(101498);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private HandlerThread f152298a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152299b;

        static {
            Covode.recordClassIndex(101500);
        }

        public a() {
            try {
                HandlerThread handlerThread = new HandlerThread("clearCacheThread");
                this.f152298a = handlerThread;
                handlerThread.start();
                this.f152299b = new Handler(this.f152298a.getLooper()) {
                    /* class com.ss.ttvideoengine.aw.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101501);
                    }

                    public final void handleMessage(Message message) {
                        File file;
                        String b2;
                        MethodCollector.i(13107);
                        if (message == null) {
                            MethodCollector.o(13107);
                            return;
                        }
                        try {
                            aw awVar = (aw) message.obj;
                            int i2 = message.what;
                            if (i2 == 0) {
                                j.a(aw.f152284d, com.a.a("start init videocachemanager", new Object[0]));
                                awVar.f152288c.lock();
                                try {
                                    if (!awVar.f152290g && (file = aw.f152285e) != null && file.exists() && file.isDirectory() && file.canRead()) {
                                        if (file.canWrite()) {
                                            File[] listFiles = aw.f152285e.listFiles();
                                            if (listFiles != null && listFiles.length > 0) {
                                                HashMap hashMap = new HashMap(listFiles.length);
                                                ArrayList arrayList = new ArrayList(listFiles.length);
                                                for (File file2 : listFiles) {
                                                    if (file2.isFile()) {
                                                        arrayList.add(file2);
                                                        hashMap.put(file2, Long.valueOf(file2.lastModified()));
                                                    }
                                                }
                                                Collections.sort(arrayList, new Comparator<File>(hashMap) {
                                                    /* class com.ss.ttvideoengine.aw.AnonymousClass1 */

                                                    /* renamed from: a  reason: collision with root package name */
                                                    final /* synthetic */ HashMap f152296a;

                                                    static {
                                                        Covode.recordClassIndex(101499);
                                                    }

                                                    {
                                                        this.f152296a = r2;
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                    @Override // java.util.Comparator
                                                    public final /* synthetic */ int compare(File file, File file2) {
                                                        long longValue = ((Long) this.f152296a.get(file)).longValue() - ((Long) this.f152296a.get(file2)).longValue();
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
                                                    File file3 = (File) it.next();
                                                    j.a(aw.f152284d, com.a.a("add file:%s", new Object[]{file3.getName()}));
                                                    awVar.f152286a.put(file3.getName(), file3);
                                                    String[] a2 = aw.a(file3);
                                                    if (aw.a(a2)) {
                                                        String a3 = com.a.a("%s_%s", new Object[]{a2[0], a2[1]});
                                                        String a4 = com.a.a("%s_%s_%s_%s", new Object[]{a2[0], a2[1], a2[2], a2[3]});
                                                        String str = null;
                                                        if (a2.length == 5) {
                                                            str = a2[4];
                                                        }
                                                        String canonicalPath = file3.getCanonicalPath();
                                                        if (str != null && str.length() > 0 && (b2 = i.b(str)) != null && !b2.equals(str)) {
                                                            canonicalPath = canonicalPath.replace(str, b2);
                                                            file3.renameTo(new File(canonicalPath));
                                                            str = b2;
                                                        }
                                                        awVar.f152287b.put(a3, new n(canonicalPath, a4, a4, str));
                                                    }
                                                }
                                            }
                                            awVar.f152290g = true;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                awVar.f152288c.unlock();
                                j.b(aw.f152284d, com.a.a("end init videocachemanager", new Object[0]));
                                MethodCollector.o(13107);
                            } else if (i2 != 1) {
                                if (i2 == 2) {
                                    awVar.c();
                                }
                                MethodCollector.o(13107);
                            } else {
                                awVar.b();
                                MethodCollector.o(13107);
                            }
                        } catch (Throwable unused2) {
                            MethodCollector.o(13107);
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f152298a = null;
                this.f152299b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        j.b(f152284d, com.a.a("start clear all cache", new Object[0]));
        a(0);
        j.b(f152284d, com.a.a("end clear all cache", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        j.b(f152284d, com.a.a("start clean file maxSize:%d", new Object[]{Long.valueOf(this.f152289f)}));
        a(this.f152289f);
        j.b(f152284d, com.a.a("end clean file maxSize:%d", new Object[]{Long.valueOf(this.f152289f)}));
    }

    private aw() {
        this.f152286a = new LinkedHashMap<>(0, 0.75f, true);
        this.f152287b = new LinkedHashMap<>(0, 0.75f, true);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f152291h = reentrantReadWriteLock;
        this.f152292i = reentrantReadWriteLock.readLock();
        this.f152288c = reentrantReadWriteLock.writeLock();
        this.f152289f = 209715200;
        this.f152293j = 0.3f;
        this.f152290g = false;
        this.f152294k = new b((byte) 0);
        this.f152295l = new a();
    }

    /* synthetic */ aw(byte b2) {
        this();
    }

    static String[] a(File file) {
        String name = file.getName();
        if (name == null) {
            return null;
        }
        return a(name);
    }

    static boolean a(String[] strArr) {
        if (strArr == null || !(strArr.length == 4 || strArr.length == 5)) {
            return false;
        }
        for (String str : strArr) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    private static String[] a(String str) {
        String[] split;
        if (str == null || (split = str.split("\\.")) == null || split.length <= 0) {
            return null;
        }
        return split[0].split("_");
    }

    private static boolean b(File file) {
        MethodCollector.i(11724);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11724);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11724);
        return delete;
    }

    private void a(long j2) {
        MethodCollector.i(11722);
        HashSet hashSet = new HashSet();
        j.b(f152284d, com.a.a("start trim", new Object[0]));
        this.f152288c.lock();
        long j3 = 0;
        try {
            for (Map.Entry<String, File> entry : this.f152286a.entrySet()) {
                j3 += entry.getValue().length();
            }
            j.b(f152284d, com.a.a("current file size:%d,maxsize:%d", new Object[]{Long.valueOf(j3), Long.valueOf(j2)}));
            if (j3 <= j2) {
                this.f152288c.unlock();
                MethodCollector.o(11722);
                return;
            }
            long j4 = (long) (((float) j2) * this.f152293j);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (Map.Entry<String, File> entry2 : this.f152286a.entrySet()) {
                File value = entry2.getValue();
                if (value == null || !value.exists()) {
                    hashSet2.add(entry2.getKey());
                } else if (!this.f152294k.a(value.getName())) {
                    long length = value.length();
                    File file = new File(value.getAbsolutePath() + "-tmp");
                    if (value.renameTo(file)) {
                        hashSet.add(file);
                        j3 -= length;
                        hashSet2.add(entry2.getKey());
                        String[] a2 = a(value);
                        if (a(a2)) {
                            hashSet3.add(com.a.a("%s_%s", new Object[]{a2[0], a2[1]}));
                        }
                    }
                }
                if (j3 <= j4) {
                    break;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                this.f152286a.remove((String) it.next());
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                this.f152287b.remove((String) it2.next());
            }
            this.f152288c.unlock();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                File file2 = (File) it3.next();
                try {
                    String str = f152284d;
                    try {
                        j.b(str, com.a.a("delete file name:%s", new Object[]{file2.getName()}));
                        b(file2);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
            j.b(f152284d, com.a.a("end trim", new Object[0]));
            MethodCollector.o(11722);
        } catch (Throwable unused3) {
        }
    }

    public final void a(String str, String str2) {
        if (this.f152288c.tryLock()) {
            try {
                String[] a2 = a(str);
                if (a(a2)) {
                    String a3 = com.a.a("%s_%s", new Object[]{a2[0], a2[1]});
                    String a4 = com.a.a("%s_%s_%s_%s", new Object[]{a2[0], a2[1], a2[2], a2[3]});
                    String str3 = null;
                    if (a2.length == 5) {
                        str3 = a2[4];
                    }
                    n nVar = new n(str2, a4, a4, str3);
                    if (!this.f152287b.containsKey(a3)) {
                        this.f152287b.put(a3, nVar);
                    }
                }
            } catch (Throwable unused) {
            }
            this.f152288c.unlock();
        }
    }
}
