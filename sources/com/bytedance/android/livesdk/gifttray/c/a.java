package com.bytedance.android.livesdk.gifttray.c;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.service.animation.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f18022a = 1;

    static {
        Covode.recordClassIndex(10003);
    }

    public void a() {
    }

    public void a(c cVar) {
    }

    public void a(c cVar, Boolean bool) {
    }

    public abstract void a(DataChannel dataChannel);

    public void b() {
    }

    public abstract void setGiftMessage(com.bytedance.android.livesdk.gifttray.a.a aVar);

    /* access modifiers changed from: protected */
    public final int getMIndex() {
        return this.f18022a;
    }

    /* access modifiers changed from: protected */
    public final void setMIndex(int i2) {
        this.f18022a = i2;
    }

    public final void setTrackNum(int i2) {
        this.f18022a = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
    }

    public final void a(int i2, int i3) {
        setX((float) i2);
        setY((float) i3);
    }
}
