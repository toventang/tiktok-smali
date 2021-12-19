package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import h.f.b.g;
import h.f.b.l;

public final class VideoPublishState implements af {
    private final n<Boolean, Boolean> backEvent;
    private final n<Boolean, Boolean> cancelEvent;

    static {
        Covode.recordClassIndex(86445);
    }

    public VideoPublishState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPublishState copy$default(VideoPublishState videoPublishState, n nVar, n nVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nVar = videoPublishState.backEvent;
        }
        if ((i2 & 2) != 0) {
            nVar2 = videoPublishState.cancelEvent;
        }
        return videoPublishState.copy(nVar, nVar2);
    }

    public final n<Boolean, Boolean> component1() {
        return this.backEvent;
    }

    public final n<Boolean, Boolean> component2() {
        return this.cancelEvent;
    }

    public final VideoPublishState copy(n<Boolean, Boolean> nVar, n<Boolean, Boolean> nVar2) {
        return new VideoPublishState(nVar, nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPublishState)) {
            return false;
        }
        VideoPublishState videoPublishState = (VideoPublishState) obj;
        return l.a(this.backEvent, videoPublishState.backEvent) && l.a(this.cancelEvent, videoPublishState.cancelEvent);
    }

    public final int hashCode() {
        n<Boolean, Boolean> nVar = this.backEvent;
        int i2 = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        n<Boolean, Boolean> nVar2 = this.cancelEvent;
        if (nVar2 != null) {
            i2 = nVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VideoPublishState(backEvent=" + this.backEvent + ", cancelEvent=" + this.cancelEvent + ")";
    }

    public final n<Boolean, Boolean> getBackEvent() {
        return this.backEvent;
    }

    public final n<Boolean, Boolean> getCancelEvent() {
        return this.cancelEvent;
    }

    public VideoPublishState(n<Boolean, Boolean> nVar, n<Boolean, Boolean> nVar2) {
        this.backEvent = nVar;
        this.cancelEvent = nVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoPublishState(n nVar, n nVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : nVar, (i2 & 2) != 0 ? null : nVar2);
    }
}
