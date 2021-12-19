package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.b.f;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviStarterAvatarListRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110731a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110732b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110733c = "https://api-va.tiktokv.com";

    public interface Api {
        static {
            Covode.recordClassIndex(71070);
        }

        @h(a = "tiktok/v1/navi/candidates")
        ab<f> getStarterAvatar();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71071);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71069);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110731a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", true, Api.class);
    }
}
