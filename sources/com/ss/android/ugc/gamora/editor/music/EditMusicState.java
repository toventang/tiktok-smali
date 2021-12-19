package com.ss.android.ugc.gamora.editor.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.l;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.q.e;
import h.f.b.g;

public final class EditMusicState extends UiState {
    private final p cleanSelectedMusic;
    private final p clickChangeVolume;
    private final m cutMusic;
    private final k enableChangeVoice;
    private final Boolean enableCutMusic;
    private final e.b musicViewClickListener;
    private final c mvMusicDetail;
    private final boolean needMob;
    private final l onVoiceVolumeChange;
    private final p refreshMusicPanel;
    private final ac<c> selectMusic;
    private final com.ss.android.ugc.aweme.da.e transitionListener;
    private final a ui;

    static {
        Covode.recordClassIndex(96079);
    }

    public EditMusicState() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.music.EditMusicState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditMusicState copy$default(EditMusicState editMusicState, Boolean bool, m mVar, c cVar, com.ss.android.ugc.aweme.da.e eVar, e.b bVar, ac acVar, p pVar, p pVar2, boolean z, p pVar3, l lVar, k kVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = editMusicState.enableCutMusic;
        }
        if ((i2 & 2) != 0) {
            mVar = editMusicState.cutMusic;
        }
        if ((i2 & 4) != 0) {
            cVar = editMusicState.mvMusicDetail;
        }
        if ((i2 & 8) != 0) {
            eVar = editMusicState.transitionListener;
        }
        if ((i2 & 16) != 0) {
            bVar = editMusicState.musicViewClickListener;
        }
        if ((i2 & 32) != 0) {
            acVar = editMusicState.selectMusic;
        }
        if ((i2 & 64) != 0) {
            pVar = editMusicState.cleanSelectedMusic;
        }
        if ((i2 & 128) != 0) {
            pVar2 = editMusicState.clickChangeVolume;
        }
        if ((i2 & 256) != 0) {
            z = editMusicState.needMob;
        }
        if ((i2 & 512) != 0) {
            pVar3 = editMusicState.refreshMusicPanel;
        }
        if ((i2 & 1024) != 0) {
            lVar = editMusicState.onVoiceVolumeChange;
        }
        if ((i2 & 2048) != 0) {
            kVar = editMusicState.enableChangeVoice;
        }
        if ((i2 & 4096) != 0) {
            aVar = editMusicState.getUi();
        }
        return editMusicState.copy(bool, mVar, cVar, eVar, bVar, acVar, pVar, pVar2, z, pVar3, lVar, kVar, aVar);
    }

    public final Boolean component1() {
        return this.enableCutMusic;
    }

    public final p component10() {
        return this.refreshMusicPanel;
    }

    public final l component11() {
        return this.onVoiceVolumeChange;
    }

    public final k component12() {
        return this.enableChangeVoice;
    }

    public final a component13() {
        return getUi();
    }

    public final m component2() {
        return this.cutMusic;
    }

    public final c component3() {
        return this.mvMusicDetail;
    }

    public final com.ss.android.ugc.aweme.da.e component4() {
        return this.transitionListener;
    }

    public final e.b component5() {
        return this.musicViewClickListener;
    }

    public final ac<c> component6() {
        return this.selectMusic;
    }

    public final p component7() {
        return this.cleanSelectedMusic;
    }

    public final p component8() {
        return this.clickChangeVolume;
    }

    public final boolean component9() {
        return this.needMob;
    }

    public final EditMusicState copy(Boolean bool, m mVar, c cVar, com.ss.android.ugc.aweme.da.e eVar, e.b bVar, ac<? extends c> acVar, p pVar, p pVar2, boolean z, p pVar3, l lVar, k kVar, a aVar) {
        h.f.b.l.d(aVar, "");
        return new EditMusicState(bool, mVar, cVar, eVar, bVar, acVar, pVar, pVar2, z, pVar3, lVar, kVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMusicState)) {
            return false;
        }
        EditMusicState editMusicState = (EditMusicState) obj;
        return h.f.b.l.a(this.enableCutMusic, editMusicState.enableCutMusic) && h.f.b.l.a(this.cutMusic, editMusicState.cutMusic) && h.f.b.l.a(this.mvMusicDetail, editMusicState.mvMusicDetail) && h.f.b.l.a(this.transitionListener, editMusicState.transitionListener) && h.f.b.l.a(this.musicViewClickListener, editMusicState.musicViewClickListener) && h.f.b.l.a(this.selectMusic, editMusicState.selectMusic) && h.f.b.l.a(this.cleanSelectedMusic, editMusicState.cleanSelectedMusic) && h.f.b.l.a(this.clickChangeVolume, editMusicState.clickChangeVolume) && this.needMob == editMusicState.needMob && h.f.b.l.a(this.refreshMusicPanel, editMusicState.refreshMusicPanel) && h.f.b.l.a(this.onVoiceVolumeChange, editMusicState.onVoiceVolumeChange) && h.f.b.l.a(this.enableChangeVoice, editMusicState.enableChangeVoice) && h.f.b.l.a(getUi(), editMusicState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.enableCutMusic;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        m mVar = this.cutMusic;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        c cVar = this.mvMusicDetail;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.da.e eVar = this.transitionListener;
        int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e.b bVar = this.musicViewClickListener;
        int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        ac<c> acVar = this.selectMusic;
        int hashCode6 = (hashCode5 + (acVar != null ? acVar.hashCode() : 0)) * 31;
        p pVar = this.cleanSelectedMusic;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        p pVar2 = this.clickChangeVolume;
        int hashCode8 = (hashCode7 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        boolean z = this.needMob;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        p pVar3 = this.refreshMusicPanel;
        int hashCode9 = (i6 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        l lVar = this.onVoiceVolumeChange;
        int hashCode10 = (hashCode9 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        k kVar = this.enableChangeVoice;
        int hashCode11 = (hashCode10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "EditMusicState(enableCutMusic=" + this.enableCutMusic + ", cutMusic=" + this.cutMusic + ", mvMusicDetail=" + this.mvMusicDetail + ", transitionListener=" + this.transitionListener + ", musicViewClickListener=" + this.musicViewClickListener + ", selectMusic=" + this.selectMusic + ", cleanSelectedMusic=" + this.cleanSelectedMusic + ", clickChangeVolume=" + this.clickChangeVolume + ", needMob=" + this.needMob + ", refreshMusicPanel=" + this.refreshMusicPanel + ", onVoiceVolumeChange=" + this.onVoiceVolumeChange + ", enableChangeVoice=" + this.enableChangeVoice + ", ui=" + getUi() + ")";
    }

    public final p getCleanSelectedMusic() {
        return this.cleanSelectedMusic;
    }

    public final p getClickChangeVolume() {
        return this.clickChangeVolume;
    }

    public final m getCutMusic() {
        return this.cutMusic;
    }

    public final k getEnableChangeVoice() {
        return this.enableChangeVoice;
    }

    public final Boolean getEnableCutMusic() {
        return this.enableCutMusic;
    }

    public final e.b getMusicViewClickListener() {
        return this.musicViewClickListener;
    }

    public final c getMvMusicDetail() {
        return this.mvMusicDetail;
    }

    public final boolean getNeedMob() {
        return this.needMob;
    }

    public final l getOnVoiceVolumeChange() {
        return this.onVoiceVolumeChange;
    }

    public final p getRefreshMusicPanel() {
        return this.refreshMusicPanel;
    }

    public final ac<c> getSelectMusic() {
        return this.selectMusic;
    }

    public final com.ss.android.ugc.aweme.da.e getTransitionListener() {
        return this.transitionListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.jedi.arch.ac<? extends com.ss.android.ugc.aweme.shortvideo.c> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMusicState(Boolean bool, m mVar, c cVar, com.ss.android.ugc.aweme.da.e eVar, e.b bVar, ac<? extends c> acVar, p pVar, p pVar2, boolean z, p pVar3, l lVar, k kVar, a aVar) {
        super(aVar);
        h.f.b.l.d(aVar, "");
        this.enableCutMusic = bool;
        this.cutMusic = mVar;
        this.mvMusicDetail = cVar;
        this.transitionListener = eVar;
        this.musicViewClickListener = bVar;
        this.selectMusic = acVar;
        this.cleanSelectedMusic = pVar;
        this.clickChangeVolume = pVar2;
        this.needMob = z;
        this.refreshMusicPanel = pVar3;
        this.onVoiceVolumeChange = lVar;
        this.enableChangeVoice = kVar;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMusicState(Boolean bool, m mVar, c cVar, com.ss.android.ugc.aweme.da.e eVar, e.b bVar, ac acVar, p pVar, p pVar2, boolean z, p pVar3, l lVar, k kVar, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : mVar, (i2 & 4) != 0 ? null : cVar, (i2 & 8) != 0 ? null : eVar, (i2 & 16) != 0 ? null : bVar, (i2 & 32) != 0 ? null : acVar, (i2 & 64) != 0 ? null : pVar, (i2 & 128) != 0 ? null : pVar2, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? null : pVar3, (i2 & 1024) != 0 ? null : lVar, (i2 & 2048) == 0 ? kVar : null, (i2 & 4096) != 0 ? new a.C1131a() : aVar);
    }
}
