package com.ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class EditStickerState extends UiState {
    public static final a Companion = new a((byte) 0);
    private final o<Float, Float, Float> captionLayoutEvent;
    private final o<Float, Float, Float> commentStickerLayoutEvent;
    private final k enableDirectEditEvent;
    private final m hideAllHelpBoxEvent;
    private final o<Float, Float, Float> liveCDLayoutEvent;
    private final k onEditClipChangedEvent;
    private final n<Effect, String> onStickerChoose;
    private final p onStickerDismiss;
    private final p onStickerShow;
    private final n<Float, Long> pollTextAnimEvent;
    private final o<Float, Float, Float> pollTextLayoutEvent;
    private final Integer pollingTopMargin;
    private final p refreshVideoSource;
    private final p removeAllTTS;
    private final m removeStickerByTypeEvent;
    private final p showTextSticker;
    private final o<Boolean, Boolean, h.f.a.a<z>> stickerCompileEvent;
    private final com.bytedance.ui_component.a ui;
    private final n<Integer, Boolean> updateStickerTime;
    private final n<Integer, Integer> videoLengthUpdateEvent;
    private final k viewRenderStickerVisibleEvent;

    static {
        Covode.recordClassIndex(96251);
    }

    public EditStickerState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public static /* synthetic */ EditStickerState copy$default(EditStickerState editStickerState, com.bytedance.ui_component.a aVar, Integer num, n nVar, o oVar, o oVar2, o oVar3, o oVar4, m mVar, m mVar2, p pVar, n nVar2, p pVar2, p pVar3, k kVar, k kVar2, o oVar5, k kVar3, n nVar3, p pVar4, n nVar4, p pVar5, int i2, Object obj) {
        com.bytedance.ui_component.a aVar2 = aVar;
        o<Float, Float, Float> oVar6 = oVar3;
        Integer num2 = num;
        n<Float, Long> nVar5 = nVar;
        o<Float, Float, Float> oVar7 = oVar;
        o<Float, Float, Float> oVar8 = oVar2;
        k kVar4 = kVar;
        p pVar6 = pVar3;
        p pVar7 = pVar2;
        n nVar6 = nVar2;
        o<Float, Float, Float> oVar9 = oVar4;
        m mVar3 = mVar;
        m mVar4 = mVar2;
        p pVar8 = pVar;
        n nVar7 = nVar4;
        p pVar9 = pVar4;
        k kVar5 = kVar2;
        o oVar10 = oVar5;
        k kVar6 = kVar3;
        p pVar10 = pVar5;
        n nVar8 = nVar3;
        if ((i2 & 1) != 0) {
            aVar2 = editStickerState.getUi();
        }
        if ((i2 & 2) != 0) {
            num2 = editStickerState.pollingTopMargin;
        }
        if ((i2 & 4) != 0) {
            nVar5 = editStickerState.pollTextAnimEvent;
        }
        if ((i2 & 8) != 0) {
            oVar7 = editStickerState.pollTextLayoutEvent;
        }
        if ((i2 & 16) != 0) {
            oVar8 = editStickerState.liveCDLayoutEvent;
        }
        if ((i2 & 32) != 0) {
            oVar6 = editStickerState.commentStickerLayoutEvent;
        }
        if ((i2 & 64) != 0) {
            oVar9 = editStickerState.captionLayoutEvent;
        }
        if ((i2 & 128) != 0) {
            mVar3 = editStickerState.hideAllHelpBoxEvent;
        }
        if ((i2 & 256) != 0) {
            mVar4 = editStickerState.removeStickerByTypeEvent;
        }
        if ((i2 & 512) != 0) {
            pVar8 = editStickerState.showTextSticker;
        }
        if ((i2 & 1024) != 0) {
            nVar6 = editStickerState.onStickerChoose;
        }
        if ((i2 & 2048) != 0) {
            pVar7 = editStickerState.onStickerShow;
        }
        if ((i2 & 4096) != 0) {
            pVar6 = editStickerState.onStickerDismiss;
        }
        if ((i2 & 8192) != 0) {
            kVar4 = editStickerState.onEditClipChangedEvent;
        }
        if ((i2 & 16384) != 0) {
            kVar5 = editStickerState.enableDirectEditEvent;
        }
        if ((32768 & i2) != 0) {
            oVar10 = editStickerState.stickerCompileEvent;
        }
        if ((65536 & i2) != 0) {
            kVar6 = editStickerState.viewRenderStickerVisibleEvent;
        }
        if ((131072 & i2) != 0) {
            nVar8 = editStickerState.videoLengthUpdateEvent;
        }
        if ((262144 & i2) != 0) {
            pVar9 = editStickerState.refreshVideoSource;
        }
        if ((524288 & i2) != 0) {
            nVar7 = editStickerState.updateStickerTime;
        }
        if ((i2 & 1048576) != 0) {
            pVar10 = editStickerState.removeAllTTS;
        }
        return editStickerState.copy(aVar2, num2, nVar5, oVar7, oVar8, oVar6, oVar9, mVar3, mVar4, pVar8, nVar6, pVar7, pVar6, kVar4, kVar5, oVar10, kVar6, nVar8, pVar9, nVar7, pVar10);
    }

    public final com.bytedance.ui_component.a component1() {
        return getUi();
    }

    public final p component10() {
        return this.showTextSticker;
    }

    public final n<Effect, String> component11() {
        return this.onStickerChoose;
    }

    public final p component12() {
        return this.onStickerShow;
    }

    public final p component13() {
        return this.onStickerDismiss;
    }

    public final k component14() {
        return this.onEditClipChangedEvent;
    }

    public final k component15() {
        return this.enableDirectEditEvent;
    }

    public final o<Boolean, Boolean, h.f.a.a<z>> component16() {
        return this.stickerCompileEvent;
    }

    public final k component17() {
        return this.viewRenderStickerVisibleEvent;
    }

    public final n<Integer, Integer> component18() {
        return this.videoLengthUpdateEvent;
    }

    public final p component19() {
        return this.refreshVideoSource;
    }

    public final Integer component2() {
        return this.pollingTopMargin;
    }

    public final n<Integer, Boolean> component20() {
        return this.updateStickerTime;
    }

    public final p component21() {
        return this.removeAllTTS;
    }

    public final n<Float, Long> component3() {
        return this.pollTextAnimEvent;
    }

    public final o<Float, Float, Float> component4() {
        return this.pollTextLayoutEvent;
    }

    public final o<Float, Float, Float> component5() {
        return this.liveCDLayoutEvent;
    }

    public final o<Float, Float, Float> component6() {
        return this.commentStickerLayoutEvent;
    }

    public final o<Float, Float, Float> component7() {
        return this.captionLayoutEvent;
    }

    public final m component8() {
        return this.hideAllHelpBoxEvent;
    }

    public final m component9() {
        return this.removeStickerByTypeEvent;
    }

    public final EditStickerState copy(com.bytedance.ui_component.a aVar, Integer num, n<Float, Long> nVar, o<Float, Float, Float> oVar, o<Float, Float, Float> oVar2, o<Float, Float, Float> oVar3, o<Float, Float, Float> oVar4, m mVar, m mVar2, p pVar, n<Effect, String> nVar2, p pVar2, p pVar3, k kVar, k kVar2, o<Boolean, Boolean, h.f.a.a<z>> oVar5, k kVar3, n<Integer, Integer> nVar3, p pVar4, n<Integer, Boolean> nVar4, p pVar5) {
        l.d(aVar, "");
        return new EditStickerState(aVar, num, nVar, oVar, oVar2, oVar3, oVar4, mVar, mVar2, pVar, nVar2, pVar2, pVar3, kVar, kVar2, oVar5, kVar3, nVar3, pVar4, nVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditStickerState)) {
            return false;
        }
        EditStickerState editStickerState = (EditStickerState) obj;
        return l.a(getUi(), editStickerState.getUi()) && l.a(this.pollingTopMargin, editStickerState.pollingTopMargin) && l.a(this.pollTextAnimEvent, editStickerState.pollTextAnimEvent) && l.a(this.pollTextLayoutEvent, editStickerState.pollTextLayoutEvent) && l.a(this.liveCDLayoutEvent, editStickerState.liveCDLayoutEvent) && l.a(this.commentStickerLayoutEvent, editStickerState.commentStickerLayoutEvent) && l.a(this.captionLayoutEvent, editStickerState.captionLayoutEvent) && l.a(this.hideAllHelpBoxEvent, editStickerState.hideAllHelpBoxEvent) && l.a(this.removeStickerByTypeEvent, editStickerState.removeStickerByTypeEvent) && l.a(this.showTextSticker, editStickerState.showTextSticker) && l.a(this.onStickerChoose, editStickerState.onStickerChoose) && l.a(this.onStickerShow, editStickerState.onStickerShow) && l.a(this.onStickerDismiss, editStickerState.onStickerDismiss) && l.a(this.onEditClipChangedEvent, editStickerState.onEditClipChangedEvent) && l.a(this.enableDirectEditEvent, editStickerState.enableDirectEditEvent) && l.a(this.stickerCompileEvent, editStickerState.stickerCompileEvent) && l.a(this.viewRenderStickerVisibleEvent, editStickerState.viewRenderStickerVisibleEvent) && l.a(this.videoLengthUpdateEvent, editStickerState.videoLengthUpdateEvent) && l.a(this.refreshVideoSource, editStickerState.refreshVideoSource) && l.a(this.updateStickerTime, editStickerState.updateStickerTime) && l.a(this.removeAllTTS, editStickerState.removeAllTTS);
    }

    public final int hashCode() {
        com.bytedance.ui_component.a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Integer num = this.pollingTopMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        n<Float, Long> nVar = this.pollTextAnimEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar = this.pollTextLayoutEvent;
        int hashCode4 = (hashCode3 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar2 = this.liveCDLayoutEvent;
        int hashCode5 = (hashCode4 + (oVar2 != null ? oVar2.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar3 = this.commentStickerLayoutEvent;
        int hashCode6 = (hashCode5 + (oVar3 != null ? oVar3.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar4 = this.captionLayoutEvent;
        int hashCode7 = (hashCode6 + (oVar4 != null ? oVar4.hashCode() : 0)) * 31;
        m mVar = this.hideAllHelpBoxEvent;
        int hashCode8 = (hashCode7 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        m mVar2 = this.removeStickerByTypeEvent;
        int hashCode9 = (hashCode8 + (mVar2 != null ? mVar2.hashCode() : 0)) * 31;
        p pVar = this.showTextSticker;
        int hashCode10 = (hashCode9 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<Effect, String> nVar2 = this.onStickerChoose;
        int hashCode11 = (hashCode10 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        p pVar2 = this.onStickerShow;
        int hashCode12 = (hashCode11 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.onStickerDismiss;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        k kVar = this.onEditClipChangedEvent;
        int hashCode14 = (hashCode13 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        k kVar2 = this.enableDirectEditEvent;
        int hashCode15 = (hashCode14 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        o<Boolean, Boolean, h.f.a.a<z>> oVar5 = this.stickerCompileEvent;
        int hashCode16 = (hashCode15 + (oVar5 != null ? oVar5.hashCode() : 0)) * 31;
        k kVar3 = this.viewRenderStickerVisibleEvent;
        int hashCode17 = (hashCode16 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        n<Integer, Integer> nVar3 = this.videoLengthUpdateEvent;
        int hashCode18 = (hashCode17 + (nVar3 != null ? nVar3.hashCode() : 0)) * 31;
        p pVar4 = this.refreshVideoSource;
        int hashCode19 = (hashCode18 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        n<Integer, Boolean> nVar4 = this.updateStickerTime;
        int hashCode20 = (hashCode19 + (nVar4 != null ? nVar4.hashCode() : 0)) * 31;
        p pVar5 = this.removeAllTTS;
        if (pVar5 != null) {
            i2 = pVar5.hashCode();
        }
        return hashCode20 + i2;
    }

    public final String toString() {
        return "EditStickerState(ui=" + getUi() + ", pollingTopMargin=" + this.pollingTopMargin + ", pollTextAnimEvent=" + this.pollTextAnimEvent + ", pollTextLayoutEvent=" + this.pollTextLayoutEvent + ", liveCDLayoutEvent=" + this.liveCDLayoutEvent + ", commentStickerLayoutEvent=" + this.commentStickerLayoutEvent + ", captionLayoutEvent=" + this.captionLayoutEvent + ", hideAllHelpBoxEvent=" + this.hideAllHelpBoxEvent + ", removeStickerByTypeEvent=" + this.removeStickerByTypeEvent + ", showTextSticker=" + this.showTextSticker + ", onStickerChoose=" + this.onStickerChoose + ", onStickerShow=" + this.onStickerShow + ", onStickerDismiss=" + this.onStickerDismiss + ", onEditClipChangedEvent=" + this.onEditClipChangedEvent + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", stickerCompileEvent=" + this.stickerCompileEvent + ", viewRenderStickerVisibleEvent=" + this.viewRenderStickerVisibleEvent + ", videoLengthUpdateEvent=" + this.videoLengthUpdateEvent + ", refreshVideoSource=" + this.refreshVideoSource + ", updateStickerTime=" + this.updateStickerTime + ", removeAllTTS=" + this.removeAllTTS + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96252);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final o<Float, Float, Float> getCaptionLayoutEvent() {
        return this.captionLayoutEvent;
    }

    public final o<Float, Float, Float> getCommentStickerLayoutEvent() {
        return this.commentStickerLayoutEvent;
    }

    public final k getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final m getHideAllHelpBoxEvent() {
        return this.hideAllHelpBoxEvent;
    }

    public final o<Float, Float, Float> getLiveCDLayoutEvent() {
        return this.liveCDLayoutEvent;
    }

    public final k getOnEditClipChangedEvent() {
        return this.onEditClipChangedEvent;
    }

    public final n<Effect, String> getOnStickerChoose() {
        return this.onStickerChoose;
    }

    public final p getOnStickerDismiss() {
        return this.onStickerDismiss;
    }

    public final p getOnStickerShow() {
        return this.onStickerShow;
    }

    public final n<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final o<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final Integer getPollingTopMargin() {
        return this.pollingTopMargin;
    }

    public final p getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    public final p getRemoveAllTTS() {
        return this.removeAllTTS;
    }

    public final m getRemoveStickerByTypeEvent() {
        return this.removeStickerByTypeEvent;
    }

    public final p getShowTextSticker() {
        return this.showTextSticker;
    }

    public final o<Boolean, Boolean, h.f.a.a<z>> getStickerCompileEvent() {
        return this.stickerCompileEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final com.bytedance.ui_component.a getUi() {
        return this.ui;
    }

    public final n<Integer, Boolean> getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final n<Integer, Integer> getVideoLengthUpdateEvent() {
        return this.videoLengthUpdateEvent;
    }

    public final k getViewRenderStickerVisibleEvent() {
        return this.viewRenderStickerVisibleEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditStickerState(com.bytedance.ui_component.a aVar, Integer num, n<Float, Long> nVar, o<Float, Float, Float> oVar, o<Float, Float, Float> oVar2, o<Float, Float, Float> oVar3, o<Float, Float, Float> oVar4, m mVar, m mVar2, p pVar, n<Effect, String> nVar2, p pVar2, p pVar3, k kVar, k kVar2, o<Boolean, Boolean, h.f.a.a<z>> oVar5, k kVar3, n<Integer, Integer> nVar3, p pVar4, n<Integer, Boolean> nVar4, p pVar5) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.pollingTopMargin = num;
        this.pollTextAnimEvent = nVar;
        this.pollTextLayoutEvent = oVar;
        this.liveCDLayoutEvent = oVar2;
        this.commentStickerLayoutEvent = oVar3;
        this.captionLayoutEvent = oVar4;
        this.hideAllHelpBoxEvent = mVar;
        this.removeStickerByTypeEvent = mVar2;
        this.showTextSticker = pVar;
        this.onStickerChoose = nVar2;
        this.onStickerShow = pVar2;
        this.onStickerDismiss = pVar3;
        this.onEditClipChangedEvent = kVar;
        this.enableDirectEditEvent = kVar2;
        this.stickerCompileEvent = oVar5;
        this.viewRenderStickerVisibleEvent = kVar3;
        this.videoLengthUpdateEvent = nVar3;
        this.refreshVideoSource = pVar4;
        this.updateStickerTime = nVar4;
        this.removeAllTTS = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditStickerState(com.bytedance.ui_component.a aVar, Integer num, n nVar, o oVar, o oVar2, o oVar3, o oVar4, m mVar, m mVar2, p pVar, n nVar2, p pVar2, p pVar3, k kVar, k kVar2, o oVar5, k kVar3, n nVar3, p pVar4, n nVar4, p pVar5, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : nVar, (i2 & 8) != 0 ? null : oVar, (i2 & 16) != 0 ? null : oVar2, (i2 & 32) != 0 ? null : oVar3, (i2 & 64) != 0 ? null : oVar4, (i2 & 128) != 0 ? null : mVar, (i2 & 256) != 0 ? null : mVar2, (i2 & 512) != 0 ? null : pVar, (i2 & 1024) != 0 ? null : nVar2, (i2 & 2048) != 0 ? null : pVar2, (i2 & 4096) != 0 ? null : pVar3, (i2 & 8192) != 0 ? null : kVar, (i2 & 16384) != 0 ? null : kVar2, (32768 & i2) != 0 ? null : oVar5, (65536 & i2) != 0 ? null : kVar3, (131072 & i2) != 0 ? null : nVar3, (262144 & i2) != 0 ? null : pVar4, (524288 & i2) != 0 ? null : nVar4, (i2 & 1048576) != 0 ? null : pVar5);
    }
}
