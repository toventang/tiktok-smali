package com.ss.android.ugc.aweme.notification.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.aa;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import f.a.t;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;
import l.b.e;
import l.b.f;
import l.b.o;

public final class NotificationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final NotificationApi f113219a = new NotificationApi();

    /* renamed from: b  reason: collision with root package name */
    private static final h f113220b = i.a((h.f.a.a) a.f113223a);

    public interface Api {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113221a = a.f113222a;

        static {
            Covode.recordClassIndex(72794);
        }

        @o(a = "/aweme/v1/notice/del/")
        t<BaseResponse> deleteNotice(@l.b.t(a = "notice_id") String str);

        @f(a = "/aweme/janus/v1/notice/multi/")
        t<NoticeCombineResponse> fetchCombineNotice(@l.b.t(a = "live_entrance") int i2, @l.b.t(a = "req_from") String str, @l.b.t(a = "is_draw") long j2, @l.b.t(a = "content_type") int i3, @l.b.t(a = "channel_id") int i4, @l.b.t(a = "count") int i5, @aa Map<String, String> map);

        @f(a = "/aweme/v1/notice/multi/")
        t<NoticeListsResponse> fetchGroupNotice(@l.b.t(a = "group_list") String str);

        @f(a = "/aweme/janus/v1/notice/multi/feed/")
        t<LiveNoticeMessageResponse> fetchLiveNotice(@l.b.t(a = "req_from") String str, @l.b.t(a = "is_draw") long j2, @l.b.t(a = "content_type") int i2, @l.b.t(a = "channel_id") int i3);

        @f(a = "aweme/v1/report/inbox/notice/")
        t<NoticeListsResponse> fetchReportInboxNotice();

        @f(a = "/pigeon/api/client/getLatestMessage/")
        t<NoticeListsResponse> fetchShopInboxNotice();

        @f(a = "/aweme/v1/promote/api/user/settings/")
        t<com.ss.android.ugc.aweme.notification.bean.o> getSubscribeMarketingStatus();

        @o(a = "/aweme/v1/promote/api/user/settings/")
        @e
        t<BaseResponse> setSubscribeMarketingStatus(@com.bytedance.retrofit2.b.e(a = "marketing_notification") int i2);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f113222a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(72795);
            }
        }
    }

    public static Api a() {
        return (Api) f113220b.getValue();
    }

    private NotificationApi() {
    }

    static final class a extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113223a = new a();

        static {
            Covode.recordClassIndex(72796);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.a().a(a.f113228e).a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(72793);
    }
}
