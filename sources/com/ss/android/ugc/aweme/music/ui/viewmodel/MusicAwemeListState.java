package com.ss.android.ugc.aweme.music.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import h.f.b.g;
import h.f.b.l;

public final class MusicAwemeListState implements ICommonListState<Object> {
    private boolean isNeedControl;
    private final String musicId;
    private int outBound;
    private final ListState<Object, o> substate;

    static {
        Covode.recordClassIndex(72006);
    }

    public MusicAwemeListState() {
        this(null, 0, false, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_music_ui_viewmodel_MusicAwemeListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicAwemeListState copy$default(MusicAwemeListState musicAwemeListState, String str, int i2, boolean z, ListState listState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = musicAwemeListState.musicId;
        }
        if ((i3 & 2) != 0) {
            i2 = musicAwemeListState.outBound;
        }
        if ((i3 & 4) != 0) {
            z = musicAwemeListState.isNeedControl;
        }
        if ((i3 & 8) != 0) {
            listState = musicAwemeListState.getSubstate();
        }
        return musicAwemeListState.copy(str, i2, z, listState);
    }

    public final String component1() {
        return this.musicId;
    }

    public final int component2() {
        return this.outBound;
    }

    public final boolean component3() {
        return this.isNeedControl;
    }

    public final ListState<Object, o> component4() {
        return getSubstate();
    }

    public final MusicAwemeListState copy(String str, int i2, boolean z, ListState<Object, o> listState) {
        l.d(str, "");
        l.d(listState, "");
        return new MusicAwemeListState(str, i2, z, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAwemeListState)) {
            return false;
        }
        MusicAwemeListState musicAwemeListState = (MusicAwemeListState) obj;
        return l.a(this.musicId, musicAwemeListState.musicId) && this.outBound == musicAwemeListState.outBound && this.isNeedControl == musicAwemeListState.isNeedControl && l.a(getSubstate(), musicAwemeListState.getSubstate());
    }

    public final int hashCode() {
        String str = this.musicId;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_music_ui_viewmodel_MusicAwemeListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.outBound)) * 31;
        boolean z = this.isNeedControl;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        ListState<Object, o> substate2 = getSubstate();
        if (substate2 != null) {
            i2 = substate2.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "MusicAwemeListState(musicId=" + this.musicId + ", outBound=" + this.outBound + ", isNeedControl=" + this.isNeedControl + ", substate=" + getSubstate() + ")";
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOutBound() {
        return this.outBound;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Object, o> getSubstate() {
        return this.substate;
    }

    public final boolean isNeedControl() {
        return this.isNeedControl;
    }

    public final void setNeedControl(boolean z) {
        this.isNeedControl = z;
    }

    public final void setOutBound(int i2) {
        this.outBound = i2;
    }

    public final NestedState<ListState<Object, o>> newSubstate(ListState<Object, o> listState) {
        l.d(listState, "");
        return copy$default(this, null, 0, false, listState, 7, null);
    }

    public MusicAwemeListState(String str, int i2, boolean z, ListState<Object, o> listState) {
        l.d(str, "");
        l.d(listState, "");
        this.musicId = str;
        this.outBound = i2;
        this.isNeedControl = z;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicAwemeListState(String str, int i2, boolean z, ListState listState, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? new ListState(new o(false, 2, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
