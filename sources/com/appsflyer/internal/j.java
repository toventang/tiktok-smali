package com.appsflyer.internal;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j {

    /* renamed from: ı  reason: contains not printable characters */
    public String f265;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String f266;

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f267;

    /* renamed from: ι  reason: contains not printable characters */
    private byte[] f268;

    static {
        Covode.recordClassIndex(2737);
    }

    j() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte[] m184() {
        return this.f268;
    }

    j(char[] cArr) {
        byte[] decode;
        Scanner scanner = new Scanner(new String(cArr));
        int i2 = 0;
        int i3 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f265 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f267 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.f267);
                if (matcher.matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                    i3 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                if (i2 > 4 || i3 >= 11) {
                    decode = Base64.decode(trim, 2);
                } else {
                    decode = trim.getBytes();
                }
                this.f268 = decode;
            }
        }
        scanner.close();
    }

    public j(String str, byte[] bArr, String str2) {
        this.f265 = str;
        this.f268 = bArr;
        this.f267 = str2;
    }
}
