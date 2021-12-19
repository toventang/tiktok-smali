package com.ss.android.ugc.aweme.compliance.protection.familypairing.b;

import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class a {
    static {
        Covode.recordClassIndex(48346);
    }

    public static final String a(String str) {
        boolean z;
        l.d(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (TextUtils.isEmpty(curUserId)) {
            return "";
        }
        try {
            String b2 = d.b(curUserId + ':' + str);
            l.b(curUserId, "");
            Charset charset = h.m.d.f158808a;
            if (curUserId != null) {
                byte[] bytes = curUserId.getBytes(charset);
                l.b(bytes, "");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(secretKeySpec);
                l.b(b2, "");
                Charset charset2 = h.m.d.f158808a;
                if (b2 != null) {
                    byte[] bytes2 = b2.getBytes(charset2);
                    l.b(bytes2, "");
                    String a2 = d.a(instance.doFinal(bytes2));
                    l.b(a2, "");
                    return a2;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return "";
        }
    }
}
