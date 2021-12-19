package com.ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.g;
import h.f.b.l;

public final class EditFilterIndicatorState extends UiState {
    private final FilterBean currentFilter;
    private final boolean isAutoUse;
    private final boolean isShowPrompt;
    private final a ui;

    static {
        Covode.recordClassIndex(95888);
    }

    public static /* synthetic */ EditFilterIndicatorState copy$default(EditFilterIndicatorState editFilterIndicatorState, boolean z, boolean z2, FilterBean filterBean, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = editFilterIndicatorState.isAutoUse;
        }
        if ((i2 & 2) != 0) {
            z2 = editFilterIndicatorState.isShowPrompt;
        }
        if ((i2 & 4) != 0) {
            filterBean = editFilterIndicatorState.currentFilter;
        }
        if ((i2 & 8) != 0) {
            aVar = editFilterIndicatorState.getUi();
        }
        return editFilterIndicatorState.copy(z, z2, filterBean, aVar);
    }

    public final boolean component1() {
        return this.isAutoUse;
    }

    public final boolean component2() {
        return this.isShowPrompt;
    }

    public final FilterBean component3() {
        return this.currentFilter;
    }

    public final a component4() {
        return getUi();
    }

    public final EditFilterIndicatorState copy(boolean z, boolean z2, FilterBean filterBean, a aVar) {
        l.d(aVar, "");
        return new EditFilterIndicatorState(z, z2, filterBean, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterIndicatorState)) {
            return false;
        }
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return this.isAutoUse == editFilterIndicatorState.isAutoUse && this.isShowPrompt == editFilterIndicatorState.isShowPrompt && l.a(this.currentFilter, editFilterIndicatorState.currentFilter) && l.a(getUi(), editFilterIndicatorState.getUi());
    }

    public final int hashCode() {
        boolean z = this.isAutoUse;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.isShowPrompt) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        FilterBean filterBean = this.currentFilter;
        int i8 = 0;
        int hashCode = (i7 + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i8 = ui2.hashCode();
        }
        return hashCode + i8;
    }

    public final String toString() {
        return "EditFilterIndicatorState(isAutoUse=" + this.isAutoUse + ", isShowPrompt=" + this.isShowPrompt + ", currentFilter=" + this.currentFilter + ", ui=" + getUi() + ")";
    }

    public final FilterBean getCurrentFilter() {
        return this.currentFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final boolean isShowPrompt() {
        return this.isShowPrompt;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.isAutoUse = z;
        this.isShowPrompt = z2;
        this.currentFilter = filterBean;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, a aVar, int i2, g gVar) {
        this(z, z2, (i2 & 4) != 0 ? null : filterBean, (i2 & 8) != 0 ? new a.C1131a() : aVar);
    }
}
