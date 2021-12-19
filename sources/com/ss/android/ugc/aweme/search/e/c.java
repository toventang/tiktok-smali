package com.ss.android.ugc.aweme.search.e;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.bytedance.lynx.hybrid.f;
import com.bytedance.lynx.hybrid.j;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import h.f.b.l;

public final class c implements com.ss.android.ugc.aweme.search.i.c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f121003a = new a((byte) 0);

    static {
        Covode.recordClassIndex(78828);
    }

    static final class a {
        static {
            Covode.recordClassIndex(78829);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.bytedance.hybrid.spark.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f121004a;

        static {
            Covode.recordClassIndex(78830);
        }

        b(String str) {
            this.f121004a = str;
        }

        @Override // com.bytedance.hybrid.spark.a.b
        public final void a(f fVar) {
            l.d(fVar, "");
            if (!(fVar instanceof j)) {
                fVar = null;
            }
            j jVar = (j) fVar;
            if (jVar != null) {
                jVar.f41007k = TemplateData.a(this.f121004a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.i.c
    public final void a(com.ss.android.ugc.aweme.search.i.a aVar) {
        e eVar;
        d dVar;
        String schema;
        boolean z;
        boolean z2;
        l.d(aVar, "");
        if (e.a() && (eVar = aVar.f121147a) != null && (dVar = aVar.f121148b) != null && (schema = dVar.getSchema()) != null) {
            String rawData = aVar.f121148b.getRawData();
            if (!d.c()) {
                b.a((a) new g().c("fail_type", "1"), rawData);
                return;
            }
            ac a2 = ae.a(aVar.f121147a, (ad.b) null).a(SearchIntermediateViewModel.class);
            l.b(a2, "");
            SearchIntermediateViewModel searchIntermediateViewModel = (SearchIntermediateViewModel) a2;
            Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
            if (value != null && value.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (com.ss.android.ugc.aweme.search.j.f121154b >= 0) {
                Integer value2 = searchIntermediateViewModel.getSearchTabIndex().getValue();
                int i2 = com.ss.android.ugc.aweme.search.j.f121154b;
                if (value2 != null && value2.intValue() == i2) {
                    z2 = true;
                    searchIntermediateViewModel.getSearchTabIndex().getValue();
                    if (!z && z2) {
                        c.a.a(eVar, new SparkContext().a(schema).a(new b(rawData))).a();
                        b.a(new f(), rawData);
                        return;
                    }
                }
            }
            z2 = false;
            searchIntermediateViewModel.getSearchTabIndex().getValue();
            if (!z) {
            }
        }
    }
}
