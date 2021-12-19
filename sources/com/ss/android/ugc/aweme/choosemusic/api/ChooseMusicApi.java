package com.ss.android.ugc.aweme.choosemusic.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.model.af;
import com.ss.android.ugc.aweme.choosemusic.model.ah;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import l.b.f;
import l.b.t;

public final class ChooseMusicApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f70375a = ((API) a.a(com.ss.android.ugc.aweme.music.d.a.f111394a, API.class));

    public interface API {
        static {
            Covode.recordClassIndex(43411);
        }

        @f(a = "/aweme/v1/music/collect/")
        i<BaseResponse> collectMusic(@t(a = "music_id") String str, @t(a = "action") int i2);

        @f(a = "/aweme/v1/commerce/music/collection/feed/")
        i<af> commerceMusicCollectionFeed(@t(a = "cursor") Integer num, @t(a = "count") Integer num2);

        @f(a = "/aweme/v1/commerce/music/list/")
        i<MusicList> commerceMusicList(@t(a = "mc_id") String str, @t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/commerce/music/pick/")
        i<ah> commerceMusicPick(@t(a = "radio_cursor") Integer num, @t(a = "extra_music_ids") String str, @t(a = "is_commerce_music") Boolean bool);

        @f(a = "/aweme/v1/commerce/music/choices/")
        i<MusicList> getCommerceMusicList();

        @f(a = "/aweme/v1/commerce/music/collection/")
        i<MusicCollection> getCommerceMusicSheet(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/hot/music/")
        i<MusicList> getHotMusicList(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "not_duplicate") boolean z, @t(a = "sound_page_scene") int i4);

        @f(a = "/aweme/v1/music/collection/")
        i<MusicCollection> getMusicSheet(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "sound_page_scene") int i4);

        @f(a = "/aweme/v1/music/recommend/by/video/")
        i<MusicList> getRecommenMusicListFromAI(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "from") String str, @t(a = "zip_uri") String str2, @t(a = "music_ailab_ab") String str3, @t(a = "creation_id") String str4, @t(a = "micro_app_id") String str5, @t(a = "video_duration") long j2);

        @f(a = "/aweme/v1/sticker/music")
        i<MusicList> getStickerMusic(@t(a = "sticker") String str);

        @f(a = "/aweme/v1/music/collection/feed/")
        i<af> musicCollectionFeed(@t(a = "cursor") Integer num, @t(a = "count") Integer num2, @t(a = "sound_page_scene") int i2);

        @f(a = "/aweme/v1/music/list/")
        i<MusicList> musicList(@t(a = "mc_id") String str, @t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "sound_page_scene") int i4);

        @f(a = "/aweme/v1/music/pick/")
        i<ah> musicPick(@t(a = "radio_cursor") Integer num, @t(a = "extra_music_ids") String str, @t(a = "is_commerce_music") Boolean bool, @t(a = "sound_page_scene") Integer num2);

        @f(a = "/aweme/v1/music/list/")
        i<MusicList> secondLevelMusicList(@t(a = "mc_id") String str, @t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "level") int i4, @t(a = "sound_page_scene") int i5);

        @f(a = "/aweme/v1/user/music/collect/")
        i<CollectedMusicList> userCollectedMusicList(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "scene") String str, @t(a = "sound_page_scene") int i4);
    }

    static {
        Covode.recordClassIndex(43410);
    }

    public static i<MusicCollection> a(int i2, int i3) {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return f70375a.getCommerceMusicSheet(i2, 20);
        }
        return f70375a.getMusicSheet(i2, 20, i3);
    }

    public static i<CollectedMusicList> a(int i2, int i3, int i4) {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return f70375a.userCollectedMusicList(i2, i3, "commerce", i4);
        }
        return f70375a.userCollectedMusicList(i2, i3, "", i4);
    }

    public static i<ah> a(Integer num, String str, boolean z, int i2) {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return f70375a.commerceMusicPick(num, str, Boolean.valueOf(z));
        }
        return f70375a.musicPick(num, str, Boolean.valueOf(z), Integer.valueOf(i2));
    }

    public static i<MusicList> b(String str, int i2, int i3, int i4, int i5) {
        return f70375a.secondLevelMusicList(str, i2, i3, i4, i5);
    }

    public static i<MusicList> a(int i2, int i3, boolean z, int i4, boolean z2) {
        if (z2) {
            return f70375a.getHotMusicList(i2, i3, z, i4);
        }
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return f70375a.getCommerceMusicList();
        }
        return f70375a.getHotMusicList(i2, i3, z, i4);
    }

    public static i<MusicList> a(String str, int i2, int i3, int i4, int i5) {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return f70375a.commerceMusicList(str, i2, i3);
        }
        if (i4 == 0) {
            return f70375a.musicList(str, i2, i3, i5);
        }
        return b(str, i2, i3, i4, i5);
    }
}
