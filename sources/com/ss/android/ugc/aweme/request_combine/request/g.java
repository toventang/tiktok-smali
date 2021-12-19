package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.j;
import com.google.gson.o;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.legoImp.task.y;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.AwemeSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.b.b;
import com.ss.android.ugc.aweme.setting.by;
import h.f.b.l;
import h.q;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120672a;

    static {
        Covode.recordClassIndex(78594);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/aweme/v1/settings/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120672a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final Map<String, String> a(Context context) {
        String str;
        l.d(context, "");
        l.d(context, "");
        HashMap hashMap = new HashMap();
        if (a.a(context, "phone") != null) {
            Object a2 = a.a(context, "phone");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            if (((TelephonyManager) a2).getPhoneType() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_cdma", str);
        }
        String a3 = y.a();
        if (a3 != null) {
            hashMap.put("cpu_model", a3);
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new b());
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = true, is_v3 = " + j.a().c() + ", is_v3_api = false");
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        AwemeSettingCombineModel awemeSettingCombineModel;
        Integer num;
        com.google.gson.l awemeSetting;
        com.google.gson.l c2;
        String c3;
        com.google.gson.l awemeSetting2;
        com.google.gson.l c4;
        SettingCombineDataModel data;
        String str = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            awemeSettingCombineModel = null;
        } else {
            awemeSettingCombineModel = data.getAwemeSetting();
        }
        if (awemeSettingCombineModel == null || (awemeSetting2 = awemeSettingCombineModel.getAwemeSetting()) == null || !(awemeSetting2 instanceof o)) {
            num = -1;
        } else {
            com.google.gson.l awemeSetting3 = awemeSettingCombineModel.getAwemeSetting();
            if (awemeSetting3 == null || (c4 = awemeSetting3.j().c("status_code")) == null) {
                num = null;
            } else {
                num = Integer.valueOf(c4.g());
            }
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        this.f120672a = awemeSettingCombineModel;
        if (awemeSettingCombineModel != null && awemeSettingCombineModel.httpCode == 200) {
            by.f122128a.a((Object) awemeSettingCombineModel.getAwemeSetting(), true);
        }
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = true, is_combine = true, is_v3 = " + j.a().c() + ", is_v3_api = false");
        String str2 = "";
        if (awemeSettingCombineModel != null) {
            try {
                com.google.gson.l awemeSetting4 = awemeSettingCombineModel.getAwemeSetting();
                if (!(awemeSetting4 == null || (c2 = awemeSetting4.j().c("creator_fund_setting_entry_schema")) == null || (c3 = c2.c()) == null)) {
                    str2 = c3;
                }
            } catch (Throwable th) {
                q.m223constructorimpl(h.r.a(th));
            }
        }
        StringBuilder sb = new StringBuilder("CombinedAwemeSettingsRequest /aweme/v1/settings/ awemeSetting = ");
        if (!(awemeSettingCombineModel == null || (awemeSetting = awemeSettingCombineModel.getAwemeSetting()) == null)) {
            str = awemeSetting.j().toString();
        }
        com.ss.android.ugc.aweme.framework.a.a.a(sb.append(str).toString());
        q.m223constructorimpl(z.f158842a);
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_success, content = ".concat(String.valueOf(str2)));
        if (awemeSettingCombineModel == null || awemeSettingCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
