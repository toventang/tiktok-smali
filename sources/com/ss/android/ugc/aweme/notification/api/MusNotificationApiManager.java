package com.ss.android.ugc.aweme.notification.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b.aa;
import com.google.c.h.a.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.g;
import com.ss.android.ugc.aweme.notice.repo.list.bean.h;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.ej;
import f.a.ab;
import f.a.ae;
import f.a.b;
import f.a.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class MusNotificationApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static NoticeApi f113215a;

    /* renamed from: b  reason: collision with root package name */
    private static NoticeWebcastApi f113216b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f113217c;

    public interface NoticeApi {
        static {
            Covode.recordClassIndex(72789);
        }

        @o(a = "/aweme/v1/notice/del/")
        i<BaseResponse> deleteNotice(@t(a = "notice_id") String str);

        @f(a = "/aweme/janus/v1/notice/multi/")
        q<NoticeCombineResponse> fetchCombineNotice(@t(a = "live_entrance") int i2, @t(a = "req_from") String str, @t(a = "is_draw") long j2, @t(a = "content_type") int i3, @t(a = "channel_id") int i4, @t(a = "count") int i5, @aa Map<String, String> map);

        @f(a = "/aweme/v1/notice/multi/")
        q<NoticeListsResponse> fetchGroupNotice(@t(a = "group_list") String str);

        @f(a = "/aweme/janus/v1/notice/multi/feed/")
        i<LiveNoticeMessageResponse> fetchLiveNotice(@t(a = "req_from") String str, @t(a = "is_draw") long j2, @t(a = "content_type") int i2, @t(a = "channel_id") int i3);

        @f(a = "aweme/v1/report/inbox/notice/")
        q<NoticeListsResponse> fetchReportInboxNotice();

        @f(a = "/pigeon/api/client/getLatestMessage/")
        q<NoticeListsResponse> fetchShopInboxNotice();

        @o(a = "/tiktok/v1/sharer/link/notice/ignore/")
        b ignoreLinkNotice(@t(a = "link_id") String str);

        @o(a = "/tiktok/notice/report/v1/")
        @e
        f.a.t<BaseResponse> reportNoticeAction(@c(a = "nid") long j2, @c(a = "user_action") int i2, @c(a = "action_meta") String str);

        @f(a = "/tiktok/user/relation/recommended_notice/update/v1")
        f.a.t<BaseResponse> reportNoticeBoot();
    }

    interface NoticeWebcastApi {
        static {
            Covode.recordClassIndex(72790);
        }

        @f(a = "/webcast/tab/")
        i<Object> fetchRecommendAvatars(@t(a = "live_entrance") int i2, @aa Map<String, String> map);
    }

    static {
        String str;
        Covode.recordClassIndex(72786);
        String str2 = a.f113228e;
        f113217c = str2;
        f113215a = (NoticeApi) a.a(str2 + "/", NoticeApi.class);
        if (d.c()) {
            str = "https://webcast.tiktokv.com";
        } else {
            str = "https://webcast-va.tiktokv.com";
        }
        f113216b = (NoticeWebcastApi) a.a(str, NoticeWebcastApi.class);
    }

    public static void a() {
        ab.a((x) f113215a.reportNoticeBoot()).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(new ae<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(72788);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
    }

    public static i<BaseResponse> a(String str) {
        return f113215a.deleteNotice(str);
    }

    public static q<NoticeCombineResponse> a(boolean z) {
        return f113215a.fetchCombineNotice(5, "tiktok_message", 0, 3, 81, !z ? 1 : 0, com.bytedance.android.livesdkapi.m.a.a(com.bytedance.ies.ugc.appcontext.d.a()));
    }

    public static NoticeListsResponse a(List<g> list) {
        try {
            return f113215a.fetchGroupNotice(dg.a().b(list)).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    private static void a(int i2) {
        n.a("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/report/inbox/notice/").a("status", Integer.valueOf(i2)).a());
    }

    public static NoticeListsResponse a(List<g> list, androidx.lifecycle.t<NoticeCombineDatas> tVar) {
        try {
            q<NoticeListsResponse> fetchGroupNotice = f113215a.fetchGroupNotice(dg.a().b(list));
            ArrayList arrayList = new ArrayList();
            try {
                NoticeCombineResponse noticeCombineResponse = a(true).get();
                if (noticeCombineResponse != null) {
                    tVar.postValue(noticeCombineResponse.getData());
                    if (noticeCombineResponse.getData() != null) {
                        if (noticeCombineResponse.getData().getShopNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getShopNotice());
                        }
                        if (com.ss.android.ugc.aweme.notification.ab.f.a() && noticeCombineResponse.getData().getReportNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getReportNotice());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            NoticeListsResponse noticeListsResponse = fetchGroupNotice.get();
            if (!ej.a(arrayList) && noticeListsResponse != null) {
                noticeListsResponse.setCollapseNotices(arrayList);
            }
            return noticeListsResponse;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static NoticeListsResponse a(List<g> list, int i2) {
        NoticeListsResponse noticeListsResponse;
        q<NoticeListsResponse> qVar;
        try {
            q<NoticeListsResponse> fetchGroupNotice = f113215a.fetchGroupNotice(dg.a().b(list));
            List<NoticeItems> list2 = null;
            if (i2 == 37) {
                try {
                    qVar = f113215a.fetchReportInboxNotice();
                } catch (Exception unused) {
                    if (i2 == 37) {
                        a(1);
                    }
                }
            } else {
                if (i2 == 599) {
                    qVar = f113215a.fetchShopInboxNotice();
                }
                noticeListsResponse = fetchGroupNotice.get();
                if (!ej.a(list2) && noticeListsResponse != null) {
                    noticeListsResponse.setCollapseNotices(list2);
                }
                return noticeListsResponse;
            }
            if (qVar != null) {
                NoticeListsResponse noticeListsResponse2 = qVar.get();
                if (i2 == 37) {
                    if (noticeListsResponse2.status_code == 0) {
                        a(0);
                    } else {
                        n.a("tns_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/report/inbox/notice/").a("status", (Integer) 1).a("error_message", String.valueOf(noticeListsResponse2.status_code)).a("tns_logId", noticeListsResponse2.getLobPb().getImprId()).a());
                    }
                }
                list2 = noticeListsResponse2.getNotices();
            }
            noticeListsResponse = fetchGroupNotice.get();
            noticeListsResponse.setCollapseNotices(list2);
            return noticeListsResponse;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static void a(long j2, h hVar, String str) {
        ab.a((x) f113215a.reportNoticeAction(j2, hVar.getValue(), str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(new ae<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72787);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
    }
}
