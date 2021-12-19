package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.liko.b.c;
import com.bytedance.liko.b.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.h.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LeakReporterInjectTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final String f107823a = "LeakDetector";

    /* renamed from: b  reason: collision with root package name */
    private final long f107824b = 134217728;

    /* renamed from: c  reason: collision with root package name */
    private final int f107825c = 2;

    /* renamed from: d  reason: collision with root package name */
    private final int f107826d = 18;

    /* renamed from: e  reason: collision with root package name */
    private final int f107827e = 9;

    /* renamed from: f  reason: collision with root package name */
    private final int f107828f = 9900;

    static {
        Covode.recordClassIndex(69049);
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
        if (TextUtils.equals(d.s, "local_test") && com.bytedance.liko.b.d.f40074a) {
            LikoAnalysisConfig d2 = a.d();
            JSONObject jSONObject = new JSONObject();
            long d3 = d.d();
            try {
                jSONObject.put("strategy", 18);
                jSONObject.put("aid", d.n);
                jSONObject.put("channel", d.s);
                jSONObject.put("device_id", AppLog.getServerDeviceId());
                jSONObject.put("app_version", d.f());
                jSONObject.put("update_version_code", String.valueOf(d3));
                jSONObject.put("current_update_version_code", String.valueOf(d.d()));
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("process_name", d.a().getPackageName());
                jSONObject.put("version_name", d.i());
                jSONObject.put("version_code", (int) d.h());
                jSONObject.put("region", "");
                jSONObject.put("oversea", true);
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
                jSONObject.put("bitmapLatitude", d2.getBitmapLatitude());
                jSONObject.put("release_build", com.ss.android.newmedia.a.a.a(context).a("release_build", ""));
                jSONObject.put("bigObjectFilterSystem", false);
                jSONObject.put("objectInstanceFilterSystem", false);
                if (d3 % 9900 != 0) {
                    jSONObject.put("env", "canary");
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.liko.b.d.a(jSONObject);
            com.bytedance.liko.b.d.f40075b = 20;
            e.f40081a = new n(this);
            com.bytedance.liko.b.a.f40061b = 300;
            com.bytedance.liko.b.a.f40062c = 10;
            com.bytedance.liko.b.a.f40063d = 60000;
            com.bytedance.liko.b.a.f40060a = true;
            e.f40082b = new o(this);
            c.f40065a = true;
        }
    }
}
