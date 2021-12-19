package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.a;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface bq extends m, a {
    static {
        Covode.recordClassIndex(9134);
    }

    void a(Throwable th);

    String g();

    Context getContext();

    DataChannel provideDataChannel();
}
