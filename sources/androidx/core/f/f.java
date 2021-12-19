package androidx.core.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2382a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final e f2383b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final e f2384c = new e(b.f2390a, false);

    /* renamed from: d  reason: collision with root package name */
    public static final e f2385d = new e(b.f2390a, true);

    /* renamed from: e  reason: collision with root package name */
    public static final e f2386e = new e(a.f2388a, false);

    /* renamed from: f  reason: collision with root package name */
    public static final e f2387f = C0033f.f2393a;

    interface c {
        static {
            Covode.recordClassIndex(762);
        }

        int a(CharSequence charSequence, int i2);
    }

    static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f2390a = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(761);
        }

        @Override // androidx.core.f.f.c
        public final int a(CharSequence charSequence, int i2) {
            int i3 = i2 + 0;
            int i4 = 2;
            for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i5));
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    }
                    i4 = 0;
                }
                i4 = 1;
            }
            return i4;
        }
    }

    static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f2392a;

        static {
            Covode.recordClassIndex(764);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.f.f.d
        public final boolean a() {
            return this.f2392a;
        }

        e(c cVar, boolean z) {
            super(cVar);
            this.f2392a = z;
        }
    }

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        static final a f2388a = new a();

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2389b = true;

        private a() {
        }

        static {
            Covode.recordClassIndex(760);
        }

        @Override // androidx.core.f.f.c
        public final int a(CharSequence charSequence, int i2) {
            int i3 = i2 + 0;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                if (directionality == 0) {
                    if (!this.f2389b) {
                        return 1;
                    }
                    z = true;
                } else if (directionality == 1 || directionality == 2) {
                    if (this.f2389b) {
                        return 0;
                    }
                    z = true;
                }
            }
            if (!z) {
                return 2;
            }
            if (this.f2389b) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.f.f$f  reason: collision with other inner class name */
    static class C0033f extends d {

        /* renamed from: a  reason: collision with root package name */
        static final C0033f f2393a = new C0033f();

        C0033f() {
            super(null);
        }

        static {
            Covode.recordClassIndex(765);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.f.f.d
        public final boolean a() {
            if (g.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(759);
    }

    static abstract class d implements e {

        /* renamed from: a  reason: collision with root package name */
        private final c f2391a;

        static {
            Covode.recordClassIndex(763);
        }

        /* access modifiers changed from: protected */
        public abstract boolean a();

        d(c cVar) {
            this.f2391a = cVar;
        }

        @Override // androidx.core.f.e
        public final boolean a(CharSequence charSequence, int i2) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            }
            c cVar = this.f2391a;
            if (cVar == null) {
                return a();
            }
            int a2 = cVar.a(charSequence, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }
}
