package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.api.m;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.p;
import com.ss.android.ugc.playerkit.model.v;

final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private l f115363a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f115364b = b(300);

    /* renamed from: c  reason: collision with root package name */
    private boolean f115365c;

    /* renamed from: d  reason: collision with root package name */
    private a f115366d;

    interface a {
        static {
            Covode.recordClassIndex(74088);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(74087);
    }

    private static int b(int i2) {
        int r = com.ss.android.ugc.playerkit.exp.b.r();
        if (i2 < r) {
            return r;
        }
        return i2;
    }

    public final void a(int i2) {
        if (i2 > 0) {
            this.f115364b = b(i2);
        }
    }

    public final void handleMessage(Message message) {
        if (this.f115363a != null && !this.f115365c) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f115363a.a((p) message.obj);
                    if (message.obj != null && ((p) message.obj).aC) {
                        if (!((p) message.obj).t || !((p) message.obj).aA) {
                            this.f115363a.a(j.e.NORMAL);
                            return;
                        } else {
                            this.f115363a.a(j.e.LOW);
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                default:
                    return;
                case 3:
                    this.f115363a.d();
                    return;
                case 4:
                    if (message.obj == null) {
                        this.f115363a.h();
                        return;
                    } else {
                        this.f115363a.a((String) message.obj);
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f115363a.f();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f115363a.e();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if ((message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue()) {
                        this.f115363a.a(j.e.LOW);
                    }
                    this.f115363a.g();
                    this.f115365c = true;
                    a aVar = this.f115366d;
                    if (aVar != null) {
                        aVar.a();
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.f115363a.c();
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    Pair pair = (Pair) message.obj;
                    if (pair != null) {
                        this.f115363a.a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f115363a.a(((Float) message.obj).floatValue());
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f115363a.s();
                    if (com.ss.android.ugc.playerkit.exp.b.o()) {
                        removeMessages(12);
                    }
                    sendEmptyMessageDelayed(12, (long) this.f115364b);
                    return;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    Pair pair2 = (Pair) message.obj;
                    if (pair2 != null) {
                        this.f115363a.a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_SELECT_SCENE:
                    this.f115363a.a((SurfaceHolder) message.obj);
                    return;
                case 15:
                    this.f115363a.a((Surface) message.obj);
                    this.f115363a.b((Surface) message.obj);
                    return;
                case 16:
                    this.f115363a.b();
                    return;
                case 17:
                    if ((message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue()) {
                        this.f115363a.a(j.e.LOW);
                    }
                    this.f115363a.b((Surface) null);
                    this.f115363a.p();
                    return;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    if (message.arg1 == 0) {
                        this.f115363a.c(message.arg2);
                        return;
                    } else if (message.arg1 == 1) {
                        l lVar = this.f115363a;
                        if (message.arg2 == 1) {
                            z = true;
                        }
                        lVar.a(z);
                        return;
                    } else if (message.arg1 == 2) {
                        this.f115363a.a((m) message.obj);
                        return;
                    } else {
                        return;
                    }
                case 19:
                    this.f115363a.m();
                    return;
                case v.U:
                    this.f115363a.A();
                    return;
                case 21:
                    this.f115363a.a((Surface) message.obj);
                    return;
                case 22:
                    if (message.arg1 == 0) {
                        this.f115363a.d(message.arg2);
                        return;
                    } else if (message.arg1 == 2) {
                        this.f115363a.a((com.ss.android.ugc.aweme.player.sdk.api.a) message.obj);
                        return;
                    } else {
                        return;
                    }
                case 23:
                    Bundle bundle = (Bundle) message.obj;
                    this.f115363a.a(bundle.getBoolean("crop_param_open", false), bundle);
                    return;
                case 24:
                    Bundle bundle2 = (Bundle) message.obj;
                    this.f115363a.a(bundle2.getInt("texture_layout_param", 0), bundle2);
                    return;
                case 25:
                    g gVar = (g) message.obj;
                    if (gVar != null) {
                        this.f115363a.a(gVar);
                        return;
                    }
                    return;
            }
        }
    }

    public b(a aVar, Looper looper, l lVar) {
        super(looper);
        this.f115363a = lVar;
        this.f115366d = aVar;
    }
}
