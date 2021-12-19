package com.ss.android.ugc.aweme.filter.repository.a.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(60543);
    }

    static final class a extends m implements h.f.a.b<FilterBean, Boolean> {
        final /* synthetic */ FilterBean $filterBean$inlined;

        static {
            Covode.recordClassIndex(60544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FilterBean filterBean) {
            super(1);
            this.$filterBean$inlined = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FilterBean filterBean) {
            boolean z;
            FilterBean filterBean2 = filterBean;
            l.d(filterBean2, "");
            if (filterBean2.getId() == this.$filterBean$inlined.getId()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final List<FilterBean> a(q qVar) {
        l.d(qVar, "");
        List<FilterBean> value = qVar.b().getValue();
        if (value == null) {
            return z.INSTANCE;
        }
        return value;
    }

    public static final class b<T> implements u<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f95536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f95537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f95538c;

        static {
            Covode.recordClassIndex(60545);
        }

        public b(h.f.a.b bVar, String str, String str2) {
            this.f95536a = bVar;
            this.f95537b = str;
            this.f95538c = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            T t;
            Integer e2;
            List<? extends FilterBean> list2 = list;
            h.f.a.b bVar = this.f95536a;
            l.b(list2, "");
            Iterator<T> it = list2.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
                T t2 = t;
                if (l.a((Object) t2.getResId(), (Object) this.f95537b)) {
                    break;
                }
                int id = t2.getId();
                String str = this.f95538c;
                if (str != null && (e2 = p.e(str)) != null && id == e2.intValue()) {
                    break;
                }
            }
            bVar.invoke(t);
        }
    }

    public static final float a(com.ss.android.ugc.aweme.filter.repository.a.m mVar, FilterBean filterBean) {
        int a2;
        l.d(mVar, "");
        l.d(filterBean, "");
        if (mVar instanceof n) {
            a2 = ((n) mVar).a(filterBean, mVar.a());
        } else {
            a2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, mVar.a(filterBean), mVar.a());
        }
        return ((float) a2) / 100.0f;
    }

    public static final FilterBean b(q qVar, int i2) {
        l.d(qVar, "");
        List<FilterBean> value = qVar.b().getValue();
        T t = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getId() == i2) {
                t = next;
                break;
            }
        }
        return t;
    }

    public static final int a(q qVar, FilterBean filterBean) {
        List<FilterBean> value;
        l.d(qVar, "");
        if (!(filterBean == null || (value = qVar.b().getValue()) == null)) {
            Iterator<FilterBean> it = value.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (l.a(it.next(), filterBean)) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public static final EffectCategoryResponse b(q qVar, FilterBean filterBean) {
        l.d(qVar, "");
        l.d(filterBean, "");
        List<h.p<EffectCategoryResponse, List<FilterBean>>> value = qVar.c().getValue();
        if (value == null) {
            return null;
        }
        l.b(value, "");
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) a.a((List) value, (h.f.a.b) new a(filterBean));
        if (effectCategoryResponse != null) {
            return effectCategoryResponse;
        }
        h.p pVar = (h.p) h.a.n.b((List) value, 0);
        if (pVar != null) {
            return (EffectCategoryResponse) pVar.getFirst();
        }
        return null;
    }

    public static final FilterBean a(q qVar, int i2) {
        int i3;
        FilterBean filterBean;
        l.d(qVar, "");
        List<FilterBean> value = qVar.b().getValue();
        if (value != null) {
            i3 = value.size();
        } else {
            i3 = 0;
        }
        int a2 = androidx.core.b.a.a(i2, 0, Math.max(i3 - 1, 0));
        if (value == null || (filterBean = (FilterBean) h.a.n.b((List) value, a2)) == null) {
            return a.a();
        }
        return filterBean;
    }

    public static final FilterBean a(q qVar, String str) {
        l.d(qVar, "");
        l.d(str, "");
        List<FilterBean> value = qVar.b().getValue();
        T t = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.getResId(), (Object) str)) {
                t = next;
                break;
            }
        }
        return t;
    }

    public static final boolean a(o oVar, FilterBean filterBean) {
        g gVar;
        l.d(oVar, "");
        if (filterBean != null) {
            gVar = oVar.b(filterBean.getId());
        } else {
            gVar = null;
        }
        if (gVar == g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return true;
        }
        return false;
    }
}
