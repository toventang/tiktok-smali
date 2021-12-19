package com.ss.android.ugc.aweme.compliance.privacy.settings.account.a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.b;
import com.bytedance.tux.navigation.a.c;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public abstract class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f77469a;

    static {
        Covode.recordClassIndex(47923);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public View a(int i2) {
        if (this.f77469a == null) {
            this.f77469a = new SparseArray();
        }
        View view = (View) this.f77469a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77469a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public void b() {
        SparseArray sparseArray = this.f77469a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract List<b> c();

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(47924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        String string = getString(i2);
        l.b(string, "");
        l.d(string, "");
        ((TuxNavBar) a(R.id.emo)).a(new g().a(string));
    }

    /* access modifiers changed from: protected */
    public final void a(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.epb);
        if (tuxTextView == null) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            tuxTextView.setVisibility(8);
            return;
        }
        tuxTextView.setVisibility(0);
        tuxTextView.setText(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxNavBar) a(R.id.emo)).a((c) new b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new a(this)));
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        List<b> c2 = c();
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView3, "");
        recyclerView3.setAdapter(new com.ss.android.ugc.aweme.compliance.privacy.b.a.a(c2));
    }
}
