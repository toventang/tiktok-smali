package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviCreateRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110713a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110714b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110715c = "https://api-va.tiktokv.com";

    public interface Api {
        static {
            Covode.recordClassIndex(71052);
        }

        @t(a = "tiktok/v1/navi/create")
        ab<com.ss.android.ugc.aweme.model.api.b.a> createNavi(@z(a = "navi") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71053);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71051);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110713a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", true, Api.class);
    }
}
