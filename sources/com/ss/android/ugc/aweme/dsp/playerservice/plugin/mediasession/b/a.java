package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final b f83636c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionCompat f83637a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.a.d f83638b;

    /* renamed from: d  reason: collision with root package name */
    private final h f83639d;

    /* renamed from: e  reason: collision with root package name */
    private final h f83640e = i.a((h.f.a.a) e.f83648a);

    /* renamed from: f  reason: collision with root package name */
    private final h f83641f = i.a((h.f.a.a) d.f83647a);

    /* renamed from: g  reason: collision with root package name */
    private final Context f83642g;

    static {
        Covode.recordClassIndex(52184);
    }

    private final PlaybackStateCompat.a c() {
        return (PlaybackStateCompat.a) this.f83640e.getValue();
    }

    public final MediaMetadataCompat.a a() {
        return (MediaMetadataCompat.a) this.f83641f.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(52186);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f83646a;

                static {
                    Covode.recordClassIndex(52188);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83646a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    if (this.f83646a.this$0.f83637a.b()) {
                        this.f83646a.this$0.f83638b.f(new f("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                    }
                }
            };
        }
    }

    static final class d extends m implements h.f.a.a<MediaMetadataCompat.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f83647a = new d();

        static {
            Covode.recordClassIndex(52189);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MediaMetadataCompat.a invoke() {
            return new MediaMetadataCompat.a();
        }
    }

    static final class e extends m implements h.f.a.a<PlaybackStateCompat.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f83648a = new e();

        static {
            Covode.recordClassIndex(52190);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlaybackStateCompat.a invoke() {
            return new PlaybackStateCompat.a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a$a  reason: collision with other inner class name */
    public static final class C1988a extends MediaSessionCompat.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaSessionCompat f83643a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f83644d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComponentName f83645e;

        static {
            Covode.recordClassIndex(52185);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void a() {
            super.a();
            if (this.f83643a.b()) {
                this.f83644d.f83638b.e((f) null);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void b() {
            super.b();
            if (this.f83643a.b()) {
                this.f83644d.f83638b.f(new f("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void e() {
            super.e();
            if (this.f83643a.b()) {
                this.f83644d.f83638b.h(new f("STOP_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void c() {
            super.c();
            if (this.f83643a.b() && this.f83644d.f83638b.q()) {
                this.f83644d.f83638b.j(new f("operation_from_media_session_skip_to_next"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void d() {
            super.d();
            if (this.f83643a.b() && this.f83644d.f83638b.r()) {
                this.f83644d.f83638b.i(new f("operation_from_media_session_skip_to_prev"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void a(long j2) {
            super.a(j2);
            if (this.f83643a.b()) {
                this.f83644d.f83638b.c(j2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final boolean a(Intent intent) {
            Integer valueOf;
            l.d(intent, "");
            if (!this.f83643a.b()) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (!(keyEvent == null || (valueOf = Integer.valueOf(keyEvent.getKeyCode())) == null || valueOf.intValue() == 86 || valueOf.intValue() == 79 || valueOf.intValue() == 85 || valueOf.intValue() == 87 || valueOf.intValue() == 88 || valueOf.intValue() == 127)) {
                valueOf.intValue();
            }
            return super.a(intent);
        }

        C1988a(MediaSessionCompat mediaSessionCompat, a aVar, ComponentName componentName) {
            this.f83643a = mediaSessionCompat;
            this.f83644d = aVar;
            this.f83645e = componentName;
        }
    }

    public final void b() {
        boolean z;
        com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar = this.f83638b;
        com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = dVar.e();
        int a2 = a(e2);
        c().a();
        c().a(a2, dVar.f());
        this.f83637a.a(c().b());
        MediaSessionCompat mediaSessionCompat = this.f83637a;
        if (e2 != com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        mediaSessionCompat.a(z);
    }

    public final void a(boolean z) {
        this.f83637a.a(z);
    }

    private static int a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        int i2 = b.f83649a[fVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4 || i2 == 5) {
            return 1;
        }
        throw new n();
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
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
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public a(Context context, com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar, ComponentName componentName) {
        l.d(context, "");
        l.d(dVar, "");
        l.d(componentName, "");
        this.f83642g = context;
        this.f83638b = dVar;
        h a2 = i.a((h.f.a.a) new c(this));
        this.f83639d = a2;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", (byte) 0);
        mediaSessionCompat.a(PendingIntent.getService(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(componentName), 0));
        mediaSessionCompat.b(new C1988a(mediaSessionCompat, this, componentName));
        mediaSessionCompat.a();
        this.f83637a = mediaSessionCompat;
        b(context, (c.AnonymousClass1) a2.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}
