package com.ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import java.util.Map;

public final class MusicAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final MusicService f111096a = ((MusicService) a.a(Api.f66569d, MusicService.class));

    /* renamed from: b  reason: collision with root package name */
    public static final String f111097b = (Api.f66569d + "/aweme/v1/music/aweme/");

    /* renamed from: c  reason: collision with root package name */
    public static final String f111098c = (Api.f66569d + "/aweme/v1/music/fresh/aweme/");

    public interface MusicService {
        static {
            Covode.recordClassIndex(71292);
        }

        @t(a = "/aweme/v1/music/create/")
        @g
        b<String> createMusic(@f Map<String, String> map);

        @h(a = "/aweme/v1/original/music/list/")
        q<OriginalMusicList> fetchOriginalMusicList(@z(a = "user_id") String str, @z(a = "sec_user_id") String str2, @z(a = "cursor") int i2, @z(a = "count") int i3);

        @h(a = "/tiktok/user/pinned_pgc_music/list/v1/")
        q<PinnedMusicList> getPinnedMusicList(@z(a = "sec_user_id") String str);

        @h
        q<MusicAwemeList> queryMusicAwemeList(@ag String str, @z(a = "music_id") String str2, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "type") int i3);

        @h(a = "/tiktok/user/pgc_music/query/v1/")
        q<OriginalMusicList> searchMusicList(@z(a = "sec_user_id") String str, @z(a = "keyword") String str2, @z(a = "cursor") int i2, @z(a = "count") int i3);
    }

    static {
        Covode.recordClassIndex(71291);
    }

    public static OriginalMusicList a(String str, String str2, int i2, int i3) {
        return f111096a.fetchOriginalMusicList(str, str2, i2, i3).get();
    }
}
