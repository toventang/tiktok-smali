package com.ss.android.ugc.aweme.inbox.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.aa;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import f.a.t;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;
import l.b.f;

public final class MultiApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static final MultiApiManager f104043a = new MultiApiManager();

    /* renamed from: b  reason: collision with root package name */
    private static final h f104044b = i.a((h.f.a.a) a.f104045a);

    public interface API {
        static {
            Covode.recordClassIndex(66632);
        }

        @f(a = "/aweme/janus/v1/notice/multi/")
        t<NoticeCombineResponse> fetchCombineNotice(@l.b.t(a = "live_entrance") int i2, @l.b.t(a = "req_from") String str, @l.b.t(a = "is_draw") long j2, @l.b.t(a = "content_type") int i3, @l.b.t(a = "channel_id") int i4, @l.b.t(a = "count") int i5, @aa Map<String, String> map);

        @f(a = "/tiktok/notice/follow_page/v1/")
        t<FollowPageResponse> fetchFollowPageData(@l.b.t(a = "need_follow_request") boolean z, @l.b.t(a = "is_mark_read") int i2, @l.b.t(a = "count") int i3, @l.b.t(a = "notice_max_time") long j2, @l.b.t(a = "notice_min_time") long j3, @l.b.t(a = "follow_req_offset") long j4);

        @f(a = "/aweme/v1/notice/multi/")
        t<NoticeListsResponse> fetchGroupNotice(@l.b.t(a = "group_list") String str);
    }

    public static API a() {
        return (API) f104044b.getValue();
    }

    private MultiApiManager() {
    }

    static final class a extends m implements h.f.a.a<API> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104045a = new a();

        static {
            Covode.recordClassIndex(66633);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ API invoke() {
            return RetrofitFactory.a().a(a.f104046a).a(API.class);
        }
    }

    static {
        Covode.recordClassIndex(66631);
    }
}
