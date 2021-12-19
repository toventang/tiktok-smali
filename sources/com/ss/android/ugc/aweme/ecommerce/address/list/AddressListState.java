package com.ss.android.ugc.aweme.ecommerce.address.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class AddressListState implements af {
    private final b addAddressClick;
    private final b addressClick;
    private final List<d> addressList;
    private final c deleteEvent;
    private final b editAddressClick;
    private final int status;

    static {
        Covode.recordClassIndex(52760);
    }

    public AddressListState() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressListState copy$default(AddressListState addressListState, int i2, List list, b bVar, b bVar2, b bVar3, c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = addressListState.status;
        }
        if ((i3 & 2) != 0) {
            list = addressListState.addressList;
        }
        if ((i3 & 4) != 0) {
            bVar = addressListState.addAddressClick;
        }
        if ((i3 & 8) != 0) {
            bVar2 = addressListState.editAddressClick;
        }
        if ((i3 & 16) != 0) {
            bVar3 = addressListState.addressClick;
        }
        if ((i3 & 32) != 0) {
            cVar = addressListState.deleteEvent;
        }
        return addressListState.copy(i2, list, bVar, bVar2, bVar3, cVar);
    }

    public final int component1() {
        return this.status;
    }

    public final List<d> component2() {
        return this.addressList;
    }

    public final b component3() {
        return this.addAddressClick;
    }

    public final b component4() {
        return this.editAddressClick;
    }

    public final b component5() {
        return this.addressClick;
    }

    public final c component6() {
        return this.deleteEvent;
    }

    public final AddressListState copy(int i2, List<d> list, b bVar, b bVar2, b bVar3, c cVar) {
        l.d(list, "");
        return new AddressListState(i2, list, bVar, bVar2, bVar3, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListState)) {
            return false;
        }
        AddressListState addressListState = (AddressListState) obj;
        return this.status == addressListState.status && l.a(this.addressList, addressListState.addressList) && l.a(this.addAddressClick, addressListState.addAddressClick) && l.a(this.editAddressClick, addressListState.editAddressClick) && l.a(this.addressClick, addressListState.addressClick) && l.a(this.deleteEvent, addressListState.deleteEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status) * 31;
        List<d> list = this.addressList;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        b bVar = this.addAddressClick;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.editAddressClick;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.addressClick;
        int hashCode4 = (hashCode3 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        c cVar = this.deleteEvent;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AddressListState(status=" + this.status + ", addressList=" + this.addressList + ", addAddressClick=" + this.addAddressClick + ", editAddressClick=" + this.editAddressClick + ", addressClick=" + this.addressClick + ", deleteEvent=" + this.deleteEvent + ")";
    }

    public final b getAddAddressClick() {
        return this.addAddressClick;
    }

    public final b getAddressClick() {
        return this.addressClick;
    }

    public final List<d> getAddressList() {
        return this.addressList;
    }

    public final c getDeleteEvent() {
        return this.deleteEvent;
    }

    public final b getEditAddressClick() {
        return this.editAddressClick;
    }

    public final int getStatus() {
        return this.status;
    }

    public AddressListState(int i2, List<d> list, b bVar, b bVar2, b bVar3, c cVar) {
        l.d(list, "");
        this.status = i2;
        this.addressList = list;
        this.addAddressClick = bVar;
        this.editAddressClick = bVar2;
        this.addressClick = bVar3;
        this.deleteEvent = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressListState(int i2, List list, b bVar, b bVar2, b bVar3, c cVar, int i3, g gVar) {
        this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? z.INSTANCE : list, (i3 & 4) != 0 ? null : bVar, (i3 & 8) != 0 ? null : bVar2, (i3 & 16) != 0 ? null : bVar3, (i3 & 32) == 0 ? cVar : null);
    }
}
