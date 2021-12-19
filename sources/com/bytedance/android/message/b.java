package com.bytedance.android.message;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.n.u;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import h.f.b.l;
import h.z;
import java.util.Map;

public class b implements IMessageService {
    static {
        Covode.recordClassIndex(13917);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void addOnMessageParsedListener(c cVar) {
        l.d(cVar, "");
    }

    @Override // com.bytedance.android.message.IMessageService
    public a configInteractionMessageHelper(a aVar, DataChannel dataChannel, u uVar, View view, h.f.a.b<? super Boolean, z> bVar, h.f.a.b<? super bv, z> bVar2, h.f.a.a<Boolean> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(view, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager get() {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public Class<? extends com.bytedance.android.livesdk.ac.b.a> getMessageClass(String str) {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j2, Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j2, boolean z, Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void registerMessageClass(Map<String, ? extends Class<? extends com.bytedance.android.livesdk.ac.b.a>> map) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void release(long j2) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseAll() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseMsgAlog(long j2) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void removeOnMessageParsedListener(c cVar) {
        l.d(cVar, "");
    }
}
