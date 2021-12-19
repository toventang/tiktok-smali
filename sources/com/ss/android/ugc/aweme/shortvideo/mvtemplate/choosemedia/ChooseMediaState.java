package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import h.f.b.g;
import h.f.b.l;

public final class ChooseMediaState implements af {
    private final boolean albumViewFullShow;
    private final ad allMediaList;
    private final ClosingChooseMediaPageState closingChooseMediaPageState;
    private final boolean isChangeMusicDownloadSuccess;
    private final PreMusicState lastPreMusicState;
    private final MediaListState mediaListState;
    private final OpeningChooseMediaPageState openingChooseMediaPageState;
    private final ad photoMediaList;
    private final PreMusicState preChangeMusicState;
    private final PreMusicState preMusicState;
    private final MediaState previewDockerAddMediaState;
    private final MediaState previewDockerDelMediaState;
    private final MediaListState previewDockerInitMediaList;
    private final MediaState previewMediaState;
    private final p previewNextBtnClickState;
    private final MediaState previewNextBtnMediaState;
    private final String previewNextBtnState;
    private final PreviewSwapState previewSwapState;
    private final MediaState selectMediaState;
    private final MediaState unSelectMediaState;
    private final ad videoMediaList;

    static {
        Covode.recordClassIndex(84510);
    }

    public ChooseMediaState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097151, null);
    }

    public static /* synthetic */ ChooseMediaState copy$default(ChooseMediaState chooseMediaState, MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, ad adVar, ad adVar2, ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, p pVar, String str, boolean z2, int i2, Object obj) {
        PreMusicState preMusicState5 = preMusicState3;
        PreMusicState preMusicState6 = preMusicState2;
        MediaListState mediaListState4 = mediaListState2;
        MediaState mediaState7 = mediaState;
        MediaState mediaState8 = mediaState2;
        MediaState mediaState9 = mediaState3;
        MediaListState mediaListState5 = mediaListState3;
        boolean z3 = z;
        ad adVar4 = adVar3;
        ad adVar5 = adVar2;
        PreMusicState preMusicState7 = preMusicState4;
        OpeningChooseMediaPageState openingChooseMediaPageState3 = openingChooseMediaPageState2;
        ClosingChooseMediaPageState closingChooseMediaPageState3 = closingChooseMediaPageState2;
        ad adVar6 = adVar;
        String str2 = str;
        p pVar2 = pVar;
        PreviewSwapState previewSwapState3 = previewSwapState2;
        MediaState mediaState10 = mediaState4;
        MediaState mediaState11 = mediaState5;
        boolean z4 = z2;
        MediaState mediaState12 = mediaState6;
        if ((i2 & 1) != 0) {
            mediaListState4 = chooseMediaState.mediaListState;
        }
        if ((i2 & 2) != 0) {
            mediaState7 = chooseMediaState.selectMediaState;
        }
        if ((i2 & 4) != 0) {
            mediaState8 = chooseMediaState.unSelectMediaState;
        }
        if ((i2 & 8) != 0) {
            mediaState9 = chooseMediaState.previewMediaState;
        }
        if ((i2 & 16) != 0) {
            preMusicState6 = chooseMediaState.preMusicState;
        }
        if ((i2 & 32) != 0) {
            preMusicState5 = chooseMediaState.preChangeMusicState;
        }
        if ((i2 & 64) != 0) {
            preMusicState7 = chooseMediaState.lastPreMusicState;
        }
        if ((i2 & 128) != 0) {
            openingChooseMediaPageState3 = chooseMediaState.openingChooseMediaPageState;
        }
        if ((i2 & 256) != 0) {
            closingChooseMediaPageState3 = chooseMediaState.closingChooseMediaPageState;
        }
        if ((i2 & 512) != 0) {
            adVar6 = chooseMediaState.allMediaList;
        }
        if ((i2 & 1024) != 0) {
            adVar5 = chooseMediaState.photoMediaList;
        }
        if ((i2 & 2048) != 0) {
            adVar4 = chooseMediaState.videoMediaList;
        }
        if ((i2 & 4096) != 0) {
            z3 = chooseMediaState.isChangeMusicDownloadSuccess;
        }
        if ((i2 & 8192) != 0) {
            mediaListState5 = chooseMediaState.previewDockerInitMediaList;
        }
        if ((i2 & 16384) != 0) {
            previewSwapState3 = chooseMediaState.previewSwapState;
        }
        if ((32768 & i2) != 0) {
            mediaState10 = chooseMediaState.previewDockerDelMediaState;
        }
        if ((65536 & i2) != 0) {
            mediaState11 = chooseMediaState.previewDockerAddMediaState;
        }
        if ((131072 & i2) != 0) {
            mediaState12 = chooseMediaState.previewNextBtnMediaState;
        }
        if ((262144 & i2) != 0) {
            pVar2 = chooseMediaState.previewNextBtnClickState;
        }
        if ((524288 & i2) != 0) {
            str2 = chooseMediaState.previewNextBtnState;
        }
        if ((i2 & 1048576) != 0) {
            z4 = chooseMediaState.albumViewFullShow;
        }
        return chooseMediaState.copy(mediaListState4, mediaState7, mediaState8, mediaState9, preMusicState6, preMusicState5, preMusicState7, openingChooseMediaPageState3, closingChooseMediaPageState3, adVar6, adVar5, adVar4, z3, mediaListState5, previewSwapState3, mediaState10, mediaState11, mediaState12, pVar2, str2, z4);
    }

    public final MediaListState component1() {
        return this.mediaListState;
    }

    public final ad component10() {
        return this.allMediaList;
    }

    public final ad component11() {
        return this.photoMediaList;
    }

    public final ad component12() {
        return this.videoMediaList;
    }

    public final boolean component13() {
        return this.isChangeMusicDownloadSuccess;
    }

    public final MediaListState component14() {
        return this.previewDockerInitMediaList;
    }

    public final PreviewSwapState component15() {
        return this.previewSwapState;
    }

    public final MediaState component16() {
        return this.previewDockerDelMediaState;
    }

    public final MediaState component17() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState component18() {
        return this.previewNextBtnMediaState;
    }

    public final p component19() {
        return this.previewNextBtnClickState;
    }

    public final MediaState component2() {
        return this.selectMediaState;
    }

    public final String component20() {
        return this.previewNextBtnState;
    }

    public final boolean component21() {
        return this.albumViewFullShow;
    }

    public final MediaState component3() {
        return this.unSelectMediaState;
    }

    public final MediaState component4() {
        return this.previewMediaState;
    }

    public final PreMusicState component5() {
        return this.preMusicState;
    }

    public final PreMusicState component6() {
        return this.preChangeMusicState;
    }

    public final PreMusicState component7() {
        return this.lastPreMusicState;
    }

    public final OpeningChooseMediaPageState component8() {
        return this.openingChooseMediaPageState;
    }

    public final ClosingChooseMediaPageState component9() {
        return this.closingChooseMediaPageState;
    }

    public final ChooseMediaState copy(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, ad adVar, ad adVar2, ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, p pVar, String str, boolean z2) {
        l.d(mediaListState2, "");
        l.d(mediaState, "");
        l.d(mediaState2, "");
        l.d(mediaState3, "");
        l.d(preMusicState2, "");
        l.d(preMusicState3, "");
        l.d(preMusicState4, "");
        l.d(openingChooseMediaPageState2, "");
        l.d(adVar, "");
        l.d(adVar2, "");
        l.d(adVar3, "");
        l.d(mediaListState3, "");
        l.d(previewSwapState2, "");
        l.d(mediaState4, "");
        l.d(mediaState5, "");
        l.d(mediaState6, "");
        return new ChooseMediaState(mediaListState2, mediaState, mediaState2, mediaState3, preMusicState2, preMusicState3, preMusicState4, openingChooseMediaPageState2, closingChooseMediaPageState2, adVar, adVar2, adVar3, z, mediaListState3, previewSwapState2, mediaState4, mediaState5, mediaState6, pVar, str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseMediaState)) {
            return false;
        }
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return l.a(this.mediaListState, chooseMediaState.mediaListState) && l.a(this.selectMediaState, chooseMediaState.selectMediaState) && l.a(this.unSelectMediaState, chooseMediaState.unSelectMediaState) && l.a(this.previewMediaState, chooseMediaState.previewMediaState) && l.a(this.preMusicState, chooseMediaState.preMusicState) && l.a(this.preChangeMusicState, chooseMediaState.preChangeMusicState) && l.a(this.lastPreMusicState, chooseMediaState.lastPreMusicState) && l.a(this.openingChooseMediaPageState, chooseMediaState.openingChooseMediaPageState) && l.a(this.closingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState) && l.a(this.allMediaList, chooseMediaState.allMediaList) && l.a(this.photoMediaList, chooseMediaState.photoMediaList) && l.a(this.videoMediaList, chooseMediaState.videoMediaList) && this.isChangeMusicDownloadSuccess == chooseMediaState.isChangeMusicDownloadSuccess && l.a(this.previewDockerInitMediaList, chooseMediaState.previewDockerInitMediaList) && l.a(this.previewSwapState, chooseMediaState.previewSwapState) && l.a(this.previewDockerDelMediaState, chooseMediaState.previewDockerDelMediaState) && l.a(this.previewDockerAddMediaState, chooseMediaState.previewDockerAddMediaState) && l.a(this.previewNextBtnMediaState, chooseMediaState.previewNextBtnMediaState) && l.a(this.previewNextBtnClickState, chooseMediaState.previewNextBtnClickState) && l.a(this.previewNextBtnState, chooseMediaState.previewNextBtnState) && this.albumViewFullShow == chooseMediaState.albumViewFullShow;
    }

    public final int hashCode() {
        MediaListState mediaListState2 = this.mediaListState;
        int i2 = 0;
        int hashCode = (mediaListState2 != null ? mediaListState2.hashCode() : 0) * 31;
        MediaState mediaState = this.selectMediaState;
        int hashCode2 = (hashCode + (mediaState != null ? mediaState.hashCode() : 0)) * 31;
        MediaState mediaState2 = this.unSelectMediaState;
        int hashCode3 = (hashCode2 + (mediaState2 != null ? mediaState2.hashCode() : 0)) * 31;
        MediaState mediaState3 = this.previewMediaState;
        int hashCode4 = (hashCode3 + (mediaState3 != null ? mediaState3.hashCode() : 0)) * 31;
        PreMusicState preMusicState2 = this.preMusicState;
        int hashCode5 = (hashCode4 + (preMusicState2 != null ? preMusicState2.hashCode() : 0)) * 31;
        PreMusicState preMusicState3 = this.preChangeMusicState;
        int hashCode6 = (hashCode5 + (preMusicState3 != null ? preMusicState3.hashCode() : 0)) * 31;
        PreMusicState preMusicState4 = this.lastPreMusicState;
        int hashCode7 = (hashCode6 + (preMusicState4 != null ? preMusicState4.hashCode() : 0)) * 31;
        OpeningChooseMediaPageState openingChooseMediaPageState2 = this.openingChooseMediaPageState;
        int hashCode8 = (hashCode7 + (openingChooseMediaPageState2 != null ? openingChooseMediaPageState2.hashCode() : 0)) * 31;
        ClosingChooseMediaPageState closingChooseMediaPageState2 = this.closingChooseMediaPageState;
        int hashCode9 = (hashCode8 + (closingChooseMediaPageState2 != null ? closingChooseMediaPageState2.hashCode() : 0)) * 31;
        ad adVar = this.allMediaList;
        int hashCode10 = (hashCode9 + (adVar != null ? adVar.hashCode() : 0)) * 31;
        ad adVar2 = this.photoMediaList;
        int hashCode11 = (hashCode10 + (adVar2 != null ? adVar2.hashCode() : 0)) * 31;
        ad adVar3 = this.videoMediaList;
        int hashCode12 = (hashCode11 + (adVar3 != null ? adVar3.hashCode() : 0)) * 31;
        boolean z = this.isChangeMusicDownloadSuccess;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode12 + i4) * 31;
        MediaListState mediaListState3 = this.previewDockerInitMediaList;
        int hashCode13 = (i7 + (mediaListState3 != null ? mediaListState3.hashCode() : 0)) * 31;
        PreviewSwapState previewSwapState2 = this.previewSwapState;
        int hashCode14 = (hashCode13 + (previewSwapState2 != null ? previewSwapState2.hashCode() : 0)) * 31;
        MediaState mediaState4 = this.previewDockerDelMediaState;
        int hashCode15 = (hashCode14 + (mediaState4 != null ? mediaState4.hashCode() : 0)) * 31;
        MediaState mediaState5 = this.previewDockerAddMediaState;
        int hashCode16 = (hashCode15 + (mediaState5 != null ? mediaState5.hashCode() : 0)) * 31;
        MediaState mediaState6 = this.previewNextBtnMediaState;
        int hashCode17 = (hashCode16 + (mediaState6 != null ? mediaState6.hashCode() : 0)) * 31;
        p pVar = this.previewNextBtnClickState;
        int hashCode18 = (hashCode17 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.previewNextBtnState;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i8 = (hashCode18 + i2) * 31;
        if (!this.albumViewFullShow) {
            i3 = 0;
        }
        return i8 + i3;
    }

    public final String toString() {
        return "ChooseMediaState(mediaListState=" + this.mediaListState + ", selectMediaState=" + this.selectMediaState + ", unSelectMediaState=" + this.unSelectMediaState + ", previewMediaState=" + this.previewMediaState + ", preMusicState=" + this.preMusicState + ", preChangeMusicState=" + this.preChangeMusicState + ", lastPreMusicState=" + this.lastPreMusicState + ", openingChooseMediaPageState=" + this.openingChooseMediaPageState + ", closingChooseMediaPageState=" + this.closingChooseMediaPageState + ", allMediaList=" + this.allMediaList + ", photoMediaList=" + this.photoMediaList + ", videoMediaList=" + this.videoMediaList + ", isChangeMusicDownloadSuccess=" + this.isChangeMusicDownloadSuccess + ", previewDockerInitMediaList=" + this.previewDockerInitMediaList + ", previewSwapState=" + this.previewSwapState + ", previewDockerDelMediaState=" + this.previewDockerDelMediaState + ", previewDockerAddMediaState=" + this.previewDockerAddMediaState + ", previewNextBtnMediaState=" + this.previewNextBtnMediaState + ", previewNextBtnClickState=" + this.previewNextBtnClickState + ", previewNextBtnState=" + this.previewNextBtnState + ", albumViewFullShow=" + this.albumViewFullShow + ")";
    }

    public final boolean getAlbumViewFullShow() {
        return this.albumViewFullShow;
    }

    public final ad getAllMediaList() {
        return this.allMediaList;
    }

    public final ClosingChooseMediaPageState getClosingChooseMediaPageState() {
        return this.closingChooseMediaPageState;
    }

    public final PreMusicState getLastPreMusicState() {
        return this.lastPreMusicState;
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final OpeningChooseMediaPageState getOpeningChooseMediaPageState() {
        return this.openingChooseMediaPageState;
    }

    public final ad getPhotoMediaList() {
        return this.photoMediaList;
    }

    public final PreMusicState getPreChangeMusicState() {
        return this.preChangeMusicState;
    }

    public final PreMusicState getPreMusicState() {
        return this.preMusicState;
    }

    public final MediaState getPreviewDockerAddMediaState() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState getPreviewDockerDelMediaState() {
        return this.previewDockerDelMediaState;
    }

    public final MediaListState getPreviewDockerInitMediaList() {
        return this.previewDockerInitMediaList;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final p getPreviewNextBtnClickState() {
        return this.previewNextBtnClickState;
    }

    public final MediaState getPreviewNextBtnMediaState() {
        return this.previewNextBtnMediaState;
    }

    public final String getPreviewNextBtnState() {
        return this.previewNextBtnState;
    }

    public final PreviewSwapState getPreviewSwapState() {
        return this.previewSwapState;
    }

    public final MediaState getSelectMediaState() {
        return this.selectMediaState;
    }

    public final MediaState getUnSelectMediaState() {
        return this.unSelectMediaState;
    }

    public final ad getVideoMediaList() {
        return this.videoMediaList;
    }

    public final boolean isChangeMusicDownloadSuccess() {
        return this.isChangeMusicDownloadSuccess;
    }

    public ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, ad adVar, ad adVar2, ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, p pVar, String str, boolean z2) {
        l.d(mediaListState2, "");
        l.d(mediaState, "");
        l.d(mediaState2, "");
        l.d(mediaState3, "");
        l.d(preMusicState2, "");
        l.d(preMusicState3, "");
        l.d(preMusicState4, "");
        l.d(openingChooseMediaPageState2, "");
        l.d(adVar, "");
        l.d(adVar2, "");
        l.d(adVar3, "");
        l.d(mediaListState3, "");
        l.d(previewSwapState2, "");
        l.d(mediaState4, "");
        l.d(mediaState5, "");
        l.d(mediaState6, "");
        this.mediaListState = mediaListState2;
        this.selectMediaState = mediaState;
        this.unSelectMediaState = mediaState2;
        this.previewMediaState = mediaState3;
        this.preMusicState = preMusicState2;
        this.preChangeMusicState = preMusicState3;
        this.lastPreMusicState = preMusicState4;
        this.openingChooseMediaPageState = openingChooseMediaPageState2;
        this.closingChooseMediaPageState = closingChooseMediaPageState2;
        this.allMediaList = adVar;
        this.photoMediaList = adVar2;
        this.videoMediaList = adVar3;
        this.isChangeMusicDownloadSuccess = z;
        this.previewDockerInitMediaList = mediaListState3;
        this.previewSwapState = previewSwapState2;
        this.previewDockerDelMediaState = mediaState4;
        this.previewDockerAddMediaState = mediaState5;
        this.previewNextBtnMediaState = mediaState6;
        this.previewNextBtnClickState = pVar;
        this.previewNextBtnState = str;
        this.albumViewFullShow = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, PreMusicState preMusicState2, PreMusicState preMusicState3, PreMusicState preMusicState4, OpeningChooseMediaPageState openingChooseMediaPageState2, ClosingChooseMediaPageState closingChooseMediaPageState2, ad adVar, ad adVar2, ad adVar3, boolean z, MediaListState mediaListState3, PreviewSwapState previewSwapState2, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, p pVar, String str, boolean z2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new MediaListState(null, 0, 1, null) : mediaListState2, (i2 & 2) != 0 ? new MediaState(null, 0, 1, null) : mediaState, (i2 & 4) != 0 ? new MediaState(null, 0, 1, null) : mediaState2, (i2 & 8) != 0 ? new MediaState(null, 0, 1, null) : mediaState3, (i2 & 16) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState2, (i2 & 32) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState3, (i2 & 64) != 0 ? new PreMusicState(null, null, 3, null) : preMusicState4, (i2 & 128) != 0 ? OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE : openingChooseMediaPageState2, (i2 & 256) != 0 ? ClosingChooseMediaPageState.Ready.INSTANCE : closingChooseMediaPageState2, (i2 & 512) != 0 ? f.f129137a : adVar, (i2 & 1024) != 0 ? f.f129137a : adVar2, (i2 & 2048) != 0 ? f.f129137a : adVar3, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? new MediaListState(null, 0, 1, null) : mediaListState3, (i2 & 16384) != 0 ? new PreviewSwapState(null, null, 0, 3, null) : previewSwapState2, (32768 & i2) != 0 ? new MediaState(null, 0, 1, null) : mediaState4, (65536 & i2) != 0 ? new MediaState(null, 0, 1, null) : mediaState5, (131072 & i2) != 0 ? new MediaState(null, 0, 1, null) : mediaState6, (262144 & i2) != 0 ? null : pVar, (524288 & i2) != 0 ? null : str, (i2 & 1048576) != 0 ? false : z2);
    }
}
