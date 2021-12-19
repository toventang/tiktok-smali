package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.u;
import java.net.ProtocolException;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final u f57713a;

    /* renamed from: b  reason: collision with root package name */
    public final int f57714b;

    /* renamed from: c  reason: collision with root package name */
    public final String f57715c;

    static {
        Covode.recordClassIndex(35961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f57713a == u.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ').append(this.f57714b);
        if (this.f57715c != null) {
            sb.append(' ').append(this.f57715c);
        }
        return sb.toString();
    }

    public static r a(String str) {
        u uVar;
        String str2;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                uVar = u.HTTP_1_0;
            } else if (charAt == 1) {
                uVar = u.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            uVar = u.HTTP_1_0;
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                return new r(uVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public r(u uVar, int i2, String str) {
        this.f57713a = uVar;
        this.f57714b = i2;
        this.f57715c = str;
    }
}
