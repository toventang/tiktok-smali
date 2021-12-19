package com.ss.android.ugc.aweme.story.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class StoryRecordBaseState implements af {
    private final m backFromEditPageResult;
    private final p exit;
    private final k forbidAlbumGesture;
    private final Boolean forbidDrawerScrollEvent;
    private final p leftScroll;
    private final p onAttachToScreen;
    private final p onOpenCompletely;
    private final k openAlbum;
    private final k showOrHideCommonButtons;

    static {
        Covode.recordClassIndex(90345);
    }

    public StoryRecordBaseState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ StoryRecordBaseState copy$default(StoryRecordBaseState storyRecordBaseState, m mVar, p pVar, Boolean bool, k kVar, p pVar2, p pVar3, p pVar4, k kVar2, k kVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mVar = storyRecordBaseState.backFromEditPageResult;
        }
        if ((i2 & 2) != 0) {
            pVar = storyRecordBaseState.exit;
        }
        if ((i2 & 4) != 0) {
            bool = storyRecordBaseState.forbidDrawerScrollEvent;
        }
        if ((i2 & 8) != 0) {
            kVar = storyRecordBaseState.forbidAlbumGesture;
        }
        if ((i2 & 16) != 0) {
            pVar2 = storyRecordBaseState.leftScroll;
        }
        if ((i2 & 32) != 0) {
            pVar3 = storyRecordBaseState.onAttachToScreen;
        }
        if ((i2 & 64) != 0) {
            pVar4 = storyRecordBaseState.onOpenCompletely;
        }
        if ((i2 & 128) != 0) {
            kVar2 = storyRecordBaseState.openAlbum;
        }
        if ((i2 & 256) != 0) {
            kVar3 = storyRecordBaseState.showOrHideCommonButtons;
        }
        return storyRecordBaseState.copy(mVar, pVar, bool, kVar, pVar2, pVar3, pVar4, kVar2, kVar3);
    }

    public final m component1() {
        return this.backFromEditPageResult;
    }

    public final p component2() {
        return this.exit;
    }

    public final Boolean component3() {
        return this.forbidDrawerScrollEvent;
    }

    public final k component4() {
        return this.forbidAlbumGesture;
    }

    public final p component5() {
        return this.leftScroll;
    }

    public final p component6() {
        return this.onAttachToScreen;
    }

    public final p component7() {
        return this.onOpenCompletely;
    }

    public final k component8() {
        return this.openAlbum;
    }

    public final k component9() {
        return this.showOrHideCommonButtons;
    }

    public final StoryRecordBaseState copy(m mVar, p pVar, Boolean bool, k kVar, p pVar2, p pVar3, p pVar4, k kVar2, k kVar3) {
        return new StoryRecordBaseState(mVar, pVar, bool, kVar, pVar2, pVar3, pVar4, kVar2, kVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRecordBaseState)) {
            return false;
        }
        StoryRecordBaseState storyRecordBaseState = (StoryRecordBaseState) obj;
        return l.a(this.backFromEditPageResult, storyRecordBaseState.backFromEditPageResult) && l.a(this.exit, storyRecordBaseState.exit) && l.a(this.forbidDrawerScrollEvent, storyRecordBaseState.forbidDrawerScrollEvent) && l.a(this.forbidAlbumGesture, storyRecordBaseState.forbidAlbumGesture) && l.a(this.leftScroll, storyRecordBaseState.leftScroll) && l.a(this.onAttachToScreen, storyRecordBaseState.onAttachToScreen) && l.a(this.onOpenCompletely, storyRecordBaseState.onOpenCompletely) && l.a(this.openAlbum, storyRecordBaseState.openAlbum) && l.a(this.showOrHideCommonButtons, storyRecordBaseState.showOrHideCommonButtons);
    }

    public final int hashCode() {
        m mVar = this.backFromEditPageResult;
        int i2 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        p pVar = this.exit;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Boolean bool = this.forbidDrawerScrollEvent;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        k kVar = this.forbidAlbumGesture;
        int hashCode4 = (hashCode3 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        p pVar2 = this.leftScroll;
        int hashCode5 = (hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.onAttachToScreen;
        int hashCode6 = (hashCode5 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        p pVar4 = this.onOpenCompletely;
        int hashCode7 = (hashCode6 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        k kVar2 = this.openAlbum;
        int hashCode8 = (hashCode7 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k kVar3 = this.showOrHideCommonButtons;
        if (kVar3 != null) {
            i2 = kVar3.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "StoryRecordBaseState(backFromEditPageResult=" + this.backFromEditPageResult + ", exit=" + this.exit + ", forbidDrawerScrollEvent=" + this.forbidDrawerScrollEvent + ", forbidAlbumGesture=" + this.forbidAlbumGesture + ", leftScroll=" + this.leftScroll + ", onAttachToScreen=" + this.onAttachToScreen + ", onOpenCompletely=" + this.onOpenCompletely + ", openAlbum=" + this.openAlbum + ", showOrHideCommonButtons=" + this.showOrHideCommonButtons + ")";
    }

    public final m getBackFromEditPageResult() {
        return this.backFromEditPageResult;
    }

    public final p getExit() {
        return this.exit;
    }

    public final k getForbidAlbumGesture() {
        return this.forbidAlbumGesture;
    }

    public final Boolean getForbidDrawerScrollEvent() {
        return this.forbidDrawerScrollEvent;
    }

    public final p getLeftScroll() {
        return this.leftScroll;
    }

    public final p getOnAttachToScreen() {
        return this.onAttachToScreen;
    }

    public final p getOnOpenCompletely() {
        return this.onOpenCompletely;
    }

    public final k getOpenAlbum() {
        return this.openAlbum;
    }

    public final k getShowOrHideCommonButtons() {
        return this.showOrHideCommonButtons;
    }

    public StoryRecordBaseState(m mVar, p pVar, Boolean bool, k kVar, p pVar2, p pVar3, p pVar4, k kVar2, k kVar3) {
        this.backFromEditPageResult = mVar;
        this.exit = pVar;
        this.forbidDrawerScrollEvent = bool;
        this.forbidAlbumGesture = kVar;
        this.leftScroll = pVar2;
        this.onAttachToScreen = pVar3;
        this.onOpenCompletely = pVar4;
        this.openAlbum = kVar2;
        this.showOrHideCommonButtons = kVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordBaseState(m mVar, p pVar, Boolean bool, k kVar, p pVar2, p pVar3, p pVar4, k kVar2, k kVar3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : mVar, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : kVar, (i2 & 16) != 0 ? null : pVar2, (i2 & 32) != 0 ? null : pVar3, (i2 & 64) != 0 ? null : pVar4, (i2 & 128) != 0 ? null : kVar2, (i2 & 256) == 0 ? kVar3 : null);
    }
}
