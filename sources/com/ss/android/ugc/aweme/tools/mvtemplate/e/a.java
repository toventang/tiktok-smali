package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import h.p;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140822a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(91953);
    }

    private static boolean b(MvThemeData mvThemeData) {
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.c()) && !TextUtils.isEmpty(mvThemeData.a())) {
            return true;
        }
        return false;
    }

    private static void a(MvThemeData mvThemeData) {
        if (mvThemeData != null) {
            q.a("mv_resource_download_error_state", 11, new ar().a("url", mvThemeData.c()).a("mv_res_id", mvThemeData.a()).a("mv_res_name", mvThemeData.f()).a());
        }
    }

    public static void a(MvThemeData mvThemeData, ExceptionResult exceptionResult, boolean z) {
        String str;
        String str2;
        if (mvThemeData != null) {
            if (!b(mvThemeData)) {
                a(mvThemeData);
            }
            if (z) {
                q.a("mv_resource_download_error_state", 0, (JSONObject) null);
                return;
            }
            ar a2 = new ar().a("url", mvThemeData.c()).a("mv_res_id", mvThemeData.a()).a("mv_res_name", mvThemeData.f());
            String str3 = "";
            if (exceptionResult == null || (str = String.valueOf(exceptionResult.getErrorCode())) == null) {
                str = str3;
            }
            ar a3 = a2.a("error_code", str);
            if (exceptionResult == null || (str2 = exceptionResult.toString()) == null) {
                str2 = str3;
            }
            ar a4 = a3.a("error_message", str2);
            if (!(exceptionResult == null || exceptionResult.getException() == null)) {
                str3 = m.c(exceptionResult.getException());
            }
            q.a("mv_resource_download_error_state", 1, a4.a("exception", str3).a());
        }
    }

    public static void a(boolean z, MvThemeData mvThemeData, p<Integer, String> pVar) {
        String str;
        String str2;
        String str3;
        String second;
        Integer first;
        if (z) {
            q.a("mv_template_process_error_rate", 0, (JSONObject) null);
            return;
        }
        ar arVar = new ar();
        String str4 = "";
        if (mvThemeData == null || (str = mvThemeData.c()) == null) {
            str = str4;
        }
        ar a2 = arVar.a("url", str);
        if (mvThemeData == null || (str2 = mvThemeData.a()) == null) {
            str2 = str4;
        }
        ar a3 = a2.a("mv_res_id", str2);
        if (pVar == null || (first = pVar.getFirst()) == null || (str3 = String.valueOf(first.intValue())) == null) {
            str3 = str4;
        }
        ar a4 = a3.a("error_code", str3);
        if (!(pVar == null || (second = pVar.getSecond()) == null)) {
            str4 = second;
        }
        q.a("mv_template_process_error_rate", 1, a4.a("error_message", str4).a());
    }
}
