package com.bytedance.android.livesdk.aj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.w;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.i.b.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.h;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePlayerPushStreamLogCpuMemoryOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerPullStreamLogCpuMemoryOptimizationSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class n implements com.bytedance.android.live.i.a.c {

    /* renamed from: a  reason: collision with root package name */
    boolean f13865a;

    /* renamed from: b  reason: collision with root package name */
    float f13866b;

    /* renamed from: c  reason: collision with root package name */
    int f13867c;

    /* renamed from: d  reason: collision with root package name */
    int f13868d;

    /* renamed from: e  reason: collision with root package name */
    String f13869e;

    /* renamed from: f  reason: collision with root package name */
    String f13870f;

    /* renamed from: g  reason: collision with root package name */
    private String f13871g = "tt";

    static {
        Covode.recordClassIndex(7707);
    }

    public n() {
        h.a().a(o.f13886a);
        try {
            this.f13869e = ((d) com.bytedance.android.live.t.a.a(d.class)).getCpuInfoFetcher().a();
            this.f13870f = ((d) com.bytedance.android.live.t.a.a(d.class)).getGpuInfoFetcher().a(null);
            if (this.f13869e == null) {
                ((d) com.bytedance.android.live.t.a.a(d.class)).getCpuInfoFetcher().a(new p(this));
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("LivePlayerLog", th);
        }
    }

    static class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final float f13872a;

        /* renamed from: b  reason: collision with root package name */
        private final JSONObject f13873b;

        /* renamed from: c  reason: collision with root package name */
        private int f13874c;

        /* renamed from: d  reason: collision with root package name */
        private int f13875d;

        /* renamed from: e  reason: collision with root package name */
        private String f13876e;

        /* renamed from: f  reason: collision with root package name */
        private String f13877f;

        /* renamed from: g  reason: collision with root package name */
        private String f13878g;

        static {
            Covode.recordClassIndex(7709);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                if (LivePlayerPushStreamLogCpuMemoryOptimizationSetting.INSTANCE.isEnable()) {
                    Map<String, Double> cpuRateEnableCache = LivePerformanceManager.getInstance().getCpuRateEnableCache();
                    if (cpuRateEnableCache != null && cpuRateEnableCache.size() > 0) {
                        this.f13873b.put("cpu_speed_rate", cpuRateEnableCache.get("cpu_speed"));
                        this.f13873b.put("cpu", cpuRateEnableCache.get("cpu_rate"));
                    }
                    Map<String, Long> memoryEnableCache = LivePerformanceManager.getInstance().getMemoryEnableCache();
                    Long l2 = memoryEnableCache.get("mem_pss_dalvik");
                    if (l2 != null && l2.longValue() > 0) {
                        this.f13873b.put("dalvik_pss", l2);
                    }
                    Long l3 = memoryEnableCache.get("mem_pss_total");
                    float f2 = -1.0f;
                    if (l3 != null) {
                        f2 = (((float) l3.longValue()) / 1024.0f) / 1024.0f;
                    }
                    this.f13873b.put("memory", (int) f2);
                } else {
                    Map<String, Double> cpuRates = LivePerformanceManager.getInstance().getCpuRates();
                    if (cpuRates != null && cpuRates.size() > 0) {
                        this.f13873b.put("cpu_speed_rate", cpuRates.get("cpu_speed"));
                        this.f13873b.put("cpu", cpuRates.get("cpu_rate"));
                    }
                    long dalvikPss = LivePerformanceManager.getInstance().getDalvikPss();
                    if (dalvikPss > 0) {
                        this.f13873b.put("dalvik_pss", dalvikPss);
                    }
                    float a2 = ((float) w.a()) / 1024.0f;
                    float f3 = a2 - this.f13872a;
                    this.f13873b.put("memory", (int) a2);
                    this.f13873b.put("live_push_memory", (int) f3);
                    this.f13873b.put("start_memory", (int) this.f13872a);
                }
                this.f13873b.put("product_line", "live");
                Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", this.f13873b);
                jSONObject.put("did", AppLog.getServerDeviceId());
                jSONObject.put("uid", u.a().b().c());
                if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                    j.f107227f = NetworkUtils.getNetworkAccessType(context);
                }
                jSONObject.put("net_type", j.f107227f);
                jSONObject.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                if (a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                    jSONObject.put("app_version_four", a(context.getPackageManager(), context.getPackageName()).metaData.getInt("UPDATE_VERSION_CODE"));
                }
                com.bytedance.android.live.core.c.a.a(4, "LivePlayerLog", jSONObject.toString());
                this.f13873b.put("channel", ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel());
                this.f13873b.put("device_name", Build.MODEL);
                this.f13873b.put("screen_height", this.f13874c);
                this.f13873b.put("screen_width", this.f13875d);
                n.a(this.f13876e, this.f13877f, this.f13873b);
                com.bytedance.android.live.core.d.c.a(this.f13878g, (String) null, this.f13873b);
            } catch (Throwable unused) {
            }
            return null;
        }

        private static ApplicationInfo a(PackageManager packageManager, String str) {
            if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                return packageManager.getApplicationInfo(str, 128);
            }
            if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, 128);
            }
            return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
        }

        private b(int i2, int i3, float f2, String str, String str2, JSONObject jSONObject, String str3) {
            this.f13874c = i2;
            this.f13875d = i3;
            this.f13872a = f2;
            this.f13876e = str;
            this.f13877f = str2;
            this.f13873b = jSONObject;
            this.f13878g = str3;
        }

        /* synthetic */ b(int i2, int i3, float f2, String str, String str2, JSONObject jSONObject, String str3, byte b2) {
            this(i2, i3, f2, str, str2, jSONObject, str3);
        }
    }

    static class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final float f13879a;

        /* renamed from: b  reason: collision with root package name */
        private final JSONObject f13880b;

        /* renamed from: c  reason: collision with root package name */
        private int f13881c;

        /* renamed from: d  reason: collision with root package name */
        private int f13882d;

        /* renamed from: e  reason: collision with root package name */
        private String f13883e;

        /* renamed from: f  reason: collision with root package name */
        private String f13884f;

        /* renamed from: g  reason: collision with root package name */
        private String f13885g;

        static {
            Covode.recordClassIndex(7710);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                JSONObject jSONObject = this.f13880b;
                if (jSONObject != null) {
                    try {
                        String optString = jSONObject.optString("event_key");
                        if (TextUtils.equals(optString, "play_stop")) {
                            b.a.a("livesdk_play_sr_support").a("sr_used", this.f13880b.optInt("sr_used", -1)).b();
                        }
                        boolean equals = TextUtils.equals(optString, "playing");
                        if (equals && this.f13880b.optInt("index", -1) == 1 && this.f13880b.optInt("is_preview", -1) == 1) {
                            LivePerformanceManager.getInstance().reportPreviewFeedFirstFps(Double.valueOf(this.f13880b.optDouble("render_fps", -1.0d)));
                        }
                        if (!LivePlayerPullStreamLogCpuMemoryOptimizationSetting.INSTANCE.isEnable()) {
                            if (equals) {
                                Map<String, Double> cpuRates = LivePerformanceManager.getInstance().getCpuRates();
                                if (cpuRates != null && cpuRates.size() > 0) {
                                    this.f13880b.put("cpu_speed_rate", cpuRates.get("cpu_speed"));
                                    this.f13880b.put("cpu", cpuRates.get("cpu_rate"));
                                }
                                long dalvikPss = LivePerformanceManager.getInstance().getDalvikPss();
                                if (dalvikPss > 0) {
                                    this.f13880b.put("dalvik_pss", dalvikPss);
                                }
                            }
                            float a2 = ((float) w.a()) / 1024.0f;
                            float f2 = a2 - this.f13879a;
                            this.f13880b.put("memory", (int) a2);
                            this.f13880b.put("live_pull_memory", (int) f2);
                            this.f13880b.put("start_memory", (int) this.f13879a);
                        } else if (TextUtils.equals(optString, "first_frame") || TextUtils.equals(optString, "render_stall") || TextUtils.equals(optString, "decode_stall") || equals) {
                            Map<String, Double> cpuRateEnableCache = LivePerformanceManager.getInstance().getCpuRateEnableCache();
                            if (cpuRateEnableCache != null && cpuRateEnableCache.size() > 0) {
                                this.f13880b.put("cpu_speed_rate", cpuRateEnableCache.get("cpu_speed"));
                                this.f13880b.put("cpu", cpuRateEnableCache.get("cpu_rate"));
                            }
                            Map<String, Long> memoryEnableCache = LivePerformanceManager.getInstance().getMemoryEnableCache();
                            Long l2 = memoryEnableCache.get("mem_pss_dalvik");
                            if (l2 != null && l2.longValue() > 0) {
                                this.f13880b.put("dalvik_pss", l2);
                            }
                            Long l3 = memoryEnableCache.get("mem_pss_total");
                            float f3 = -1.0f;
                            if (l3 != null) {
                                f3 = (((float) l3.longValue()) / 1024.0f) / 1024.0f;
                            }
                            this.f13880b.put("memory", (int) f3);
                        }
                        Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
                        this.f13880b.put("channel", ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel());
                        this.f13880b.put("device_name", Build.MODEL);
                        this.f13880b.put("did", AppLog.getServerDeviceId());
                        this.f13880b.put("uid", u.a().b().c());
                        JSONObject jSONObject2 = this.f13880b;
                        if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                            j.f107227f = NetworkUtils.getNetworkAccessType(context);
                        }
                        jSONObject2.put("net_type", j.f107227f);
                        this.f13880b.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                        if (a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                            this.f13880b.put("app_version_four", a(context.getPackageManager(), context.getPackageName()).metaData.getInt("UPDATE_VERSION_CODE"));
                        }
                        this.f13880b.put("ttlive_sdk_version", "2160");
                        this.f13880b.put("screen_height", this.f13881c);
                        this.f13880b.put("screen_width", this.f13882d);
                        n.a(this.f13883e, this.f13884f, this.f13880b);
                        com.bytedance.android.live.core.d.c.a(this.f13885g, (String) null, this.f13880b);
                    } catch (Throwable th) {
                        com.bytedance.android.live.core.c.a.a("LivePlayerLog", th);
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        private static ApplicationInfo a(PackageManager packageManager, String str) {
            if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                return packageManager.getApplicationInfo(str, 128);
            }
            if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, 128);
            }
            return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
        }

        c(int i2, int i3, float f2, String str, String str2, JSONObject jSONObject, String str3) {
            this.f13881c = i2;
            this.f13882d = i3;
            this.f13879a = f2;
            this.f13883e = str;
            this.f13884f = str2;
            this.f13880b = jSONObject;
            this.f13885g = str3;
        }
    }

    @Override // com.bytedance.android.live.i.a.c
    public final void a(String str) {
        this.f13870f = str;
    }

    public static final class a implements b.AbstractC0153b<n> {
        static {
            Covode.recordClassIndex(7708);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<n> a(b.AbstractC0153b.a<n> aVar) {
            aVar.f9912a = (R) new n();
            aVar.f9913b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.i.a.c
    public final void a(JSONObject jSONObject, String str) {
        h.a().a(new c(this.f13867c, this.f13868d, this.f13866b, this.f13869e, this.f13870f, jSONObject, str));
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if (str != null) {
            jSONObject.put("cpu_soc", str);
        }
        if (str2 != null) {
            jSONObject.put("gpu_name", str2);
        }
    }
}
