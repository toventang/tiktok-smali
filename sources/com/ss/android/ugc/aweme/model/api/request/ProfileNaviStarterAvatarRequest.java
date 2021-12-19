package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.b.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviStarterAvatarRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110734a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110735b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110736c = "https://api-va.tiktokv.com";

    interface Api {
        static {
            Covode.recordClassIndex(71073);
        }

        @h(a = "tiktok/v1/navi/candidateinfo")
        ab<g> getStarterAvatar(@z(a = "starter_navi_id") int i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71074);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab<g> a(int i2) {
            return ProfileNaviStarterAvatarRequest.f110734a.getStarterAvatar(i2);
        }
    }

    static {
        Covode.recordClassIndex(71072);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110734a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", true, Api.class);
    }
}
