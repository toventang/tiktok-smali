package com.ss.android.ugc.aweme.shortvideo.edit.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditEffectState extends UiState {
    private final p refreshCoverEvent;
    private final p regenerateReverseVideo;
    private final Integer setVideoLength;
    private final a ui;
    private final m updateEffectTime;

    static {
        Covode.recordClassIndex(83341);
    }

    public EditEffectState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ EditEffectState copy$default(EditEffectState editEffectState, a aVar, Integer num, p pVar, p pVar2, m mVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editEffectState.getUi();
        }
        if ((i2 & 2) != 0) {
            num = editEffectState.setVideoLength;
        }
        if ((i2 & 4) != 0) {
            pVar = editEffectState.regenerateReverseVideo;
        }
        if ((i2 & 8) != 0) {
            pVar2 = editEffectState.refreshCoverEvent;
        }
        if ((i2 & 16) != 0) {
            mVar = editEffectState.updateEffectTime;
        }
        return editEffectState.copy(aVar, num, pVar, pVar2, mVar);
    }

    public final a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.setVideoLength;
    }

    public final p component3() {
        return this.regenerateReverseVideo;
    }

    public final p component4() {
        return this.refreshCoverEvent;
    }

    public final m component5() {
        return this.updateEffectTime;
    }

    public final EditEffectState copy(a aVar, Integer num, p pVar, p pVar2, m mVar) {
        l.d(aVar, "");
        return new EditEffectState(aVar, num, pVar, pVar2, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditEffectState)) {
            return false;
        }
        EditEffectState editEffectState = (EditEffectState) obj;
        return l.a(getUi(), editEffectState.getUi()) && l.a(this.setVideoLength, editEffectState.setVideoLength) && l.a(this.regenerateReverseVideo, editEffectState.regenerateReverseVideo) && l.a(this.refreshCoverEvent, editEffectState.refreshCoverEvent) && l.a(this.updateEffectTime, editEffectState.updateEffectTime);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Integer num = this.setVideoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        p pVar = this.regenerateReverseVideo;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        p pVar2 = this.refreshCoverEvent;
        int hashCode4 = (hashCode3 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        m mVar = this.updateEffectTime;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "EditEffectState(ui=" + getUi() + ", setVideoLength=" + this.setVideoLength + ", regenerateReverseVideo=" + this.regenerateReverseVideo + ", refreshCoverEvent=" + this.refreshCoverEvent + ", updateEffectTime=" + this.updateEffectTime + ")";
    }

    public final p getRefreshCoverEvent() {
        return this.refreshCoverEvent;
    }

    public final p getRegenerateReverseVideo() {
        return this.regenerateReverseVideo;
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final m getUpdateEffectTime() {
        return this.updateEffectTime;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditEffectState(a aVar, Integer num, p pVar, p pVar2, m mVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.setVideoLength = num;
        this.regenerateReverseVideo = pVar;
        this.refreshCoverEvent = pVar2;
        this.updateEffectTime = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditEffectState(a aVar, Integer num, p pVar, p pVar2, m mVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : pVar, (i2 & 8) != 0 ? null : pVar2, (i2 & 16) == 0 ? mVar : null);
    }
}
