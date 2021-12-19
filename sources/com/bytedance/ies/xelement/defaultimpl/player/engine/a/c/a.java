package com.bytedance.ies.xelement.defaultimpl.player.engine.a.c;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public final class a extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final String f36917d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public static final C0905a f36918e = new C0905a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f36919b;

    /* renamed from: c  reason: collision with root package name */
    public long f36920c;

    /* renamed from: f  reason: collision with root package name */
    private final h f36921f;

    /* renamed from: g  reason: collision with root package name */
    private final h f36922g;

    /* renamed from: h  reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f36923h;

    private final AudioManager h() {
        return (AudioManager) this.f36922g.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final n b(n nVar) {
        return nVar;
    }

    public final d.AnonymousClass1 c() {
        return (d.AnonymousClass1) this.f36921f.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean f() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a$a  reason: collision with other inner class name */
    public static final class C0905a {
        static {
            Covode.recordClassIndex(22157);
        }

        private C0905a() {
        }

        public /* synthetic */ C0905a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f36925a;

                static {
                    Covode.recordClassIndex(22161);
                }

                public final void handleMessage(Message message) {
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
                    super.handleMessage(message);
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36925a.this$0.f36963a;
                    if (bVar != null && (cVar = bVar.f36968e) != null && message != null && message.what == 1 && cVar.b().isPlayingState()) {
                        g.f36700a.a(a.f36917d, "AUDIOFOCUS_LOSS, and pause the play");
                        cVar.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_LOSS_FOCUS"));
                    }
                }

                {
                    this.f36925a = r1;
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<AudioManager> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AudioManager invoke() {
            Object a2 = a(this.this$0.f36919b, DataType.AUDIO);
            if (a2 != null) {
                return a2;
            }
            throw new w("null cannot be cast to non-null type");
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6525);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(6525);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(22156);
    }

    private final void i() {
        try {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f36923h;
            if (onAudioFocusChangeListener != null) {
                h().abandonAudioFocus(onAudioFocusChangeListener);
            }
        } catch (Throwable th) {
            g.f36700a.c(f36917d, th.getMessage());
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g gVar;
        super.a();
        i();
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
        if (!(bVar == null || (gVar = bVar.f36967d) == null)) {
            gVar.b(this);
        }
        this.f36923h = null;
    }

    public final boolean g() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f36923h;
        if (onAudioFocusChangeListener == null || h().requestAudioFocus(onAudioFocusChangeListener, 3, 1) != 1) {
            return false;
        }
        return true;
    }

    public static final class b implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f36924a;

        static {
            Covode.recordClassIndex(22158);
        }

        public b(WeakReference<a> weakReference) {
            l.c(weakReference, "");
            this.f36924a = weakReference;
        }

        public final void onAudioFocusChange(int i2) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
            String str;
            a aVar = this.f36924a.get();
            if (aVar != null) {
                l.a((Object) aVar, "");
                boolean z = true;
                if (i2 == -2 || i2 == -1) {
                    if (System.currentTimeMillis() > aVar.f36920c) {
                        aVar.c().sendEmptyMessageDelayed(1, 1000);
                    } else {
                        aVar.g();
                    }
                } else if (i2 == 1) {
                    g.f36700a.a(a.f36917d, "AUDIOFOCUS_GAIN, and resume the play");
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = aVar.f36963a;
                    if (bVar != null && (cVar = bVar.f36968e) != null) {
                        if (cVar.b() != o.PLAYBACK_STATE_PAUSED) {
                            z = false;
                        }
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c g2 = cVar.g();
                        if (g2 != null) {
                            str = g2.f36975a;
                        } else {
                            str = null;
                        }
                        boolean a2 = l.a((Object) str, (Object) "PAUSE_FROM_LOSS_FOCUS");
                        if (z && a2) {
                            cVar.e(null);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        String str;
        if (cVar != null) {
            str = cVar.f36975a;
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "PAUSE_FROM_LOSS_FOCUS")) {
            g.f36700a.a(f36917d, "Pause reason is loss focus, we needn't release audio focus for help us can retrieve focus again.");
            return false;
        }
        i();
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (g()) {
            return false;
        }
        g.f36700a.a(f36917d, "Request audio focus failed, we intercept this resume operation.");
        return true;
    }

    public a(Context context) {
        l.c(context, "");
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.a((Object) applicationContext, "");
        this.f36919b = applicationContext;
        this.f36921f = h.i.a((h.f.a.a) new d(this));
        this.f36922g = h.i.a((h.f.a.a) new c(this));
        this.f36923h = new b(new WeakReference(this));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
        l.c(bVar, "");
        super.a(bVar);
        i();
        g.f36700a.c(f36917d, "abandon focus because of onError: ".concat(String.valueOf(bVar)));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (c().hasMessages(1)) {
            c().removeMessages(1);
            g.f36700a.a(f36917d, "Found pending execute pause task when stop invoked, remove this task immediate.");
        }
        this.f36920c = System.currentTimeMillis() + 1000;
        i();
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(o oVar) {
        l.c(oVar, "");
        super.a(oVar);
        if (oVar == o.PLAYBACK_STATE_ERROR || oVar == o.PLAYBACK_STATE_STOPPED) {
            i();
            g.f36700a.a(f36917d, "abandon focus because of: ".concat(String.valueOf(oVar)));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g gVar;
        l.c(bVar, "");
        super.a(bVar);
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 != null && (gVar = bVar2.f36967d) != null) {
            gVar.a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (g()) {
            return false;
        }
        g.f36700a.b(f36917d, "Request audio focus failed, we intercept this play operation.");
        return true;
    }
}
