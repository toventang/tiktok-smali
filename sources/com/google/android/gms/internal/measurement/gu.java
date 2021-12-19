package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class gu extends IOException {
    private ht zza;

    static {
        Covode.recordClassIndex(31833);
    }

    static gu a() {
        return new gu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static gu b() {
        return new gu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static gu c() {
        return new gu("CodedInputStream encountered a malformed varint.");
    }

    static gu d() {
        return new gu("Protocol message contained an invalid tag (zero).");
    }

    static gu e() {
        return new gu("Protocol message end-group tag did not match expected tag.");
    }

    static gx f() {
        return new gx("Protocol message tag had invalid wire type.");
    }

    static gu g() {
        return new gu("Failed to parse the message.");
    }

    static gu h() {
        return new gu("Protocol message had invalid UTF-8.");
    }

    public gu(String str) {
        super(str);
    }
}
