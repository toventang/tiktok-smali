package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.d;
import f.a.t;

public interface OrganizationListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146516a = a.f146518b;

    static {
        Covode.recordClassIndex(96409);
    }

    @h(a = "/aweme/v1/donation/orgs/")
    t<d> getOrganizationList(@z(a = "cursor") int i2, @z(a = "count") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final String f146517a = "https://api-va.tiktokv.com";

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f146518b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(96410);
        }
    }
}
