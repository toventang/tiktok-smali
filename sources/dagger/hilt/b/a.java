package dagger.hilt.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;

public final class a {
    static {
        Covode.recordClassIndex(104066);
    }

    /* renamed from: dagger.hilt.b.a$a  reason: collision with other inner class name */
    public static final class C4139a extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        static {
            Covode.recordClassIndex(104067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4139a(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Fragment fragment = this.$this_createViewModelLazy;
            l.c(fragment, "");
            ad.b a2 = dagger.hilt.android.internal.b.a.a(fragment.requireActivity());
            if (a2 == null) {
                return new ad.d();
            }
            return a2;
        }
    }
}
