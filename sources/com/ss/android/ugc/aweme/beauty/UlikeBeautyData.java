package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;

public final class UlikeBeautyData {
    private String effectId;
    private ComposerBeautyExtra ulikeBeautyExtra;
    private String unzipPath;

    static {
        Covode.recordClassIndex(42226);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final ComposerBeautyExtra getUlikeBeautyExtra() {
        return this.ulikeBeautyExtra;
    }

    public final String getUnzipPath() {
        return this.unzipPath;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setUlikeBeautyExtra(ComposerBeautyExtra composerBeautyExtra) {
        this.ulikeBeautyExtra = composerBeautyExtra;
    }

    public final void setUnzipPath(String str) {
        this.unzipPath = str;
    }

    public UlikeBeautyData(ComposerBeautyExtra composerBeautyExtra, String str, String str2) {
        this.ulikeBeautyExtra = composerBeautyExtra;
        this.unzipPath = str;
        this.effectId = str2;
    }
}
