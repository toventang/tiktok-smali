package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f100199a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(63871);
    }

    public static final void a(IMUser iMUser, String str, Integer num, String str2) {
        int i2;
        l.d(str2, "");
        if (iMUser != null) {
            try {
                if (TextUtils.isEmpty(iMUser.getUid())) {
                    HashMap hashMap = new HashMap();
                    String iMUser2 = iMUser.toString();
                    l.b(iMUser2, "");
                    hashMap.put("user", iMUser2);
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = -1;
                    }
                    hashMap.put("key_enter_from", Integer.valueOf(i2));
                    if (str == null) {
                        str = "empty";
                    }
                    hashMap.put("conversation_id", str);
                    hashMap.put("error_msg", str2);
                    c.b("empty_user", hashMap);
                }
            } catch (Exception e2) {
                a.a(e2);
            }
        }
    }
}
