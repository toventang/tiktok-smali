package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface IUserDepend {
    static {
        Covode.recordClassIndex(18667);
    }

    String getAvatarURL();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasBoundPhone();

    boolean hasLogin();
}
