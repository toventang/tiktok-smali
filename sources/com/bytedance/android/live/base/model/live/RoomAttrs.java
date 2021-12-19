package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.model.ac;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;

public class RoomAttrs implements ac {
    @c(a = "admin_flag")
    private int adminFlag;
    @c(a = "fanticket_this_room")
    public long currentRoomContribution;
    @c(a = "rank_this_room")
    public int currentRoomRank;
    @c(a = "rank")
    public int rank;
    @c(a = "silence_flag")
    private int silenceFlag;

    static {
        Covode.recordClassIndex(3600);
    }

    @Override // com.bytedance.android.livesdk.model.ac
    public int getAdminFlag() {
        return this.adminFlag;
    }

    @Override // com.bytedance.android.livesdk.model.ac
    public int getRank() {
        return this.rank;
    }

    @Override // com.bytedance.android.livesdk.model.ac
    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i2) {
        this.adminFlag = i2;
    }

    public void setRank(int i2) {
        this.rank = i2;
    }

    public void setSilenceFlag(int i2) {
        this.silenceFlag = i2;
    }

    public static RoomAttrs from(ac acVar) {
        if (acVar == null) {
            return null;
        }
        if (acVar instanceof RoomAttrs) {
            f fVar = e.a.f9628b;
            return (RoomAttrs) fVar.a(fVar.b(acVar), RoomAttrs.class);
        }
        RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(acVar);
        return roomAttrs;
    }

    private void initWith(ac acVar) {
        this.silenceFlag = acVar.getSilenceFlag();
        this.adminFlag = acVar.getAdminFlag();
        this.rank = acVar.getRank();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RoomAttrs roomAttrs = (RoomAttrs) obj;
            if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
                return true;
            }
        }
        return false;
    }
}
