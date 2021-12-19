package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(65541);
    }

    public static final int a(List<? extends IMContact> list) {
        l.d(list, "");
        int i2 = 0;
        for (T t : list) {
            if (t instanceof IMConversation) {
                i2 += t.getConversationMemberCount();
            } else if (t instanceof IMUser) {
                i2++;
            }
        }
        return i2;
    }
}
