package com.ss.android.ugc.aweme.filter.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.d;
import com.ss.android.ugc.aweme.filter.repository.a.e;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.b.b;
import f.a.d.f;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class FilterListViewStateViewModel extends HumbleViewModel implements au, s {

    /* renamed from: a  reason: collision with root package name */
    public final t<Map<FilterBean, g>> f95822a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public List<? extends FilterBean> f95823b;

    /* renamed from: c  reason: collision with root package name */
    private b f95824c;

    /* renamed from: d  reason: collision with root package name */
    private final f<e> f95825d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private final o f95826e;

    static {
        Covode.recordClassIndex(60720);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.main.s
    public final LiveData<Map<FilterBean, g>> a() {
        return this.f95822a;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        b bVar = this.f95824c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f95824c = null;
    }

    static final class a<T> implements f<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterListViewStateViewModel f95827a;

        static {
            Covode.recordClassIndex(60721);
        }

        a(FilterListViewStateViewModel filterListViewStateViewModel) {
            this.f95827a = filterListViewStateViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            d dVar = eVar2.f95549b;
            List<? extends FilterBean> list = this.f95827a.f95823b;
            if (list != null) {
                for (T t : list) {
                    if (t.getId() == dVar.f95544a) {
                        if (t != null) {
                            Map<FilterBean, g> value = this.f95827a.f95822a.getValue();
                            if (value == null) {
                                value = ag.a();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(value);
                            linkedHashMap.put(t, dVar.f95545b);
                            this.f95827a.f95822a.setValue(linkedHashMap);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.main.s
    public final void a(List<? extends FilterBean> list) {
        l.d(list, "");
        this.f95823b = list;
        t<Map<FilterBean, g>> tVar = this.f95822a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(n.a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t, this.f95826e.b(t.getId()));
        }
        tVar.setValue(linkedHashMap);
        if ((!list.isEmpty()) && !isDestroyed() && this.f95824c == null) {
            this.f95824c = this.f95826e.e().a(f.a.a.b.a.a()).a(this.f95825d, f.a.e.b.a.f157191d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterListViewStateViewModel(m mVar, o oVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(oVar, "");
        this.f95826e = oVar;
    }
}
