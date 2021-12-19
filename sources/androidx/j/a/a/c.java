package androidx.j.a.a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Charset> f3215a = new ThreadLocal<Charset>() {
        /* class androidx.j.a.a.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1163);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<CharsetDecoder> f3216d = new ThreadLocal<CharsetDecoder>() {
        /* class androidx.j.a.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1162);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<CharBuffer> f3217e = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    protected int f3218b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f3219c;

    static {
        Covode.recordClassIndex(1161);
    }

    /* access modifiers changed from: protected */
    public final int d(int i2) {
        int i3 = i2 + this.f3218b;
        return i3 + this.f3219c.getInt(i3) + 4;
    }

    /* access modifiers changed from: protected */
    public final int b(int i2) {
        int i3 = this.f3218b;
        int i4 = i3 - this.f3219c.getInt(i3);
        if (i2 < this.f3219c.getShort(i4)) {
            return this.f3219c.getShort(i4 + i2);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int c(int i2) {
        int i3 = i2 + this.f3218b;
        return this.f3219c.getInt(i3 + this.f3219c.getInt(i3));
    }
}
