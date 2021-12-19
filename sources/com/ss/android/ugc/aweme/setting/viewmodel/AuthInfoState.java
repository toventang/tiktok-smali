package com.ss.android.ugc.aweme.setting.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.setting.model.c;
import h.f.b.g;
import h.f.b.l;

public final class AuthInfoState implements af {
    private final ListState<c, o> listState;

    static {
        Covode.recordClassIndex(80818);
    }

    public AuthInfoState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthInfoState copy$default(AuthInfoState authInfoState, ListState listState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            listState2 = authInfoState.listState;
        }
        return authInfoState.copy(listState2);
    }

    public final ListState<c, o> component1() {
        return this.listState;
    }

    public final AuthInfoState copy(ListState<c, o> listState2) {
        l.d(listState2, "");
        return new AuthInfoState(listState2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AuthInfoState) && l.a(this.listState, ((AuthInfoState) obj).listState);
        }
        return true;
    }

    public final int hashCode() {
        ListState<c, o> listState2 = this.listState;
        if (listState2 != null) {
            return listState2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AuthInfoState(listState=" + this.listState + ")";
    }

    public final ListState<c, o> getListState() {
        return this.listState;
    }

    public AuthInfoState(ListState<c, o> listState2) {
        l.d(listState2, "");
        this.listState = listState2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthInfoState(ListState listState2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ListState(new o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState2);
    }
}
