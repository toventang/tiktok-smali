package com.ss.android.ugc.aweme.dsp.playpage.mainpage;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.ss.android.ugc.aweme.dsp.playpage.base.a implements i, j {
    private String v = "Daily Mix";
    private SparseArray w;

    static {
        Covode.recordClassIndex(52234);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, com.ss.android.ugc.aweme.dsp.playpage.base.a
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

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, com.ss.android.ugc.aweme.dsp.playpage.base.a
    public final void br_() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(200, new g(a.class, "onMusicDspTabChangeEvent", com.ss.android.ugc.aweme.dsp.a.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, com.ss.android.ugc.aweme.dsp.playpage.base.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public final /* synthetic */ ac c() {
        return new MainPlayerViewModel();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        cg.b(this);
    }

    public a() {
        super("track_reco");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final com.ss.android.ugc.aweme.dsp.playerservice.f.a a() {
        return a.C1960a.a(f()).f83291b.f83361a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.a
    public final void l() {
        if (!this.q || !l.a((Object) this.v, (Object) "Daily Mix") || !this.r || this.s) {
            com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar = this.f83694k;
            if (aVar != null) {
                aVar.setVisibility(8);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar2 = this.f83694k;
        if (aVar2 != null) {
            aVar2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.mainpage.a$a  reason: collision with other inner class name */
    static final class C1992a extends m implements b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1992a f83717a = new C1992a();

        static {
            Covode.recordClassIndex(52235);
        }

        C1992a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f83718a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, com.ss.android.ugc.aweme.dsp.playpage.base.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        l.d(context, "");
        super.onAttach(context);
        cg.a(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, com.ss.android.ugc.aweme.dsp.playpage.base.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(C1992a.f83717a);
    }

    @r
    public final void onMusicDspTabChangeEvent(com.ss.android.ugc.aweme.dsp.a.a aVar) {
        String str = "";
        l.d(aVar, str);
        String str2 = aVar.f83239c;
        if (str2 != null) {
            str = str2;
        }
        this.v = str;
        l();
    }
}
