package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import androidx.lifecycle.l;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public interface w extends l, z, WeakHandler.IHandler, OnMessageListener {
    static {
        Covode.recordClassIndex(7119);
    }

    w a(DataChannel dataChannel);

    void a(e eVar, IIconSlot.b bVar);

    void a(String str, Object obj);
}
