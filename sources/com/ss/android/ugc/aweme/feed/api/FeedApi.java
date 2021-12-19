package com.ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import beancopy.ConvertHelp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.y;
import com.bytedance.retrofit2.c.a;
import com.google.c.h.a.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.c.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.api.c.c;
import com.ss.android.ugc.aweme.app.v;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.cu;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.ah;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.cache.j;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.interceptor.AwemeSplashParamsCronetInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.EnsureMainActivityCronetInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.EnsureTTTokenCronetInterceptor;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import l.b.f;
import l.b.i;
import l.b.t;
import org.json.JSONException;
import org.json.JSONObject;

public final class FeedApi {

    /* renamed from: a  reason: collision with root package name */
    private static final String f91923a = ("pb_convert_flag" + d.h());

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f91924b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static volatile i f91925c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile i f91926d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f91927e = new Object();

    /* access modifiers changed from: package-private */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(57870);
        }

        @f(a = "/aweme/v1/follow/feed/")
        @y(a = 2)
        q<FeedItemList> fetchFollowFeed(@t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i2, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i3, @t(a = "req_from") String str2, @t(a = "gaid") String str3, @t(a = "aweme_ids") String str4, @t(a = "push_params") String str5, @t(a = "ad_user_agent") String str6, @t(a = "filter_warn") int i4, @t(a = "ad_personality_mode") Integer num2, @t(a = "address_book_access") Integer num3, @t(a = "top_view_cid") String str7, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str8, @t(a = "interest_list") String str9, @com.bytedance.retrofit2.b.d Object obj, @t(a = "sound_output_device") Integer num4, @t(a = "cmpl_enc") String str10, @t(a = "user_avatar_shrink") String str11);

        @f(a = "/aweme/v1/follow/feed/")
        @y(a = 3)
        q<FeedItemList> fetchFollowFeedImmediate(@t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i2, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i3, @t(a = "req_from") String str2, @t(a = "gaid") String str3, @t(a = "aweme_ids") String str4, @t(a = "push_params") String str5, @t(a = "ad_user_agent") String str6, @t(a = "filter_warn") int i4, @t(a = "bid_ad_params") String str7, @t(a = "ad_personality_mode") Integer num2, @t(a = "address_book_access") Integer num3, @t(a = "top_view_cid") String str8, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str9, @t(a = "interest_list") String str10, @com.bytedance.retrofit2.b.d Object obj, @t(a = "sound_output_device") Integer num4, @t(a = "cmpl_enc") String str11, @t(a = "user_avatar_shrink") String str12);

        @f(a = "/aweme/v1/nearby/feed/")
        q<FeedItemList> fetchNearbyFeed(@t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i2, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "poi_class_code") int i3, @t(a = "filter_warn") int i4, @t(a = "user_avatar_shrink") String str2, @t(a = "video_cover_shrink") String str3);

        @f(a = "/aweme/v1/feed/")
        @y(a = 2)
        q<FeedItemList> fetchRecommendFeed(@t(a = "sp") int i2, @t(a = "type") int i3, @t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i4, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i5, @t(a = "req_from") String str2, @t(a = "gaid") String str3, @t(a = "aweme_ids") String str4, @t(a = "push_params") String str5, @t(a = "ad_user_agent") String str6, @t(a = "filter_warn") int i6, @t(a = "ad_personality_mode") Integer num2, @t(a = "address_book_access") Integer num3, @t(a = "top_view_cid") String str7, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str8, @t(a = "interest_list") String str9, @com.bytedance.retrofit2.b.d Object obj, @t(a = "cached_item_num") Integer num4, @t(a = "last_ad_show_interval") Long l3, @t(a = "real_time_actions") String str10, @t(a = "vpa_content_choice") Integer num5, @t(a = "sound_output_device") Integer num6, @t(a = "cmpl_enc") String str11, @t(a = "user_avatar_shrink") String str12, @t(a = "disable_personalization") boolean z);

        @f(a = "/aweme/v1/feed/")
        @y(a = 3)
        q<FeedItemList> fetchRecommendFeedImmediate(@t(a = "sp") int i2, @t(a = "type") int i3, @t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i4, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i5, @t(a = "req_from") String str2, @t(a = "gaid") String str3, @t(a = "aweme_ids") String str4, @t(a = "push_params") String str5, @t(a = "ad_user_agent") String str6, @t(a = "filter_warn") int i6, @t(a = "bid_ad_params") String str7, @t(a = "ad_personality_mode") Integer num2, @t(a = "address_book_access") Integer num3, @t(a = "top_view_cid") String str8, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str9, @t(a = "preload_aweme_ids") String str10, @t(a = "interest_list") String str11, @com.bytedance.retrofit2.b.d Object obj, @t(a = "cached_item_num") Integer num4, @t(a = "last_ad_show_interval") Long l3, @t(a = "real_time_actions") String str12, @t(a = "vpa_content_choice") Integer num5, @t(a = "sound_output_device") Integer num6, @t(a = "cmpl_enc") String str13, @t(a = "user_avatar_shrink") String str14);

        @f(a = "/aweme/v2/feed/")
        @y(a = 2)
        q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@t(a = "sp") int i2, @t(a = "type") int i3, @t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i4, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i5, @t(a = "req_from") String str2, @t(a = "aweme_ids") String str3, @t(a = "push_params") String str4, @t(a = "filter_warn") int i6, @t(a = "top_view_cid") String str5, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str6, @t(a = "interest_list") String str7, @com.bytedance.retrofit2.b.d Object obj, @t(a = "cached_item_num") Integer num2, @t(a = "real_time_actions") String str8, @t(a = "vpa_content_choice") Integer num3, @t(a = "cmpl_enc") String str9, @t(a = "user_avatar_shrink") String str10, @t(a = "is_audio_mode") String str11, @t(a = "disable_personalization") boolean z, @t(a = "showtime_gap_req_info") String str12, @t(a = "client_cache_request_count") int i7);

        @f(a = "/aweme/v2/feed/")
        @y(a = 2)
        q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@t(a = "sp") int i2, @t(a = "type") int i3, @t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i4, @t(a = "feed_style") Integer num, @t(a = "aweme_id") String str, @t(a = "volume") double d2, @t(a = "pull_type") int i5, @t(a = "req_from") String str2, @t(a = "gaid") String str3, @t(a = "aweme_ids") String str4, @t(a = "push_params") String str5, @t(a = "ad_user_agent") String str6, @t(a = "filter_warn") int i6, @t(a = "ad_personality_mode") Integer num2, @t(a = "address_book_access") Integer num3, @t(a = "top_view_cid") String str7, @t(a = "top_view_aid") Long l2, @t(a = "local_cache") String str8, @t(a = "interest_list") String str9, @com.bytedance.retrofit2.b.d Object obj, @t(a = "cached_item_num") Integer num4, @t(a = "last_ad_show_interval") Long l3, @t(a = "real_time_actions") String str10, @t(a = "vpa_content_choice") Integer num5, @t(a = "sound_output_device") Integer num6, @t(a = "cmpl_enc") String str11, @t(a = "user_avatar_shrink") String str12, @t(a = "is_audio_mode") String str13, @t(a = "disable_personalization") boolean z, @t(a = "showtime_gap_req_info") String str14, @t(a = "client_cache_request_count") int i7, @com.bytedance.retrofit2.b.d Object obj2, @i(a = "Cookie") String str15);

        @f(a = "/aweme/v1/roaming/feed/")
        q<FeedItemList> fetchRoamingFeed(@t(a = "count") int i2, @t(a = "roaming_code") String str);

        @f(a = "/aweme/v1/fresh/feed/")
        q<FeedTimeLineItemList> fetchTimelineFeed(@t(a = "type") int i2, @t(a = "max_time") long j2, @t(a = "min_time") long j3, @t(a = "count") int i3, @t(a = "aweme_id") String str, @t(a = "aweme_ids") String str2, @t(a = "push_params") String str3, @t(a = "filter_warn") int i4);
    }

    private static com.bytedance.ttnet.d.d c() {
        com.bytedance.ttnet.d.d dVar = new com.bytedance.ttnet.d.d();
        dVar.q = true;
        return dVar;
    }

    static {
        Covode.recordClassIndex(57868);
    }

    private static i a() {
        MethodCollector.i(8042);
        if (f91925c == null) {
            synchronized (f91927e) {
                try {
                    if (f91925c == null) {
                        List<a> a2 = f.a();
                        if (cx.a()) {
                            a2.add(new EnsureMainActivityCronetInterceptor());
                            a2.add(new AwemeSplashParamsCronetInterceptor());
                            a2.add(new EnsureTTTokenCronetInterceptor());
                        }
                        f91925c = new i((RetrofitApi) com.bytedance.ies.ugc.aweme.network.ext.a.b(b.f59141e).a(a2).a((com.ss.android.ugc.aweme.app.api.c.d) new com.ss.android.ugc.aweme.app.api.c.d() {
                            /* class com.ss.android.ugc.aweme.feed.api.FeedApi.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57869);
                            }

                            @Override // com.ss.android.ugc.aweme.app.api.c.d
                            public final void a(String str) {
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject.put("error_code", 0);
                                    jSONObject.put("error_desc", str);
                                    jSONObject.put(StringSet.type, "error");
                                    jSONObject2.put(StringSet.type, "error");
                                } catch (Exception e2) {
                                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                                }
                                com.bytedance.apm.b.a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                            }

                            @Override // com.ss.android.ugc.aweme.app.api.c.d
                            public final void a(long j2, Object obj, Object obj2, boolean z) {
                                FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
                                if (z) {
                                    if (obj instanceof FeedItemList) {
                                        com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = (FeedItemList) obj;
                                    } else {
                                        return;
                                    }
                                } else if (obj2 instanceof aweme_v2_feed_response) {
                                    com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelp.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList((aweme_v2_feed_response) obj2, null);
                                } else {
                                    return;
                                }
                                if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject.put("duration", j2);
                                        jSONObject.put("logid", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.logPb.getImprId());
                                        jSONObject.put("content_type", "json");
                                        if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code != 0 || com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() == 0) {
                                            if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() == 0) {
                                                jSONObject.put("count", 0);
                                                jSONObject.put(StringSet.type, "server_empty");
                                                jSONObject2.put(StringSet.type, "server_empty");
                                            } else {
                                                jSONObject.put("error_code", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code);
                                                jSONObject.put("error_desc", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_msg);
                                                jSONObject.put(StringSet.type, "error");
                                                jSONObject2.put(StringSet.type, "error");
                                            }
                                            if (cx.a() && cx.f89739d) {
                                                a.b.f109011a.a("feed_preload_parsing_end", false);
                                                a.b.f109011a.b("feed_preload_parsing_end", false);
                                            }
                                            com.bytedance.apm.b.a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                                        }
                                        jSONObject.put("count", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size());
                                        jSONObject.put(StringSet.type, "normal");
                                        jSONObject2.put(StringSet.type, "normal");
                                        a.b.f109011a.a("feed_preload_parsing_end", false);
                                        a.b.f109011a.b("feed_preload_parsing_end", false);
                                        com.bytedance.apm.b.a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                                    } catch (Exception e2) {
                                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                                    }
                                }
                            }
                        }).d().a(RetrofitApi.class));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8042);
                    throw th;
                }
            }
        }
        i iVar = f91925c;
        MethodCollector.o(8042);
        return iVar;
    }

    private static i b() {
        MethodCollector.i(8050);
        if (f91926d == null) {
            synchronized (f91927e) {
                try {
                    if (f91926d == null) {
                        f91926d = new i((RetrofitApi) RetrofitFactory.a().b(b.f59141e).a(f.a()).b().d().a(RetrofitApi.class));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8050);
                    throw th;
                }
            }
        }
        i iVar = f91926d;
        MethodCollector.o(8050);
        return iVar;
    }

    private static i a(boolean z) {
        if (z) {
            return b();
        }
        return a();
    }

    private static String a(j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.a();
    }

    private static FeedItemList a(o oVar) {
        FeedItemList feedItemList;
        cu.f89727a = true;
        try {
            feedItemList = a(oVar, true);
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            feedItemList = null;
        }
        if ((feedItemList == null || d.a.g.a.a(feedItemList.getItems())) && (feedItemList = a(oVar, false)) != null) {
            g.a().execute(b.f91939a);
        }
        return feedItemList;
    }

    private static void a(FeedItemList feedItemList) {
        List<Aweme> items;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null || items.size() <= 1)) {
            FeedItemList feedItemList2 = new FeedItemList();
            feedItemList2.setRequestId(feedItemList.getRequestId());
            ArrayList arrayList = new ArrayList();
            for (int size = items.size() - 1; size >= 0; size--) {
                Aweme aweme = items.get(size);
                if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && aweme.isClientCache()) {
                    arrayList.add(aweme);
                    items.remove(size);
                    arrayList.size();
                    items.size();
                    aweme.getAid();
                }
            }
            if (arrayList.size() > 0) {
                feedItemList2.items = arrayList;
                l.d(feedItemList2, "");
                e.f92690b = feedItemList2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.ss.android.ugc.aweme.feed.model.FeedItemList a(com.ss.android.ugc.aweme.feed.api.o r51, boolean r52) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedApi.a(com.ss.android.ugc.aweme.feed.api.o, boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static FeedItemList a(int i2, long j2, long j3, int i3, Integer num, String str, int i4, int i5, String str2, String str3, String str4, j jVar, Boolean bool) {
        FeedItemList feedItemList;
        ISplashAdService h2;
        boolean z;
        String str5;
        e.f91943b = AppLog.getServerDeviceId();
        int[] a2 = em.a(101);
        boolean z2 = true;
        String str6 = a2 == null ? "" : a2[0] + "_" + a2[1];
        int[] a3 = em.a(201);
        String str7 = a3 == null ? "" : a3[0] + "_" + a3[1];
        if (i2 == 2) {
            try {
                feedItemList = a().fetchTimelineFeed(i2, j2, j3, i3, str, str3, str4, com.ss.android.ugc.aweme.compliance.api.a.o().b()).get();
            } catch (ExecutionException e2) {
                throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            }
        } else if (i2 == 7) {
            try {
                feedItemList = a().fetchNearbyFeed(j2, j3, i3, num, str, i5, com.ss.android.ugc.aweme.compliance.api.a.o().b(), str6, str7).get();
            } catch (ExecutionException e3) {
                throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e3);
            }
        } else if (i2 == 12) {
            try {
                feedItemList = a().fetchRoamingFeed(i3, str2).get();
            } catch (ExecutionException e4) {
                throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e4);
            }
        } else if (i2 != 0) {
            try {
                FeedItemList feedItemList2 = a().fetchRecommendFeed(com.ss.android.ugc.h.g.f(), i2, j2, j3, i3, num, str, com.ss.android.ugc.aweme.m.a.a(2), i4, "", "", str3, str4, "", com.ss.android.ugc.aweme.compliance.api.a.o().b(), Integer.valueOf(com.ss.android.ugc.aweme.compliance.api.a.g().b()), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.d.a()), null, null, null, null, new com.bytedance.ttnet.d.d(), null, null, null, Integer.valueOf(com.ss.android.ugc.aweme.compliance.api.a.e().c()), ah.a(d.a()), com.ss.android.ugc.aweme.compliance.api.a.d().f(), str6, NonPersonalizationService.c().a()).get();
                if (feedItemList2 != null) {
                    ac.a.f91473a.a(feedItemList2.getRequestId(), feedItemList2.logPb);
                }
                return feedItemList2;
            } catch (ExecutionException e5) {
                throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e5);
            }
        } else {
            try {
                int i6 = f91924b + 1;
                f91924b = i6;
                if (i6 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer valueOf = Integer.valueOf(i2);
                Long valueOf2 = Long.valueOf(j2);
                Long valueOf3 = Long.valueOf(j3);
                Integer valueOf4 = Integer.valueOf(i3);
                Integer valueOf5 = Integer.valueOf(i4);
                Boolean valueOf6 = Boolean.valueOf(z);
                boolean booleanValue = bool.booleanValue();
                if (i4 == 8) {
                    str5 = null;
                } else {
                    str5 = AdShowTimeGapManager.r.b();
                }
                o oVar = new o(valueOf, valueOf2, valueOf3, valueOf4, num, str, valueOf5, str3, str4, jVar, valueOf6, booleanValue, str5);
                if (cu.f89727a || !cu.a()) {
                    z2 = false;
                }
                if (z2) {
                    feedItemList = a(oVar);
                } else {
                    feedItemList = a(oVar, false);
                }
                if (i4 == 4 || i4 == 0) {
                    l.d("high", "");
                    long uptimeMillis = SystemClock.uptimeMillis() - com.ss.android.ugc.aweme.bs.d.f68804a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("first_feed_duration", uptimeMillis);
                        jSONObject.put("is_ab_test", "high");
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                    o.b("first_feed_duration", "", jSONObject);
                }
                cu.a();
                System.currentTimeMillis();
                try {
                    List<Aweme> items = feedItemList.getItems();
                    String requestId = feedItemList.getRequestId();
                    if (k.e()) {
                        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
                            k.a("Aweme_Items_is_null", requestId);
                        } else {
                            Aweme aweme = items.get(0);
                            if (aweme == null) {
                                k.a("Aweme_is_null", requestId);
                            } else if (aweme.getVideo() == null) {
                                k.a("video_is_null", requestId);
                            } else if (aweme.getVideo().getPlayAddr() == null) {
                                k.a("playAddr_is_null", requestId);
                            } else if (com.bytedance.common.utility.collection.b.a((Collection) aweme.getVideo().getPlayAddr().getUrlList())) {
                                k.a("UrlList_is_null", requestId);
                            } else if (TextUtils.isEmpty(aweme.getVideo().getPlayAddr().getUrlList().get(0))) {
                                k.a("first_video_url_is_null", requestId);
                            }
                        }
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                v.a.f66895a.a(feedItemList);
            } catch (ExecutionException e8) {
                throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e8);
            }
        }
        if (feedItemList != null) {
            List<Aweme> list = feedItemList.preloadAds;
            if (!com.ss.android.ugc.tools.utils.d.a(list) && (h2 = SplashAdServiceImpl.h()) != null) {
                com.ss.android.ugc.aweme.lego.f.e().a(h2.a(list)).a();
            }
        }
        if (feedItemList != null) {
            ac.a.f91473a.a(feedItemList.getRequestId(), feedItemList.logPb);
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a(feedItemList.getItems());
        }
        com.ss.android.ugc.aweme.commercialize.service.a.f75270a.a().a(feedItemList.getItems());
        if (i4 != 8) {
            com.ss.android.ugc.aweme.commercialize.feed.timegap.c cVar = feedItemList.showTimeGapResponse;
            if (!AdShowTimeGapManager.o) {
                AdShowTimeGapManager.n = cVar;
            }
        }
        for (Aweme aweme2 : feedItemList.getItems()) {
            aweme2.setHasAd(feedItemList.hasAd ? 1 : 0);
        }
        return feedItemList;
    }
}
