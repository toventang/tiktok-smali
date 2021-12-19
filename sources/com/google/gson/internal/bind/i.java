package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.internal.f;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class i {
    public static final v<String> A;
    public static final v<BigDecimal> B = new v<BigDecimal>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass9 */

        static {
            Covode.recordClassIndex(34016);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ BigDecimal read(com.google.gson.c.a aVar) {
            return a(aVar);
        }

        private static BigDecimal a(com.google.gson.c.a aVar) {
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            try {
                return new BigDecimal(aVar.i());
            } catch (NumberFormatException e2) {
                throw new t(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, BigDecimal bigDecimal) {
            cVar.a(bigDecimal);
        }
    };
    public static final v<BigInteger> C = new v<BigInteger>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass10 */

        static {
            Covode.recordClassIndex(33989);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ BigInteger read(com.google.gson.c.a aVar) {
            return a(aVar);
        }

        private static BigInteger a(com.google.gson.c.a aVar) {
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            try {
                return new BigInteger(aVar.i());
            } catch (NumberFormatException e2) {
                throw new t(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, BigInteger bigInteger) {
            cVar.a(bigInteger);
        }
    };
    public static final w D;
    public static final v<StringBuilder> E;
    public static final w F;
    public static final v<StringBuffer> G;
    public static final w H;
    public static final v<URL> I;
    public static final w J;
    public static final v<URI> K;
    public static final w L;
    public static final v<InetAddress> M;
    public static final w N;
    public static final v<UUID> O;
    public static final w P;
    public static final v<Currency> Q;
    public static final w R;
    public static final w S = new TypeAdapters$26();
    public static final v<Calendar> T;
    public static final w U;
    public static final v<Locale> V;
    public static final w W;
    public static final v<l> X;
    public static final w Y;
    public static final w Z = new TypeAdapters$30();

    /* renamed from: a  reason: collision with root package name */
    public static final v<Class> f54826a;

    /* renamed from: b  reason: collision with root package name */
    public static final w f54827b;

    /* renamed from: c  reason: collision with root package name */
    public static final v<BitSet> f54828c;

    /* renamed from: d  reason: collision with root package name */
    public static final w f54829d;

    /* renamed from: e  reason: collision with root package name */
    public static final v<Boolean> f54830e;

    /* renamed from: f  reason: collision with root package name */
    public static final v<Boolean> f54831f = new v<Boolean>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass24 */

        static {
            Covode.recordClassIndex(34004);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Boolean read(com.google.gson.c.a aVar) {
            if (aVar.f() != b.NULL) {
                return Boolean.valueOf(aVar.i());
            }
            aVar.k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Boolean bool) {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            cVar.b(bool2);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final w f54832g;

    /* renamed from: h  reason: collision with root package name */
    public static final v<Number> f54833h;

    /* renamed from: i  reason: collision with root package name */
    public static final w f54834i;

    /* renamed from: j  reason: collision with root package name */
    public static final v<Number> f54835j;

    /* renamed from: k  reason: collision with root package name */
    public static final w f54836k;

    /* renamed from: l  reason: collision with root package name */
    public static final v<Number> f54837l;

    /* renamed from: m  reason: collision with root package name */
    public static final w f54838m;
    public static final v<AtomicInteger> n;
    public static final w o;
    public static final v<AtomicBoolean> p;
    public static final w q;
    public static final v<AtomicIntegerArray> r;
    public static final w s;
    public static final v<Number> t = new v<Number>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass3 */

        static {
            Covode.recordClassIndex(34010);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
            return a(aVar);
        }

        private static Number a(com.google.gson.c.a aVar) {
            if (aVar.f() == b.NULL) {
                aVar.k();
                return null;
            }
            try {
                return Long.valueOf(aVar.m());
            } catch (NumberFormatException e2) {
                throw new t(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Number number) {
            cVar.a(number);
        }
    };
    public static final v<Number> u = new v<Number>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass4 */

        static {
            Covode.recordClassIndex(34011);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
            if (aVar.f() != b.NULL) {
                return Float.valueOf((float) aVar.l());
            }
            aVar.k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Number number) {
            cVar.a(number);
        }
    };
    public static final v<Number> v = new v<Number>() {
        /* class com.google.gson.internal.bind.i.AnonymousClass5 */

        static {
            Covode.recordClassIndex(34012);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
            if (aVar.f() != b.NULL) {
                return Double.valueOf(aVar.l());
            }
            aVar.k();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Number number) {
            cVar.a(number);
        }
    };
    public static final v<Number> w;
    public static final w x;
    public static final v<Character> y;
    public static final w z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.i$23  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass23 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f54839a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.i.AnonymousClass23.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(33987);
        v<Class> nullSafe = new v<Class>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33988);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Class read(com.google.gson.c.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f54826a = nullSafe;
        f54827b = a(Class.class, nullSafe);
        v<BitSet> nullSafe2 = new v<BitSet>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass12 */

            static {
                Covode.recordClassIndex(33991);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ BitSet read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
                if (r6.n() != 0) goto L_0x003b;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.util.BitSet a(com.google.gson.c.a r6) {
                /*
                // Method dump skipped, instructions count: 107
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.i.AnonymousClass12.a(com.google.gson.c.a):java.util.BitSet");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, BitSet bitSet) {
                BitSet bitSet2 = bitSet;
                cVar.b();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.a(bitSet2.get(i2) ? 1 : 0);
                }
                cVar.c();
            }
        }.nullSafe();
        f54828c = nullSafe2;
        f54829d = a(BitSet.class, nullSafe2);
        AnonymousClass22 r2 = new v<Boolean>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass22 */

            static {
                Covode.recordClassIndex(34002);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Boolean read(com.google.gson.c.a aVar) {
                b f2 = aVar.f();
                if (f2 == b.NULL) {
                    aVar.k();
                    return null;
                } else if (f2 == b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.i()));
                } else {
                    return Boolean.valueOf(aVar.j());
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Boolean bool) {
                cVar.a(bool);
            }
        };
        f54830e = r2;
        f54832g = a(Boolean.TYPE, Boolean.class, r2);
        AnonymousClass25 r22 = new v<Number>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass25 */

            static {
                Covode.recordClassIndex(34005);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static Number a(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.n());
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Number number) {
                cVar.a(number);
            }
        };
        f54833h = r22;
        f54834i = a(Byte.TYPE, Byte.class, r22);
        AnonymousClass26 r23 = new v<Number>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass26 */

            static {
                Covode.recordClassIndex(34006);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static Number a(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.n());
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Number number) {
                cVar.a(number);
            }
        };
        f54835j = r23;
        f54836k = a(Short.TYPE, Short.class, r23);
        AnonymousClass27 r24 = new v<Number>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass27 */

            static {
                Covode.recordClassIndex(34007);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static Number a(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.n());
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Number number) {
                cVar.a(number);
            }
        };
        f54837l = r24;
        f54838m = a(Integer.TYPE, Integer.class, r24);
        v<AtomicInteger> nullSafe3 = new v<AtomicInteger>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass28 */

            static {
                Covode.recordClassIndex(34008);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ AtomicInteger read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static AtomicInteger a(com.google.gson.c.a aVar) {
                try {
                    return new AtomicInteger(aVar.n());
                } catch (NumberFormatException e2) {
                    throw new t(e2);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, AtomicInteger atomicInteger) {
                cVar.a((long) atomicInteger.get());
            }
        }.nullSafe();
        n = nullSafe3;
        o = a(AtomicInteger.class, nullSafe3);
        v<AtomicBoolean> nullSafe4 = new v<AtomicBoolean>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass29 */

            static {
                Covode.recordClassIndex(34009);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ AtomicBoolean read(com.google.gson.c.a aVar) {
                return new AtomicBoolean(aVar.j());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, AtomicBoolean atomicBoolean) {
                cVar.a(atomicBoolean.get());
            }
        }.nullSafe();
        p = nullSafe4;
        q = a(AtomicBoolean.class, nullSafe4);
        v<AtomicIntegerArray> nullSafe5 = new v<AtomicIntegerArray>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33999);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ AtomicIntegerArray read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static AtomicIntegerArray a(com.google.gson.c.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.n()));
                    } catch (NumberFormatException e2) {
                        throw new t(e2);
                    }
                }
                aVar.b();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, AtomicIntegerArray atomicIntegerArray) {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                cVar.b();
                int length = atomicIntegerArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.a((long) atomicIntegerArray2.get(i2));
                }
                cVar.c();
            }
        }.nullSafe();
        r = nullSafe5;
        s = a(AtomicIntegerArray.class, nullSafe5);
        AnonymousClass6 r1 = new v<Number>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass6 */

            static {
                Covode.recordClassIndex(34013);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Number read(com.google.gson.c.a aVar) {
                b f2 = aVar.f();
                int i2 = AnonymousClass23.f54839a[f2.ordinal()];
                if (i2 == 1 || i2 == 3) {
                    return new f(aVar.i());
                }
                if (i2 == 4) {
                    aVar.k();
                    return null;
                }
                throw new t("Expecting number, got: ".concat(String.valueOf(f2)));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Number number) {
                cVar.a(number);
            }
        };
        w = r1;
        x = a(Number.class, r1);
        AnonymousClass7 r25 = new v<Character>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass7 */

            static {
                Covode.recordClassIndex(34014);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Character read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                String i2 = aVar.i();
                if (i2.length() == 1) {
                    return Character.valueOf(i2.charAt(0));
                }
                throw new t("Expecting character, got: ".concat(String.valueOf(i2)));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Character ch) {
                String valueOf;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                cVar.b(valueOf);
            }
        };
        y = r25;
        z = a(Character.TYPE, Character.class, r25);
        AnonymousClass8 r12 = new v<String>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass8 */

            static {
                Covode.recordClassIndex(34015);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ String read(com.google.gson.c.a aVar) {
                b f2 = aVar.f();
                if (f2 == b.NULL) {
                    aVar.k();
                    return null;
                } else if (f2 == b.BOOLEAN) {
                    return Boolean.toString(aVar.j());
                } else {
                    return aVar.i();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, String str) {
                cVar.b(str);
            }
        };
        A = r12;
        D = a(String.class, r12);
        AnonymousClass11 r13 = new v<StringBuilder>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass11 */

            static {
                Covode.recordClassIndex(33990);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ StringBuilder read(com.google.gson.c.a aVar) {
                if (aVar.f() != b.NULL) {
                    return new StringBuilder(aVar.i());
                }
                aVar.k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, StringBuilder sb) {
                String sb2;
                StringBuilder sb3 = sb;
                if (sb3 == null) {
                    sb2 = null;
                } else {
                    sb2 = sb3.toString();
                }
                cVar.b(sb2);
            }
        };
        E = r13;
        F = a(StringBuilder.class, r13);
        AnonymousClass13 r14 = new v<StringBuffer>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass13 */

            static {
                Covode.recordClassIndex(33992);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ StringBuffer read(com.google.gson.c.a aVar) {
                if (aVar.f() != b.NULL) {
                    return new StringBuffer(aVar.i());
                }
                aVar.k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, StringBuffer stringBuffer) {
                String stringBuffer2;
                StringBuffer stringBuffer3 = stringBuffer;
                if (stringBuffer3 == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer3.toString();
                }
                cVar.b(stringBuffer2);
            }
        };
        G = r14;
        H = a(StringBuffer.class, r14);
        AnonymousClass14 r15 = new v<URL>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass14 */

            static {
                Covode.recordClassIndex(33993);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ URL read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                String i2 = aVar.i();
                if ("null".equals(i2)) {
                    return null;
                }
                return new URL(i2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, URL url) {
                String externalForm;
                URL url2 = url;
                if (url2 == null) {
                    externalForm = null;
                } else {
                    externalForm = url2.toExternalForm();
                }
                cVar.b(externalForm);
            }
        };
        I = r15;
        J = a(URL.class, r15);
        AnonymousClass15 r16 = new v<URI>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass15 */

            static {
                Covode.recordClassIndex(33994);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ URI read(com.google.gson.c.a aVar) {
                return a(aVar);
            }

            private static URI a(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    String i2 = aVar.i();
                    if ("null".equals(i2)) {
                        return null;
                    }
                    return new URI(i2);
                } catch (URISyntaxException e2) {
                    throw new m(e2);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, URI uri) {
                String aSCIIString;
                URI uri2 = uri;
                if (uri2 == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri2.toASCIIString();
                }
                cVar.b(aSCIIString);
            }
        };
        K = r16;
        L = a(URI.class, r16);
        AnonymousClass16 r17 = new v<InetAddress>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass16 */

            static {
                Covode.recordClassIndex(33995);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ InetAddress read(com.google.gson.c.a aVar) {
                if (aVar.f() != b.NULL) {
                    return InetAddress.getByName(aVar.i());
                }
                aVar.k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, InetAddress inetAddress) {
                String hostAddress;
                InetAddress inetAddress2 = inetAddress;
                if (inetAddress2 == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress2.getHostAddress();
                }
                cVar.b(hostAddress);
            }
        };
        M = r17;
        N = b(InetAddress.class, r17);
        AnonymousClass17 r18 = new v<UUID>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass17 */

            static {
                Covode.recordClassIndex(33996);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ UUID read(com.google.gson.c.a aVar) {
                if (aVar.f() != b.NULL) {
                    return UUID.fromString(aVar.i());
                }
                aVar.k();
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, UUID uuid) {
                String uuid2;
                UUID uuid3 = uuid;
                if (uuid3 == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid3.toString();
                }
                cVar.b(uuid2);
            }
        };
        O = r18;
        P = a(UUID.class, r18);
        v<Currency> nullSafe6 = new v<Currency>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass18 */

            static {
                Covode.recordClassIndex(33997);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Currency read(com.google.gson.c.a aVar) {
                return Currency.getInstance(aVar.i());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Currency currency) {
                cVar.b(currency.getCurrencyCode());
            }
        }.nullSafe();
        Q = nullSafe6;
        R = a(Currency.class, nullSafe6);
        AnonymousClass19 r3 = new v<Calendar>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass19 */

            static {
                Covode.recordClassIndex(33998);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Calendar read(com.google.gson.c.a aVar) {
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                aVar.c();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (aVar.f() != b.END_OBJECT) {
                    String h2 = aVar.h();
                    int n = aVar.n();
                    if ("year".equals(h2)) {
                        i2 = n;
                    } else if ("month".equals(h2)) {
                        i3 = n;
                    } else if ("dayOfMonth".equals(h2)) {
                        i4 = n;
                    } else if ("hourOfDay".equals(h2)) {
                        i5 = n;
                    } else if ("minute".equals(h2)) {
                        i6 = n;
                    } else if ("second".equals(h2)) {
                        i7 = n;
                    }
                }
                aVar.d();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Calendar calendar) {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    cVar.f();
                    return;
                }
                cVar.d();
                cVar.a("year");
                cVar.a((long) calendar2.get(1));
                cVar.a("month");
                cVar.a((long) calendar2.get(2));
                cVar.a("dayOfMonth");
                cVar.a((long) calendar2.get(5));
                cVar.a("hourOfDay");
                cVar.a((long) calendar2.get(11));
                cVar.a("minute");
                cVar.a((long) calendar2.get(12));
                cVar.a("second");
                cVar.a((long) calendar2.get(13));
                cVar.e();
            }
        };
        T = r3;
        U = new TypeAdapters$34(Calendar.class, GregorianCalendar.class, r3);
        AnonymousClass20 r19 = new v<Locale>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass20 */

            static {
                Covode.recordClassIndex(34000);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.v
            public final /* synthetic */ Locale read(com.google.gson.c.a aVar) {
                String str;
                String str2;
                String str3 = null;
                if (aVar.f() == b.NULL) {
                    aVar.k();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.i(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null) {
                    if (str3 == null) {
                        return new Locale(str);
                    }
                } else if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.v
            public final /* synthetic */ void write(c cVar, Locale locale) {
                String locale2;
                Locale locale3 = locale;
                if (locale3 == null) {
                    locale2 = null;
                } else {
                    locale2 = locale3.toString();
                }
                cVar.b(locale2);
            }
        };
        V = r19;
        W = a(Locale.class, r19);
        AnonymousClass21 r110 = new v<l>() {
            /* class com.google.gson.internal.bind.i.AnonymousClass21 */

            static {
                Covode.recordClassIndex(34001);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public l read(com.google.gson.c.a aVar) {
                switch (AnonymousClass23.f54839a[aVar.f().ordinal()]) {
                    case 1:
                        return new r((Number) new f(aVar.i()));
                    case 2:
                        return new r(Boolean.valueOf(aVar.j()));
                    case 3:
                        return new r(aVar.i());
                    case 4:
                        aVar.k();
                        return n.f54897a;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        com.google.gson.i iVar = new com.google.gson.i();
                        aVar.a();
                        while (aVar.e()) {
                            iVar.a(read(aVar));
                        }
                        aVar.b();
                        return iVar;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        o oVar = new o();
                        aVar.c();
                        while (aVar.e()) {
                            oVar.a(aVar.h(), read(aVar));
                        }
                        aVar.d();
                        return oVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void write(c cVar, l lVar) {
                if (lVar == null || (lVar instanceof n)) {
                    cVar.f();
                } else if (lVar instanceof r) {
                    r l2 = lVar.l();
                    if (l2.f54900a instanceof Number) {
                        cVar.a(l2.b());
                    } else if (l2.f54900a instanceof Boolean) {
                        cVar.a(l2.h());
                    } else {
                        cVar.b(l2.c());
                    }
                } else if (lVar instanceof com.google.gson.i) {
                    cVar.b();
                    Iterator<l> it = lVar.k().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.c();
                } else if (lVar instanceof o) {
                    cVar.d();
                    for (Map.Entry<String, l> entry : lVar.j().f54898a.entrySet()) {
                        cVar.a(entry.getKey());
                        write(cVar, entry.getValue());
                    }
                    cVar.e();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
            }
        };
        X = r110;
        Y = b(l.class, r110);
    }

    static final class a<T extends Enum<T>> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f54840a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f54841b = new HashMap();

        static {
            Covode.recordClassIndex(34017);
        }

        @Override // com.google.gson.v
        public final /* synthetic */ Object read(com.google.gson.c.a aVar) {
            if (aVar.f() != b.NULL) {
                return this.f54840a.get(aVar.i());
            }
            aVar.k();
            return null;
        }

        public a(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    com.google.gson.a.c cVar = (com.google.gson.a.c) cls.getField(name).getAnnotation(com.google.gson.a.c.class);
                    if (cVar != null) {
                        name = cVar.a();
                        for (String str : cVar.b()) {
                            this.f54840a.put(str, t);
                        }
                    }
                    this.f54840a.put(name, t);
                    this.f54841b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Object obj) {
            String str;
            if (obj == null) {
                str = null;
            } else {
                str = this.f54841b.get(obj);
            }
            cVar.b(str);
        }
    }

    public static <TT> w a(com.google.gson.b.a<TT> aVar, v<TT> vVar) {
        return new TypeAdapters$31(aVar, vVar);
    }

    public static <T1> w b(Class<T1> cls, v<T1> vVar) {
        return new TypeAdapters$35(cls, vVar);
    }

    public static <TT> w a(Class<TT> cls, v<TT> vVar) {
        return new TypeAdapters$32(cls, vVar);
    }

    public static <TT> w a(Class<TT> cls, Class<TT> cls2, v<? super TT> vVar) {
        return new TypeAdapters$33(cls, cls2, vVar);
    }
}
