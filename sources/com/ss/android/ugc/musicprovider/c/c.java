package com.ss.android.ugc.musicprovider.c;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.musicprovider.e;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedList;

public final class c implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, com.ss.android.ugc.aweme.music.service.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f148565a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f148566b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.interfaces.c f148567c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.interfaces.b f148568d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.interfaces.a f148569e;

    /* renamed from: f  reason: collision with root package name */
    private MediaPlayer f148570f;

    /* renamed from: g  reason: collision with root package name */
    private CountDownTimer f148571g;

    /* renamed from: h  reason: collision with root package name */
    private long f148572h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.a.a f148573i;

    /* renamed from: j  reason: collision with root package name */
    private String f148574j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f148575k;

    /* renamed from: l  reason: collision with root package name */
    private final String f148576l;

    static {
        Covode.recordClassIndex(97926);
    }

    public c(Context context, byte b2) {
        this(context);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97927);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void b() {
        a();
    }

    private final void e() {
        CountDownTimer countDownTimer = this.f148571g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void d() {
        try {
            MediaPlayer mediaPlayer = this.f148570f;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.c$c  reason: collision with other inner class name */
    public static final class CountDownTimerC4015c extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedList f148582b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.a.a f148583c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f148584d;

        static {
            Covode.recordClassIndex(97929);
        }

        public final void onTick(long j2) {
        }

        public final void onFinish() {
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f148582b)) {
                this.f148581a.a(0, 0);
            } else {
                this.f148581a.a(this.f148582b, this.f148583c, this.f148584d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC4015c(c cVar, LinkedList linkedList, com.ss.android.ugc.musicprovider.a.a aVar, boolean z, long j2) {
            super(j2, 1000);
            this.f148581a = cVar;
            this.f148582b = linkedList;
            this.f148583c = aVar;
            this.f148584d = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void c() {
        try {
            a();
            MediaPlayer mediaPlayer = this.f148570f;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f148570f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f148570f = null;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a() {
        MediaPlayer mediaPlayer;
        try {
            e();
            this.f148566b = true;
            MediaPlayer mediaPlayer2 = this.f148570f;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f148570f) != null) {
                mediaPlayer.pause();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.a aVar) {
        this.f148569e = aVar;
    }

    private /* synthetic */ c(Context context) {
        this(context, "");
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.b bVar) {
        this.f148568d = bVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.ss.android.ugc.musicprovider.interfaces.a aVar = this.f148569e;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void a(Exception exc) {
        com.ss.android.ugc.musicprovider.interfaces.b bVar = this.f148568d;
        if (bVar != null) {
            bVar.a();
        }
        c();
        b(exc);
    }

    private final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f148572h;
        com.ss.android.ugc.musicprovider.a.a aVar = this.f148573i;
        if (aVar != null && exc != null) {
            com.ss.android.ugc.aweme.music.ui.b.c.a(-1, elapsedRealtime, aVar.f148532b.toString(), this.f148574j, exc.getMessage(), this.f148576l);
            com.ss.android.ugc.aweme.music.ui.b.b.a(aVar.f148536f, aVar.f148532b.toString(), this.f148574j, exc.getMessage());
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.f148566b) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f148572h;
                com.ss.android.ugc.musicprovider.a.a aVar = this.f148573i;
                if (aVar != null) {
                    com.ss.android.ugc.aweme.music.ui.b.c.a(elapsedRealtime, aVar.f148532b.toString(), this.f148574j, this.f148576l);
                    com.ss.android.ugc.aweme.music.ui.b.b.a(aVar.f148536f, aVar.f148532b.toString(), this.f148574j, Long.valueOf(elapsedRealtime));
                }
                MediaPlayer mediaPlayer2 = this.f148570f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    com.ss.android.ugc.musicprovider.interfaces.c cVar = this.f148567c;
                    if (cVar != null) {
                        cVar.a(mediaPlayer2.getDuration());
                    }
                }
                e();
            }
        } catch (IllegalStateException e2) {
            c();
            a(e2);
        } finally {
            e();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.c cVar) {
        this.f148567c = cVar;
    }

    private c(Context context, String str) {
        l.d(context, "");
        this.f148575k = context;
        this.f148576l = str;
    }

    public final void a(int i2, int i3) {
        com.ss.android.ugc.musicprovider.interfaces.b bVar = this.f148568d;
        if (bVar != null) {
            bVar.a();
        }
        c();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f148572h;
        com.ss.android.ugc.musicprovider.a.a aVar = this.f148573i;
        if (aVar != null) {
            com.ss.android.ugc.aweme.music.ui.b.c.a(i2, elapsedRealtime, aVar.f148532b.toString(), this.f148574j, String.valueOf(i3), this.f148576l);
            com.ss.android.ugc.aweme.music.ui.b.b.a(aVar.f148536f, aVar.f148532b.toString(), this.f148574j, String.valueOf(i3));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        l.d(aVar, "");
        if (this.f148570f == null) {
            this.f148570f = new MediaPlayer();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(aVar.f148531a)) {
            linkedList.add(aVar.f148531a);
        } else if (!com.bytedance.common.utility.collection.b.a((Collection) aVar.f148532b)) {
            linkedList.addAll(aVar.f148532b);
        } else {
            return;
        }
        e();
        this.f148566b = false;
        MediaPlayer mediaPlayer = this.f148570f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new b(this, linkedList, aVar, z));
        }
        a(linkedList, aVar, z);
    }

    static final class b implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedList f148578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.a.a f148579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f148580d;

        static {
            Covode.recordClassIndex(97928);
        }

        b(c cVar, LinkedList linkedList, com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
            this.f148577a = cVar;
            this.f148578b = linkedList;
            this.f148579c = aVar;
            this.f148580d = z;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f148578b)) {
                this.f148577a.a(i2, i3);
                return false;
            }
            this.f148577a.a(this.f148578b, this.f148579c, this.f148580d);
            return false;
        }
    }

    private final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z, LinkedList<String> linkedList) {
        CountDownTimerC4015c cVar = new CountDownTimerC4015c(this, linkedList, aVar, z, e.f148619e);
        this.f148571g = cVar;
        cVar.start();
    }

    public final void a(LinkedList<String> linkedList, com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        MediaPlayer mediaPlayer;
        if (!this.f148566b && (mediaPlayer = this.f148570f) != null) {
            try {
                this.f148573i = aVar;
                a(aVar, z, linkedList);
                String poll = linkedList.poll();
                this.f148574j = poll;
                Uri parse = Uri.parse(poll);
                mediaPlayer.stop();
                mediaPlayer.reset();
                this.f148572h = SystemClock.elapsedRealtime();
                mediaPlayer.setAudioStreamType(3);
                if (aVar.f148535e != null) {
                    mediaPlayer.setDataSource(this.f148575k, parse, aVar.f148535e);
                } else {
                    mediaPlayer.setDataSource(this.f148575k, parse);
                }
                mediaPlayer.setLooping(z);
                mediaPlayer.prepareAsync();
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.setOnCompletionListener(this);
            } catch (Exception e2) {
                c();
                a(e2);
            }
        }
    }
}
