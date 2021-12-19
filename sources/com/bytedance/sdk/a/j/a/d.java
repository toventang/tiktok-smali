package com.bytedance.sdk.a.j.a;

import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;

public final class d extends a {
    static {
        Covode.recordClassIndex(26569);
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final void d() {
        this.f43346c.removeMessages(1);
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final void c() {
        d();
        this.f43346c.sendEmptyMessageDelayed(1, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    @Override // com.bytedance.sdk.a.j.a.a
    public final void a(c cVar) {
        if (cVar != null) {
            cVar.f43357c.removeMessages(1);
        }
    }

    @Override // com.bytedance.sdk.a.j.a.a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 1) {
                    f43344a.e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public d(BlockingQueue<e> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
