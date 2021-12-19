package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

public class NativeMaskInfo extends MaskInfo {
    static {
        Covode.recordClassIndex(101310);
    }

    private static boolean isNativeMaskInfo(MaskInfo maskInfo) {
        return maskInfo instanceof NativeMaskInfo;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.MaskInfo
    public void onMaskInfoCallback(int i2, int i3, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
