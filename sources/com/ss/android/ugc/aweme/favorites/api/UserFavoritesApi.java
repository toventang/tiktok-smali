package com.ss.android.ugc.aweme.favorites.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.e.c;
import com.ss.android.ugc.aweme.favorites.e.d;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import l.b.f;
import l.b.o;
import l.b.t;

public final class UserFavoritesApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RetrofitApi f90439a = ((RetrofitApi) RetrofitFactory.a().a(b.f59141e).a(RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(56774);
        }

        @f(a = "/aweme/v1/aweme/collect/")
        i<BaseResponse> collectAweme(@t(a = "aweme_id") String str, @t(a = "action") int i2);

        @f(a = "/aweme/v1/challenge/collect/")
        i<BaseResponse> collectChallenge(@t(a = "ch_id") String str, @t(a = "action") int i2);

        @o(a = "/tiktok/comment/collect/v1/")
        i<BaseResponse> collectComment(@t(a = "comment_id") String str, @t(a = "action") int i2);

        @o(a = "/aweme/v1/lvideo/collect/")
        i<BaseResponse> collectLongVideo(@t(a = "album_id") String str, @t(a = "action") int i2);

        @f(a = "/aweme/v1/mix/collect/")
        i<BaseResponse> collectMix(@t(a = "mix_id") String str, @t(a = "action") int i2);

        @f(a = "/aweme/v1/music/collect/")
        i<CollectMusicResponse> collectMusic(@t(a = "music_id") String str, @t(a = "action") int i2);

        @o(a = "/tiktok/v1/forum/question/collect/")
        i<BaseResponse> collectQuestion(@t(a = "question_id") long j2, @t(a = "action") int i2);

        @f(a = "/aweme/v2/shop/seeding/collect/")
        i<BaseResponse> collectSeeding(@t(a = "seed_id") String str, @t(a = "operate_type") int i2);

        @f(a = "/aweme/v1/aweme/listcollection/")
        i<BaseResponse> fetchCollectAwemeList(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/challenge/listcollection/")
        i<com.ss.android.ugc.aweme.favorites.e.b> fetchCollectChallengeList(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/tiktok/comment/listcollection/v1/")
        i<c> fetchCollectCommentList(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/music/listcollection/")
        i<BaseResponse> fetchCollectMusicList(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/tiktok/v1/forum/question/listcollection/")
        i<d> fetchCollectQuestionList(@t(a = "cursor") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/sticker/listcollection/")
        i<com.ss.android.ugc.aweme.favorites.b.b> fetchStickerList(@t(a = "cursor") int i2, @t(a = "count") int i3);
    }

    static {
        Covode.recordClassIndex(56773);
    }

    public static com.ss.android.ugc.aweme.favorites.e.b a(int i2, int i3) {
        i<com.ss.android.ugc.aweme.favorites.e.b> fetchCollectChallengeList = f90439a.fetchCollectChallengeList(i2, i3);
        try {
            fetchCollectChallengeList.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (fetchCollectChallengeList.c()) {
            try {
                throw fetchCollectChallengeList.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return fetchCollectChallengeList.d();
    }

    public static c b(int i2, int i3) {
        i<c> fetchCollectCommentList = f90439a.fetchCollectCommentList(i2, i3);
        try {
            fetchCollectCommentList.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (fetchCollectCommentList.c()) {
            try {
                throw fetchCollectCommentList.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return fetchCollectCommentList.d();
    }

    public static d c(int i2, int i3) {
        i<d> fetchCollectQuestionList = f90439a.fetchCollectQuestionList(i2, i3);
        try {
            fetchCollectQuestionList.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (fetchCollectQuestionList.c()) {
            try {
                throw fetchCollectQuestionList.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return fetchCollectQuestionList.d();
    }

    public static com.ss.android.ugc.aweme.favorites.b.b d(int i2, int i3) {
        i<com.ss.android.ugc.aweme.favorites.b.b> fetchStickerList = f90439a.fetchStickerList(i2, i3);
        try {
            fetchStickerList.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (fetchStickerList.c()) {
            try {
                throw fetchStickerList.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return fetchStickerList.d();
    }
}
