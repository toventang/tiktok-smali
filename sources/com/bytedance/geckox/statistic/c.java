package com.bytedance.geckox.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.d.b;
import com.bytedance.geckox.f;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.statistic.model.SettingsUpdateData;
import com.bytedance.geckox.utils.j;
import com.bytedance.geckox.utils.l;
import com.bytedance.geckox.utils.n;
import com.bytedance.geckox.utils.o;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f30062a;

    /* renamed from: b  reason: collision with root package name */
    private static long f30063b;

    static {
        Covode.recordClassIndex(17469);
    }

    public static void a(ArrayList<com.bytedance.geckox.statistic.model.c> arrayList, long j2) {
        a c2;
        if (arrayList.size() != 0 && (c2 = c()) != null) {
            try {
                Iterator<com.bytedance.geckox.statistic.model.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bytedance.geckox.statistic.model.c next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    a(jSONObject);
                    jSONObject.put("access_key", next.f30095a);
                    jSONObject.put("access_key_resource_usage", next.f30096b);
                    jSONObject.put("channel_count", next.f30097c);
                    jSONObject.put("gecko_total_resource_usage", j2);
                    c2.a("geckosdk_access_key_resource_info", jSONObject);
                }
            } catch (Exception unused) {
                a.a();
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        Common b2 = b();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", b2.deviceId);
        jSONObject.put("device_model", b2.deviceModel);
        jSONObject.put("os", 0);
        jSONObject.put("os_version", b2.osVersion);
        jSONObject.put("region", b2.region);
        jSONObject.put("app_version", b2.appVersion);
        jSONObject.put("sdk_version", b2.sdkVersion);
        jSONObject.put("aid", b2.aid);
        jSONObject.put("ac", b2.ac);
    }

    private static Common b() {
        Context context = f.a().f29844c;
        Common b2 = f.a().b();
        b2.ac = j.a(context);
        b2.appName = com.bytedance.geckox.utils.a.b(context);
        return b2;
    }

    private static a c() {
        GeckoGlobalConfig d2 = f.a().d();
        if (d2 == null) {
            return f.a().f29850j;
        }
        return d2.getStatisticMonitor();
    }

    public static void a() {
        if (f.a().d() != null) {
            Context context = f.a().d().getContext();
            if (f30062a == null) {
                f30062a = n.a().b(context, "gecko_resource_info", "2021-09-15");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            if (!TextUtils.equals(format, f30062a)) {
                f30062a = format;
                n.a().a(context, "gecko_resource_info", format);
                a.a("gecko_resource_info upload date: ", format);
                o.a().b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(17470);
                    }

                    public final void run() {
                        File[] listFiles;
                        Map<String, String> map = f.a().f29842a;
                        ArrayList arrayList = new ArrayList();
                        long j2 = 0;
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && (listFiles = new File(value, key).listFiles(new FileFilter() {
                                /* class com.bytedance.geckox.statistic.c.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(17471);
                                }

                                public final boolean accept(File file) {
                                    return file.isDirectory();
                                }
                            })) != null && listFiles.length != 0) {
                                long j3 = 0;
                                for (File file : listFiles) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long[] a2 = l.a(file);
                                    j3 += a2[3];
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    String name = file.getName();
                                    if (com.bytedance.geckox.statistic.a.a.a().f30048b.get()) {
                                        try {
                                            long j4 = a2[0];
                                            long j5 = a2[1];
                                            long j6 = a2[2];
                                            long j7 = a2[3];
                                            a.a("gecko resource info", "active_resource_usage:".concat(String.valueOf(j4)), "inactive_resource_usage:".concat(String.valueOf(j5)), "backup_resource_usage:".concat(String.valueOf(j6)), "total_resource_usage".concat(String.valueOf(j7)), "cost:".concat(String.valueOf(currentTimeMillis2)));
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("aid", String.valueOf(f.a().b().aid));
                                            jSONObject.put("gecko_sdk_version", "3.0.0-rc.4-mt");
                                            jSONObject.put("access_key", key);
                                            jSONObject.put("channel", name);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("inactive_resource_usage", j5);
                                            jSONObject2.put("backup_resource_usage", j6);
                                            jSONObject2.put("active_resource_usage", j4);
                                            jSONObject2.put("total_resource_usage", j7);
                                            jSONObject2.put("cost", currentTimeMillis2);
                                            com.bytedance.geckox.statistic.a.a.a().a("geckosdk_resource_info", jSONObject, jSONObject2);
                                        } catch (Throwable unused) {
                                            a.a();
                                        }
                                    }
                                }
                                j2 += j3;
                                arrayList.add(new com.bytedance.geckox.statistic.model.c(key, j3, listFiles.length));
                            }
                        }
                        c.a(arrayList, j2);
                    }
                });
            }
        }
    }

    public static void a(SettingsUpdateData settingsUpdateData) {
        a c2 = c();
        if (c2 != null) {
            try {
                c2.a("geckosdk_query_settings", new JSONObject(b.f29780a.f29781b.b(settingsUpdateData)));
            } catch (Throwable unused) {
                a.a();
            }
        }
    }

    public static void a(UpdatePackage updatePackage) {
        a statisticMonitor = f.a().d().getStatisticMonitor();
        if (statisticMonitor != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                a(jSONObject);
                updatePackage.putStatisticModelToJson(jSONObject);
                statisticMonitor.a("geckosdk_update_aggr_stats", jSONObject);
            } catch (Exception unused) {
                a.a();
            }
        }
    }

    private static JSONObject b(com.bytedance.geckox.statistic.model.a aVar) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        jSONObject.put("api_version", aVar.f30083k);
        jSONObject.put("x_tt_logid", aVar.f30077e);
        jSONObject.put("http_status", aVar.f30078f);
        jSONObject.put("err_msg", aVar.f30076d);
        if (TextUtils.isEmpty(aVar.f30077e)) {
            jSONObject.put("deployments_info", aVar.f30074b);
            jSONObject.put("local_info", aVar.f30073a);
            jSONObject.put("custom_info", aVar.f30075c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        jSONObject.put("req_type", aVar.f30079g);
        jSONObject.put("is_intercept", aVar.f30080h);
        jSONObject.put("err_code", aVar.f30081i);
        if (aVar.f30082j != 0) {
            jSONObject.put("sync_task_id", aVar.f30082j);
        }
        if (aVar.f30084l != -1) {
            jSONObject.put("delay_from_launch", aVar.f30084l);
        }
        if (aVar.f30085m != -1) {
            jSONObject.put("delay_in_queue", aVar.f30085m);
        }
        if (aVar.n != -1) {
            jSONObject.put("is_merged", aVar.n);
        }
        return jSONObject;
    }

    public static void a(com.bytedance.geckox.statistic.model.a aVar) {
        a c2 = c();
        if (c2 != null) {
            try {
                c2.a("geckosdk_query_pkgs", b(aVar));
            } catch (Throwable unused) {
                a.a();
            }
        }
    }

    public static void a(com.bytedance.geckox.statistic.model.b bVar) {
        a c2 = c();
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                a(jSONObject);
                bVar.a(jSONObject);
                c2.a("geckosdk_clean_stats", jSONObject);
            } catch (Exception unused) {
                a.a();
            }
        }
    }

    public static void a(int i2, int i3, String str, String str2) {
        a c2 = c();
        if (c2 != null) {
            try {
                EventMessageModel eventMessageModel = new EventMessageModel(i2, i3);
                eventMessageModel.setErrMsg(str);
                eventMessageModel.setExtra(str2);
                eventMessageModel.setDuration(0);
                JSONObject jSONObject = new JSONObject(b.f29780a.f29781b.b(eventMessageModel));
                a(jSONObject);
                c2.a("geckosdk_event_message", jSONObject);
            } catch (Throwable unused) {
                a.a();
            }
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final int i2, final int i3) {
        if (com.bytedance.geckox.statistic.a.a.a().f30048b.get()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f30063b >= 300000) {
                f30063b = currentTimeMillis;
                o.a().b().execute(new Runnable() {
                    /* class com.bytedance.geckox.statistic.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(17472);
                    }

                    public final void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("gecko_sdk_version", "3.0.0-rc.4-mt");
                            jSONObject.put("access_key", str);
                            jSONObject.put("gecko_channel", str2);
                            jSONObject.put("gecko_id", str3);
                            jSONObject.put(StringSet.type, str4);
                            jSONObject.put("hit_local", str5);
                            jSONObject.put("is_blacklist", str6);
                            jSONObject.put("expire_age", String.valueOf(i2));
                            jSONObject.put("clean_type", String.valueOf(i3));
                            com.bytedance.geckox.statistic.a.a.a().a("geckosdk_resource_access", jSONObject, null);
                        } catch (Throwable unused) {
                            a.a();
                        }
                    }
                });
            }
        }
    }
}
