package com.ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.f.b.g;
import h.f.b.l;

public final class AddressSelectState implements af {
    private final d selectedAddress;

    static {
        Covode.recordClassIndex(53720);
    }

    public AddressSelectState() {
        this(null, 1, null);
    }

    public static /* synthetic */ AddressSelectState copy$default(AddressSelectState addressSelectState, d dVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = addressSelectState.selectedAddress;
        }
        return addressSelectState.copy(dVar);
    }

    public final d component1() {
        return this.selectedAddress;
    }

    public final AddressSelectState copy(d dVar) {
        return new AddressSelectState(dVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AddressSelectState) && l.a(this.selectedAddress, ((AddressSelectState) obj).selectedAddress);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.selectedAddress;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AddressSelectState(selectedAddress=" + this.selectedAddress + ")";
    }

    public final d getSelectedAddress() {
        return this.selectedAddress;
    }

    public AddressSelectState(d dVar) {
        this.selectedAddress = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSelectState(d dVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : dVar);
    }
}
