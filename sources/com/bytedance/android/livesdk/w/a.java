package com.bytedance.android.livesdk.w;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final long f22389a;

    /* renamed from: b  reason: collision with root package name */
    private IMessageManager f22390b;

    /* renamed from: c  reason: collision with root package name */
    private long f22391c;

    static {
        Covode.recordClassIndex(13221);
    }

    @Override // com.bytedance.android.livesdk.ac.b
    public final void a(IMessageManager iMessageManager) {
        this.f22390b = iMessageManager;
    }

    public a(long j2) {
        this.f22389a = j2;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof y)) {
            return false;
        }
        if (this.f22391c <= 0) {
            f b2 = u.a().b();
            l.b(b2, "");
            this.f22391c = b2.c();
        }
        y yVar = (y) iMessage;
        if (this.f22391c > 0 && !yVar.s && yVar.f19705g != null) {
            long j2 = this.f22391c;
            User user = yVar.f19705g;
            l.b(user, "");
            if (j2 == user.getId() && yVar.f19711m != 1) {
                return true;
            }
        }
        if (yVar.f19705g == null) {
            return true;
        }
        return false;
    }
}
