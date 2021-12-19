package h.j;

import com.bytedance.covode.number.Covode;
import h.a.af;
import java.util.NoSuchElementException;

public final class f extends af {

    /* renamed from: a  reason: collision with root package name */
    public final int f158750a;

    /* renamed from: b  reason: collision with root package name */
    private final int f158751b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f158752c;

    /* renamed from: d  reason: collision with root package name */
    private int f158753d;

    static {
        Covode.recordClassIndex(105272);
    }

    public final boolean hasNext() {
        return this.f158752c;
    }

    @Override // h.a.af
    public final int a() {
        int i2 = this.f158753d;
        if (i2 != this.f158751b) {
            this.f158753d = this.f158750a + i2;
        } else if (this.f158752c) {
            this.f158752c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public f(int i2, int i3, int i4) {
        this.f158750a = i4;
        this.f158751b = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f158752c = z;
        this.f158753d = !z ? i3 : i2;
    }
}
