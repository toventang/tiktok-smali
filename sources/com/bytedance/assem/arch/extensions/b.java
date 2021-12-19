package com.bytedance.assem.arch.extensions;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.assem.arch.b.g;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {
    static {
        Covode.recordClassIndex(14911);
    }

    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ com.bytedance.assem.arch.core.b $bridge;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ androidx.lifecycle.m $lifecycleOwner;
        final /* synthetic */ Bundle $options = null;
        final /* synthetic */ int $requestCode = 1;
        final /* synthetic */ q $resultCallback;

        static {
            Covode.recordClassIndex(14912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, androidx.lifecycle.m mVar, com.bytedance.assem.arch.core.b bVar, Intent intent, q qVar) {
            super(0);
            this.$activity = eVar;
            this.$lifecycleOwner = mVar;
            this.$bridge = bVar;
            this.$intent = intent;
            this.$resultCallback = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (m.a(this.$activity, this.$lifecycleOwner)) {
                this.$bridge.a(this.$lifecycleOwner, this.$intent, this.$requestCode, this.$options, this.$resultCallback);
            }
            return z.f158842a;
        }
    }

    public static final AssemSupervisor a(Fragment fragment) {
        l.c(fragment, "");
        ac a2 = ae.a(fragment.requireActivity(), (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        return ((Assembler) a2).a(fragment);
    }

    public static final Fragment a(androidx.lifecycle.m mVar) {
        while (true) {
            l.c(mVar, "");
            if (mVar instanceof Fragment) {
                return (Fragment) mVar;
            }
            if (mVar instanceof e) {
                return null;
            }
            if (mVar instanceof com.bytedance.assem.arch.core.a) {
                mVar = ((com.bytedance.assem.arch.core.a) mVar).by_();
            } else if (mVar instanceof g) {
                mVar = ((g) mVar).aF_();
                if (mVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner for find.");
            }
        }
    }

    public static final e b(androidx.lifecycle.m mVar) {
        while (true) {
            l.c(mVar, "");
            if (mVar instanceof Fragment) {
                return ((Fragment) mVar).getActivity();
            }
            if (mVar instanceof g) {
                return ((g) mVar).aD_();
            }
            if (mVar instanceof e) {
                return (e) mVar;
            }
            if (mVar instanceof com.bytedance.assem.arch.core.a) {
                mVar = ((com.bytedance.assem.arch.core.a) mVar).by_();
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner for find.");
            }
        }
    }

    public static final AssemSupervisor a(e eVar) {
        l.c(eVar, "");
        ac a2 = ae.a(eVar, (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        return ((Assembler) a2).a(eVar);
    }

    public static final AssemSupervisor a(g gVar) {
        l.c(gVar, "");
        e aD_ = gVar.aD_();
        if (aD_ == null) {
            return null;
        }
        ac a2 = ae.a(aD_, (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        return ((Assembler) a2).a(gVar);
    }

    public static final AssemSupervisor a(com.bytedance.assem.arch.core.a aVar) {
        l.c(aVar, "");
        e b2 = b(aVar);
        if (b2 == null) {
            return null;
        }
        ac a2 = ae.a(b2, (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        return ((Assembler) a2).a(aVar);
    }
}
