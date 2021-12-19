package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.activity.a;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.m;
import com.ss.android.ugc.aweme.commercialize.model.ap;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.e;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

public class DownloadBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public int f74357a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f74358b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f74359c;

    /* renamed from: d  reason: collision with root package name */
    private ap f74360d = new ap();

    static {
        Covode.recordClassIndex(45881);
    }

    DownloadBusiness(e eVar) {
        super(eVar);
    }

    public final void a(Activity activity) {
        int i2 = this.f74357a;
        if (i2 == 0) {
            i2 = R.id.dw;
        }
        activity.findViewById(i2);
    }

    public final void a(Activity activity, j jVar) {
        int i2 = this.f74357a;
        if (i2 == 0) {
            i2 = R.id.dw;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(i2);
        frameLayout.setVisibility(8);
        ap apVar = this.f74360d;
        Bundle bundle = this.f78617k.f78741a.f78729b;
        if (bundle != null) {
            apVar.f74870a = bundle.getString("aweme_creative_id", "");
            apVar.f74872c = bundle.getString("aweme_group_id", "");
            apVar.f74873d = bundle.getString("bundle_download_app_log_extra");
            apVar.f74874e = bundle.getString("aweme_package_name");
            apVar.f74876g = bundle.getString("bundle_download_url");
            apVar.f74875f = bundle.getString("bundle_download_app_name");
            apVar.f74877h = bundle.getInt("bundle_app_ad_from", 0);
            apVar.f74879j = bundle.getString("bundle_download_app_extra");
            apVar.f74882m = bundle.getInt("bundle_download_mode");
            apVar.n = bundle.getBoolean("bundle_support_multiple_download");
            try {
                apVar.f74880k = new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            apVar.f74881l = bundle.getString("bundle_ad_quick_app_url");
            apVar.f74878i = ap.a(apVar.f74877h);
            try {
                apVar.f74871b = Long.parseLong(apVar.f74870a);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        frameLayout.setOnClickListener(e.f74409a);
        jVar.a().setDownloadListener(new f(this, jVar, activity));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(j jVar, Activity activity, String str, String str2, String str3, String str4, long j2) {
        m mVar;
        k monitorSession = jVar.a().getMonitorSession();
        if (!(monitorSession == null || (mVar = (m) monitorSession.a(m.class)) == null)) {
            mVar.a(str, str3, str4, j2);
        }
        JSONObject a2 = a.a(activity, this.f78617k.f78742b.f78759a, this.f78617k.f78742b.f78767i, str, jVar.a().getUrl(), jVar.a().getUrl());
        if (!this.f78617k.f78742b.f78770l) {
            com.bytedance.common.utility.m.a(str);
        }
        this.f74359c = str;
        new Object() {
            /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness.AnonymousClass1 */

            static {
                Covode.recordClassIndex(45882);
            }
        };
        a.a(activity, str, str2, str4, str3, a2);
    }
}
