package com.ss.android.ugc.aweme.kids.api.account.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public interface a extends Serializable {
    static {
        Covode.recordClassIndex(67551);
    }

    String getSecUserId();

    String getShortId();

    String getUniqueId();

    UrlModel getUserAvatar();

    String getUserId();

    Integer getUserPeriod();

    UrlModel getUserThumb();

    Boolean isKidsMode();
}
