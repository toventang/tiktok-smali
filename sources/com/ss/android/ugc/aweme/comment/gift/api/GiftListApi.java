package com.ss.android.ugc.aweme.comment.gift.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.ExecutionException;

public final class GiftListApi {

    /* renamed from: a  reason: collision with root package name */
    public static FetchGiftListApi f71809a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f71810b = new a((byte) 0);

    public interface FetchGiftListApi {
        static {
            Covode.recordClassIndex(44171);
        }

        @h(a = "/tiktok/v1/gift/list/")
        t<GiftResponse> getGiftList(@z(a = "aweme_id") String str, @z(a = "creator_uid") String str2);
    }

    static {
        Covode.recordClassIndex(44170);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44172);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t<GiftResponse> a(String str, String str2) {
            try {
                if (GiftListApi.f71809a == null) {
                    GiftListApi.f71809a = (FetchGiftListApi) RetrofitFactory.a().a(b.f59141e).a(FetchGiftListApi.class);
                }
                FetchGiftListApi fetchGiftListApi = GiftListApi.f71809a;
                if (fetchGiftListApi == null) {
                    l.b();
                }
                return fetchGiftListApi.getGiftList(str, str2);
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<GiftResponse> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }
    }
}
