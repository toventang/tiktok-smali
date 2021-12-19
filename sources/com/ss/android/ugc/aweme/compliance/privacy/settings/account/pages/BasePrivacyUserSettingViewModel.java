package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.r;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.data.c;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public abstract class BasePrivacyUserSettingViewModel extends BasePrivacySettingViewModel implements i, j {
    static {
        Covode.recordClassIndex(48068);
    }

    public abstract Integer a(q qVar);

    public abstract void a(q qVar, int i2);

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(334, new g(BasePrivacyUserSettingViewModel.class, "onPrivacyUserSettingsChange", r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        cg.b(this);
    }

    public BasePrivacyUserSettingViewModel() {
        Integer num;
        cg.a(this);
        t<Integer> tVar = this.f77673d;
        q b2 = b.b();
        if (b2 != null) {
            num = a(b2);
        } else {
            num = null;
        }
        tVar.setValue(num);
        b.b(false);
    }

    @org.greenrobot.eventbus.r
    public final void onPrivacyUserSettingsChange(r rVar) {
        l.d(rVar, "");
        this.f77673d.setValue(a(rVar.f76693a));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public void a(int i2, BaseResponse baseResponse) {
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        q b2 = b.b();
        if (b2 != null) {
            a(b2, i2);
            c.a(b2);
        }
    }
}
