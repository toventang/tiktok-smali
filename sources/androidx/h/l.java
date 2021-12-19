package androidx.h;

import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;

final class l {
    static {
        Covode.recordClassIndex(1137);
    }

    static class a implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f3189a;

        /* renamed from: b  reason: collision with root package name */
        private final u f3190b;

        static {
            Covode.recordClassIndex(1139);
        }

        a(int i2, u uVar) {
            this.f3189a = i2;
            this.f3190b = uVar;
        }

        @Override // androidx.recyclerview.widget.u
        public final void a(int i2, int i3) {
            this.f3190b.a(i2 + this.f3189a, i3);
        }

        @Override // androidx.recyclerview.widget.u
        public final void b(int i2, int i3) {
            this.f3190b.b(i2 + this.f3189a, i3);
        }

        @Override // androidx.recyclerview.widget.u
        public final void c(int i2, int i3) {
            u uVar = this.f3190b;
            int i4 = this.f3189a;
            uVar.c(i2 + i4, i3 + i4);
        }

        @Override // androidx.recyclerview.widget.u
        public final void a(int i2, int i3, Object obj) {
            this.f3190b.a(i2 + this.f3189a, i3, obj);
        }
    }

    static int a(j.d dVar, k kVar, k kVar2, int i2) {
        int i3;
        int i4;
        int a2 = kVar.a();
        int i5 = i2 - a2;
        int size = (kVar.size() - a2) - kVar.b();
        if (i5 < 0 || i5 >= size) {
            return Math.max(0, Math.min(i2, kVar2.size() - 1));
        }
        int i6 = 0;
        do {
            int i7 = i6 / 2;
            if (i6 % 2 == 1) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i8 = (i7 * i3) + i5;
            if (i8 >= 0 && i8 < kVar.f3179f) {
                if (i8 < dVar.f4096b) {
                    int i9 = dVar.f4095a[i8];
                    if (!((i9 & 15) == 0 || (i4 = i9 >> 4) == -1)) {
                        return i4 + kVar2.f3175b;
                    }
                } else {
                    throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i8 + ", old list size = " + dVar.f4096b);
                }
            }
            i6++;
        } while (i6 < 30);
        return Math.max(0, Math.min(i2, kVar2.size() - 1));
    }
}
