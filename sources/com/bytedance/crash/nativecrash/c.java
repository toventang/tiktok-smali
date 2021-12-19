package com.bytedance.crash.nativecrash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.e;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.o;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.ac;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.x;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f27775f;

    /* renamed from: a  reason: collision with root package name */
    public b f27776a;

    /* renamed from: b  reason: collision with root package name */
    public String f27777b;

    /* renamed from: c  reason: collision with root package name */
    public a f27778c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f27779d;

    /* renamed from: e  reason: collision with root package name */
    private String f27780e;

    static {
        Covode.recordClassIndex(16274);
    }

    public final boolean f() {
        return j.a(this.f27776a.f27783c);
    }

    public static long c() {
        if (NativeTools.a().c()) {
            return Long.MAX_VALUE;
        }
        if (Header.a()) {
            return 3891200;
        }
        return 2867200;
    }

    public final boolean a() {
        ICrashFilter crashFilter = m.f27731h.getCrashFilter();
        if (crashFilter == null) {
            return true;
        }
        try {
            if (!crashFilter.onNativeCrashFilter(h(), "")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return true;
        }
    }

    private String h() {
        b bVar = this.f27776a;
        if (bVar == null) {
            return null;
        }
        String a2 = bVar.f27781a.a();
        if (a2 == null || a2.isEmpty()) {
            return this.f27776a.f27782b.f27774a.get("signal_line");
        }
        return a2;
    }

    public static boolean g() {
        Boolean bool = f27775f;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i2 = 0;
        do {
            try {
                if (new File(strArr[i2]).exists()) {
                    Boolean bool2 = true;
                    f27775f = bool2;
                    return bool2.booleanValue();
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
            i2++;
        } while (i2 < 11);
        Boolean bool3 = false;
        f27775f = bool3;
        return bool3.booleanValue();
    }

    public final String b() {
        Throwable th;
        MethodCollector.i(8329);
        File a2 = r.a(this.f27776a.f27783c);
        StringBuilder sb = new StringBuilder();
        if (a2.exists() && a2.length() > 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(a2));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (readLine.startsWith("coresize:")) {
                                sb.append(readLine.substring(9)).append('\n');
                                this.f27780e = sb.toString();
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            d.a("NPTH_CATCH", th);
                            com.bytedance.crash.util.m.a(bufferedReader);
                            String str = this.f27780e;
                            MethodCollector.o(8329);
                            return str;
                        } catch (Throwable th3) {
                            com.bytedance.crash.util.m.a(bufferedReader);
                            MethodCollector.o(8329);
                            throw th3;
                        }
                    }
                }
                com.bytedance.crash.util.m.a(bufferedReader2);
            } catch (Throwable th4) {
                th = th4;
                d.a("NPTH_CATCH", th);
                com.bytedance.crash.util.m.a(bufferedReader);
                String str2 = this.f27780e;
                MethodCollector.o(8329);
                return str2;
            }
        }
        String str22 = this.f27780e;
        MethodCollector.o(8329);
        return str22;
    }

    public final JSONObject d() {
        try {
            com.bytedance.crash.entity.b bVar = new com.bytedance.crash.entity.b();
            a(bVar);
            a aVar = this.f27778c;
            if (aVar != null) {
                try {
                    String str = aVar.f27768a;
                    if (str != null) {
                        bVar.a("pid", (Object) str);
                    }
                    String str2 = this.f27778c.f27769b;
                    if (str2 != null) {
                        bVar.a("crash_thread_name", (Object) str2);
                    }
                    long j2 = this.f27778c.f27771d;
                    if (j2 != 0) {
                        bVar.a("crash_time", Long.valueOf(j2));
                    }
                    if (this.f27778c.f27770c != null) {
                        bVar.a("data", (Object) this.f27778c.f27770c);
                    } else {
                        bVar.a("data", "AsanReport is Null\n");
                    }
                    bVar.a("crash_type", (Object) CrashType.ASAN.toString());
                    bVar.a("commit_id", "1");
                    bVar.a("jenkins_job_id", "1");
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                }
            }
            a(bVar, this.f27778c.f27772e);
            b(bVar);
            File file = new File(this.f27776a.f27783c, "upload.json");
            JSONObject jSONObject = bVar.f27557a;
            j.a(file, jSONObject);
            return jSONObject;
        } catch (Throwable th2) {
            d.a("NPTH_CATCH", th2);
            return null;
        }
    }

    public final JSONObject e() {
        Map<String, String> map;
        boolean z;
        try {
            com.bytedance.crash.entity.b bVar = new com.bytedance.crash.entity.b();
            b bVar2 = this.f27776a;
            if (bVar2 != null) {
                map = bVar2.f27782b.f27774a;
            } else {
                map = null;
            }
            if (map != null) {
                Object obj = (String) map.get("process_name");
                if (obj != null) {
                    bVar.a("process_name", obj);
                }
                String str = map.get("start_time");
                if (str != null) {
                    try {
                        bVar.a(Long.decode(str).longValue(), 0);
                    } catch (Throwable th) {
                        d.a("NPTH_CATCH", th);
                    }
                }
                String str2 = map.get("pid");
                if (str2 != null) {
                    try {
                        bVar.a("pid", Long.decode(str2));
                    } catch (Throwable th2) {
                        d.a("NPTH_CATCH", th2);
                    }
                }
                String str3 = map.get("start_pid");
                if (str3 != null) {
                    try {
                        bVar.a("start_pid", Long.decode(str3));
                    } catch (Throwable th3) {
                        d.a("NPTH_CATCH", th3);
                    }
                }
                Object obj2 = (String) map.get("crash_thread_name");
                if (obj2 != null) {
                    bVar.a("crash_thread_name", obj2);
                }
                String str4 = map.get("crash_time");
                if (str4 != null) {
                    try {
                        bVar.a("crash_time", Long.decode(str4));
                    } catch (Throwable th4) {
                        d.a("NPTH_CATCH", th4);
                    }
                }
                bVar.a("data", (Object) h());
            }
            a(bVar);
            a(bVar, this.f27776a.f27781a.f27836i);
            if (j.a(bVar, this.f27776a.f27783c) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar.b(ac.a());
                bVar.a("has_callback", "false");
            } else {
                bVar.a("has_callback", "true");
            }
            if (bVar.f27557a.opt("storage") == null) {
                bVar.b(ac.a());
            }
            Header header = new Header(this.f27779d);
            header.a(bVar.f27557a.optJSONObject("header"));
            bVar.a(header);
            Header.a(header);
            com.bytedance.crash.entity.b a2 = Header.a(bVar.f27557a.optString("process_name"), m.f27724a, bVar.f27557a.optLong("app_start_time", 0), bVar.f27557a.optLong("crash_time", 0));
            if (n.a(header.f27553a)) {
                bVar.a(a2.a().f27553a);
            } else {
                n.a(header.f27553a, a2.a().f27553a);
            }
            n.a(bVar.b(), a2.b());
            if (header.f27553a.has("params_err")) {
                com.bytedance.crash.entity.b.a(bVar.f27557a, "filters", "params_err", header.f27553a.optString("params_err"));
            }
            x.a(bVar, header, CrashType.NATIVE);
            File file = new File(this.f27776a.f27783c, "javastack.txt");
            String str5 = "";
            if (file.exists()) {
                try {
                    str5 = ab.a(file.getAbsolutePath());
                } catch (Throwable th5) {
                    d.a("NPTH_CATCH", th5);
                }
            }
            File file2 = new File(this.f27776a.f27783c, "abortmsg.txt");
            if (file2.exists()) {
                String a3 = a.a(file2);
                if (!str5.isEmpty()) {
                    str5 = str5 + "\n" + a3;
                } else {
                    str5 = a3;
                }
            }
            try {
                if (!str5.isEmpty()) {
                    bVar.a("java_data", (Object) str5);
                }
            } catch (Throwable th6) {
                d.a("NPTH_CATCH", th6);
            }
            bVar.a("logcat", com.bytedance.crash.runtime.j.a(this.f27776a.f27783c.getName()));
            File file3 = new File(this.f27776a.f27783c, "flog.txt");
            if (file3.exists()) {
                try {
                    bVar.a("native_log", j.b(j.a(file3.getAbsolutePath(), "\n"), "\n"));
                } catch (Throwable th7) {
                    d.a("NPTH_CATCH", th7);
                }
            }
            b(bVar);
            return bVar.f27557a;
        } catch (Throwable th8) {
            d.a("NPTH_CATCH", th8);
            return null;
        }
    }

    public c(Context context) {
        this.f27779d = context;
    }

    public final void a(File file) {
        this.f27776a = new b(file);
        this.f27777b = file.getName();
    }

    private void a(com.bytedance.crash.entity.b bVar) {
        bVar.a("is_native_crash", (Object) 1);
        bVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        bVar.a("crash_uuid", (Object) this.f27776a.f27783c.getName());
        bVar.a("jiffy", Long.valueOf(o.a.a()));
    }

    static class a {
        static {
            Covode.recordClassIndex(16275);
        }

        public static String a(File file) {
            Throwable th;
            MethodCollector.i(11645);
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        com.bytedance.crash.util.m.a(bufferedReader2);
                        MethodCollector.o(11645);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        com.bytedance.crash.util.m.a(bufferedReader2);
                        MethodCollector.o(11645);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                                sb.append("\n");
                            } else {
                                String sb2 = sb.toString();
                                com.bytedance.crash.util.m.a(bufferedReader2);
                                MethodCollector.o(11645);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        d.a("NPTH_CATCH", th);
                        com.bytedance.crash.util.m.a(bufferedReader);
                        MethodCollector.o(11645);
                        return "";
                    } catch (Throwable th3) {
                        com.bytedance.crash.util.m.a(bufferedReader);
                        MethodCollector.o(11645);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                d.a("NPTH_CATCH", th);
                com.bytedance.crash.util.m.a(bufferedReader);
                MethodCollector.o(11645);
                return "";
            }
        }
    }

    private void b(com.bytedance.crash.entity.b bVar) {
        boolean z;
        e.a(bVar.f27557a);
        HashMap hashMap = new HashMap();
        if (g()) {
            hashMap.put("is_root", "true");
            bVar.a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            bVar.a("is_root", "false");
        }
        if (a(this.f27776a.f27783c, "asan_report")) {
            hashMap.put("has_asan", "true");
            if (this.f27778c != null) {
                hashMap.put("has_asan_file", "true");
            }
        }
        hashMap.put("sdk_version", "3.1.6-rc.13-ttp");
        if (bVar.f27557a.opt("java_data") != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("has_java_stack", String.valueOf(z));
        bVar.a("is_64_devices", String.valueOf(Header.a()));
        bVar.a("is_64_runtime", String.valueOf(NativeTools.a().c()));
        bVar.a("is_x86_devices", String.valueOf(Header.b()));
        bVar.a(hashMap);
    }

    private static void a(com.bytedance.crash.entity.b bVar, Map<String, String> map) {
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                String f2 = NativeTools.f(map.get(str));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str);
                    jSONObject.put("lib_uuid", f2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    d.a("NPTH_CATCH", e2);
                }
            }
            bVar.a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final h f27781a;

        /* renamed from: b  reason: collision with root package name */
        public final b f27782b;

        /* renamed from: c  reason: collision with root package name */
        public final File f27783c;

        static {
            Covode.recordClassIndex(16276);
        }

        public b(File file) {
            MethodCollector.i(9807);
            this.f27783c = file;
            b bVar = new b(file);
            this.f27782b = bVar;
            h hVar = new h(file);
            this.f27781a = hVar;
            if (bVar.a() && hVar.f27834g == null) {
                File a2 = r.a(file);
                if (a2.exists()) {
                    a2.renameTo(new File(a2.getAbsoluteFile() + ".old"));
                }
                if (NativeImpl.f27758a) {
                    NativeImpl.doRebuildTombstone(r.b(file).getAbsolutePath(), r.a(file).getAbsolutePath(), new File(r.a(m.f27724a, file.getName()), "maps.txt").getAbsolutePath());
                }
                hVar.b(r.a(file));
            }
            MethodCollector.o(9807);
        }
    }

    private static boolean a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().contains(str)) {
                    return true;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
                j.a(file2);
            }
        }
        return false;
    }
}
