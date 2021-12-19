package com.ss.android.ugc.aweme.search.keyword;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.keyword.SugKeywordViewModel;
import com.ss.android.ugc.aweme.keyword.a;
import h.f.b.l;
import h.h;
import h.i;

public final class SugKeywordPresenter implements au, a.c {

    /* renamed from: a  reason: collision with root package name */
    public a.d f121297a;

    /* renamed from: b  reason: collision with root package name */
    public final e f121298b;

    /* renamed from: c  reason: collision with root package name */
    private final h f121299c = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(79061);
    }

    public final SugKeywordViewModel b() {
        return (SugKeywordViewModel) this.f121299c.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    static final class a extends h.f.b.m implements h.f.a.a<SugKeywordViewModel> {
        final /* synthetic */ SugKeywordPresenter this$0;

        static {
            Covode.recordClassIndex(79062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SugKeywordPresenter sugKeywordPresenter) {
            super(0);
            this.this$0 = sugKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SugKeywordViewModel invoke() {
            ac a2 = ae.a(this.this$0.f121298b, (ad.b) null).a(SugKeywordViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.keyword.a.c
    public final String a() {
        return String.valueOf(b().a().getValue());
    }

    public SugKeywordPresenter(e eVar) {
        l.d(eVar, "");
        this.f121298b = eVar;
    }

    @Override // com.ss.android.ugc.aweme.keyword.a.c
    public final void a(String str) {
        l.d(str, "");
        b().a().setValue(str);
    }
}
