package com.bytedance.ammt.mmt;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.j.f;
import com.bytedance.crash.m;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f6480a = "UploadManager";

    /* renamed from: b  reason: collision with root package name */
    public static int f6481b = 88888;

    /* renamed from: c  reason: collision with root package name */
    public static String f6482c;

    /* renamed from: d  reason: collision with root package name */
    public static String f6483d;

    /* renamed from: e  reason: collision with root package name */
    private static String f6484e = "tombstone.txt";

    /* renamed from: f  reason: collision with root package name */
    private static String f6485f = "logcat.txt";

    static {
        Covode.recordClassIndex(3129);
    }

    /* access modifiers changed from: package-private */
    public static class a {
        static {
            Covode.recordClassIndex(3131);
        }

        public static void a() {
            File file = new File(c.f6483d);
            if (file.exists()) {
                a(file);
            }
            File file2 = new File(c.f6482c);
            if (file2.exists()) {
                a(file2);
            }
        }

        public static Header a(Context context) {
            Header a2 = Header.a(context);
            Header.addRuntimeHeader(a2.f27553a);
            Header.a(a2);
            a2.a(m.a().a());
            m.b().a();
            a2.d();
            m.a().e();
            a2.e();
            try {
                a2.f27553a.put("aid", c.f6481b);
            } catch (Exception unused) {
            }
            return a2;
        }

        public static JSONArray a(String str) {
            Matcher matcher = Pattern.compile("lib\\w+\\.so").matcher(str);
            HashSet<String> hashSet = new HashSet();
            while (matcher.find()) {
                hashSet.add(matcher.group());
            }
            JSONArray jSONArray = new JSONArray();
            for (String str2 : hashSet) {
                NativeTools.a();
                String g2 = NativeTools.g(str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str2);
                    jSONObject.put("lib_uuid", NativeTools.f(g2));
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            return jSONArray;
        }

        private static boolean a(File file) {
            MethodCollector.i(10731);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(10731);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(10731);
            return delete;
        }

        public static void a(final b bVar, final File file) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                new Thread(new Runnable(bVar) {
                    /* class com.bytedance.ammt.mmt.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f6489a;

                    static {
                        Covode.recordClassIndex(3132);
                    }

                    public final void run() {
                        if (f.a(m.f27730g.getNativeCrashUploadUrl(), bVar.f27557a.toString(), file).f27715a == 0) {
                            a.a();
                        }
                    }

                    {
                        this.f6489a = r1;
                    }
                }).start();
                return;
            }
            if (f.a(m.f27730g.getNativeCrashUploadUrl(), bVar.f27557a.toString(), file).f27715a == 0) {
                a();
            }
        }
    }

    static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        a.a();
        return sb.append(a.b(context)).append(File.separator).append("gmt").append(File.separator).append(f6484e).toString();
    }

    public static List<JSONObject> a(String str) {
        Throwable th;
        Exception e2;
        String str2;
        MethodCollector.i(7481);
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7481);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("report GL usage start")) {
                        JSONObject jSONObject = new JSONObject();
                        StringBuffer stringBuffer = new StringBuffer();
                        jSONObject.put(StringSet.name, "GL_USAGE");
                        jSONObject.put("usages", "null");
                        jSONObject.put("backtrace", "null");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            ALog.i("GL Usage", readLine2);
                            if (readLine2.startsWith("report GL usage end")) {
                                jSONObject.put("usages", stringBuffer.toString());
                                arrayList.add(jSONObject);
                                break;
                            }
                            stringBuffer.append(readLine2);
                            stringBuffer.append('\n');
                        }
                    }
                    if (readLine.startsWith("report GL unwind usage start")) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(StringSet.name, "GL_UNWIND_USAGE");
                        jSONObject2.put("usages", "null");
                        jSONObject2.put("backtrace", "null");
                        StringBuffer stringBuffer2 = new StringBuffer();
                        int i2 = 0;
                        while (true) {
                            String readLine3 = bufferedReader2.readLine();
                            if (readLine3 == null) {
                                break;
                            } else if (readLine3.startsWith("context")) {
                                jSONObject2.put("usages", readLine3);
                            } else if (readLine3.startsWith("report GL unwind usage end")) {
                                jSONObject2.put("backtrace", stringBuffer2.toString());
                                arrayList.add(jSONObject2);
                                break;
                            } else {
                                if (i2 >= 3) {
                                    int i3 = i2 - 3;
                                    if (i3 > 9) {
                                        str2 = String.valueOf(i3);
                                    } else {
                                        str2 = "0".concat(String.valueOf(i3));
                                    }
                                    stringBuffer2.append("    #" + str2 + " " + readLine3);
                                    stringBuffer2.append('\n');
                                }
                                i2++;
                            }
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    bufferedReader = bufferedReader2;
                    try {
                        e2.printStackTrace();
                        com.bytedance.crash.util.m.a(bufferedReader);
                        MethodCollector.o(7481);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.crash.util.m.a(bufferedReader);
                        MethodCollector.o(7481);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    com.bytedance.crash.util.m.a(bufferedReader);
                    MethodCollector.o(7481);
                    throw th;
                }
            }
            com.bytedance.crash.util.m.a(bufferedReader2);
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            com.bytedance.crash.util.m.a(bufferedReader);
            MethodCollector.o(7481);
            return arrayList;
        }
        MethodCollector.o(7481);
        return arrayList;
    }

    public static b a(Context context, String str) {
        Header a2 = a.a(context);
        b bVar = new b();
        bVar.a(a2);
        bVar.a("is_native_crash", (Object) 1);
        bVar.a("data", (Object) str);
        bVar.a("crash_lib_uuid", (Object) a.a(str));
        bVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        return bVar;
    }
}
