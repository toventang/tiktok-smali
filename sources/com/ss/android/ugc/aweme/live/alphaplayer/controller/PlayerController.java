package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.live.alphaplayer.a.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;
import com.ss.android.ugc.aweme.live.alphaplayer.d.c;
import com.ss.android.ugc.aweme.live.alphaplayer.d.d;
import com.ss.android.ugc.aweme.live.alphaplayer.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PlayerController implements Handler.Callback, au, a {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f108198a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public d f108199b = d.NOT_PREPARED;

    /* renamed from: c  reason: collision with root package name */
    public a f108200c;

    /* renamed from: d  reason: collision with root package name */
    public e f108201d;

    /* renamed from: e  reason: collision with root package name */
    public int f108202e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f108203f = 0;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f108204g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f108205h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f108206i;

    /* renamed from: j  reason: collision with root package name */
    private long f108207j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f108208k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f108209l;

    /* renamed from: m  reason: collision with root package name */
    private Context f108210m;
    private com.ss.android.ugc.aweme.live.alphaplayer.a.b n;
    private c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> o;
    private Handler p;
    private Handler q = new Handler(Looper.getMainLooper());
    private HandlerThread r;
    private int s = 0;
    private int t = 0;
    private final com.ss.android.ugc.aweme.live.alphaplayer.f.c u;
    private m v;
    private com.ss.android.ugc.aweme.live.alphaplayer.a.c w;
    private c.d<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> x;
    private c.b<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> y;

    static {
        Covode.recordClassIndex(69345);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        d();
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        e();
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
        f();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar) {
        this.f108207j = aVar.f108158d;
        if (aVar.f108155a) {
            a(0);
            a(a(1, aVar));
            return;
        }
        i();
        a(false, "dataSource is invalid. ErrorInfo: " + aVar.f108157c);
    }

    public final void a(boolean z, String str) {
        a(z, 0, 0, str);
    }

    public final void a(boolean z, int i2, int i3, String str) {
        com.ss.android.ugc.aweme.live.alphaplayer.a.b bVar = this.n;
        if (bVar != null) {
            c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.o;
            bVar.a(z, cVar != null ? cVar.j() : "unknown", i2, i3, str + ", messageId: " + this.f108207j);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final int c() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.o;
        if (cVar == null) {
            return -1;
        }
        try {
            return cVar.h().f108197c;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void d() {
        a(a(3, (Object) null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void e() {
        a(a(4, (Object) null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void f() {
        a(a(5, (Object) null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void h() {
        a(a(9, (Object) null));
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a(a(6, (Object) null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final boolean b() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.o;
        if (cVar == null || !cVar.k()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void g() {
        a(a(6, (Object) null));
        m mVar = this.v;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
            this.v = null;
        }
    }

    public final void i() {
        this.f108208k = false;
        this.f108207j = 0;
        this.q.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69346);
            }

            public final void run() {
                if (PlayerController.this.f108200c != null) {
                    PlayerController.this.f108200c.b();
                }
            }
        });
        this.u.b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController$8  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f108219a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 69353(0x10ee9, float:9.7184E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass8.f108219a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass8.f108219a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass8.f108219a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass8.f108219a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass8.<clinit>():void");
        }
    }

    private void k() {
        if (this.o != null) {
            if (this.f108199b == d.NOT_PREPARED || this.f108199b == d.STOPPED) {
                this.o.a(this.x);
                this.o.a(this.y);
                this.o.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final View a() {
        e eVar = this.f108201d;
        if (eVar != null) {
            return eVar.getView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final int j() {
        if (this.o == null || this.t == 0) {
            return -1;
        }
        float c2 = (float) c();
        if (c2 <= 0.0f) {
            return -1;
        }
        float i2 = ((float) this.o.i()) / c2;
        if (i2 > 1.0f) {
            return -1;
        }
        return (int) Math.ceil((double) (i2 * ((float) this.t)));
    }

    private void l() {
        if (this.o != null) {
            int i2 = AnonymousClass8.f108219a[this.f108199b.ordinal()];
            if (i2 == 1) {
                this.o.c();
                this.f108208k = true;
                this.f108199b = d.STARTED;
                this.q.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(69352);
                    }

                    public final void run() {
                        if (PlayerController.this.f108200c != null) {
                            PlayerController.this.f108200c.a();
                        }
                    }
                });
                this.u.a();
            } else if (i2 == 2) {
                this.o.c();
                this.f108199b = d.STARTED;
                this.u.a();
            } else if (i2 == 3 || i2 == 4) {
                try {
                    k();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    a(false, "prepare and start MediaPlayer failure.");
                    i();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final a a(a aVar) {
        this.f108200c = aVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.a.b bVar) {
        this.n = bVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void b(ViewGroup viewGroup) {
        e eVar = this.f108201d;
        if (eVar != null && eVar.b(viewGroup)) {
            this.f108204g = false;
        }
    }

    public final void a(int i2) {
        this.f108201d.setVisibility(i2);
        if (i2 == 0) {
            this.f108201d.bringToFront();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        HandlerThread handlerThread = this.r;
        if (handlerThread != null && handlerThread.isAlive() && !this.r.isInterrupted()) {
            if (this.p == null) {
                this.p = new Handler(this.r.getLooper(), this);
            }
            this.p.sendMessageDelayed(message, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(Surface surface) {
        a(a(7, surface));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(ViewGroup viewGroup) {
        e eVar = this.f108201d;
        if (eVar != null && eVar.a(viewGroup)) {
            this.f108204g = true;
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case 1:
                if (message.obj instanceof com.ss.android.ugc.aweme.live.alphaplayer.c.a) {
                    Handler handler = this.p;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = (com.ss.android.ugc.aweme.live.alphaplayer.c.a) message.obj;
                    try {
                        if (this.f108204g) {
                            this.o.f();
                            this.f108199b = d.NOT_PREPARED;
                            int i2 = this.f108210m.getResources().getConfiguration().orientation;
                            a.b a2 = aVar.a(i2);
                            if (a2 != null && !TextUtils.isEmpty(a2.f108166a)) {
                                if (new File(a2.f108166a).exists()) {
                                    this.f108201d.setConfigParams(a2);
                                    this.f108201d.a(this.f108198a);
                                    this.o.a(a2.f108166a);
                                    boolean z = aVar.f108156b;
                                    this.f108206i = z;
                                    this.o.a(z);
                                    this.t = a2.f108168c;
                                    this.f108202e = a2.f108173h;
                                    this.f108203f = a2.f108174i;
                                    this.s = a2.f108175j;
                                    this.f108205h = aVar.f108159e;
                                    if (!this.f108201d.c()) {
                                        this.f108209l = true;
                                        break;
                                    } else {
                                        k();
                                        break;
                                    }
                                }
                            }
                            if (1 == i2) {
                                StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
                                if (a2 == null) {
                                    str2 = "null";
                                } else {
                                    str2 = a2.f108166a;
                                }
                                a(false, sb.append(str2).toString());
                            }
                            i();
                            break;
                        } else {
                            a(false, "alphaVideoView is not attach");
                            i();
                            break;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        i();
                        a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e2));
                        break;
                    }
                }
                break;
            case 2:
                try {
                    if (this.s <= 0) {
                        com.ss.android.ugc.aweme.live.alphaplayer.c.d h2 = this.o.h();
                        this.f108202e = h2.f108195a / 2;
                        this.f108203f = h2.f108196b;
                    }
                    this.f108201d.a((float) this.f108202e, (float) this.f108203f);
                    final a.d scaleType = this.f108201d.getScaleType();
                    this.q.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(69349);
                        }

                        public final void run() {
                            if (PlayerController.this.f108200c != null) {
                                PlayerController.this.f108200c.a(PlayerController.this.f108202e, PlayerController.this.f108203f, scaleType);
                            }
                        }
                    });
                    this.f108199b = d.PREPARED;
                    com.ss.android.ugc.aweme.live.alphaplayer.a.c cVar = this.w;
                    if (cVar == null || !cVar.a()) {
                        l();
                        break;
                    }
                } catch (Exception e3) {
                    i();
                    a(false, "start video failure:" + Log.getStackTraceString(e3));
                    break;
                }
            case 3:
                if (this.o != null && this.f108199b == d.STARTED) {
                    this.o.d();
                    this.u.b();
                    this.f108199b = d.PAUSED;
                    break;
                }
            case 4:
                if (!this.f108208k) {
                    if (this.f108209l) {
                        this.f108209l = false;
                        k();
                        break;
                    }
                } else {
                    l();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (this.o != null && (this.f108199b == d.STARTED || this.f108199b == d.PAUSED)) {
                    this.o.d();
                    this.u.b();
                    this.f108199b = d.PAUSED;
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.f108201d.onPause();
                this.u.b();
                this.u.c();
                if (this.o != null) {
                    if (this.f108199b == d.STARTED) {
                        this.o.d();
                        this.f108199b = d.PAUSED;
                    }
                    if (this.f108199b == d.PAUSED) {
                        this.o.e();
                        this.f108199b = d.STOPPED;
                    }
                    this.o.g();
                    this.f108201d.d();
                    this.f108199b = d.RELEASE;
                    HandlerThread handlerThread = this.r;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        this.r.interrupt();
                        break;
                    }
                } else {
                    this.f108199b = d.NOT_PREPARED;
                    return true;
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                try {
                    this.o.a((Surface) message.obj);
                    break;
                } catch (Exception unused) {
                    i();
                    a(false, "surface has been released");
                    break;
                }
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar2 = this.o;
                if (cVar2 != null) {
                    cVar2.f();
                    this.u.b();
                    this.f108199b = d.NOT_PREPARED;
                    this.f108208k = false;
                    break;
                }
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                try {
                    this.o.a();
                } catch (Exception e4) {
                    com.ss.android.ugc.aweme.live.alphaplayer.a.b bVar = this.n;
                    if (bVar != null) {
                        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar3 = this.o;
                        if (cVar3 != null) {
                            str = cVar3.j();
                        } else {
                            str = "unknown";
                        }
                        bVar.a(str, e4);
                    }
                    com.ss.android.ugc.aweme.live.alphaplayer.d.b bVar2 = new com.ss.android.ugc.aweme.live.alphaplayer.d.b();
                    bVar2.a();
                    this.o = bVar2;
                }
                this.o.b(true);
                this.o.a(this.f108206i);
                this.o.a(new c.AbstractC2776c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>>() {
                    /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(69347);
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c.AbstractC2776c
                    public final /* bridge */ /* synthetic */ void a() {
                        PlayerController.this.f108201d.a();
                    }
                });
                this.o.a(new c.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>>() {
                    /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(69348);
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c.a
                    public final /* synthetic */ void a() {
                        if (!PlayerController.this.f108204g || !PlayerController.this.f108206i) {
                            if (PlayerController.this.f108205h) {
                                PlayerController.this.f108201d.b();
                                PlayerController.this.f108198a.clear();
                            }
                            PlayerController.this.f108199b = d.PAUSED;
                            PlayerController.this.a(true, (String) null);
                            PlayerController.this.i();
                        }
                    }
                });
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (message.obj instanceof b) {
                    b bVar3 = (b) message.obj;
                    if (bVar3.f108183b == 0) {
                        try {
                            bVar3.f108190i = com.ss.android.ugc.aweme.live.alphaplayer.f.a.a(bVar3);
                        } catch (OutOfMemoryError unused2) {
                        }
                    }
                    if (bVar3.f108190i != null) {
                        bVar3.f108184c = bVar3.f108190i.getWidth();
                        bVar3.f108185d = bVar3.f108190i.getHeight();
                        this.f108198a.add(bVar3);
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar4 = this.o;
                if (cVar4 != null) {
                    cVar4.e();
                    this.f108199b = d.STOPPED;
                    this.f108208k = false;
                    e eVar = this.f108201d;
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.a.d dVar) {
        this.u.a(dVar);
    }

    public static Message a(int i2, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.obj = obj;
        return obtain;
    }

    public static PlayerController a(com.ss.android.ugc.aweme.live.alphaplayer.c cVar, c cVar2) {
        return new PlayerController(cVar.f108152a, cVar.f108153b, cVar2, cVar.f108154c);
    }

    private PlayerController(Context context, m mVar, c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar, int i2) {
        com.ss.android.ugc.aweme.live.alphaplayer.f.c cVar2 = new com.ss.android.ugc.aweme.live.alphaplayer.f.c();
        this.u = cVar2;
        this.v = null;
        this.x = new c.d<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>>() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass5 */

            static {
                Covode.recordClassIndex(69350);
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c.d
            public final /* bridge */ /* synthetic */ void a() {
                PlayerController.this.a(PlayerController.a(2, (Object) null));
            }
        };
        this.y = new c.b<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>>() {
            /* class com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.AnonymousClass6 */

            static {
                Covode.recordClassIndex(69351);
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c.b
            public final /* synthetic */ void a(int i2, int i3, String str) {
                PlayerController.this.a(false, i2, i3, "mediaPlayer error, info:".concat(String.valueOf(str)));
                PlayerController.this.i();
            }
        };
        this.f108210m = context;
        this.v = mVar;
        if (mVar != null) {
            mVar.getLifecycle().a(this);
        }
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.r = handlerThread;
        handlerThread.start();
        this.p = new Handler(this.r.getLooper(), this);
        if (i2 == 1) {
            this.f108201d = new com.ss.android.ugc.aweme.live.alphaplayer.b(this.f108210m);
        } else {
            this.f108201d = new com.ss.android.ugc.aweme.live.alphaplayer.a(this.f108210m);
        }
        this.f108201d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f108201d.setPlayerController(this);
        this.f108201d.setVideoRenderer(new com.ss.android.ugc.aweme.live.alphaplayer.e.b(this.f108201d));
        if (cVar == null) {
            this.o = new com.ss.android.ugc.aweme.live.alphaplayer.d.b();
        } else {
            this.o = cVar;
        }
        cVar2.f108319a = this.o;
        a(a(10, (Object) null));
    }
}
