package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<c> f4089a = new Comparator<c>() {
        /* class androidx.recyclerview.widget.j.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1584);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(c cVar, c cVar2) {
            return cVar.f4092a - cVar2.f4092a;
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(1585);
        }

        public abstract int a();

        public Object a(int i2, int i3) {
            return null;
        }

        public abstract int b();

        public abstract boolean b(int i2, int i3);

        public abstract boolean c(int i2, int i3);
    }

    public static abstract class e<T> {
        static {
            Covode.recordClassIndex(1589);
        }

        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public Object c(T t, T t2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        int f4105a;

        /* renamed from: b  reason: collision with root package name */
        int f4106b;

        /* renamed from: c  reason: collision with root package name */
        int f4107c;

        /* renamed from: d  reason: collision with root package name */
        int f4108d;

        static {
            Covode.recordClassIndex(1591);
        }

        public g() {
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return this.f4106b - this.f4105a;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            return this.f4108d - this.f4107c;
        }

        public g(int i2, int i3) {
            this.f4105a = 0;
            this.f4106b = i2;
            this.f4107c = 0;
            this.f4108d = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f4109a;

        /* renamed from: b  reason: collision with root package name */
        public int f4110b;

        /* renamed from: c  reason: collision with root package name */
        public int f4111c;

        /* renamed from: d  reason: collision with root package name */
        public int f4112d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4113e;

        static {
            Covode.recordClassIndex(1592);
        }

        h() {
        }

        private boolean c() {
            if (this.f4112d - this.f4110b != this.f4111c - this.f4109a) {
                return true;
            }
            return false;
        }

        private boolean d() {
            if (this.f4112d - this.f4110b > this.f4111c - this.f4109a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return Math.min(this.f4111c - this.f4109a, this.f4112d - this.f4110b);
        }

        /* access modifiers changed from: package-private */
        public final c b() {
            if (!c()) {
                int i2 = this.f4109a;
                return new c(i2, this.f4110b, this.f4111c - i2);
            } else if (this.f4113e) {
                return new c(this.f4109a, this.f4110b, a());
            } else {
                if (d()) {
                    return new c(this.f4109a, this.f4110b + 1, a());
                }
                return new c(this.f4109a + 1, this.f4110b, a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f4092a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4093b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4094c;

        static {
            Covode.recordClassIndex(1587);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return this.f4092a + this.f4094c;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            return this.f4093b + this.f4094c;
        }

        c(int i2, int i3, int i4) {
            this.f4092a = i2;
            this.f4093b = i3;
            this.f4094c = i4;
        }
    }

    static {
        Covode.recordClassIndex(1583);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f4095a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4096b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f4097c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f4098d;

        /* renamed from: e  reason: collision with root package name */
        private final a f4099e;

        /* renamed from: f  reason: collision with root package name */
        private final int f4100f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f4101g;

        static {
            Covode.recordClassIndex(1588);
        }

        private void a() {
            int i2;
            int i3;
            Iterator<c> it = this.f4097c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                for (int i4 = 0; i4 < next.f4094c; i4++) {
                    int i5 = next.f4092a + i4;
                    int i6 = next.f4093b + i4;
                    if (this.f4099e.c(i5, i6)) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    this.f4095a[i5] = (i6 << 4) | i3;
                    this.f4098d[i6] = (i5 << 4) | i3;
                }
            }
            if (this.f4101g) {
                int i7 = 0;
                for (c cVar : this.f4097c) {
                    while (i7 < cVar.f4092a) {
                        if (this.f4095a[i7] == 0) {
                            int size = this.f4097c.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 >= size) {
                                    break;
                                }
                                c cVar2 = this.f4097c.get(i8);
                                while (i9 < cVar2.f4093b) {
                                    if (this.f4098d[i9] != 0 || !this.f4099e.b(i7, i9)) {
                                        i9++;
                                    } else {
                                        if (this.f4099e.c(i7, i9)) {
                                            i2 = 8;
                                        } else {
                                            i2 = 4;
                                        }
                                        this.f4095a[i7] = (i9 << 4) | i2;
                                        this.f4098d[i9] = i2 | (i7 << 4);
                                    }
                                }
                                i9 = cVar2.b();
                                i8++;
                            }
                        }
                        i7++;
                    }
                    i7 = cVar.a();
                }
            }
        }

        public final void a(RecyclerView.a aVar) {
            a(new b(aVar));
        }

        public final void a(u uVar) {
            e eVar;
            int i2;
            if (uVar instanceof e) {
                eVar = (e) uVar;
            } else {
                eVar = new e(uVar);
            }
            int i3 = this.f4096b;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.f4096b;
            int i5 = this.f4100f;
            for (int size = this.f4097c.size() - 1; size >= 0; size--) {
                c cVar = this.f4097c.get(size);
                int a2 = cVar.a();
                int b2 = cVar.b();
                while (true) {
                    if (i4 <= a2) {
                        break;
                    }
                    i4--;
                    int i6 = this.f4095a[i4];
                    if ((i6 & 12) != 0) {
                        int i7 = i6 >> 4;
                        f a3 = a(arrayDeque, i7, false);
                        if (a3 != null) {
                            int i8 = (i3 - a3.f4103b) - 1;
                            eVar.c(i4, i8);
                            if ((i6 & 4) != 0) {
                                eVar.a(i8, 1, this.f4099e.a(i4, i7));
                            }
                        } else {
                            arrayDeque.add(new f(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        eVar.b(i4, 1);
                        i3--;
                    }
                }
                while (i5 > b2) {
                    i5--;
                    int i9 = this.f4098d[i5];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        f a4 = a(arrayDeque, i10, true);
                        if (a4 == null) {
                            arrayDeque.add(new f(i5, i3 - i4, false));
                        } else {
                            eVar.c((i3 - a4.f4103b) - 1, i4);
                            if ((i9 & 4) != 0) {
                                eVar.a(i4, 1, this.f4099e.a(i10, i5));
                            }
                        }
                    } else {
                        eVar.a(i4, 1);
                        i3++;
                    }
                }
                int i11 = cVar.f4092a;
                int i12 = cVar.f4093b;
                for (i2 = 0; i2 < cVar.f4094c; i2++) {
                    if ((this.f4095a[i11] & 15) == 2) {
                        eVar.a(i11, 1, this.f4099e.a(i11, i12));
                    }
                    i11++;
                    i12++;
                }
                i4 = cVar.f4092a;
                i5 = cVar.f4093b;
            }
            eVar.a();
        }

        private static f a(Collection<f> collection, int i2, boolean z) {
            f fVar;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (fVar.f4102a == i2 && fVar.f4104c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f next = it.next();
                if (z) {
                    next.f4103b--;
                } else {
                    next.f4103b++;
                }
            }
            return fVar;
        }

        d(a aVar, List<c> list, int[] iArr, int[] iArr2, boolean z) {
            c cVar;
            this.f4097c = list;
            this.f4095a = iArr;
            this.f4098d = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4099e = aVar;
            int a2 = aVar.a();
            this.f4096b = a2;
            int b2 = aVar.b();
            this.f4100f = b2;
            this.f4101g = z;
            if (list.isEmpty() || (cVar = list.get(0)) == null || cVar.f4092a != 0 || cVar.f4093b != 0) {
                list.add(0, new c(0, 0, 0));
            }
            list.add(new c(a2, b2, 0));
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f4090a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4091b;

        static {
            Covode.recordClassIndex(1586);
        }

        /* access modifiers changed from: package-private */
        public final int a(int i2) {
            return this.f4090a[i2 + this.f4091b];
        }

        b(int i2) {
            int[] iArr = new int[i2];
            this.f4090a = iArr;
            this.f4091b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            this.f4090a[i2 + this.f4091b] = i3;
        }
    }

    public static d a(a aVar) {
        return a(aVar, true);
    }

    public static d a(a aVar, boolean z) {
        g gVar;
        int a2 = aVar.a();
        int b2 = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(a2, b2));
        int i2 = ((((a2 + b2) + 1) / 2) * 2) + 1;
        b bVar = new b(i2);
        b bVar2 = new b(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar2 = (g) arrayList2.remove(arrayList2.size() - 1);
            h a3 = a(gVar2, aVar, bVar, bVar2);
            if (a3 != null) {
                if (a3.a() > 0) {
                    arrayList.add(a3.b());
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                } else {
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.f4105a = gVar2.f4105a;
                gVar.f4107c = gVar2.f4107c;
                gVar.f4106b = a3.f4109a;
                gVar.f4108d = a3.f4110b;
                arrayList2.add(gVar);
                gVar2.f4106b = gVar2.f4106b;
                gVar2.f4108d = gVar2.f4108d;
                gVar2.f4105a = a3.f4111c;
                gVar2.f4107c = a3.f4112d;
                arrayList2.add(gVar2);
            } else {
                arrayList3.add(gVar2);
            }
        }
        Collections.sort(arrayList, f4089a);
        return new d(aVar, arrayList, bVar.f4090a, bVar2.f4090a, z);
    }

    /* access modifiers changed from: package-private */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        int f4102a;

        /* renamed from: b  reason: collision with root package name */
        int f4103b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4104c;

        static {
            Covode.recordClassIndex(1590);
        }

        f(int i2, int i3, boolean z) {
            this.f4102a = i2;
            this.f4103b = i3;
            this.f4104c = z;
        }
    }

    private static h a(g gVar, a aVar, b bVar, b bVar2) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (gVar.a() <= 0 || gVar.b() <= 0) {
            return null;
        }
        int i9 = 1;
        int a2 = ((gVar.a() + gVar.b()) + 1) / 2;
        bVar.a(1, gVar.f4105a);
        bVar2.a(1, gVar.f4106b);
        int i10 = 0;
        while (i10 < a2) {
            if (Math.abs(gVar.a() - gVar.b()) % 2 == i9) {
                z = true;
            } else {
                z = false;
            }
            int a3 = gVar.a() - gVar.b();
            int i11 = -i10;
            for (int i12 = i11; i12 <= i10; i12 += 2) {
                if (i12 == i11 || (i12 != i10 && bVar.a(i12 + 1) > bVar.a(i12 - 1))) {
                    i6 = bVar.a(i12 + 1);
                    i7 = i6;
                } else {
                    i6 = bVar.a(i12 - 1);
                    i7 = i6 + 1;
                }
                int i13 = (gVar.f4107c + (i7 - gVar.f4105a)) - i12;
                int i14 = (i10 == 0 || i7 != i6) ? i13 : i13 - 1;
                while (i7 < gVar.f4106b && i13 < gVar.f4108d && aVar.b(i7, i13)) {
                    i7++;
                    i13++;
                }
                bVar.a(i12, i7);
                if (z && (i8 = a3 - i12) >= i11 + 1 && i8 <= i10 - 1 && bVar2.a(i8) <= i7) {
                    h hVar = new h();
                    hVar.f4109a = i6;
                    hVar.f4110b = i14;
                    hVar.f4111c = i7;
                    hVar.f4112d = i13;
                    hVar.f4113e = false;
                    return hVar;
                }
            }
            if ((gVar.a() - gVar.b()) % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int a4 = gVar.a() - gVar.b();
            for (int i15 = i11; i15 <= i10; i15 += 2) {
                if (i15 == i11 || (i15 != i10 && bVar2.a(i15 + 1) < bVar2.a(i15 - 1))) {
                    i2 = bVar2.a(i15 + 1);
                    i3 = i2;
                } else {
                    i2 = bVar2.a(i15 - 1);
                    i3 = i2 - 1;
                }
                int i16 = gVar.f4108d - ((gVar.f4106b - i3) - i15);
                if (i10 == 0 || i3 != i2) {
                    i4 = i16;
                } else {
                    i4 = i16 + 1;
                }
                while (i3 > gVar.f4105a && i16 > gVar.f4107c && aVar.b(i3 - 1, i16 - 1)) {
                    i3--;
                    i16--;
                }
                bVar2.a(i15, i3);
                if (z2 && (i5 = a4 - i15) >= i11 && i5 <= i10 && bVar.a(i5) >= i3) {
                    h hVar2 = new h();
                    hVar2.f4109a = i3;
                    hVar2.f4110b = i16;
                    hVar2.f4111c = i2;
                    hVar2.f4112d = i4;
                    hVar2.f4113e = true;
                    return hVar2;
                }
            }
            i10++;
            i9 = 1;
        }
        return null;
    }
}
