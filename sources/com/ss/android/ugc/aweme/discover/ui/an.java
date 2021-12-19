package com.ss.android.ugc.aweme.discover.ui;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.ui.Dialog.d;
import com.ss.android.ugc.aweme.search.g.e;
import com.ss.android.ugc.aweme.search.g.g;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.f;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.ec;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.b f82294a;

    /* renamed from: b  reason: collision with root package name */
    public String f82295b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f82296c = "";

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.d f82297d;

    /* renamed from: e  reason: collision with root package name */
    public d.b f82298e;

    /* renamed from: f  reason: collision with root package name */
    private final h f82299f = ec.a(new a(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f82300g = ec.a(new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f82301h = ec.a(new c(this));

    static {
        Covode.recordClassIndex(51223);
    }

    private final View.OnClickListener d() {
        return (View.OnClickListener) this.f82299f.getValue();
    }

    public final com.ss.android.ugc.aweme.discover.ui.a.b.a.a b() {
        return (com.ss.android.ugc.aweme.discover.ui.a.b.a.a) this.f82300g.getValue();
    }

    public final com.ss.android.ugc.aweme.discover.ui.a.b c() {
        return (com.ss.android.ugc.aweme.discover.ui.a.b) this.f82301h.getValue();
    }

    static final class a extends m implements h.f.a.a<View.OnClickListener> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(51224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View.OnClickListener invoke() {
            return new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.an.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f82302a;

                static {
                    Covode.recordClassIndex(51225);
                }

                {
                    this.f82302a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
                    if (r0 == null) goto L_0x005f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
                    if (r0 == null) goto L_0x0034;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r7) {
                    /*
                    // Method dump skipped, instructions count: 310
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.an.a.AnonymousClass1.onClick(android.view.View):void");
                }
            };
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.ui.a.b.a.a> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(51226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.a.b.a.a invoke() {
            return com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(this.this$0.f82296c);
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.ui.a.b> {
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(51227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(an anVar) {
            super(0);
            this.this$0 = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.a.b invoke() {
            com.ss.android.ugc.aweme.discover.ui.a.b bVar = new com.ss.android.ugc.aweme.discover.ui.a.b();
            bVar.f82203a = new e(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.an.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f82303a;

                static {
                    Covode.recordClassIndex(51228);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82303a = r1;
                }

                @Override // com.ss.android.ugc.aweme.search.g.e
                public final void a(com.ss.android.ugc.aweme.search.g.b bVar) {
                    l.d(bVar, "");
                    this.f82303a.this$0.f82294a = bVar;
                }
            };
            return bVar;
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.search.g.a aVar;
        com.ss.android.ugc.aweme.search.g.c cVar;
        com.ss.android.ugc.aweme.search.g.c cVar2;
        com.ss.android.ugc.aweme.discover.ui.a.b c2 = c();
        if (c2 != null) {
            c2.c();
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a b2 = b();
        if (!(b2 == null || (cVar2 = b2.f82216b) == null)) {
            cVar2.reset();
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a b3 = b();
        if (!(b3 == null || (cVar = b3.f82217c) == null)) {
            cVar.reset();
        }
        com.ss.android.ugc.aweme.discover.ui.a.b.a.a b4 = b();
        if (b4 != null && (aVar = b4.f82218d) != null) {
            aVar.reset();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ an f82304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f82305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.a.b.a.a f82306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.a.b f82307d;

        static {
            Covode.recordClassIndex(51229);
        }

        d(an anVar, androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.discover.ui.a.b.a.a aVar, com.ss.android.ugc.aweme.discover.ui.a.b bVar) {
            this.f82304a = anVar;
            this.f82305b = eVar;
            this.f82306c = aVar;
            this.f82307d = bVar;
        }

        public final void onClick(View view) {
            ad adVar;
            int i2;
            String str;
            String str2;
            String searchId;
            ClickAgent.onClick(view);
            String str3 = "";
            l.d("close_filter", str3);
            q a2 = am.a();
            String str4 = null;
            if (a2 != null) {
                adVar = a2.c();
            } else {
                adVar = null;
            }
            f fVar = new f();
            q a3 = am.a();
            if (a3 != null) {
                i2 = a3.a();
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.search.k.c f2 = fVar.f(j.a(i2));
            if (adVar != null) {
                str = adVar.f121173b;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.search.k.c b2 = f2.b(str);
            if (adVar != null) {
                str4 = adVar.f121172a;
            }
            com.ss.android.ugc.aweme.metrics.c a4 = ((f) b2.a(str4)).r("by_all").a("button_type", "close_filter");
            com.ss.android.ugc.aweme.search.n.h b3 = d.a.b();
            if (b3 == null || (str2 = b3.getSearchKeyword()) == null) {
                str2 = str3;
            }
            com.ss.android.ugc.aweme.metrics.c a5 = a4.a("search_keyword_x", str2);
            com.ss.android.ugc.aweme.search.n.h b4 = d.a.b();
            if (!(b4 == null || (searchId = b4.getSearchId()) == null)) {
                str3 = searchId;
            }
            a5.a("search_id_x", str3).f();
        }
    }

    public static void a(com.ss.android.ugc.aweme.search.g.b bVar) {
        int i2;
        Map<String, String> map;
        Map<String, String> map2;
        String str;
        List<com.ss.android.ugc.aweme.search.g.h> activitySwitchOption;
        String str2;
        String searchId;
        g sortTypeStruct;
        g filterByStruct;
        q a2 = am.a();
        String str3 = null;
        ad c2 = a2 != null ? a2.c() : null;
        com.ss.android.ugc.aweme.search.k.e eVar = new com.ss.android.ugc.aweme.search.k.e();
        q a3 = am.a();
        if (a3 != null) {
            i2 = a3.a();
        } else {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.search.k.c b2 = eVar.f(j.a(i2)).b(c2 != null ? c2.f121173b : null);
        if (c2 != null) {
            str3 = c2.f121172a;
        }
        com.ss.android.ugc.aweme.search.k.c a4 = b2.a(str3);
        if (bVar == null || (filterByStruct = bVar.getFilterByStruct()) == null || (map = filterByStruct.getLogInfo()) == null) {
            map = new LinkedHashMap<>();
        }
        com.ss.android.ugc.aweme.search.k.b b3 = a4.b(map);
        if (bVar == null || (sortTypeStruct = bVar.getSortTypeStruct()) == null || (map2 = sortTypeStruct.getLogInfo()) == null) {
            map2 = new LinkedHashMap<>();
        }
        com.ss.android.ugc.aweme.search.k.b b4 = b3.b(map2);
        com.ss.android.ugc.aweme.search.n.h b5 = d.a.b();
        String str4 = "";
        if (b5 == null || (str = b5.getSearchKeyword()) == null) {
            str = str4;
        }
        com.ss.android.ugc.aweme.search.k.b c3 = b4.c("search_keyword_x", str);
        com.ss.android.ugc.aweme.search.n.h b6 = d.a.b();
        if (!(b6 == null || (searchId = b6.getSearchId()) == null)) {
            str4 = searchId;
        }
        com.ss.android.ugc.aweme.search.k.b c4 = c3.c("search_id_x", str4);
        if (!(bVar == null || (activitySwitchOption = bVar.getActivitySwitchOption()) == null)) {
            for (T t : activitySwitchOption) {
                String logInfo = t.getLogInfo();
                if (t.isSelected()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                c4.a(logInfo, str2);
            }
        }
        c4.f();
    }

    public final void a(String str, androidx.fragment.app.e eVar) {
        String str2;
        String str3;
        Resources resources;
        String string;
        Resources resources2;
        Resources resources3;
        String str4 = "";
        l.d(str, str4);
        this.f82296c = str;
        d.b bVar = new d.b();
        if (eVar == null || (resources3 = eVar.getResources()) == null || (str2 = resources3.getString(R.string.dc8)) == null) {
            str2 = str4;
        }
        bVar.a(str2);
        bVar.f82120b = com.ss.android.ugc.aweme.discover.helper.c.a(eVar, b(), false);
        if (eVar == null || (resources2 = eVar.getResources()) == null || (str3 = resources2.getString(R.string.a9k)) == null) {
            str3 = str4;
        }
        bVar.b(str3);
        if (!(eVar == null || (resources = eVar.getResources()) == null || (string = resources.getString(R.string.v9)) == null)) {
            str4 = string;
        }
        bVar.c(str4);
        bVar.f82127i = d();
        bVar.f82126h = false;
        bVar.f82125g = R.color.bz;
        bVar.f82124f = R.color.bh;
        bVar.f82128j = com.ss.android.ugc.aweme.discover.helper.c.a(b());
        this.f82298e = bVar;
    }

    public final void a(boolean z, androidx.fragment.app.e eVar, int i2, com.ss.android.ugc.aweme.search.model.d dVar, boolean z2) {
        String str;
        String str2;
        String str3;
        boolean z3;
        String str4;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam;
        String enterSearchFrom;
        com.ss.android.ugc.aweme.search.model.b searchEnterParam2;
        ad b2;
        com.ss.android.ugc.aweme.discover.ui.a.b c2 = c();
        if (c2 != null && eVar != null) {
            String a2 = j.a(i2);
            p[] pVarArr = new p[4];
            q a3 = am.a(eVar.hashCode());
            String str5 = "";
            if (a3 == null || (b2 = a3.b(i2)) == null || (str = b2.f121172a) == null) {
                str = str5;
            }
            pVarArr[0] = v.a("search_id", str);
            pVarArr[1] = v.a("search_type", j.a(i2));
            if (dVar == null || (str2 = dVar.getKeyword()) == null) {
                str2 = str5;
            }
            pVarArr[2] = v.a("search_keyword", str2);
            if (dVar == null || (searchEnterParam2 = dVar.getSearchEnterParam()) == null || (str3 = searchEnterParam2.getEnterSearchFrom()) == null) {
                str3 = str5;
            }
            pVarArr[3] = v.a("enter_from", str3);
            Map b3 = ag.b(pVarArr);
            if (z == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.ss.android.ugc.aweme.discover.helper.v.a(new i.a(eVar, c2, a2, b3, z, z3));
            JSONObject jSONObject = new JSONObject();
            if (!(dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null)) {
                str5 = enterSearchFrom;
            }
            jSONObject.put("enter_from", str5);
            com.ss.android.ugc.aweme.search.n.f b4 = d.a.b(eVar);
            if (b4 == null || (searchCommonModel = b4.getSearchCommonModel()) == null) {
                str4 = null;
            } else {
                str4 = searchCommonModel.getEnterFrom();
            }
            jSONObject.put("enter_from_x", str4);
            c.a.a("ref_search_bottom_dialog_update", jSONObject, h.a.am.c("enter_from"));
        }
    }
}
