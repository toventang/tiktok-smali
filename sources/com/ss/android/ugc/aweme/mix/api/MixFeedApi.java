package com.ss.android.ugc.aweme.mix.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.mix.api.response.PlaylistTimeGapInterceptor;
import com.ss.android.ugc.aweme.mix.api.response.c;
import com.ss.android.ugc.aweme.mix.api.response.d;
import com.ss.android.ugc.aweme.mix.api.response.e;
import f.a.ab;
import f.a.t;
import h.f.b.l;

public interface MixFeedApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109790a = a.f109791a;

    static {
        Covode.recordClassIndex(70301);
    }

    @h(a = "/tiktok/v1/mix/check/")
    t<com.ss.android.ugc.aweme.mix.api.response.a> checkPlaylistName(@z(a = "check_type") int i2, @z(a = "name") String str);

    @h(a = "/tiktok/v1/mix/candidate/")
    ab<c> getMixCandidateFeeds(@z(a = "cursor") long j2);

    @h(a = "/tiktok/v1/mix/detail/")
    ab<d> getMixDetail(@z(a = "uid") String str, @z(a = "sec_uid") String str2, @z(a = "mix_id") String str3);

    @h(a = "/tiktok/v1/mix/videos/")
    ab<e> getMixVideos(@z(a = "mix_id") String str, @z(a = "item_id") String str2, @z(a = "cursor") int i2, @z(a = "pull_type") int i3);

    @h(a = "/tiktok/v1/mix/videos/")
    t<e> getMixVideos(@z(a = "mix_id") String str, @z(a = "item_id") String str2, @z(a = "cursor") long j2, @z(a = "pull_type") int i2, @z(a = "uid") String str3, @z(a = "sec_uid") String str4);

    @h(a = "/tiktok/v1/mix/videos/")
    t<e> getMixVideos2(@z(a = "mix_id") String str, @z(a = "item_id") String str2, @z(a = "cursor") long j2, @z(a = "pull_type") int i2, @z(a = "uid") String str3, @z(a = "sec_uid") String str4);

    @h(a = "/tiktok/v1/mix/list/")
    ab<com.ss.android.ugc.aweme.mix.model.a> getUserMixList(@z(a = "uid") String str, @z(a = "cursor") long j2, @z(a = "sec_uid") String str2);

    @com.bytedance.retrofit2.b.t(a = "/tiktok/v1/mix/manage/")
    @g
    ab<com.ss.android.ugc.aweme.mix.api.response.b> manageMixFeed(@com.bytedance.retrofit2.b.e(a = "operation") int i2, @com.bytedance.retrofit2.b.e(a = "mix_id") String str, @com.bytedance.retrofit2.b.e(a = "item_ids") String str2, @com.bytedance.retrofit2.b.e(a = "add_ids") String str3, @com.bytedance.retrofit2.b.e(a = "remove_ids") String str4, @com.bytedance.retrofit2.b.e(a = "name") String str5);

    @h(a = "/aweme/v1/search/loadmore/")
    ab<com.ss.android.ugc.aweme.mix.model.a> searchLodeMore(@z(a = "id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "type") int i3, @z(a = "keyword") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f109791a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(70302);
        }

        public static MixFeedApi a() {
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).a((com.bytedance.retrofit2.c.a) new PlaylistTimeGapInterceptor()).d().a(MixFeedApi.class);
            l.b(a2, "");
            return (MixFeedApi) a2;
        }
    }

    public enum b {
        MIXCREATE(1),
        MIXDELETE(2),
        RENAME(3),
        VIDEOADD(10),
        VIDEOREMOVE(11),
        VIDEOCOMMITCHANGES(12);
        
        private int operation;

        public final int getOperation() {
            return this.operation;
        }

        static {
            Covode.recordClassIndex(70303);
        }

        public final void setOperation(int i2) {
            this.operation = i2;
        }

        private b(int i2) {
            this.operation = i2;
        }
    }
}
