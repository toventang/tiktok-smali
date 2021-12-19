package com.ss.android.ugc.aweme.infoSticker.customsticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.a;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.b.g;
import h.f.b.l;

public final class EditPreviewStickerState implements af {
    private final p cancel;
    private final n<Integer, Integer> compressBitmapEvent;
    private final CutoutData cutoutData;
    private final a cutoutError;
    private final p finishCutoutSticker;
    private final MediaModel mediaModel;
    private final p selectImage;
    private final p startCutoutSticker;
    private final p useSticker;

    static {
        Covode.recordClassIndex(67010);
    }

    public EditPreviewStickerState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPreviewStickerState copy$default(EditPreviewStickerState editPreviewStickerState, p pVar, p pVar2, p pVar3, p pVar4, MediaModel mediaModel2, a aVar, p pVar5, CutoutData cutoutData2, n nVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editPreviewStickerState.selectImage;
        }
        if ((i2 & 2) != 0) {
            pVar2 = editPreviewStickerState.useSticker;
        }
        if ((i2 & 4) != 0) {
            pVar3 = editPreviewStickerState.startCutoutSticker;
        }
        if ((i2 & 8) != 0) {
            pVar4 = editPreviewStickerState.finishCutoutSticker;
        }
        if ((i2 & 16) != 0) {
            mediaModel2 = editPreviewStickerState.mediaModel;
        }
        if ((i2 & 32) != 0) {
            aVar = editPreviewStickerState.cutoutError;
        }
        if ((i2 & 64) != 0) {
            pVar5 = editPreviewStickerState.cancel;
        }
        if ((i2 & 128) != 0) {
            cutoutData2 = editPreviewStickerState.cutoutData;
        }
        if ((i2 & 256) != 0) {
            nVar = editPreviewStickerState.compressBitmapEvent;
        }
        return editPreviewStickerState.copy(pVar, pVar2, pVar3, pVar4, mediaModel2, aVar, pVar5, cutoutData2, nVar);
    }

    public final p component1() {
        return this.selectImage;
    }

    public final p component2() {
        return this.useSticker;
    }

    public final p component3() {
        return this.startCutoutSticker;
    }

    public final p component4() {
        return this.finishCutoutSticker;
    }

    public final MediaModel component5() {
        return this.mediaModel;
    }

    public final a component6() {
        return this.cutoutError;
    }

    public final p component7() {
        return this.cancel;
    }

    public final CutoutData component8() {
        return this.cutoutData;
    }

    public final n<Integer, Integer> component9() {
        return this.compressBitmapEvent;
    }

    public final EditPreviewStickerState copy(p pVar, p pVar2, p pVar3, p pVar4, MediaModel mediaModel2, a aVar, p pVar5, CutoutData cutoutData2, n<Integer, Integer> nVar) {
        return new EditPreviewStickerState(pVar, pVar2, pVar3, pVar4, mediaModel2, aVar, pVar5, cutoutData2, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewStickerState)) {
            return false;
        }
        EditPreviewStickerState editPreviewStickerState = (EditPreviewStickerState) obj;
        return l.a(this.selectImage, editPreviewStickerState.selectImage) && l.a(this.useSticker, editPreviewStickerState.useSticker) && l.a(this.startCutoutSticker, editPreviewStickerState.startCutoutSticker) && l.a(this.finishCutoutSticker, editPreviewStickerState.finishCutoutSticker) && l.a(this.mediaModel, editPreviewStickerState.mediaModel) && l.a(this.cutoutError, editPreviewStickerState.cutoutError) && l.a(this.cancel, editPreviewStickerState.cancel) && l.a(this.cutoutData, editPreviewStickerState.cutoutData) && l.a(this.compressBitmapEvent, editPreviewStickerState.compressBitmapEvent);
    }

    public final int hashCode() {
        p pVar = this.selectImage;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.useSticker;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.startCutoutSticker;
        int hashCode3 = (hashCode2 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        p pVar4 = this.finishCutoutSticker;
        int hashCode4 = (hashCode3 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        MediaModel mediaModel2 = this.mediaModel;
        int hashCode5 = (hashCode4 + (mediaModel2 != null ? mediaModel2.hashCode() : 0)) * 31;
        a aVar = this.cutoutError;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        p pVar5 = this.cancel;
        int hashCode7 = (hashCode6 + (pVar5 != null ? pVar5.hashCode() : 0)) * 31;
        CutoutData cutoutData2 = this.cutoutData;
        int hashCode8 = (hashCode7 + (cutoutData2 != null ? cutoutData2.hashCode() : 0)) * 31;
        n<Integer, Integer> nVar = this.compressBitmapEvent;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "EditPreviewStickerState(selectImage=" + this.selectImage + ", useSticker=" + this.useSticker + ", startCutoutSticker=" + this.startCutoutSticker + ", finishCutoutSticker=" + this.finishCutoutSticker + ", mediaModel=" + this.mediaModel + ", cutoutError=" + this.cutoutError + ", cancel=" + this.cancel + ", cutoutData=" + this.cutoutData + ", compressBitmapEvent=" + this.compressBitmapEvent + ")";
    }

    public final p getCancel() {
        return this.cancel;
    }

    public final n<Integer, Integer> getCompressBitmapEvent() {
        return this.compressBitmapEvent;
    }

    public final CutoutData getCutoutData() {
        return this.cutoutData;
    }

    public final a getCutoutError() {
        return this.cutoutError;
    }

    public final p getFinishCutoutSticker() {
        return this.finishCutoutSticker;
    }

    public final MediaModel getMediaModel() {
        return this.mediaModel;
    }

    public final p getSelectImage() {
        return this.selectImage;
    }

    public final p getStartCutoutSticker() {
        return this.startCutoutSticker;
    }

    public final p getUseSticker() {
        return this.useSticker;
    }

    public EditPreviewStickerState(p pVar, p pVar2, p pVar3, p pVar4, MediaModel mediaModel2, a aVar, p pVar5, CutoutData cutoutData2, n<Integer, Integer> nVar) {
        this.selectImage = pVar;
        this.useSticker = pVar2;
        this.startCutoutSticker = pVar3;
        this.finishCutoutSticker = pVar4;
        this.mediaModel = mediaModel2;
        this.cutoutError = aVar;
        this.cancel = pVar5;
        this.cutoutData = cutoutData2;
        this.compressBitmapEvent = nVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewStickerState(p pVar, p pVar2, p pVar3, p pVar4, MediaModel mediaModel2, a aVar, p pVar5, CutoutData cutoutData2, n nVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2, (i2 & 4) != 0 ? null : pVar3, (i2 & 8) != 0 ? null : pVar4, (i2 & 16) != 0 ? null : mediaModel2, (i2 & 32) != 0 ? null : aVar, (i2 & 64) != 0 ? null : pVar5, (i2 & 128) != 0 ? null : cutoutData2, (i2 & 256) == 0 ? nVar : null);
    }
}
