package com.ss.android.ugc.aweme.discover.model.tab;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.base.utils.o;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class SearchTabViewModel extends ac {
    public static final Companion Companion = new Companion(null);
    public final NextLiveData<ai> tabInfo = new NextLiveData<>();

    static {
        Covode.recordClassIndex(51003);
    }

    public static final void addObserver(View view, m mVar, b<? super ai, z> bVar) {
        Companion.addObserver(view, mVar, bVar);
    }

    public static final SearchTabViewModel from(View view) {
        return Companion.from(view);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(51004);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static ad com_ss_android_ugc_aweme_discover_model_tab_SearchTabViewModel$Companion_androidx_lifecycle_VScopeLancet_of(e eVar) {
            return ae.a(eVar, (ad.b) null);
        }

        public final SearchTabViewModel from(View view) {
            l.d(view, "");
            Activity d2 = o.d(view);
            Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a2 = com_ss_android_ugc_aweme_discover_model_tab_SearchTabViewModel$Companion_androidx_lifecycle_VScopeLancet_of((e) d2).a(SearchTabViewModel.class);
            l.b(a2, "");
            return (SearchTabViewModel) a2;
        }

        public final void addObserver(View view, m mVar, b<? super ai, z> bVar) {
            l.d(view, "");
            l.d(mVar, "");
            l.d(bVar, "");
            from(view).tabInfo.observe(mVar, new SearchObserver().setListener(bVar), true);
        }
    }

    public static final class SearchObserver implements u<ai> {
        private b<? super ai, z> listener = SearchTabViewModel$SearchObserver$listener$1.INSTANCE;

        static {
            Covode.recordClassIndex(51005);
        }

        public final SearchObserver setListener(b<? super ai, z> bVar) {
            l.d(bVar, "");
            this.listener = bVar;
            return this;
        }

        public final void onChanged(ai aiVar) {
            if (aiVar != null) {
                this.listener.invoke(aiVar);
            }
        }
    }
}
