package com.ss.android.ugc.aweme.setting.serverpush.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.d;
import java.util.concurrent.ExecutionException;
import l.b.f;
import l.b.o;
import l.b.t;

public final class PushSettingsApiManager {

    /* renamed from: a  reason: collision with root package name */
    private static PushUserSettingsApi f122575a = ((PushUserSettingsApi) a.a(Api.f66569d, PushUserSettingsApi.class));

    /* access modifiers changed from: package-private */
    public interface PushUserSettingsApi {
        static {
            Covode.recordClassIndex(80418);
        }

        @f(a = "/tiktok/user/relation/social/data/check/v1")
        i<SocialRelationDataCheckResponse> checkSocialRelationData(@t(a = "social_platform") int i2);

        @f(a = "/tiktok/v1/notification/settings/")
        q<d> getNotificationsSettings();

        @f(a = "/aweme/v1/user/settings/")
        q<com.ss.android.ugc.aweme.setting.serverpush.a.f> getUserSettings(@t(a = "last_settings_version") String str);

        @o(a = "/tiktok/user/relation/social/data/delete/v1")
        q<BaseResponse> removeSocialRelationData(@t(a = "social_platform") int i2);

        @f(a = "/aweme/v1/user/set/settings/")
        q<BaseResponse> setItem(@t(a = "field") String str, @t(a = "value") int i2);

        @f(a = "/aweme/v1/user/set/settings/")
        q<BaseResponse> setPrivateItem(@t(a = "field") String str, @t(a = "private_setting") int i2);

        @f(a = "/aweme/v1/user/set/settings/")
        q<BaseResponse> setPrivateItem(@t(a = "field") String str, @t(a = "private_setting") int i2, @t(a = "enable_stitch") int i3);

        @f(a = "/aweme/v1/user/set/settings/")
        q<BaseResponse> setPrivateItem(@t(a = "field") String str, @t(a = "private_setting") int i2, @t(a = "aweme_id") String str2);

        @o(a = "/aweme/v1/user/set/settings/")
        q<BaseResponse> setResidenceItem(@t(a = "field") String str, @t(a = "user_residence") String str2);

        @o(a = "/tiktok/v1/notification/settings/set/")
        q<BaseResponse> setUserSettingsForLogout(@t(a = "field") String str, @t(a = "status") int i2);
    }

    static {
        Covode.recordClassIndex(80417);
    }

    public static d b() {
        try {
            return f122575a.getNotificationsSettings().get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static com.ss.android.ugc.aweme.setting.serverpush.a.f a() {
        try {
            return f122575a.getUserSettings(b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "last_user_setting_version", "")).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static i<SocialRelationDataCheckResponse> a(int i2) {
        return f122575a.checkSocialRelationData(i2);
    }

    public static BaseResponse b(int i2) {
        try {
            return f122575a.removeSocialRelationData(i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseResponse a(String str, int i2) {
        try {
            return f122575a.setItem(str, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseResponse c(String str, int i2) {
        try {
            return f122575a.setUserSettingsForLogout(str, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseResponse b(String str, int i2) {
        try {
            return f122575a.setPrivateItem(str, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseResponse a(String str, int i2, int i3) {
        try {
            return f122575a.setPrivateItem(str, i2, i3).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static BaseResponse a(String str, int i2, String str2) {
        try {
            return f122575a.setPrivateItem(str, i2, str2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
