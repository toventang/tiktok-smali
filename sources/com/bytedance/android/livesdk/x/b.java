package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.model.message.ae;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.android.livesdk.model.message.ay;
import com.bytedance.android.livesdk.model.message.v;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class b implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private long f22902a;

    static {
        Covode.recordClassIndex(13532);
    }

    public b(long j2) {
        this.f22902a = j2;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        a aVar = (a) iMessage;
        if ((aVar instanceof au) && aVar.O != null) {
            ((au) aVar).O.f23211c = this.f22902a;
            return false;
        } else if ((aVar instanceof ae) || (aVar instanceof ay) || (aVar instanceof v) || LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue() || aVar.O == null || aVar.O.f23211c == this.f22902a) {
            return false;
        } else {
            return true;
        }
    }
}
