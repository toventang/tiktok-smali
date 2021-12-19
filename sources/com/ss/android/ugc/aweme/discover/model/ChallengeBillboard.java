package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ChallengeBillboard implements Serializable {
    private int rank;
    private String schema;
    private int version;

    static {
        Covode.recordClassIndex(50879);
    }

    public ChallengeBillboard() {
        this(0, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ChallengeBillboard copy$default(ChallengeBillboard challengeBillboard, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = challengeBillboard.rank;
        }
        if ((i4 & 2) != 0) {
            i3 = challengeBillboard.version;
        }
        if ((i4 & 4) != 0) {
            str = challengeBillboard.schema;
        }
        return challengeBillboard.copy(i2, i3, str);
    }

    public final int component1() {
        return this.rank;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.schema;
    }

    public final ChallengeBillboard copy(int i2, int i3, String str) {
        l.d(str, "");
        return new ChallengeBillboard(i2, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeBillboard)) {
            return false;
        }
        ChallengeBillboard challengeBillboard = (ChallengeBillboard) obj;
        return this.rank == challengeBillboard.rank && this.version == challengeBillboard.version && l.a(this.schema, challengeBillboard.schema);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rank) * 31) + com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.version)) * 31;
        String str = this.schema;
        return com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChallengeBillboard(rank=" + this.rank + ", version=" + this.version + ", schema=" + this.schema + ")";
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setRank(int i2) {
        this.rank = i2;
    }

    public final void setVersion(int i2) {
        this.version = i2;
    }

    public final void setSchema(String str) {
        l.d(str, "");
        this.schema = str;
    }

    public ChallengeBillboard(int i2, int i3, String str) {
        l.d(str, "");
        this.rank = i2;
        this.version = i3;
        this.schema = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeBillboard(int i2, int i3, String str, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? "" : str);
    }
}
