package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class BeautyCategory {
    private final BeautyCategoryExtra beautyCategoryExtra;
    private final List<ComposerBeauty> beautyList;
    private final EffectCategoryResponse categoryResponse;
    private boolean selected;

    static {
        Covode.recordClassIndex(90764);
    }

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final List<ComposerBeauty> getBeautyList() {
        return this.beautyList;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int hashCode() {
        Integer num;
        String id = this.categoryResponse.getId();
        if (id != null) {
            num = Integer.valueOf(id.hashCode());
        } else {
            num = null;
        }
        return num.intValue();
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BeautyCategory) {
            return l.a((Object) ((BeautyCategory) obj).categoryResponse.getId(), (Object) this.categoryResponse.getId());
        }
        return false;
    }

    public BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List<ComposerBeauty> list, boolean z) {
        l.d(effectCategoryResponse, "");
        l.d(beautyCategoryExtra2, "");
        l.d(list, "");
        this.categoryResponse = effectCategoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra2;
        this.beautyList = list;
        this.selected = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List list, boolean z, int i2, g gVar) {
        this(effectCategoryResponse, beautyCategoryExtra2, list, (i2 & 8) != 0 ? false : z);
    }
}
