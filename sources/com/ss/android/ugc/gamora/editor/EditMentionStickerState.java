package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class EditMentionStickerState implements af {
    private final Boolean enableEdit;
    private final p hideHelpBoxEvent;
    private final boolean inTimeEditView;

    static {
        Covode.recordClassIndex(95659);
    }

    public EditMentionStickerState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ EditMentionStickerState copy$default(EditMentionStickerState editMentionStickerState, p pVar, boolean z, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editMentionStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            z = editMentionStickerState.inTimeEditView;
        }
        if ((i2 & 4) != 0) {
            bool = editMentionStickerState.enableEdit;
        }
        return editMentionStickerState.copy(pVar, z, bool);
    }

    public final p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final Boolean component3() {
        return this.enableEdit;
    }

    public final EditMentionStickerState copy(p pVar, boolean z, Boolean bool) {
        return new EditMentionStickerState(pVar, z, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMentionStickerState)) {
            return false;
        }
        EditMentionStickerState editMentionStickerState = (EditMentionStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editMentionStickerState.hideHelpBoxEvent) && this.inTimeEditView == editMentionStickerState.inTimeEditView && l.a(this.enableEdit, editMentionStickerState.enableEdit);
    }

    public final int hashCode() {
        p pVar = this.hideHelpBoxEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EditMentionStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ", enableEdit=" + this.enableEdit + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public EditMentionStickerState(p pVar, boolean z, Boolean bool) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
        this.enableEdit = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMentionStickerState(p pVar, boolean z, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : bool);
    }
}
