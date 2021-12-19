package com.ss.android.ugc.aweme.keyword;

import android.text.Editable;
import android.widget.EditText;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import h.f.b.l;
import h.h;
import h.i;

public final class SearchKeywordPresenter implements au, a.AbstractC2689a {

    /* renamed from: a  reason: collision with root package name */
    public final e f105226a;

    /* renamed from: b  reason: collision with root package name */
    private final h f105227b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f105228c = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(67453);
    }

    private final SearchKeywordViewModel c() {
        return (SearchKeywordViewModel) this.f105227b.getValue();
    }

    private final SearchEditTextViewModel d() {
        return (SearchEditTextViewModel) this.f105228c.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    static final class a extends h.f.b.m implements h.f.a.a<SearchEditTextViewModel> {
        final /* synthetic */ SearchKeywordPresenter this$0;

        static {
            Covode.recordClassIndex(67454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SearchKeywordPresenter searchKeywordPresenter) {
            super(0);
            this.this$0 = searchKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchEditTextViewModel invoke() {
            ac a2 = ae.a(this.this$0.f105226a, (ad.b) null).a(SearchEditTextViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<SearchKeywordViewModel> {
        final /* synthetic */ SearchKeywordPresenter this$0;

        static {
            Covode.recordClassIndex(67455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchKeywordPresenter searchKeywordPresenter) {
            super(0);
            this.this$0 = searchKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchKeywordViewModel invoke() {
            ac a2 = ae.a(this.this$0.f105226a, (ad.b) null).a(SearchKeywordViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.keyword.a.b
    public final b a() {
        b value = c().a().getValue();
        if (value == null) {
            return new b(null, null, 3);
        }
        return value;
    }

    @Override // com.ss.android.ugc.aweme.keyword.a.b
    public final String b() {
        Editable text;
        String obj;
        EditText value = d().a().getValue();
        if (value == null || (text = value.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public SearchKeywordPresenter(e eVar) {
        l.d(eVar, "");
        this.f105226a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.keyword.a.AbstractC2689a
    public final void a(b bVar) {
        l.d(bVar, "");
        c().a().setValue(bVar);
    }
}
