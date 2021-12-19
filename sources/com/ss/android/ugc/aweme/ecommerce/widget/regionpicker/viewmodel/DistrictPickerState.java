package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import h.f.b.l;
import java.util.List;

public final class DistrictPickerState implements af {
    private final List<Object> districtList;
    private final District selectedDistrict;
    private final int status;
    private final String title;
    private final String titleEn;

    static {
        Covode.recordClassIndex(55150);
    }

    public DistrictPickerState() {
        this(null, null, null, null, 0, 31, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_viewmodel_DistrictPickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerState copy$default(DistrictPickerState districtPickerState, String str, String str2, List list, District district, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = districtPickerState.title;
        }
        if ((i3 & 2) != 0) {
            str2 = districtPickerState.titleEn;
        }
        if ((i3 & 4) != 0) {
            list = districtPickerState.districtList;
        }
        if ((i3 & 8) != 0) {
            district = districtPickerState.selectedDistrict;
        }
        if ((i3 & 16) != 0) {
            i2 = districtPickerState.status;
        }
        return districtPickerState.copy(str, str2, list, district, i2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.titleEn;
    }

    public final List<Object> component3() {
        return this.districtList;
    }

    public final District component4() {
        return this.selectedDistrict;
    }

    public final int component5() {
        return this.status;
    }

    public final DistrictPickerState copy(String str, String str2, List<? extends Object> list, District district, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        return new DistrictPickerState(str, str2, list, district, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerState)) {
            return false;
        }
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        return l.a(this.title, districtPickerState.title) && l.a(this.titleEn, districtPickerState.titleEn) && l.a(this.districtList, districtPickerState.districtList) && l.a(this.selectedDistrict, districtPickerState.selectedDistrict) && this.status == districtPickerState.status;
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.titleEn;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.districtList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        District district = this.selectedDistrict;
        if (district != null) {
            i2 = district.hashCode();
        }
        return ((hashCode3 + i2) * 31) + com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_viewmodel_DistrictPickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status);
    }

    public final String toString() {
        return "DistrictPickerState(title=" + this.title + ", titleEn=" + this.titleEn + ", districtList=" + this.districtList + ", selectedDistrict=" + this.selectedDistrict + ", status=" + this.status + ")";
    }

    public final List<Object> getDistrictList() {
        return this.districtList;
    }

    public final District getSelectedDistrict() {
        return this.selectedDistrict;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public DistrictPickerState(String str, String str2, List<? extends Object> list, District district, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        this.title = str;
        this.titleEn = str2;
        this.districtList = list;
        this.selectedDistrict = district;
        this.status = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DistrictPickerState(java.lang.String r7, java.lang.String r8, java.util.List r9, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District r10, int r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r5 = r11
            r1 = r7
            r0 = r12 & 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r2
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0025
        L_0x000f:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            h.a.z r3 = h.a.z.INSTANCE
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = 0
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0020
            r0 = -1
            r5 = -1
        L_0x0020:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0025:
            r2 = r8
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState.<init>(java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District, int, int, h.f.b.g):void");
    }
}
