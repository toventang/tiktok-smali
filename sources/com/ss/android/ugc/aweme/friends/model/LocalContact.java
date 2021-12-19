package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LocalContact {
    public final String contactName;
    public final String phoneNumber;

    static {
        Covode.recordClassIndex(61589);
    }

    public static /* synthetic */ LocalContact copy$default(LocalContact localContact, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = localContact.phoneNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = localContact.contactName;
        }
        return localContact.copy(str, str2);
    }

    public final LocalContact copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new LocalContact(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalContact)) {
            return false;
        }
        LocalContact localContact = (LocalContact) obj;
        return l.a(this.phoneNumber, localContact.phoneNumber) && l.a(this.contactName, localContact.contactName);
    }

    public final int hashCode() {
        String str = this.phoneNumber;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contactName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LocalContact(phoneNumber=" + this.phoneNumber + ", contactName=" + this.contactName + ")";
    }

    public LocalContact(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.phoneNumber = str;
        this.contactName = str2;
    }
}
