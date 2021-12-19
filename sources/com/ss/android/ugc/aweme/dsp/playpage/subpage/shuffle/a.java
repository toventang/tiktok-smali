package com.ss.android.ugc.aweme.dsp.playpage.subpage.shuffle;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.playerservice.c.e;
import com.ss.android.ugc.aweme.dsp.playerservice.e.d;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import com.ss.android.ugc.aweme.dsp.ui.DspLoadMoreFrameLayout;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.dsp.playpage.base.a {
    public static final C2002a v = new C2002a((byte) 0);
    private SparseArray w;

    static {
        Covode.recordClassIndex(52347);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public final View a(int i2) {
        if (this.w == null) {
            this.w = new SparseArray();
        }
        View view = (View) this.w.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.w.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public final void br_() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.subpage.shuffle.a$a  reason: collision with other inner class name */
    public static final class C2002a {
        static {
            Covode.recordClassIndex(52348);
        }

        private C2002a() {
        }

        public /* synthetic */ C2002a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final e k() {
        return e.f83417e;
    }

    public a() {
        super("dsp_player");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final com.ss.android.ugc.aweme.dsp.playerservice.f.a a() {
        return a.C1960a.a(f()).f83291b.f83362b;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public final /* synthetic */ ac c() {
        ac a2 = ae.a(this, (ad.b) null).a(ShufflePlayerViewModel.class);
        l.b(a2, "");
        return (BasePlayerViewModel) a2;
    }

    static final class b extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83926a = new b();

        static {
            Covode.recordClassIndex(52349);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f83927a);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list) {
            List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list2 = list;
            l.d(list2, "");
            if (!list2.isEmpty()) {
                this.this$0.a().a(list2, (Integer) null);
                this.this$0.j();
            }
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = ((com.ss.android.ugc.aweme.dsp.playpage.base.a) this.this$0).f83691h;
            if (dspLoadMoreFrameLayout != null) {
                dspLoadMoreFrameLayout.a();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(b.f83926a);
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w2 = a().m();
        if (w2 instanceof d) {
            c cVar = new c(this);
            l.d(cVar, "");
            ((d) w2).f83549a = cVar;
        }
    }
}
