package com.ss.android.ugc.aweme.services;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.o;
import h.f.b.g;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    private final Handler handler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(79405);
    }

    public static int com_ss_android_ugc_aweme_services_AbsApiMonitorService_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79406);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final void addALog(String str, u<?> uVar) {
        l.d(str, "");
        l.d(uVar, "");
        try {
            List<b> list = uVar.f42629a.f42476d;
            l.d(str, "");
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getQueryParameter("device_id"))) {
                return;
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("aid"))) {
                if (list != null) {
                    ALog.d("API_URL_HEADER", "URL: " + str + "\r\nHEADER" + list.toString());
                }
            }
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
        }
    }

    public final void apiMonitor(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str3, "");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("path", parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", str3);
                jSONObject.put("requestid", str2);
                jSONObject.put("debug", false);
                o.b("api_error_service_log", "", jSONObject);
                com_ss_android_ugc_aweme_services_AbsApiMonitorService_com_ss_android_ugc_aweme_lancet_LogLancet_e("ApiMonitor", "apifail url=" + str + ",body=" + str3);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
