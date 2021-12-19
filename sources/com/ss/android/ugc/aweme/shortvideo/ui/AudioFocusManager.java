package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.h;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class AudioFocusManager implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f131097b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final androidx.appcompat.app.d f131098a;

    /* renamed from: c  reason: collision with root package name */
    private final h f131099c;

    /* renamed from: d  reason: collision with root package name */
    private final bg f131100d;

    static {
        Covode.recordClassIndex(85909);
    }

    public final AudioManager a() {
        return (AudioManager) this.f131099c.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_START) {
            onStart();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85910);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AudioFocusManager a(androidx.appcompat.app.d dVar) {
            l.d(dVar, "");
            return new AudioFocusManager(dVar, (byte) 0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AudioFocusManager this$0;

        static {
            Covode.recordClassIndex(85912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            try {
                this.this$0.a().requestAudioFocus(null, 3, 1);
            } catch (Throwable unused) {
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AudioFocusManager this$0;

        static {
            Covode.recordClassIndex(85913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            try {
                this.this$0.a().abandonAudioFocus(null);
            } catch (Throwable unused) {
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<AudioManager> {
        final /* synthetic */ AudioFocusManager this$0;

        static {
            Covode.recordClassIndex(85911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AudioManager invoke() {
            Context applicationContext = this.this$0.f131098a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            Object a2 = a(applicationContext, DataType.AUDIO);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.media.AudioManager");
            return a2;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(2597);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(2597);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        h.f.a.a<z> aVar;
        bg bgVar = this.f131100d;
        int i2 = bg.f131485c + 1;
        bg.f131485c = i2;
        if (i2 == 1 && (aVar = bgVar.f131487a) != null) {
            aVar.invoke();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        h.f.a.a<z> aVar;
        bg bgVar = this.f131100d;
        int i2 = bg.f131485c - 1;
        bg.f131485c = i2;
        if (i2 == 0 && (aVar = bgVar.f131488b) != null) {
            aVar.invoke();
        }
    }

    private AudioFocusManager(androidx.appcompat.app.d dVar) {
        this.f131098a = dVar;
        dVar.getLifecycle().a(this);
        this.f131099c = h.i.a((h.f.a.a) new b(this));
        this.f131100d = new bg(new c(this), new d(this));
    }

    public /* synthetic */ AudioFocusManager(androidx.appcompat.app.d dVar, byte b2) {
        this(dVar);
    }
}
