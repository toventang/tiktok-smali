package com.bytedance.android.message;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.n.u;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import h.f.a.b;
import h.z;
import java.util.Map;

public interface IMessageService extends a {
    static {
        Covode.recordClassIndex(13915);
    }

    void addOnMessageParsedListener(c cVar);

    a configInteractionMessageHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, u uVar, View view, b<? super Boolean, z> bVar, b<? super bv, z> bVar2, h.f.a.a<Boolean> aVar2, h.f.a.a<z> aVar3);

    IMessageManager get();

    Class<? extends com.bytedance.android.livesdk.ac.b.a> getMessageClass(String str);

    IMessageManager messageManagerProvider(long j2, Context context, String str);

    IMessageManager messageManagerProvider(long j2, boolean z, Context context);

    void registerMessageClass(Map<String, ? extends Class<? extends com.bytedance.android.livesdk.ac.b.a>> map);

    void release(long j2);

    void releaseAll();

    void releaseMsgAlog(long j2);

    void removeOnMessageParsedListener(c cVar);
}
