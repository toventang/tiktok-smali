package com.ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class AddressSelectViewModel extends JediViewModel<AddressSelectState> {
    static {
        Covode.recordClassIndex(53721);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ AddressSelectState d() {
        return new AddressSelectState(null, 1, null);
    }

    static final class a extends m implements b<AddressSelectState, AddressSelectState> {
        final /* synthetic */ d $address;

        static {
            Covode.recordClassIndex(53722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.$address = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressSelectState invoke(AddressSelectState addressSelectState) {
            AddressSelectState addressSelectState2 = addressSelectState;
            l.d(addressSelectState2, "");
            return addressSelectState2.copy(this.$address);
        }
    }

    public final void a(d dVar) {
        c(new a(dVar));
    }
}
