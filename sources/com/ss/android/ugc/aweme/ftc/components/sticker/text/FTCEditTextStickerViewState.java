package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.c.e;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import h.f.a.b;
import h.f.a.m;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class FTCEditTextStickerViewState extends UiState {
    private final n<TextStickerData, Boolean> addSticker;
    private final d<m<q, q, z>> changeToTopListener;
    private final p dismissHitText;
    private final boolean inTimeEditView;
    private final p reloadStickerEvent;
    private final p removeAllStickerEvent;
    private final p resetGuideViewVisibilityEvent;
    private final d<q> showInputView;
    private final d<q> sticker2Top;
    private final d<h.p<Integer, Integer>> targetCanvasSize;
    private final d<com.ss.android.ugc.aweme.editSticker.text.c.d> textStickerEditListener;
    private final d<e> textStickerListener;
    private final d<com.ss.android.ugc.aweme.editSticker.d.e> textStickerMob;
    private final d<b<q, z>> timeClickListener;
    private final a ui;
    private final p updateLayoutSizeEvent;

    static {
        Covode.recordClassIndex(62382);
    }

    public FTCEditTextStickerViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ FTCEditTextStickerViewState copy$default(FTCEditTextStickerViewState fTCEditTextStickerViewState, a aVar, boolean z, d dVar, p pVar, n nVar, p pVar2, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, p pVar3, p pVar4, p pVar5, int i2, Object obj) {
        a aVar2 = aVar;
        boolean z2 = z;
        n nVar2 = nVar;
        p pVar6 = pVar;
        d<q> dVar9 = dVar;
        d dVar10 = dVar3;
        d dVar11 = dVar2;
        p pVar7 = pVar2;
        d dVar12 = dVar6;
        d dVar13 = dVar5;
        d dVar14 = dVar4;
        p pVar8 = pVar3;
        d dVar15 = dVar8;
        d dVar16 = dVar7;
        p pVar9 = pVar5;
        p pVar10 = pVar4;
        if ((i2 & 1) != 0) {
            aVar2 = fTCEditTextStickerViewState.getUi();
        }
        if ((i2 & 2) != 0) {
            z2 = fTCEditTextStickerViewState.inTimeEditView;
        }
        if ((i2 & 4) != 0) {
            dVar9 = fTCEditTextStickerViewState.sticker2Top;
        }
        if ((i2 & 8) != 0) {
            pVar6 = fTCEditTextStickerViewState.dismissHitText;
        }
        if ((i2 & 16) != 0) {
            nVar2 = fTCEditTextStickerViewState.addSticker;
        }
        if ((i2 & 32) != 0) {
            pVar7 = fTCEditTextStickerViewState.reloadStickerEvent;
        }
        if ((i2 & 64) != 0) {
            dVar11 = fTCEditTextStickerViewState.textStickerListener;
        }
        if ((i2 & 128) != 0) {
            dVar10 = fTCEditTextStickerViewState.changeToTopListener;
        }
        if ((i2 & 256) != 0) {
            dVar14 = fTCEditTextStickerViewState.textStickerEditListener;
        }
        if ((i2 & 512) != 0) {
            dVar13 = fTCEditTextStickerViewState.timeClickListener;
        }
        if ((i2 & 1024) != 0) {
            dVar12 = fTCEditTextStickerViewState.textStickerMob;
        }
        if ((i2 & 2048) != 0) {
            dVar16 = fTCEditTextStickerViewState.targetCanvasSize;
        }
        if ((i2 & 4096) != 0) {
            dVar15 = fTCEditTextStickerViewState.showInputView;
        }
        if ((i2 & 8192) != 0) {
            pVar8 = fTCEditTextStickerViewState.removeAllStickerEvent;
        }
        if ((i2 & 16384) != 0) {
            pVar10 = fTCEditTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((i2 & 32768) != 0) {
            pVar9 = fTCEditTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        return fTCEditTextStickerViewState.copy(aVar2, z2, dVar9, pVar6, nVar2, pVar7, dVar11, dVar10, dVar14, dVar13, dVar12, dVar16, dVar15, pVar8, pVar10, pVar9);
    }

    public final a component1() {
        return getUi();
    }

    public final d<b<q, z>> component10() {
        return this.timeClickListener;
    }

    public final d<com.ss.android.ugc.aweme.editSticker.d.e> component11() {
        return this.textStickerMob;
    }

    public final d<h.p<Integer, Integer>> component12() {
        return this.targetCanvasSize;
    }

    public final d<q> component13() {
        return this.showInputView;
    }

    public final p component14() {
        return this.removeAllStickerEvent;
    }

    public final p component15() {
        return this.updateLayoutSizeEvent;
    }

    public final p component16() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final d<q> component3() {
        return this.sticker2Top;
    }

    public final p component4() {
        return this.dismissHitText;
    }

    public final n<TextStickerData, Boolean> component5() {
        return this.addSticker;
    }

    public final p component6() {
        return this.reloadStickerEvent;
    }

    public final d<e> component7() {
        return this.textStickerListener;
    }

    public final d<m<q, q, z>> component8() {
        return this.changeToTopListener;
    }

    public final d<com.ss.android.ugc.aweme.editSticker.text.c.d> component9() {
        return this.textStickerEditListener;
    }

    public final FTCEditTextStickerViewState copy(a aVar, boolean z, d<? extends q> dVar, p pVar, n<TextStickerData, Boolean> nVar, p pVar2, d<? extends e> dVar2, d<? extends m<? super q, ? super q, z>> dVar3, d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar4, d<? extends b<? super q, z>> dVar5, d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar6, d<h.p<Integer, Integer>> dVar7, d<? extends q> dVar8, p pVar3, p pVar4, p pVar5) {
        l.d(aVar, "");
        return new FTCEditTextStickerViewState(aVar, z, dVar, pVar, nVar, pVar2, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, pVar3, pVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditTextStickerViewState)) {
            return false;
        }
        FTCEditTextStickerViewState fTCEditTextStickerViewState = (FTCEditTextStickerViewState) obj;
        return l.a(getUi(), fTCEditTextStickerViewState.getUi()) && this.inTimeEditView == fTCEditTextStickerViewState.inTimeEditView && l.a(this.sticker2Top, fTCEditTextStickerViewState.sticker2Top) && l.a(this.dismissHitText, fTCEditTextStickerViewState.dismissHitText) && l.a(this.addSticker, fTCEditTextStickerViewState.addSticker) && l.a(this.reloadStickerEvent, fTCEditTextStickerViewState.reloadStickerEvent) && l.a(this.textStickerListener, fTCEditTextStickerViewState.textStickerListener) && l.a(this.changeToTopListener, fTCEditTextStickerViewState.changeToTopListener) && l.a(this.textStickerEditListener, fTCEditTextStickerViewState.textStickerEditListener) && l.a(this.timeClickListener, fTCEditTextStickerViewState.timeClickListener) && l.a(this.textStickerMob, fTCEditTextStickerViewState.textStickerMob) && l.a(this.targetCanvasSize, fTCEditTextStickerViewState.targetCanvasSize) && l.a(this.showInputView, fTCEditTextStickerViewState.showInputView) && l.a(this.removeAllStickerEvent, fTCEditTextStickerViewState.removeAllStickerEvent) && l.a(this.updateLayoutSizeEvent, fTCEditTextStickerViewState.updateLayoutSizeEvent) && l.a(this.resetGuideViewVisibilityEvent, fTCEditTextStickerViewState.resetGuideViewVisibilityEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        boolean z = this.inTimeEditView;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        d<q> dVar = this.sticker2Top;
        int hashCode2 = (i6 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        p pVar = this.dismissHitText;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<TextStickerData, Boolean> nVar = this.addSticker;
        int hashCode4 = (hashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        p pVar2 = this.reloadStickerEvent;
        int hashCode5 = (hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        d<e> dVar2 = this.textStickerListener;
        int hashCode6 = (hashCode5 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        d<m<q, q, z>> dVar3 = this.changeToTopListener;
        int hashCode7 = (hashCode6 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        d<com.ss.android.ugc.aweme.editSticker.text.c.d> dVar4 = this.textStickerEditListener;
        int hashCode8 = (hashCode7 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        d<b<q, z>> dVar5 = this.timeClickListener;
        int hashCode9 = (hashCode8 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        d<com.ss.android.ugc.aweme.editSticker.d.e> dVar6 = this.textStickerMob;
        int hashCode10 = (hashCode9 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        d<h.p<Integer, Integer>> dVar7 = this.targetCanvasSize;
        int hashCode11 = (hashCode10 + (dVar7 != null ? dVar7.hashCode() : 0)) * 31;
        d<q> dVar8 = this.showInputView;
        int hashCode12 = (hashCode11 + (dVar8 != null ? dVar8.hashCode() : 0)) * 31;
        p pVar3 = this.removeAllStickerEvent;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        p pVar4 = this.updateLayoutSizeEvent;
        int hashCode14 = (hashCode13 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        p pVar5 = this.resetGuideViewVisibilityEvent;
        if (pVar5 != null) {
            i2 = pVar5.hashCode();
        }
        return hashCode14 + i2;
    }

    public final String toString() {
        return "FTCEditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ")";
    }

    public final n<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final d<m<q, q, z>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final p getDismissHitText() {
        return this.dismissHitText;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final p getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final p getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final p getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final d<q> getShowInputView() {
        return this.showInputView;
    }

    public final d<q> getSticker2Top() {
        return this.sticker2Top;
    }

    public final d<h.p<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final d<com.ss.android.ugc.aweme.editSticker.text.c.d> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final d<e> getTextStickerListener() {
        return this.textStickerListener;
    }

    public final d<com.ss.android.ugc.aweme.editSticker.d.e> getTextStickerMob() {
        return this.textStickerMob;
    }

    public final d<b<q, z>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final p getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditTextStickerViewState(a aVar, boolean z, d<? extends q> dVar, p pVar, n<TextStickerData, Boolean> nVar, p pVar2, d<? extends e> dVar2, d<? extends m<? super q, ? super q, z>> dVar3, d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar4, d<? extends b<? super q, z>> dVar5, d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar6, d<h.p<Integer, Integer>> dVar7, d<? extends q> dVar8, p pVar3, p pVar4, p pVar5) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.inTimeEditView = z;
        this.sticker2Top = dVar;
        this.dismissHitText = pVar;
        this.addSticker = nVar;
        this.reloadStickerEvent = pVar2;
        this.textStickerListener = dVar2;
        this.changeToTopListener = dVar3;
        this.textStickerEditListener = dVar4;
        this.timeClickListener = dVar5;
        this.textStickerMob = dVar6;
        this.targetCanvasSize = dVar7;
        this.showInputView = dVar8;
        this.removeAllStickerEvent = pVar3;
        this.updateLayoutSizeEvent = pVar4;
        this.resetGuideViewVisibilityEvent = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditTextStickerViewState(a aVar, boolean z, d dVar, p pVar, n nVar, p pVar2, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, p pVar3, p pVar4, p pVar5, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? null : pVar, (i2 & 16) != 0 ? null : nVar, (i2 & 32) != 0 ? null : pVar2, (i2 & 64) != 0 ? null : dVar2, (i2 & 128) != 0 ? null : dVar3, (i2 & 256) != 0 ? null : dVar4, (i2 & 512) != 0 ? null : dVar5, (i2 & 1024) != 0 ? null : dVar6, (i2 & 2048) != 0 ? null : dVar7, (i2 & 4096) != 0 ? null : dVar8, (i2 & 8192) != 0 ? null : pVar3, (i2 & 16384) != 0 ? null : pVar4, (i2 & 32768) != 0 ? null : pVar5);
    }
}
