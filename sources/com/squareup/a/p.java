package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f57876a;

    static {
        Covode.recordClassIndex(36012);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f57877a = new ArrayList(20);

        static {
            Covode.recordClassIndex(36013);
        }

        public final p a() {
            return new p(this, (byte) 0);
        }

        /* access modifiers changed from: package-private */
        public final a a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return c("", str.substring(1));
            }
            return c("", str);
        }

        public final a b(String str) {
            int i2 = 0;
            while (i2 < this.f57877a.size()) {
                if (str.equalsIgnoreCase(this.f57877a.get(i2))) {
                    this.f57877a.remove(i2);
                    this.f57877a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final a a(String str, String str2) {
            d(str, str2);
            return c(str, str2);
        }

        private a c(String str, String str2) {
            this.f57877a.add(str);
            this.f57877a.add(str2.trim());
            return this;
        }

        public final a b(String str, String str2) {
            d(str, str2);
            b(str);
            c(str, str2);
            return this;
        }

        private static void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(com.a.a("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i2), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt2 = str2.charAt(i3);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(com.a.a("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i3), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    public final a a() {
        a aVar = new a();
        Collections.addAll(aVar.f57877a, this.f57876a);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(a(i2)).append(": ").append(b(i2)).append("\n");
        }
        return sb.toString();
    }

    public final String a(String str) {
        return a(this.f57876a, str);
    }

    public final String b(int i2) {
        int i3 = (i2 * 2) + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f57876a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    private p(a aVar) {
        this.f57876a = (String[]) aVar.f57877a.toArray(new String[aVar.f57877a.size()]);
    }

    public final Date b(String str) {
        String a2 = a(str);
        if (a2 != null) {
            return g.a(a2);
        }
        return null;
    }

    public final String a(int i2) {
        int i3 = i2 * 2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f57876a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public final List<String> c(String str) {
        int length = this.f57876a.length / 2;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(a(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i2));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* synthetic */ p(a aVar, byte b2) {
        this(aVar);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
