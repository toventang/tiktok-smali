package com.ss.android.ugc.aweme.wiki;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import l.b.f;
import l.b.t;

public interface CheckAnchorModerationService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145093a = a.f145094a;

    static {
        Covode.recordClassIndex(94883);
    }

    @f(a = "aweme/v1/anchor/add/check/")
    q<a> postCheckAnchorReviewResult(@t(a = "type") int i2, @t(a = "url") String str, @t(a = "keyword") String str2, @t(a = "language") String str3, @t(a = "subtype") String str4);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f145094a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final CheckAnchorModerationService f145095b = ((CheckAnchorModerationService) RetrofitFactory.a().b(b.f59141e).c().d().a(CheckAnchorModerationService.class));

        private a() {
        }

        static {
            Covode.recordClassIndex(94884);
        }

        public static q<a> a(int i2, String str, String str2, String str3, String str4) {
            return f145095b.postCheckAnchorReviewResult(i2, str, str2, str3, str4);
        }
    }
}
