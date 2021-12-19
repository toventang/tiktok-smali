package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ac;
import f.a.b.b;
import h.f.b.l;
import h.k.k;
import h.n;
import h.z;

public final class ChooseMediaExtensionKt$selectMediaList$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f128809a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ac f128810b;

    static {
        Covode.recordClassIndex(84508);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onStart();
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        k kVar;
        this.f128809a.getLifecycle().b(this);
        e activity = this.f128809a.getActivity();
        if (activity == null) {
            l.b();
        }
        BaseJediViewModel baseJediViewModel = (BaseJediViewModel) t.a(activity).a(ChooseMediaViewModel.class);
        a aVar = this.f128809a;
        ac acVar = this.f128810b;
        if (l.a(acVar, ac.a.f128896a)) {
            kVar = g.f129138a;
        } else if (l.a(acVar, ac.b.f128897a)) {
            kVar = h.f129139a;
        } else if (l.a(acVar, ac.c.f128898a)) {
            kVar = i.f129140a;
        } else {
            throw new n();
        }
        b unused = baseJediViewModel.a(aVar, kVar, new ah(), new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<ad, z> {
        final /* synthetic */ ChooseMediaExtensionKt$selectMediaList$1 this$0;

        static {
            Covode.recordClassIndex(84509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChooseMediaExtensionKt$selectMediaList$1 chooseMediaExtensionKt$selectMediaList$1) {
            super(1);
            this.this$0 = chooseMediaExtensionKt$selectMediaList$1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ad adVar) {
            ad adVar2 = adVar;
            l.d(adVar2, "");
            ChooseMediaExtensionKt$selectMediaList$1 chooseMediaExtensionKt$selectMediaList$1 = this.this$0;
            if (!(adVar2 == f.f129137a || chooseMediaExtensionKt$selectMediaList$1 == null)) {
                this.this$0.f128809a.a(adVar2.f128899a, adVar2.f128900b);
            }
            return z.f158842a;
        }
    }

    ChooseMediaExtensionKt$selectMediaList$1(a aVar, ac acVar) {
        this.f128809a = aVar;
        this.f128810b = acVar;
    }
}
