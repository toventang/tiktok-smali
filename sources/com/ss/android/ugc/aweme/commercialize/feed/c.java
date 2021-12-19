package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import h.a.af;
import h.j.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class c implements az, OnUIPlayListener {

    /* renamed from: e  reason: collision with root package name */
    public static WeakReference<az> f74187e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f74188f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f74189a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Video> f74190b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f74191c;

    /* renamed from: d  reason: collision with root package name */
    public int f74192d;

    /* renamed from: g  reason: collision with root package name */
    private boolean f74193g;

    /* renamed from: h  reason: collision with root package name */
    private final OnUIPlayListener f74194h;

    /* renamed from: i  reason: collision with root package name */
    private final b f74195i;

    public interface b {
        static {
            Covode.recordClassIndex(45788);
        }

        long a();

        void a(int i2);

        void a(Video video);

        void a(VideoUrlModel videoUrlModel);

        long b();
    }

    static {
        Covode.recordClassIndex(45786);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45787);
        }

        private a() {
        }

        public static az a() {
            WeakReference<az> weakReference = c.f74187e;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(az azVar) {
            if (azVar == null) {
                c.f74187e = null;
            } else {
                c.f74187e = new WeakReference<>(azVar);
            }
        }
    }

    private final boolean e() {
        if (this.f74191c == 0 && this.f74192d == 0) {
            return true;
        }
        return false;
    }

    public final Video a() {
        List<Video> list = this.f74190b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f74190b.get(this.f74191c);
    }

    public final String b() {
        String str;
        Aweme aweme = this.f74189a;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        if (this.f74191c == 0) {
            return str;
        }
        return str + this.f74191c;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.az
    public final long c() {
        boolean z;
        List<Video> list = this.f74190b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Iterator<T> it = this.f74190b.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += (long) it.next().getDuration();
        }
        if (j2 > 0) {
            return j2;
        }
        long b2 = this.f74195i.b();
        if (b2 > 0) {
            return b2;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.az
    public final long d() {
        boolean z;
        List<Video> list = this.f74190b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        Iterator it = h.a(0, this.f74191c).iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += (long) this.f74190b.get(((af) it).a()).getDuration();
        }
        long a2 = j2 + this.f74195i.a();
        if (a2 < 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        this.f74194h.onBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        this.f74194h.onDecoderBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        this.f74194h.onPlayFailed(lVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        this.f74194h.onPlayProgressChange(f2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
        this.f74194h.onRetryOnError(lVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        if (e()) {
            this.f74194h.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        this.f74195i.a(1);
        this.f74194h.onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        this.f74195i.a(2);
        if (this.f74193g) {
            this.f74193g = false;
        } else {
            this.f74194h.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.f74195i.a(0);
        if (e()) {
            this.f74194h.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        List<Video> list = this.f74190b;
        if (list != null && !list.isEmpty()) {
            this.f74191c = (this.f74191c + 1) % this.f74190b.size();
            Video a2 = a();
            if (a2 != null) {
                this.f74193g = true;
                this.f74195i.a(a2);
            }
            if (this.f74191c == 0) {
                if (this.f74192d == 0) {
                    this.f74194h.onPlayCompletedFirstTime(str);
                }
                this.f74194h.onPlayCompleted(str);
                this.f74192d++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        List<Video> list;
        VideoUrlModel playAddr;
        this.f74193g = false;
        this.f74195i.a(1);
        if (e()) {
            this.f74194h.onRenderReady(nVar);
        }
        if (this.f74192d == 0 && (list = this.f74190b) != null && !list.isEmpty() && this.f74191c + 1 < this.f74190b.size() && (playAddr = this.f74190b.get(this.f74191c + 1).getPlayAddr()) != null) {
            playAddr.getUri();
            this.f74195i.a(playAddr);
        }
    }

    public c(OnUIPlayListener onUIPlayListener, b bVar) {
        h.f.b.l.d(onUIPlayListener, "");
        h.f.b.l.d(bVar, "");
        this.f74194h = onUIPlayListener;
        this.f74195i = bVar;
    }
}
