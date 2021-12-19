package com.ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.address.a.a;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class AddressEditState implements af {
    private final int autoScrollIndex;
    private final Integer changeRegionLoadingStatus;
    private final Integer deleteLoadingStatus;
    private final boolean emailHintVisible;
    private final int inputItemFirstTimeLoadingStatus;
    private final List<a> inputItemVOList;
    private final boolean isAddressEditorFocus;
    private final Integer saveLoadingStatus;

    static {
        Covode.recordClassIndex(52597);
    }

    public AddressEditState() {
        this(0, null, null, null, null, false, 0, false, 255, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditState copy$default(AddressEditState addressEditState, int i2, Integer num, Integer num2, Integer num3, List list, boolean z, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = addressEditState.inputItemFirstTimeLoadingStatus;
        }
        if ((i4 & 2) != 0) {
            num = addressEditState.changeRegionLoadingStatus;
        }
        if ((i4 & 4) != 0) {
            num2 = addressEditState.deleteLoadingStatus;
        }
        if ((i4 & 8) != 0) {
            num3 = addressEditState.saveLoadingStatus;
        }
        if ((i4 & 16) != 0) {
            list = addressEditState.inputItemVOList;
        }
        if ((i4 & 32) != 0) {
            z = addressEditState.emailHintVisible;
        }
        if ((i4 & 64) != 0) {
            i3 = addressEditState.autoScrollIndex;
        }
        if ((i4 & 128) != 0) {
            z2 = addressEditState.isAddressEditorFocus;
        }
        return addressEditState.copy(i2, num, num2, num3, list, z, i3, z2);
    }

    public final int component1() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final Integer component2() {
        return this.changeRegionLoadingStatus;
    }

    public final Integer component3() {
        return this.deleteLoadingStatus;
    }

    public final Integer component4() {
        return this.saveLoadingStatus;
    }

    public final List<a> component5() {
        return this.inputItemVOList;
    }

    public final boolean component6() {
        return this.emailHintVisible;
    }

    public final int component7() {
        return this.autoScrollIndex;
    }

    public final boolean component8() {
        return this.isAddressEditorFocus;
    }

    public final AddressEditState copy(int i2, Integer num, Integer num2, Integer num3, List<a> list, boolean z, int i3, boolean z2) {
        l.d(list, "");
        return new AddressEditState(i2, num, num2, num3, list, z, i3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditState)) {
            return false;
        }
        AddressEditState addressEditState = (AddressEditState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditState.inputItemFirstTimeLoadingStatus && l.a(this.changeRegionLoadingStatus, addressEditState.changeRegionLoadingStatus) && l.a(this.deleteLoadingStatus, addressEditState.deleteLoadingStatus) && l.a(this.saveLoadingStatus, addressEditState.saveLoadingStatus) && l.a(this.inputItemVOList, addressEditState.inputItemVOList) && this.emailHintVisible == addressEditState.emailHintVisible && this.autoScrollIndex == addressEditState.autoScrollIndex && this.isAddressEditorFocus == addressEditState.isAddressEditorFocus;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.inputItemFirstTimeLoadingStatus) * 31;
        Integer num = this.changeRegionLoadingStatus;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.deleteLoadingStatus;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.saveLoadingStatus;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<a> list = this.inputItemVOList;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.emailHintVisible;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((i3 + i5) * 31) + com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.autoScrollIndex)) * 31;
        if (!this.isAddressEditorFocus) {
            i4 = 0;
        }
        return com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i4;
    }

    public final String toString() {
        return "AddressEditState(inputItemFirstTimeLoadingStatus=" + this.inputItemFirstTimeLoadingStatus + ", changeRegionLoadingStatus=" + this.changeRegionLoadingStatus + ", deleteLoadingStatus=" + this.deleteLoadingStatus + ", saveLoadingStatus=" + this.saveLoadingStatus + ", inputItemVOList=" + this.inputItemVOList + ", emailHintVisible=" + this.emailHintVisible + ", autoScrollIndex=" + this.autoScrollIndex + ", isAddressEditorFocus=" + this.isAddressEditorFocus + ")";
    }

    public final int getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final Integer getChangeRegionLoadingStatus() {
        return this.changeRegionLoadingStatus;
    }

    public final Integer getDeleteLoadingStatus() {
        return this.deleteLoadingStatus;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final int getInputItemFirstTimeLoadingStatus() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final List<a> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final boolean isAddressEditorFocus() {
        return this.isAddressEditorFocus;
    }

    public AddressEditState(int i2, Integer num, Integer num2, Integer num3, List<a> list, boolean z, int i3, boolean z2) {
        l.d(list, "");
        this.inputItemFirstTimeLoadingStatus = i2;
        this.changeRegionLoadingStatus = num;
        this.deleteLoadingStatus = num2;
        this.saveLoadingStatus = num3;
        this.inputItemVOList = list;
        this.emailHintVisible = z;
        this.autoScrollIndex = i3;
        this.isAddressEditorFocus = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressEditState(int i2, Integer num, Integer num2, Integer num3, List list, boolean z, int i3, boolean z2, int i4, g gVar) {
        this((i4 & 1) != 0 ? -1 : i2, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : num2, (i4 & 8) == 0 ? num3 : null, (i4 & 16) != 0 ? z.INSTANCE : list, (i4 & 32) != 0 ? false : z, (i4 & 64) == 0 ? i3 : -1, (i4 & 128) == 0 ? z2 : false);
    }
}
