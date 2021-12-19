package com.ss.android.ugc.aweme.qna.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.TuxStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

@com.bytedance.ies.powerpage.a.a
public class QuestionUnavailableFragment extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f119401e;

    static {
        Covode.recordClassIndex(77540);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f119401e == null) {
            this.f119401e = new SparseArray();
        }
        View view = (View) this.f119401e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f119401e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f119401e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionUnavailableFragment f119402a;

        static {
            Covode.recordClassIndex(77541);
        }

        a(QuestionUnavailableFragment questionUnavailableFragment) {
            this.f119402a = questionUnavailableFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e activity = this.f119402a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static final class c extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f119404a = new c();

        static {
            Covode.recordClassIndex(77543);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119405a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(c.f119404a);
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f119403a = new b();

        static {
            Covode.recordClassIndex(77542);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_error_qa;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxIconView) a(R.id.dek)).setOnClickListener(new a(this));
        TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(b.f119403a));
        String string = requireContext().getString(R.string.f4w);
        l.b(string, "");
        TuxStatusView.c a3 = a2.a((CharSequence) string);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 69.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        ((TuxStatusView) a(R.id.dgb)).setStatus(a3.b(a4, h.g.a.a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.arh, viewGroup, false);
    }
}
