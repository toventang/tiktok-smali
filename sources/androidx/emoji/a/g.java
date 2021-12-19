package androidx.emoji.a;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.j.a.a.b;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final b f2812a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f2813b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2814c;

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f2815d;

    static {
        Covode.recordClassIndex(989);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final SparseArray<a> f2816a;

        /* renamed from: b  reason: collision with root package name */
        public b f2817b;

        static {
            Covode.recordClassIndex(990);
        }

        a() {
            this(1);
        }

        a(int i2) {
            this.f2816a = new SparseArray<>(i2);
        }

        /* access modifiers changed from: package-private */
        public final a a(int i2) {
            SparseArray<a> sparseArray = this.f2816a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i2);
        }
    }

    g() {
        this.f2814c = new a(1024);
        this.f2813b = new char[0];
    }

    private void a(b bVar) {
        boolean z;
        int b2 = bVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            b bVar2 = new b(this, i2);
            Character.toChars(bVar2.a().a(), this.f2813b, i2 * 2);
            androidx.core.g.g.a(bVar2, "emoji metadata cannot be null");
            if (bVar2.a().f() > 0) {
                z = true;
            } else {
                z = false;
            }
            androidx.core.g.g.a(z, (Object) "invalid metadata codepoint length");
            a aVar = this.f2814c;
            int f2 = bVar2.a().f() - 1;
            int i3 = 0;
            while (true) {
                a a2 = aVar.a(bVar2.a(i3));
                if (a2 == null) {
                    a2 = new a();
                    aVar.f2816a.put(bVar2.a(i3), a2);
                }
                aVar = a2;
                if (f2 <= i3) {
                    break;
                }
                i3++;
            }
            aVar.f2817b = bVar2;
        }
    }

    g(Typeface typeface, b bVar) {
        this.f2815d = typeface;
        this.f2812a = bVar;
        this.f2814c = new a(1024);
        this.f2813b = new char[(bVar.b() * 2)];
        a(bVar);
    }
}
