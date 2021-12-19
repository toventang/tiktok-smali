package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class DistrictPickerWrapperState implements af {
    private final boolean close;
    private final boolean done;
    private final boolean physicalBack;
    private final List<Region> selectedRegions;
    private final boolean titleBarBack;

    static {
        Covode.recordClassIndex(55158);
    }

    public DistrictPickerWrapperState() {
        this(false, false, false, false, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerWrapperState copy$default(DistrictPickerWrapperState districtPickerWrapperState, boolean z, boolean z2, boolean z3, boolean z4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = districtPickerWrapperState.done;
        }
        if ((i2 & 2) != 0) {
            z2 = districtPickerWrapperState.close;
        }
        if ((i2 & 4) != 0) {
            z3 = districtPickerWrapperState.titleBarBack;
        }
        if ((i2 & 8) != 0) {
            z4 = districtPickerWrapperState.physicalBack;
        }
        if ((i2 & 16) != 0) {
            list = districtPickerWrapperState.selectedRegions;
        }
        return districtPickerWrapperState.copy(z, z2, z3, z4, list);
    }

    public final boolean component1() {
        return this.done;
    }

    public final boolean component2() {
        return this.close;
    }

    public final boolean component3() {
        return this.titleBarBack;
    }

    public final boolean component4() {
        return this.physicalBack;
    }

    public final List<Region> component5() {
        return this.selectedRegions;
    }

    public final DistrictPickerWrapperState copy(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        l.d(list, "");
        return new DistrictPickerWrapperState(z, z2, z3, z4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerWrapperState)) {
            return false;
        }
        DistrictPickerWrapperState districtPickerWrapperState = (DistrictPickerWrapperState) obj;
        return this.done == districtPickerWrapperState.done && this.close == districtPickerWrapperState.close && this.titleBarBack == districtPickerWrapperState.titleBarBack && this.physicalBack == districtPickerWrapperState.physicalBack && l.a(this.selectedRegions, districtPickerWrapperState.selectedRegions);
    }

    public final int hashCode() {
        boolean z = this.done;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.close;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.titleBarBack;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.physicalBack) {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        List<Region> list = this.selectedRegions;
        return i15 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DistrictPickerWrapperState(done=" + this.done + ", close=" + this.close + ", titleBarBack=" + this.titleBarBack + ", physicalBack=" + this.physicalBack + ", selectedRegions=" + this.selectedRegions + ")";
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final boolean getPhysicalBack() {
        return this.physicalBack;
    }

    public final List<Region> getSelectedRegions() {
        return this.selectedRegions;
    }

    public final boolean getTitleBarBack() {
        return this.titleBarBack;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        l.d(list, "");
        this.done = z;
        this.close = z2;
        this.titleBarBack = z3;
        this.physicalBack = z4;
        this.selectedRegions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) == 0 ? z4 : false, (i2 & 16) != 0 ? z.INSTANCE : list);
    }
}
