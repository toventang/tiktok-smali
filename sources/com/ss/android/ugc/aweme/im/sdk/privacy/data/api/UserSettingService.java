package com.ss.android.ugc.aweme.im.sdk.privacy.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import f.a.ab;
import h.f.b.l;

public interface UserSettingService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102938a = a.f102939a;

    static {
        Covode.recordClassIndex(65989);
    }

    @h(a = "/aweme/v1/user/settings/")
    ab<f> getUserSettings(@z(a = "last_settings_version") String str);

    @h(a = "/aweme/v1/user/settings/")
    q<f> getUserSettingsFuture(@z(a = "last_settings_version") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f102939a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static UserSettingService f102940b;

        private a() {
        }

        static {
            Covode.recordClassIndex(65990);
        }

        public static UserSettingService a() {
            if (f102940b == null) {
                f102940b = (UserSettingService) RetrofitFactory.a().a(b.f59141e).a(UserSettingService.class);
            }
            UserSettingService userSettingService = f102940b;
            if (userSettingService == null) {
                l.b();
            }
            return userSettingService;
        }
    }
}
