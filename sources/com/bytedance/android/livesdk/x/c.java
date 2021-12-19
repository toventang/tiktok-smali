package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdk.model.message.s;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class c implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private long f22903a;

    static {
        Covode.recordClassIndex(13533);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof s)) {
            return false;
        }
        s sVar = (s) iMessage;
        if (this.f22903a <= 0) {
            this.f22903a = u.a().b().c();
        }
        if (sVar.f19687f == null) {
            return true;
        }
        if (sVar.f19687f != null) {
            long j2 = this.f22903a;
            if (j2 <= 0 || j2 != sVar.f19687f.getId()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
