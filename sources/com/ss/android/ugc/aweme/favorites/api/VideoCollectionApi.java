package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface VideoCollectionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90440a = a.f90441a;

    static {
        Covode.recordClassIndex(56775);
    }

    @f(a = "/aweme/v1/aweme/listcollection/")
    t<a> allFavoritesContent(@l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2);

    @f(a = "/tiktok/collection/item_archive/overall/detail/v1")
    t<b> allFavoritesDetail(@l.b.t(a = "scene") int i2);

    @f(a = "/tiktok/collection/item_archive/item/candidate/list/v1")
    t<c> candidateContent(@l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "pull_type") int i3);

    @f(a = "/tiktok/collection/item_archive/item/list/v1")
    t<c> collectionContent(@l.b.t(a = "item_archive_id") String str, @l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "pull_type") int i3);

    @f(a = "/tiktok/collection/item_archive/detail/v1")
    t<Object> collectionDetail(@l.b.t(a = "item_archive_id") String str);

    @f(a = "/tiktok/collection/item_archive/list/v1")
    t<e> collectionDetailList(@l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "exclude_id") String str);

    @o(a = "/tiktok/collection/item_archive/manage/v1")
    @e
    t<g> collectionManage(@c(a = "operation") int i2, @c(a = "item_archive_id") String str, @c(a = "item_archive_name") String str2, @c(a = "item_archive_id_from") String str3, @c(a = "item_archive_id_to") String str4, @c(a = "add_ids") String str5, @c(a = "remove_ids") String str6, @c(a = "move_ids") String str7);

    @o(a = "/tiktok/collection/item_archive/manage/v1")
    t<g> collectionManage(@l.b.a f fVar);

    @f(a = "/tiktok/collection/item_archive/check/v1")
    t<h> collectionNameCheck(@l.b.t(a = "check_type") int i2, @l.b.t(a = "name") String str);

    @f(a = "/tiktok/collection/item_archive/item/list/v1")
    b<c> syncCollectionContent(@l.b.t(a = "item_archive_id") String str, @l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2, @l.b.t(a = "pull_type") int i3);

    @f(a = "/aweme/v1/aweme/collect/")
    t<BaseResponse> unFavorites(@l.b.t(a = "aweme_id") String str, @l.b.t(a = "action") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f90441a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(56776);
        }

        public static VideoCollectionApi a() {
            Object a2 = RetrofitFactory.a().a(Api.f66569d).a(VideoCollectionApi.class);
            l.b(a2, "");
            return (VideoCollectionApi) a2;
        }
    }
}
