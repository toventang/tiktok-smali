package com.ss.android.ugc.aweme.feed.background;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.MediaSessionReceiver;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.v;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.m;
import h.f.b.z;
import h.q;
import h.r;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlinx.coroutines.am;

public final class BackgroundAudioBrowserService extends MediaSessionService {

    /* renamed from: m  reason: collision with root package name */
    public static final b f92649m = new b((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.e.a f92650g;

    /* renamed from: h  reason: collision with root package name */
    final com.ss.android.ugc.aweme.feed.e.c f92651h;

    /* renamed from: i  reason: collision with root package name */
    final com.ss.android.ugc.aweme.feed.e.b f92652i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b f92653j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a f92654k;

    /* renamed from: l  reason: collision with root package name */
    public final f.a.b.a f92655l;
    private final int n = 2131232369;
    private AudioManager o;
    private AudioFocusRequest p;
    private AudioManager.OnAudioFocusChangeListener q;
    private final a r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private final h.h w;

    static {
        Covode.recordClassIndex(58755);
    }

    public final ComponentName b() {
        return (ComponentName) this.v.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService
    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(58757);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.this$0 = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f92661a;

                static {
                    Covode.recordClassIndex(58762);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92661a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2;
                    if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
                        h.f.b.l.b(intent2, "");
                        BackgroundAudioBrowserService.b(this.f92661a.this$0).a(intent2);
                        BackgroundAudioBrowserService.a(this.f92661a.this$0).a(intent2);
                    }
                }
            };
        }
    }

    static final class e extends m implements h.f.a.a<ComponentName> {
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.this$0 = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ComponentName invoke() {
            return new ComponentName(this.this$0, MediaSessionReceiver.class);
        }
    }

    static final class g extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.this$0 = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.this$0;
            Intent intent = new Intent();
            intent.setComponent(this.this$0.b());
            intent.putExtra("command_from_notification", 2);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 2, intent, 134217728);
        }
    }

    static final class h extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.this$0 = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.this$0;
            Intent intent = new Intent();
            intent.setComponent(this.this$0.b());
            intent.putExtra("command_from_notification", 1);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 1, intent, 134217728);
        }
    }

    static final class i extends m implements h.f.a.a<PendingIntent> {
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            super(0);
            this.this$0 = backgroundAudioBrowserService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PendingIntent invoke() {
            BackgroundAudioBrowserService backgroundAudioBrowserService = this.this$0;
            Intent intent = new Intent();
            intent.setComponent(this.this$0.b());
            intent.putExtra("command_from_notification", 3);
            return PendingIntent.getBroadcast(backgroundAudioBrowserService, 3, intent, 134217728);
        }
    }

    public BackgroundAudioBrowserService() {
        com.ss.android.ugc.aweme.feed.e.a aVar = new com.ss.android.ugc.aweme.feed.e.a();
        this.f92650g = aVar;
        this.f92651h = new com.ss.android.ugc.aweme.feed.e.c();
        this.f92652i = new com.ss.android.ugc.aweme.feed.e.b();
        this.r = new a(aVar);
        this.f92655l = new f.a.b.a();
        this.s = h.i.a((h.f.a.a) new h(this));
        this.t = h.i.a((h.f.a.a) new g(this));
        this.u = h.i.a((h.f.a.a) new i(this));
        this.v = h.i.a((h.f.a.a) new e(this));
        this.w = h.i.a((h.f.a.a) new f(this));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f92654k;
        if (aVar == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        aVar.a(false);
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar = this.f92653j;
        if (bVar == null) {
            h.f.b.l.a("xNotificationController");
        }
        bVar.a(false);
        stopForeground(true);
        this.f92655l.a();
        unregisterReceiver(this.r);
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar2 = this.f92653j;
        if (bVar2 == null) {
            h.f.b.l.a("xNotificationController");
        }
        bVar2.a();
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar2 = this.f92654k;
        if (aVar2 == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        aVar2.a();
        c.f92667a = false;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = this.o;
            if (audioManager == null) {
                h.f.b.l.a("audioManager");
            }
            AudioFocusRequest audioFocusRequest = this.p;
            if (audioFocusRequest == null) {
                h.f.b.l.a("audioFocusRequest");
            }
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            return;
        }
        AudioManager audioManager2 = this.o;
        if (audioManager2 == null) {
            h.f.b.l.a("audioManager");
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.q;
        if (onAudioFocusChangeListener == null) {
            h.f.b.l.a("afChangeListener");
        }
        audioManager2.abandonAudioFocus(onAudioFocusChangeListener);
    }

    public final void a() {
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f92654k;
        if (aVar == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        aVar.a(true);
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar = this.f92653j;
        if (bVar == null) {
            h.f.b.l.a("xNotificationController");
        }
        bVar.a(true);
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar2 = this.f92654k;
        if (aVar2 == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        aVar2.d();
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar3 = this.f92654k;
        if (aVar3 == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        aVar3.b();
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar2 = this.f92653j;
        if (bVar2 == null) {
            h.f.b.l.a("xNotificationController");
        }
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar4 = this.f92654k;
        if (aVar4 == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        bVar2.a(aVar4.f37064b.b());
    }

    @Override // androidx.media.e
    public final void onCreate() {
        int requestAudioFocus;
        super.onCreate();
        Context baseContext = getBaseContext();
        h.f.b.l.b(baseContext, "");
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a(baseContext, this.f92650g, this.f92651h, this.f92652i, b());
        this.f92653j = new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b(this, aVar.c(), aVar.f37065c, b(), new d(), this.n);
        this.f92654k = aVar;
        a(aVar.c());
        LocalBroadcastManager.getInstance(this).registerReceiver((f.AnonymousClass1) this.w.getValue(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
        b(this, this.r, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        Context applicationContext = getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        Object a2 = a(applicationContext, DataType.AUDIO);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.media.AudioManager");
        this.o = (AudioManager) a2;
        this.q = new j(this);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.q;
            if (onAudioFocusChangeListener == null) {
                h.f.b.l.a("afChangeListener");
            }
            builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
            builder.setWillPauseWhenDucked(true);
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            builder2.setContentType(2);
            builder.setAudioAttributes(builder2.build());
            AudioFocusRequest build = builder.build();
            h.f.b.l.b(build, "");
            this.p = build;
            AudioManager audioManager = this.o;
            if (audioManager == null) {
                h.f.b.l.a("audioManager");
            }
            AudioFocusRequest audioFocusRequest = this.p;
            if (audioFocusRequest == null) {
                h.f.b.l.a("audioFocusRequest");
            }
            requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
        } else {
            AudioManager audioManager2 = this.o;
            if (audioManager2 == null) {
                h.f.b.l.a("audioManager");
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = this.q;
            if (onAudioFocusChangeListener2 == null) {
                h.f.b.l.a("afChangeListener");
            }
            requestAudioFocus = audioManager2.requestAudioFocus(onAudioFocusChangeListener2, 2, 1);
        }
        if (requestAudioFocus != 1) {
            stopSelf();
        }
        this.f92655l.a(com.bytedance.ies.ugc.appcontext.f.g().d(new l(this)));
    }

    public static final class j implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackgroundAudioBrowserService f92662a;

        static {
            Covode.recordClassIndex(58766);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            this.f92662a = backgroundAudioBrowserService;
        }

        public final void onAudioFocusChange(int i2) {
            if (i2 == -3 || i2 == -2) {
                if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                    this.f92662a.f92650g.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_LOSS_FOCUS_TRANSIENT"));
                }
            } else if (i2 == -1) {
                this.f92662a.f92650g.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_LOSS_FOCUS"));
            } else if (i2 == 2 || i2 == 3) {
                this.f92662a.f92650g.e(null);
            }
            if (this.f92662a.f92650g.i()) {
                this.f92662a.a();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService, androidx.media.e
    public final IBinder onBind(Intent intent) {
        return new c(this, this);
    }

    static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.feed.e.a f92656a;

        static {
            Covode.recordClassIndex(58756);
        }

        public a(com.ss.android.ugc.aweme.feed.e.a aVar) {
            h.f.b.l.d(aVar, "");
            this.f92656a = aVar;
        }

        public final void onReceive(Context context, Intent intent) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(intent, "");
            if (h.f.b.l.a((Object) intent.getAction(), (Object) "android.media.AUDIO_BECOMING_NOISY")) {
                this.f92656a.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
            }
        }
    }

    public static final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a a(BackgroundAudioBrowserService backgroundAudioBrowserService) {
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = backgroundAudioBrowserService.f92654k;
        if (aVar == null) {
            h.f.b.l.a("xAndroidSessionController");
        }
        return aVar;
    }

    public static final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b b(BackgroundAudioBrowserService backgroundAudioBrowserService) {
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar = backgroundAudioBrowserService.f92653j;
        if (bVar == null) {
            h.f.b.l.a("xNotificationController");
        }
        return bVar;
    }

    public static final class d implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f92659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f92660b;

        static {
            Covode.recordClassIndex(58759);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (!this.f92659a.element) {
                if (bitmap != null) {
                    this.f92660b.resumeWith(q.m223constructorimpl(bitmap));
                } else {
                    this.f92660b.resumeWith(q.m223constructorimpl(r.a((Throwable) new Exception("Bitmap is null"))));
                }
                this.f92659a.element = true;
            }
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
            if (!this.f92659a.element) {
                h.c.d dVar = this.f92660b;
                if (th == null) {
                    th = new Exception("Failed to download bitmap; exception is null");
                }
                dVar.resumeWith(q.m223constructorimpl(r.a(th)));
                this.f92659a.element = true;
            }
        }

        d(z.a aVar, h.c.d dVar) {
            this.f92659a = aVar;
            this.f92660b = dVar;
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackgroundAudioBrowserService f92663a;

        static {
            Covode.recordClassIndex(58768);
        }

        l(BackgroundAudioBrowserService backgroundAudioBrowserService) {
            this.f92663a = backgroundAudioBrowserService;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (h.f.b.l.a(obj, (Object) true)) {
                this.f92663a.f92650g.j();
            } else if (h.f.b.l.a(obj, (Object) false)) {
                com.ss.android.ugc.aweme.feed.e.a aVar = this.f92663a.f92650g;
                if (!aVar.i()) {
                    return;
                }
                if (aVar.b() == o.PLAYBACK_STATE_PLAYING || aVar.b() == o.PLAYBACK_STATE_START) {
                    this.f92663a.f92650g.k();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ Aweme $aweme;
        int label;
        final /* synthetic */ BackgroundAudioBrowserService this$0;

        static {
            Covode.recordClassIndex(58767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BackgroundAudioBrowserService backgroundAudioBrowserService, Aweme aweme, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = backgroundAudioBrowserService;
            this.$aweme = aweme;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new k(this.this$0, this.$aweme, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((k) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    User author = this.$aweme.getAuthor();
                    if (author != null) {
                        UrlModel avatarMedium = author.getAvatarMedium();
                        h.f.b.l.b(avatarMedium, "");
                        this.label = 1;
                        h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                        z.a aVar2 = new z.a();
                        aVar2.element = false;
                        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(avatarMedium));
                        h.f.b.l.b(a2, "");
                        a2.a(new d(aVar2, hVar));
                        obj = hVar.a();
                        if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                            h.f.b.l.d(this, "");
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return h.z.f158842a;
                } catch (Throwable th) {
                    th.getMessage();
                    return h.z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            BackgroundAudioBrowserService.a(this.this$0).a(bitmap);
            BackgroundAudioBrowserService.b(this.this$0).a(bitmap);
            return h.z.f158842a;
        }
    }

    public final class c extends MediaSessionService.b {

        /* renamed from: b  reason: collision with root package name */
        public final BackgroundAudioBrowserService f92657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BackgroundAudioBrowserService f92658c;

        static {
            Covode.recordClassIndex(58758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BackgroundAudioBrowserService backgroundAudioBrowserService, BackgroundAudioBrowserService backgroundAudioBrowserService2) {
            super(backgroundAudioBrowserService2);
            h.f.b.l.d(backgroundAudioBrowserService2, "");
            this.f92658c = backgroundAudioBrowserService;
            this.f92657b = backgroundAudioBrowserService2;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8673);
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
                    MethodCollector.o(8673);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Intent a(BackgroundAudioBrowserService backgroundAudioBrowserService, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return backgroundAudioBrowserService.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService.b(com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
