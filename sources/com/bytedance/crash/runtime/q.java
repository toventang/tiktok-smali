package com.bytedance.crash.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.m;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q {

    /* renamed from: e  reason: collision with root package name */
    private static q f27940e;

    /* renamed from: a  reason: collision with root package name */
    public final File f27941a;

    /* renamed from: b  reason: collision with root package name */
    final File f27942b;

    /* renamed from: c  reason: collision with root package name */
    public final File f27943c;

    /* renamed from: d  reason: collision with root package name */
    public int f27944d = -1;

    /* renamed from: f  reason: collision with root package name */
    private final Context f27945f;

    /* renamed from: g  reason: collision with root package name */
    private a f27946g;

    /* renamed from: h  reason: collision with root package name */
    private File[] f27947h;

    static {
        Covode.recordClassIndex(16353);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(java.lang.String r10, long r11, long r13) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.q.a(java.lang.String, long, long):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00bb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x00bb }, LOOP:0: B:28:0x00a4->B:30:0x00ac, LOOP_START, PHI: r2 
      PHI: (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:26:0x00a1, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r15, org.json.JSONArray r16) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.q.a(java.util.Map, org.json.JSONArray):void");
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f27952a;

        /* renamed from: b  reason: collision with root package name */
        public long f27953b;

        /* renamed from: c  reason: collision with root package name */
        public final File f27954c;

        /* renamed from: d  reason: collision with root package name */
        long f27955d;

        /* renamed from: e  reason: collision with root package name */
        private JSONObject f27956e;

        static {
            Covode.recordClassIndex(16357);
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            return b().optJSONObject("header");
        }

        public final JSONObject b() {
            if (this.f27956e == null) {
                try {
                    this.f27956e = new JSONObject(j.a(this.f27954c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f27956e == null) {
                    this.f27956e = new JSONObject();
                }
            }
            return this.f27956e;
        }

        private a(File file) {
            this.f27954c = file;
            String[] split = file.getName().split("-|\\.");
            this.f27952a = Long.parseLong(split[0]);
            this.f27953b = Long.parseLong(split[1]);
        }

        public static boolean a(File file) {
            MethodCollector.i(8781);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(8781);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(8781);
            return delete;
        }

        /* synthetic */ a(File file, byte b2) {
            this(file);
        }
    }

    public static q a() {
        if (f27940e == null) {
            f27940e = new q(m.f27724a);
        }
        return f27940e;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        try {
            return j.a(this.f27942b.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return j.a(this.f27943c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final File[] a(File file) {
        if (this.f27947h == null) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                /* class com.bytedance.crash.runtime.q.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16354);
                }

                public final boolean accept(File file, String str) {
                    if (!str.contains(".ctx") || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                        return false;
                    }
                    return true;
                }
            });
            this.f27947h = listFiles;
            if (listFiles == null) {
                this.f27947h = new File[0];
            }
        }
        return this.f27947h;
    }

    private q(Context context) {
        String c2;
        String j2 = r.j(context);
        StringBuilder sb = new StringBuilder("npth/RuntimeContext/");
        if (b.b(context)) {
            c2 = "main";
        } else {
            c2 = b.c(context);
        }
        File file = new File(j2, sb.append(c2.replaceAll(":", "@")).toString());
        if (!file.exists() || (!file.isDirectory() && b(file))) {
            file.mkdirs();
            com.bytedance.crash.runtime.a.a.f27846e = true;
        }
        this.f27941a = file;
        this.f27942b = new File(file.getParent(), "did");
        this.f27943c = new File(file.getParent(), "device_uuid");
        this.f27945f = context;
    }

    private static boolean b(File file) {
        MethodCollector.i(10958);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10958);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10958);
        return delete;
    }

    public final int a(String str) {
        Object opt;
        int i2 = this.f27944d;
        if (i2 != -1) {
            return i2;
        }
        File[] a2 = a(this.f27941a);
        if (a2 == null || a2.length == 0) {
            this.f27944d = 2;
            return 2;
        }
        long j2 = -1;
        String str2 = null;
        File file = null;
        for (File file2 : a2) {
            try {
                long parseLong = Long.parseLong(file2.getName().split("-|\\.")[1]);
                if (parseLong > j2) {
                    file = file2;
                    j2 = parseLong;
                }
            } catch (Throwable unused) {
                if (file == null) {
                    file = file2;
                }
            }
        }
        if (file == null) {
            this.f27944d = 2;
            return 2;
        }
        try {
            a aVar = new a(file, (byte) 0);
            if (!(aVar.a() == null || (opt = aVar.a().opt("update_version_code")) == null)) {
                str2 = String.valueOf(opt);
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                this.f27944d = 1;
                return 1;
            }
        } catch (Throwable unused2) {
            m.f27730g.isDebugMode();
        }
        this.f27944d = 0;
        return 0;
    }

    public final JSONArray a(long j2) {
        JSONArray jSONArray;
        a aVar;
        Throwable th;
        String str;
        Iterator<a> it = a(this.f27941a, ".allData").iterator();
        while (true) {
            jSONArray = null;
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (j2 >= aVar.f27952a && j2 <= aVar.f27953b) {
                break;
            }
        }
        if (aVar == null) {
            aVar = a(this.f27941a, j2, ".allData");
        }
        if (aVar == null) {
            return null;
        }
        try {
            str = j.a(aVar.f27954c.getAbsolutePath(), "\n");
            try {
                jSONArray = new JSONArray(str);
                return jSONArray;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            d.a("NPTH_CATCH", new IOException("content :".concat(String.valueOf(str)), th));
            return jSONArray;
        }
    }

    private ArrayList<a> a(File file, final String str) {
        File[] listFiles = file.listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.q.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16355);
            }

            public final boolean accept(File file, String str) {
                if (!str.endsWith(str) || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                    return false;
                }
                return true;
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        v.a("foundRuntimeContextFiles " + listFiles.length);
        a aVar = null;
        for (File file2 : listFiles) {
            try {
                a aVar2 = new a(file2, (byte) 0);
                arrayList.add(aVar2);
                if (this.f27946g == null && ".ctx2".equals(str)) {
                    if (aVar != null) {
                        if (aVar2.f27953b >= aVar.f27953b) {
                        }
                    }
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        if (this.f27946g == null && aVar != null) {
            this.f27946g = aVar;
        }
        Collections.sort(arrayList, new Comparator<a>() {
            /* class com.bytedance.crash.runtime.q.AnonymousClass3 */

            static {
                Covode.recordClassIndex(16356);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
                return (int) (aVar.f27953b - aVar2.f27953b);
            }
        });
        return arrayList;
    }

    private a a(File file, long j2, long j3) {
        Iterator<a> it = a(file, ".ctx2").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (j2 == next.f27952a) {
                if (aVar == null) {
                    aVar = next;
                }
                if (j3 >= next.f27953b) {
                    aVar = next;
                }
            } else if (aVar != null) {
                break;
            }
        }
        return aVar;
    }

    private a a(File file, long j2, String str) {
        Iterator<a> it = a(file, str).iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (j2 > next.f27953b) {
                next.f27955d = next.f27953b;
                aVar = next;
            } else if (aVar != null) {
                return aVar;
            } else {
                next.f27955d = next.f27953b;
                return next;
            }
        }
        return aVar;
    }

    private void a(long j2, long j3, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f27941a, j2 + "-" + j3 + ".ctx2");
        File file2 = new File(this.f27941a, j2 + "-" + j3 + ".allData");
        try {
            j.a(file, jSONObject);
            j.a(file2, jSONArray);
            this.f27946g = new a(file, (byte) 0);
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
    }
}
