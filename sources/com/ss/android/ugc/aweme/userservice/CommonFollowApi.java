package com.ss.android.ugc.aweme.userservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.notice.repo.a.a;
import com.ss.android.ugc.aweme.notice.repo.a.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class CommonFollowApi {

    /* renamed from: a  reason: collision with root package name */
    public static final FollowService f142436a = ((FollowService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getApiUrlPrefix()).create(FollowService.class));

    public interface FollowService {
        static {
            Covode.recordClassIndex(93160);
        }

        @h(a = "/aweme/v3/f2f/follow/")
        q<FollowStatus> face2FaceFollow(@z(a = "user_id") String str, @z(a = "sec_user_id") String str2);

        @h(a = "/aweme/v1/commit/follow/user/")
        q<FollowStatus> follow(@aa Map<String, String> map);

        @h(a = "/aweme/v1/remove/follower/")
        t<BaseResponse> remove(@z(a = "user_id") String str, @z(a = "sec_user_id") String str2);
    }

    static {
        Covode.recordClassIndex(93159);
    }

    public static FollowStatus a(String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4, Map<String, String> map) {
        a aVar;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || c.f99077a.f99078b.getSecIdSwitch().intValue() == 0) {
            hashMap.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str2);
        }
        hashMap.put(StringSet.type, String.valueOf(i2));
        hashMap.put("channel_id", String.valueOf(i4));
        hashMap.put("city", str4);
        if (i3 != -1) {
            hashMap.put("from", String.valueOf(i3));
            hashMap.put("from_pre", String.valueOf(i5));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str3);
        }
        l.d(str, "");
        l.d(hashMap, "");
        if (b.a(str) != null) {
            a a2 = b.a(str);
            if (a2 != null) {
                a.a(a2);
            }
            hashMap.put("link_sharer", "1");
            Integer.valueOf(1);
        }
        b.b(str);
        a b2 = b.b(str);
        if (b2 != null) {
            aVar = a.a(b2);
        } else {
            aVar = null;
        }
        hashMap.put("link_sharer", "0");
        Integer num = 0;
        if (aVar != null) {
            hashMap.put("video_link_id", aVar.f112782b);
            hashMap.put("video_link_item_id", aVar.f112783c);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        FollowStatus followStatus = f142436a.follow(hashMap).get();
        if ((followStatus.followStatus == 1 || followStatus.followerStatus == 4) && num != null) {
            if (num.intValue() == 1) {
                b.a(str, null);
            } else if (num.intValue() == 0) {
                b.b(str, null);
            }
        }
        followStatus.secUserId = str2;
        followStatus.userId = str;
        return followStatus;
    }
}
