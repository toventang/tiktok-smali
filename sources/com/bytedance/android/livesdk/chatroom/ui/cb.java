package com.bytedance.android.livesdk.chatroom.ui;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.b.b;
import com.bytedance.android.livesdk.chatroom.detail.f;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16057a;

    static {
        Covode.recordClassIndex(8881);
    }

    cb(br brVar) {
        this.f16057a = brVar;
    }

    public final void run() {
        br brVar = this.f16057a;
        if (brVar.u != null) {
            f fVar = brVar.u;
            IMessageManager iMessageManager = ((IMessageService) a.a(IMessageService.class)).get();
            while (!fVar.f15237d.isEmpty() && iMessageManager != null) {
                iMessageManager.insertMessage((IMessage) fVar.f15237d.poll());
            }
        }
        if (brVar.f15994d != null && brVar.f15994d.getStatus() == 3) {
            n a2 = b.a(brVar.f15993c);
            IMessageManager iMessageManager2 = ((IMessageService) a.a(IMessageService.class)).get();
            if (iMessageManager2 != null) {
                iMessageManager2.insertMessage(a2, true);
            }
        }
        if (brVar.f16002l) {
            User user = new User();
            user.setId(brVar.f15995e);
            brVar.V.c(t.class, new h(user, brVar.f16000j));
            brVar.f16002l = false;
            brVar.f16000j = 0;
        } else if (brVar.f15999i) {
            User user2 = new User();
            user2.setId(brVar.f15995e);
            brVar.V.c(t.class, new h(user2, brVar.f16000j));
            brVar.f15999i = false;
            brVar.f16000j = 0;
        }
        if (TextUtils.equals(brVar.f16001k, "gift_panel")) {
            User user3 = new User();
            user3.setId(brVar.f15995e);
            brVar.V.c(t.class, new h(user3));
            brVar.f16001k = null;
        } else if (TextUtils.equals(brVar.f16001k, "package_panel")) {
            User user4 = new User();
            user4.setId(brVar.f15995e);
            brVar.V.c(t.class, new h(user4));
            brVar.f16001k = null;
        }
    }
}
