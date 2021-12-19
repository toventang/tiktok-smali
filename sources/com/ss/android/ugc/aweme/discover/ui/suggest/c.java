package com.ss.android.ugc.aweme.discover.ui.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import f.a.d.g;
import h.f.b.l;
import h.f.b.m;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f82757a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(51545);
    }

    public static final class b extends m implements h.f.a.a<SuggestWordsApi.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82759a = new b();

        static {
            Covode.recordClassIndex(51547);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SuggestWordsApi.a invoke() {
            String str;
            SuggestWordsApi.a aVar = new SuggestWordsApi.a();
            aVar.f80816a = "100010";
            aVar.f80817b = "general";
            if (com.bytedance.common.utility.m.a(d.s, "local_test")) {
                str = "1";
            } else {
                str = "0";
            }
            aVar.f80818c = str;
            aVar.f80825j = "discover_guess";
            return aVar;
        }
    }

    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82758a = new a();

        static {
            Covode.recordClassIndex(51546);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
            l.d(suggestWordResponse, "");
            return new DiscoverSectionItem.SuggestSearchSection(suggestWordResponse);
        }
    }
}
