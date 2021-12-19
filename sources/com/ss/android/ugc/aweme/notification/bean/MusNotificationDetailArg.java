package com.ss.android.ugc.aweme.notification.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import h.f.b.g;
import h.f.b.l;

public final class MusNotificationDetailArg implements IRouteArg {
    public static final Parcelable.Creator<MusNotificationDetailArg> CREATOR = new a();
    public final int groupType;
    public final String nid;
    public final String tabName;
    public final String title;
    public final int unReadMessageCount;

    static {
        Covode.recordClassIndex(72805);
    }

    public MusNotificationDetailArg() {
        this(0, 0, null, null, null, 31, null);
    }

    public MusNotificationDetailArg(int i2) {
        this(i2, 0, null, null, null, 30, null);
    }

    public MusNotificationDetailArg(int i2, int i3) {
        this(i2, i3, null, null, null, 28, null);
    }

    public MusNotificationDetailArg(int i2, int i3, String str) {
        this(i2, i3, str, null, null, 24, null);
    }

    public MusNotificationDetailArg(int i2, int i3, String str, String str2) {
        this(i2, i3, str, str2, null, 16, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r3 == null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg __fromBundle(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
    }

    public static int com_ss_android_ugc_aweme_notification_bean_MusNotificationDetailArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ MusNotificationDetailArg copy$default(MusNotificationDetailArg musNotificationDetailArg, int i2, int i3, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = musNotificationDetailArg.groupType;
        }
        if ((i4 & 2) != 0) {
            i3 = musNotificationDetailArg.unReadMessageCount;
        }
        if ((i4 & 4) != 0) {
            str = musNotificationDetailArg.tabName;
        }
        if ((i4 & 8) != 0) {
            str2 = musNotificationDetailArg.title;
        }
        if ((i4 & 16) != 0) {
            str3 = musNotificationDetailArg.nid;
        }
        return musNotificationDetailArg.copy(i2, i3, str, str2, str3);
    }

    public final MusNotificationDetailArg copy(int i2, int i3, String str, String str2, String str3) {
        l.d(str2, "");
        return new MusNotificationDetailArg(i2, i3, str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusNotificationDetailArg)) {
            return false;
        }
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) obj;
        return this.groupType == musNotificationDetailArg.groupType && this.unReadMessageCount == musNotificationDetailArg.unReadMessageCount && l.a(this.tabName, musNotificationDetailArg.tabName) && l.a(this.title, musNotificationDetailArg.title) && l.a(this.nid, musNotificationDetailArg.nid);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notification_bean_MusNotificationDetailArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_notification_bean_MusNotificationDetailArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.groupType) * 31) + com_ss_android_ugc_aweme_notification_bean_MusNotificationDetailArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.unReadMessageCount)) * 31;
        String str = this.tabName;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_notification_bean_MusNotificationDetailArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nid;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MusNotificationDetailArg(groupType=" + this.groupType + ", unReadMessageCount=" + this.unReadMessageCount + ", tabName=" + this.tabName + ", title=" + this.title + ", nid=" + this.nid + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.groupType);
        parcel.writeInt(this.unReadMessageCount);
        parcel.writeString(this.tabName);
        parcel.writeString(this.title);
        parcel.writeString(this.nid);
    }

    public static class a implements Parcelable.Creator<MusNotificationDetailArg> {
        static {
            Covode.recordClassIndex(72806);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MusNotificationDetailArg[] newArray(int i2) {
            return new MusNotificationDetailArg[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MusNotificationDetailArg createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new MusNotificationDetailArg(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public MusNotificationDetailArg(int i2, int i3, String str, String str2, String str3) {
        l.d(str2, "");
        this.groupType = i2;
        this.unReadMessageCount = i3;
        this.tabName = str;
        this.title = str2;
        this.nid = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusNotificationDetailArg(int i2, int i3, String str, String str2, String str3, int i4, g gVar) {
        this((i4 & 1) != 0 ? -1 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) == 0 ? str3 : null);
    }
}
