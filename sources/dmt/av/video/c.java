package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public final class c {
    static {
        Covode.recordClassIndex(104194);
    }

    public static int a(float f2) {
        return (int) (f2 * 4.0f * 1000.0f * 1000.0f);
    }

    public static VEVideoEncodeSettings.ENCODE_PRESET a(int i2) {
        VEVideoEncodeSettings.ENCODE_PRESET[] values = VEVideoEncodeSettings.ENCODE_PRESET.values();
        if (i2 < 0 || i2 >= values.length) {
            return null;
        }
        return values[i2];
    }
}
