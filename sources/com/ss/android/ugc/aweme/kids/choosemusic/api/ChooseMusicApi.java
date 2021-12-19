package com.ss.android.ugc.aweme.kids.choosemusic.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.a.b.a;
import com.ss.android.ugc.aweme.kids.a.e.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import com.ss.android.ugc.aweme.kids.choosemusic.e.p;
import com.ss.android.ugc.aweme.kids.choosemusic.e.r;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.t;

public final class ChooseMusicApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f105495a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(a.f105255a).create(API.class));

    public interface API {
        static {
            Covode.recordClassIndex(67595);
        }

        @f(a = "/tiktok/v1/kids/music/collect/")
        i<BaseResponse> collectMusic(@t(a = "music_id") String str, @t(a = "action") int i2);

        @f(a = "/tiktok/v1/kids/hot/music/")
        i<e> getHotMusicList(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "not_duplicate") boolean z);

        @f(a = "/tiktok/v1/kids/music/collection/")
        i<b> getMusicSheet(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/music/recommend/by/video/")
        i<e> getRecommenMusicListFromAI(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "from") String str, @t(a = "zip_uri") String str2, @t(a = "music_ailab_ab") String str3, @t(a = "creation_id") String str4, @t(a = "micro_app_id") String str5, @t(a = "video_duration") long j2);

        @f(a = "/aweme/v1/sticker/music")
        i<e> getStickerMusic(@t(a = "sticker") String str);

        @f(a = "/tiktok/v1/kids/music/collection/feed/")
        i<p> musicCollectionFeed(@t(a = "cursor") Integer num, @t(a = "count") Integer num2);

        @f(a = "/tiktok/v1/kids/music/list/")
        i<e> musicList(@t(a = "mc_id") String str, @t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/tiktok/v1/kids/music/pick/")
        i<r> musicPick(@t(a = "radio_cursor") Integer num, @t(a = "extra_music_ids") String str, @t(a = "is_commerce_music") Boolean bool);

        @f(a = "/aweme/v1/music/detail/")
        q<com.ss.android.ugc.aweme.kids.a.e.f> queryMusic(@t(a = "music_id") String str, @t(a = "click_reason") int i2);

        @f(a = "/tiktok/v1/kids/music/list/")
        i<e> secondLevelMusicList(@t(a = "mc_id") String str, @t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "level") int i4);

        @f(a = "/tiktok/v1/kids/user/music/collect/")
        i<CollectedMusicList> userCollectedMusicList(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "scene") String str);
    }

    static {
        Covode.recordClassIndex(67594);
    }

    public static i<CollectedMusicList> a(int i2) {
        return f105495a.userCollectedMusicList(i2, 20, "");
    }

    public static i<b> b(int i2) {
        return f105495a.getMusicSheet(i2, 20);
    }

    public static com.ss.android.ugc.aweme.kids.a.e.f a(String str) {
        API api = f105495a;
        if (str != null) {
            str = str.trim();
        }
        return api.queryMusic(str, 0).get();
    }

    public static i<r> a(Integer num, String str) {
        return f105495a.musicPick(num, str, false);
    }

    public static i<e> b(String str, int i2, int i3, int i4) {
        return f105495a.secondLevelMusicList(str, i2, i3, i4);
    }

    public static i<e> a(String str, int i2, int i3, int i4) {
        if (i4 == 0) {
            return f105495a.musicList(str, i2, i3);
        }
        return b(str, i2, i3, i4);
    }
}
