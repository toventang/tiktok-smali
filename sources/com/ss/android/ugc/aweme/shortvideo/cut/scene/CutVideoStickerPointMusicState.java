package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoStickerPointMusicState implements af {
    private final k dismissAnimateEvent;
    private final k musicDialogVisibleEvent;
    private final Boolean musicViewVisible;
    private final k showAnimateEvent;
    private final k startMusicEvent;

    static {
        Covode.recordClassIndex(82428);
    }

    public CutVideoStickerPointMusicState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoStickerPointMusicState copy$default(CutVideoStickerPointMusicState cutVideoStickerPointMusicState, k kVar, k kVar2, k kVar3, k kVar4, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = cutVideoStickerPointMusicState.startMusicEvent;
        }
        if ((i2 & 2) != 0) {
            kVar2 = cutVideoStickerPointMusicState.showAnimateEvent;
        }
        if ((i2 & 4) != 0) {
            kVar3 = cutVideoStickerPointMusicState.dismissAnimateEvent;
        }
        if ((i2 & 8) != 0) {
            kVar4 = cutVideoStickerPointMusicState.musicDialogVisibleEvent;
        }
        if ((i2 & 16) != 0) {
            bool = cutVideoStickerPointMusicState.musicViewVisible;
        }
        return cutVideoStickerPointMusicState.copy(kVar, kVar2, kVar3, kVar4, bool);
    }

    public final k component1() {
        return this.startMusicEvent;
    }

    public final k component2() {
        return this.showAnimateEvent;
    }

    public final k component3() {
        return this.dismissAnimateEvent;
    }

    public final k component4() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean component5() {
        return this.musicViewVisible;
    }

    public final CutVideoStickerPointMusicState copy(k kVar, k kVar2, k kVar3, k kVar4, Boolean bool) {
        return new CutVideoStickerPointMusicState(kVar, kVar2, kVar3, kVar4, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoStickerPointMusicState)) {
            return false;
        }
        CutVideoStickerPointMusicState cutVideoStickerPointMusicState = (CutVideoStickerPointMusicState) obj;
        return l.a(this.startMusicEvent, cutVideoStickerPointMusicState.startMusicEvent) && l.a(this.showAnimateEvent, cutVideoStickerPointMusicState.showAnimateEvent) && l.a(this.dismissAnimateEvent, cutVideoStickerPointMusicState.dismissAnimateEvent) && l.a(this.musicDialogVisibleEvent, cutVideoStickerPointMusicState.musicDialogVisibleEvent) && l.a(this.musicViewVisible, cutVideoStickerPointMusicState.musicViewVisible);
    }

    public final int hashCode() {
        k kVar = this.startMusicEvent;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.showAnimateEvent;
        int hashCode2 = (hashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k kVar3 = this.dismissAnimateEvent;
        int hashCode3 = (hashCode2 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k kVar4 = this.musicDialogVisibleEvent;
        int hashCode4 = (hashCode3 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        Boolean bool = this.musicViewVisible;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CutVideoStickerPointMusicState(startMusicEvent=" + this.startMusicEvent + ", showAnimateEvent=" + this.showAnimateEvent + ", dismissAnimateEvent=" + this.dismissAnimateEvent + ", musicDialogVisibleEvent=" + this.musicDialogVisibleEvent + ", musicViewVisible=" + this.musicViewVisible + ")";
    }

    public final k getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final k getMusicDialogVisibleEvent() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean getMusicViewVisible() {
        return this.musicViewVisible;
    }

    public final k getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final k getStartMusicEvent() {
        return this.startMusicEvent;
    }

    public CutVideoStickerPointMusicState(k kVar, k kVar2, k kVar3, k kVar4, Boolean bool) {
        this.startMusicEvent = kVar;
        this.showAnimateEvent = kVar2;
        this.dismissAnimateEvent = kVar3;
        this.musicDialogVisibleEvent = kVar4;
        this.musicViewVisible = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoStickerPointMusicState(k kVar, k kVar2, k kVar3, k kVar4, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar, (i2 & 2) != 0 ? null : kVar2, (i2 & 4) != 0 ? null : kVar3, (i2 & 8) != 0 ? null : kVar4, (i2 & 16) == 0 ? bool : null);
    }
}
