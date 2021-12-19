package com.ss.android.ugc.aweme.discover.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.b;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class SearchEnterViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, b> f82792b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final a f82793c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f82794a;

    public static final class a {
        static {
            Covode.recordClassIndex(51575);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static SearchEnterViewModel a(e eVar) {
            if (eVar == null) {
                return new SearchEnterViewModel();
            }
            ac a2 = ae.a(eVar, (ad.b) null).a(SearchEnterViewModel.class);
            l.b(a2, "");
            SearchEnterViewModel searchEnterViewModel = (SearchEnterViewModel) a2;
            if (searchEnterViewModel.f82794a == null) {
                searchEnterViewModel.f82794a = b(eVar);
            }
            return searchEnterViewModel;
        }

        public static b b(e eVar) {
            if (eVar == null) {
                return null;
            }
            b bVar = SearchEnterViewModel.f82792b.get(Integer.valueOf(eVar.hashCode()));
            if (bVar != null) {
                return bVar;
            }
            return ((SearchEnterViewModel) ae.a(eVar, (ad.b) null).a(SearchEnterViewModel.class)).f82794a;
        }
    }

    public final boolean a() {
        b bVar = this.f82794a;
        if (bVar == null || !bVar.isSetHintBySugWord()) {
            return false;
        }
        return true;
    }

    public final b b() {
        b bVar = this.f82794a;
        if (bVar == null) {
            return new b();
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(51574);
    }

    public final void a(e eVar, b bVar) {
        if (bVar != null && eVar != null) {
            this.f82794a = bVar;
            f82792b.put(Integer.valueOf(eVar.hashCode()), bVar);
        }
    }
}
