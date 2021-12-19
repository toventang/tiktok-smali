package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import h.f.b.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AnalysisHprofTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107723a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107724b = new a((byte) 0);

    static {
        Covode.recordClassIndex(68914);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68915);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (com.ss.android.h.a.c()) {
            LikoAnalysisConfig d2 = com.ss.android.h.a.d();
            l.b(d2, "");
            try {
                f107723a = true;
                JSONObject jSONObject = new JSONObject();
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!SettingsManager.a().a("enable_upload_hporf", false)) {
                        f107723a = false;
                        return;
                    }
                    jSONObject.put("strategy", 18);
                    jSONObject.put("aid", d.n);
                    jSONObject.put("channel", d.s);
                    jSONObject.put("device_id", AppLog.getServerDeviceId());
                    jSONObject.put("app_version", d.f());
                    jSONObject.put("update_version_code", String.valueOf(d.d()));
                    jSONObject.put("current_update_version_code", String.valueOf(d.d()));
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("os_api", Build.VERSION.SDK_INT);
                    jSONObject.put("device_model", Build.MODEL);
                    jSONObject.put("device_brand", Build.BRAND);
                    jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                    jSONObject.put("process_name", d.a().getPackageName());
                    jSONObject.put("version_code", (int) d.h());
                    jSONObject.put("region", "");
                    jSONObject.put("oversea", true);
                    jSONObject.put("delete_dump_file", true);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put("android.app.Activity");
                    jSONArray.put("android.app.Fragment");
                    jSONArray.put("androidx.fragment.app.Fragment");
                    jSONObject.put("detect_leak_classes", jSONArray);
                    jSONObject.put("supportBigObjectAnalysis", d2.isSupportBigObjectAnalysis());
                    jSONObject.put("bigObjectFilterSystem", d2.isBigObjectFilterSystem());
                    jSONObject.put("bigObjectLatitude", d2.getBigObjectLatitude());
                    jSONObject.put("supportObjectInstanceAnalysis", d2.isSupportObjectInstanceAnalysis());
                    jSONObject.put("objectInstanceFilterSystem", d2.isObjectInstanceFilterSystem());
                    jSONObject.put("objectInstanceLatitude", d2.getObjectInstanceLatitude());
                    jSONObject.put("supportBitmapAnalysis", d2.isSupportBitmapAnalysis());
                    jSONObject.put("bitmapLatitude", (long) d2.getBitmapLatitude());
                    jSONObject.put("release_build", com.ss.android.newmedia.a.a.a(context).a("release_build", ""));
                    String i3 = d.i();
                    jSONObject.put("version_name", i3);
                    int charAt = i3.charAt(i3.length() - 1) - '0';
                    if (charAt > 0 && charAt < 4) {
                        jSONObject.put("env", "canary");
                    }
                    com.bytedance.liko.b.d.a(jSONObject);
                    f107723a = false;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable unused) {
                f107723a = false;
            }
        }
    }
}
