package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.model.api.b.c;
import f.a.ab;

public final class ProfileNaviImageListRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110722a = ((Api) RetrofitFactory.a().b("https://api-va.tiktokv.com").d().a(Api.class));

    /* renamed from: b  reason: collision with root package name */
    public static final a f110723b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110724c = "https://api-va.tiktokv.com";

    public interface Api {
        static {
            Covode.recordClassIndex(71061);
        }

        @h(a = "/tiktok/v1/navi/images")
        ab<c> getNaviImageList(@z(a = "offset") int i2, @z(a = "count") int i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71062);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71060);
    }
}
