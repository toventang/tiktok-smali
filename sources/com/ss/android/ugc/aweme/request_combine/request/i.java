package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120674a;

    static {
        Covode.recordClassIndex(78596);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/tiktok/v1/efficiency_portrait/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120674a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        ServerPortraitCollections.d();
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final Map<String, String> a(Context context) {
        l.d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("group_list", "bitrate_selection");
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        PortraitCombineModel portraitCombineModel;
        SettingCombineDataModel data;
        o oVar = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            portraitCombineModel = null;
        } else {
            portraitCombineModel = data.getPortraitCombineModel();
            if (portraitCombineModel != null) {
                oVar = portraitCombineModel.getPortraitData();
            }
        }
        if (oVar == null) {
            return false;
        }
        this.f120674a = portraitCombineModel;
        ServerPortraitCollections.d();
        if (portraitCombineModel == null || portraitCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
