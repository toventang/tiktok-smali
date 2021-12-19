package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class WatermarkResSetting {
    private final int height;
    @c(a = "min_allow_disk_mb")
    private final int minAllowDiskMB;
    private final int width;

    static {
        Covode.recordClassIndex(104103);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMinAllowDiskMB() {
        return this.minAllowDiskMB;
    }

    public final int getWidth() {
        return this.width;
    }

    public WatermarkResSetting(int i2, int i3, int i4) {
        this.width = i2;
        this.height = i3;
        this.minAllowDiskMB = i4;
    }
}
