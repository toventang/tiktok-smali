package com.ss.android.ugc.aweme.account.agegate.util;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.account.agegate.b;
import com.ss.android.ugc.aweme.ck.v;
import h.f.b.l;

public final class EditDobRouteAction implements IRouteAction {
    static {
        Covode.recordClassIndex(38692);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Integer num;
        Integer num2;
        String b2 = v.b(str, "default_birthdate");
        String b3 = v.b(str, "upper_bound_date");
        try {
            num = Integer.valueOf(v.b(str, "edibility_birthdate_type"));
        } catch (Exception unused) {
            num = 1;
        }
        String b4 = v.b(str, "enter_method");
        try {
            num2 = Integer.valueOf(v.b(str, "desc_type"));
        } catch (Exception unused2) {
            num2 = 0;
        }
        l.b(num, "");
        int intValue = num.intValue();
        l.b(num2, "");
        b.a(context, b2, b4, intValue, b3, num2.intValue());
        return true;
    }
}
