package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class ReplaceMusicEditToolbarState extends UiState {
    private final Boolean backVisible;
    private final p refresh;
    private final a ui;
    private final k viewVisible;

    static {
        Covode.recordClassIndex(96826);
    }

    public static /* synthetic */ ReplaceMusicEditToolbarState copy$default(ReplaceMusicEditToolbarState replaceMusicEditToolbarState, a aVar, Boolean bool, p pVar, k kVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = replaceMusicEditToolbarState.getUi();
        }
        if ((i2 & 2) != 0) {
            bool = replaceMusicEditToolbarState.backVisible;
        }
        if ((i2 & 4) != 0) {
            pVar = replaceMusicEditToolbarState.refresh;
        }
        if ((i2 & 8) != 0) {
            kVar = replaceMusicEditToolbarState.viewVisible;
        }
        return replaceMusicEditToolbarState.copy(aVar, bool, pVar, kVar);
    }

    public final a component1() {
        return getUi();
    }

    public final Boolean component2() {
        return this.backVisible;
    }

    public final p component3() {
        return this.refresh;
    }

    public final k component4() {
        return this.viewVisible;
    }

    public final ReplaceMusicEditToolbarState copy(a aVar, Boolean bool, p pVar, k kVar) {
        l.d(aVar, "");
        return new ReplaceMusicEditToolbarState(aVar, bool, pVar, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceMusicEditToolbarState)) {
            return false;
        }
        ReplaceMusicEditToolbarState replaceMusicEditToolbarState = (ReplaceMusicEditToolbarState) obj;
        return l.a(getUi(), replaceMusicEditToolbarState.getUi()) && l.a(this.backVisible, replaceMusicEditToolbarState.backVisible) && l.a(this.refresh, replaceMusicEditToolbarState.refresh) && l.a(this.viewVisible, replaceMusicEditToolbarState.viewVisible);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        p pVar = this.refresh;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        k kVar = this.viewVisible;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ReplaceMusicEditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", refresh=" + this.refresh + ", viewVisible=" + this.viewVisible + ")";
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final p getRefresh() {
        return this.refresh;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final k getViewVisible() {
        return this.viewVisible;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplaceMusicEditToolbarState(a aVar, Boolean bool, p pVar, k kVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.backVisible = bool;
        this.refresh = pVar;
        this.viewVisible = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReplaceMusicEditToolbarState(a aVar, Boolean bool, p pVar, k kVar, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : pVar, (i2 & 8) != 0 ? null : kVar);
    }
}
