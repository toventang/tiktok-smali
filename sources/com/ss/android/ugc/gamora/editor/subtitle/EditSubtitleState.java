package com.ss.android.ugc.gamora.editor.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.sticker.data.h;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class EditSubtitleState extends UiState {
    private d<? extends List<h>> captionsChangeEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(96765);
    }

    public EditSubtitleState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditSubtitleState copy$default(EditSubtitleState editSubtitleState, a aVar, d dVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editSubtitleState.getUi();
        }
        if ((i2 & 2) != 0) {
            dVar = editSubtitleState.captionsChangeEvent;
        }
        return editSubtitleState.copy(aVar, dVar);
    }

    public final a component1() {
        return getUi();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.bytedance.jedi.arch.d<? extends java.util.List<com.ss.android.ugc.aweme.sticker.data.h>>, com.bytedance.jedi.arch.d<java.util.List<com.ss.android.ugc.aweme.sticker.data.h>> */
    public final d<List<h>> component2() {
        return this.captionsChangeEvent;
    }

    public final EditSubtitleState copy(a aVar, d<? extends List<h>> dVar) {
        l.d(aVar, "");
        return new EditSubtitleState(aVar, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditSubtitleState)) {
            return false;
        }
        EditSubtitleState editSubtitleState = (EditSubtitleState) obj;
        return l.a(getUi(), editSubtitleState.getUi()) && l.a(this.captionsChangeEvent, editSubtitleState.captionsChangeEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        d<? extends List<h>> dVar = this.captionsChangeEvent;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditSubtitleState(ui=" + getUi() + ", captionsChangeEvent=" + this.captionsChangeEvent + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.bytedance.jedi.arch.d<? extends java.util.List<com.ss.android.ugc.aweme.sticker.data.h>>, com.bytedance.jedi.arch.d<java.util.List<com.ss.android.ugc.aweme.sticker.data.h>> */
    public final d<List<h>> getCaptionsChangeEvent() {
        return this.captionsChangeEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final void setCaptionsChangeEvent(d<? extends List<h>> dVar) {
        this.captionsChangeEvent = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditSubtitleState(a aVar, d<? extends List<h>> dVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.captionsChangeEvent = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditSubtitleState(a aVar, d dVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : dVar);
    }
}
