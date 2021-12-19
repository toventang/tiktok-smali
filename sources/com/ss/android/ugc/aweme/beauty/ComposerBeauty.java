package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;

public final class ComposerBeauty {
    private boolean add2Nodes;
    private final ComposerBeautyExtraBeautify beautifyExtra;
    private final boolean categoryExclusive;
    private final BeautyCategoryExtra categoryExtra;
    private final String categoryId;
    private final List<ComposerBeauty> childList;
    private int defaultProgress;
    private int downloadState;
    private final Effect effect;
    private boolean enable;
    private final ComposerBeautyExtra extra;
    private final boolean isBeautyMode;
    private final boolean isCollectionType;
    private boolean isLocalItem;
    private int localIconResId;
    private final String parentId;
    private final String parentName;
    private final String parentResId;
    private int progressValue;
    private int secondProgressValue;
    private boolean selected;
    private boolean showDot;
    private boolean showRedDot;

    static {
        Covode.recordClassIndex(42220);
    }

    public final boolean getAdd2Nodes() {
        return this.add2Nodes;
    }

    public final ComposerBeautyExtraBeautify getBeautifyExtra() {
        return this.beautifyExtra;
    }

    public final boolean getCategoryExclusive() {
        return this.categoryExclusive;
    }

    public final BeautyCategoryExtra getCategoryExtra() {
        return this.categoryExtra;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<ComposerBeauty> getChildList() {
        return this.childList;
    }

    public final int getDefaultProgress() {
        return this.defaultProgress;
    }

    public final int getDownloadState() {
        return this.downloadState;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ComposerBeautyExtra getExtra() {
        return this.extra;
    }

    public final int getLocalIconResId() {
        return this.localIconResId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final String getParentResId() {
        return this.parentResId;
    }

    public final int getProgressValue() {
        return this.progressValue;
    }

    public final int getSecondProgressValue() {
        return this.secondProgressValue;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowDot() {
        return this.showDot;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final boolean isBeautyMode() {
        return this.isBeautyMode;
    }

    public final boolean isCollectionType() {
        return this.isCollectionType;
    }

    public final boolean isLocalItem() {
        return this.isLocalItem;
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean needFaceDetect() {
        for (T t : this.effect.getRequirements()) {
            if (l.a((Object) t, (Object) "faceDetect")) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void setAdd2Nodes(boolean z) {
        this.add2Nodes = z;
    }

    public final void setDefaultProgress(int i2) {
        this.defaultProgress = i2;
    }

    public final void setDownloadState(int i2) {
        this.downloadState = i2;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setLocalIconResId(int i2) {
        this.localIconResId = i2;
    }

    public final void setLocalItem(boolean z) {
        this.isLocalItem = z;
    }

    public final void setProgressValue(int i2) {
        this.progressValue = i2;
    }

    public final void setSecondProgressValue(int i2) {
        this.secondProgressValue = i2;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowDot(boolean z) {
        this.showDot = z;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposerBeauty) {
            boolean z = this.isBeautyMode;
            if (z) {
                ComposerBeauty composerBeauty = (ComposerBeauty) obj;
                if (z != composerBeauty.isBeautyMode) {
                    return false;
                }
                return l.a((Object) composerBeauty.categoryExtra.getCategoryId(), (Object) this.categoryExtra.getCategoryId());
            }
            ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
            if (!l.a((Object) composerBeauty2.effect.getEffectId(), (Object) this.effect.getEffectId()) || !l.a((Object) this.categoryId, (Object) composerBeauty2.categoryId) || !l.a((Object) this.parentId, (Object) composerBeauty2.parentId)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ComposerBeauty(Effect effect2, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, String str, boolean z, boolean z2, String str2, String str3, String str4, List<ComposerBeauty> list, boolean z3, boolean z4, boolean z5, int i2, int i3, boolean z6, boolean z7, boolean z8, int i4, int i5, int i6, BeautyCategoryExtra beautyCategoryExtra, boolean z9) {
        l.d(effect2, "");
        l.d(composerBeautyExtra, "");
        l.d(composerBeautyExtraBeautify, "");
        l.d(str, "");
        l.d(beautyCategoryExtra, "");
        this.effect = effect2;
        this.extra = composerBeautyExtra;
        this.beautifyExtra = composerBeautyExtraBeautify;
        this.categoryId = str;
        this.categoryExclusive = z;
        this.isCollectionType = z2;
        this.parentId = str2;
        this.parentName = str3;
        this.parentResId = str4;
        this.childList = list;
        this.selected = z3;
        this.showRedDot = z4;
        this.showDot = z5;
        this.progressValue = i2;
        this.secondProgressValue = i3;
        this.enable = z6;
        this.add2Nodes = z7;
        this.isLocalItem = z8;
        this.localIconResId = i4;
        this.defaultProgress = i5;
        this.downloadState = i6;
        this.categoryExtra = beautyCategoryExtra;
        this.isBeautyMode = z9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ComposerBeauty(com.ss.android.ugc.effectmanager.effect.model.Effect r42, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r43, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify r44, java.lang.String r45, boolean r46, boolean r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.util.List r51, boolean r52, boolean r53, boolean r54, int r55, int r56, boolean r57, boolean r58, boolean r59, int r60, int r61, int r62, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra r63, boolean r64, int r65, h.f.b.g r66) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.beauty.ComposerBeauty.<init>(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, int, int, boolean, boolean, boolean, int, int, int, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra, boolean, int, h.f.b.g):void");
    }
}
