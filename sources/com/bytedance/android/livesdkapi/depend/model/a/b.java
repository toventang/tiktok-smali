package com.bytedance.android.livesdkapi.depend.model.a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(13631);
    }

    void a(BroadcastReceiver broadcastReceiver);

    void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void a(Bundle bundle);
}
