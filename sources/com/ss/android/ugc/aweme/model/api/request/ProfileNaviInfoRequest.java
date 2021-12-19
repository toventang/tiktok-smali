package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.b.d;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviInfoRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110725a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110726b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110727c = "https://api-va.tiktokv.com";

    /* access modifiers changed from: package-private */
    public interface Api {
        static {
            Covode.recordClassIndex(71064);
        }

        @h(a = "tiktok/v1/navi/info")
        ab<d> getNaviInfo(@z(a = "navi_id") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71065);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab<d> a(String str) {
            l.d(str, "");
            return ProfileNaviInfoRequest.f110725a.getNaviInfo(str);
        }
    }

    static {
        Covode.recordClassIndex(71063);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f110725a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", true, Api.class);
    }
}
