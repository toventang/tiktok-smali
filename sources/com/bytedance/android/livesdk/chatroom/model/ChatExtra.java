package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ChatExtra extends Extra {
    @c(a = "dueDate")
    public long dueDate;

    static {
        Covode.recordClassIndex(8662);
    }
}
