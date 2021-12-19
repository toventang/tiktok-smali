package com.ss.android.ugc.aweme.story.archive;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

@com.bytedance.ies.powerpage.a.a
public final class StoryArchiveFragment extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    private final h f136734e = RouteArgExtension.INSTANCE.optionalArgNotNull(this, a.f136736a, "enter_from", String.class);

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f136735f;

    static {
        Covode.recordClassIndex(89316);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f136735f == null) {
            this.f136735f = new SparseArray();
        }
        View view = (View) this.f136735f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f136735f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f136735f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ StoryArchiveFragment this$0;

        static {
            Covode.recordClassIndex(89318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryArchiveFragment storyArchiveFragment) {
            super(0);
            this.this$0 = storyArchiveFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136736a = new a();

        static {
            Covode.recordClassIndex(89317);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "profile";
        }
    }

    static final class c extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f136737a = new c();

        static {
            Covode.recordClassIndex(89319);
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
            baseFragmentViewModel2.config(AnonymousClass1.f136738a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(c.f136737a);
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ StoryArchiveFragment this$0;

        static {
            Covode.recordClassIndex(89321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StoryArchiveFragment storyArchiveFragment) {
            super(1);
            this.this$0 = storyArchiveFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f136739a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.g83)) == null) {
            str = "Stories archive";
        }
        l.b(str, "");
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_chevron_left_offset_ltr);
        a2.f45194b = true;
        ((TuxNavBar) a(R.id.csl)).setNavActions(aVar.a(a2.a((h.f.a.a<z>) new b(this))).a(new g().a(str)));
        com.bytedance.assem.arch.extensions.d.a(this, new d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b25, viewGroup, false);
    }
}
