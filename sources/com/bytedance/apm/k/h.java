package com.bytedance.apm.k;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.b;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.m;
import com.bytedance.apm.q.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.slardar.config.IConfigManager;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends a {

    /* renamed from: d  reason: collision with root package name */
    public static String f25110d;

    /* renamed from: f  reason: collision with root package name */
    public static String f25111f;
    private static long t = 17179869184L;
    private u<b> A;
    private u<b> B;
    private u<d> C;

    /* renamed from: a  reason: collision with root package name */
    public long f25112a = 524288000;

    /* renamed from: b  reason: collision with root package name */
    public long f25113b = 524288000;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.apm.g.d f25114c;

    /* renamed from: e  reason: collision with root package name */
    public String f25115e;

    /* renamed from: g  reason: collision with root package name */
    public String f25116g;

    /* renamed from: h  reason: collision with root package name */
    public long f25117h;

    /* renamed from: i  reason: collision with root package name */
    public long f25118i;

    /* renamed from: j  reason: collision with root package name */
    public long f25119j;

    /* renamed from: k  reason: collision with root package name */
    public long f25120k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25121l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25122m;
    private int r = 20;
    private long s = 2592000000L;
    private boolean u;
    private List<a> v;
    private List<String> w = new ArrayList();
    private List<String> x = new ArrayList();
    private List<String> y = new ArrayList();
    private List<String> z = new ArrayList();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final long c() {
        return 120000;
    }

    /* access modifiers changed from: package-private */
    public static class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public String f25134a;

        /* renamed from: b  reason: collision with root package name */
        public long f25135b;

        /* renamed from: c  reason: collision with root package name */
        private int f25136c;

        static {
            Covode.recordClassIndex(14661);
        }

        public b() {
        }

        public JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f25134a;
                if (str.contains(h.f25110d)) {
                    str = str.replace(h.f25110d, "internal");
                } else if (str.contains(h.f25111f)) {
                    str = str.replace(h.f25111f, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f25135b);
                int i2 = this.f25136c;
                if (i2 > 0) {
                    jSONObject.put("num", i2);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j2 = this.f25135b;
            long j3 = ((b) obj).f25135b;
            if (j2 == j3) {
                return 0;
            }
            if (j2 > j3) {
                return 1;
            }
            return -1;
        }

        public b(String str, long j2, int i2) {
            this.f25134a = str;
            this.f25135b = j2;
            this.f25136c = i2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("dump_switch", true);
        this.f25122m = optBoolean;
        if (optBoolean) {
            long currentTimeMillis = System.currentTimeMillis() - b.a.f25049a.b("check_disk_last_time");
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.f25121l = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.f25112a = ((long) jSONObject.optInt("dump_threshold")) * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.f25113b = ((long) jSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.r = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.s = ((long) jSONObject.optInt("outdated_days")) * 86400000;
            }
            this.w = m.c(jSONObject, "disk_customed_paths");
            this.x = m.b(jSONObject, "ignored_relative_paths");
        }
        if (jSONObject.optBoolean("enable_collect_apm6", false)) {
            this.f25121l = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f25128a;

        /* renamed from: b  reason: collision with root package name */
        public long f25129b;

        /* renamed from: c  reason: collision with root package name */
        public float f25130c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f25131d;

        /* renamed from: e  reason: collision with root package name */
        public String f25132e;

        /* renamed from: f  reason: collision with root package name */
        public List<a> f25133f;

        static {
            Covode.recordClassIndex(14660);
        }

        private a() {
            this.f25132e = "normal";
            this.f25133f = new ArrayList();
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.f25128a;
                if (str.contains(h.f25110d)) {
                    str = str.replace(h.f25110d, "internal");
                } else if (str.contains(h.f25111f)) {
                    str = str.replace(h.f25111f, "external");
                }
                jSONObject.put("path", str);
                jSONObject.put("size", this.f25129b);
                jSONObject.put("size_rate", (double) this.f25130c);
                jSONObject.put("is_folder", this.f25131d);
                jSONObject.put("report_type", this.f25132e);
                if (!this.f25133f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (a aVar : this.f25133f) {
                        jSONArray.put(aVar.a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        public String f25137a;

        /* renamed from: b  reason: collision with root package name */
        public c f25138b;

        /* renamed from: c  reason: collision with root package name */
        public long f25139c;

        /* renamed from: d  reason: collision with root package name */
        public int f25140d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f25141e;

        /* renamed from: f  reason: collision with root package name */
        public long f25142f;

        /* renamed from: h  reason: collision with root package name */
        private int f25144h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f25145i;

        static {
            Covode.recordClassIndex(14662);
        }

        private boolean a() {
            if (this.f25144h == this.f25140d) {
                return true;
            }
            return false;
        }

        private void b() {
            if (TextUtils.equals(this.f25137a, h.f25110d)) {
                h.this.f25117h = this.f25139c;
            } else if (TextUtils.equals(this.f25137a, h.f25111f)) {
                h.this.f25118i = this.f25139c;
            } else if (TextUtils.equals(this.f25137a, h.this.f25115e)) {
                h.this.f25119j = this.f25139c;
            } else if (TextUtils.equals(this.f25137a, h.this.f25116g)) {
                h.this.f25120k = this.f25139c;
            }
        }

        private c() {
        }

        public final void a(long j2) {
            this.f25139c += j2;
            this.f25144h++;
            if (this.f25138b != null && a()) {
                if (this.f25145i) {
                    this.f25138b.f25145i = true;
                }
                if (this.f25139c >= h.this.f25113b && !this.f25145i) {
                    h.this.a(this.f25137a, this.f25139c, this.f25140d);
                    this.f25138b.f25145i = true;
                }
                this.f25138b.a(this.f25139c);
                if (this.f25141e) {
                    h.this.a(this.f25137a, this.f25139c, this.f25140d, this.f25142f);
                }
                b();
            }
        }

        /* synthetic */ c(h hVar, byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14658);
    }

    public h() {
        this.p = "disk";
    }

    /* access modifiers changed from: package-private */
    public static class d extends b {

        /* renamed from: c  reason: collision with root package name */
        public long f25146c;

        /* renamed from: d  reason: collision with root package name */
        private String f25147d;

        /* renamed from: e  reason: collision with root package name */
        private int f25148e;

        /* renamed from: f  reason: collision with root package name */
        private long f25149f;

        static {
            Covode.recordClassIndex(14663);
        }

        @Override // com.bytedance.apm.k.h.b
        public final JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f25147d;
                if (str.contains(h.f25110d)) {
                    str = str.replace(h.f25110d, "internal");
                } else if (str.contains(h.f25111f)) {
                    str = str.replace(h.f25111f, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f25146c);
                int i2 = this.f25148e;
                if (i2 > 0) {
                    jSONObject.put("num", i2);
                }
                jSONObject.put("outdate_interval", this.f25149f);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable, com.bytedance.apm.k.h.b
        public final int compareTo(Object obj) {
            long j2 = this.f25149f;
            long j3 = ((d) obj).f25149f;
            if (j2 == j3) {
                return 0;
            }
            if (j2 > j3) {
                return 1;
            }
            return -1;
        }

        public d(String str, long j2, int i2, long j3) {
            this.f25147d = str;
            this.f25146c = j2;
            this.f25148e = i2;
            this.f25149f = j3;
        }
    }

    @Override // com.bytedance.apm.k.a
    public final void e() {
        List<a> list;
        File file;
        boolean z2 = this.o;
        if (!this.f25121l && z2) {
            if (f25110d == null) {
                Context context = com.bytedance.apm.c.f24685a;
                try {
                    context.getPackageName();
                    if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                        com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
                    }
                    f25110d = com.ss.android.ugc.aweme.lancet.d.f107195c.getParent();
                    if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                        com.ss.android.ugc.aweme.lancet.d.f107194b = context.getCacheDir();
                    }
                    this.f25115e = com.ss.android.ugc.aweme.lancet.d.f107194b.getAbsolutePath();
                    if (!TextUtils.isEmpty(null)) {
                        file = context.getExternalFilesDir(null);
                    } else {
                        if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                            com.ss.android.ugc.aweme.lancet.d.f107196d = context.getExternalFilesDir(null);
                        }
                        file = com.ss.android.ugc.aweme.lancet.d.f107196d;
                    }
                    f25111f = file.getParentFile().getAbsolutePath();
                    if (com.ss.android.ugc.aweme.lancet.d.f107193a == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                        com.ss.android.ugc.aweme.lancet.d.f107193a = context.getExternalCacheDir();
                    }
                    File file2 = com.ss.android.ugc.aweme.lancet.d.f107193a;
                    if (file2 != null) {
                        this.f25116g = file2.getAbsolutePath();
                    }
                    List<String> list2 = this.x;
                    if (list2 != null) {
                        for (String str : list2) {
                            if (str.contains("internal")) {
                                this.y.add(str.replace("internal", f25110d));
                            } else if (str.contains("external")) {
                                this.y.add(str.replace("external", f25111f));
                            }
                        }
                    }
                    List<String> list3 = this.w;
                    if (list3 != null) {
                        for (String str2 : list3) {
                            if (str2.contains("internal")) {
                                this.z.add(str2.replace("internal", f25110d));
                            } else if (str2.contains("external")) {
                                this.z.add(str2.replace("external", f25111f));
                            }
                        }
                    }
                } catch (Exception unused) {
                    this.u = true;
                }
            }
            if (this.u) {
                this.f25121l = true;
                return;
            }
            if (this.f25122m) {
                try {
                    byte b2 = 0;
                    String[] strArr = {f25110d, f25111f};
                    this.v = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        String str3 = strArr[i2];
                        a(new File(str3), 1, true, this.v);
                        File file3 = new File(str3);
                        c cVar = new c(this, b2);
                        cVar.f25137a = str3;
                        cVar.f25138b = new c(this, b2);
                        File[] listFiles = file3.listFiles();
                        if (!(listFiles == null || listFiles.length == 0)) {
                            cVar.f25140d = listFiles.length;
                            LinkedList linkedList = new LinkedList();
                            linkedList.offer(cVar);
                            while (!linkedList.isEmpty()) {
                                int size = linkedList.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    c cVar2 = (c) linkedList.poll();
                                    if (cVar2 != null) {
                                        String str4 = cVar2.f25137a;
                                        File file4 = new File(str4);
                                        if (!file4.exists() || this.y.contains(str4)) {
                                            cVar2.f25138b.f25140d--;
                                        } else if (file4.isFile()) {
                                            long length = file4.length();
                                            if (length > 0) {
                                                if (com.bytedance.apm.c.e()) {
                                                    String[] strArr2 = new String[1];
                                                    String str5 = "appendExceptionFileQueue: path: " + str4 + ", size: " + length;
                                                }
                                                if (length <= t) {
                                                    if (this.A == null) {
                                                        this.A = new u<>(this.r);
                                                    }
                                                    this.A.a(new b(str4, length, 1));
                                                }
                                            }
                                            if (cVar2.f25138b != null) {
                                                cVar2.f25138b.a(length);
                                                if (!cVar2.f25138b.f25141e) {
                                                    long b3 = b(file4.lastModified());
                                                    if (b3 > 0) {
                                                        a(str4, length, 0, b3);
                                                    }
                                                }
                                            }
                                        } else {
                                            File[] listFiles2 = file4.listFiles();
                                            if (listFiles2 == null || listFiles2.length == 0) {
                                                cVar2.f25138b.a(0);
                                            } else {
                                                cVar2.f25140d = listFiles2.length;
                                                int length2 = listFiles2.length;
                                                int i4 = 0;
                                                while (i4 < length2) {
                                                    File file5 = listFiles2[i4];
                                                    c cVar3 = new c(this, b2);
                                                    cVar3.f25138b = cVar2;
                                                    cVar3.f25137a = file5.getAbsolutePath();
                                                    if (file5.isDirectory() && !cVar2.f25141e) {
                                                        long b4 = b(file5.lastModified());
                                                        if (b4 > 0) {
                                                            cVar3.f25141e = true;
                                                            cVar3.f25142f = b4;
                                                        }
                                                    }
                                                    linkedList.offer(cVar3);
                                                    i4++;
                                                    b2 = 0;
                                                }
                                            }
                                        }
                                    }
                                    i3++;
                                    b2 = 0;
                                }
                            }
                        }
                        i2++;
                        b2 = 0;
                        if (i2 >= 2) {
                            break;
                        }
                    }
                    List<String> list4 = this.z;
                    if (list4 != null && list4.size() > 0) {
                        for (String str6 : this.z) {
                            a(new File(str6), 1, false, this.v);
                        }
                    }
                    for (a aVar : this.v) {
                        if ("normal".equals(aVar.f25132e) && (list = aVar.f25133f) != null && !list.isEmpty()) {
                            for (a aVar2 : list) {
                                aVar.f25129b += aVar2.f25129b;
                            }
                        }
                    }
                    a(this.f25118i + this.f25117h, this.f25120k + this.f25119j, Environment.getRootDirectory().getTotalSpace() + Environment.getDataDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
                    b.a.f25049a.a("check_disk_last_time", System.currentTimeMillis());
                } catch (Throwable unused2) {
                }
            } else {
                a(com.bytedance.apm.q.b.a(com.bytedance.apm.c.f24685a), com.bytedance.apm.q.b.b(com.bytedance.apm.c.f24685a), com.bytedance.apm.q.b.f() + com.bytedance.apm.q.b.a(Environment.getRootDirectory()), Environment.getDataDirectory().getFreeSpace());
            }
            this.f25121l = true;
            i();
            ActivityLifeObserver.getInstance().unregister(this);
            ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).unregisterConfigListener(this);
        }
    }

    private boolean a(a aVar) {
        for (String str : this.y) {
            if (aVar.f25128a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private long b(long j2) {
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis < this.s || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    private long a(File file) {
        long j2;
        long j3 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j2 = a(file2);
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

    private static List<String> a(u<? extends b> uVar) {
        if (uVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (b bVar : uVar.a()) {
            linkedList.add(bVar.f25134a);
        }
        return linkedList;
    }

    private static float a(long j2, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j2).divide(bigDecimal, 4, 4).doubleValue();
    }

    public final void a(String str, long j2, int i2) {
        if (j2 <= t) {
            if (this.B == null) {
                this.B = new u<>(this.r);
            }
            this.B.a(new b(str, j2, i2));
        }
    }

    private void a(File file, int i2, boolean z2, List<a> list) {
        if (i2 <= 2 && file != null && file.exists() && !this.y.contains(file.getAbsolutePath())) {
            if (!file.isDirectory()) {
                a aVar = new a((byte) 0);
                aVar.f25131d = false;
                aVar.f25128a = file.getAbsolutePath();
                aVar.f25129b = file.length();
                if (!z2) {
                    aVar.f25132e = "custom";
                }
                list.add(aVar);
            } else if (z2) {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists() && !this.y.contains(file2.getAbsolutePath())) {
                            a aVar2 = new a((byte) 0);
                            aVar2.f25131d = file2.isDirectory();
                            aVar2.f25128a = file2.getAbsolutePath();
                            if (file2.isDirectory()) {
                                ArrayList arrayList = new ArrayList();
                                aVar2.f25133f = arrayList;
                                if (i2 == 2) {
                                    aVar2.f25129b = a(file2);
                                }
                                a(file2, i2 + 1, z2, arrayList);
                                list.add(aVar2);
                            } else {
                                aVar2.f25129b = file2.length();
                                list.add(aVar2);
                            }
                        }
                    }
                }
            } else {
                a aVar3 = new a((byte) 0);
                aVar3.f25131d = true;
                aVar3.f25132e = "custom";
                aVar3.f25128a = file.getAbsolutePath();
                aVar3.f25129b = a(file);
                list.add(aVar3);
            }
        }
    }

    private void a(long j2, long j3, long j4, long j5) {
        final long j6;
        try {
            if (com.bytedance.apm.c.e()) {
                String[] strArr = new String[1];
                String str = "disk: data: " + j2 + " , cache: " + j3 + " , total: " + j4 + " , free: " + j5;
            }
            long j7 = t;
            if (j2 > j7) {
                j6 = j7;
            } else {
                j6 = j2;
            }
            if (j3 <= j7) {
                j7 = j3;
            }
            JSONObject jSONObject = new JSONObject();
            if (j2 > 0) {
                jSONObject.put("data", j6);
            }
            if (j3 > 0) {
                jSONObject.put("cache", j7);
            }
            if (j4 > 0) {
                jSONObject.put("total", j4 / 1073741824);
            }
            if (j5 > 0) {
                jSONObject.put("rom_free", j5 / 1073741824);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.f25122m && j6 > this.f25112a) {
                if (this.A != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (b bVar : this.A.a()) {
                        JSONObject a2 = bVar.a();
                        if (a2 != null) {
                            jSONArray.put(a2);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.B != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (b bVar2 : this.B.a()) {
                        JSONObject a3 = bVar2.a();
                        if (a3 != null) {
                            jSONArray2.put(a3);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.C != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (d dVar : this.C.a()) {
                        JSONObject a4 = dVar.a();
                        if (a4 != null) {
                            jSONArray3.put(a4);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<a> list = this.v;
                if (list != null && !list.isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j6);
                    JSONArray jSONArray4 = new JSONArray();
                    for (a aVar : this.v) {
                        if (a(aVar)) {
                            aVar.f25130c = 0.0f;
                        } else {
                            aVar.f25130c = a(aVar.f25129b, bigDecimal);
                        }
                        List<a> list2 = aVar.f25133f;
                        if (list2 != null && list2.size() > 0) {
                            for (a aVar2 : list2) {
                                if (a(aVar2)) {
                                    aVar2.f25130c = 0.0f;
                                } else {
                                    aVar2.f25130c = a(aVar2.f25129b, bigDecimal);
                                }
                            }
                        }
                        jSONArray4.put(aVar.a());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                if (this.f25114c != null) {
                    final List<String> a5 = a(this.A);
                    final List<String> a6 = a(this.B);
                    final List<String> a7 = a(this.C);
                    b.a.f25210a.b(new Runnable() {
                        /* class com.bytedance.apm.k.h.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14659);
                        }

                        public final void run() {
                        }
                    });
                }
                this.A = null;
                this.B = null;
                this.C = null;
                this.v = null;
            }
            a(new f("disk", "storageUsed", jSONObject, null, jSONObject2));
        } catch (Exception unused) {
        }
    }

    public final void a(String str, long j2, int i2, long j3) {
        if (com.bytedance.apm.c.e()) {
            String[] strArr = new String[1];
            String str2 = "appendutdatedFileQueue: path: " + str + ", size: " + j2;
        }
        if (j2 >= 102400 && j2 <= t) {
            if (this.C == null) {
                this.C = new u<>(this.r);
            }
            this.C.a(new d(str, j2, i2, j3));
        }
    }
}
