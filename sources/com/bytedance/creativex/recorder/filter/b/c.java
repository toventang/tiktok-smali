package com.bytedance.creativex.recorder.filter.b;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.w;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.creativex.recorder.filter.a.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.aweme.shortvideo.dt;
import h.a.n;
import h.a.z;
import h.f.b.y;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class c<T extends com.bytedance.creativex.recorder.filter.a.a> extends com.bytedance.als.j<T> implements com.bytedance.creativex.recorder.filter.a.a, com.bytedance.o.a {
    static final /* synthetic */ h.k.i[] $$delegatedProperties = {new y(c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(c.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
    public static final int CHOOSE_NO_FILTER = -1;
    public static final b Companion = new b((byte) 0);
    private final l<FilterBean> _curSelectedFilter;
    public final t<com.bytedance.creativex.recorder.filter.a.e> _currentFilterSource;
    public final t<List<com.bytedance.creativex.recorder.filter.a.e>> _filterSources;
    private final k<com.bytedance.creativex.recorder.filter.a.h> _filterSwitchEvent;
    private final k<com.bytedance.creativex.recorder.filter.a.i> _filterUpdateEvent;
    private final androidx.appcompat.app.d activity;
    public final T apiComponent;
    private final a buildIn;
    private final h.h.d cameraApiComponent$delegate;
    private final a componentConfigure;
    public final l<FilterBean> curSelectedFilter;
    public p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> currentFilter;
    public final t<com.bytedance.creativex.recorder.filter.a.e> currentFilterSource;
    private final com.bytedance.o.f diContainer;
    private final h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> filterApplyInterceptor;
    public final h.f.a.a<Boolean> filterSetupInterceptor;
    public final t<List<com.bytedance.creativex.recorder.filter.a.e>> filterSources;
    public final k<com.bytedance.creativex.recorder.filter.a.h> filterSwitchEvent;
    public final k<com.bytedance.creativex.recorder.filter.a.i> filterUpdateEvent;
    private final u<List<FilterBean>> pendingFilterResIdSetObserver;
    private final u<List<FilterBean>> pendingFilterSetObserver;
    private final h.h.d recordControlApi$delegate;

    private final m getRecordControlApi() {
        return (m) this.recordControlApi$delegate.a(this, $$delegatedProperties[1]);
    }

    public final com.bytedance.creativex.recorder.b.a.d getCameraApiComponent() {
        return (com.bytedance.creativex.recorder.b.a.d) this.cameraApiComponent$delegate.a(this, $$delegatedProperties[0]);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(16561);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void clearFilterChosen() {
        cleanFilterChosen();
    }

    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.apiComponent;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public /* bridge */ /* synthetic */ com.bytedance.als.h getCurSelectedFilter() {
        return this.curSelectedFilter;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public /* bridge */ /* synthetic */ LiveData getCurrentFilterSource() {
        return this.currentFilterSource;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public /* bridge */ /* synthetic */ LiveData getFilterSources() {
        return this.filterSources;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public /* bridge */ /* synthetic */ com.bytedance.als.g getFilterSwitchEvent() {
        return this.filterSwitchEvent;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public /* bridge */ /* synthetic */ com.bytedance.als.g getFilterUpdateEvent() {
        return this.filterUpdateEvent;
    }

    private final void initData() {
        setFilterSourceInternal("build_in");
    }

    public void cleanFilterChosen() {
        this.currentFilter = null;
        applyFilter2Camera$default(this, null, null, 2, null);
        this._curSelectedFilter.b(null);
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        initData();
        initObserve();
    }

    private final boolean isCurrentFilterSourceDisable() {
        String str;
        com.bytedance.creativex.recorder.filter.a.e value = this._currentFilterSource.getValue();
        if (value == null || (str = value.f28226a) == null) {
            return false;
        }
        return isFilterDisableInternal(str);
    }

    static {
        Covode.recordClassIndex(16559);
    }

    private final com.bytedance.creativex.recorder.filter.a.e buildInFilterSource() {
        return new com.bytedance.creativex.recorder.filter.a.e("build_in", this.buildIn.f28243a, com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(this.buildIn.f28244b, com.bytedance.creativex.recorder.filter.e.a.a(getCameraApiComponent().z())), this.buildIn.f28245c);
    }

    private final void initObserve() {
        getCameraApiComponent().j().a(this.activity, new e(this));
        getCameraApiComponent().l().a(this, new f(this));
        getRecordControlApi().l().a(this, new g(this));
        getRecordControlApi().i().a(this, new h(this));
    }

    static final class i<T> implements u<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28250a;

        static {
            Covode.recordClassIndex(16568);
        }

        i(c cVar) {
            this.f28250a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            c.setChosenFilterFromStoreInternal$default(this.f28250a, true, false, false, 4, null);
        }
    }

    static final class j<T> implements u<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28251a;

        static {
            Covode.recordClassIndex(16569);
        }

        j(c cVar) {
            this.f28251a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            c.setChosenFilterFromStoreInternal$default(this.f28251a, true, false, false, 4, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void addFilterSource(com.bytedance.creativex.recorder.filter.a.e eVar) {
        h.f.b.l.d(eVar, "");
        addFilterSourceInternal(eVar);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public boolean isFilterDisable(String str) {
        h.f.b.l.d(str, "");
        return isFilterDisableInternal(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void removeFilterSource(String str) {
        h.f.b.l.d(str, "");
        removeFilterSourceInternal(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterFromStore(boolean z) {
        setChosenFilterFromStoreInternal$default(this, z, true, false, 4, null);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void useFilterSource(String str) {
        h.f.b.l.d(str, "");
        setFilterSourceInternal(str);
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements com.bytedance.als.m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28247a;

        static {
            Covode.recordClassIndex(16565);
        }

        f(c cVar) {
            this.f28247a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Integer num) {
            h.f.a.a<Boolean> aVar = this.f28247a.filterSetupInterceptor;
            if (aVar == null || !aVar.invoke().booleanValue()) {
                c.setChosenFilterFromStoreInternal$default(this.f28247a, true, false, false, 6, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e>, Integer> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e> pVar) {
            p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e> pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            List<com.bytedance.creativex.recorder.filter.a.e> value = this.this$0._filterSources.getValue();
            int i2 = 0;
            if (value != null) {
                Iterator<com.bytedance.creativex.recorder.filter.a.e> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (h.f.b.l.a((Object) it.next().f28226a, (Object) ((com.bytedance.creativex.recorder.filter.a.e) pVar2.getSecond()).f28226a)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return Integer.valueOf(i2);
        }
    }

    private final boolean isFilterDisableInternal(String str) {
        T t;
        com.bytedance.creativex.recorder.filter.a.j jVar;
        List<com.bytedance.creativex.recorder.filter.a.e> value = this._filterSources.getValue();
        if (value == null) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (h.f.b.l.a((Object) t.f28226a, (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (jVar = t2.f28229d) == null) {
            return false;
        }
        return jVar.a();
    }

    public void actualApplyFilter2Camera(com.bytedance.creativex.recorder.filter.a.b bVar) {
        if (bVar == null) {
            getCameraApiComponent().a("");
        } else if (bVar.f28225d == null) {
            getCameraApiComponent().a(bVar.f28224c);
        } else {
            getCameraApiComponent().a(bVar.f28224c, bVar.f28225d.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$c  reason: collision with other inner class name */
    public static final class C0599c extends h.f.b.m implements h.f.a.b<p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e>, Integer> {
        final /* synthetic */ com.bytedance.creativex.recorder.filter.a.e $source;

        static {
            Covode.recordClassIndex(16562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0599c(com.bytedance.creativex.recorder.filter.a.e eVar) {
            super(1);
            this.$source = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e> pVar) {
            p<? extends FilterBean, ? extends com.bytedance.creativex.recorder.filter.a.e> pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            List<FilterBean> value = this.$source.f28227b.f().a().getValue();
            int i2 = 0;
            if (value != null) {
                Iterator<FilterBean> it = value.iterator();
                i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (it.next().getId() == ((FilterBean) pVar2.getFirst()).getId()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return Integer.valueOf(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28246a;

        static {
            Covode.recordClassIndex(16564);
        }

        e(c cVar) {
            this.f28246a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar;
            com.bytedance.creativex.recorder.filter.a.j jVar;
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                h.f.a.a<Boolean> aVar = this.f28246a.filterSetupInterceptor;
                if (aVar == null || !aVar.invoke().booleanValue()) {
                    com.bytedance.creativex.recorder.filter.a.e value = this.f28246a._currentFilterSource.getValue();
                    if ((value == null || (jVar = value.f28229d) == null || !jVar.a()) && (pVar = this.f28246a.currentFilter) != null) {
                        c.applyFilter2Camera$default(this.f28246a, pVar, null, 2, null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements com.bytedance.als.m<x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28248a;

        static {
            Covode.recordClassIndex(16566);
        }

        g(c cVar) {
            this.f28248a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(x xVar) {
            FilterBean filterBean;
            p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar = this.f28248a.currentFilter;
            if (pVar != null && (filterBean = (FilterBean) pVar.getFirst()) != null) {
                if (filterBean.getEnName() != null) {
                    this.f28248a.getCameraApiComponent().e().G.f124740a.addIndex();
                    this.f28248a.getCameraApiComponent().e().G.f124742c.addIndex();
                }
                if (filterBean != null && String.valueOf(filterBean.getId()) != null) {
                    this.f28248a.getCameraApiComponent().e().G.f124741b.addIndex();
                }
            }
        }
    }

    private final void addFilterSourceInternal(com.bytedance.creativex.recorder.filter.a.e eVar) {
        List<com.bytedance.creativex.recorder.filter.a.e> arrayList;
        List<com.bytedance.creativex.recorder.filter.a.e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (h.f.b.l.a((Object) next.f28226a, (Object) eVar.f28226a)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        t<List<com.bytedance.creativex.recorder.filter.a.e>> tVar = this._filterSources;
        List<com.bytedance.creativex.recorder.filter.a.e> value2 = tVar.getValue();
        if (value2 != null) {
            arrayList = n.g((Collection) value2);
        } else {
            arrayList = new ArrayList<>();
        }
        arrayList.add(eVar);
        tVar.setValue(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.lifecycle.t<java.util.List<com.bytedance.creativex.recorder.filter.a.e>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void removeFilterSourceInternal(String str) {
        List list;
        List<com.bytedance.creativex.recorder.filter.a.e> value = this._filterSources.getValue();
        if (value != null) {
            for (T t : value) {
                if (h.f.b.l.a((Object) t.f28226a, (Object) str)) {
                    if (t != null) {
                        t<List<com.bytedance.creativex.recorder.filter.a.e>> tVar = this._filterSources;
                        List list2 = (List) tVar.getValue();
                        if (list2 != null) {
                            list = new ArrayList();
                            for (Object obj : list2) {
                                if (!h.f.b.l.a((Object) ((com.bytedance.creativex.recorder.filter.a.e) obj).f28226a, (Object) str)) {
                                    list.add(obj);
                                }
                            }
                        } else {
                            list = z.INSTANCE;
                        }
                        tVar.setValue(list);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void syncDataOnFilterChosen(p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar) {
        if (!getRecordControlApi().c().a().booleanValue()) {
            getCameraApiComponent().e().G.f124740a.add(((FilterBean) pVar.getFirst()).getEnName());
            getCameraApiComponent().e().G.f124741b.add(((FilterBean) pVar.getFirst()).getEnName());
            getCameraApiComponent().e().G.f124742c.add(String.valueOf(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(pVar.getSecond().f28228c, (FilterBean) pVar.getFirst())));
        }
        actualSaveDefaultFilte((FilterBean) pVar.getFirst(), pVar.getSecond().f28229d);
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements com.bytedance.als.m<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28249a;

        static {
            Covode.recordClassIndex(16567);
        }

        h(c cVar) {
            this.f28249a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(w wVar) {
            FilterBean filterBean;
            String str;
            com.bytedance.creativex.recorder.filter.a.j jVar;
            int i2;
            com.bytedance.creativex.recorder.filter.a.e second;
            com.ss.android.ugc.aweme.filter.repository.a.m mVar;
            p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar = this.f28249a.currentFilter;
            String str2 = null;
            if (pVar != null) {
                filterBean = (FilterBean) pVar.getFirst();
                if (filterBean != null) {
                    str = filterBean.getEnName();
                }
                str = null;
            } else {
                filterBean = null;
                str = null;
            }
            if (str != null) {
                this.f28249a.getCameraApiComponent().e().G.f124740a.add(str);
                p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar2 = this.f28249a.currentFilter;
                if (pVar2 == null || (second = pVar2.getSecond()) == null || (mVar = second.f28228c) == null) {
                    i2 = 0;
                } else {
                    i2 = Float.valueOf(com.ss.android.ugc.aweme.filter.repository.a.a.c.a(mVar, filterBean));
                }
                this.f28249a.getCameraApiComponent().e().G.f124742c.add(i2.toString());
            }
            StrArray strArray = this.f28249a.getCameraApiComponent().e().G.f124741b;
            com.bytedance.creativex.recorder.filter.a.e value = this.f28249a._currentFilterSource.getValue();
            h.f.b.l.d(strArray, "");
            if (value != null && (jVar = value.f28229d) != null && jVar.a()) {
                str2 = "";
            } else if (filterBean != null) {
                str2 = String.valueOf(filterBean.getId());
            }
            strArray.add(str2);
        }
    }

    private final void setFilterSourceInternal(String str) {
        String str2;
        List<com.bytedance.creativex.recorder.filter.a.e> value;
        boolean z;
        o oVar;
        q f2;
        LiveData<List<FilterBean>> b2;
        o oVar2;
        q f3;
        LiveData<List<FilterBean>> b3;
        com.bytedance.creativex.recorder.filter.a.e value2 = this._currentFilterSource.getValue();
        T t = null;
        if (value2 != null) {
            str2 = value2.f28226a;
        } else {
            str2 = null;
        }
        if (!h.f.b.l.a((Object) str2, (Object) str) && (value = this._filterSources.getValue()) != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (h.f.b.l.a((Object) next.f28226a, (Object) str)) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                this._currentFilterSource.setValue(t2);
                if (!(value2 == null || (oVar2 = value2.f28227b) == null || (f3 = oVar2.f()) == null || (b3 = f3.b()) == null)) {
                    b3.removeObserver(this.pendingFilterSetObserver);
                }
                t2.f28227b.f().b().observe(this.activity, this.pendingFilterSetObserver);
                if (!(value2 == null || (oVar = value2.f28227b) == null || (f2 = oVar.f()) == null || (b2 = f2.b()) == null)) {
                    b2.removeObserver(this.pendingFilterResIdSetObserver);
                }
                t2.f28227b.f().b().observe(this.activity, this.pendingFilterResIdSetObserver);
                if (value2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                setChosenFilterFromStoreInternal$default(this, z, false, false, 6, null);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterDisable(boolean z, String str) {
        h.f.b.l.d(str, "");
        setFilterDisableInternal(z, str);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterIntensity(FilterBean filterBean, float f2) {
        h.f.b.l.d(filterBean, "");
        setFilterIntensityInternal(filterBean, f2);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterProgress(FilterBean filterBean, int i2) {
        h.f.b.l.d(filterBean, "");
        setFilterProgressInternal(filterBean, i2);
    }

    public void actualSaveDefaultFilte(FilterBean filterBean, com.bytedance.creativex.recorder.filter.a.j jVar) {
        h.f.b.l.d(filterBean, "");
        h.f.b.l.d(jVar, "");
        jVar.a(getCameraApiComponent().N(), filterBean.getId());
    }

    private final void applyFilter2Camera(p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar, Float f2) {
        float a2;
        com.bytedance.creativex.recorder.filter.a.b invoke;
        if (pVar == null) {
            actualApplyFilter2Camera(null);
            return;
        }
        if (f2 != null) {
            a2 = f2.floatValue();
        } else {
            a2 = pVar.getSecond().f28228c.a((FilterBean) pVar.getFirst());
        }
        com.bytedance.creativex.recorder.filter.a.b bVar = new com.bytedance.creativex.recorder.filter.a.b((FilterBean) pVar.getFirst(), pVar.getSecond(), com.ss.android.ugc.aweme.filter.repository.a.a.a.b((FilterBean) pVar.getFirst()), Float.valueOf(a2));
        h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar2 = this.filterApplyInterceptor;
        if (!(bVar2 == null || (invoke = bVar2.invoke(bVar)) == null)) {
            bVar = invoke;
        }
        actualApplyFilter2Camera(bVar);
    }

    private final void dispatchSwitch(p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar, p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar2) {
        h.f.a.b dVar;
        com.bytedance.creativex.recorder.filter.a.l lVar;
        p pVar3 = null;
        if (!(pVar == null || pVar.getFirst() == null)) {
            pVar3 = v.a(pVar.getFirst(), pVar.getSecond());
        }
        p a2 = v.a(pVar2.getFirst(), pVar2.getSecond());
        if (pVar3 == null) {
            lVar = com.bytedance.creativex.recorder.filter.a.l.RIGHT_TO_LEFT;
        } else {
            if (h.f.b.l.a((Object) ((com.bytedance.creativex.recorder.filter.a.e) pVar3.getSecond()).f28226a, (Object) ((com.bytedance.creativex.recorder.filter.a.e) a2.getSecond()).f28226a)) {
                dVar = new C0599c((com.bytedance.creativex.recorder.filter.a.e) pVar3.getSecond());
            } else {
                dVar = new d(this);
            }
            if (((Number) dVar.invoke(pVar3)).intValue() <= ((Number) dVar.invoke(a2)).intValue()) {
                lVar = com.bytedance.creativex.recorder.filter.a.l.RIGHT_TO_LEFT;
            } else {
                lVar = com.bytedance.creativex.recorder.filter.a.l.LEFT_TO_RIGHT;
            }
        }
        this._filterSwitchEvent.a(new com.bytedance.creativex.recorder.filter.a.h(pVar3, a2, lVar));
    }

    private final void setFilterDisableInternal(boolean z, String str) {
        String str2;
        com.bytedance.creativex.recorder.filter.a.j jVar;
        com.bytedance.creativex.recorder.filter.a.e value = this._currentFilterSource.getValue();
        T t = null;
        if (value != null) {
            str2 = value.f28226a;
        } else {
            str2 = null;
        }
        if (h.f.b.l.a((Object) str2, (Object) str) && z) {
            cleanFilterChosen();
        }
        List<com.bytedance.creativex.recorder.filter.a.e> value2 = this._filterSources.getValue();
        if (value2 != null) {
            Iterator<T> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (h.f.b.l.a((Object) next.f28226a, (Object) str)) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null && (jVar = t2.f28229d) != null) {
                jVar.a(z);
            }
        }
    }

    private final void setFilterIntensityInternal(FilterBean filterBean, float f2) {
        T t;
        com.ss.android.ugc.aweme.filter.repository.a.m mVar;
        List<com.bytedance.creativex.recorder.filter.a.e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f28227b.a(filterBean.getId()) != null) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (mVar = t2.f28228c) == null)) {
                mVar.a(filterBean, f2);
            }
        }
        p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar = this.currentFilter;
        if (pVar != null && h.f.b.l.a(pVar.getFirst(), filterBean)) {
            applyFilter2Camera(pVar, Float.valueOf(f2));
        }
    }

    private final void setFilterProgressInternal(FilterBean filterBean, int i2) {
        T t;
        com.ss.android.ugc.aweme.filter.repository.a.m mVar;
        List<com.bytedance.creativex.recorder.filter.a.e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f28227b.a(filterBean.getId()) != null) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (mVar = t2.f28228c) == null)) {
                mVar.a(filterBean, com.ss.android.ugc.aweme.filter.c.a(filterBean, i2, mVar.a()));
            }
        }
        p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar = this.currentFilter;
        if (pVar != null && h.f.b.l.a(pVar.getFirst(), filterBean)) {
            applyFilter2Camera$default(this, pVar, null, 2, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f2) {
        h.f.b.l.d(filterBean, "");
        h.f.b.l.d(filterBean2, "");
        setFilterScrollInternal(filterBean, filterBean2, f2);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f28243a;

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.filter.repository.a.n f28244b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.creativex.recorder.filter.a.j f28245c;

        static {
            Covode.recordClassIndex(16560);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.f.b.l.a(this.f28243a, aVar.f28243a) && h.f.b.l.a(this.f28244b, aVar.f28244b) && h.f.b.l.a(this.f28245c, aVar.f28245c);
        }

        public final int hashCode() {
            o oVar = this.f28243a;
            int i2 = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            com.ss.android.ugc.aweme.filter.repository.a.n nVar = this.f28244b;
            int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
            com.bytedance.creativex.recorder.filter.a.j jVar = this.f28245c;
            if (jVar != null) {
                i2 = jVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "BuildInFilterSource(repository=" + this.f28243a + ", intensityStore=" + this.f28244b + ", logicStore=" + this.f28245c + ")";
        }

        public a(o oVar, com.ss.android.ugc.aweme.filter.repository.a.n nVar, com.bytedance.creativex.recorder.filter.a.j jVar) {
            h.f.b.l.d(oVar, "");
            h.f.b.l.d(nVar, "");
            h.f.b.l.d(jVar, "");
            this.f28243a = oVar;
            this.f28244b = nVar;
            this.f28245c = jVar;
        }
    }

    public void actualSetFilterScroll(com.bytedance.creativex.recorder.filter.a.b bVar, com.bytedance.creativex.recorder.filter.a.b bVar2, float f2) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        getCameraApiComponent().a(v.a(bVar.f28224c, bVar.f28225d), v.a(bVar2.f28224c, bVar2.f28225d), f2);
    }

    private final void setFilterScrollInternal(FilterBean filterBean, FilterBean filterBean2, float f2) {
        com.bytedance.creativex.recorder.filter.a.b invoke;
        com.bytedance.creativex.recorder.filter.a.b invoke2;
        com.bytedance.creativex.recorder.filter.a.e value = this._currentFilterSource.getValue();
        if (value == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(value, "");
        com.bytedance.creativex.recorder.filter.a.e eVar = value;
        com.bytedance.creativex.recorder.filter.a.b bVar = new com.bytedance.creativex.recorder.filter.a.b(filterBean, eVar, com.ss.android.ugc.aweme.filter.repository.a.a.a.b(filterBean), Float.valueOf(eVar.f28228c.a(filterBean)));
        h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar2 = this.filterApplyInterceptor;
        if (!(bVar2 == null || (invoke2 = bVar2.invoke(bVar)) == null)) {
            bVar = invoke2;
        }
        com.bytedance.creativex.recorder.filter.a.b bVar3 = new com.bytedance.creativex.recorder.filter.a.b(filterBean2, eVar, com.ss.android.ugc.aweme.filter.repository.a.a.a.b(filterBean2), Float.valueOf(eVar.f28228c.a(filterBean2)));
        h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar4 = this.filterApplyInterceptor;
        if (!(bVar4 == null || (invoke = bVar4.invoke(bVar3)) == null)) {
            bVar3 = invoke;
        }
        actualSetFilterScroll(bVar, bVar3, f2);
    }

    /* access modifiers changed from: protected */
    public final void setChosenFilterFromStoreInternal(boolean z, boolean z2, boolean z3) {
        com.bytedance.creativex.recorder.filter.a.e value;
        Integer valueOf;
        T t;
        if (!isCurrentFilterSourceDisable() && (value = this._currentFilterSource.getValue()) != null) {
            com.bytedance.creativex.recorder.filter.a.j jVar = value.f28229d;
            T t2 = null;
            if (jVar instanceof d) {
                String b2 = ((d) jVar).b();
                List<FilterBean> value2 = value.f28227b.f().b().getValue();
                if (value2 != null) {
                    Iterator<T> it = value2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (h.f.b.l.a((Object) next.getResId(), (Object) b2)) {
                            t2 = next;
                            break;
                        }
                    }
                    t = t2;
                }
                cleanFilterChosen();
            }
            dt j2 = getCameraApiComponent().e().j();
            if ((j2 == null || j2.isEmpty()) && this.componentConfigure.f28239a) {
                valueOf = Integer.valueOf(CHOOSE_NO_FILTER);
            } else {
                valueOf = Integer.valueOf(jVar.a(getCameraApiComponent().N()));
            }
            List<FilterBean> value3 = value.f28227b.f().b().getValue();
            if (value3 != null) {
                Iterator<T> it2 = value3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (next2.getId() == valueOf.intValue()) {
                        t2 = next2;
                        break;
                    }
                }
                t = t2;
            }
            cleanFilterChosen();
            if (t != null) {
                setFilterChosenInternal(t, null, z, false, z2, z3);
                return;
            }
            cleanFilterChosen();
        }
    }

    static /* synthetic */ void applyFilter2Camera$default(c cVar, p pVar, Float f2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f2 = null;
            }
            cVar.applyFilter2Camera(pVar, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyFilter2Camera");
    }

    @Override // com.bytedance.creativex.recorder.filter.a.a
    public void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3) {
        h.f.b.l.d(filterBean, "");
        setFilterChosenInternal$default(this, filterBean, str, z, z2, z3, false, 32, null);
    }

    public static /* synthetic */ void setChosenFilterFromStoreInternal$default(c cVar, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            cVar.setChosenFilterFromStoreInternal(z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChosenFilterFromStoreInternal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: h.f.a.b<? super com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.bytedance.o.f fVar, androidx.appcompat.app.d dVar, a aVar, h.f.a.b<? super com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar, h.f.a.a<Boolean> aVar2, h.f.a.b<? super a, h.z> bVar2) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        this.diContainer = fVar;
        this.activity = dVar;
        this.buildIn = aVar;
        this.filterApplyInterceptor = bVar;
        this.filterSetupInterceptor = aVar2;
        this.cameraApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.recordControlApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), m.class);
        l<FilterBean> lVar = new l<>(null);
        this._curSelectedFilter = lVar;
        t<List<com.bytedance.creativex.recorder.filter.a.e>> tVar = new t<>();
        tVar.setValue(n.a(buildInFilterSource()));
        this._filterSources = tVar;
        t<com.bytedance.creativex.recorder.filter.a.e> tVar2 = new t<>();
        this._currentFilterSource = tVar2;
        k<com.bytedance.creativex.recorder.filter.a.i> kVar = new k<>();
        this._filterUpdateEvent = kVar;
        k<com.bytedance.creativex.recorder.filter.a.h> kVar2 = new k<>();
        this._filterSwitchEvent = kVar2;
        this.pendingFilterSetObserver = new j(this);
        this.pendingFilterResIdSetObserver = new i(this);
        a aVar3 = new a((byte) 0);
        this.componentConfigure = aVar3;
        if (bVar2 != null) {
            bVar2.invoke(aVar3);
        }
        this.apiComponent = this;
        this.curSelectedFilter = lVar;
        this.currentFilterSource = tVar2;
        this.filterSources = tVar;
        this.filterSwitchEvent = kVar2;
        this.filterUpdateEvent = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.als.l<com.ss.android.ugc.aweme.filter.FilterBean> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void setFilterChosenInternal(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (isCurrentFilterSourceDisable()) {
            if (z2) {
                com.bytedance.creativex.recorder.filter.a.e value = this._currentFilterSource.getValue();
                if (value != null) {
                    this.apiComponent.setFilterDisable(false, value.f28226a);
                }
            } else {
                return;
            }
        }
        p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar = this.currentFilter;
        if (pVar != null) {
            if (h.f.b.l.a(pVar.getFirst(), filterBean) && !z3) {
                return;
            }
            if (h.f.b.l.a(pVar.getFirst(), filterBean) && z3) {
                z = false;
            }
        }
        com.bytedance.creativex.recorder.filter.a.e value2 = this._currentFilterSource.getValue();
        if (value2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(value2, "");
        com.bytedance.creativex.recorder.filter.a.e eVar = value2;
        if (com.ss.android.ugc.aweme.filter.repository.a.a.c.a(eVar.f28227b, filterBean)) {
            p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> pVar2 = this.currentFilter;
            filterBean.setSaveFilter2BeautySequence(!z4);
            p<? extends FilterBean, com.bytedance.creativex.recorder.filter.a.e> a2 = v.a(filterBean, eVar);
            this.currentFilter = a2;
            applyFilter2Camera$default(this, a2, null, 2, null);
            syncDataOnFilterChosen(a2);
            this._curSelectedFilter.b(a2.getFirst());
            this._filterUpdateEvent.a(new com.bytedance.creativex.recorder.filter.a.i((FilterBean) a2.getFirst(), eVar, z2, str));
            if (z) {
                dispatchSwitch(pVar2, a2);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.bytedance.o.f fVar, androidx.appcompat.app.d dVar, a aVar, h.f.a.b bVar, h.f.a.a aVar2, h.f.a.b bVar2, int i2, h.f.b.g gVar) {
        this(fVar, dVar, aVar, (i2 & 8) != 0 ? null : bVar, (i2 & 16) != 0 ? null : aVar2, (i2 & 32) == 0 ? bVar2 : null);
    }

    static /* synthetic */ void setFilterChosenInternal$default(c cVar, FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                z3 = false;
            }
            if ((i2 & 32) != 0) {
                z4 = false;
            }
            cVar.setFilterChosenInternal(filterBean, str, z, z2, z3, z4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterChosenInternal");
    }
}
