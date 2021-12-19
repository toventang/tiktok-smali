package com.bytedance.creativex.recorder.filter.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class FilterPanelState extends UiState {
    private final Map<EffectCategoryResponse, List<FilterBean>> data;
    private final boolean disableFilter;
    private final p enterFilterBoxEvent;
    private final int pendingSelected;
    private final FilterBean selectedFilter;
    private final a ui;

    static {
        Covode.recordClassIndex(16594);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.creativex.recorder.filter.panel.FilterPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterPanelState copy$default(FilterPanelState filterPanelState, a aVar, FilterBean filterBean, boolean z, Map map, p pVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aVar = filterPanelState.getUi();
        }
        if ((i3 & 2) != 0) {
            filterBean = filterPanelState.selectedFilter;
        }
        if ((i3 & 4) != 0) {
            z = filterPanelState.disableFilter;
        }
        if ((i3 & 8) != 0) {
            map = filterPanelState.data;
        }
        if ((i3 & 16) != 0) {
            pVar = filterPanelState.enterFilterBoxEvent;
        }
        if ((i3 & 32) != 0) {
            i2 = filterPanelState.pendingSelected;
        }
        return filterPanelState.copy(aVar, filterBean, z, map, pVar, i2);
    }

    public final a component1() {
        return getUi();
    }

    public final FilterBean component2() {
        return this.selectedFilter;
    }

    public final boolean component3() {
        return this.disableFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> component4() {
        return this.data;
    }

    public final p component5() {
        return this.enterFilterBoxEvent;
    }

    public final int component6() {
        return this.pendingSelected;
    }

    public final FilterPanelState copy(a aVar, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, p pVar, int i2) {
        l.d(aVar, "");
        l.d(map, "");
        return new FilterPanelState(aVar, filterBean, z, map, pVar, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterPanelState)) {
            return false;
        }
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        return l.a(getUi(), filterPanelState.getUi()) && l.a(this.selectedFilter, filterPanelState.selectedFilter) && this.disableFilter == filterPanelState.disableFilter && l.a(this.data, filterPanelState.data) && l.a(this.enterFilterBoxEvent, filterPanelState.enterFilterBoxEvent) && this.pendingSelected == filterPanelState.pendingSelected;
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        FilterBean filterBean = this.selectedFilter;
        int hashCode2 = (hashCode + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        boolean z = this.disableFilter;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode3 = (i6 + (map != null ? map.hashCode() : 0)) * 31;
        p pVar = this.enterFilterBoxEvent;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return ((hashCode3 + i2) * 31) + this.pendingSelected;
    }

    public final String toString() {
        return "FilterPanelState(ui=" + getUi() + ", selectedFilter=" + this.selectedFilter + ", disableFilter=" + this.disableFilter + ", data=" + this.data + ", enterFilterBoxEvent=" + this.enterFilterBoxEvent + ", pendingSelected=" + this.pendingSelected + ")";
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final boolean getDisableFilter() {
        return this.disableFilter;
    }

    public final p getEnterFilterBoxEvent() {
        return this.enterFilterBoxEvent;
    }

    public final int getPendingSelected() {
        return this.pendingSelected;
    }

    public final FilterBean getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterPanelState(a aVar, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, p pVar, int i2) {
        super(aVar);
        l.d(aVar, "");
        l.d(map, "");
        this.ui = aVar;
        this.selectedFilter = filterBean;
        this.disableFilter = z;
        this.data = map;
        this.enterFilterBoxEvent = pVar;
        this.pendingSelected = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterPanelState(a aVar, FilterBean filterBean, boolean z, Map map, p pVar, int i2, int i3, g gVar) {
        this(aVar, filterBean, z, map, (i3 & 16) != 0 ? null : pVar, (i3 & 32) != 0 ? Integer.MIN_VALUE : i2);
    }
}
