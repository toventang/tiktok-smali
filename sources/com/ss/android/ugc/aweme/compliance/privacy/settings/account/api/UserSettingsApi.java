package com.ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import f.a.t;

/* access modifiers changed from: package-private */
public interface UserSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77473a = a.f77474a;

    static {
        Covode.recordClassIndex(47934);
    }

    @h(a = "/aweme/v1/user/settings/")
    t<f> getUserSettings(@z(a = "last_settings_version") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77474a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47935);
        }
    }
}
