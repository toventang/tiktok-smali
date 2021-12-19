package com.ss.android.ugc.aweme.dsp.playerservice.d.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Objects;

public final class a implements h, j, m {

    /* renamed from: d  reason: collision with root package name */
    public static final String f83472d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public static final C1969a f83473e = new C1969a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f83474a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f83475b;

    /* renamed from: c  reason: collision with root package name */
    public long f83476c;

    /* renamed from: f  reason: collision with root package name */
    private final AudioManager f83477f;

    /* renamed from: g  reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f83478g = new b(this, new WeakReference(this));

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final c a_(c cVar) {
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.b.a$a  reason: collision with other inner class name */
    public static final class C1969a {
        static {
            Covode.recordClassIndex(52093);
        }

        private C1969a() {
        }

        public /* synthetic */ C1969a(byte b2) {
            this();
        }
    }

    public final boolean e() {
        if (this.f83477f.requestAudioFocus(this.f83478g, 3, 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83474a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(52092);
    }

    private final void f() {
        try {
            this.f83477f.abandonAudioFocus(this.f83478g);
        } catch (Throwable th) {
            String.valueOf("abandonFocus(): -> " + th.getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((j) this);
        v().a((h) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        f();
        v().b((j) this);
        v().b((h) this);
    }

    public a() {
        Object a2 = a(com.bytedance.ies.ugc.appcontext.d.a(), DataType.AUDIO);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.media.AudioManager");
        this.f83477f = (AudioManager) a2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(f fVar) {
        f();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(f fVar) {
        if (e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83474a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(f fVar) {
        String str;
        if (fVar != null) {
            str = fVar.f83375a;
        } else {
            str = null;
        }
        if (!(!l.a((Object) str, (Object) "PAUSE_FROM_LOSS_FOCUS"))) {
            return false;
        }
        f();
        return false;
    }

    public final class b implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83485a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<a> f83486b;

        static {
            Covode.recordClassIndex(52094);
        }

        public final void onAudioFocusChange(int i2) {
            a aVar = this.f83486b.get();
            if (aVar != null) {
                l.b(aVar, "");
                d v = aVar.v();
                if (i2 == -2 || i2 == -1) {
                    if (System.currentTimeMillis() - this.f83485a.f83476c >= 1000) {
                        boolean startPlaying = v.e().startPlaying();
                        if (startPlaying) {
                            v.f(new f("PAUSE_FROM_LOSS_FOCUS"));
                            this.f83485a.f83475b = true;
                        }
                        String.valueOf("onAudioFocusChange(): -> AudioManager.AUDIOFOCUS_LOSSstartPlaying " + startPlaying + ' ' + "mAudioFocusLossBarrier:  " + this.f83485a.f83476c + "hashCode" + hashCode());
                        return;
                    }
                    this.f83485a.e();
                } else if (i2 != 1) {
                    String.valueOf("onAudioFocusChange(): -> ".concat(String.valueOf(i2)));
                } else if (v.e().isPauseState() && this.f83485a.f83475b) {
                    v.g(new f("RESUME_FROM_GAIN_FOCUS"));
                    this.f83485a.f83475b = false;
                }
            }
        }

        public b(a aVar, WeakReference<a> weakReference) {
            l.d(weakReference, "");
            this.f83485a = aVar;
            this.f83486b = weakReference;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        f();
        String.valueOf("abandon focus because of onError : ".concat(String.valueOf(aVar)));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
        if (fVar == com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_ERROR || fVar == com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED) {
            f();
            String.valueOf("abandon focus because of: ".concat(String.valueOf(fVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(f fVar) {
        if (e()) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1463);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1463);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
