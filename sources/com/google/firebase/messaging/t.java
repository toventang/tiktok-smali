package com.google.firebase.messaging;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f54632d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f54633a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54634b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54635c;

    static {
        Covode.recordClassIndex(33900);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54634b, this.f54633a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f54633a.equals(tVar.f54633a) || !this.f54634b.equals(tVar.f54634b)) {
            return false;
        }
        return true;
    }

    t(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            a.a("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str});
            str3 = str2.substring(8);
        }
        if (str3 == null || !f54632d.matcher(str3).matches()) {
            throw new IllegalArgumentException(a.a("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f54633a = str3;
        this.f54634b = str;
        this.f54635c = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append("!").append(str2).toString();
    }
}
