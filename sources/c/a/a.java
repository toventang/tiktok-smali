package c.a;

import c.c.b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f4875a;

    static {
        Covode.recordClassIndex(1919);
    }

    /* renamed from: c.a.a$a  reason: collision with other inner class name */
    public static class C0068a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4876a = new a((byte) 0);

        static {
            Covode.recordClassIndex(1920);
        }
    }

    private a() {
        this.f4875a = new LinkedList();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final a a(b bVar) {
        if (!this.f4875a.contains(bVar)) {
            this.f4875a.add(0, bVar);
        }
        return this;
    }

    public static c.b.a a(File file) {
        if (file instanceof c.b.a) {
            return (c.b.a) file;
        }
        return new c.b.a(file.getPath());
    }

    public static String b(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        char c2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = charArray[i2];
            if (c3 != '/' || c2 != '/') {
                charArray[i3] = c3;
                i3++;
            }
            i2++;
            c2 = c3;
        }
        if (c2 == '/' && length > 1) {
            i3--;
        }
        if (i3 != length) {
            return new String(charArray, 0, i3);
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return str;
        }
        c.c.a aVar = new c.c.a(str);
        return new b(this.f4875a, 0, aVar).a(aVar).f4908a;
    }

    public final String a(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        if (str == null || str.isEmpty()) {
            return a(str2);
        }
        if (str2.isEmpty() || str2.equals("/")) {
            return a(str);
        }
        if (str2.charAt(0) == '/' && str.equals("/")) {
            return a(str2);
        }
        c.c.a aVar = new c.c.a(str, str2);
        return new b(this.f4875a, 0, aVar).a(aVar).f4908a;
    }
}
