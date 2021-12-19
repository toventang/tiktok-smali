package com.ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.ss.android.ugc.aweme.contentlanguage.d;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class k extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    public d f150603a;

    /* renamed from: b  reason: collision with root package name */
    public a f150604b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f150605c;

    public interface a {
        static {
            Covode.recordClassIndex(99038);
        }

        void a();

        void b();

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(99037);
    }

    private View a(int i2) {
        if (this.f150605c == null) {
            this.f150605c = new SparseArray();
        }
        View view = (View) this.f150605c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f150605c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f150605c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f150606a;

        static {
            Covode.recordClassIndex(99039);
        }

        b(k kVar) {
            this.f150606a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f150606a.f150604b;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f150607a;

        static {
            Covode.recordClassIndex(99040);
        }

        c(k kVar) {
            this.f150607a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f150607a.f150604b != null) {
                a aVar = this.f150607a.f150604b;
                if (aVar == null) {
                    l.b();
                }
                aVar.a();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        l.d(view, "");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.h_c);
        ((ImageView) view.findViewById(R.id.qb)).setOnClickListener(new b(this));
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) a(R.id.emo);
        if (buttonTitleBar == null) {
            l.b();
        }
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) a(R.id.emo);
        l.b(buttonTitleBar2, "");
        buttonTitleBar.setBackgroundColor(androidx.core.content.b.c(buttonTitleBar2.getContext(), R.color.f159928l));
        CommonItemView commonItemView = (CommonItemView) a(R.id.hh);
        if (commonItemView == null) {
            l.b();
        }
        commonItemView.setRightIconRes(0);
        RecyclerView recyclerView = (RecyclerView) a(R.id.hs);
        if (recyclerView == null) {
            l.b();
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f150603a = new d(getActivity());
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.hs);
        if (recyclerView2 == null) {
            l.b();
        }
        d dVar = this.f150603a;
        if (dVar == null) {
            l.a("mAdapter");
        }
        recyclerView2.setAdapter(dVar);
        ((CommonItemView) a(R.id.hh)).setOnClickListener(new c(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a1s, viewGroup, false);
    }
}
