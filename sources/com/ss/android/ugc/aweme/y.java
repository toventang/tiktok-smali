package com.ss.android.ugc.aweme;

import android.os.Bundle;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ac.a;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.al.f;
import com.ss.android.ugc.d.a.c;

public final class y {
    static {
        Covode.recordClassIndex(95005);
    }

    public static i<Bundle> a(Bundle bundle, a aVar) {
        int i2;
        i<Bundle> a2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        IAccountService.a e2 = ((bf) a.a(bf.class)).e();
        String string = bundle.getString("previous_uid");
        String curUserId = cj.f71084b.e().getCurUserId();
        boolean isNullUid = cj.f71084b.e().isNullUid(string);
        boolean isNullUid2 = cj.f71084b.e().isNullUid(curUserId);
        if (isNullUid) {
            if (!isNullUid2) {
                i2 = 0;
                a2 = e2.a(bundle);
            }
            i2 = 2;
            a2 = e2.a(bundle, (b) aVar);
        } else {
            if (!isNullUid2) {
                i2 = 1;
                a2 = e2.b(bundle);
            }
            i2 = 2;
            a2 = e2.a(bundle, (b) aVar);
        }
        c.a(new f(i2));
        return a2.c(z.f145322a);
    }
}
