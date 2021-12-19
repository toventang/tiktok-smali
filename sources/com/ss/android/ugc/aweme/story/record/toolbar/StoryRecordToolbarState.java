package com.ss.android.ugc.aweme.story.record.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class StoryRecordToolbarState implements af {
    private final p clickBack;
    private final k clickBeauty;
    private final p clickFlash;
    private final p clickSwitch;

    static {
        Covode.recordClassIndex(90535);
    }

    public StoryRecordToolbarState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StoryRecordToolbarState copy$default(StoryRecordToolbarState storyRecordToolbarState, p pVar, p pVar2, k kVar, p pVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = storyRecordToolbarState.clickBack;
        }
        if ((i2 & 2) != 0) {
            pVar2 = storyRecordToolbarState.clickFlash;
        }
        if ((i2 & 4) != 0) {
            kVar = storyRecordToolbarState.clickBeauty;
        }
        if ((i2 & 8) != 0) {
            pVar3 = storyRecordToolbarState.clickSwitch;
        }
        return storyRecordToolbarState.copy(pVar, pVar2, kVar, pVar3);
    }

    public final p component1() {
        return this.clickBack;
    }

    public final p component2() {
        return this.clickFlash;
    }

    public final k component3() {
        return this.clickBeauty;
    }

    public final p component4() {
        return this.clickSwitch;
    }

    public final StoryRecordToolbarState copy(p pVar, p pVar2, k kVar, p pVar3) {
        return new StoryRecordToolbarState(pVar, pVar2, kVar, pVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRecordToolbarState)) {
            return false;
        }
        StoryRecordToolbarState storyRecordToolbarState = (StoryRecordToolbarState) obj;
        return l.a(this.clickBack, storyRecordToolbarState.clickBack) && l.a(this.clickFlash, storyRecordToolbarState.clickFlash) && l.a(this.clickBeauty, storyRecordToolbarState.clickBeauty) && l.a(this.clickSwitch, storyRecordToolbarState.clickSwitch);
    }

    public final int hashCode() {
        p pVar = this.clickBack;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.clickFlash;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        k kVar = this.clickBeauty;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        p pVar3 = this.clickSwitch;
        if (pVar3 != null) {
            i2 = pVar3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "StoryRecordToolbarState(clickBack=" + this.clickBack + ", clickFlash=" + this.clickFlash + ", clickBeauty=" + this.clickBeauty + ", clickSwitch=" + this.clickSwitch + ")";
    }

    public final p getClickBack() {
        return this.clickBack;
    }

    public final k getClickBeauty() {
        return this.clickBeauty;
    }

    public final p getClickFlash() {
        return this.clickFlash;
    }

    public final p getClickSwitch() {
        return this.clickSwitch;
    }

    public StoryRecordToolbarState(p pVar, p pVar2, k kVar, p pVar3) {
        this.clickBack = pVar;
        this.clickFlash = pVar2;
        this.clickBeauty = kVar;
        this.clickSwitch = pVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordToolbarState(p pVar, p pVar2, k kVar, p pVar3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : pVar3);
    }
}
