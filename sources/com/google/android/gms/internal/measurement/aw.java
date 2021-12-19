package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.ap;
import com.google.android.gms.internal.measurement.gm;
import java.util.Collections;
import java.util.List;

public final class aw {
    static {
        Covode.recordClassIndex(31633);
    }

    public static final class a extends gm<a, C1216a> {
        static final a zzh;
        private static volatile ig<a> zzi;
        int zzc;
        public String zzd = "";
        public boolean zze;
        public boolean zzf;
        public int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.aw$a$a  reason: collision with other inner class name */
        public static final class C1216a extends gm.a<a, C1216a> {
            static {
                Covode.recordClassIndex(31635);
            }

            private C1216a() {
                super(a.zzh);
            }

            /* Return type fixed from 'java.lang.String' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final a a() {
                return ((a) this.f50937a).zzd;
            }

            public final boolean b() {
                return ((a) this.f50937a).zze;
            }

            public final boolean c() {
                return ((a) this.f50937a).zzf;
            }

            public final int e() {
                return ((a) this.f50937a).zzg;
            }

            public final boolean d() {
                if ((((a) this.f50937a).zzc & 8) != 0) {
                    return true;
                }
                return false;
            }

            /* synthetic */ C1216a(byte b2) {
                this();
            }

            public final C1216a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a aVar = (a) this.f50937a;
                str.getClass();
                aVar.zzc |= 1;
                aVar.zzd = str;
                return this;
            }
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(31634);
            a aVar = new a();
            zzh = aVar;
            gm.a(a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2237);
            switch (au.f50674a[i2 - 1]) {
                case 1:
                    a aVar = new a();
                    MethodCollector.o(2237);
                    return aVar;
                case 2:
                    C1216a aVar2 = new C1216a((byte) 0);
                    MethodCollector.o(2237);
                    return aVar2;
                case 3:
                    Object a2 = a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.o(2237);
                    return a2;
                case 4:
                    a aVar3 = zzh;
                    MethodCollector.o(2237);
                    return aVar3;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<a> igVar = zzi;
                    if (igVar == null) {
                        synchronized (a.class) {
                            try {
                                igVar = zzi;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzh);
                                    zzi = igVar;
                                }
                            } finally {
                                MethodCollector.o(2237);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2237);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2237);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2237);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class b extends gm<b, a> {
        public static final b zzl;
        private static volatile ig<b> zzm;
        public int zzc;
        public long zzd;
        public String zze = "";
        private int zzf;
        public gv<c> zzg = ih.f51015a;
        gv<a> zzh = ih.f51015a;
        public gv<ap.a> zzi = ih.f51015a;
        private String zzj = "";
        public boolean zzk;

        public static final class a extends gm.a<b, a> {
            static {
                Covode.recordClassIndex(31637);
            }

            private a() {
                super(b.zzl);
            }

            /* Return type fixed from 'int' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final b a() {
                return ((b) this.f50937a).zzh.size();
            }

            public final List<ap.a> b() {
                return Collections.unmodifiableList(((b) this.f50937a).zzi);
            }

            public final a c() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((b) this.f50937a).zzi = ih.f51015a;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(int i2) {
                return ((b) this.f50937a).zzh.get(i2);
            }

            public final a a(int i2, a.C1216a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                b.a((b) this.f50937a, i2, (a) aVar.w());
                return this;
            }
        }

        public static a b() {
            return (a) zzl.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31636);
            b bVar = new b();
            zzl = bVar;
            gm.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2253);
            switch (au.f50674a[i2 - 1]) {
                case 1:
                    b bVar = new b();
                    MethodCollector.o(2253);
                    return bVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2253);
                    return aVar;
                case 3:
                    Object a2 = a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", c.class, "zzh", a.class, "zzi", ap.a.class, "zzj", "zzk"});
                    MethodCollector.o(2253);
                    return a2;
                case 4:
                    b bVar2 = zzl;
                    MethodCollector.o(2253);
                    return bVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<b> igVar = zzm;
                    if (igVar == null) {
                        synchronized (b.class) {
                            try {
                                igVar = zzm;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzl);
                                    zzm = igVar;
                                }
                            } finally {
                                MethodCollector.o(2253);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2253);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2253);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2253);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(b bVar, int i2, a aVar) {
            aVar.getClass();
            gv<a> gvVar = bVar.zzh;
            if (!gvVar.a()) {
                bVar.zzh = gm.a(gvVar);
            }
            bVar.zzh.set(i2, aVar);
        }
    }

    public static final class c extends gm<c, a> {
        static final c zzf;
        private static volatile ig<c> zzg;
        private int zzc;
        public String zzd = "";
        public String zze = "";

        public static final class a extends gm.a<c, a> {
            static {
                Covode.recordClassIndex(31639);
            }

            private a() {
                super(c.zzf);
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }

        private c() {
        }

        static {
            Covode.recordClassIndex(31638);
            c cVar = new c();
            zzf = cVar;
            gm.a(c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2229);
            switch (au.f50674a[i2 - 1]) {
                case 1:
                    c cVar = new c();
                    MethodCollector.o(2229);
                    return cVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2229);
                    return aVar;
                case 3:
                    Object a2 = a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.o(2229);
                    return a2;
                case 4:
                    c cVar2 = zzf;
                    MethodCollector.o(2229);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<c> igVar = zzg;
                    if (igVar == null) {
                        synchronized (c.class) {
                            try {
                                igVar = zzg;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzf);
                                    zzg = igVar;
                                }
                            } finally {
                                MethodCollector.o(2229);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2229);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2229);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2229);
                    throw unsupportedOperationException;
            }
        }
    }
}
