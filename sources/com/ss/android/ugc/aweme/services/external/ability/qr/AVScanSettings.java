package com.ss.android.ugc.aweme.services.external.ability.qr;

import com.bytedance.covode.number.Covode;

public class AVScanSettings {
    public int buildChainFlag = 1;
    public String detectModelDir;
    public float detectRectHeight;
    public float detectRectLeft;
    public float detectRectTop;
    public float detectRectWidth;
    public long detectRequirement = 65536;
    public boolean enableDetectRect;
    public int height = -1;
    public int width = -1;

    public interface Requirement {
        static {
            Covode.recordClassIndex(79682);
        }
    }

    static {
        Covode.recordClassIndex(79681);
    }

    public int getBuildChainFlag() {
        return this.buildChainFlag;
    }

    public String getDetectModelDir() {
        return this.detectModelDir;
    }

    public long getDetectRequirement() {
        return this.detectRequirement;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
