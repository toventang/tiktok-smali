package com.ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import h.a.ag;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67589b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f67590a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67591c;

    /* renamed from: d  reason: collision with root package name */
    private final h f67592d;

    static {
        Covode.recordClassIndex(41607);
    }

    private final b j() {
        return (b) this.f67592d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41610);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String d() {
        String str;
        c cVar = this.f67590a;
        if (cVar == null || (str = cVar.r) == null) {
            return "";
        }
        return str;
    }

    private final int e() {
        c cVar = this.f67590a;
        if (cVar != null) {
            return cVar.v;
        }
        return -1;
    }

    private final String f() {
        String str;
        c cVar = this.f67590a;
        if (cVar == null || (str = cVar.u) == null) {
            return "";
        }
        return str;
    }

    private final String g() {
        String str;
        c cVar = this.f67590a;
        if (cVar == null || (str = cVar.t) == null) {
            return "";
        }
        return str;
    }

    private final String h() {
        String str;
        c cVar = this.f67590a;
        if (cVar == null || (str = cVar.s) == null) {
            return "";
        }
        return str;
    }

    private final boolean i() {
        c cVar = this.f67590a;
        if (cVar == null || !cVar.w) {
            return false;
        }
        return true;
    }

    public final r a() {
        c cVar = this.f67590a;
        if (cVar != null) {
            return cVar.x;
        }
        return null;
    }

    public final Aweme b() {
        c cVar = this.f67590a;
        if (cVar != null) {
            return cVar.f67578d;
        }
        return null;
    }

    private void k() {
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        c cVar = this.f67590a;
        if (cVar != null) {
            cVar.B = -1;
        }
        c cVar2 = this.f67590a;
        if (cVar2 != null && (a2 = cVar2.a()) != null) {
            a2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        h.f.b.l.b(com.a.a("ISearchVideoView.releaseVideo", Arrays.copyOf(new Object[0], 0)), "");
        j();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public void x() {
        h.f.b.l.b(com.a.a("ISearchVideoView.playVideo", Arrays.copyOf(new Object[0], 0)), "");
        j();
        b();
        j();
        j();
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67594a = new b();

        static {
            Covode.recordClassIndex(41611);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            a aVar = new a();
            h.f.b.l.d(ag.c(v.a("enter_from", "general_search"), v.a("bundle", "player_core")), "");
            return aVar;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f67596b;

        static {
            Covode.recordClassIndex(41612);
        }

        c(d dVar, boolean z) {
            this.f67595a = dVar;
            this.f67596b = z;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2;
            String valueOf;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            s sVar = new s();
            r a2 = this.f67595a.a();
            if (a2 != null) {
                str = a2.f121274i;
            } else {
                str = null;
            }
            s a3 = sVar.a("request_id", str);
            Aweme b2 = this.f67595a.b();
            if (b2 != null) {
                str2 = b2.getAid();
            } else {
                str2 = null;
            }
            if (e.c(str2)) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(com.ss.android.ugc.aweme.metrics.b.a.f109531a ? 1 : 0);
            }
            s a4 = a3.a("is_first", valueOf);
            Aweme b3 = this.f67595a.b();
            if (b3 != null) {
                str3 = b3.getAid();
            } else {
                str3 = null;
            }
            s a5 = a4.a("group_id", str3);
            String str8 = "1";
            if (this.f67596b) {
                str4 = str8;
            } else {
                str4 = "0";
            }
            s a6 = a5.a("is_from_feed_cache", str4);
            r a7 = this.f67595a.a();
            if (a7 != null) {
                str5 = a7.f121272g;
            } else {
                str5 = null;
            }
            s a8 = a6.a("enter_from", str5);
            Context a9 = com.bytedance.ies.ugc.appcontext.d.a();
            if (TextUtils.isEmpty(j.f107223b) || !j.b() || j.c()) {
                j.f107223b = com.bytedance.common.utility.l.e(a9);
            }
            s a10 = a8.a("access", j.f107223b).a("top_activity", com.ss.android.ugc.aweme.feed.s.b());
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.f67595a.b())) {
                str6 = str8;
            } else {
                str6 = "0";
            }
            s a11 = a10.a("is_ad", str6);
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.G(this.f67595a.b())) {
                str8 = "0";
            }
            JSONObject a12 = a11.a("is_splash", str8).a();
            try {
                a12.put("preloader_type", q.b());
            } catch (Exception e2) {
                com.bytedance.c.a.a.a.b.a(e2);
            }
            MobClick labelName = MobClick.obtain().setEventName("video_request_search").setLabelName("perf_monitor");
            Aweme b4 = this.f67595a.b();
            if (b4 != null) {
                str7 = b4.getAid();
            } else {
                str7 = null;
            }
            com.ss.android.ugc.aweme.common.r.onEvent(labelName.setValue(str7).setJsonObject(a12));
            com.ss.android.ugc.aweme.common.r.a("video_request_search", a12);
            com.ss.android.ugc.aweme.metrics.b.a.a("video_request_search", a12);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        k();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
        j().onPlayStop(str);
    }

    public d(c cVar) {
        this.f67590a = cVar;
        r a2 = a();
        if (a2 != null) {
            a2.a(new h.f.a.b<Aweme, String>(this) {
                /* class com.ss.android.ugc.aweme.autoplay.player.video.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(41608);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* bridge */ /* synthetic */ String invoke(Aweme aweme) {
                    String str;
                    c cVar = this.this$0.f67590a;
                    if (cVar == null || (str = cVar.z) == null) {
                        return "";
                    }
                    return str;
                }
            }).b(AnonymousClass2.f67593a);
        }
        this.f67592d = i.a((h.f.a.a) b.f67594a);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
        String str2;
        j().onPlayPrepare(str);
        Aweme b2 = b();
        if (b2 != null) {
            str2 = b2.getAid();
        } else {
            str2 = null;
        }
        b.i.b(new c(this, e.c(str2)), com.ss.android.ugc.aweme.common.r.a());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(n nVar) {
        int i2;
        h.f.b.l.d(nVar, "");
        if (b() != null) {
            Object[] objArr = new Object[2];
            Aweme b2 = b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            objArr[0] = b2.getAid();
            objArr[1] = Long.valueOf(nVar.f148791c);
            h.f.b.l.b(com.a.a("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2)), "");
        }
        String d2 = d();
        int e2 = e();
        String str = nVar.f148789a;
        Aweme b3 = b();
        if (b3 != null) {
            i2 = b3.getAwemeType();
        } else {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.feed.c.a(d2, e2, str, i2, b(), "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 > -1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0187, code lost:
        if (r0 == null) goto L_0x0189;
     */
    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPausePlay(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.video.d.onPausePlay(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        if (r0 == null) goto L_0x0133;
     */
    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayCompletedFirstTime(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.video.d.onPlayCompletedFirstTime(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0234, code lost:
        if (r0 == null) goto L_0x0236;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b9  */
    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o r13) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.video.d.onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
        j().onBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
        j().onDecoderBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, l lVar) {
        Video video;
        String str2;
        String str3;
        VideoUrlModel videoUrlModel;
        VideoUrlModel videoUrlModel2;
        String videoUrlModel3;
        j().onPlayFailed(str, lVar);
        if (lVar != null && b() != null) {
            Aweme b2 = b();
            VideoUrlModel videoUrlModel4 = null;
            if (b2 != null && b2.getVideo() != null) {
                Aweme b3 = b();
                Aweme b4 = b();
                if (b4 != null) {
                    video = b4.getVideo();
                } else {
                    video = null;
                }
                HashMap hashMap = new HashMap();
                Aweme b5 = b();
                if (b5 != null) {
                    str2 = b5.getAid();
                } else {
                    str2 = null;
                }
                boolean c2 = e.c(str2);
                hashMap.put("error_code", String.valueOf(lVar.f148749d));
                hashMap.put("error_internal_code", String.valueOf(lVar.f148750e));
                hashMap.put("error_info", lVar.f148751f.toString());
                Aweme b6 = b();
                if (b6 != null) {
                    str3 = b6.getAid();
                } else {
                    str3 = null;
                }
                hashMap.put("group_id", str3);
                hashMap.put("video_id", com.ss.android.ugc.playerkit.c.b.f148656b);
                hashMap.put("is_bytevc1", String.valueOf(lVar.f148747b ? 1 : 0));
                hashMap.put("is_dash", String.valueOf(lVar.f148748c ? 1 : 0));
                hashMap.put("is_ad", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.s(b3) ? 1 : 0));
                hashMap.put("is_splash", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.G(b3) ? 1 : 0));
                hashMap.put("internet_speed", String.valueOf(g.f()));
                if (video != null) {
                    videoUrlModel = video.getPlayAddr();
                } else {
                    videoUrlModel = null;
                }
                hashMap.put("cache_size", String.valueOf(ac.c(videoUrlModel)));
                if (video != null) {
                    videoUrlModel2 = video.getPlayAddr();
                } else {
                    videoUrlModel2 = null;
                }
                hashMap.put("video_size", String.valueOf(ac.d(videoUrlModel2)));
                if (video != null) {
                    videoUrlModel4 = video.getPlayAddr();
                }
                if (videoUrlModel4 == null) {
                    videoUrlModel3 = "null";
                } else {
                    videoUrlModel3 = video.getPlayAddr().toString();
                    h.f.b.l.b(videoUrlModel3, "");
                }
                hashMap.put("play_url", videoUrlModel3);
                hashMap.put("is_from_feed_cache", String.valueOf(c2 ? 1 : 0));
                hashMap.put("eco", String.valueOf(com.ss.android.ugc.aweme.setting.l.d()));
                com.ss.android.ugc.aweme.common.r.a("video_play_failed_search", hashMap);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", String.valueOf(lVar.f148749d));
                    jSONObject.put("error_internal_code", String.valueOf(lVar.f148750e));
                    jSONObject.put("internet_speed", String.valueOf(g.f()));
                    String jSONObject2 = jSONObject.toString();
                    h.f.b.l.b(jSONObject2, "");
                    com.ss.android.ugc.aweme.feed.e.n.a("error", jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
