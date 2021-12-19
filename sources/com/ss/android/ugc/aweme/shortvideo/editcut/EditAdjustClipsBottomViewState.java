package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class EditAdjustClipsBottomViewState implements af {
    public static final a Companion = new a((byte) 0);
    private final d<List<VideoSegment>> addVideosEvent;
    private final int currentEditIndex;
    private final int currentEditOriginIndex;
    private final int currentTabIndex;
    private final n<Integer, VideoSegment> deleteVideoEvent;
    private final Integer editState;
    private final Boolean focusEditMode;
    private final Boolean isMusicSyncMode;
    private final p modeChangeEvent;
    private final d<t> restoreEditEvent;
    private final p restoreMusicSyncEvent;
    private final Float scale;
    private final p seekDoneEvent;
    private final Float selectTime;
    private final int stickPointStatus;
    private final n<Integer, VideoSegment> updateVideoEvent;

    static {
        Covode.recordClassIndex(83945);
    }

    public EditAdjustClipsBottomViewState() {
        this(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ EditAdjustClipsBottomViewState copy$default(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState, int i2, int i3, int i4, int i5, Boolean bool, Float f2, Float f3, Integer num, Boolean bool2, n nVar, n nVar2, d dVar, d dVar2, p pVar, p pVar2, p pVar3, int i6, Object obj) {
        int i7 = i3;
        int i8 = i2;
        Boolean bool3 = bool;
        int i9 = i5;
        int i10 = i4;
        Integer num2 = num;
        Float f4 = f3;
        Float f5 = f2;
        n nVar3 = nVar2;
        n nVar4 = nVar;
        Boolean bool4 = bool2;
        p pVar4 = pVar;
        d dVar3 = dVar2;
        d dVar4 = dVar;
        p pVar5 = pVar3;
        p pVar6 = pVar2;
        if ((i6 & 1) != 0) {
            i8 = editAdjustClipsBottomViewState.currentEditIndex;
        }
        if ((i6 & 2) != 0) {
            i7 = editAdjustClipsBottomViewState.currentEditOriginIndex;
        }
        if ((i6 & 4) != 0) {
            i10 = editAdjustClipsBottomViewState.currentTabIndex;
        }
        if ((i6 & 8) != 0) {
            i9 = editAdjustClipsBottomViewState.stickPointStatus;
        }
        if ((i6 & 16) != 0) {
            bool3 = editAdjustClipsBottomViewState.isMusicSyncMode;
        }
        if ((i6 & 32) != 0) {
            f5 = editAdjustClipsBottomViewState.scale;
        }
        if ((i6 & 64) != 0) {
            f4 = editAdjustClipsBottomViewState.selectTime;
        }
        if ((i6 & 128) != 0) {
            num2 = editAdjustClipsBottomViewState.editState;
        }
        if ((i6 & 256) != 0) {
            bool4 = editAdjustClipsBottomViewState.focusEditMode;
        }
        if ((i6 & 512) != 0) {
            nVar4 = editAdjustClipsBottomViewState.deleteVideoEvent;
        }
        if ((i6 & 1024) != 0) {
            nVar3 = editAdjustClipsBottomViewState.updateVideoEvent;
        }
        if ((i6 & 2048) != 0) {
            dVar4 = editAdjustClipsBottomViewState.restoreEditEvent;
        }
        if ((i6 & 4096) != 0) {
            dVar3 = editAdjustClipsBottomViewState.addVideosEvent;
        }
        if ((i6 & 8192) != 0) {
            pVar4 = editAdjustClipsBottomViewState.modeChangeEvent;
        }
        if ((i6 & 16384) != 0) {
            pVar6 = editAdjustClipsBottomViewState.seekDoneEvent;
        }
        if ((i6 & 32768) != 0) {
            pVar5 = editAdjustClipsBottomViewState.restoreMusicSyncEvent;
        }
        return editAdjustClipsBottomViewState.copy(i8, i7, i10, i9, bool3, f5, f4, num2, bool4, nVar4, nVar3, dVar4, dVar3, pVar4, pVar6, pVar5);
    }

    public final int component1() {
        return this.currentEditIndex;
    }

    public final n<Integer, VideoSegment> component10() {
        return this.deleteVideoEvent;
    }

    public final n<Integer, VideoSegment> component11() {
        return this.updateVideoEvent;
    }

    public final d<t> component12() {
        return this.restoreEditEvent;
    }

    public final d<List<VideoSegment>> component13() {
        return this.addVideosEvent;
    }

    public final p component14() {
        return this.modeChangeEvent;
    }

    public final p component15() {
        return this.seekDoneEvent;
    }

    public final p component16() {
        return this.restoreMusicSyncEvent;
    }

    public final int component2() {
        return this.currentEditOriginIndex;
    }

    public final int component3() {
        return this.currentTabIndex;
    }

    public final int component4() {
        return this.stickPointStatus;
    }

    public final Boolean component5() {
        return this.isMusicSyncMode;
    }

    public final Float component6() {
        return this.scale;
    }

    public final Float component7() {
        return this.selectTime;
    }

    public final Integer component8() {
        return this.editState;
    }

    public final Boolean component9() {
        return this.focusEditMode;
    }

    public final EditAdjustClipsBottomViewState copy(int i2, int i3, int i4, int i5, Boolean bool, Float f2, Float f3, Integer num, Boolean bool2, n<Integer, VideoSegment> nVar, n<Integer, VideoSegment> nVar2, d<t> dVar, d<? extends List<? extends VideoSegment>> dVar2, p pVar, p pVar2, p pVar3) {
        return new EditAdjustClipsBottomViewState(i2, i3, i4, i5, bool, f2, f3, num, bool2, nVar, nVar2, dVar, dVar2, pVar, pVar2, pVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsBottomViewState)) {
            return false;
        }
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return this.currentEditIndex == editAdjustClipsBottomViewState.currentEditIndex && this.currentEditOriginIndex == editAdjustClipsBottomViewState.currentEditOriginIndex && this.currentTabIndex == editAdjustClipsBottomViewState.currentTabIndex && this.stickPointStatus == editAdjustClipsBottomViewState.stickPointStatus && l.a(this.isMusicSyncMode, editAdjustClipsBottomViewState.isMusicSyncMode) && l.a(this.scale, editAdjustClipsBottomViewState.scale) && l.a(this.selectTime, editAdjustClipsBottomViewState.selectTime) && l.a(this.editState, editAdjustClipsBottomViewState.editState) && l.a(this.focusEditMode, editAdjustClipsBottomViewState.focusEditMode) && l.a(this.deleteVideoEvent, editAdjustClipsBottomViewState.deleteVideoEvent) && l.a(this.updateVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent) && l.a(this.restoreEditEvent, editAdjustClipsBottomViewState.restoreEditEvent) && l.a(this.addVideosEvent, editAdjustClipsBottomViewState.addVideosEvent) && l.a(this.modeChangeEvent, editAdjustClipsBottomViewState.modeChangeEvent) && l.a(this.seekDoneEvent, editAdjustClipsBottomViewState.seekDoneEvent) && l.a(this.restoreMusicSyncEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentEditIndex) * 31) + com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentEditOriginIndex)) * 31) + com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentTabIndex)) * 31) + com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.stickPointStatus)) * 31;
        Boolean bool = this.isMusicSyncMode;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_editcut_EditAdjustClipsBottomViewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f2 = this.scale;
        int hashCode2 = (hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.selectTime;
        int hashCode3 = (hashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Integer num = this.editState;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.focusEditMode;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        n<Integer, VideoSegment> nVar = this.deleteVideoEvent;
        int hashCode6 = (hashCode5 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        n<Integer, VideoSegment> nVar2 = this.updateVideoEvent;
        int hashCode7 = (hashCode6 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        d<t> dVar = this.restoreEditEvent;
        int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        d<List<VideoSegment>> dVar2 = this.addVideosEvent;
        int hashCode9 = (hashCode8 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        p pVar = this.modeChangeEvent;
        int hashCode10 = (hashCode9 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        p pVar2 = this.seekDoneEvent;
        int hashCode11 = (hashCode10 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.restoreMusicSyncEvent;
        if (pVar3 != null) {
            i2 = pVar3.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "EditAdjustClipsBottomViewState(currentEditIndex=" + this.currentEditIndex + ", currentEditOriginIndex=" + this.currentEditOriginIndex + ", currentTabIndex=" + this.currentTabIndex + ", stickPointStatus=" + this.stickPointStatus + ", isMusicSyncMode=" + this.isMusicSyncMode + ", scale=" + this.scale + ", selectTime=" + this.selectTime + ", editState=" + this.editState + ", focusEditMode=" + this.focusEditMode + ", deleteVideoEvent=" + this.deleteVideoEvent + ", updateVideoEvent=" + this.updateVideoEvent + ", restoreEditEvent=" + this.restoreEditEvent + ", addVideosEvent=" + this.addVideosEvent + ", modeChangeEvent=" + this.modeChangeEvent + ", seekDoneEvent=" + this.seekDoneEvent + ", restoreMusicSyncEvent=" + this.restoreMusicSyncEvent + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83946);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final d<List<VideoSegment>> getAddVideosEvent() {
        return this.addVideosEvent;
    }

    public final int getCurrentEditIndex() {
        return this.currentEditIndex;
    }

    public final int getCurrentEditOriginIndex() {
        return this.currentEditOriginIndex;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final n<Integer, VideoSegment> getDeleteVideoEvent() {
        return this.deleteVideoEvent;
    }

    public final Integer getEditState() {
        return this.editState;
    }

    public final Boolean getFocusEditMode() {
        return this.focusEditMode;
    }

    public final p getModeChangeEvent() {
        return this.modeChangeEvent;
    }

    public final d<t> getRestoreEditEvent() {
        return this.restoreEditEvent;
    }

    public final p getRestoreMusicSyncEvent() {
        return this.restoreMusicSyncEvent;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final p getSeekDoneEvent() {
        return this.seekDoneEvent;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final int getStickPointStatus() {
        return this.stickPointStatus;
    }

    public final n<Integer, VideoSegment> getUpdateVideoEvent() {
        return this.updateVideoEvent;
    }

    public final Boolean isMusicSyncMode() {
        return this.isMusicSyncMode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.jedi.arch.d<? extends java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment>> */
    /* JADX WARN: Multi-variable type inference failed */
    public EditAdjustClipsBottomViewState(int i2, int i3, int i4, int i5, Boolean bool, Float f2, Float f3, Integer num, Boolean bool2, n<Integer, VideoSegment> nVar, n<Integer, VideoSegment> nVar2, d<t> dVar, d<? extends List<? extends VideoSegment>> dVar2, p pVar, p pVar2, p pVar3) {
        this.currentEditIndex = i2;
        this.currentEditOriginIndex = i3;
        this.currentTabIndex = i4;
        this.stickPointStatus = i5;
        this.isMusicSyncMode = bool;
        this.scale = f2;
        this.selectTime = f3;
        this.editState = num;
        this.focusEditMode = bool2;
        this.deleteVideoEvent = nVar;
        this.updateVideoEvent = nVar2;
        this.restoreEditEvent = dVar;
        this.addVideosEvent = dVar2;
        this.modeChangeEvent = pVar;
        this.seekDoneEvent = pVar2;
        this.restoreMusicSyncEvent = pVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAdjustClipsBottomViewState(int i2, int i3, int i4, int i5, Boolean bool, Float f2, Float f3, Integer num, Boolean bool2, n nVar, n nVar2, d dVar, d dVar2, p pVar, p pVar2, p pVar3, int i6, g gVar) {
        this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) == 0 ? i3 : 0, (i6 & 4) != 0 ? 1 : i4, (i6 & 8) == 0 ? i5 : 1, (i6 & 16) != 0 ? null : bool, (i6 & 32) != 0 ? null : f2, (i6 & 64) != 0 ? null : f3, (i6 & 128) != 0 ? null : num, (i6 & 256) != 0 ? null : bool2, (i6 & 512) != 0 ? null : nVar, (i6 & 1024) != 0 ? null : nVar2, (i6 & 2048) != 0 ? null : dVar, (i6 & 4096) != 0 ? null : dVar2, (i6 & 8192) != 0 ? null : pVar, (i6 & 16384) != 0 ? null : pVar2, (i6 & 32768) != 0 ? null : pVar3);
    }
}
