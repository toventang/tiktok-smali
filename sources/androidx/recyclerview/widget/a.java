package androidx.recyclerview.widget;

import androidx.core.g.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class a implements w.a {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<b> f3941a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f3942b;

    /* renamed from: c  reason: collision with root package name */
    final AbstractC0057a f3943c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f3944d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f3945e;

    /* renamed from: f  reason: collision with root package name */
    final w f3946f;

    /* renamed from: g  reason: collision with root package name */
    int f3947g;

    /* renamed from: h  reason: collision with root package name */
    private f.a<b> f3948h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0057a {
        static {
            Covode.recordClassIndex(1526);
        }

        RecyclerView.ViewHolder a(int i2);

        void a(int i2, int i3);

        void a(int i2, int i3, Object obj);

        void a(b bVar);

        void b(int i2, int i3);

        void b(b bVar);

        void c(int i2, int i3);

        void d(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(1525);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f3949a;

        /* renamed from: b  reason: collision with root package name */
        int f3950b;

        /* renamed from: c  reason: collision with root package name */
        Object f3951c;

        /* renamed from: d  reason: collision with root package name */
        int f3952d;

        static {
            Covode.recordClassIndex(1527);
        }

        public final int hashCode() {
            return (((this.f3949a * 31) + this.f3950b) * 31) + this.f3952d;
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
            int i2 = this.f3949a;
            if (i2 == 1) {
                str = "add";
            } else if (i2 == 2) {
                str = "rm";
            } else if (i2 == 4) {
                str = "up";
            } else if (i2 != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            return append.append(str).append(",s:").append(this.f3950b).append("c:").append(this.f3952d).append(",p:").append(this.f3951c).append("]").toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f3949a;
            if (i2 != bVar.f3949a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f3952d - this.f3950b) == 1 && this.f3952d == bVar.f3950b && this.f3950b == bVar.f3952d) {
                return true;
            }
            if (this.f3952d != bVar.f3952d || this.f3950b != bVar.f3950b) {
                return false;
            }
            Object obj2 = this.f3951c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3951c)) {
                    return false;
                }
            } else if (bVar.f3951c != null) {
                return false;
            }
            return true;
        }

        b(int i2, int i3, int i4, Object obj) {
            this.f3949a = i2;
            this.f3950b = i3;
            this.f3952d = i4;
            this.f3951c = obj;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(this.f3941a);
        a(this.f3942b);
        this.f3947g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f3941a.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f3942b.isEmpty() || this.f3941a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int size = this.f3942b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3943c.b(this.f3942b.get(i2));
        }
        a(this.f3942b);
        this.f3947g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        c();
        int size = this.f3941a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3941a.get(i2);
            int i3 = bVar.f3949a;
            if (i3 == 1) {
                this.f3943c.b(bVar);
                this.f3943c.c(bVar.f3950b, bVar.f3952d);
            } else if (i3 == 2) {
                this.f3943c.b(bVar);
                this.f3943c.a(bVar.f3950b, bVar.f3952d);
            } else if (i3 == 4) {
                this.f3943c.b(bVar);
                this.f3943c.a(bVar.f3950b, bVar.f3952d, bVar.f3951c);
            } else if (i3 == 8) {
                this.f3943c.b(bVar);
                this.f3943c.d(bVar.f3950b, bVar.f3952d);
            }
            Runnable runnable = this.f3944d;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f3941a);
        this.f3947g = 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 738
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.b():void");
    }

    a(AbstractC0057a aVar) {
        this(aVar, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        return a(i2, 0);
    }

    private void a(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    private void c(b bVar) {
        this.f3942b.add(bVar);
        int i2 = bVar.f3949a;
        if (i2 == 1) {
            this.f3943c.c(bVar.f3950b, bVar.f3952d);
        } else if (i2 == 2) {
            this.f3943c.b(bVar.f3950b, bVar.f3952d);
        } else if (i2 == 4) {
            this.f3943c.a(bVar.f3950b, bVar.f3952d, bVar.f3951c);
        } else if (i2 == 8) {
            this.f3943c.d(bVar.f3950b, bVar.f3952d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(bVar)));
        }
    }

    private boolean d(int i2) {
        int size = this.f3942b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f3942b.get(i3);
            if (bVar.f3949a == 8) {
                if (a(bVar.f3952d, i3 + 1) == i2) {
                    return true;
                }
            } else if (bVar.f3949a == 1) {
                int i4 = bVar.f3950b + bVar.f3952d;
                for (int i5 = bVar.f3950b; i5 < i4; i5++) {
                    if (a(i5, i3 + 1) == i2) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final int c(int i2) {
        int size = this.f3941a.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f3941a.get(i3);
            int i4 = bVar.f3949a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        if (bVar.f3950b == i2) {
                            i2 = bVar.f3952d;
                        } else {
                            if (bVar.f3950b < i2) {
                                i2--;
                            }
                            if (bVar.f3952d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f3950b > i2) {
                    continue;
                } else if (bVar.f3950b + bVar.f3952d > i2) {
                    return -1;
                } else {
                    i2 -= bVar.f3952d;
                }
            } else if (bVar.f3950b <= i2) {
                i2 += bVar.f3952d;
            }
        }
        return i2;
    }

    private void b(b bVar) {
        int i2;
        if (bVar.f3949a == 1 || bVar.f3949a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.f3950b, bVar.f3949a);
        int i3 = bVar.f3950b;
        int i4 = bVar.f3949a;
        if (i4 == 2) {
            i2 = 0;
        } else if (i4 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(bVar)));
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3952d; i6++) {
            int b3 = b(bVar.f3950b + (i2 * i6), bVar.f3949a);
            int i7 = bVar.f3949a;
            if (i7 == 2 ? b3 != b2 : !(i7 == 4 && b3 == b2 + 1)) {
                b a2 = a(bVar.f3949a, b2, i5, bVar.f3951c);
                a(a2, i3);
                a(a2);
                if (bVar.f3949a == 4) {
                    i3 += i5;
                }
                b2 = b3;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = bVar.f3951c;
        a(bVar);
        if (i5 > 0) {
            b a3 = a(bVar.f3949a, b2, i5, obj);
            a(a3, i3);
            a(a3);
        }
    }

    @Override // androidx.recyclerview.widget.w.a
    public final void a(b bVar) {
        if (!this.f3945e) {
            bVar.f3951c = null;
            this.f3948h.release(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if ((i2 & this.f3947g) != 0) {
            return true;
        }
        return false;
    }

    private a(AbstractC0057a aVar, byte b2) {
        this.f3948h = new f.b(30);
        this.f3941a = new ArrayList<>();
        this.f3942b = new ArrayList<>();
        this.f3947g = 0;
        this.f3943c = aVar;
        this.f3945e = false;
        this.f3946f = new w(this);
    }

    private void a(b bVar, int i2) {
        this.f3943c.a(bVar);
        int i3 = bVar.f3949a;
        if (i3 == 2) {
            this.f3943c.a(i2, bVar.f3952d);
        } else if (i3 == 4) {
            this.f3943c.a(i2, bVar.f3952d, bVar.f3951c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, int i3) {
        int size = this.f3942b.size();
        while (i3 < size) {
            b bVar = this.f3942b.get(i3);
            if (bVar.f3949a == 8) {
                if (bVar.f3950b == i2) {
                    i2 = bVar.f3952d;
                } else {
                    if (bVar.f3950b < i2) {
                        i2--;
                    }
                    if (bVar.f3952d <= i2) {
                        i2++;
                    }
                }
            } else if (bVar.f3950b > i2) {
                continue;
            } else if (bVar.f3949a == 2) {
                if (i2 < bVar.f3950b + bVar.f3952d) {
                    return -1;
                }
                i2 -= bVar.f3952d;
            } else if (bVar.f3949a == 1) {
                i2 += bVar.f3952d;
            }
            i3++;
        }
        return i2;
    }

    private int b(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f3942b.size() - 1; size >= 0; size--) {
            b bVar = this.f3942b.get(size);
            if (bVar.f3949a == 8) {
                if (bVar.f3950b < bVar.f3952d) {
                    i4 = bVar.f3950b;
                    i5 = bVar.f3952d;
                } else {
                    i4 = bVar.f3952d;
                    i5 = bVar.f3950b;
                }
                if (i2 < i4 || i2 > i5) {
                    if (i2 < bVar.f3950b) {
                        if (i3 == 1) {
                            bVar.f3950b++;
                            bVar.f3952d++;
                        } else if (i3 == 2) {
                            bVar.f3950b--;
                            bVar.f3952d--;
                        }
                    }
                } else if (i4 == bVar.f3950b) {
                    if (i3 == 1) {
                        bVar.f3952d++;
                    } else if (i3 == 2) {
                        bVar.f3952d--;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.f3950b++;
                    } else if (i3 == 2) {
                        bVar.f3950b--;
                    }
                    i2--;
                }
            } else if (bVar.f3950b <= i2) {
                if (bVar.f3949a == 1) {
                    i2 -= bVar.f3952d;
                } else if (bVar.f3949a == 2) {
                    i2 += bVar.f3952d;
                }
            } else if (i3 == 1) {
                bVar.f3950b++;
            } else if (i3 == 2) {
                bVar.f3950b--;
            }
        }
        for (int size2 = this.f3942b.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3942b.get(size2);
            if (bVar2.f3949a == 8) {
                if (bVar2.f3952d == bVar2.f3950b || bVar2.f3952d < 0) {
                    this.f3942b.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f3952d <= 0) {
                this.f3942b.remove(size2);
                a(bVar2);
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.w.a
    public final b a(int i2, int i3, int i4, Object obj) {
        b acquire = this.f3948h.acquire();
        if (acquire == null) {
            return new b(i2, i3, i4, obj);
        }
        acquire.f3949a = i2;
        acquire.f3950b = i3;
        acquire.f3952d = i4;
        acquire.f3951c = obj;
        return acquire;
    }
}
