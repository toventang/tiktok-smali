package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class e implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private long f22904a;

    static {
        Covode.recordClassIndex(13535);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) iMessage;
        if (this.f22904a <= 0) {
            this.f22904a = u.a().b().c();
        }
        if (aiVar.f19136h == null) {
            return true;
        }
        if (aiVar.f19136h != null) {
            long j2 = this.f22904a;
            if (j2 <= 0 || j2 != aiVar.f19136h.getId() || aiVar.f13611c) {
                return false;
            }
            return true;
        }
        return false;
    }
}
