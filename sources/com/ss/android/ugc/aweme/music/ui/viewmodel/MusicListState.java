package com.ss.android.ugc.aweme.music.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import h.f.b.g;
import h.f.b.l;

public final class MusicListState implements ICommonListState<Object> {
    private final String musicId;
    private final ListState<Object, o> substate;

    static {
        Covode.recordClassIndex(72020);
    }

    public MusicListState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicListState copy$default(MusicListState musicListState, String str, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicListState.musicId;
        }
        if ((i2 & 2) != 0) {
            listState = musicListState.getSubstate();
        }
        return musicListState.copy(str, listState);
    }

    public final String component1() {
        return this.musicId;
    }

    public final ListState<Object, o> component2() {
        return getSubstate();
    }

    public final MusicListState copy(String str, ListState<Object, o> listState) {
        l.d(str, "");
        l.d(listState, "");
        return new MusicListState(str, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicListState)) {
            return false;
        }
        MusicListState musicListState = (MusicListState) obj;
        return l.a(this.musicId, musicListState.musicId) && l.a(getSubstate(), musicListState.getSubstate());
    }

    public final int hashCode() {
        String str = this.musicId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<Object, o> substate2 = getSubstate();
        if (substate2 != null) {
            i2 = substate2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MusicListState(musicId=" + this.musicId + ", substate=" + getSubstate() + ")";
    }

    public final String getMusicId() {
        return this.musicId;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Object, o> getSubstate() {
        return this.substate;
    }

    public final NestedState<ListState<Object, o>> newSubstate(ListState<Object, o> listState) {
        l.d(listState, "");
        return copy$default(this, null, listState, 1, null);
    }

    public MusicListState(String str, ListState<Object, o> listState) {
        l.d(str, "");
        l.d(listState, "");
        this.musicId = str;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicListState(String str, ListState listState, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new ListState(new o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
