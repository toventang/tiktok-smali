package com.ss.android.ugc.aweme.editSticker.text.als;

import android.text.TextWatcher;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.n;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.c.e;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import h.f.a.b;
import h.f.a.m;
import h.f.b.g;
import h.f.b.l;
import h.p;
import h.z;

public final class EditTextStickerViewState extends UiState {
    private final n<TextStickerData, Boolean> addSticker;
    private final d<TextWatcher> addTextChangeListenerEvent;
    private final d<String> addTextStickerViaString;
    private final d<p<TextStickerData, String>> afterChangeTextAutoRead;
    private final com.bytedance.jedi.arch.p cancelNewStickerRead;
    private final k changeTextEditPageReadIcon;
    private final d<m<q, q, z>> changeToTopListener;
    private final com.bytedance.jedi.arch.p dismissHitText;
    private final d<q> editTextSticker;
    private final k enableDirectEditEvent;
    private final d<String> fakeTextDataAndRead;
    private final k forceHideReadItemEvent;
    private final k getNowStringGoToReadWithFake;
    private final d<q> goReadTextStickerScene;
    private final d<View.OnClickListener> guideListener;
    private final k guideViewVisibility;
    private final boolean inTimeEditView;
    private final k muteReadText;
    private final d<b<q, z>> readTextClickListener;
    private final com.bytedance.jedi.arch.p reloadStickerEvent;
    private final com.bytedance.jedi.arch.p removeAllStickerEvent;
    private final com.bytedance.jedi.arch.p removeAllTTS;
    private final d<q> removeTextSticker;
    private final com.bytedance.jedi.arch.p resetGuideViewVisibilityEvent;
    private final d<q> showInputView;
    private final d<q> sticker2Top;
    private final d<p<Integer, Integer>> targetCanvasSize;
    private final d<com.ss.android.ugc.aweme.editSticker.text.c.d> textStickerEditListener;
    private final d<e> textStickerListener;
    private final d<com.ss.android.ugc.aweme.editSticker.d.e> textStickerMob;
    private final d<b<q, z>> timeClickListener;
    private final a ui;
    private final com.bytedance.jedi.arch.p updateLayoutSizeEvent;
    private final com.bytedance.jedi.arch.m updateStickerTime;

    static {
        Covode.recordClassIndex(55574);
    }

    public EditTextStickerViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    public static /* synthetic */ EditTextStickerViewState copy$default(EditTextStickerViewState editTextStickerViewState, a aVar, boolean z, d dVar, com.bytedance.jedi.arch.p pVar, n nVar, d dVar2, com.bytedance.jedi.arch.p pVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, com.bytedance.jedi.arch.p pVar3, com.bytedance.jedi.arch.p pVar4, k kVar, com.bytedance.jedi.arch.p pVar5, k kVar2, d dVar12, com.bytedance.jedi.arch.p pVar6, d dVar13, k kVar3, k kVar4, d dVar14, k kVar5, k kVar6, d dVar15, d dVar16, d dVar17, com.bytedance.jedi.arch.m mVar, com.bytedance.jedi.arch.p pVar7, int i2, int i3, Object obj) {
        a aVar2 = aVar;
        d<p<Integer, Integer>> dVar18 = dVar9;
        d<com.ss.android.ugc.aweme.editSticker.d.e> dVar19 = dVar8;
        d<b<q, z>> dVar20 = dVar7;
        n<TextStickerData, Boolean> nVar2 = nVar;
        com.bytedance.jedi.arch.p pVar8 = pVar;
        d<q> dVar21 = dVar;
        boolean z2 = z;
        d<View.OnClickListener> dVar22 = dVar2;
        com.bytedance.jedi.arch.p pVar9 = pVar2;
        d<e> dVar23 = dVar3;
        d<m<q, q, z>> dVar24 = dVar4;
        d<com.ss.android.ugc.aweme.editSticker.text.c.d> dVar25 = dVar5;
        d<b<q, z>> dVar26 = dVar6;
        d dVar27 = dVar16;
        d dVar28 = dVar15;
        k kVar7 = kVar6;
        k kVar8 = kVar5;
        d dVar29 = dVar14;
        d dVar30 = dVar17;
        k kVar9 = kVar4;
        k kVar10 = kVar3;
        com.bytedance.jedi.arch.p pVar10 = pVar4;
        com.bytedance.jedi.arch.p pVar11 = pVar3;
        com.bytedance.jedi.arch.p pVar12 = pVar7;
        d<q> dVar31 = dVar11;
        d<q> dVar32 = dVar10;
        k kVar11 = kVar;
        com.bytedance.jedi.arch.p pVar13 = pVar5;
        com.bytedance.jedi.arch.m mVar2 = mVar;
        k kVar12 = kVar2;
        d dVar33 = dVar12;
        com.bytedance.jedi.arch.p pVar14 = pVar6;
        d dVar34 = dVar13;
        if ((i2 & 1) != 0) {
            aVar2 = editTextStickerViewState.getUi();
        }
        if ((i2 & 2) != 0) {
            z2 = editTextStickerViewState.inTimeEditView;
        }
        if ((i2 & 4) != 0) {
            dVar21 = editTextStickerViewState.sticker2Top;
        }
        if ((i2 & 8) != 0) {
            pVar8 = editTextStickerViewState.dismissHitText;
        }
        if ((i2 & 16) != 0) {
            nVar2 = editTextStickerViewState.addSticker;
        }
        if ((i2 & 32) != 0) {
            dVar22 = editTextStickerViewState.guideListener;
        }
        if ((i2 & 64) != 0) {
            pVar9 = editTextStickerViewState.reloadStickerEvent;
        }
        if ((i2 & 128) != 0) {
            dVar23 = editTextStickerViewState.textStickerListener;
        }
        if ((i2 & 256) != 0) {
            dVar24 = editTextStickerViewState.changeToTopListener;
        }
        if ((i2 & 512) != 0) {
            dVar25 = editTextStickerViewState.textStickerEditListener;
        }
        if ((i2 & 1024) != 0) {
            dVar26 = editTextStickerViewState.timeClickListener;
        }
        if ((i2 & 2048) != 0) {
            dVar20 = editTextStickerViewState.readTextClickListener;
        }
        if ((i2 & 4096) != 0) {
            dVar19 = editTextStickerViewState.textStickerMob;
        }
        if ((i2 & 8192) != 0) {
            dVar18 = editTextStickerViewState.targetCanvasSize;
        }
        if ((i2 & 16384) != 0) {
            dVar32 = editTextStickerViewState.showInputView;
        }
        if ((32768 & i2) != 0) {
            dVar31 = editTextStickerViewState.editTextSticker;
        }
        if ((65536 & i2) != 0) {
            pVar11 = editTextStickerViewState.removeAllStickerEvent;
        }
        if ((131072 & i2) != 0) {
            pVar10 = editTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((262144 & i2) != 0) {
            kVar11 = editTextStickerViewState.guideViewVisibility;
        }
        if ((524288 & i2) != 0) {
            pVar13 = editTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        if ((1048576 & i2) != 0) {
            kVar12 = editTextStickerViewState.forceHideReadItemEvent;
        }
        if ((2097152 & i2) != 0) {
            dVar33 = editTextStickerViewState.goReadTextStickerScene;
        }
        if ((4194304 & i2) != 0) {
            pVar14 = editTextStickerViewState.cancelNewStickerRead;
        }
        if ((8388608 & i2) != 0) {
            dVar34 = editTextStickerViewState.fakeTextDataAndRead;
        }
        if ((16777216 & i2) != 0) {
            kVar10 = editTextStickerViewState.getNowStringGoToReadWithFake;
        }
        if ((33554432 & i2) != 0) {
            kVar9 = editTextStickerViewState.changeTextEditPageReadIcon;
        }
        if ((67108864 & i2) != 0) {
            dVar29 = editTextStickerViewState.afterChangeTextAutoRead;
        }
        if ((134217728 & i2) != 0) {
            kVar8 = editTextStickerViewState.muteReadText;
        }
        if ((268435456 & i2) != 0) {
            kVar7 = editTextStickerViewState.enableDirectEditEvent;
        }
        if ((536870912 & i2) != 0) {
            dVar28 = editTextStickerViewState.addTextChangeListenerEvent;
        }
        if ((1073741824 & i2) != 0) {
            dVar27 = editTextStickerViewState.addTextStickerViaString;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            dVar30 = editTextStickerViewState.removeTextSticker;
        }
        if ((i3 & 1) != 0) {
            mVar2 = editTextStickerViewState.updateStickerTime;
        }
        if ((i3 & 2) != 0) {
            pVar12 = editTextStickerViewState.removeAllTTS;
        }
        return editTextStickerViewState.copy(aVar2, z2, dVar21, pVar8, nVar2, dVar22, pVar9, dVar23, dVar24, dVar25, dVar26, dVar20, dVar19, dVar18, dVar32, dVar31, pVar11, pVar10, kVar11, pVar13, kVar12, dVar33, pVar14, dVar34, kVar10, kVar9, dVar29, kVar8, kVar7, dVar28, dVar27, dVar30, mVar2, pVar12);
    }

    public final a component1() {
        return getUi();
    }

    public final d<com.ss.android.ugc.aweme.editSticker.text.c.d> component10() {
        return this.textStickerEditListener;
    }

    public final d<b<q, z>> component11() {
        return this.timeClickListener;
    }

    public final d<b<q, z>> component12() {
        return this.readTextClickListener;
    }

    public final d<com.ss.android.ugc.aweme.editSticker.d.e> component13() {
        return this.textStickerMob;
    }

    public final d<p<Integer, Integer>> component14() {
        return this.targetCanvasSize;
    }

    public final d<q> component15() {
        return this.showInputView;
    }

    public final d<q> component16() {
        return this.editTextSticker;
    }

    public final com.bytedance.jedi.arch.p component17() {
        return this.removeAllStickerEvent;
    }

    public final com.bytedance.jedi.arch.p component18() {
        return this.updateLayoutSizeEvent;
    }

    public final k component19() {
        return this.guideViewVisibility;
    }

    public final boolean component2() {
        return this.inTimeEditView;
    }

    public final com.bytedance.jedi.arch.p component20() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final k component21() {
        return this.forceHideReadItemEvent;
    }

    public final d<q> component22() {
        return this.goReadTextStickerScene;
    }

    public final com.bytedance.jedi.arch.p component23() {
        return this.cancelNewStickerRead;
    }

    public final d<String> component24() {
        return this.fakeTextDataAndRead;
    }

    public final k component25() {
        return this.getNowStringGoToReadWithFake;
    }

    public final k component26() {
        return this.changeTextEditPageReadIcon;
    }

    public final d<p<TextStickerData, String>> component27() {
        return this.afterChangeTextAutoRead;
    }

    public final k component28() {
        return this.muteReadText;
    }

    public final k component29() {
        return this.enableDirectEditEvent;
    }

    public final d<q> component3() {
        return this.sticker2Top;
    }

    public final d<TextWatcher> component30() {
        return this.addTextChangeListenerEvent;
    }

    public final d<String> component31() {
        return this.addTextStickerViaString;
    }

    public final d<q> component32() {
        return this.removeTextSticker;
    }

    public final com.bytedance.jedi.arch.m component33() {
        return this.updateStickerTime;
    }

    public final com.bytedance.jedi.arch.p component34() {
        return this.removeAllTTS;
    }

    public final com.bytedance.jedi.arch.p component4() {
        return this.dismissHitText;
    }

    public final n<TextStickerData, Boolean> component5() {
        return this.addSticker;
    }

    public final d<View.OnClickListener> component6() {
        return this.guideListener;
    }

    public final com.bytedance.jedi.arch.p component7() {
        return this.reloadStickerEvent;
    }

    public final d<e> component8() {
        return this.textStickerListener;
    }

    public final d<m<q, q, z>> component9() {
        return this.changeToTopListener;
    }

    public final EditTextStickerViewState copy(a aVar, boolean z, d<? extends q> dVar, com.bytedance.jedi.arch.p pVar, n<TextStickerData, Boolean> nVar, d<? extends View.OnClickListener> dVar2, com.bytedance.jedi.arch.p pVar2, d<? extends e> dVar3, d<? extends m<? super q, ? super q, z>> dVar4, d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar5, d<? extends b<? super q, z>> dVar6, d<? extends b<? super q, z>> dVar7, d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar8, d<p<Integer, Integer>> dVar9, d<? extends q> dVar10, d<? extends q> dVar11, com.bytedance.jedi.arch.p pVar3, com.bytedance.jedi.arch.p pVar4, k kVar, com.bytedance.jedi.arch.p pVar5, k kVar2, d<? extends q> dVar12, com.bytedance.jedi.arch.p pVar6, d<String> dVar13, k kVar3, k kVar4, d<p<TextStickerData, String>> dVar14, k kVar5, k kVar6, d<? extends TextWatcher> dVar15, d<String> dVar16, d<? extends q> dVar17, com.bytedance.jedi.arch.m mVar, com.bytedance.jedi.arch.p pVar7) {
        l.d(aVar, "");
        l.d(kVar5, "");
        return new EditTextStickerViewState(aVar, z, dVar, pVar, nVar, dVar2, pVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, pVar3, pVar4, kVar, pVar5, kVar2, dVar12, pVar6, dVar13, kVar3, kVar4, dVar14, kVar5, kVar6, dVar15, dVar16, dVar17, mVar, pVar7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextStickerViewState)) {
            return false;
        }
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return l.a(getUi(), editTextStickerViewState.getUi()) && this.inTimeEditView == editTextStickerViewState.inTimeEditView && l.a(this.sticker2Top, editTextStickerViewState.sticker2Top) && l.a(this.dismissHitText, editTextStickerViewState.dismissHitText) && l.a(this.addSticker, editTextStickerViewState.addSticker) && l.a(this.guideListener, editTextStickerViewState.guideListener) && l.a(this.reloadStickerEvent, editTextStickerViewState.reloadStickerEvent) && l.a(this.textStickerListener, editTextStickerViewState.textStickerListener) && l.a(this.changeToTopListener, editTextStickerViewState.changeToTopListener) && l.a(this.textStickerEditListener, editTextStickerViewState.textStickerEditListener) && l.a(this.timeClickListener, editTextStickerViewState.timeClickListener) && l.a(this.readTextClickListener, editTextStickerViewState.readTextClickListener) && l.a(this.textStickerMob, editTextStickerViewState.textStickerMob) && l.a(this.targetCanvasSize, editTextStickerViewState.targetCanvasSize) && l.a(this.showInputView, editTextStickerViewState.showInputView) && l.a(this.editTextSticker, editTextStickerViewState.editTextSticker) && l.a(this.removeAllStickerEvent, editTextStickerViewState.removeAllStickerEvent) && l.a(this.updateLayoutSizeEvent, editTextStickerViewState.updateLayoutSizeEvent) && l.a(this.guideViewVisibility, editTextStickerViewState.guideViewVisibility) && l.a(this.resetGuideViewVisibilityEvent, editTextStickerViewState.resetGuideViewVisibilityEvent) && l.a(this.forceHideReadItemEvent, editTextStickerViewState.forceHideReadItemEvent) && l.a(this.goReadTextStickerScene, editTextStickerViewState.goReadTextStickerScene) && l.a(this.cancelNewStickerRead, editTextStickerViewState.cancelNewStickerRead) && l.a(this.fakeTextDataAndRead, editTextStickerViewState.fakeTextDataAndRead) && l.a(this.getNowStringGoToReadWithFake, editTextStickerViewState.getNowStringGoToReadWithFake) && l.a(this.changeTextEditPageReadIcon, editTextStickerViewState.changeTextEditPageReadIcon) && l.a(this.afterChangeTextAutoRead, editTextStickerViewState.afterChangeTextAutoRead) && l.a(this.muteReadText, editTextStickerViewState.muteReadText) && l.a(this.enableDirectEditEvent, editTextStickerViewState.enableDirectEditEvent) && l.a(this.addTextChangeListenerEvent, editTextStickerViewState.addTextChangeListenerEvent) && l.a(this.addTextStickerViaString, editTextStickerViewState.addTextStickerViaString) && l.a(this.removeTextSticker, editTextStickerViewState.removeTextSticker) && l.a(this.updateStickerTime, editTextStickerViewState.updateStickerTime) && l.a(this.removeAllTTS, editTextStickerViewState.removeAllTTS);
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
        com.bytedance.jedi.arch.p pVar = this.dismissHitText;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<TextStickerData, Boolean> nVar = this.addSticker;
        int hashCode4 = (hashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        d<View.OnClickListener> dVar2 = this.guideListener;
        int hashCode5 = (hashCode4 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar2 = this.reloadStickerEvent;
        int hashCode6 = (hashCode5 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        d<e> dVar3 = this.textStickerListener;
        int hashCode7 = (hashCode6 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        d<m<q, q, z>> dVar4 = this.changeToTopListener;
        int hashCode8 = (hashCode7 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        d<com.ss.android.ugc.aweme.editSticker.text.c.d> dVar5 = this.textStickerEditListener;
        int hashCode9 = (hashCode8 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        d<b<q, z>> dVar6 = this.timeClickListener;
        int hashCode10 = (hashCode9 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        d<b<q, z>> dVar7 = this.readTextClickListener;
        int hashCode11 = (hashCode10 + (dVar7 != null ? dVar7.hashCode() : 0)) * 31;
        d<com.ss.android.ugc.aweme.editSticker.d.e> dVar8 = this.textStickerMob;
        int hashCode12 = (hashCode11 + (dVar8 != null ? dVar8.hashCode() : 0)) * 31;
        d<p<Integer, Integer>> dVar9 = this.targetCanvasSize;
        int hashCode13 = (hashCode12 + (dVar9 != null ? dVar9.hashCode() : 0)) * 31;
        d<q> dVar10 = this.showInputView;
        int hashCode14 = (hashCode13 + (dVar10 != null ? dVar10.hashCode() : 0)) * 31;
        d<q> dVar11 = this.editTextSticker;
        int hashCode15 = (hashCode14 + (dVar11 != null ? dVar11.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar3 = this.removeAllStickerEvent;
        int hashCode16 = (hashCode15 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar4 = this.updateLayoutSizeEvent;
        int hashCode17 = (hashCode16 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        k kVar = this.guideViewVisibility;
        int hashCode18 = (hashCode17 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar5 = this.resetGuideViewVisibilityEvent;
        int hashCode19 = (hashCode18 + (pVar5 != null ? pVar5.hashCode() : 0)) * 31;
        k kVar2 = this.forceHideReadItemEvent;
        int hashCode20 = (hashCode19 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        d<q> dVar12 = this.goReadTextStickerScene;
        int hashCode21 = (hashCode20 + (dVar12 != null ? dVar12.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar6 = this.cancelNewStickerRead;
        int hashCode22 = (hashCode21 + (pVar6 != null ? pVar6.hashCode() : 0)) * 31;
        d<String> dVar13 = this.fakeTextDataAndRead;
        int hashCode23 = (hashCode22 + (dVar13 != null ? dVar13.hashCode() : 0)) * 31;
        k kVar3 = this.getNowStringGoToReadWithFake;
        int hashCode24 = (hashCode23 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k kVar4 = this.changeTextEditPageReadIcon;
        int hashCode25 = (hashCode24 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        d<p<TextStickerData, String>> dVar14 = this.afterChangeTextAutoRead;
        int hashCode26 = (hashCode25 + (dVar14 != null ? dVar14.hashCode() : 0)) * 31;
        k kVar5 = this.muteReadText;
        int hashCode27 = (hashCode26 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        k kVar6 = this.enableDirectEditEvent;
        int hashCode28 = (hashCode27 + (kVar6 != null ? kVar6.hashCode() : 0)) * 31;
        d<TextWatcher> dVar15 = this.addTextChangeListenerEvent;
        int hashCode29 = (hashCode28 + (dVar15 != null ? dVar15.hashCode() : 0)) * 31;
        d<String> dVar16 = this.addTextStickerViaString;
        int hashCode30 = (hashCode29 + (dVar16 != null ? dVar16.hashCode() : 0)) * 31;
        d<q> dVar17 = this.removeTextSticker;
        int hashCode31 = (hashCode30 + (dVar17 != null ? dVar17.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.m mVar = this.updateStickerTime;
        int hashCode32 = (hashCode31 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        com.bytedance.jedi.arch.p pVar7 = this.removeAllTTS;
        if (pVar7 != null) {
            i2 = pVar7.hashCode();
        }
        return hashCode32 + i2;
    }

    public final String toString() {
        return "EditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", guideListener=" + this.guideListener + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", readTextClickListener=" + this.readTextClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", editTextSticker=" + this.editTextSticker + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", guideViewVisibility=" + this.guideViewVisibility + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", forceHideReadItemEvent=" + this.forceHideReadItemEvent + ", goReadTextStickerScene=" + this.goReadTextStickerScene + ", cancelNewStickerRead=" + this.cancelNewStickerRead + ", fakeTextDataAndRead=" + this.fakeTextDataAndRead + ", getNowStringGoToReadWithFake=" + this.getNowStringGoToReadWithFake + ", changeTextEditPageReadIcon=" + this.changeTextEditPageReadIcon + ", afterChangeTextAutoRead=" + this.afterChangeTextAutoRead + ", muteReadText=" + this.muteReadText + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", addTextChangeListenerEvent=" + this.addTextChangeListenerEvent + ", addTextStickerViaString=" + this.addTextStickerViaString + ", removeTextSticker=" + this.removeTextSticker + ", updateStickerTime=" + this.updateStickerTime + ", removeAllTTS=" + this.removeAllTTS + ")";
    }

    public final n<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final d<TextWatcher> getAddTextChangeListenerEvent() {
        return this.addTextChangeListenerEvent;
    }

    public final d<String> getAddTextStickerViaString() {
        return this.addTextStickerViaString;
    }

    public final d<p<TextStickerData, String>> getAfterChangeTextAutoRead() {
        return this.afterChangeTextAutoRead;
    }

    public final com.bytedance.jedi.arch.p getCancelNewStickerRead() {
        return this.cancelNewStickerRead;
    }

    public final k getChangeTextEditPageReadIcon() {
        return this.changeTextEditPageReadIcon;
    }

    public final d<m<q, q, z>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final com.bytedance.jedi.arch.p getDismissHitText() {
        return this.dismissHitText;
    }

    public final d<q> getEditTextSticker() {
        return this.editTextSticker;
    }

    public final k getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final d<String> getFakeTextDataAndRead() {
        return this.fakeTextDataAndRead;
    }

    public final k getForceHideReadItemEvent() {
        return this.forceHideReadItemEvent;
    }

    public final k getGetNowStringGoToReadWithFake() {
        return this.getNowStringGoToReadWithFake;
    }

    public final d<q> getGoReadTextStickerScene() {
        return this.goReadTextStickerScene;
    }

    public final d<View.OnClickListener> getGuideListener() {
        return this.guideListener;
    }

    public final k getGuideViewVisibility() {
        return this.guideViewVisibility;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final k getMuteReadText() {
        return this.muteReadText;
    }

    public final d<b<q, z>> getReadTextClickListener() {
        return this.readTextClickListener;
    }

    public final com.bytedance.jedi.arch.p getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final com.bytedance.jedi.arch.p getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final com.bytedance.jedi.arch.p getRemoveAllTTS() {
        return this.removeAllTTS;
    }

    public final d<q> getRemoveTextSticker() {
        return this.removeTextSticker;
    }

    public final com.bytedance.jedi.arch.p getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final d<q> getShowInputView() {
        return this.showInputView;
    }

    public final d<q> getSticker2Top() {
        return this.sticker2Top;
    }

    public final d<p<Integer, Integer>> getTargetCanvasSize() {
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

    public final com.bytedance.jedi.arch.p getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final com.bytedance.jedi.arch.m getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.jedi.arch.d<? extends android.view.View$OnClickListener> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z>> */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX DEBUG: Multi-variable search result rejected for r33v0, resolved type: com.bytedance.jedi.arch.d<? extends android.text.TextWatcher> */
    /* JADX DEBUG: Multi-variable search result rejected for r35v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextStickerViewState(a aVar, boolean z, d<? extends q> dVar, com.bytedance.jedi.arch.p pVar, n<TextStickerData, Boolean> nVar, d<? extends View.OnClickListener> dVar2, com.bytedance.jedi.arch.p pVar2, d<? extends e> dVar3, d<? extends m<? super q, ? super q, z>> dVar4, d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar5, d<? extends b<? super q, z>> dVar6, d<? extends b<? super q, z>> dVar7, d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar8, d<p<Integer, Integer>> dVar9, d<? extends q> dVar10, d<? extends q> dVar11, com.bytedance.jedi.arch.p pVar3, com.bytedance.jedi.arch.p pVar4, k kVar, com.bytedance.jedi.arch.p pVar5, k kVar2, d<? extends q> dVar12, com.bytedance.jedi.arch.p pVar6, d<String> dVar13, k kVar3, k kVar4, d<p<TextStickerData, String>> dVar14, k kVar5, k kVar6, d<? extends TextWatcher> dVar15, d<String> dVar16, d<? extends q> dVar17, com.bytedance.jedi.arch.m mVar, com.bytedance.jedi.arch.p pVar7) {
        super(aVar);
        l.d(aVar, "");
        l.d(kVar5, "");
        this.ui = aVar;
        this.inTimeEditView = z;
        this.sticker2Top = dVar;
        this.dismissHitText = pVar;
        this.addSticker = nVar;
        this.guideListener = dVar2;
        this.reloadStickerEvent = pVar2;
        this.textStickerListener = dVar3;
        this.changeToTopListener = dVar4;
        this.textStickerEditListener = dVar5;
        this.timeClickListener = dVar6;
        this.readTextClickListener = dVar7;
        this.textStickerMob = dVar8;
        this.targetCanvasSize = dVar9;
        this.showInputView = dVar10;
        this.editTextSticker = dVar11;
        this.removeAllStickerEvent = pVar3;
        this.updateLayoutSizeEvent = pVar4;
        this.guideViewVisibility = kVar;
        this.resetGuideViewVisibilityEvent = pVar5;
        this.forceHideReadItemEvent = kVar2;
        this.goReadTextStickerScene = dVar12;
        this.cancelNewStickerRead = pVar6;
        this.fakeTextDataAndRead = dVar13;
        this.getNowStringGoToReadWithFake = kVar3;
        this.changeTextEditPageReadIcon = kVar4;
        this.afterChangeTextAutoRead = dVar14;
        this.muteReadText = kVar5;
        this.enableDirectEditEvent = kVar6;
        this.addTextChangeListenerEvent = dVar15;
        this.addTextStickerViaString = dVar16;
        this.removeTextSticker = dVar17;
        this.updateStickerTime = mVar;
        this.removeAllTTS = pVar7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditTextStickerViewState(a aVar, boolean z, d dVar, com.bytedance.jedi.arch.p pVar, n nVar, d dVar2, com.bytedance.jedi.arch.p pVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, com.bytedance.jedi.arch.p pVar3, com.bytedance.jedi.arch.p pVar4, k kVar, com.bytedance.jedi.arch.p pVar5, k kVar2, d dVar12, com.bytedance.jedi.arch.p pVar6, d dVar13, k kVar3, k kVar4, d dVar14, k kVar5, k kVar6, d dVar15, d dVar16, d dVar17, com.bytedance.jedi.arch.m mVar, com.bytedance.jedi.arch.p pVar7, int i2, int i3, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? null : pVar, (i2 & 16) != 0 ? null : nVar, (i2 & 32) != 0 ? null : dVar2, (i2 & 64) != 0 ? null : pVar2, (i2 & 128) != 0 ? null : dVar3, (i2 & 256) != 0 ? null : dVar4, (i2 & 512) != 0 ? null : dVar5, (i2 & 1024) != 0 ? null : dVar6, (i2 & 2048) != 0 ? null : dVar7, (i2 & 4096) != 0 ? null : dVar8, (i2 & 8192) != 0 ? null : dVar9, (i2 & 16384) != 0 ? null : dVar10, (32768 & i2) != 0 ? null : dVar11, (65536 & i2) != 0 ? null : pVar3, (131072 & i2) != 0 ? null : pVar4, (262144 & i2) != 0 ? null : kVar, (524288 & i2) != 0 ? null : pVar5, (1048576 & i2) != 0 ? null : kVar2, (2097152 & i2) != 0 ? null : dVar12, (4194304 & i2) != 0 ? null : pVar6, (8388608 & i2) != 0 ? null : dVar13, (16777216 & i2) != 0 ? null : kVar3, (33554432 & i2) != 0 ? null : kVar4, (67108864 & i2) != 0 ? null : dVar14, (134217728 & i2) != 0 ? new k(false) : kVar5, (268435456 & i2) != 0 ? null : kVar6, (536870912 & i2) != 0 ? null : dVar15, (1073741824 & i2) != 0 ? null : dVar16, (i2 & Integer.MIN_VALUE) != 0 ? null : dVar17, (i3 & 1) != 0 ? null : mVar, (i3 & 2) != 0 ? null : pVar7);
    }
}
