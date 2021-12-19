package com.ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.g;
import h.f.b.l;

public final class CommentAndQuestionStickerPanelState extends UiState {
    private d<CommentVideoModel> clickCommentStickerEvent;
    private final d<QaStruct> clickQaStickerEvent;
    private p removeRecordCommentStickerView;
    private k replaceStickerModelEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(45042);
    }

    public CommentAndQuestionStickerPanelState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentAndQuestionStickerPanelState copy$default(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState, k kVar, p pVar, d dVar, d dVar2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = commentAndQuestionStickerPanelState.replaceStickerModelEvent;
        }
        if ((i2 & 2) != 0) {
            pVar = commentAndQuestionStickerPanelState.removeRecordCommentStickerView;
        }
        if ((i2 & 4) != 0) {
            dVar = commentAndQuestionStickerPanelState.clickCommentStickerEvent;
        }
        if ((i2 & 8) != 0) {
            dVar2 = commentAndQuestionStickerPanelState.clickQaStickerEvent;
        }
        if ((i2 & 16) != 0) {
            aVar = commentAndQuestionStickerPanelState.getUi();
        }
        return commentAndQuestionStickerPanelState.copy(kVar, pVar, dVar, dVar2, aVar);
    }

    public final k component1() {
        return this.replaceStickerModelEvent;
    }

    public final p component2() {
        return this.removeRecordCommentStickerView;
    }

    public final d<CommentVideoModel> component3() {
        return this.clickCommentStickerEvent;
    }

    public final d<QaStruct> component4() {
        return this.clickQaStickerEvent;
    }

    public final a component5() {
        return getUi();
    }

    public final CommentAndQuestionStickerPanelState copy(k kVar, p pVar, d<CommentVideoModel> dVar, d<QaStruct> dVar2, a aVar) {
        l.d(aVar, "");
        return new CommentAndQuestionStickerPanelState(kVar, pVar, dVar, dVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentAndQuestionStickerPanelState)) {
            return false;
        }
        CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState = (CommentAndQuestionStickerPanelState) obj;
        return l.a(this.replaceStickerModelEvent, commentAndQuestionStickerPanelState.replaceStickerModelEvent) && l.a(this.removeRecordCommentStickerView, commentAndQuestionStickerPanelState.removeRecordCommentStickerView) && l.a(this.clickCommentStickerEvent, commentAndQuestionStickerPanelState.clickCommentStickerEvent) && l.a(this.clickQaStickerEvent, commentAndQuestionStickerPanelState.clickQaStickerEvent) && l.a(getUi(), commentAndQuestionStickerPanelState.getUi());
    }

    public final int hashCode() {
        k kVar = this.replaceStickerModelEvent;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        p pVar = this.removeRecordCommentStickerView;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        d<CommentVideoModel> dVar = this.clickCommentStickerEvent;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        d<QaStruct> dVar2 = this.clickQaStickerEvent;
        int hashCode4 = (hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CommentAndQuestionStickerPanelState(replaceStickerModelEvent=" + this.replaceStickerModelEvent + ", removeRecordCommentStickerView=" + this.removeRecordCommentStickerView + ", clickCommentStickerEvent=" + this.clickCommentStickerEvent + ", clickQaStickerEvent=" + this.clickQaStickerEvent + ", ui=" + getUi() + ")";
    }

    public final d<CommentVideoModel> getClickCommentStickerEvent() {
        return this.clickCommentStickerEvent;
    }

    public final d<QaStruct> getClickQaStickerEvent() {
        return this.clickQaStickerEvent;
    }

    public final p getRemoveRecordCommentStickerView() {
        return this.removeRecordCommentStickerView;
    }

    public final k getReplaceStickerModelEvent() {
        return this.replaceStickerModelEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final void setClickCommentStickerEvent(d<CommentVideoModel> dVar) {
        this.clickCommentStickerEvent = dVar;
    }

    public final void setRemoveRecordCommentStickerView(p pVar) {
        this.removeRecordCommentStickerView = pVar;
    }

    public final void setReplaceStickerModelEvent(k kVar) {
        this.replaceStickerModelEvent = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentAndQuestionStickerPanelState(k kVar, p pVar, d<CommentVideoModel> dVar, d<QaStruct> dVar2, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.replaceStickerModelEvent = kVar;
        this.removeRecordCommentStickerView = pVar;
        this.clickCommentStickerEvent = dVar;
        this.clickQaStickerEvent = dVar2;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentAndQuestionStickerPanelState(k kVar, p pVar, d dVar, d dVar2, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : dVar, (i2 & 8) == 0 ? dVar2 : null, (i2 & 16) != 0 ? new a.C1131a() : aVar);
    }
}
