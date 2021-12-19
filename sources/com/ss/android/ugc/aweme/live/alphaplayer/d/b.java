package com.ss.android.ugc.aweme.live.alphaplayer.d;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.d;

public class b extends a<b> {

    /* renamed from: a  reason: collision with root package name */
    private MediaPlayer f108254a;

    /* renamed from: h  reason: collision with root package name */
    private MediaMetadataRetriever f108255h = new MediaMetadataRetriever();

    /* renamed from: i  reason: collision with root package name */
    private String f108256i;

    /* renamed from: j  reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f108257j = new MediaPlayer.OnCompletionListener() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.d.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69376);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (b.this.f108248d != null) {
                b.this.f108248d.a();
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private MediaPlayer.OnPreparedListener f108258k = new MediaPlayer.OnPreparedListener() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.d.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(69377);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (b.this.f108249e != null) {
                b.this.f108249e.a();
            }
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private MediaPlayer.OnErrorListener f108259l = new MediaPlayer.OnErrorListener() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.d.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(69378);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            if (b.this.f108250f == null) {
                return false;
            }
            b.this.f108250f.a(i2, i3, "");
            return false;
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private MediaPlayer.OnInfoListener f108260m = new MediaPlayer.OnInfoListener() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.d.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(69379);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            if (i2 != 3 || b.this.f108251g == null) {
                return false;
            }
            b.this.f108251g.a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(69375);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final String j() {
        return "DefaultSystemPlayer";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b() {
        this.f108254a.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void c() {
        this.f108254a.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void d() {
        this.f108254a.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void e() {
        this.f108254a.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final int i() {
        return this.f108254a.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final boolean k() {
        return this.f108254a.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void f() {
        this.f108254a.reset();
        this.f108256i = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void g() {
        this.f108254a.release();
        this.f108256i = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f108254a = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this.f108257j);
        this.f108254a.setOnPreparedListener(this.f108258k);
        this.f108254a.setOnErrorListener(this.f108259l);
        this.f108254a.setOnInfoListener(this.f108260m);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final d h() {
        if (!TextUtils.isEmpty(this.f108256i)) {
            this.f108255h.setDataSource(this.f108256i);
            String extractMetadata = this.f108255h.extractMetadata(18);
            String extractMetadata2 = this.f108255h.extractMetadata(19);
            if (!TextUtils.isEmpty(extractMetadata) && !TextUtils.isEmpty(extractMetadata2)) {
                return new d(Integer.parseInt(this.f108255h.extractMetadata(18)), Integer.parseInt(this.f108255h.extractMetadata(19)), this.f108254a.getDuration());
            }
            throw new Exception("retriever get metadata failure");
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(Surface surface) {
        this.f108254a.setSurface(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(String str) {
        this.f108256i = str;
        this.f108254a.setDataSource(str);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b(boolean z) {
        this.f108254a.setScreenOnWhilePlaying(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(boolean z) {
        this.f108254a.setLooping(z);
    }
}
