package com.ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.AbTestCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import h.f.b.l;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120671a;

    static {
        Covode.recordClassIndex(78593);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/aweme/v1/abtest/param/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120671a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new com.ss.android.ugc.aweme.request_combine.request.b.a());
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        AbTestCombineModel abTestCombineModel;
        com.google.gson.l abTestResponse;
        com.google.gson.l c2;
        SettingCombineDataModel data;
        Integer num = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            abTestCombineModel = null;
        } else {
            abTestCombineModel = data.getAbTestCombineModel();
        }
        if (abTestCombineModel == null || (abTestResponse = abTestCombineModel.getAbTestResponse()) == null || !(abTestResponse instanceof o)) {
            num = -1;
        } else {
            com.google.gson.l abTestResponse2 = abTestCombineModel.getAbTestResponse();
            if (!(abTestResponse2 == null || (c2 = abTestResponse2.j().c("status_code")) == null)) {
                num = Integer.valueOf(c2.g());
            }
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        this.f120671a = abTestCombineModel;
        if (abTestCombineModel != null) {
            if (abTestCombineModel.httpCode == 200) {
                AbTestManagerImpl.b().a(abTestCombineModel.getAbTestResponse());
            }
            if (abTestCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
