package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(66380);
    }

    void a(IMContact iMContact);

    void a(List<? extends IMContact> list);

    boolean a(IMContact iMContact, boolean z);

    void b(List<? extends IMContact> list);
}
