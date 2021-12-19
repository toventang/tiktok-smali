package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class EditDonationStickerState implements af {
    private final p hideHelpBoxEvent;
    private final boolean inTimeEditView;

    static {
        Covode.recordClassIndex(83448);
    }

    public EditDonationStickerState() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ EditDonationStickerState copy$default(EditDonationStickerState editDonationStickerState, p pVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editDonationStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            z = editDonationStickerState.inTimeEditView;
        }
        return editDonationStickerState.copy(pVar, z);
    }

    public final p component1() {
        return this.hideHelpBoxEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final EditDonationStickerState copy(p pVar, boolean z) {
        return new EditDonationStickerState(pVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDonationStickerState)) {
            return false;
        }
        EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editDonationStickerState.hideHelpBoxEvent) && this.inTimeEditView == editDonationStickerState.inTimeEditView;
    }

    public final int hashCode() {
        p pVar = this.hideHelpBoxEvent;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "EditDonationStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", inTimeEditView=" + this.inTimeEditView + ")";
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public EditDonationStickerState(p pVar, boolean z) {
        this.hideHelpBoxEvent = pVar;
        this.inTimeEditView = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDonationStickerState(p pVar, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? false : z);
    }
}
