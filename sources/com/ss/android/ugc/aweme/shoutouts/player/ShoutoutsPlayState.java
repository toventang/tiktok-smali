package com.ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class ShoutoutsPlayState implements af {
    private final int progress;
    private final a status;

    static {
        Covode.recordClassIndex(87160);
    }

    public ShoutoutsPlayState() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ShoutoutsPlayState copy$default(ShoutoutsPlayState shoutoutsPlayState, int i2, a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = shoutoutsPlayState.progress;
        }
        if ((i3 & 2) != 0) {
            aVar = shoutoutsPlayState.status;
        }
        return shoutoutsPlayState.copy(i2, aVar);
    }

    public final int component1() {
        return this.progress;
    }

    public final a component2() {
        return this.status;
    }

    public final ShoutoutsPlayState copy(int i2, a aVar) {
        l.d(aVar, "");
        return new ShoutoutsPlayState(i2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPlayState)) {
            return false;
        }
        ShoutoutsPlayState shoutoutsPlayState = (ShoutoutsPlayState) obj;
        return this.progress == shoutoutsPlayState.progress && l.a(this.status, shoutoutsPlayState.status);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.progress) * 31;
        a aVar = this.status;
        return com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShoutoutsPlayState(progress=" + this.progress + ", status=" + this.status + ")";
    }

    public final int getProgress() {
        return this.progress;
    }

    public final a getStatus() {
        return this.status;
    }

    public ShoutoutsPlayState(int i2, a aVar) {
        l.d(aVar, "");
        this.progress = i2;
        this.status = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoutoutsPlayState(int i2, a aVar, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? a.PREPARED : aVar);
    }
}
