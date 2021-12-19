package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.h;
import h.f.b.l;

public final class PrivacySettingDialogRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(48229);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        String str4;
        Aweme aweme = h.f95331a;
        if (h.f95331a == aweme) {
            h.f95331a = null;
        }
        if (aweme == null) {
            return null;
        }
        if (bundle != null) {
            str2 = bundle.getString("tab_name");
            str3 = bundle.getString("enter_from");
            str4 = bundle.getString("impr_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        a aVar = new a();
        aVar.f77828c = aweme;
        aVar.n = str2;
        aVar.o = str3;
        aVar.p = str4;
        a.C1112a aVar2 = new a.C1112a();
        l.b(aVar, "");
        aVar2.a(aVar);
        aVar2.a(1);
        aVar2.b(n.a(386.0d));
        if (!(context instanceof e)) {
            return null;
        }
        a aVar3 = aVar2.f45299a;
        aVar3.show(((e) context).getSupportFragmentManager(), "PrivacySettingDialog");
        return aVar3;
    }
}
