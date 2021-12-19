package com.bytedance.b.d;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.q.u;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f26146a = new c();

    /* renamed from: b  reason: collision with root package name */
    public String f26147b;

    /* renamed from: c  reason: collision with root package name */
    String f26148c;

    /* renamed from: d  reason: collision with root package name */
    public String f26149d;

    /* renamed from: e  reason: collision with root package name */
    String f26150e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f26151f;

    /* renamed from: g  reason: collision with root package name */
    List<String> f26152g;

    /* renamed from: h  reason: collision with root package name */
    List<String> f26153h;

    /* renamed from: i  reason: collision with root package name */
    boolean f26154i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.b.d.a.a f26155j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.apm.g.d f26156k;

    /* renamed from: l  reason: collision with root package name */
    private long f26157l;

    /* renamed from: m  reason: collision with root package name */
    private long f26158m;
    private long n;
    private long o;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm6_disk_DiskStatistics_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_apm6_disk_DiskStatistics_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static boolean a(long j2) {
        return j2 < 0 || j2 > 17179869184L;
    }

    static boolean b(long j2) {
        return j2 >= 104857600 && j2 <= 17179869184L;
    }

    private c() {
    }

    /* access modifiers changed from: package-private */
    public final void a(List<C0558c> list) {
        if (!f.a(list)) {
            for (C0558c cVar : list) {
                if (TextUtils.equals(cVar.f26170a, this.f26147b)) {
                    this.f26157l = cVar.f26172c;
                } else if (TextUtils.equals(cVar.f26170a, this.f26149d)) {
                    this.f26158m = cVar.f26172c;
                } else if (TextUtils.equals(cVar.f26170a, this.f26148c)) {
                    this.n = cVar.f26172c;
                } else if (TextUtils.equals(cVar.f26170a, this.f26150e)) {
                    this.o = cVar.f26172c;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final b a(u<b> uVar, u<b> uVar2, u<b> uVar3, List<a> list) {
        try {
            long j2 = this.f26157l + this.f26158m;
            long j3 = this.n + this.o;
            long totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            long j4 = j2 > 17179869184L ? 17179869184L : j2;
            if (j3 > 17179869184L) {
                j3 = 17179869184L;
            }
            if (j4 < 0) {
                return null;
            }
            if (this.f26156k != null) {
                a(uVar);
                a(uVar2);
                a(uVar3);
            }
            Pair<Long, Long> a2 = a();
            long b2 = b();
            try {
                return new b(j2, j3, totalSpace, freeSpace, b2, ((Long) a2.first).longValue(), ((Long) a2.second).longValue(), (double) a(b2, new BigDecimal(totalSpace)), b(uVar), b(uVar2), b(uVar3), a(list, j4));
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Method a(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONArray a(List<a> list, long j2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(j2);
        JSONArray jSONArray = new JSONArray();
        for (a aVar : list) {
            if (a(aVar)) {
                aVar.f26161c = 0.0f;
            } else {
                aVar.f26161c = a(aVar.f26160b, bigDecimal);
            }
            List<a> list2 = aVar.f26164f;
            if (list2 != null && list2.size() > 0) {
                for (a aVar2 : list2) {
                    if (a(aVar2)) {
                        aVar2.f26161c = 0.0f;
                    } else {
                        aVar2.f26161c = a(aVar2.f26160b, bigDecimal);
                    }
                }
            }
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    private boolean a(a aVar) {
        for (String str : this.f26152g) {
            if (aVar.f26159a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> a(u<? extends b> uVar) {
        if (uVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (b bVar : uVar.a()) {
            linkedList.add(bVar.f26166a);
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    public final List<C0558c> a(String str, u<b> uVar, u<b> uVar2, u<b> uVar3, List<String> list) {
        String str2;
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        C0558c cVar = new C0558c(this, (byte) 0);
        cVar.f26170a = str;
        cVar.f26171b = new C0558c(this, (byte) 0);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (list.contains(file.getAbsolutePath())) {
            arrayList.add(cVar);
            list.remove(file.getAbsolutePath());
        }
        cVar.f26173d = listFiles.length;
        LinkedList linkedList = new LinkedList();
        linkedList.offer(cVar);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0558c cVar2 = (C0558c) linkedList.poll();
                if (cVar2 != null) {
                    String str3 = cVar2.f26170a;
                    File file2 = new File(str3);
                    if (!file2.exists() || a(file2)) {
                        cVar2.f26171b.f26173d--;
                    } else if (file2.isFile()) {
                        long length = file2.length();
                        if (!a(length)) {
                            str2 = str3;
                            uVar.a(new b(str3, length, 1));
                        } else {
                            str2 = str3;
                        }
                        if (cVar2.f26171b != null) {
                            cVar2.f26171b.a(length, uVar3, uVar2);
                            if (!cVar2.f26171b.f26174e) {
                                long c2 = c(file2.lastModified());
                                if (c2 > 0 && b(length)) {
                                    uVar3.a(new d(str2, (long) size, 0, c2));
                                }
                            }
                        }
                    } else {
                        if (list.contains(file2.getAbsolutePath())) {
                            arrayList.add(cVar2);
                            list.remove(file2.getAbsolutePath());
                        }
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 == null || listFiles2.length == 0) {
                            cVar2.f26171b.a(0, uVar3, uVar2);
                        } else {
                            cVar2.f26173d = listFiles2.length;
                            for (File file3 : listFiles2) {
                                C0558c cVar3 = new C0558c(this, (byte) 0);
                                cVar3.f26171b = cVar2;
                                cVar3.f26170a = file3.getAbsolutePath();
                                if (file3.isDirectory() && !cVar2.f26174e) {
                                    long c3 = c(file3.lastModified());
                                    if (c3 > 0) {
                                        cVar3.f26174e = true;
                                        cVar3.f26175f = c3;
                                    }
                                }
                                linkedList.offer(cVar3);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(File file, List<a> list) {
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                b(file2, list);
            }
        }
    }

    private boolean a(File file) {
        if (!f.a(this.f26152g)) {
            return this.f26152g.contains(file.getAbsolutePath());
        }
        return false;
    }

    /* renamed from: com.bytedance.b.d.c$c  reason: collision with other inner class name */
    class C0558c {

        /* renamed from: a  reason: collision with root package name */
        public String f26170a;

        /* renamed from: b  reason: collision with root package name */
        public C0558c f26171b;

        /* renamed from: c  reason: collision with root package name */
        public long f26172c;

        /* renamed from: d  reason: collision with root package name */
        public int f26173d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f26174e;

        /* renamed from: f  reason: collision with root package name */
        public long f26175f;

        /* renamed from: h  reason: collision with root package name */
        private int f26177h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f26178i;

        static {
            Covode.recordClassIndex(15199);
        }

        private boolean a() {
            if (this.f26177h == this.f26173d) {
                return true;
            }
            return false;
        }

        private C0558c() {
        }

        /* synthetic */ C0558c(c cVar, byte b2) {
            this();
        }

        public final void a(long j2, u<b> uVar, u<b> uVar2) {
            this.f26172c += j2;
            this.f26177h++;
            if (this.f26171b != null && a()) {
                if (this.f26178i) {
                    this.f26171b.f26178i = true;
                }
                if (this.f26172c >= c.this.f26155j.f26124c && !this.f26178i) {
                    if (!c.a(this.f26172c)) {
                        uVar2.a(new b(this.f26170a, this.f26172c, this.f26173d));
                    }
                    this.f26171b.f26178i = true;
                }
                this.f26171b.a(this.f26172c, uVar, uVar2);
                if (this.f26174e && c.b(this.f26172c)) {
                    c cVar = c.this;
                    String str = this.f26170a;
                    long j3 = this.f26172c;
                    int i2 = this.f26173d;
                    uVar.a(new d(str, j3, i2, (long) i2));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(15196);
    }

    private long c() {
        long j2 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            Context applicationContext = com.bytedance.b.k.a.f26313g.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            for (File file : applicationContext.getExternalMediaDirs()) {
                j2 += b(file);
            }
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public String f26166a;

        /* renamed from: b  reason: collision with root package name */
        public long f26167b;

        /* renamed from: d  reason: collision with root package name */
        private int f26169d;

        static {
            Covode.recordClassIndex(15198);
        }

        public JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f26166a;
                if (str.contains(c.this.f26147b)) {
                    str = str.replace(c.this.f26147b, "internal");
                } else if (str.contains(c.this.f26149d)) {
                    str = str.replace(c.this.f26149d, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f26167b);
                int i2 = this.f26169d;
                if (i2 > 0) {
                    jSONObject.put("num", i2);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j2 = this.f26167b;
            long j3 = ((b) obj).f26167b;
            if (j2 == j3) {
                return 0;
            }
            if (j2 > j3) {
                return 1;
            }
            return -1;
        }

        public b(String str, long j2, int i2) {
            this.f26166a = str;
            this.f26167b = j2;
            this.f26169d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends b {

        /* renamed from: d  reason: collision with root package name */
        public long f26179d;

        /* renamed from: f  reason: collision with root package name */
        private final String f26181f;

        /* renamed from: g  reason: collision with root package name */
        private int f26182g;

        /* renamed from: h  reason: collision with root package name */
        private long f26183h;

        static {
            Covode.recordClassIndex(15200);
        }

        @Override // com.bytedance.b.d.c.b
        public final JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f26181f;
                if (str.contains(c.this.f26147b)) {
                    str = str.replace(c.this.f26147b, "internal");
                } else if (str.contains(c.this.f26149d)) {
                    str = str.replace(c.this.f26149d, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f26179d);
                int i2 = this.f26182g;
                if (i2 > 0) {
                    jSONObject.put("num", i2);
                }
                jSONObject.put("outdate_interval", this.f26183h);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.b.d.c.b, java.lang.Comparable
        public final int compareTo(Object obj) {
            long j2 = this.f26183h;
            long j3 = ((d) obj).f26183h;
            if (j2 == j3) {
                return 0;
            }
            if (j2 > j3) {
                return 1;
            }
            return -1;
        }

        public d(String str, long j2, int i2, long j3) {
            super();
            this.f26181f = str;
            this.f26179d = j2;
            this.f26182g = i2;
            this.f26183h = j3;
        }
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f26159a;

        /* renamed from: b  reason: collision with root package name */
        public long f26160b;

        /* renamed from: c  reason: collision with root package name */
        public float f26161c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f26162d;

        /* renamed from: e  reason: collision with root package name */
        public String f26163e;

        /* renamed from: f  reason: collision with root package name */
        public List<a> f26164f;

        static {
            Covode.recordClassIndex(15197);
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.f26159a;
                if (str.contains(c.this.f26147b)) {
                    str = str.replace(c.this.f26147b, "internal");
                } else if (str.contains(c.this.f26149d)) {
                    str = str.replace(c.this.f26149d, "external");
                }
                jSONObject.put("path", str);
                jSONObject.put("size", this.f26160b);
                jSONObject.put("size_rate", (double) this.f26161c);
                jSONObject.put("is_folder", this.f26162d);
                jSONObject.put("report_type", this.f26163e);
                if (!this.f26164f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (a aVar : this.f26164f) {
                        jSONArray.put(aVar.a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        private a() {
            this.f26163e = "normal";
            this.f26164f = new ArrayList();
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(5:2|3|(1:5)|6|7)|8|9|(1:11)|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071 A[Catch:{ Exception -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.d.c.b():long");
    }

    private static Pair<Long, Long> a() {
        UUID fromString;
        try {
            long j2 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) a(com.bytedance.b.k.a.f26313g, "storagestats");
                StorageManager storageManager = (StorageManager) a(com.bytedance.b.k.a.f26313g, "storage");
                long j3 = 0;
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    String uuid = storageVolume.getUuid();
                    if (uuid == null) {
                        fromString = StorageManager.UUID_DEFAULT;
                    } else {
                        fromString = UUID.fromString(uuid);
                    }
                    j2 += storageStatsManager.getTotalBytes(fromString);
                    j3 += storageManager.getAllocatableBytes(fromString);
                }
                return new Pair<>(Long.valueOf(((j2 / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j3 / 1000) / 1000) * 1024 * 1024));
            } else if (Build.VERSION.SDK_INT >= 24) {
                List<StorageVolume> storageVolumes = ((StorageManager) a(com.bytedance.b.k.a.f26313g, "storage")).getStorageVolumes();
                if (f.a(storageVolumes)) {
                    return null;
                }
                long j4 = 0;
                for (StorageVolume storageVolume2 : storageVolumes) {
                    File file = (File) a(a(storageVolume2.getClass(), "getPathFile", new Class[0]), storageVolume2, new Object[0]);
                    j2 += file.getTotalSpace();
                    j4 += file.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(((j2 / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j4 / 1000) / 1000) * 1024 * 1024));
            } else {
                StorageManager storageManager2 = (StorageManager) a(com.bytedance.b.k.a.f26313g, "storage");
                long j5 = 0;
                for (Object obj : (List) a(a(storageManager2.getClass(), "getVolumes", new Class[0]), storageManager2, new Object[0])) {
                    File file2 = (File) a(a(obj.getClass(), "getPathFile", new Class[0]), obj, new Object[0]);
                    j5 += file2.getFreeSpace();
                    j2 += file2.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(j2), Long.valueOf(j5));
            }
        } catch (Throwable unused) {
            Long valueOf = Long.valueOf(com.bytedance.b.k.c.a(Environment.getDataDirectory().getPath()) + com.bytedance.b.k.c.a(Environment.getRootDirectory().getPath()));
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            int i2 = Build.VERSION.SDK_INT;
            return new Pair<>(valueOf, Long.valueOf(statFs.getAvailableBytes()));
        }
    }

    private long c(long j2) {
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis < this.f26155j.f26130i || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    private long b(File file) {
        long j2;
        long j3 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j2 = b(file2);
                        } else {
                            j2 = file2.length();
                        }
                        j3 += j2;
                    }
                    return j3;
                }
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(List<a> list) {
        if (!f.a(this.f26153h)) {
            for (String str : this.f26153h) {
                File file = new File(str);
                if (file.exists() && !a(file)) {
                    if (file.isFile()) {
                        long length = file.length();
                        a aVar = new a(this, (byte) 0);
                        aVar.f26162d = false;
                        aVar.f26159a = file.getAbsolutePath();
                        aVar.f26160b = length;
                        aVar.f26163e = "custom";
                        list.add(aVar);
                    } else {
                        a aVar2 = new a(this, (byte) 0);
                        aVar2.f26162d = true;
                        aVar2.f26163e = "custom";
                        aVar2.f26159a = file.getAbsolutePath();
                        aVar2.f26160b = b(file);
                        list.add(aVar2);
                    }
                }
            }
        }
    }

    private static JSONArray b(u<b> uVar) {
        JSONArray jSONArray = new JSONArray();
        for (b bVar : uVar.a()) {
            JSONObject a2 = bVar.a();
            if (a2 != null) {
                jSONArray.put(a2);
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    public final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (f.a(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.f26147b));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.f26149d));
            }
        }
        return arrayList;
    }

    static String a(Context context) {
        File file;
        try {
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107196d = context.getExternalFilesDir(null);
                }
                file = com.ss.android.ugc.aweme.lancet.d.f107196d;
            }
            return file.getParentFile().getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    private static float a(long j2, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j2).divide(bigDecimal, 4, 4).doubleValue();
    }

    private static Object a(Application application, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return application.getSystemService(str);
        } else if (!i.f107219a) {
            return application.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = application.getSystemService(str);
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

    private long b(File file, List<a> list) {
        long j2 = 0;
        if (file != null && file.exists() && !a(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.f26155j.f26125d) {
                    return length;
                }
                a aVar = new a(this, (byte) 0);
                aVar.f26162d = false;
                aVar.f26159a = file.getAbsolutePath();
                aVar.f26160b = length;
                list.add(aVar);
                return length;
            }
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                a aVar2 = new a(this, (byte) 0);
                aVar2.f26162d = file.isDirectory();
                aVar2.f26159a = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                aVar2.f26164f = arrayList;
                list.add(aVar2);
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && !a(file2)) {
                        j2 += b(file2, arrayList);
                    }
                }
                aVar2.f26160b = j2;
            }
        }
        return j2;
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

    private static ApplicationInfo a(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
    }
}
