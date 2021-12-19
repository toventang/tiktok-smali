package com.ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.trill.setting.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    public k.a f150571a;

    /* renamed from: b  reason: collision with root package name */
    private final h f150572b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f150573c;

    static {
        Covode.recordClassIndex(99011);
    }

    public final View a(int i2) {
        if (this.f150573c == null) {
            this.f150573c = new SparseArray();
        }
        View view = (View) this.f150573c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f150573c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f150573c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class a extends m implements h.f.a.a<ContentPreferenceViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(99012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ContentPreferenceViewModel invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                l.b();
            }
            return ae.a(activity, (ad.b) null).a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$b  reason: collision with other inner class name */
    public static final class C4055b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150574a;

        static {
            Covode.recordClassIndex(99013);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4055b(b bVar) {
            this.f150574a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            k.a aVar = this.f150574a.f150571a;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150575a;

        static {
            Covode.recordClassIndex(99014);
        }

        c(b bVar) {
            this.f150575a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k.a aVar = this.f150575a.f150571a;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150576a;

        static {
            Covode.recordClassIndex(99015);
        }

        d(b bVar) {
            this.f150576a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k.a aVar = this.f150576a.f150571a;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150577a;

        static {
            Covode.recordClassIndex(99016);
        }

        e(b bVar) {
            this.f150577a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k.a aVar = this.f150577a.f150571a;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150578a;

        static {
            Covode.recordClassIndex(99017);
        }

        f(b bVar) {
            this.f150578a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    ((CommonItemView) this.f150578a.a(R.id.d6k)).setRightText(this.f150578a.getString(R.string.fmu));
                } else if (num.intValue() == 2) {
                    ((CommonItemView) this.f150578a.a(R.id.d6k)).setRightText(this.f150578a.getString(R.string.fmx));
                } else if (num.intValue() == 3) {
                    ((CommonItemView) this.f150578a.a(R.id.d6k)).setRightText(this.f150578a.getString(R.string.bw7));
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ButtonTitleBar) a(R.id.em8)).setOnTitleBarClickListener(new C4055b(this));
        ((CommonItemView) a(R.id.fgi)).setOnClickListener(new c(this));
        if (z.f105220a.a(false)) {
            CommonItemView commonItemView = (CommonItemView) a(R.id.fcd);
            l.b(commonItemView, "");
            commonItemView.setVisibility(0);
            ((CommonItemView) a(R.id.fcd)).setOnClickListener(new d(this));
        } else {
            CommonItemView commonItemView2 = (CommonItemView) a(R.id.fcd);
            l.b(commonItemView2, "");
            commonItemView2.setVisibility(8);
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.e().a() && !com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            CommonItemView commonItemView3 = (CommonItemView) a(R.id.d6k);
            l.b(commonItemView3, "");
            commonItemView3.setVisibility(0);
            ((CommonItemView) a(R.id.d6k)).setOnClickListener(new e(this));
            ((ContentPreferenceViewModel) this.f150572b.getValue()).b().observe(this, new f(this));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0t, viewGroup, false);
    }
}
