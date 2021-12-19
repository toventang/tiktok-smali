package com.bytedance.android.live.liveinteract.match.b.g;

import com.bytedance.android.live.liveinteract.match.b.a.a;
import com.bytedance.android.live.liveinteract.match.b.c.k;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a extends a.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0199a f10697b = new C0199a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f10698a;

    static {
        Covode.recordClassIndex(5720);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$a  reason: collision with other inner class name */
    public static final class C0199a {
        static {
            Covode.recordClassIndex(5721);
        }

        private C0199a() {
        }

        public /* synthetic */ C0199a(byte b2) {
            this();
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10705b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10706c;

        static {
            Covode.recordClassIndex(5724);
        }

        d(a aVar, boolean z, int i2) {
            this.f10704a = aVar;
            this.f10705b = z;
            this.f10706c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f10704a.f10031h != null) {
                com.bytedance.android.live.liveinteract.match.c.a.b(this.f10705b, "normal", null);
                com.bytedance.android.live.core.c.a.a(4, "InteractBattleTAG", "reject, success");
                com.bytedance.android.live.liveinteract.match.b.b.a.a("reject_success", this.f10706c);
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10700b;

        static {
            Covode.recordClassIndex(5722);
        }

        b(a aVar, boolean z) {
            this.f10699a = aVar;
            this.f10700b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f10699a.f10031h != null) {
                boolean z = this.f10700b;
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10800d);
                com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "open_succeed", jSONObject, z, 8);
                com.bytedance.android.live.core.c.a.a(4, "InteractBattleTAG", "open, success");
            }
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10708b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10709c;

        static {
            Covode.recordClassIndex(5725);
        }

        e(a aVar, boolean z, int i2) {
            this.f10707a = aVar;
            this.f10708b = z;
            this.f10709c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f10707a.f10031h != null) {
                com.bytedance.android.live.core.c.a.a(4, "InteractBattleTAG", "reject, failed");
                com.bytedance.android.live.liveinteract.match.c.a.a(this.f10708b, "normal", th, (Map<String, ? extends Object>) null);
                com.bytedance.android.live.liveinteract.match.b.b.a.a("reject_failed", this.f10709c);
                a aVar = this.f10707a;
                if (th == null) {
                    l.b();
                }
                aVar.a(th);
                ((a.c) this.f10707a.f10031h).a(th);
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10703c;

        static {
            Covode.recordClassIndex(5723);
        }

        c(a aVar, boolean z, long j2) {
            this.f10701a = aVar;
            this.f10702b = z;
            this.f10703c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f10701a.f10031h != null) {
                boolean z = this.f10702b;
                long j2 = this.f10703c;
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.liveinteract.match.c.a.a(jSONObject, th);
                com.bytedance.android.live.core.d.a.a(jSONObject, "battle_id", j2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10800d);
                int i2 = 1;
                com.bytedance.android.live.liveinteract.match.c.a.a("open_failed", jSONObject, z, 1);
                com.bytedance.android.live.core.c.a.a(4, "InteractBattleTAG", "open, success");
                if (this.f10702b) {
                    i2 = 2;
                }
                com.bytedance.android.live.liveinteract.match.b.b.a.a("open_failed", i2);
                a aVar = this.f10701a;
                if (th == null) {
                    l.b();
                }
                aVar.a(th);
                ((a.c) this.f10701a.f10031h).b(th);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(a.c cVar, DataChannel dataChannel) {
        super(cVar);
        l.d(cVar, "");
        l.d(dataChannel, "");
        this.f10698a = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.a.a.b
    public final void a(int i2, long j2) {
        int i3;
        long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
        boolean z = true;
        if (i2 == 1) {
            i3 = 2;
        } else {
            z = false;
            i3 = 0;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.b.b(z, false);
        com.bytedance.android.live.liveinteract.match.c.a.a(z, "normal", (Map<String, ? extends Object>) null);
        ((z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).reject(c2, j2, i2).a(f())).a(new d(this, z, i3), new e(this, z, i3));
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.a.a.b
    public final void b(int i2, long j2) {
        boolean z;
        long j3;
        long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.b.b(z, true);
        com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "open_request", new JSONObject(), z, 8);
        com.bytedance.android.live.liveinteract.match.c.a.f10800d = System.currentTimeMillis();
        this.f10698a.b(k.class, Boolean.valueOf(z));
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            j3 = LiveTimeIncrementForBattleSetting.INSTANCE.getValue() + value;
        } else {
            j3 = value;
        }
        ((z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).open(c2, j2, value, j3).a(f())).a(new b(this, z), new c(this, z, j2));
    }
}
