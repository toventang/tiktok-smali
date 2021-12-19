package com.ss.android.ugc.aweme.discover.ui.e;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.discover.mixfeed.e.b;
import com.ss.android.ugc.aweme.discover.mixfeed.e.d;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.ss.android.ugc.aweme.discover.model.suicide.SearchDialInfo;
import com.ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo;
import com.ss.android.ugc.aweme.discover.ui.e.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.d.c;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class d extends g<SearchSuicideInfo> implements c {

    /* renamed from: d  reason: collision with root package name */
    public GlobalDoodleConfig f82564d;

    /* renamed from: e  reason: collision with root package name */
    LogPbBean f82565e = new LogPbBean();

    /* renamed from: f  reason: collision with root package name */
    public final b f82566f;

    static {
        Covode.recordClassIndex(51400);
    }

    @Override // com.ss.android.ugc.aweme.search.d.c
    public final void a() {
    }

    public final boolean l() {
        List list = this.f76354l;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SearchSuicideInfo) next).type == 5) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.d.c
    public final void a(com.ss.android.ugc.aweme.search.d.a aVar) {
        l.d(aVar, "");
        this.f82566f.a(aVar.f120990a, aVar.f120991b);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final int c(int i2) {
        return ((SearchSuicideInfo) this.f76354l.get(i2)).type;
    }

    public d(b bVar) {
        l.d(bVar, "");
        this.f82566f = bVar;
        new LinkedHashSet();
        this.s = new GridLayoutManager.c(this) {
            /* class com.ss.android.ugc.aweme.discover.ui.e.d.AnonymousClass1 */

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f82567e;

            /* renamed from: f  reason: collision with root package name */
            private final int f82568f = 1;

            /* renamed from: g  reason: collision with root package name */
            private final int f82569g = 2;

            static {
                Covode.recordClassIndex(51401);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82567e = r2;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (this.f82567e.c(i2) == 6) {
                    return this.f82568f;
                }
                return this.f82569g;
            }
        };
    }

    public final void a(SearchSuicideInfo searchSuicideInfo) {
        l.d(searchSuicideInfo, "");
        int indexOf = this.f76354l.indexOf(searchSuicideInfo);
        this.f76354l.remove(searchSuicideInfo);
        if (indexOf >= 0) {
            notifyItemRemoved(indexOf);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, (int) n.b(view.getContext(), 40.5f));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        l.d(view, "");
        return (int) n.b(view.getContext(), 95.0f);
    }

    private final r a(int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        q a2 = am.a();
        String str4 = "normal";
        if (a2 != null) {
            str2 = a2.c().f121172a;
            str3 = a2.c().f121173b;
            i3 = a2.a();
            str = a2.c().f121175d;
            str4 = a2.c().f121174c;
        } else {
            i3 = 0;
            str = str4;
            str2 = "";
            str3 = str2;
        }
        if (i2 % 10 == 0) {
            c.a.a("suicide");
        }
        LogPbBean logPbBean = this.f82565e;
        logPbBean.setImprId(str2);
        r f2 = r.a.a().f(j.a(i3));
        f2.f121266a = true;
        r g2 = f2.g(str2);
        String imprId = logPbBean.getImprId();
        l.b(imprId, "");
        r a3 = g2.h(imprId).i(str2).a(logPbBean);
        a3.f121267b = i3;
        a3.f121278m = i2;
        return a3.e(str3).k(str4).l(str);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<SearchSuicideInfo> list) {
        int i2;
        if (!(list == null || b.a((Collection) list))) {
            if (this.f76354l == null) {
                this.f76354l = new ArrayList();
            }
            List list2 = this.f76354l;
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            for (T t : list) {
                if (!this.f76354l.contains(t)) {
                    this.f76354l.add(t);
                }
            }
            notifyItemRangeInserted(i2, list.size());
        }
    }

    public final int a(String str) {
        String str2;
        l.d(str, "");
        if (this.f76354l != null && !this.f76354l.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.f76354l.size();
            for (int i2 = 0; i2 < size; i2++) {
                SearchSuicideInfo searchSuicideInfo = (SearchSuicideInfo) this.f76354l.get(i2);
                if (!(searchSuicideInfo == null || searchSuicideInfo.aweme == null)) {
                    Aweme aweme = searchSuicideInfo.aweme;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    } else {
                        str2 = null;
                    }
                    if (m.a(str, str2)) {
                        return i2;
                    }
                }
            }
        }
        return -1;
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f82570a;

        static {
            Covode.recordClassIndex(51402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewGroup viewGroup, View view) {
            super(view);
            this.f82570a = viewGroup;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        MethodCollector.i(636);
        l.d(viewGroup, "");
        switch (i2) {
            case 1:
                com.ss.android.ugc.aweme.discover.mixfeed.e.d a2 = d.a.a(viewGroup);
                MethodCollector.o(636);
                return a2;
            case 2:
            case 3:
                l.d(viewGroup, "");
                c cVar = new c(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awy), viewGroup);
                MethodCollector.o(636);
                return cVar;
            case 4:
                b bVar = this.f82566f;
                l.d(viewGroup, "");
                l.d(bVar, "");
                h hVar = new h(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.avm), bVar);
                MethodCollector.o(636);
                return hVar;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                com.ss.android.ugc.aweme.discover.mixfeed.e.b a3 = b.a.a(viewGroup);
                MethodCollector.o(636);
                return a3;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.axi, viewGroup, false);
                l.b(a4, "");
                com.ss.android.ugc.aweme.discover.n.c cVar2 = new com.ss.android.ugc.aweme.discover.n.c(a4, "selfharm", this);
                MethodCollector.o(636);
                return cVar2;
            default:
                a aVar = new a(viewGroup, new View(viewGroup.getContext()));
                MethodCollector.o(636);
                return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        SearchSuicideInfo searchSuicideInfo = (SearchSuicideInfo) this.f76354l.get(i2);
        SearchOperation searchOperation = 0;
        switch (c(i2)) {
            case 1:
                SearchOperation searchOperation2 = searchSuicideInfo.searchOperation;
                if (searchOperation2 != null) {
                    String uri = Uri.parse(searchOperation2.getLink()).buildUpon().appendQueryParameter("enter_from", "discover_page_banner").build().toString();
                    l.b(uri, "");
                    searchOperation2.setLink(uri);
                    searchOperation = searchOperation2;
                }
                r a2 = a(i2);
                com.ss.android.ugc.aweme.discover.mixfeed.e.d dVar = (com.ss.android.ugc.aweme.discover.mixfeed.e.d) viewHolder;
                if (searchOperation == null) {
                    l.b();
                }
                dVar.a(searchOperation);
                ((com.ss.android.ugc.aweme.discover.mixfeed.e.d) viewHolder).a(a2);
                dVar.a("tns_show_see_support_resources");
                return;
            case 2:
                r a3 = a(i2);
                c cVar = (c) viewHolder;
                SearchDialInfo searchDialInfo = searchSuicideInfo.searchDialInfo;
                if (searchDialInfo == null) {
                    l.b();
                }
                cVar.a(searchDialInfo, searchSuicideInfo.type);
                ((c) viewHolder).a(a3);
                cVar.a("tns_show_call_button");
                return;
            case 3:
                r a4 = a(i2);
                c cVar2 = (c) viewHolder;
                SearchDialInfo searchDialInfo2 = searchSuicideInfo.searchDialInfo;
                if (searchDialInfo2 == null) {
                    l.b();
                }
                cVar2.a(searchDialInfo2, searchSuicideInfo.type);
                ((c) viewHolder).a(a4);
                cVar2.a("tns_show_text_button");
                return;
            case 4:
                r a5 = a(i2);
                h hVar = (h) viewHolder;
                PleaseNotice pleaseNotice = searchSuicideInfo.pleaseNotice;
                if (pleaseNotice == null) {
                    l.b();
                }
                l.d(pleaseNotice, "");
                String str = pleaseNotice.text;
                if (str != null) {
                    View view = hVar.itemView;
                    l.b(view, "");
                    ((TuxTextView) view.findViewById(R.id.d6d)).setText(str);
                }
                String str2 = pleaseNotice.buttonText;
                if (str2 != null) {
                    View view2 = hVar.itemView;
                    l.b(view2, "");
                    ((TuxTextView) view2.findViewById(R.id.e44)).setText(str2);
                }
                View view3 = hVar.itemView;
                l.b(view3, "");
                ((TuxTextView) view3.findViewById(R.id.e44)).setOnClickListener(new h.b(hVar));
                ((h) viewHolder).a(a5);
                hVar.a("tns_show_showresults_button");
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                String string = com.bytedance.lighten.a.h.f39857a.getString(R.string.fhm);
                l.b(string, "");
                ((com.ss.android.ugc.aweme.discover.mixfeed.e.b) viewHolder).b(string);
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                r a6 = a(i2);
                if (viewHolder instanceof com.ss.android.ugc.aweme.discover.n.c) {
                    searchOperation = viewHolder;
                }
                com.ss.android.ugc.aweme.discover.n.c cVar3 = (com.ss.android.ugc.aweme.discover.n.c) searchOperation;
                if (cVar3 != null) {
                    cVar3.a(searchSuicideInfo.aweme, i2, cVar3.getAdapterPosition(), true);
                    ((com.ss.android.ugc.aweme.discover.n.c) viewHolder).a(a6);
                    cVar3.a("tns_aid_search");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
