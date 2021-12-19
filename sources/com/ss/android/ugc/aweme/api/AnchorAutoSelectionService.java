package com.ss.android.ugc.aweme.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import l.b.f;
import l.b.t;

public interface AnchorAutoSelectionService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66434a = a.f66435a;

    static {
        Covode.recordClassIndex(40828);
    }

    @f(a = "/tiktok/v1/anchor/auto/selection/")
    i<a> getAnchorAutoSelectionResponse(@t(a = "open_platform_client_key") String str, @t(a = "open_platform_extra") String str2, @t(a = "anchor_source_type") String str3, @t(a = "add_from") Integer num);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f66435a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final String f66436b;

        /* renamed from: c  reason: collision with root package name */
        private static final AnchorAutoSelectionService f66437c;

        private a() {
        }

        static {
            Covode.recordClassIndex(40829);
            String str = "https://" + d.f34604k.f34586a;
            f66436b = str;
            f66437c = (AnchorAutoSelectionService) RetrofitFactory.a().b(str).d().a(AnchorAutoSelectionService.class);
        }

        public static i<a> a(String str, String str2, String str3, Integer num) {
            return f66437c.getAnchorAutoSelectionResponse(str, str2, str3, num);
        }
    }
}
