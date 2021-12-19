package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class RecommendSearchWordsModel {
    private List<EffectNameModel> effects;
    private String search_tips;

    static {
        Covode.recordClassIndex(102514);
    }

    public RecommendSearchWordsModel() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.RecommendSearchWordsModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSearchWordsModel copy$default(RecommendSearchWordsModel recommendSearchWordsModel, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendSearchWordsModel.search_tips;
        }
        if ((i2 & 2) != 0) {
            list = recommendSearchWordsModel.effects;
        }
        return recommendSearchWordsModel.copy(str, list);
    }

    public final String component1() {
        return this.search_tips;
    }

    public final List<EffectNameModel> component2() {
        return this.effects;
    }

    public final RecommendSearchWordsModel copy(String str, List<EffectNameModel> list) {
        return new RecommendSearchWordsModel(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsModel)) {
            return false;
        }
        RecommendSearchWordsModel recommendSearchWordsModel = (RecommendSearchWordsModel) obj;
        return l.a(this.search_tips, recommendSearchWordsModel.search_tips) && l.a(this.effects, recommendSearchWordsModel.effects);
    }

    public final int hashCode() {
        String str = this.search_tips;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<EffectNameModel> list = this.effects;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RecommendSearchWordsModel(search_tips=" + this.search_tips + ", effects=" + this.effects + ")";
    }

    public final List<EffectNameModel> getEffects() {
        return this.effects;
    }

    public final String getSearch_tips() {
        return this.search_tips;
    }

    public final void setEffects(List<EffectNameModel> list) {
        this.effects = list;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public RecommendSearchWordsModel(String str, List<EffectNameModel> list) {
        this.search_tips = str;
        this.effects = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendSearchWordsModel(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list);
    }
}
