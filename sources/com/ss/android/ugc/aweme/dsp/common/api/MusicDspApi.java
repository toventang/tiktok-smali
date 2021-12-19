package com.ss.android.ugc.aweme.dsp.common.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.model.DSPShuffleCollectResponse;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class MusicDspApi {

    /* renamed from: a  reason: collision with root package name */
    public static MusicDspOperatorApi f83281a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f83282b = new a((byte) 0);

    public interface MusicDspOperatorApi {
        static {
            Covode.recordClassIndex(51924);
        }

        @h(a = "/tiktok/music/dsp/user/collect_song/list/v2/")
        t<DSPCollectMusicResponse> loadCollectList(@z(a = "cursor") long j2, @z(a = "count") long j3, @z(a = "clip_ids") String str, @z(a = "item_ids") String str2);

        @com.bytedance.retrofit2.b.t(a = "/tiktok/music/dsp/feed/shuffle/v2/")
        @g
        t<DSPShuffleCollectResponse> loadShuffleCollectList(@e(a = "played_clip_ids") String str, @e(a = "candidate_clip_ids") String str2, @e(a = "playing_clip_id") String str3);

        @h(a = "/tiktok/music/dsp/feed/get/v2/")
        t<DspFeedResponse> queryMusicFeed();
    }

    static {
        Covode.recordClassIndex(51923);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51925);
        }

        private a() {
        }

        private static MusicDspOperatorApi b() {
            if (MusicDspApi.f83281a == null) {
                MusicDspApi.f83281a = (MusicDspOperatorApi) RetrofitFactory.a().a(b.f59141e).a(MusicDspOperatorApi.class);
            }
            MusicDspOperatorApi musicDspOperatorApi = MusicDspApi.f83281a;
            if (musicDspOperatorApi == null) {
                l.b();
            }
            return musicDspOperatorApi;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t<DSPShuffleCollectResponse> a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            return b().loadShuffleCollectList(str, str2, str3);
        }

        public static t<DSPCollectMusicResponse> a(long j2, List<String> list, List<String> list2) {
            l.d(list, "");
            l.d(list2, "");
            return b().loadCollectList(j2, 50, n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62), n.a(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
        }
    }
}
