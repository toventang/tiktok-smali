package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonenumber;
import java.util.Arrays;

public final class PhoneNumberMatch {
    private final Phonenumber.PhoneNumber number;
    private final String rawString;
    private final int start;

    static {
        Covode.recordClassIndex(34083);
    }

    public final Phonenumber.PhoneNumber number() {
        return this.number;
    }

    public final String rawString() {
        return this.rawString;
    }

    public final int start() {
        return this.start;
    }

    public final int end() {
        return this.start + this.rawString.length();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.start), this.rawString, this.number});
    }

    public final String toString() {
        return "PhoneNumberMatch [" + start() + "," + end() + ") " + this.rawString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberMatch)) {
            return false;
        }
        PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
        if (!this.rawString.equals(phoneNumberMatch.rawString) || this.start != phoneNumberMatch.start || !this.number.equals(phoneNumberMatch.number)) {
            return false;
        }
        return true;
    }

    PhoneNumberMatch(int i2, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str == null || phoneNumber == null) {
            throw null;
        } else {
            this.start = i2;
            this.rawString = str;
            this.number = phoneNumber;
        }
    }
}
