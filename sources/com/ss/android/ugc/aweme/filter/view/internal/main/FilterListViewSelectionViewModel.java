package com.ss.android.ugc.aweme.filter.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.a.c;
import com.ss.android.ugc.aweme.filter.repository.a.e;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.view.internal.d;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.b.b;
import f.a.d.f;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilterListViewSelectionViewModel extends HumbleViewModel implements au, r {

    /* renamed from: a  reason: collision with root package name */
    public FilterBean f95816a;

    /* renamed from: b  reason: collision with root package name */
    private final t<FilterBean> f95817b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    private b f95818c;

    /* renamed from: d  reason: collision with root package name */
    private final o f95819d;

    /* renamed from: e  reason: collision with root package name */
    private final d f95820e;

    static {
        Covode.recordClassIndex(60718);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.main.r
    public final LiveData<FilterBean> a() {
        return this.f95817b;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        b bVar = this.f95818c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f95818c = null;
    }

    /* access modifiers changed from: protected */
    public final void b(FilterBean filterBean) {
        d dVar;
        this.f95816a = null;
        this.f95817b.setValue(filterBean);
        if (filterBean != null && (dVar = this.f95820e) != null) {
            dVar.a(filterBean);
        }
    }

    static final class a<T> implements f<List<e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterListViewSelectionViewModel f95821a;

        static {
            Covode.recordClassIndex(60719);
        }

        a(FilterListViewSelectionViewModel filterListViewSelectionViewModel) {
            this.f95821a = filterListViewSelectionViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<e> list) {
            FilterBean filterBean;
            List<e> list2 = list;
            l.d(list2, "");
            for (T t : list2) {
                com.ss.android.ugc.aweme.filter.repository.a.d dVar = t.f95549b;
                if (dVar.f95545b == g.FILTER_STATE_DOWNLOAD_SUCCESS && (filterBean = this.f95821a.f95816a) != null && filterBean.getId() == dVar.f95544a) {
                    if (t != null) {
                        FilterListViewSelectionViewModel filterListViewSelectionViewModel = this.f95821a;
                        filterListViewSelectionViewModel.b(filterListViewSelectionViewModel.f95816a);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.main.r
    public final void a(FilterBean filterBean) {
        if (filterBean == null) {
            b(null);
        } else if (c.a(this.f95819d, filterBean)) {
            b(filterBean);
        } else {
            this.f95816a = filterBean;
            this.f95819d.a(filterBean);
        }
        if (this.f95816a != null && !isDestroyed() && this.f95818c == null) {
            this.f95818c = this.f95819d.e().c(1000, TimeUnit.MILLISECONDS).a(f.a.a.b.a.a()).a(new a(this), f.a.e.b.a.f157191d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterListViewSelectionViewModel(m mVar, o oVar, d dVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(oVar, "");
        this.f95819d = oVar;
        this.f95820e = dVar;
    }
}
