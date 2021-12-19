package com.ss.android.ugc.aweme.feed.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AnchorLynxModel {
    public final Bundle bundle;
    public final String lynxSchema;

    static {
        Covode.recordClassIndex(59299);
    }

    public static /* synthetic */ AnchorLynxModel copy$default(AnchorLynxModel anchorLynxModel, String str, Bundle bundle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = anchorLynxModel.lynxSchema;
        }
        if ((i2 & 2) != 0) {
            bundle2 = anchorLynxModel.bundle;
        }
        return anchorLynxModel.copy(str, bundle2);
    }

    public final AnchorLynxModel copy(String str, Bundle bundle2) {
        l.d(str, "");
        l.d(bundle2, "");
        return new AnchorLynxModel(str, bundle2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorLynxModel)) {
            return false;
        }
        AnchorLynxModel anchorLynxModel = (AnchorLynxModel) obj;
        return l.a(this.lynxSchema, anchorLynxModel.lynxSchema) && l.a(this.bundle, anchorLynxModel.bundle);
    }

    public final int hashCode() {
        String str = this.lynxSchema;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            i2 = bundle2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AnchorLynxModel(lynxSchema=" + this.lynxSchema + ", bundle=" + this.bundle + ")";
    }

    public AnchorLynxModel(String str, Bundle bundle2) {
        l.d(str, "");
        l.d(bundle2, "");
        this.lynxSchema = str;
        this.bundle = bundle2;
    }
}
