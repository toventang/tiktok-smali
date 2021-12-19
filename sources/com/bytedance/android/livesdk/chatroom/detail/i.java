package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;

public final class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15261a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f15262b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    private final long f15263c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15264d;

    /* renamed from: e  reason: collision with root package name */
    private final String f15265e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15266f;

    /* renamed from: g  reason: collision with root package name */
    private final a f15267g;

    /* renamed from: h  reason: collision with root package name */
    private f f15268h;

    /* renamed from: i  reason: collision with root package name */
    private long f15269i = ((long) AudiencePingIntervalSetting.INSTANCE.getValue());

    public interface a {
        static {
            Covode.recordClassIndex(8447);
        }

        void a(int i2);

        void a(long j2);

        boolean a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(8446);
    }

    public final void a() {
        if (this.f15261a) {
            this.f15261a = false;
            this.f15262b.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        if (!this.f15261a || !this.f15267g.a()) {
            a();
            return;
        }
        com.bytedance.android.livesdk.chatroom.b.f.a(this.f15262b, this.f15263c, this.f15266f);
        long j2 = this.f15269i;
        if (j2 > 0 && j2 >= ((long) AudiencePingIntervalSetting.INSTANCE.getValue())) {
            this.f15262b.sendMessageDelayed(this.f15262b.obtainMessage(8), this.f15269i * 1000);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.f15261a) {
            int i2 = message.what;
            if (i2 == 7) {
                Object obj = message.obj;
                if (!this.f15261a) {
                    return;
                }
                if (obj instanceof com.bytedance.android.live.a.a.b.a) {
                    int errorCode = ((com.bytedance.android.live.a.a.a) obj).getErrorCode();
                    com.bytedance.android.live.core.c.a.a(3, "LivePingController", "ping replay api exception, error code: ".concat(String.valueOf(errorCode)));
                    if (30001 == errorCode || 30003 == errorCode || 30004 == errorCode) {
                        this.f15267g.a(errorCode);
                    } else if (50002 == errorCode) {
                        this.f15267g.c();
                    }
                } else if (obj instanceof PingResult) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String b2 = this.f15268h.b(obj);
                    if (LiveEnableALogSetting.INSTANCE.isEnable()) {
                        com.ss.a.a.a.f("pingresult", b2);
                    }
                    com.bytedance.android.live.core.c.a.a(2, "pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    PingResult pingResult = (PingResult) obj;
                    this.f15269i = pingResult.getNextPingInterval();
                    if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f15263c) {
                        this.f15267g.b();
                    } else if (pingResult.getMosaicStatus() != 0) {
                        a aVar = this.f15267g;
                        pingResult.getRoomId();
                        aVar.a((long) pingResult.getMosaicStatus());
                    }
                }
            } else if (i2 == 8) {
                b();
            }
        }
    }

    public i(long j2, long j3, String str, a aVar) {
        this.f15263c = j2;
        this.f15264d = j3;
        this.f15265e = str;
        this.f15266f = false;
        this.f15267g = aVar;
        this.f15268h = e.a.f9628b;
    }
}
