package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f57902a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f57903b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c  reason: collision with root package name */
    private final String f57904c;

    public final String toString() {
        return this.f57904c;
    }

    public final int hashCode() {
        return this.f57904c.hashCode();
    }

    static {
        Covode.recordClassIndex(36019);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s) || !((s) obj).f57904c.equals(this.f57904c)) {
            return false;
        }
        return true;
    }
}
