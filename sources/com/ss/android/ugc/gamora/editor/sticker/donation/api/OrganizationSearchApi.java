package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.f;
import f.a.ab;
import h.f.b.l;

public final class OrganizationSearchApi {

    /* renamed from: a  reason: collision with root package name */
    public static Api f146519a = ((Api) g.a().C().createRetrofit("https://api-va.tiktokv.com", false, Api.class));

    /* renamed from: b  reason: collision with root package name */
    public static final a f146520b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f146521c = "https://api-va.tiktokv.com";

    interface Api {
        static {
            Covode.recordClassIndex(96412);
        }

        @h(a = "/tiktok/v1/donation/ngo/search/")
        ab<f> getOrganizationList(@z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "keyword") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96413);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab<f> a(c cVar) {
            l.d(cVar, "");
            return OrganizationSearchApi.f146519a.getOrganizationList(cVar.f146526a, cVar.f146527b, cVar.f146528c);
        }
    }

    static {
        Covode.recordClassIndex(96411);
    }
}
