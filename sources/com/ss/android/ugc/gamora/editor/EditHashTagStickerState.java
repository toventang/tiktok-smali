package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class EditHashTagStickerState implements af {
    private final Boolean enableEdit;
    private final p hideHelpBoxEvent;

    static {
        Covode.recordClassIndex(95654);
    }

    public EditHashTagStickerState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditHashTagStickerState copy$default(EditHashTagStickerState editHashTagStickerState, p pVar, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editHashTagStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            bool = editHashTagStickerState.enableEdit;
        }
        return editHashTagStickerState.copy(pVar, bool);
    }

    public final p component1() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component2() {
        return this.enableEdit;
    }

    public final EditHashTagStickerState copy(p pVar, Boolean bool) {
        return new EditHashTagStickerState(pVar, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditHashTagStickerState)) {
            return false;
        }
        EditHashTagStickerState editHashTagStickerState = (EditHashTagStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editHashTagStickerState.hideHelpBoxEvent) && l.a(this.enableEdit, editHashTagStickerState.enableEdit);
    }

    public final int hashCode() {
        p pVar = this.hideHelpBoxEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditHashTagStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public EditHashTagStickerState(p pVar, Boolean bool) {
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditHashTagStickerState(p pVar, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : bool);
    }
}
