package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.gm;

public final class ap {

    public static final class d extends gm<d, a> {
        static final d zzi;
        private static volatile ig<d> zzj;
        private int zzc;
        private int zzd;
        public boolean zze;
        public String zzf = "";
        public String zzg = "";
        public String zzh = "";

        public enum b implements go {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            

            /* renamed from: a  reason: collision with root package name */
            private static final gr<b> f50668a = new aq();
            private final int zzg;

            public static gq zzb() {
                return ar.f50672a;
            }

            @Override // com.google.android.gms.internal.measurement.go
            public final int zza() {
                return this.zzg;
            }

            static {
                Covode.recordClassIndex(31621);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzg);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static b zza(int i2) {
                if (i2 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i2 == 1) {
                    return LESS_THAN;
                }
                if (i2 == 2) {
                    return GREATER_THAN;
                }
                if (i2 == 3) {
                    return EQUAL;
                }
                if (i2 != 4) {
                    return null;
                }
                return BETWEEN;
            }

            private b(int i2) {
                this.zzg = i2;
            }
        }

        public static final class a extends gm.a<d, a> {
            static {
                Covode.recordClassIndex(31620);
            }

            private a() {
                super(d.zzi);
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }

        private d() {
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final b b() {
            b zza = b.zza(this.zzd);
            if (zza == null) {
                return b.UNKNOWN_COMPARISON_TYPE;
            }
            return zza;
        }

        public final boolean c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean d() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            if ((this.zzc & 16) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31619);
            d dVar = new d();
            zzi = dVar;
            gm.a(d.class, dVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2301);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    d dVar = new d();
                    MethodCollector.o(2301);
                    return dVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2301);
                    return aVar;
                case 3:
                    Object a2 = a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", b.zzb(), "zze", "zzf", "zzg", "zzh"});
                    MethodCollector.o(2301);
                    return a2;
                case 4:
                    d dVar2 = zzi;
                    MethodCollector.o(2301);
                    return dVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<d> igVar = zzj;
                    if (igVar == null) {
                        synchronized (d.class) {
                            try {
                                igVar = zzj;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzi);
                                    zzj = igVar;
                                }
                            } finally {
                                MethodCollector.o(2301);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2301);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2301);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2301);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class f extends gm<f, b> {
        static final f zzh;
        private static volatile ig<f> zzi;
        public int zzc;
        private int zzd;
        public String zze = "";
        public boolean zzf;
        public gv<String> zzg = ih.f51015a;

        public enum a implements go {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            

            /* renamed from: a  reason: collision with root package name */
            private static final gr<a> f50670a = new at();
            private final int zzi;

            public static gq zzb() {
                return as.f50673a;
            }

            @Override // com.google.android.gms.internal.measurement.go
            public final int zza() {
                return this.zzi;
            }

            static {
                Covode.recordClassIndex(31625);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzi);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static a zza(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        return EXACT;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            private a(int i2) {
                this.zzi = i2;
            }
        }

        public static final class b extends gm.a<f, b> {
            static {
                Covode.recordClassIndex(31626);
            }

            private b() {
                super(f.zzh);
            }

            /* synthetic */ b(byte b2) {
                this();
            }
        }

        public final int d() {
            return this.zzg.size();
        }

        private f() {
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final a b() {
            a zza = a.zza(this.zzd);
            if (zza == null) {
                return a.UNKNOWN_MATCH_TYPE;
            }
            return zza;
        }

        public final boolean c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31624);
            f fVar = new f();
            zzh = fVar;
            gm.a(f.class, fVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2264);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    f fVar = new f();
                    MethodCollector.o(2264);
                    return fVar;
                case 2:
                    b bVar = new b((byte) 0);
                    MethodCollector.o(2264);
                    return bVar;
                case 3:
                    Object a2 = a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzg"});
                    MethodCollector.o(2264);
                    return a2;
                case 4:
                    f fVar2 = zzh;
                    MethodCollector.o(2264);
                    return fVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<f> igVar = zzi;
                    if (igVar == null) {
                        synchronized (f.class) {
                            try {
                                igVar = zzi;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzh);
                                    zzi = igVar;
                                }
                            } finally {
                                MethodCollector.o(2264);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2264);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2264);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2264);
                    throw unsupportedOperationException;
            }
        }
    }

    static {
        Covode.recordClassIndex(31612);
    }

    public static final class a extends gm<a, C1215a> {
        static final a zzi;
        private static volatile ig<a> zzj;
        private int zzc;
        public int zzd;
        public gv<e> zze = ih.f51015a;
        public gv<b> zzf = ih.f51015a;
        private boolean zzg;
        private boolean zzh;

        /* renamed from: com.google.android.gms.internal.measurement.ap$a$a  reason: collision with other inner class name */
        public static final class C1215a extends gm.a<a, C1215a> {
            static {
                Covode.recordClassIndex(31614);
            }

            private C1215a() {
                super(a.zzi);
            }

            /* Return type fixed from 'int' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final a a() {
                return ((a) this.f50937a).zze.size();
            }

            public final int b() {
                return ((a) this.f50937a).zzf.size();
            }

            /* synthetic */ C1215a(byte b2) {
                this();
            }

            public final b b(int i2) {
                return ((a) this.f50937a).zzf.get(i2);
            }

            public final e a(int i2) {
                return ((a) this.f50937a).zze.get(i2);
            }

            public final C1215a a(int i2, b.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a.a((a) this.f50937a, i2, (b) aVar.w());
                return this;
            }

            public final C1215a a(int i2, e.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a.a((a) this.f50937a, i2, (e) aVar.w());
                return this;
            }
        }

        private a() {
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31613);
            a aVar = new a();
            zzi = aVar;
            gm.a(a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(5066);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    a aVar = new a();
                    MethodCollector.o(5066);
                    return aVar;
                case 2:
                    C1215a aVar2 = new C1215a((byte) 0);
                    MethodCollector.o(5066);
                    return aVar2;
                case 3:
                    Object a2 = a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", e.class, "zzf", b.class, "zzg", "zzh"});
                    MethodCollector.o(5066);
                    return a2;
                case 4:
                    a aVar3 = zzi;
                    MethodCollector.o(5066);
                    return aVar3;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<a> igVar = zzj;
                    if (igVar == null) {
                        synchronized (a.class) {
                            try {
                                igVar = zzj;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzi);
                                    zzj = igVar;
                                }
                            } finally {
                                MethodCollector.o(5066);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(5066);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(5066);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(5066);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(a aVar, int i2, b bVar) {
            bVar.getClass();
            gv<b> gvVar = aVar.zzf;
            if (!gvVar.a()) {
                aVar.zzf = gm.a(gvVar);
            }
            aVar.zzf.set(i2, bVar);
        }

        static /* synthetic */ void a(a aVar, int i2, e eVar) {
            eVar.getClass();
            gv<e> gvVar = aVar.zze;
            if (!gvVar.a()) {
                aVar.zze = gm.a(gvVar);
            }
            aVar.zze.set(i2, eVar);
        }
    }

    public static final class b extends gm<b, a> {
        static final b zzl;
        private static volatile ig<b> zzm;
        public int zzc;
        public int zzd;
        public String zze = "";
        public gv<c> zzf = ih.f51015a;
        private boolean zzg;
        private d zzh;
        public boolean zzi;
        public boolean zzj;
        public boolean zzk;

        public static final class a extends gm.a<b, a> {
            static {
                Covode.recordClassIndex(31616);
            }

            private a() {
                super(b.zzl);
            }

            /* Return type fixed from 'java.lang.String' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final b a() {
                return ((b) this.f50937a).zze;
            }

            public final int b() {
                return ((b) this.f50937a).b();
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final c a(int i2) {
                return ((b) this.f50937a).zzf.get(i2);
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                b bVar = (b) this.f50937a;
                str.getClass();
                bVar.zzc |= 2;
                bVar.zze = str;
                return this;
            }

            public final a a(int i2, c cVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                b.a((b) this.f50937a, i2, cVar);
                return this;
            }
        }

        public final int b() {
            return this.zzf.size();
        }

        public final d d() {
            d dVar = this.zzh;
            if (dVar == null) {
                return d.zzi;
            }
            return dVar;
        }

        private b() {
        }

        public static a e() {
            return (a) zzl.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31615);
            b bVar = new b();
            zzl = bVar;
            gm.a(b.class, bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2311);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    b bVar = new b();
                    MethodCollector.o(2311);
                    return bVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2311);
                    return aVar;
                case 3:
                    Object a2 = a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", c.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                    MethodCollector.o(2311);
                    return a2;
                case 4:
                    b bVar2 = zzl;
                    MethodCollector.o(2311);
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
                                MethodCollector.o(2311);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2311);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2311);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2311);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(b bVar, int i2, c cVar) {
            cVar.getClass();
            gv<c> gvVar = bVar.zzf;
            if (!gvVar.a()) {
                bVar.zzf = gm.a(gvVar);
            }
            bVar.zzf.set(i2, cVar);
        }
    }

    public static final class c extends gm<c, a> {
        static final c zzh;
        private static volatile ig<c> zzi;
        public int zzc;
        private f zzd;
        private d zze;
        public boolean zzf;
        public String zzg = "";

        public static final class a extends gm.a<c, a> {
            static {
                Covode.recordClassIndex(31618);
            }

            private a() {
                super(c.zzh);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c cVar = (c) this.f50937a;
                str.getClass();
                cVar.zzc |= 8;
                cVar.zzg = str;
                return this;
            }
        }

        private c() {
        }

        public final f b() {
            f fVar = this.zzd;
            if (fVar == null) {
                return f.zzh;
            }
            return fVar;
        }

        public final d d() {
            d dVar = this.zze;
            if (dVar == null) {
                return d.zzi;
            }
            return dVar;
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31617);
            c cVar = new c();
            zzh = cVar;
            gm.a(c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(5641);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    c cVar = new c();
                    MethodCollector.o(5641);
                    return cVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(5641);
                    return aVar;
                case 3:
                    Object a2 = a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.o(5641);
                    return a2;
                case 4:
                    c cVar2 = zzh;
                    MethodCollector.o(5641);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<c> igVar = zzi;
                    if (igVar == null) {
                        synchronized (c.class) {
                            try {
                                igVar = zzi;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzh);
                                    zzi = igVar;
                                }
                            } finally {
                                MethodCollector.o(5641);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(5641);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(5641);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(5641);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class e extends gm<e, a> {
        static final e zzj;
        private static volatile ig<e> zzk;
        public int zzc;
        public int zzd;
        public String zze = "";
        private c zzf;
        public boolean zzg;
        public boolean zzh;
        public boolean zzi;

        public static final class a extends gm.a<e, a> {
            static {
                Covode.recordClassIndex(31623);
            }

            private a() {
                super(e.zzj);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                str.getClass();
                eVar.zzc |= 2;
                eVar.zze = str;
                return this;
            }
        }

        private e() {
        }

        public final c b() {
            c cVar = this.zzf;
            if (cVar == null) {
                return c.zzh;
            }
            return cVar;
        }

        public static a c() {
            return (a) zzj.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31622);
            e eVar = new e();
            zzj = eVar;
            gm.a(e.class, eVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2276);
            switch (ao.f50667a[i2 - 1]) {
                case 1:
                    e eVar = new e();
                    MethodCollector.o(2276);
                    return eVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2276);
                    return aVar;
                case 3:
                    Object a2 = a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    MethodCollector.o(2276);
                    return a2;
                case 4:
                    e eVar2 = zzj;
                    MethodCollector.o(2276);
                    return eVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<e> igVar = zzk;
                    if (igVar == null) {
                        synchronized (e.class) {
                            try {
                                igVar = zzk;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzj);
                                    zzk = igVar;
                                }
                            } finally {
                                MethodCollector.o(2276);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2276);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2276);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2276);
                    throw unsupportedOperationException;
            }
        }
    }
}
