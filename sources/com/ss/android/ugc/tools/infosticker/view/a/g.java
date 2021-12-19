package com.ss.android.ugc.tools.infosticker.view.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;
import h.p;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final h f149516a;

    /* renamed from: b  reason: collision with root package name */
    public final j f149517b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Effect> f149518c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ProviderEffect> f149519d;

    /* renamed from: e  reason: collision with root package name */
    public final List<InfoStickerEffect> f149520e;

    /* renamed from: f  reason: collision with root package name */
    public final int f149521f;

    /* renamed from: g  reason: collision with root package name */
    public final EffectCategoryResponse f149522g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f149523h;

    /* renamed from: i  reason: collision with root package name */
    public final c f149524i;

    /* renamed from: j  reason: collision with root package name */
    public final String f149525j;

    /* renamed from: k  reason: collision with root package name */
    public final EffectCategoryModel f149526k;

    /* renamed from: l  reason: collision with root package name */
    public final int f149527l;

    /* renamed from: m  reason: collision with root package name */
    public final List<p<Effect, Integer>> f149528m;
    public final i n;

    static {
        Covode.recordClassIndex(98456);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f149516a, gVar.f149516a) && l.a(this.f149517b, gVar.f149517b) && l.a(this.f149518c, gVar.f149518c) && l.a(this.f149519d, gVar.f149519d) && l.a(this.f149520e, gVar.f149520e) && this.f149521f == gVar.f149521f && l.a(this.f149522g, gVar.f149522g) && l.a(this.f149523h, gVar.f149523h) && l.a(this.f149524i, gVar.f149524i) && l.a(this.f149525j, gVar.f149525j) && l.a(this.f149526k, gVar.f149526k) && this.f149527l == gVar.f149527l && l.a(this.f149528m, gVar.f149528m) && l.a(this.n, gVar.n);
    }

    public final int hashCode() {
        h hVar = this.f149516a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        j jVar = this.f149517b;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        List<Effect> list = this.f149518c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<ProviderEffect> list2 = this.f149519d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list3 = this.f149520e;
        int hashCode5 = (((hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f149521f) * 31;
        EffectCategoryResponse effectCategoryResponse = this.f149522g;
        int hashCode6 = (hashCode5 + (effectCategoryResponse != null ? effectCategoryResponse.hashCode() : 0)) * 31;
        Integer num = this.f149523h;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        c cVar = this.f149524i;
        int hashCode8 = (hashCode7 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.f149525j;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 31;
        EffectCategoryModel effectCategoryModel = this.f149526k;
        int hashCode10 = (((hashCode9 + (effectCategoryModel != null ? effectCategoryModel.hashCode() : 0)) * 31) + this.f149527l) * 31;
        List<p<Effect, Integer>> list4 = this.f149528m;
        int hashCode11 = (hashCode10 + (list4 != null ? list4.hashCode() : 0)) * 31;
        i iVar = this.n;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "StickerViewEvent(eventType=" + this.f149516a + ", pageType=" + this.f149517b + ", effects=" + this.f149518c + ", providerEffects=" + this.f149519d + ", infoStickerEffects=" + this.f149520e + ", firstVisibleEffectPosition=" + this.f149521f + ", category=" + this.f149522g + ", stickerPosition=" + this.f149523h + ", stickerState=" + this.f149524i + ", providerKeyWord=" + this.f149525j + ", tabCategory=" + this.f149526k + ", tabIndex=" + this.f149527l + ", effectAndPositionList=" + this.f149528m + ", stickerViewLoadState=" + this.n + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends h.p<? extends com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    private g(h hVar, j jVar, List<? extends Effect> list, List<ProviderEffect> list2, List<InfoStickerEffect> list3, int i2, EffectCategoryResponse effectCategoryResponse, Integer num, c cVar, String str, List<? extends p<? extends Effect, Integer>> list4, i iVar) {
        l.d(hVar, "");
        this.f149516a = hVar;
        this.f149517b = jVar;
        this.f149518c = list;
        this.f149519d = list2;
        this.f149520e = list3;
        this.f149521f = i2;
        this.f149522g = effectCategoryResponse;
        this.f149523h = num;
        this.f149524i = cVar;
        this.f149525j = str;
        this.f149526k = null;
        this.f149527l = 0;
        this.f149528m = list4;
        this.n = iVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, j jVar, List list, List list2, List list3, int i2, EffectCategoryResponse effectCategoryResponse, Integer num, c cVar, String str, List list4, i iVar, int i3) {
        this(hVar, (i3 & 2) != 0 ? null : jVar, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : list2, (i3 & 16) != 0 ? null : list3, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : effectCategoryResponse, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : cVar, (i3 & 512) != 0 ? null : str, (i3 & 4096) != 0 ? null : list4, (i3 & 8192) == 0 ? iVar : null);
    }
}
