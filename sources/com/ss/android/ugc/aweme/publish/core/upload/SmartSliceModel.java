package com.ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class SmartSliceModel {
    public static final a Companion = new a((byte) 0);
    @c(a = "base_number")
    private final int baseNumber;
    @c(a = "max_slice_size")
    private final int maxSliceSize;
    @c(a = "min_slice_size")
    private final int minSliceSize;
    @c(a = "nearest_upper")
    private final boolean nearestUpper;
    @c(a = "package_url")
    private final String packageUrl;
    @c(a = "scene")
    private final String scene;
    @c(a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(77038);
    }

    public static int com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ SmartSliceModel copy$default(SmartSliceModel smartSliceModel, String str, int i2, String str2, boolean z, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = smartSliceModel.scene;
        }
        if ((i6 & 2) != 0) {
            i2 = smartSliceModel.type;
        }
        if ((i6 & 4) != 0) {
            str2 = smartSliceModel.packageUrl;
        }
        if ((i6 & 8) != 0) {
            z = smartSliceModel.nearestUpper;
        }
        if ((i6 & 16) != 0) {
            i3 = smartSliceModel.minSliceSize;
        }
        if ((i6 & 32) != 0) {
            i4 = smartSliceModel.maxSliceSize;
        }
        if ((i6 & 64) != 0) {
            i5 = smartSliceModel.baseNumber;
        }
        return smartSliceModel.copy(str, i2, str2, z, i3, i4, i5);
    }

    public final String component1() {
        return this.scene;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.packageUrl;
    }

    public final boolean component4() {
        return this.nearestUpper;
    }

    public final int component5() {
        return this.minSliceSize;
    }

    public final int component6() {
        return this.maxSliceSize;
    }

    public final int component7() {
        return this.baseNumber;
    }

    public final SmartSliceModel copy(String str, int i2, String str2, boolean z, int i3, int i4, int i5) {
        l.d(str, "");
        l.d(str2, "");
        return new SmartSliceModel(str, i2, str2, z, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSliceModel)) {
            return false;
        }
        SmartSliceModel smartSliceModel = (SmartSliceModel) obj;
        return l.a(this.scene, smartSliceModel.scene) && this.type == smartSliceModel.type && l.a(this.packageUrl, smartSliceModel.packageUrl) && this.nearestUpper == smartSliceModel.nearestUpper && this.minSliceSize == smartSliceModel.minSliceSize && this.maxSliceSize == smartSliceModel.maxSliceSize && this.baseNumber == smartSliceModel.baseNumber;
    }

    public final int hashCode() {
        String str = this.scene;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        String str2 = this.packageUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.nearestUpper;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return ((((((i3 + i4) * 31) + com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minSliceSize)) * 31) + com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxSliceSize)) * 31) + com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.baseNumber);
    }

    public final String toString() {
        return "SmartSliceModel(scene=" + this.scene + ", type=" + this.type + ", packageUrl=" + this.packageUrl + ", nearestUpper=" + this.nearestUpper + ", minSliceSize=" + this.minSliceSize + ", maxSliceSize=" + this.maxSliceSize + ", baseNumber=" + this.baseNumber + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77039);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getBaseNumber() {
        return this.baseNumber;
    }

    public final int getMaxSliceSize() {
        return this.maxSliceSize;
    }

    public final int getMinSliceSize() {
        return this.minSliceSize;
    }

    public final boolean getNearestUpper() {
        return this.nearestUpper;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValidMaxSliceSize() {
        int i2 = this.maxSliceSize;
        if (i2 <= 0) {
            return 4096;
        }
        return i2;
    }

    public final int getValidMinSliceSize() {
        int i2 = this.minSliceSize;
        if (i2 <= 0) {
            return 256;
        }
        return i2;
    }

    public final int getValidTimesBaseNumber() {
        int i2 = this.baseNumber;
        if (i2 <= 0) {
            return 16;
        }
        return i2;
    }

    public SmartSliceModel(String str, int i2, String str2, boolean z, int i3, int i4, int i5) {
        l.d(str, "");
        l.d(str2, "");
        this.scene = str;
        this.type = i2;
        this.packageUrl = str2;
        this.nearestUpper = z;
        this.minSliceSize = i3;
        this.maxSliceSize = i4;
        this.baseNumber = i5;
    }
}
