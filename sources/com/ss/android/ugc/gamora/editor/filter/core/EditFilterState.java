package com.ss.android.ugc.gamora.editor.filter.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.ag;
import h.f.b.g;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class EditFilterState extends UiState {
    private final p cancelStatus;
    private final d<FilterBean> curFilter;
    private final Map<EffectCategoryResponse, List<FilterBean>> data;
    private final k panelShow;
    private final a ui;

    static {
        Covode.recordClassIndex(95843);
    }

    public EditFilterState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.filter.core.EditFilterState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditFilterState copy$default(EditFilterState editFilterState, k kVar, d dVar, p pVar, Map map, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = editFilterState.panelShow;
        }
        if ((i2 & 2) != 0) {
            dVar = editFilterState.curFilter;
        }
        if ((i2 & 4) != 0) {
            pVar = editFilterState.cancelStatus;
        }
        if ((i2 & 8) != 0) {
            map = editFilterState.data;
        }
        if ((i2 & 16) != 0) {
            aVar = editFilterState.getUi();
        }
        return editFilterState.copy(kVar, dVar, pVar, map, aVar);
    }

    public final k component1() {
        return this.panelShow;
    }

    public final d<FilterBean> component2() {
        return this.curFilter;
    }

    public final p component3() {
        return this.cancelStatus;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> component4() {
        return this.data;
    }

    public final a component5() {
        return getUi();
    }

    public final EditFilterState copy(k kVar, d<? extends FilterBean> dVar, p pVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, a aVar) {
        l.d(dVar, "");
        l.d(map, "");
        l.d(aVar, "");
        return new EditFilterState(kVar, dVar, pVar, map, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterState)) {
            return false;
        }
        EditFilterState editFilterState = (EditFilterState) obj;
        return l.a(this.panelShow, editFilterState.panelShow) && l.a(this.curFilter, editFilterState.curFilter) && l.a(this.cancelStatus, editFilterState.cancelStatus) && l.a(this.data, editFilterState.data) && l.a(getUi(), editFilterState.getUi());
    }

    public final int hashCode() {
        k kVar = this.panelShow;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        d<FilterBean> dVar = this.curFilter;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        p pVar = this.cancelStatus;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "EditFilterState(panelShow=" + this.panelShow + ", curFilter=" + this.curFilter + ", cancelStatus=" + this.cancelStatus + ", data=" + this.data + ", ui=" + getUi() + ")";
    }

    public final p getCancelStatus() {
        return this.cancelStatus;
    }

    public final d<FilterBean> getCurFilter() {
        return this.curFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final k getPanelShow() {
        return this.panelShow;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFilterState(k kVar, d<? extends FilterBean> dVar, p pVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, a aVar) {
        super(aVar);
        l.d(dVar, "");
        l.d(map, "");
        l.d(aVar, "");
        this.panelShow = kVar;
        this.curFilter = dVar;
        this.cancelStatus = pVar;
        this.data = map;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditFilterState(k kVar, d dVar, p pVar, Map map, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar, (i2 & 2) != 0 ? new d(null) : dVar, (i2 & 4) == 0 ? pVar : null, (i2 & 8) != 0 ? ag.a() : map, (i2 & 16) != 0 ? new a.C1131a() : aVar);
    }
}
