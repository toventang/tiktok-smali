package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.common.TECloudCtrlInvoker;
import com.ss.android.ttve.common.g;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.runtime.a.a;
import java.text.SimpleDateFormat;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f151415a = "VECloudCtrlManager";

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f151416d;

    /* renamed from: e  reason: collision with root package name */
    private static String[] f151417e = {"vesdk_log_command"};

    /* renamed from: b  reason: collision with root package name */
    private boolean f151418b;

    /* renamed from: c  reason: collision with root package name */
    private TECloudCtrlInvoker f151419c = new TECloudCtrlInvoker();

    /* renamed from: f  reason: collision with root package name */
    private String f151420f;

    private a() {
    }

    static {
        Covode.recordClassIndex(99573);
    }

    public static a a() {
        MethodCollector.i(1772);
        if (f151416d == null) {
            synchronized (a.class) {
                try {
                    if (f151416d == null) {
                        f151416d = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1772);
                    throw th;
                }
            }
        }
        a aVar = f151416d;
        MethodCollector.o(1772);
        return aVar;
    }

    public final void a(String str) {
        this.f151420f = str;
        String[] strArr = f151417e;
        for (String str2 : strArr) {
            String str3 = (String) a.EnumC4060a.INSTANCE.mInstance.a(str2, "");
            if (!str3.isEmpty()) {
                b(str2, str3);
            }
        }
    }

    private static void a(String str, String str2) {
        a.EnumC4060a.INSTANCE.mInstance.a(str, str2, false);
    }

    private int b(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        g.a aVar;
        MethodCollector.i(98);
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (str.hashCode() == 2043549244 && str.equals("vesdk_log_command")) {
                if (jSONObject.has("enable")) {
                    str3 = jSONObject.getString("enable");
                } else {
                    str3 = "false";
                }
                String str7 = "2018-12-08 00:00:00";
                if (jSONObject.has("starttime")) {
                    str4 = jSONObject.getString("starttime");
                } else {
                    str4 = str7;
                }
                if (jSONObject.has("endtime")) {
                    str7 = jSONObject.getString("endtime");
                }
                if (jSONObject.has("level")) {
                    str5 = jSONObject.getString("level");
                } else {
                    str5 = "";
                }
                if (jSONObject.has("sign")) {
                    str6 = jSONObject.getString("sign");
                } else {
                    str6 = "";
                }
                String str8 = str + str3 + str4 + str7 + str5;
                TECloudCtrlInvoker tECloudCtrlInvoker = this.f151419c;
                if (str8.isEmpty() || str6.isEmpty() || tECloudCtrlInvoker.nativeVerifyJson(str8.getBytes(), str6.getBytes()) != 0) {
                    a(str, "");
                    an.d(f151415a, "Cloud Ctrl Command Json is doctored");
                    MethodCollector.o(98);
                    return -1;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = simpleDateFormat.parse(str4).getTime();
                long time2 = simpleDateFormat.parse(str7).getTime();
                long currentTimeMillis = System.currentTimeMillis();
                if (str5.hashCode() == 68 && str5.equals("D")) {
                    aVar = g.a.LEVEL0;
                } else {
                    aVar = g.a.LEVEL3;
                }
                if (!this.f151418b && str3.equals("true") && currentTimeMillis >= time && currentTimeMillis < time2) {
                    String str9 = this.f151420f + "/vesdklog";
                    an.b(f151415a, str9);
                    int initSpdLog = g.a().f61077a.initSpdLog(str9, aVar.ordinal(), 3);
                    if (initSpdLog < 0) {
                        an.d(f151415a, " TESpdLog init fail ".concat(String.valueOf(initSpdLog)));
                        MethodCollector.o(98);
                        return -3;
                    }
                    g.a().f61077a.setLevel(aVar.ordinal());
                    this.f151418b = true;
                } else if (str3.equals("false") || (currentTimeMillis < time && currentTimeMillis >= time2)) {
                    if (this.f151418b) {
                        g.a().f61077a.close();
                        this.f151418b = false;
                    }
                    an.b(f151415a, str + " expired");
                    a(str, "");
                }
                i2 = 0;
                MethodCollector.o(98);
                return i2;
            }
            an.d(f151415a, " json contail invalid command ");
            i2 = -2;
            MethodCollector.o(98);
            return i2;
        } catch (Exception e2) {
            an.d(f151415a, " json parse failed " + e2.toString());
            a(str, "");
        }
    }
}
