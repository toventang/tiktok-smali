package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import f.a.t;

/* access modifiers changed from: package-private */
public interface PrivacyUserSettingsDataApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77372a = a.f77373a;

    static {
        Covode.recordClassIndex(47857);
    }

    @h(a = "/tiktok/privacy/user/settings/v1")
    t<PrivacyUserSettingsResponse> getPrivacyUserSettings();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77373a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47858);
        }
    }
}
