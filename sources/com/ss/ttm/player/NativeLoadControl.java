package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

public class NativeLoadControl extends LoadControl {
    static {
        Covode.recordClassIndex(101309);
    }

    private static boolean isNativeLoadControl(LoadControl loadControl) {
        return loadControl instanceof NativeLoadControl;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onCodecStackSelected(int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onFilterStackSelected(int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onTrackSelected(int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public boolean shouldStartPlayback(long j2, float f2, boolean z) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
