package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class EnterRoomExtra extends Extra {
    @c(a = "is_official_channel")
    public boolean isOfficialChannel;
    @c(a = "is_same_app_language")
    public boolean isSameAppLanguage;
    @c(a = "region")
    public String region;

    static {
        Covode.recordClassIndex(8664);
    }
}
