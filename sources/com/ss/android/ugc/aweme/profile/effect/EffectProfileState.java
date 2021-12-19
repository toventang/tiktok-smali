package com.ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.sticker.model.g;
import h.f.b.l;

public final class EffectProfileState implements ICommonListState<g> {
    private final ListState<g, o> substate;
    private final String userId;

    static {
        Covode.recordClassIndex(75063);
    }

    public EffectProfileState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.profile.effect.EffectProfileState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectProfileState copy$default(EffectProfileState effectProfileState, String str, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = effectProfileState.userId;
        }
        if ((i2 & 2) != 0) {
            listState = effectProfileState.getSubstate();
        }
        return effectProfileState.copy(str, listState);
    }

    public final String component1() {
        return this.userId;
    }

    public final ListState<g, o> component2() {
        return getSubstate();
    }

    public final EffectProfileState copy(String str, ListState<g, o> listState) {
        l.d(listState, "");
        return new EffectProfileState(str, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectProfileState)) {
            return false;
        }
        EffectProfileState effectProfileState = (EffectProfileState) obj;
        return l.a(this.userId, effectProfileState.userId) && l.a(getSubstate(), effectProfileState.getSubstate());
    }

    public final int hashCode() {
        String str = this.userId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<g, o> substate2 = getSubstate();
        if (substate2 != null) {
            i2 = substate2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EffectProfileState(userId=" + this.userId + ", substate=" + getSubstate() + ")";
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<g, o> getSubstate() {
        return this.substate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final EffectProfileState newSubstate(ListState<g, o> listState) {
        l.d(listState, "");
        return copy$default(this, null, listState, 1, null);
    }

    public EffectProfileState(String str, ListState<g, o> listState) {
        l.d(listState, "");
        this.userId = str;
        this.substate = listState;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectProfileState(String str, ListState listState, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? new ListState(new o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState);
    }
}
