package com.bytedance.b.b.a.c;

import com.bytedance.b.k.b.b;
import com.bytedance.b.k.c;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f25893a;

    /* renamed from: b  reason: collision with root package name */
    public int f25894b;

    /* renamed from: c  reason: collision with root package name */
    public int f25895c;

    /* renamed from: d  reason: collision with root package name */
    public File f25896d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f25897e;

    static {
        Covode.recordClassIndex(15108);
    }

    public final String toString() {
        return "LogFile{startID=" + this.f25893a + ", totalCount=" + this.f25894b + ", totalBytes=" + this.f25895c + ", source=" + this.f25896d + ", logList=" + this.f25897e + '}';
    }

    public static a a(File file) {
        try {
            byte[] a2 = c.a(file);
            if (a2 != null) {
                a a3 = a(ByteBuffer.wrap(a2));
                if (a3 != null) {
                    a3.f25896d = file;
                } else {
                    b.a(com.bytedance.b.b.a.a.f25847a, "fromMemory bytes is null");
                }
                return a3;
            }
            b.a(com.bytedance.b.b.a.a.f25847a, "fromFile bytes is null");
            return null;
        } catch (Throwable th) {
            b.a(com.bytedance.b.b.a.a.f25847a, "fromFile", th);
            return null;
        }
    }

    public static a a(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j2 = byteBuffer.getLong();
            int i2 = byteBuffer.getInt();
            int i3 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = byteBuffer.getInt();
                i4 += i6;
                if (i4 > i3) {
                    return null;
                }
                byte[] bArr = new byte[i6];
                byteBuffer.get(bArr);
                arrayList.add(new b(bArr));
            }
            return new a(j2, i2, i3, arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    private a(long j2, int i2, int i3, List<b> list) {
        this.f25893a = j2;
        this.f25894b = i2;
        this.f25895c = i3;
        this.f25897e = list;
    }
}
