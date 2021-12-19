package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class EditCommentStickerState implements af {
    private final k hasCommentSticker;
    private final p hideHelpBoxEvent;
    private final boolean inTimeEditView;
    private final p removeCommentStickerEvent;

    static {
        Covode.recordClassIndex(95647);
    }

    public EditCommentStickerState() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ EditCommentStickerState copy$default(EditCommentStickerState editCommentStickerState, p pVar, boolean z, k kVar, p pVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editCommentStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            z = editCommentStickerState.inTimeEditView;
        }
        if ((i2 & 4) != 0) {
            kVar = editCommentStickerState.hasCommentSticker;
        }
        if ((i2 & 8) != 0) {
            pVar2 = editCommentStickerState.removeCommentStickerEvent;
        }
        return editCommentStickerState.copy(pVar, z, kVar, pVar2);
    }

    public final p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final k component3() {
        return this.hasCommentSticker;
    }

    public final p component4() {
        return this.removeCommentStickerEvent;
    }

    public final EditCommentStickerState copy(p pVar, boolean z, k kVar, p pVar2) {
        return new EditCommentStickerState(pVar, z, kVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCommentStickerState)) {
            return false;
        }
        EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editCommentStickerState.hideHelpBoxEvent) && this.inTimeEditView == editCommentStickerState.inTimeEditView && l.a(this.hasCommentSticker, editCommentStickerState.hasCommentSticker) && l.a(this.removeCommentStickerEvent, editCommentStickerState.removeCommentStickerEvent);
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
        k kVar = this.hasCommentSticker;
        int hashCode2 = (i6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        p pVar2 = this.removeCommentStickerEvent;
        if (pVar2 != null) {
            i2 = pVar2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EditCommentStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ", hasCommentSticker=" + this.hasCommentSticker + ", removeCommentStickerEvent=" + this.removeCommentStickerEvent + ")";
    }

    public final k getHasCommentSticker() {
        return this.hasCommentSticker;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final p getRemoveCommentStickerEvent() {
        return this.removeCommentStickerEvent;
    }

    public EditCommentStickerState(p pVar, boolean z, k kVar, p pVar2) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
        this.hasCommentSticker = kVar;
        this.removeCommentStickerEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditCommentStickerState(p pVar, boolean z, k kVar, p pVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : pVar2);
    }
}
