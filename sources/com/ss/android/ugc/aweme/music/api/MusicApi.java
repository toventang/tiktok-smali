package com.ss.android.ugc.aweme.music.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.music.d.a;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import java.util.Map;
import okhttp3.RequestBody;

public final class MusicApi {

    /* renamed from: a  reason: collision with root package name */
    public static final MusicService f111094a = ((MusicService) RetrofitFactory.a().b(a.f111394a).d().a(MusicService.class));

    /* renamed from: b  reason: collision with root package name */
    private static final String f111095b = (a.f111394a + "/aweme/v1/upload/file/");

    public interface MusicService {
        static {
            Covode.recordClassIndex(71290);
        }

        @h(a = "/aweme/v1/commerce/music/collection/")
        q<MusicCollection> fetchCommerceMusicCollection(@z(a = "cursor") long j2, @z(a = "count") int i2);

        @h(a = "/aweme/v1/commerce/music/pick/")
        q<MusicList> fetchCommerceMusicHotList(@z(a = "radio_cursor") long j2);

        @h(a = "/aweme/v1/commerce/music/list")
        q<MusicList> fetchCommerceMusicList(@z(a = "mc_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2);

        @h(a = "/aweme/v1/commerce/music/beats/songs/")
        q<com.ss.android.ugc.aweme.shortvideo.model.MusicList> fetchCommerceStickPointMusicList(@z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "video_count") int i4, @z(a = "video_duration") String str);

        @h(a = "/aweme/v1/music/collection/")
        q<MusicCollection> fetchMusicCollection(@z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "sound_page_scene") int i3);

        @h(a = "/aweme/v1/music/pick/")
        q<MusicList> fetchMusicHotList(@z(a = "radio_cursor") long j2, @z(a = "sound_page_scene") int i2);

        @h(a = "/aweme/v1/music/list/")
        q<MusicList> fetchMusicList(@z(a = "mc_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "sound_page_scene") int i3);

        @h(a = "/aweme/v1/music/beats/songs/")
        q<com.ss.android.ugc.aweme.shortvideo.model.MusicList> fetchStickPointMusicList(@z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "video_count") int i4, @z(a = "video_duration") String str);

        @h(a = "/aweme/v1/user/music/collect/")
        q<CollectedMusicList> fetchUserCollectedMusicList(@z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "scene") String str, @z(a = "sound_page_scene") int i4);

        @h(a = "/aweme/v1/music/detail/")
        q<SimpleMusicDetail> queryMusic(@z(a = "music_id") String str, @z(a = "click_reason") int i2);

        @t(a = "/aweme/v1/upload/file/")
        i<String> uploadLocalMusic(@b RequestBody requestBody);

        @t(a = "/aweme/v1/music/user/create/")
        @g
        com.bytedance.retrofit2.b<String> uploadLocalMusicInfo(@f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(71289);
    }

    public static SimpleMusicDetail a(String str, int i2) {
        MusicService musicService = f111094a;
        if (str != null) {
            str = str.trim();
        }
        return musicService.queryMusic(str, 0).get();
    }
}
