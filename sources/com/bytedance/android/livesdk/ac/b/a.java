package com.bytedance.android.livesdk.ac.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public abstract class a extends com.bytedance.android.livesdkapi.h.a implements IMessage {

    /* renamed from: b  reason: collision with root package name */
    public boolean f13610b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13611c;

    /* renamed from: d  reason: collision with root package name */
    public int f13612d;

    /* renamed from: e  reason: collision with root package name */
    public int f13613e;

    static {
        Covode.recordClassIndex(7535);
    }

    public boolean a() {
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getPriority() {
        return 0;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getGeneralMessageType() {
        return this.f13613e;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getMessageFrom() {
        return this.f13612d;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getIntType() {
        return this.L.getIntType();
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getMessageId() {
        if (this.O != null) {
            return this.O.f23212d;
        }
        return 0;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public boolean needMonitor() {
        if (this.O == null || this.O.f23217i == 0) {
            return false;
        }
        return true;
    }
}
