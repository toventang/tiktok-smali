package com.ss.android.ugc.aweme.story.edit.business.shared.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class StoryEditEffectPanelState extends UiState {
    private final p clipRefreshEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(89832);
    }

    public StoryEditEffectPanelState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ StoryEditEffectPanelState copy$default(StoryEditEffectPanelState storyEditEffectPanelState, a aVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = storyEditEffectPanelState.getUi();
        }
        if ((i2 & 2) != 0) {
            pVar = storyEditEffectPanelState.clipRefreshEvent;
        }
        return storyEditEffectPanelState.copy(aVar, pVar);
    }

    public final a component1() {
        return getUi();
    }

    public final p component2() {
        return this.clipRefreshEvent;
    }

    public final StoryEditEffectPanelState copy(a aVar, p pVar) {
        l.d(aVar, "");
        return new StoryEditEffectPanelState(aVar, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditEffectPanelState)) {
            return false;
        }
        StoryEditEffectPanelState storyEditEffectPanelState = (StoryEditEffectPanelState) obj;
        return l.a(getUi(), storyEditEffectPanelState.getUi()) && l.a(this.clipRefreshEvent, storyEditEffectPanelState.clipRefreshEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        p pVar = this.clipRefreshEvent;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StoryEditEffectPanelState(ui=" + getUi() + ", clipRefreshEvent=" + this.clipRefreshEvent + ")";
    }

    public final p getClipRefreshEvent() {
        return this.clipRefreshEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryEditEffectPanelState(a aVar, p pVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.clipRefreshEvent = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditEffectPanelState(a aVar, p pVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : pVar);
    }
}
