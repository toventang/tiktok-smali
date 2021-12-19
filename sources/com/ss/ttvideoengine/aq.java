package com.ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    HandlerThread f152263a;

    /* renamed from: b  reason: collision with root package name */
    Handler f152264b;

    /* renamed from: c  reason: collision with root package name */
    public Lock f152265c;

    /* renamed from: d  reason: collision with root package name */
    public Parcel f152266d;

    /* renamed from: e  reason: collision with root package name */
    Handler f152267e;

    /* renamed from: f  reason: collision with root package name */
    public Lock f152268f;

    /* renamed from: g  reason: collision with root package name */
    Parcel f152269g;

    /* renamed from: h  reason: collision with root package name */
    List<Condition> f152270h;

    /* renamed from: i  reason: collision with root package name */
    aj f152271i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f152272j;

    static {
        Covode.recordClassIndex(101489);
    }

    public final boolean a(boolean z) {
        if (!this.f152272j || !z) {
            Lock lock = this.f152265c;
            if (lock != null) {
                lock.lock();
                if (this.f152264b == null || Looper.myLooper() == this.f152264b.getLooper()) {
                    this.f152265c.unlock();
                } else {
                    this.f152265c.unlock();
                    return true;
                }
            }
            return false;
        }
        j.a("TTVideoEngineLooperThread", "mIsHandlingMainMsg return false, thread:" + Looper.myLooper().getThread());
        return false;
    }

    public final boolean a(int i2, long j2, Object obj) {
        return b(i2, j2, obj);
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<Handler> f152277a;

        /* renamed from: b  reason: collision with root package name */
        Message f152278b;

        static {
            Covode.recordClassIndex(101492);
        }

        public final void run() {
            Handler handler;
            WeakReference<Handler> weakReference = this.f152277a;
            if (weakReference != null && (handler = weakReference.get()) != null) {
                handler.handleMessage(this.f152278b);
            }
        }

        c(Handler handler, Message message) {
            this.f152277a = new WeakReference<>(handler);
            this.f152278b = message;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Lock lock = this.f152265c;
        if (lock != null) {
            lock.lock();
            List<Condition> list = this.f152270h;
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < this.f152270h.size(); i2++) {
                    this.f152270h.get(i2).signalAll();
                }
                this.f152270h.clear();
            }
            Handler handler = this.f152264b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f152264b.getLooper().quit();
                this.f152264b = null;
            }
            this.f152265c.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        Looper mainLooper;
        if (this.f152264b == null) {
            return false;
        }
        Handler handler = this.f152267e;
        if (handler == null || handler.getLooper() == null || this.f152267e.getLooper().getThread() == null || this.f152267e.getLooper().getThread().isAlive()) {
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Handler handler2 = this.f152267e;
            if (handler2 != null && handler2.getLooper() != mainLooper) {
                return true;
            }
            if (this.f152267e != null) {
                j.b("TTVideoEngineLooperThread", "mainHandler looper:" + this.f152267e.getLooper());
            }
            return false;
        }
        j.c("TTVideoEngineLooperThread", "main looper thread is not alive, return false");
        return false;
    }

    aq(aj ajVar) {
        this.f152271i = ajVar;
    }

    public final void a(int i2) {
        a(i2, 0, 0, null);
    }

    /* access modifiers changed from: package-private */
    public class b extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<aj> f152276b;

        static {
            Covode.recordClassIndex(101491);
        }

        public final void handleMessage(Message message) {
            Map map;
            Condition condition;
            Object obj;
            aj ajVar = this.f152276b.get();
            if (ajVar == null) {
                j.c("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                condition = null;
                obj = null;
            }
            int i2 = message.what;
            if (i2 != 600) {
                boolean z = false;
                switch (i2) {
                    case 400:
                        if (ajVar.K != null) {
                            ajVar.K.a(ajVar, message.arg1);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.a(ajVar, message.arg1);
                            break;
                        }
                        break;
                    case 401:
                        int i3 = message.arg1;
                        if (message.arg2 == 1 || i3 != 3) {
                            if (ajVar.K != null) {
                                ajVar.K.b(ajVar, i3);
                            }
                            if (ajVar.J != null) {
                                ajVar.J.b(ajVar, i3);
                                break;
                            }
                        }
                        break;
                    case 402:
                        if (ajVar.K != null) {
                            ajVar.K.a(ajVar, message.arg1, message.arg2);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.a(ajVar, message.arg1, message.arg2);
                            break;
                        }
                        break;
                    case 403:
                        if (ajVar.K != null) {
                            ajVar.K.c(ajVar, message.arg1);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.c(ajVar, message.arg1);
                            break;
                        }
                        break;
                    case 404:
                        if (ajVar.K != null) {
                            ajVar.K.a(ajVar);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.a(ajVar);
                            break;
                        }
                        break;
                    case 405:
                        if (ajVar.K != null) {
                            ajVar.K.b(ajVar);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.b(ajVar);
                            break;
                        }
                        break;
                    case 406:
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.equals(ajVar.cg)) {
                                if (ajVar.K != null) {
                                    j.a("TTVideoEngineLooperThread", "notify render start");
                                    ajVar.K.c(ajVar);
                                }
                                if (ajVar.J != null) {
                                    j.a("TTVideoEngineLooperThread", "notify render start");
                                    ajVar.J.c(ajVar);
                                    break;
                                }
                            } else {
                                j.c("TTVideoEngineLooperThread", "MSG_NOTIFY_RENDER_START engine:" + ajVar + ", traceId not same, should be:" + str + ", now:" + ajVar.cg);
                                break;
                            }
                        }
                        break;
                    case 407:
                        if (ajVar.K != null) {
                            ajVar.K.d(ajVar, message.arg1);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.d(ajVar, message.arg1);
                            break;
                        }
                        break;
                    case 408:
                        if (ajVar.K != null) {
                            ajVar.K.d(ajVar);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.d(ajVar);
                            break;
                        }
                        break;
                    case 409:
                        com.ss.ttvideoengine.s.c cVar = (com.ss.ttvideoengine.s.c) obj;
                        if (ajVar.K != null) {
                            ajVar.K.a(cVar);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.a(cVar);
                            break;
                        }
                        break;
                    case 410:
                        if (ajVar.K != null) {
                            ajVar.K.a(message.arg1);
                        }
                        if (ajVar.J != null) {
                            ajVar.J.a(message.arg1);
                            break;
                        }
                        break;
                    case 411:
                        p pVar = (p) obj;
                        if (ajVar.N != null) {
                            ajVar.N.a(pVar);
                            aq.this.f152269g.setDataPosition(0);
                            aq.this.f152269g.writeInt(0);
                            break;
                        }
                        break;
                    case 412:
                        if (ajVar.O != null) {
                            ajVar.O.a((ba) obj);
                            break;
                        }
                        break;
                    case 413:
                        if (map != null && map.containsKey("paramObj1")) {
                            map.get("paramObj1");
                        }
                        ax axVar = ajVar.J;
                        break;
                    case 414:
                        if (message.arg1 == 1) {
                            z = true;
                        }
                        if (ajVar.P != null) {
                            ajVar.P.a(z);
                            ajVar.P = null;
                            break;
                        }
                        break;
                    case 415:
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            int intValue = ((Integer) map2.get("bufferStartAction")).intValue();
                            String str2 = (String) map2.get("traceid");
                            if (str2 == ajVar.cg) {
                                if (ajVar.T != null) {
                                    ajVar.T.a(message.arg1);
                                }
                                if (ajVar.U != null) {
                                    int i4 = message.arg1;
                                    int i5 = message.arg2;
                                }
                                if (ajVar.J != null) {
                                    ajVar.J.a(message.arg1, message.arg2, intValue);
                                    break;
                                }
                            } else {
                                j.c("TTVideoEngineLooperThread", "MSG_NOTIFY_BUFFER_START engine:" + ajVar + ", traceId not same, should be:" + str2 + ", now:" + ajVar.cg);
                                break;
                            }
                        }
                        break;
                    case 416:
                        if (ajVar.T != null) {
                            ajVar.T.b(message.arg1);
                        }
                        if (ajVar.U != null) {
                            int i6 = message.arg1;
                        }
                        if (ajVar.J != null) {
                            ajVar.J.b(message.arg1);
                            break;
                        }
                        break;
                    case 417:
                        w wVar = (w) obj;
                        if (ajVar.R != null) {
                            ajVar.R.a(wVar, message.arg1);
                        }
                        if (ajVar.J != null) {
                            int i7 = message.arg1;
                            break;
                        }
                        break;
                    case 418:
                        if (ajVar.W != null) {
                            int i8 = message.arg1;
                            int i9 = message.arg2;
                        }
                        if (ajVar.J != null) {
                            int i10 = message.arg1;
                            int i11 = message.arg2;
                            break;
                        }
                        break;
                    case 419:
                        if (ajVar.J != null) {
                            ajVar.J.e(ajVar);
                            break;
                        }
                        break;
                    case 420:
                        ax axVar2 = ajVar.J;
                        break;
                    default:
                        j.c("TTVideoEngineLooperThread", "unknown message: " + message.what);
                        break;
                }
            } else {
                if (ajVar.V != null) {
                    int i12 = message.arg1;
                    int i13 = message.arg2;
                }
                if (ajVar.J != null) {
                    int i14 = message.arg1;
                    int i15 = message.arg2;
                }
            }
            aq.a(aq.this.f152268f, condition);
        }

        public b(aj ajVar) {
            this.f152276b = new WeakReference<>(ajVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<aj> f152274b;

        static {
            Covode.recordClassIndex(101490);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.String[] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v38, resolved type: androidx.core.f.d */
        /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: java.lang.String */
        /* JADX DEBUG: Multi-variable search result rejected for r0v47, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            Map map;
            Object obj;
            Condition condition;
            boolean z;
            String str;
            String str2;
            aj ajVar = this.f152274b.get();
            if (ajVar == null) {
                j.c("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            Map<Integer, String> map2 = null;
            r0 = null;
            String str3 = null;
            r0 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            map2 = null;
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                obj = null;
                condition = null;
            }
            int i2 = message.what;
            if (i2 != 300) {
                if (i2 != 301) {
                    boolean z2 = true;
                    switch (i2) {
                        case 1:
                            ajVar.I();
                            break;
                        case 2:
                            ajVar.L();
                            break;
                        case 3:
                            ajVar.M();
                            break;
                        case 4:
                            ajVar.N();
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            ajVar.O();
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            int i3 = message.arg1;
                            ajVar.o();
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            ajVar.a(message.arg1, false);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_configResolution invalid param");
                                break;
                            } else {
                                w wVar = (w) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    map2 = (Map) map.get("paramObj1");
                                }
                                ajVar.a(wVar, map2);
                                break;
                            }
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_setPlayerVolume invalid param");
                                break;
                            } else {
                                float floatValue = ((Float) obj).floatValue();
                                if (map != null && map.containsKey("paramObj1")) {
                                    ajVar.b(floatValue, ((Float) map.get("paramObj1")).floatValue());
                                    break;
                                } else {
                                    ajVar.b(floatValue, floatValue);
                                    break;
                                }
                            }
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            if (message.arg1 != 1) {
                                z2 = false;
                            }
                            ajVar.f(z2);
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            j.a("TTVideoEngine", "_pause ");
                            if (ajVar.r) {
                                if (ajVar.ah != null) {
                                    j.a("TTVideoEngine", "player will pause by interruption");
                                    ajVar.ah.g();
                                    ajVar.v = 2;
                                    break;
                                }
                            } else {
                                ajVar.s = true;
                                break;
                            }
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                ajVar.a((FileDescriptor) obj);
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                ajVar.z();
                                ajVar.bc = (IMediaDataSource) obj;
                                if (ajVar.ae != null) {
                                    ajVar.ae.b(7, (String) null);
                                    break;
                                }
                            }
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                ajVar.e((String) obj);
                                break;
                            }
                        case 15:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                com.ss.ttvideoengine.m.a aVar = (com.ss.ttvideoengine.m.a) obj;
                                int i4 = aVar.f153092e;
                                if (i4 == 0) {
                                    ajVar.al = w.Standard;
                                } else if (i4 == 1) {
                                    ajVar.al = w.High;
                                } else if (i4 == 2) {
                                    ajVar.al = w.SuperHigh;
                                } else if (i4 == 3) {
                                    ajVar.al = w.ExtremelyHigh;
                                } else if (i4 != 4) {
                                    ajVar.d(aVar.f153088a);
                                    break;
                                } else {
                                    ajVar.al = w.FourK;
                                }
                                ajVar.z();
                                if (ajVar.aL != null && !ajVar.aL.equals(aVar)) {
                                    ajVar.F();
                                    ajVar.aG = false;
                                    ajVar.aS = true;
                                    ajVar.aU = true;
                                    ajVar.aT = true;
                                    ajVar.A = 0;
                                    ajVar.ar = false;
                                    ajVar.az = 0;
                                    ajVar.ag = null;
                                    ajVar.aq = null;
                                }
                                ajVar.t = false;
                                ajVar.aK = true;
                                ajVar.aL = aVar;
                                ajVar.ba = 0;
                                ajVar.ao.clear();
                                ajVar.B = aVar.f153088a;
                                ajVar.ae.b(3, ajVar.B);
                                ajVar.aC = null;
                                ajVar.aD = null;
                                j.a("TTVideoEngine", "set preloaderitem");
                                break;
                            }
                        case 16:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetVideoModel invalid param");
                                break;
                            } else {
                                ajVar.b((e) obj);
                                break;
                            }
                        case 17:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetPlayItem invalid param");
                                break;
                            } else {
                                ar arVar = (ar) obj;
                                if (System.currentTimeMillis() / 1000 > arVar.f152282d) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!TextUtils.isEmpty(arVar.f152279a) && !z) {
                                    ajVar.z();
                                    if (!arVar.equals(ajVar.aN)) {
                                        if (ajVar.aN != null) {
                                            ajVar.F();
                                        }
                                        ajVar.aM = true;
                                        ajVar.aS = true;
                                        ajVar.aU = true;
                                        ajVar.aT = true;
                                        ajVar.A = 0;
                                        ajVar.ar = false;
                                        ajVar.az = 0;
                                        ajVar.aq = null;
                                    }
                                    ajVar.t = false;
                                    ajVar.aN = arVar;
                                    ajVar.ba = 0;
                                    if (arVar.f152281c != null) {
                                        ajVar.al = arVar.f152281c;
                                    }
                                    ajVar.B = arVar.f152280b;
                                    ajVar.ae.b(2, arVar.f152280b);
                                    ajVar.ao.clear();
                                    ajVar.aC = null;
                                    ajVar.aD = null;
                                    break;
                                } else {
                                    ajVar.d(arVar.f152280b);
                                    break;
                                }
                            }
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetLocalURL invalid param");
                                break;
                            } else {
                                ajVar.g((String) obj);
                                break;
                            }
                        case 19:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "_doSetDirectURL invalid param");
                                break;
                            } else {
                                String str7 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    String str8 = (String) map.get("paramObj1");
                                    ajVar.i(str7);
                                    ajVar.aC = str8;
                                    ajVar.aD = str8;
                                    break;
                                } else {
                                    ajVar.i(str7);
                                    break;
                                }
                            }
                            break;
                        case v.U:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                String[] strArr = (String[]) obj;
                                if (map != null) {
                                    if (map.containsKey("paramObj1")) {
                                        str2 = (String) map.get("paramObj1");
                                    } else {
                                        str2 = null;
                                    }
                                    if (map.containsKey("paramObj2")) {
                                        str5 = (String) map.get("paramObj2");
                                    }
                                    str = str5;
                                    str6 = str2;
                                } else {
                                    str = null;
                                }
                                ajVar.a(strArr, str6, str);
                                break;
                            }
                        case 21:
                            if (obj == null) {
                                j.c("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                if (map != null && map.containsKey("paramObj1")) {
                                    str4 = (String) map.get("paramObj1");
                                }
                                String[] strArr2 = {obj};
                                if (!TextUtils.isEmpty(strArr2[0])) {
                                    if (!TextUtils.isEmpty(str4) && ajVar.bf != 0) {
                                        ajVar.G();
                                        String a2 = i.a(ajVar.aa, str4);
                                        String a3 = ajVar.a(a2, ajVar.B, (long) ajVar.bi, strArr2, w.Undefine, ajVar.aE, null, str4, null);
                                        if (!ajVar.cl.contains(a2)) {
                                            ajVar.cl.add(a2);
                                        }
                                        if (!TextUtils.isEmpty(a3)) {
                                            ajVar.h(a3);
                                            break;
                                        } else {
                                            ajVar.h(strArr2[0]);
                                            break;
                                        }
                                    } else {
                                        ajVar.h(strArr2[0]);
                                        break;
                                    }
                                } else {
                                    j.e("TTVideoEngine", "invalid urls list, it is empty");
                                    break;
                                }
                            }
                            break;
                        case 22:
                            ajVar.J();
                            break;
                        case 23:
                            ajVar.K();
                            break;
                        case 24:
                            ajVar.T();
                            break;
                        default:
                            switch (i2) {
                                case 50:
                                    if (message.arg1 != 1) {
                                        z2 = false;
                                    }
                                    ajVar.b(z2, message.arg2);
                                    break;
                                case 51:
                                    if (obj == null) {
                                        j.c("TTVideoEngineLooperThread", "_setUnSupportSampleRates invalid param");
                                        break;
                                    } else {
                                        ajVar.b((int[]) obj);
                                        break;
                                    }
                                case 52:
                                    int i5 = message.arg1;
                                    if (ajVar.ah != null) {
                                        ajVar.ah.a(79, i5);
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (obj == null) {
                                        j.c("TTVideoEngineLooperThread", "_doSetPlaybackParams invalid param");
                                        break;
                                    } else {
                                        ajVar.b((com.ss.ttm.player.p) obj);
                                        break;
                                    }
                                case 54:
                                    ajVar.c((Surface) obj);
                                    break;
                                case 55:
                                    ajVar.b((SurfaceHolder) obj);
                                    break;
                                case 56:
                                    ajVar.b((Surface) obj, message.arg1);
                                    break;
                                case 57:
                                    String str9 = (String) obj;
                                    if (map != null && map.containsKey("paramObj1")) {
                                        str3 = (String) map.get("paramObj1");
                                    }
                                    ajVar.c(str9, str3);
                                    break;
                                default:
                                    switch (i2) {
                                        case 101:
                                            ajVar.h(message.arg1, message.arg2);
                                            break;
                                        case 102:
                                            if (obj == null) {
                                                j.c("TTVideoEngineLooperThread", "_doSetLongOption invalid param for key:" + message.arg1);
                                                break;
                                            } else {
                                                ajVar.d(message.arg1, ((Long) obj).longValue());
                                                break;
                                            }
                                        case 103:
                                            int l2 = ajVar.l(message.arg1);
                                            aq.this.f152266d.setDataPosition(0);
                                            aq.this.f152266d.writeInt(l2);
                                            break;
                                        case 104:
                                            long m2 = ajVar.m(message.arg1);
                                            aq.this.f152266d.setDataPosition(0);
                                            aq.this.f152266d.writeLong(m2);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 106:
                                                    float n = ajVar.n(message.arg1);
                                                    aq.this.f152266d.setDataPosition(0);
                                                    aq.this.f152266d.writeFloat(n);
                                                    break;
                                                case 107:
                                                    String o = ajVar.o(message.arg1);
                                                    aq.this.f152266d.setDataPosition(0);
                                                    aq.this.f152266d.writeString(o);
                                                    break;
                                                case 108:
                                                    if (obj == null) {
                                                        j.c("TTVideoEngineLooperThread", "_doSetStrungOption invalid param for key:" + message.arg1);
                                                        break;
                                                    } else {
                                                        ajVar.e(message.arg1, (String) obj);
                                                        break;
                                                    }
                                                default:
                                                    switch (i2) {
                                                        case 150:
                                                            boolean p = ajVar.p();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeInt(p ? 1 : 0);
                                                            break;
                                                        case 151:
                                                            int P = ajVar.P();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeInt(P);
                                                            break;
                                                        case 152:
                                                            int u = ajVar.u();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeInt(u);
                                                            break;
                                                        case 153:
                                                            int v = ajVar.v();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeInt(v);
                                                            break;
                                                        case 154:
                                                            JSONObject Q = ajVar.Q();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeValue(Q);
                                                            break;
                                                        case 155:
                                                            boolean g2 = ajVar.g();
                                                            aq.this.f152266d.setDataPosition(0);
                                                            aq.this.f152266d.writeInt(g2 ? 1 : 0);
                                                            break;
                                                        case 156:
                                                            aq.this.f152266d.writeInt(ajVar.R() ? 1 : 0);
                                                            break;
                                                        case 157:
                                                            aq.this.f152266d.writeInt(ajVar.S() ? 1 : 0);
                                                            break;
                                                        default:
                                                            j.c("TTVideoEngineLooperThread", "unknown message: " + message.what);
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (obj != null) {
                    ajVar.e((e) obj);
                } else {
                    j.c("TTVideoEngineLooperThread", "_doParseDNSComplete no model");
                }
            } else if (obj != null) {
                ajVar.l((String) obj);
            } else {
                j.c("TTVideoEngineLooperThread", "_doParseDNSComplete invalid param");
            }
            aq.a(aq.this.f152265c, condition);
        }

        public a(aj ajVar, Looper looper) {
            super(looper);
            this.f152274b = new WeakReference<>(ajVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        if (this.f152267e != null) {
            HashMap hashMap = new HashMap();
            Condition newCondition = this.f152268f.newCondition();
            Message obtainMessage = this.f152267e.obtainMessage(411, 0, 0);
            hashMap.put("paramObj", obj);
            hashMap.put("msgCond", newCondition);
            try {
                this.f152268f.lock();
                this.f152272j = true;
                obtainMessage.obj = hashMap;
                obtainMessage.sendToTarget();
                newCondition.await();
                this.f152272j = false;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.f152268f.unlock();
                throw th;
            }
            this.f152268f.unlock();
        }
    }

    static void a(Lock lock, Condition condition) {
        if (condition != null) {
            lock.lock();
            condition.signal();
            lock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        a(i2, i3, 0, null);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        a(i2, i3, i4, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r7.f152271i.A == 5) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (r7.f152271i.A == 5) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r7.f152270h.remove(r2);
        r7.f152265c.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r1 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(int r8, long r9, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.aq.b(int, long, java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3, int i4, Object obj) {
        b(i2, i3, i4, obj, null);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, Object obj) {
        a(i2, i3, i4, obj, null);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3, int i4, Object obj, Object obj2) {
        if (this.f152267e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            Message obtainMessage = this.f152267e.obtainMessage(i2, i3, i4);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, Object obj, Object obj2) {
        a(i2, i3, i4, obj, obj2, null);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, Object obj, Object obj2, Object obj3) {
        Handler handler;
        if (this.f152271i.A != 5 && (handler = this.f152264b) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            if (obj3 != null) {
                hashMap.put("paramObj2", obj3);
            }
            Message obtainMessage = handler.obtainMessage(i2, i3, i4);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }
}
