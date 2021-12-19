package com.ss.android.ugc.aweme.friends.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import h.f.b.g;
import h.f.b.l;

public final class ContactsActivityArgs implements IRouteArg {
    public static final Parcelable.Creator<ContactsActivityArgs> CREATOR = new a();

    /* renamed from: boolean  reason: not valid java name */
    private final boolean f345boolean;
    private final String enterFrom;

    static {
        Covode.recordClassIndex(61692);
    }

    public ContactsActivityArgs() {
        this(null, false, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs __fromBundle(android.os.Bundle r8) {
        /*
            r6 = 0
            if (r8 != 0) goto L_0x0004
            return r6
        L_0x0004:
            java.lang.String r1 = "enter_from"
            java.lang.String r7 = "just_granted_read_contacts"
            boolean r0 = r8.containsKey(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0044
            com.bytedance.router.arg.RouteParser r2 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r1 = r8.get(r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r4 = r2.parse(r1, r0)
            java.lang.String r4 = (java.lang.String) r4
            r3 = 0
        L_0x001e:
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x0042
            com.bytedance.router.arg.RouteParser r2 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r1 = r8.get(r7)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.Object r1 = r2.parse(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            int r3 = r3 + 2
        L_0x0036:
            com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs r0 = new com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs
            if (r1 == 0) goto L_0x003e
            boolean r5 = r1.booleanValue()
        L_0x003e:
            r0.<init>(r4, r5, r3, r6)
            return r0
        L_0x0042:
            r1 = r6
            goto L_0x0034
        L_0x0044:
            r0 = 1
            r4 = r6
            r3 = 1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.friends.ui.ContactsActivityArgs");
    }

    public static /* synthetic */ ContactsActivityArgs copy$default(ContactsActivityArgs contactsActivityArgs, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contactsActivityArgs.enterFrom;
        }
        if ((i2 & 2) != 0) {
            z = contactsActivityArgs.f345boolean;
        }
        return contactsActivityArgs.copy(str, z);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final boolean component2() {
        return this.f345boolean;
    }

    public final ContactsActivityArgs copy(String str, boolean z) {
        return new ContactsActivityArgs(str, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsActivityArgs)) {
            return false;
        }
        ContactsActivityArgs contactsActivityArgs = (ContactsActivityArgs) obj;
        return l.a(this.enterFrom, contactsActivityArgs.enterFrom) && this.f345boolean == contactsActivityArgs.f345boolean;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f345boolean;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "ContactsActivityArgs(enterFrom=" + this.enterFrom + ", boolean=" + this.f345boolean + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.f345boolean ? 1 : 0);
    }

    public final boolean getBoolean() {
        return this.f345boolean;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public static class a implements Parcelable.Creator<ContactsActivityArgs> {
        static {
            Covode.recordClassIndex(61693);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ContactsActivityArgs[] newArray(int i2) {
            return new ContactsActivityArgs[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ContactsActivityArgs createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ContactsActivityArgs(parcel.readString(), parcel.readInt() != 0);
        }
    }

    public ContactsActivityArgs(String str, boolean z) {
        this.enterFrom = str;
        this.f345boolean = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactsActivityArgs(String str, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z);
    }
}
