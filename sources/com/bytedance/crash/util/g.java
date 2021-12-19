package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class g extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    private MessageDigest f27995a;

    /* renamed from: b  reason: collision with root package name */
    private Charset f27996b;

    /* renamed from: c  reason: collision with root package name */
    private a f27997c;

    public static class a {
        static {
            Covode.recordClassIndex(16382);
        }

        public boolean a(String str) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(16381);
    }

    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return ab.a(instance.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i2) {
        MethodCollector.i(10772);
        super.write(i2);
        MessageDigest messageDigest = this.f27995a;
        if (messageDigest != null) {
            messageDigest.update((byte) i2);
        }
        MethodCollector.o(10772);
    }

    public g(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f27995a = messageDigest;
        this.f27997c = aVar;
        if (messageDigest != null) {
            this.f27996b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i2, int i3) {
        a aVar;
        MethodCollector.i(11251);
        super.write(str, i2, i3);
        if (this.f27995a != null && ((aVar = this.f27997c) == null || aVar.a(str))) {
            this.f27995a.update(this.f27996b.encode(CharBuffer.wrap(str, i2, i3 + i2)).array());
        }
        MethodCollector.o(11251);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        MethodCollector.i(10622);
        super.write(cArr, i2, i3);
        MessageDigest messageDigest = this.f27995a;
        if (messageDigest != null) {
            messageDigest.update(this.f27996b.encode(CharBuffer.wrap(cArr)).array());
        }
        MethodCollector.o(10622);
    }
}
