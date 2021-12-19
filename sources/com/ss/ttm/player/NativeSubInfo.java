package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

public class NativeSubInfo extends SubInfo {
    static {
        Covode.recordClassIndex(101313);
    }

    private static boolean isNativeSubInfo(SubInfo subInfo) {
        return subInfo instanceof NativeSubInfo;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.SubInfo
    public void onSubLoadFinished(int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.SubInfo
    public void onSubInfoCallback2(int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.SubInfo
    public void onSubLoadFinished2(int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.SubInfo
    public void onSubSwitchCompleted(int i2, int i3) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.SubInfo
    public void onSubInfoCallback(int i2, int i3, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
