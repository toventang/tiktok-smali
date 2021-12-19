package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;

public final class RoomInfo {
    @c(a = "link_mic")
    public final LinkMic linkMic;
    @c(a = "live_type_screenshot")
    public final Boolean liveTypeScreenshot;
    @c(a = "live_type_social_live")
    public final Boolean liveTypeSocialLive;
    @c(a = "owner_user_id")
    public final Long ownerUserId;
    @c(a = "room_id")
    public final long roomId;
    @c(a = "title")
    public final String title;
    @c(a = StringSet.type)
    public final Integer type;

    static {
        Covode.recordClassIndex(72807);
    }

    public RoomInfo() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    public static int com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, long j2, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = roomInfo.roomId;
        }
        if ((i2 & 2) != 0) {
            str = roomInfo.title;
        }
        if ((i2 & 4) != 0) {
            num = roomInfo.type;
        }
        if ((i2 & 8) != 0) {
            bool = roomInfo.liveTypeSocialLive;
        }
        if ((i2 & 16) != 0) {
            bool2 = roomInfo.liveTypeScreenshot;
        }
        if ((i2 & 32) != 0) {
            linkMic2 = roomInfo.linkMic;
        }
        if ((i2 & 64) != 0) {
            l2 = roomInfo.ownerUserId;
        }
        return roomInfo.copy(j2, str, num, bool, bool2, linkMic2, l2);
    }

    public final RoomInfo copy(long j2, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l2) {
        return new RoomInfo(j2, str, num, bool, bool2, linkMic2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) obj;
        return this.roomId == roomInfo.roomId && l.a(this.title, roomInfo.title) && l.a(this.type, roomInfo.type) && l.a(this.liveTypeSocialLive, roomInfo.liveTypeSocialLive) && l.a(this.liveTypeScreenshot, roomInfo.liveTypeScreenshot) && l.a(this.linkMic, roomInfo.linkMic) && l.a(this.ownerUserId, roomInfo.ownerUserId);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.roomId) * 31;
        String str = this.title;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.liveTypeSocialLive;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.liveTypeScreenshot;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LinkMic linkMic2 = this.linkMic;
        int hashCode5 = (hashCode4 + (linkMic2 != null ? linkMic2.hashCode() : 0)) * 31;
        Long l2 = this.ownerUserId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "RoomInfo(roomId=" + this.roomId + ", title=" + this.title + ", type=" + this.type + ", liveTypeSocialLive=" + this.liveTypeSocialLive + ", liveTypeScreenshot=" + this.liveTypeScreenshot + ", linkMic=" + this.linkMic + ", ownerUserId=" + this.ownerUserId + ")";
    }

    public RoomInfo(long j2, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l2) {
        this.roomId = j2;
        this.title = str;
        this.type = num;
        this.liveTypeSocialLive = bool;
        this.liveTypeScreenshot = bool2;
        this.linkMic = linkMic2;
        this.ownerUserId = l2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomInfo(long j2, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? false : bool, (i2 & 16) != 0 ? false : bool2, (i2 & 32) == 0 ? linkMic2 : null, (i2 & 64) != 0 ? 0L : l2);
    }
}
