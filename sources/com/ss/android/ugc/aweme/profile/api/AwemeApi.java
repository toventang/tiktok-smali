package com.ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.common.util.g;
import com.ss.android.http.a.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.profile.af;
import com.ss.android.ugc.aweme.profile.f.l;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.em;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class AwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f115976a = (b.f59141e + "/aweme/v1/aweme/post/");

    /* renamed from: b  reason: collision with root package name */
    public static final String f115977b = (b.f59141e + "/aweme/v1/aweme/favorite/");

    /* renamed from: c  reason: collision with root package name */
    public static final String f115978c = (b.f59141e + "/aweme/v1/aweme/listcollection/");

    /* renamed from: d  reason: collision with root package name */
    public static final String f115979d = (b.f59141e + "/aweme/v1/private/aweme/");

    /* renamed from: e  reason: collision with root package name */
    public static final RealApi f115980e = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(RealApi.class));

    public interface RealApi {
        static {
            Covode.recordClassIndex(74793);
        }

        @f(a = "/aweme/v2/douplus/item/check/")
        q<AwemeAdStatus> checkItemAdStatus(@t(a = "item_id") String str, @t(a = "from_source") int i2);

        @o(a = "/aweme/v1/commit/dislike/item/")
        @e
        com.bytedance.retrofit2.b<BaseResponse> disLikeAweme(@t(a = "aweme_id") String str, @d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(74792);
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(int i2) {
        if (i2 != 0) {
            if (i2 == 4) {
                return f115978c;
            }
            if (i2 != 11) {
                if (i2 != 14) {
                    return f115977b;
                }
                return f115979d;
            }
        }
        return f115976a;
    }

    private static void a(FeedItemList feedItemList, com.ss.android.http.a.b.e eVar) {
        a[] a2;
        if (feedItemList != null) {
            if (!(TextUtils.isEmpty("X-TT-LOGID") || eVar == null || (a2 = eVar.a("X-TT-LOGID")) == null)) {
                for (a aVar : a2) {
                    if ("X-TT-LOGID".equalsIgnoreCase(aVar.a())) {
                        feedItemList.setRequestId(aVar.b());
                        return;
                    }
                }
            }
            if (feedItemList.logPb != null) {
                feedItemList.setRequestId(feedItemList.logPb.getImprId());
            }
        }
    }

    public static FeedItemList a(boolean z, String str, String str2, int i2, long j2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        com.ss.android.http.a.b.e eVar = new com.ss.android.http.a.b.e();
        g gVar = new g(f115977b);
        gVar.a("invalid_item_count", i4);
        gVar.a("is_hiding_invalid_item", i5);
        gVar.a("max_cursor", j2);
        if ((TextUtils.isEmpty(str2) || c.f99077a.f99078b.getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
            gVar.a("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            gVar.a("sec_user_id", str2);
        }
        gVar.a("count", i3);
        h hVar = h.f116622a;
        if (z) {
            i6 = 60;
        } else {
            i6 = 0;
        }
        String a2 = gVar.a();
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) hVar.apiExecuteGetJSONObject(i6, a2, FeedItemList.class, null, eVar, z2, null);
        a(feedItemList, eVar);
        com.ss.android.ugc.aweme.profile.f.e.a(i2, str, feedItemList);
        return feedItemList;
    }

    static String a(String str, String str2, int i2, long j2, int i3, int i4, int i5, Integer num) {
        String str3;
        String a2 = a(i2);
        g gVar = new g(a2);
        if (i2 == 0) {
            gVar.a("source", 0);
        } else if (i2 == 11) {
            gVar.a("source", 1);
        }
        if (!TextUtils.isEmpty(a2) && a2.contains(f115976a)) {
            int[] a3 = em.a(101);
            int[] a4 = em.a(200);
            String str4 = "";
            if (a3 == null) {
                str3 = str4;
            } else {
                str3 = a3[0] + "_" + a3[1];
            }
            gVar.a("user_avatar_shrink", str3);
            if (a4 != null) {
                str4 = a4[0] + "_" + a4[1];
            }
            gVar.a("video_cover_shrink", str4);
        }
        af.a(gVar, num, i2);
        if (i2 == 4) {
            gVar.a("cursor", j2);
        } else {
            gVar.a("max_cursor", j2);
            if ((TextUtils.isEmpty(str2) || c.f99077a.f99078b.getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
                gVar.a("user_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                gVar.a("sec_user_id", str2);
            }
            if (i2 == 1) {
                gVar.a("hotsoon_filtered_count", i4);
                gVar.a("hotsoon_has_more", i5);
            }
        }
        gVar.a("count", i3);
        return gVar.a();
    }

    public static FeedItemList a(boolean z, String str, String str2, int i2, long j2, int i3, String str3, int i4, int i5, Integer num, com.ss.android.http.a.b.e eVar) {
        int i6;
        boolean z2;
        String a2 = a(str, str2, i2, j2, i3, i4, i5, num);
        l.a();
        h hVar = h.f116622a;
        if (z) {
            i6 = 60;
        } else {
            i6 = 0;
        }
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) hVar.apiExecuteGetJSONObject(i6, a2, FeedItemList.class, null, eVar, z2, str3);
        a(feedItemList, eVar);
        com.ss.android.ugc.aweme.profile.f.e.a(i2, str, feedItemList);
        return feedItemList;
    }
}
