package com.ss.android.ugc.aweme.choosemusic.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.choosemusic.model.ak;
import h.f.b.l;
import l.b.f;
import l.b.t;

public interface SearchSugApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70376a = a.f70378b;

    static {
        Covode.recordClassIndex(43412);
    }

    @f(a = "/aweme/v1/search/sug/")
    q<ak> getSearchSugList(@t(a = "keyword") String str, @t(a = "source") String str2, @t(a = "history_list") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SearchSugApi f70377a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f70378b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(43413);
            Object a2 = RetrofitFactory.a().b(com.ss.android.ugc.aweme.music.d.a.f111394a).d().a(SearchSugApi.class);
            l.b(a2, "");
            f70377a = (SearchSugApi) a2;
        }
    }
}
