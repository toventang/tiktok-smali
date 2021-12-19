package com.ss.android.ugc.aweme.kids.b.c;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.b.d;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedList;

public final class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, com.ss.android.ugc.aweme.kids.a.g.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f105402a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f105403b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.b.a.c f105404c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.b.a.b f105405d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.b.a.a f105406e;

    /* renamed from: f  reason: collision with root package name */
    private MediaPlayer f105407f;

    /* renamed from: g  reason: collision with root package name */
    private CountDownTimer f105408g;

    /* renamed from: h  reason: collision with root package name */
    private long f105409h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.b.b.a f105410i;

    /* renamed from: j  reason: collision with root package name */
    private String f105411j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f105412k;

    /* renamed from: l  reason: collision with root package name */
    private final String f105413l;

    static {
        Covode.recordClassIndex(67562);
    }

    public b(Context context, byte b2) {
        this(context);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67563);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void c() {
        CountDownTimer countDownTimer = this.f105408g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public static final class c extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105418a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedList f105419b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.b.b.a f105420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f105421d;

        static {
            Covode.recordClassIndex(67565);
        }

        public final void onTick(long j2) {
        }

        public final void onFinish() {
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f105419b)) {
                this.f105418a.a(0, 0);
            } else {
                this.f105418a.a(this.f105419b, this.f105420c, this.f105421d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, LinkedList linkedList, com.ss.android.ugc.aweme.kids.b.b.a aVar, boolean z, long j2) {
            super(j2, 1000);
            this.f105418a = bVar;
            this.f105419b = linkedList;
            this.f105420c = aVar;
            this.f105421d = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void a() {
        MediaPlayer mediaPlayer;
        try {
            c();
            this.f105403b = true;
            MediaPlayer mediaPlayer2 = this.f105407f;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f105407f) != null) {
                mediaPlayer.pause();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void b() {
        try {
            a();
            MediaPlayer mediaPlayer = this.f105407f;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f105407f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f105407f = null;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void a(com.ss.android.ugc.aweme.kids.b.a.a aVar) {
        this.f105406e = aVar;
    }

    private /* synthetic */ b(Context context) {
        this(context, "");
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void a(com.ss.android.ugc.aweme.kids.b.a.b bVar) {
        this.f105405d = bVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.ss.android.ugc.aweme.kids.b.a.a aVar = this.f105406e;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void a(Exception exc) {
        com.ss.android.ugc.aweme.kids.b.a.b bVar = this.f105405d;
        if (bVar != null) {
            bVar.a();
        }
        b();
        b(exc);
    }

    private final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f105409h;
        com.ss.android.ugc.aweme.kids.b.b.a aVar = this.f105410i;
        if (aVar != null && exc != null) {
            com.ss.android.ugc.aweme.kids.a.h.a.b.a(-1, elapsedRealtime, aVar.f105392b.toString(), this.f105411j, exc.getMessage(), this.f105413l);
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.f105403b) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f105409h;
                com.ss.android.ugc.aweme.kids.b.b.a aVar = this.f105410i;
                if (aVar != null) {
                    String obj = aVar.f105392b.toString();
                    String str = this.f105411j;
                    com.bytedance.apm.b.a("aweme_music_play_error_rate", 0, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(elapsedRealtime)).a("fileUri", str).a("fileUrlList", obj).a("isUseTTPlayer", (Boolean) false).a("trace", this.f105413l).a());
                }
                MediaPlayer mediaPlayer2 = this.f105407f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    com.ss.android.ugc.aweme.kids.b.a.c cVar = this.f105404c;
                    if (cVar != null) {
                        cVar.a(mediaPlayer2.getDuration());
                    }
                }
                c();
            }
        } catch (IllegalStateException e2) {
            b();
            a(e2);
        } finally {
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void a(com.ss.android.ugc.aweme.kids.b.a.c cVar) {
        this.f105404c = cVar;
    }

    private b(Context context, String str) {
        l.d(context, "");
        this.f105412k = context;
        this.f105413l = str;
    }

    public final void a(int i2, int i3) {
        com.ss.android.ugc.aweme.kids.b.a.b bVar = this.f105405d;
        if (bVar != null) {
            bVar.a();
        }
        b();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f105409h;
        com.ss.android.ugc.aweme.kids.b.b.a aVar = this.f105410i;
        if (aVar != null) {
            com.ss.android.ugc.aweme.kids.a.h.a.b.a(i2, elapsedRealtime, aVar.f105392b.toString(), this.f105411j, String.valueOf(i3), this.f105413l);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.b
    public final void a(com.ss.android.ugc.aweme.kids.b.b.a aVar, boolean z) {
        l.d(aVar, "");
        if (this.f105407f == null) {
            this.f105407f = new MediaPlayer();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(aVar.f105391a)) {
            linkedList.add(aVar.f105391a);
        } else if (!com.bytedance.common.utility.collection.b.a((Collection) aVar.f105392b)) {
            linkedList.addAll(aVar.f105392b);
        } else {
            return;
        }
        c();
        this.f105403b = false;
        MediaPlayer mediaPlayer = this.f105407f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C2694b(this, linkedList, aVar, z));
        }
        a(linkedList, aVar, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.b.c.b$b  reason: collision with other inner class name */
    static final class C2694b implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedList f105415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.b.b.a f105416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f105417d;

        static {
            Covode.recordClassIndex(67564);
        }

        C2694b(b bVar, LinkedList linkedList, com.ss.android.ugc.aweme.kids.b.b.a aVar, boolean z) {
            this.f105414a = bVar;
            this.f105415b = linkedList;
            this.f105416c = aVar;
            this.f105417d = z;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f105415b)) {
                this.f105414a.a(i2, i3);
                return false;
            }
            this.f105414a.a(this.f105415b, this.f105416c, this.f105417d);
            return false;
        }
    }

    private final void a(com.ss.android.ugc.aweme.kids.b.b.a aVar, boolean z, LinkedList<String> linkedList) {
        c cVar = new c(this, linkedList, aVar, z, d.f105423e);
        this.f105408g = cVar;
        cVar.start();
    }

    public final void a(LinkedList<String> linkedList, com.ss.android.ugc.aweme.kids.b.b.a aVar, boolean z) {
        MediaPlayer mediaPlayer;
        if (!this.f105403b && (mediaPlayer = this.f105407f) != null) {
            try {
                this.f105410i = aVar;
                a(aVar, z, linkedList);
                String poll = linkedList.poll();
                this.f105411j = poll;
                Uri parse = Uri.parse(poll);
                mediaPlayer.stop();
                mediaPlayer.reset();
                this.f105409h = SystemClock.elapsedRealtime();
                mediaPlayer.setAudioStreamType(3);
                if (aVar.f105395e != null) {
                    mediaPlayer.setDataSource(this.f105412k, parse, aVar.f105395e);
                } else {
                    mediaPlayer.setDataSource(this.f105412k, parse);
                }
                mediaPlayer.setLooping(z);
                mediaPlayer.prepareAsync();
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.setOnCompletionListener(this);
            } catch (Exception e2) {
                b();
                a(e2);
            }
        }
    }
}
