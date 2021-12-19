package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: e  reason: collision with root package name */
    public static final b f37062e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f37063a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c f37064b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b f37065c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.b f37066d;

    /* renamed from: f  reason: collision with root package name */
    private final MediaSessionCompat f37067f;

    /* renamed from: g  reason: collision with root package name */
    private final h f37068g = i.a((h.f.a.a) d.f37074a);

    /* renamed from: h  reason: collision with root package name */
    private final h f37069h = i.a((h.f.a.a) c.f37073a);

    static {
        Covode.recordClassIndex(22291);
    }

    private final PlaybackStateCompat.a e() {
        return (PlaybackStateCompat.a) this.f37068g.getValue();
    }

    private final MediaMetadataCompat.a f() {
        return (MediaMetadataCompat.a) this.f37069h.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(22293);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<MediaMetadataCompat.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37073a = new c();

        static {
            Covode.recordClassIndex(22294);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MediaMetadataCompat.a invoke() {
            return new MediaMetadataCompat.a();
        }
    }

    static final class d extends m implements h.f.a.a<PlaybackStateCompat.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f37074a = new d();

        static {
            Covode.recordClassIndex(22295);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PlaybackStateCompat.a invoke() {
            return new PlaybackStateCompat.a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        try {
            MediaSessionCompat mediaSessionCompat = this.f37067f;
            mediaSessionCompat.a(false);
            mediaSessionCompat.a((MediaSessionCompat.a) null);
            mediaSessionCompat.c();
        } catch (Throwable unused) {
        }
    }

    public final MediaSessionCompat.Token c() {
        MediaSessionCompat.Token d2 = this.f37067f.d();
        l.a((Object) d2, "");
        return d2;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a$a  reason: collision with other inner class name */
    public static final class C0915a extends MediaSessionCompat.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaSessionCompat f37070a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f37071d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComponentName f37072e;

        static {
            Covode.recordClassIndex(22292);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void a() {
            super.a();
            if (this.f37070a.b()) {
                this.f37071d.f37064b.c(null);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void b() {
            super.b();
            if (this.f37070a.b()) {
                this.f37071d.f37064b.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void e() {
            super.e();
            if (this.f37070a.b()) {
                this.f37071d.f37064b.f(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("STOP_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void c() {
            super.c();
            if (this.f37070a.b() && this.f37071d.f37065c.i()) {
                this.f37071d.f37066d.b(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("operation_from_media_session_skip_to_next"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void d() {
            super.d();
            if (this.f37070a.b() && this.f37071d.f37065c.j()) {
                this.f37071d.f37066d.a(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("operation_from_media_session_skip_to_prev"));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void a(long j2) {
            super.a(j2);
            if (this.f37070a.b()) {
                this.f37071d.f37064b.a(j2, null);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final boolean a(Intent intent) {
            l.c(intent, "");
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            l.a((Object) keyEvent, "");
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79) {
                g.f36700a.a("MediaSessionController", "KEYCODE_HEADSETHOOK");
            } else if (keyCode == 126) {
                g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_PLAY");
            } else if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_PLAY_PAUSE");
                        break;
                    case 86:
                        g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_STOP");
                        break;
                    case 87:
                        g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_NEXT");
                        break;
                    case 88:
                        g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_PREVIOUS");
                        break;
                }
            } else {
                g.f36700a.a("MediaSessionController", "KEYCODE_MEDIA_PAUSE");
            }
            return super.a(intent);
        }

        C0915a(MediaSessionCompat mediaSessionCompat, a aVar, ComponentName componentName) {
            this.f37070a = mediaSessionCompat;
            this.f37071d = aVar;
            this.f37072e = componentName;
        }
    }

    public final void b() {
        long j2;
        MediaMetadataCompat.a f2 = f();
        f m2 = this.f37065c.m();
        if (m2 != null) {
            j2 = m2.getDuration();
        } else {
            j2 = 0;
        }
        long d2 = this.f37064b.d();
        if (d2 > 0) {
            j2 = d2;
        }
        f2.a("android.media.metadata.DURATION", j2);
        this.f37067f.a(f().a());
    }

    public final void d() {
        boolean z;
        o b2 = this.f37064b.b();
        int a2 = a(b2);
        e().a();
        e().a(a2, this.f37064b.c());
        this.f37067f.a(e().b());
        MediaSessionCompat mediaSessionCompat = this.f37067f;
        if (b2 != o.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        mediaSessionCompat.a(z);
    }

    public final void a(boolean z) {
        this.f37067f.a(z);
    }

    private static int a(o oVar) {
        int i2 = b.f37075a[oVar.ordinal()];
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

    public final void a(Intent intent) {
        l.c(intent, "");
        androidx.media.b.a.a(this.f37067f, intent);
    }

    public final void a(Bitmap bitmap) {
        if (!l.a((Object) Build.MANUFACTURER, (Object) "Xiaomi")) {
            return;
        }
        if (bitmap == null || !bitmap.isRecycled()) {
            f().a("android.media.metadata.ART", bitmap);
            this.f37067f.a(f().a());
            return;
        }
        g.f36700a.b("MediaSessionController", "coverBitmap(" + bitmap + ") already recycled.");
    }

    public final void a(f fVar) {
        l.c(fVar, "");
        MediaMetadataCompat.a f2 = f();
        f2.a("android.media.metadata.TITLE", fVar.getSongName());
        f2.a("android.media.metadata.ALBUM", fVar.getAlbumName());
        f2.a("android.media.metadata.ARTIST", fVar.getArtistName());
        long duration = fVar.getDuration();
        long d2 = this.f37064b.d();
        if (d2 > 0) {
            duration = d2;
        }
        f2.a("android.media.metadata.DURATION", duration);
        f2.a("android.media.metadata.ART", (Bitmap) null);
        this.f37067f.a(true);
        this.f37067f.a(f().a());
    }

    public a(Context context, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b bVar2, ComponentName componentName) {
        l.c(context, "");
        l.c(cVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        l.c(componentName, "");
        this.f37063a = context;
        this.f37064b = cVar;
        this.f37065c = bVar;
        this.f37066d = bVar2;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", (byte) 0);
        mediaSessionCompat.a(PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(componentName), 0));
        mediaSessionCompat.a(new C0915a(mediaSessionCompat, this, componentName));
        mediaSessionCompat.a();
        this.f37067f = mediaSessionCompat;
    }
}
