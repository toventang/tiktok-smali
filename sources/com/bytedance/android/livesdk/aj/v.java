package com.bytedance.android.livesdk.aj;

import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.aj.a.a;
import com.bytedance.android.livesdk.aj.a.b;
import com.bytedance.android.livesdk.aj.a.c;
import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.videoarch.a.g;
import java.util.Map;
import org.json.JSONObject;

public final class v implements Handler.Callback, g {

    /* renamed from: e  reason: collision with root package name */
    private static final SparseIntArray f13901e;

    /* renamed from: a  reason: collision with root package name */
    g f13902a;

    /* renamed from: b  reason: collision with root package name */
    aa f13903b;

    /* renamed from: c  reason: collision with root package name */
    g.a f13904c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f13905d = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private g.b f13906f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f13907g;

    /* renamed from: h  reason: collision with root package name */
    private HandlerThread f13908h;

    /* renamed from: i  reason: collision with root package name */
    private g.a f13909i = new g.a() {
        /* class com.bytedance.android.livesdk.aj.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7719);
        }

        @Override // com.bytedance.android.livesdk.aj.g.a
        public final void a(g.c cVar, int i2, String str) {
            d.a("TTLivePlayer2", "sub thread message is " + cVar.name());
            if (cVar != g.c.RENDERING_START || !LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
                v.this.f13905d.post(new y(this, cVar, i2, str));
            } else {
                v.this.f13905d.postAtFrontOfQueue(new x(this, cVar, i2, str));
            }
        }
    };

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, Map<String, String> map, g.d dVar) {
        b("TTLivePlayer2", "setDataSource: with url");
        a(a(2, new b(str, map, dVar)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, String str2) {
        b("TTLivePlayer2", "setDataSource: with pull stream data");
        a(a(1, new a(str, str2)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(boolean z) {
        b("TTLivePlayer2", "setMute: ".concat(String.valueOf(z)));
        a(a(7, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str) {
        b("TTLivePlayer2", "switchResolution: ".concat(String.valueOf(str)));
        a(a(10, str));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(boolean z, boolean z2, int i2) {
        b("TTLivePlayer2", "setSuperResolutionOptions: " + z + "," + z2 + "," + i2);
        a(a(16, new c(z, z2, i2)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, q qVar) {
        b("TTLivePlayer2", "switchResolution: ".concat(String.valueOf(str)));
        if (this.f13907g == null) {
            this.f13907g = new Handler(this.f13908h.getLooper(), this);
        }
        a(Message.obtain(this.f13907g, new w(this, str, qVar)));
    }

    private void l() {
        HandlerThread handlerThread = this.f13908h;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13908h.interrupt();
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final boolean g() {
        com.ss.videoarch.a.g gVar = this.f13902a;
        if (gVar == null || gVar.t != g.c.PLAYED) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final boolean h() {
        com.ss.videoarch.a.g gVar = this.f13902a;
        if (gVar == null || !gVar.j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final JSONObject j() {
        com.ss.videoarch.a.g gVar = this.f13902a;
        if (gVar != null) {
            return gVar.n();
        }
        return new JSONObject();
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final String k() {
        com.ss.videoarch.a.g gVar = this.f13902a;
        if (gVar != null) {
            return gVar.P;
        }
        return "";
    }

    static {
        Covode.recordClassIndex(7718);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f13901e = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a() {
        b("TTLivePlayer2", "reset: ");
        a(a(15, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c() {
        b("TTLivePlayer2", "start: ");
        a(a(3, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void d() {
        b("TTLivePlayer2", "stop: ");
        a(a(12, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void e() {
        b("TTLivePlayer2", "release: ");
        a(a(13, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void f() {
        b("TTLivePlayer2", "releaseAsync: ");
        a(a(14, (Object) null));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final Point i() {
        if (this.f13902a != null) {
            return new Point(this.f13902a.k(), this.f13902a.l());
        }
        return new Point(0, 0);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b() {
        b("TTLivePlayer2", "prepareAsync: ");
        a(a(4, (Object) null));
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        return this.f13902a.a(str);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c(String str) {
        a(a(22, str));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void d(boolean z) {
        a(a(23, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void e(boolean z) {
        a(a(24, Boolean.valueOf(z)));
    }

    private void a(Message message) {
        HandlerThread handlerThread = this.f13908h;
        if (handlerThread != null && handlerThread.isAlive() && !this.f13908h.isInterrupted()) {
            if (this.f13907g == null) {
                this.f13907g = new Handler(this.f13908h.getLooper(), this);
            }
            this.f13907g.sendMessageDelayed(message, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c(boolean z) {
        b("TTLivePlayer2", "setPreviewFlag: ".concat(String.valueOf(z)));
        a(a(19, Boolean.valueOf(z)));
    }

    public v(z zVar) {
        HandlerThread handlerThread = new HandlerThread("single-live-player-thread", 10);
        this.f13908h = handlerThread;
        handlerThread.start();
        this.f13907g = new Handler(this.f13908h.getLooper(), this);
        b("TTLivePlayer2", "init: ");
        a(a(18, zVar));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(int i2) {
        b("TTLivePlayer2", "setImageLayout: ".concat(String.valueOf(i2)));
        a(a(17, Integer.valueOf(i2)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b(String str) {
        b("TTLivePlayer2", "setProjectKey: ".concat(String.valueOf(str)));
        a(a(20, str));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(Surface surface) {
        String valueOf;
        StringBuilder sb = new StringBuilder("setSurfaceDisplay: surface = ");
        if (surface == null) {
            valueOf = "null";
        } else {
            valueOf = String.valueOf(surface.hashCode());
        }
        b("TTLivePlayer2", sb.append(valueOf).toString());
        a(a(5, surface));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b(boolean z) {
        b("TTLivePlayer2", "setSeiOpen: ".concat(String.valueOf(z)));
        a(a(9, Boolean.valueOf(z)));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(SurfaceHolder surfaceHolder) {
        String valueOf;
        StringBuilder sb = new StringBuilder("setSurfaceDisplay: surface holder= ");
        if (surfaceHolder == null) {
            valueOf = "null";
        } else {
            valueOf = String.valueOf(surfaceHolder.hashCode());
        }
        b("TTLivePlayer2", sb.append(valueOf).toString());
        a(a(6, surfaceHolder));
    }

    public final boolean handleMessage(Message message) {
        String str;
        AudioManager audioManager;
        com.ss.videoarch.a.g gVar;
        switch (message.what) {
            case 1:
                a aVar = (a) message.obj;
                String str2 = aVar.f13797a;
                String str3 = aVar.f13798b;
                this.f13902a.b(str2);
                if (!m.a(str3)) {
                    this.f13902a.a(43, str3);
                    break;
                }
                break;
            case 2:
                b bVar = (b) message.obj;
                String str4 = bVar.f13799a;
                Map<String, String> map = bVar.f13800b;
                if (str4.indexOf("://") > 0) {
                    Uri parse = Uri.parse(str4);
                    if (map != null) {
                        str = map.get("sdk_params");
                    } else {
                        str = "";
                    }
                    this.f13902a.a(new com.ss.videoarch.a.c.c[]{new com.ss.videoarch.a.c.c(parse.toString(), str)});
                    break;
                } else {
                    this.f13902a.c(Uri.parse("file://".concat(String.valueOf(str4))).toString());
                    break;
                }
            case 3:
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.f13902a.a(18, 0);
                    this.f13902a.a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
                    this.f13902a.a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.f13902a.a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
                    this.f13902a.a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(35, 1);
                    this.f13902a.a(33, 1);
                    this.f13902a.a(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(36, 1);
                }
                this.f13902a.a(72, com.bytedance.android.livesdk.utils.g.a());
                this.f13902a.a(9, 2);
                this.f13902a.b();
                g.b bVar2 = this.f13906f;
                if (bVar2 != null) {
                    bVar2.h();
                    break;
                }
                break;
            case 4:
                this.f13902a.a(2, 0);
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.f13902a.a(18, 0);
                    this.f13902a.a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
                    this.f13902a.a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.f13902a.a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
                    this.f13902a.a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(35, 1);
                    this.f13902a.a(33, 1);
                    this.f13902a.a(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(36, 1);
                }
                if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(40, 0);
                }
                if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
                    this.f13902a.a(42, 1);
                }
                this.f13902a.a(72, com.bytedance.android.livesdk.utils.g.a());
                this.f13902a.a(9, 2);
                this.f13902a.b();
                g.b bVar3 = this.f13906f;
                if (bVar3 != null) {
                    bVar3.h();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.f13902a.a((Surface) message.obj);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                this.f13902a.a((SurfaceHolder) message.obj);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                this.f13902a.a(Boolean.valueOf(((Boolean) message.obj).booleanValue()));
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                float floatValue = ((Float) message.obj).floatValue();
                com.ss.videoarch.a.g gVar2 = this.f13902a;
                com.ss.videoarch.a.e.b bVar4 = gVar2.f154317h;
                if (!(bVar4.f154292b == null || (audioManager = (AudioManager) com.ss.videoarch.a.e.b.a(bVar4.f154291a, DataType.AUDIO)) == null)) {
                    audioManager.setStreamVolume(3, (int) floatValue, 0);
                }
                gVar2.f154311b.cK = floatValue;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                if (!((Boolean) message.obj).booleanValue() && (gVar = this.f13902a) != null) {
                    gVar.a(41, 0);
                    break;
                }
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                d((String) message.obj);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                com.ss.videoarch.a.g gVar3 = this.f13902a;
                gVar3.f("pause");
                if (gVar3.f154319j != null && gVar3.f154319j.p()) {
                    if (gVar3.f154322m != null) {
                        gVar3.f154322m.a(true);
                    }
                    gVar3.t = g.c.PAUSED;
                    gVar3.f154319j.g();
                    break;
                }
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                this.f13902a.c();
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                this.f13902a.h();
                l();
                break;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                this.f13902a.i();
                l();
                break;
            case 15:
                this.f13902a.e();
                break;
            case 16:
                Object obj = message.obj;
                break;
            case 17:
                ((Integer) message.obj).intValue();
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                z zVar = (z) message.obj;
                this.f13902a = zVar.a();
                aa aaVar = zVar.f13928g;
                this.f13903b = aaVar;
                aaVar.f13805a = this.f13909i;
                g.b bVar5 = this.f13906f;
                if (bVar5 != null) {
                    this.f13903b.f13806b = bVar5;
                }
                this.f13902a.a(44, 0);
                break;
            case 19:
                this.f13902a.a(((Boolean) message.obj).booleanValue());
                break;
            case com.ss.android.ugc.playerkit.model.v.U /*{ENCODED_INT: 20}*/:
                this.f13902a.d((String) message.obj);
                break;
            case 21:
                com.bytedance.android.livesdkapi.depend.model.c.a aVar2 = (com.bytedance.android.livesdkapi.depend.model.c.a) message.obj;
                this.f13902a.a(63, aVar2.f23027a + "-" + aVar2.f23028b);
                this.f13902a.a(64, aVar2.f23029c);
                com.bytedance.android.live.core.c.a.a(4, "LivePlayerEntranceParam", aVar2.f23027a + ", " + aVar2.f23028b + ", " + aVar2.f23029c);
                break;
            case 22:
                String str5 = (String) message.obj;
                if (!m.a(str5)) {
                    this.f13902a.a(86, str5);
                    break;
                }
                break;
            case 23:
                this.f13902a.a(76, ((Boolean) message.obj).booleanValue() ? 1 : 0);
                break;
            case 24:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                com.ss.videoarch.a.g gVar4 = this.f13902a;
                if (gVar4 != null) {
                    gVar4.a(56, booleanValue ? 1 : 0);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(com.bytedance.android.livesdkapi.depend.model.c.a aVar) {
        if (aVar == null) {
            aVar = new com.bytedance.android.livesdkapi.depend.model.c.a("", "", "");
        }
        a(a(21, aVar));
    }

    private static Message a(int i2, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.obj = obj;
        return obtain;
    }

    private void b(String str, String str2) {
        d.b(str, str2 + " <===> player hash:" + hashCode());
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(g.a aVar, g.b bVar) {
        this.f13904c = aVar;
        aa aaVar = this.f13903b;
        if (aaVar != null) {
            aaVar.f13806b = bVar;
        }
        this.f13906f = bVar;
    }
}
