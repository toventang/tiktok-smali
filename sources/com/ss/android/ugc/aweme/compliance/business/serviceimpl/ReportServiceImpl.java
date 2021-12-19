package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public class ReportServiceImpl implements IReportService {
    static {
        Covode.recordClassIndex(47712);
    }

    public static IReportService a() {
        MethodCollector.i(4645);
        Object a2 = b.a(IReportService.class, false);
        if (a2 != null) {
            IReportService iReportService = (IReportService) a2;
            MethodCollector.o(4645);
            return iReportService;
        }
        if (b.aJ == null) {
            synchronized (IReportService.class) {
                try {
                    if (b.aJ == null) {
                        b.aJ = new ReportServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4645);
                    throw th;
                }
            }
        }
        ReportServiceImpl reportServiceImpl = (ReportServiceImpl) b.aJ;
        MethodCollector.o(4645);
        return reportServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String a(String str) {
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return "forward";
        }
        if (aweme.isImage()) {
            return "image";
        }
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(Map<String, String> map) {
        if (map != null) {
            r.a("tip_off", map);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(Activity activity, Uri.Builder builder) {
        a(activity, builder, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void b(Activity activity, Uri.Builder builder) {
        if (activity != null) {
            com.ss.android.ugc.aweme.compliance.business.report.b.a("https://www.tiktok.com/falcon/communitysafety/page/reasons_ad/index.html", builder);
            Uri build = builder.build();
            Bundle bundle = new Bundle();
            bundle.putString("url", build.toString());
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putString("status_bar_color", activity.getResources().getString(R.color.nd).replace("#", ""));
            bundle.putLong("enter_time", System.currentTimeMillis());
            ReportWebPageDialogActivity.a.a(activity, bundle, build.getQueryParameter("object_id"), build.getQueryParameter("enter_from"));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(Activity activity, Aweme aweme) {
        String str = "video";
        if (aweme.getAwemeType() == 13) {
            str = "forward";
        } else if (aweme.getAwemeType() == 2) {
            str = "image";
        } else if (!(aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56 || aweme.getAwemeType() == 34)) {
            if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getSystemOrigin() == 1) {
                str = "douplus";
            } else if (aweme.isAd()) {
                str = "ad";
            }
        }
        String aid = aweme.getAid();
        String authorUid = aweme.getAuthorUid();
        if (activity != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", aid).appendQueryParameter("owner_id", authorUid).appendQueryParameter("report_type", str).appendQueryParameter("locale", SettingServiceImpl.v().h());
            if (!TextUtils.isEmpty("")) {
                appendQueryParameter.appendQueryParameter("video_owner_id", "");
            }
            com.ss.android.ugc.aweme.compliance.business.report.b.a(activity, appendQueryParameter, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(Activity activity, Uri.Builder builder, Bundle bundle) {
        if (activity != null) {
            com.ss.android.ugc.aweme.compliance.business.report.b.a(activity, builder, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.ss.android.ugc.aweme.compliance.business.report.b.a(str, str2, str3, str4, str5, str6, str7, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme) {
        com.ss.android.ugc.aweme.compliance.business.report.b.a(str, str2, str3, str4, str5, str6, str7, aweme);
    }
}
