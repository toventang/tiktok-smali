package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdk.ab.l;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class a implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private long f22901a;

    static {
        Covode.recordClassIndex(13531);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof i)) {
            return false;
        }
        i iVar = (i) iMessage;
        if (this.f22901a <= 0) {
            this.f22901a = u.a().b().c();
        }
        if (iVar.f19630g == null) {
            new l().a("content", iVar.f19629f).a("is_visiable_to_senter", String.valueOf(iVar.f19631h)).a("support_display_text", String.valueOf(iVar.a())).a("client_user_id", String.valueOf(this.f22901a)).a("chat_message_exception_log", 0);
            return true;
        }
        if (!iVar.f19631h && iVar.f19630g != null) {
            long j2 = this.f22901a;
            if (j2 <= 0 || j2 != iVar.f19630g.getId()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
