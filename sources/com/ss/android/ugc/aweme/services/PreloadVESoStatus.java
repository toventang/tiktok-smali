package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import h.n;

public enum PreloadVESoStatus {
    DECOMPRESSING,
    DECOMPRESS_ERROR,
    UNLOAD,
    LOADING,
    LOADED;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(79544);
            int[] iArr = new int[PreloadVESoStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PreloadVESoStatus.DECOMPRESS_ERROR.ordinal()] = 1;
            iArr[PreloadVESoStatus.DECOMPRESSING.ordinal()] = 2;
            iArr[PreloadVESoStatus.UNLOAD.ordinal()] = 3;
            iArr[PreloadVESoStatus.LOADING.ordinal()] = 4;
            iArr[PreloadVESoStatus.LOADED.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(79543);
    }

    public final int toStatusCode() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return -3;
        }
        if (i2 == 2) {
            return -2;
        }
        if (i2 == 3) {
            return -1;
        }
        if (i2 == 4) {
            return 0;
        }
        if (i2 == 5) {
            return 1;
        }
        throw new n();
    }
}
