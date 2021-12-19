package com.ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface PrivacySettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77471a = a.f77472a;

    static {
        Covode.recordClassIndex(47932);
    }

    @t(a = "/tiktok/privacy/user/follow_list_setting/update/v1")
    @g
    f.a.t<BaseResponse> setFollowList(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/im_setting/update/v1")
    @g
    f.a.t<BaseResponse> setImSetting(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/involve_setting/update/v1")
    @g
    f.a.t<BaseResponse> setInvolveSetting(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/item_setting/update/v1")
    @g
    f.a.t<BaseResponse> setItemSetting(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/liked_list_setting/update/v1")
    @g
    f.a.t<BaseResponse> setLikedList(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/private_account/update/v1")
    @g
    f.a.t<BaseResponse> setPrivateAccount(@e(a = "field") String str, @e(a = "value") int i2, @e(a = "confirmed") int i3);

    @t(a = "/tiktok/privacy/user/recommended_setting/update/v1")
    @g
    f.a.t<BaseResponse> setRecommendSetting(@e(a = "field") String str, @e(a = "value") int i2);

    @t(a = "/tiktok/privacy/user/suggest_setting/update/v1")
    @g
    f.a.t<BaseResponse> setSuggestionSetting(@e(a = "field") String str, @e(a = "value") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77472a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47933);
        }
    }
}
