package com.bytedance.android.livesdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.d;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.as.b;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.x.f;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.message.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.MessageManagerFactory;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class as implements IMessageService {
    private final CopyOnWriteArrayList<c> onMessageParsedListeners = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(7794);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager get() {
        if (aq.f14026d) {
            return ar.f14028b;
        }
        return aq.f14023a.a(aq.f14025c, null);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseAll() {
        if (aq.f14026d) {
            if (ar.f14027a != null) {
                ar.f14027a.b();
                ar.f14027a = null;
            }
            if (ar.f14028b != null) {
                ar.f14028b.release();
                ar.f14028b = null;
            }
            e a2 = e.a();
            d dVar = b.a().f14066c;
            if (dVar != null) {
                a2.f12107b.remove(dVar);
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseMsgAlog(long j2) {
        aq.a(j2);
    }

    @Override // com.bytedance.android.message.IMessageService
    public Class<? extends a> getMessageClass(String str) {
        return x.getMessageClass(str);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void removeOnMessageParsedListener(c cVar) {
        l.d(cVar, "");
        this.onMessageParsedListeners.remove(cVar);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void addOnMessageParsedListener(c cVar) {
        l.d(cVar, "");
        if (!this.onMessageParsedListeners.contains(cVar)) {
            this.onMessageParsedListeners.add(cVar);
        }
    }

    public final void notifySelfChatMessageParsed(i iVar) {
        l.d(iVar, "");
        Iterator<T> it = this.onMessageParsedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void release(long j2) {
        IMessageManager a2;
        if (!aq.f14026d && (a2 = aq.f14023a.a(j2, null)) != null) {
            a2.release();
            aq.a(j2);
            aq.f14023a.b(j2);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void registerMessageClass(Map<String, ? extends Class<? extends a>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Class<? extends a>> entry : map.entrySet()) {
                x.registerMessageClass(entry.getKey(), (Class) entry.getValue());
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j2, Context context, String str) {
        IMessageManager iMessageManager;
        if (aq.f14026d) {
            com.bytedance.android.livesdk.client.c cVar = new com.bytedance.android.livesdk.client.c(false, u.a().b().c());
            com.bytedance.android.livesdk.client.b bVar = new com.bytedance.android.livesdk.client.b(false, u.a().b().c());
            cVar.a(j2, context);
            if (!TextUtils.isEmpty(str)) {
                cVar.f16701c = str;
            }
            iMessageManager = MessageManagerFactory.getV2(ar.a(cVar, bVar, j2, false));
            b.a().f14065b = ar.f14028b;
            e.a().a(b.a().f14066c);
        } else {
            com.bytedance.android.livesdk.client.b bVar2 = new com.bytedance.android.livesdk.client.b(false, u.a().b().c());
            bVar2.a(j2, context);
            if (!TextUtils.isEmpty(str)) {
                bVar2.f16687b = str;
            }
            iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(bVar2).setLogger(new com.bytedance.android.livesdk.ac.a.b()).setMonitor(new z()).setMessageConverter(new com.bytedance.android.livesdk.ac.a.a()).addInterceptor(new com.bytedance.android.livesdk.x.b(j2)).addInterceptor(new com.bytedance.android.livesdk.x.a()).addInterceptor(new com.bytedance.android.livesdk.x.c()).addInterceptor(new com.bytedance.android.livesdk.x.e()).addInterceptor(new com.bytedance.android.livesdk.x.d()).setAnchor(false).setEnablePriority(false).setEnableSmoothlyDispatch(true));
        }
        l.b(iMessageManager, "");
        return iMessageManager;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j2, boolean z, Context context) {
        IMessageManager iMessageManager;
        if (aq.f14026d) {
            iMessageManager = ar.a(j2, z, context);
        } else if (aq.f14026d) {
            iMessageManager = ar.a(j2, z, context);
        } else {
            aq.f14025c = j2;
            com.bytedance.android.livesdk.client.b bVar = new com.bytedance.android.livesdk.client.b(z, u.a().b().c());
            bVar.a(j2, context);
            com.bytedance.android.livesdk.ac.b giftInterceptor = ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getGiftInterceptor(j2, z);
            f fVar = new f();
            aq.f14024b.b(j2, fVar);
            iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(bVar).setLogger(new com.bytedance.android.livesdk.ac.a.b()).setMonitor(new z()).setMessageConverter(new com.bytedance.android.livesdk.ac.a.a()).addInterceptor(fVar).addInterceptor(new com.bytedance.android.livesdk.x.b(j2)).addInterceptor(giftInterceptor).addInterceptor(new com.bytedance.android.livesdk.x.a()).addInterceptor(new com.bytedance.android.livesdk.x.c()).addInterceptor(new com.bytedance.android.livesdk.x.e()).addInterceptor(new com.bytedance.android.livesdk.x.d()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true));
            aq.f14023a.b(j2, iMessageManager);
            giftInterceptor.a(iMessageManager);
        }
        l.b(iMessageManager, "");
        return iMessageManager;
    }

    @Override // com.bytedance.android.message.IMessageService
    public com.bytedance.android.message.a configInteractionMessageHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, com.bytedance.android.live.n.u uVar, View view, h.f.a.b<? super Boolean, z> bVar, h.f.a.b<? super bv, z> bVar2, h.f.a.a<Boolean> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(view, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        return new com.bytedance.android.livesdk.ac.d(aVar, dataChannel, uVar, view, bVar, bVar2, aVar2, aVar3);
    }
}
