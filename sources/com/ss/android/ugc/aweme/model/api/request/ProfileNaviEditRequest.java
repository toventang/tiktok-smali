package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.b.b;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviEditRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110719a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110720b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110721c = "https://api-va.tiktokv.com";

    public interface Api {
        static {
            Covode.recordClassIndex(71058);
        }

        @t(a = "tiktok/v1/navi/edit")
        ab<b> editNavi(@z(a = "navi") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71059);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71057);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110719a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", false, Api.class);
    }
}
