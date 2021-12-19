package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.b.l;

public final class GreenScreenMaterialKt {
    static {
        Covode.recordClassIndex(84451);
    }

    public static final String getAuthorName(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getAuthorName();
        }
        return null;
    }

    public static final String getEffectId(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getStickerId();
        }
        return null;
    }

    public static final Long getEndTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getEndTime());
        }
        return null;
    }

    public static final String getLocalPath(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getLocalPath();
        }
        return null;
    }

    public static final String getMediasource(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getMediasource();
        }
        return null;
    }

    public static final String getResId(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getResId();
        }
        return null;
    }

    public static final Long getStartTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getStartTime());
        }
        return null;
    }

    public static final Integer getType(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Integer.valueOf(greenScreenMaterial.getType());
        }
        return null;
    }

    public static final Bundle asBundle(GreenScreenMaterial greenScreenMaterial, Bundle bundle) {
        l.d(greenScreenMaterial, "");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("extra_key_green_screen_material", greenScreenMaterial);
        return bundle;
    }

    public static /* synthetic */ Bundle asBundle$default(GreenScreenMaterial greenScreenMaterial, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bundle = null;
        }
        return asBundle(greenScreenMaterial, bundle);
    }
}
