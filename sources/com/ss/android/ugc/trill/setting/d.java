package com.ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f150581a = i.a((h.f.a.a) new f(this));

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f150582b;

    static {
        Covode.recordClassIndex(99019);
    }

    public final View a(int i2) {
        if (this.f150582b == null) {
            this.f150582b = new SparseArray();
        }
        View view = (View) this.f150582b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f150582b.put(i2, findViewById);
        return findViewById;
    }

    public final ContentPreferenceViewModel a() {
        return (ContentPreferenceViewModel) this.f150581a.getValue();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f150582b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class f extends m implements h.f.a.a<ContentPreferenceViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(99025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
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

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onDetach() {
        Integer valueOf;
        super.onDetach();
        t<Integer> b2 = a().b();
        if (com.ss.android.ugc.aweme.compliance.api.a.e().d() == 0) {
            valueOf = com.ss.android.ugc.aweme.compliance.api.a.e().g();
        } else {
            valueOf = Integer.valueOf(com.ss.android.ugc.aweme.compliance.api.a.e().d());
        }
        b2.setValue(valueOf);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150583a;

        static {
            Covode.recordClassIndex(99020);
        }

        a(d dVar) {
            this.f150583a = dVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f150583a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.c();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150585a;

        static {
            Covode.recordClassIndex(99022);
        }

        c(d dVar) {
            this.f150585a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f150585a.a().a(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC4056d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150586a;

        static {
            Covode.recordClassIndex(99023);
        }

        View$OnClickListenerC4056d(d dVar) {
            this.f150586a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f150586a.a().a(2);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150587a;

        static {
            Covode.recordClassIndex(99024);
        }

        e(d dVar) {
            this.f150587a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f150587a.a().a(3);
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f150584a;

        static {
            Covode.recordClassIndex(99021);
        }

        b(d dVar) {
            this.f150584a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.j6)).setSelect(true);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czp)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czq)).setSelect(false);
                } else if (num.intValue() == 2) {
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.j6)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czp)).setSelect(true);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czq)).setSelect(false);
                } else if (num.intValue() == 3) {
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.j6)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czp)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f150584a.a(R.id.czq)).setSelect(true);
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        l.d(view, "");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.fmt);
        ((ImageView) view.findViewById(R.id.qb)).setOnClickListener(new a(this));
        a().b().observe(this, new b(this));
        ((ChooseOneOfMultiItemView) a(R.id.j6)).setOnClickListener(new c(this));
        ((ChooseOneOfMultiItemView) a(R.id.czp)).setOnClickListener(new View$OnClickListenerC4056d(this));
        ((ChooseOneOfMultiItemView) a(R.id.czq)).setOnClickListener(new e(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a1v, viewGroup, false);
    }
}
