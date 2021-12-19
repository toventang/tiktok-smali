package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviDeleteRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110716a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110717b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110718c = "https://api-va.tiktokv.com";

    interface Api {
        static {
            Covode.recordClassIndex(71055);
        }

        @t(a = "tiktok/v1/navi/delete")
        ab<BaseResponse> deleteNavi(@z(a = "navi_id") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71056);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab<BaseResponse> a(a aVar) {
            l.d(aVar, "");
            return ProfileNaviDeleteRequest.f110716a.deleteNavi(aVar.f110738a);
        }
    }

    static {
        Covode.recordClassIndex(71054);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110716a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", false, Api.class);
    }
}
