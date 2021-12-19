package com.ss.android.ugc.aweme.story.record.dockbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class StoryRecordDockBarState implements af {
    private final p clickAlbumIcon;

    static {
        Covode.recordClassIndex(90394);
    }

    public StoryRecordDockBarState() {
        this(null, 1, null);
    }

    public static /* synthetic */ StoryRecordDockBarState copy$default(StoryRecordDockBarState storyRecordDockBarState, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = storyRecordDockBarState.clickAlbumIcon;
        }
        return storyRecordDockBarState.copy(pVar);
    }

    public final p component1() {
        return this.clickAlbumIcon;
    }

    public final StoryRecordDockBarState copy(p pVar) {
        return new StoryRecordDockBarState(pVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StoryRecordDockBarState) && l.a(this.clickAlbumIcon, ((StoryRecordDockBarState) obj).clickAlbumIcon);
        }
        return true;
    }

    public final int hashCode() {
        p pVar = this.clickAlbumIcon;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryRecordDockBarState(clickAlbumIcon=" + this.clickAlbumIcon + ")";
    }

    public final p getClickAlbumIcon() {
        return this.clickAlbumIcon;
    }

    public StoryRecordDockBarState(p pVar) {
        this.clickAlbumIcon = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordDockBarState(p pVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar);
    }
}
