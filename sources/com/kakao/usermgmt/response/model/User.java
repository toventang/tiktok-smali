package com.kakao.usermgmt.response.model;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public interface User extends Parcelable {
    static {
        Covode.recordClassIndex(34461);
    }

    long getId();

    long getServiceUserId();

    String getUUID();
}
