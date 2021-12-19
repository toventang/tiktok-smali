package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.settings.c;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.a.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120670a;

    static {
        Covode.recordClassIndex(78592);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/webcast/setting/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120670a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new b());
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final Map<String, String> a(Context context) {
        l.d(context, "");
        HashMap hashMap = new HashMap();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.e();
        ILiveOuterService s2 = LiveOuterService.s();
        l.b(s2, "");
        s2.e().a(hashMap);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        LiveSettingCombineModel liveSettingCombineModel;
        c liveSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            liveSettingCombineModel = null;
        } else {
            liveSettingCombineModel = data.getLiveSetting();
        }
        if (!(liveSettingCombineModel == null || (liveSetting = liveSettingCombineModel.getLiveSetting()) == null || liveSetting.status_code != 0)) {
            this.f120670a = liveSettingCombineModel;
            if (liveSettingCombineModel.httpCode == 200) {
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.k().a(liveSettingCombineModel.getLiveSetting());
            }
            a aVar = this.f120670a;
            if (aVar == null || aVar.httpCode != 200 || liveSettingCombineModel.getLiveSetting() == null || liveSettingCombineModel.getLiveSetting().status_code != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
