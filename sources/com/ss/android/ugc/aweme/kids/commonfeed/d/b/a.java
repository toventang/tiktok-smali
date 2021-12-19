package com.ss.android.ugc.aweme.kids.commonfeed.d.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.ss.android.ugc.aweme.kids.commonfeed.b.c;
import com.ss.android.ugc.aweme.kids.commonfeed.report.b;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.d;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f106013a;

    /* renamed from: b  reason: collision with root package name */
    private c f106014b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.kids.commonfeed.d.a.a> f106015c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private HashMap f106016d;

    static {
        Covode.recordClassIndex(67824);
    }

    private View a(int i2) {
        if (this.f106016d == null) {
            this.f106016d = new HashMap();
        }
        View view = (View) this.f106016d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f106016d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f106016d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106017a;

        static {
            Covode.recordClassIndex(67826);
        }

        b(a aVar) {
            this.f106017a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106017a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_aweme");
        } else {
            serializable = null;
        }
        Aweme aweme = (Aweme) serializable;
        this.f106013a = aweme;
        if (aweme != null) {
            com.ss.android.ugc.aweme.kids.commonfeed.d.a.a aVar = new com.ss.android.ugc.aweme.kids.commonfeed.d.a.a();
            aVar.f106010a = new C2701a(this);
            this.f106015c.add(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.d.b.a$a  reason: collision with other inner class name */
    static final class C2701a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(67825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2701a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            e activity = this.this$0.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            Aweme aweme = this.this$0.f106013a;
            if (aweme == null) {
                l.b();
            }
            String aid = aweme.getAid();
            l.b(aid, "");
            Aweme aweme2 = this.this$0.f106013a;
            if (aweme2 == null) {
                l.b();
            }
            String authorUid = aweme2.getAuthorUid();
            l.b(authorUid, "");
            l.d(activity, "");
            l.d(aid, "");
            l.d(authorUid, "");
            f.a("show_report_reason", new com.ss.android.ugc.aweme.app.f.c().a("object_type", "video").a());
            KMReportReason b2 = KidsComplianceServiceImpl.c().b();
            if (b2 != null) {
                for (com.ss.android.ugc.aweme.kids.common.response.a aVar : b2.getVideo()) {
                    if (!TextUtils.isEmpty(aVar.f105899b)) {
                        com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a.add(new com.ss.android.ugc.aweme.kids.commonfeed.report.a.a(aVar.f105900c, null, aVar.f105899b, aVar.f105898a));
                    }
                }
            } else {
                List<com.ss.android.ugc.aweme.kids.commonfeed.report.a.a> list = com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a;
                String b3 = h.b(R.string.ctu);
                l.b(b3, "");
                list.add(new com.ss.android.ugc.aweme.kids.commonfeed.report.a.a(null, 2131233044, b3, 99901));
                List<com.ss.android.ugc.aweme.kids.commonfeed.report.a.a> list2 = com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a;
                String b4 = h.b(R.string.cts);
                l.b(b4, "");
                list2.add(new com.ss.android.ugc.aweme.kids.commonfeed.report.a.a(null, 2131233045, b4, 99902));
                List<com.ss.android.ugc.aweme.kids.commonfeed.report.a.a> list3 = com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a;
                String b5 = h.b(R.string.ctr);
                l.b(b5, "");
                list3.add(new com.ss.android.ugc.aweme.kids.commonfeed.report.a.a(null, 2131233046, b5, 99903));
            }
            com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106169c = new d(activity, com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a);
            com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) a.C1094a.a(activity).a(R.string.ctt);
            d dVar = com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106169c;
            if (dVar == null) {
                l.a("reportReasonReasonList");
            }
            com.bytedance.tux.dialog.a a2 = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.e.a(com.bytedance.tux.dialog.a.c.a(bVar, dVar), new b.d(activity, aid, authorUid)).b(b.e.f106178a).a(b.f.f106180a)).a();
            a2.b().show();
            for (com.ss.android.ugc.aweme.kids.commonfeed.report.a.a aVar2 : com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a) {
                aVar2.f106160a = new b.c(aVar2, a2);
            }
            com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106167a.clear();
            com.ss.android.ugc.aweme.kids.commonfeed.report.b.f106168b.clear();
            com.ss.android.ugc.aweme.app.f.c a3 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "homepage_menu");
            Aweme aweme3 = this.this$0.f106013a;
            if (aweme3 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.app.f.c a4 = a3.a("group_id", aweme3.getAid());
            Aweme aweme4 = this.this$0.f106013a;
            if (aweme4 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.app.f.c a5 = a4.a("author_id", aweme4.getAuthorUid());
            Aweme aweme5 = this.this$0.f106013a;
            if (aweme5 == null) {
                l.b();
            }
            f.a("click_report", a5.a("log_pb", aweme5.getLogPbString()).a());
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        c cVar = new c(context);
        this.f106014b = cVar;
        List<com.ss.android.ugc.aweme.kids.commonfeed.d.a.a> list = this.f106015c;
        l.d(list, "");
        cVar.f105998a.clear();
        cVar.f105998a.addAll(list);
        cVar.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) a(R.id.co5);
        l.b(recyclerView, "");
        recyclerView.setAdapter(this.f106014b);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((TuxTextView) a(R.id.y4)).setOnClickListener(new b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(8288);
        l.d(layoutInflater, "");
        View inflate = View.inflate(getContext(), R.layout.acw, viewGroup);
        MethodCollector.o(8288);
        return inflate;
    }
}
