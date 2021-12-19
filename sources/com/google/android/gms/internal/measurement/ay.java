package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.gm;
import java.util.Collections;
import java.util.List;

public final class ay {

    public static final class c extends gm<c, a> {
        static final c zzi;
        private static volatile ig<c> zzj;
        public int zzc;
        public gv<e> zzd = ih.f51015a;
        public String zze = "";
        public long zzf;
        public long zzg;
        public int zzh;

        public static final class a extends gm.a<c, a> {
            static {
                Covode.recordClassIndex(31647);
            }

            /* Return type fixed from 'java.util.List<com.google.android.gms.internal.measurement.ay$e>' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final c a() {
                return Collections.unmodifiableList(((c) this.f50937a).zzd);
            }

            private a() {
                super(c.zzi);
            }

            public final String d() {
                return ((c) this.f50937a).zze;
            }

            public final long f() {
                return ((c) this.f50937a).zzf;
            }

            public final long g() {
                return ((c) this.f50937a).zzg;
            }

            public final int b() {
                return ((c) this.f50937a).a();
            }

            public final boolean e() {
                return ((c) this.f50937a).b();
            }

            public final a c() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((c) this.f50937a).zzd = ih.f51015a;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final e a(int i2) {
                return ((c) this.f50937a).zzd.get(i2);
            }

            public final a b(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, i2);
                return this;
            }

            public final a b(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c cVar = (c) this.f50937a;
                cVar.zzc |= 4;
                cVar.zzg = j2;
                return this;
            }

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c cVar = (c) this.f50937a;
                cVar.zzc |= 2;
                cVar.zzf = j2;
                return this;
            }

            public final a a(e.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, (e) aVar.w());
                return this;
            }

            public final a a(e eVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, eVar);
                return this;
            }

            public final a a(Iterable<? extends e> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, iterable);
                return this;
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c cVar = (c) this.f50937a;
                str.getClass();
                cVar.zzc |= 1;
                cVar.zze = str;
                return this;
            }

            public final a a(int i2, e.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, i2, (e) aVar.w());
                return this;
            }

            public final a a(int i2, e eVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                c.a((c) this.f50937a, i2, eVar);
                return this;
            }
        }

        public final int a() {
            return this.zzd.size();
        }

        private c() {
        }

        public static a c() {
            return (a) zzi.j();
        }

        private final void d() {
            gv<e> gvVar = this.zzd;
            if (!gvVar.a()) {
                this.zzd = gm.a(gvVar);
            }
        }

        public final boolean b() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31646);
            c cVar = new c();
            zzi = cVar;
            gm.a(c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2207);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    c cVar = new c();
                    MethodCollector.o(2207);
                    return cVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2207);
                    return aVar;
                case 3:
                    Object a2 = a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", e.class, "zze", "zzf", "zzg", "zzh"});
                    MethodCollector.o(2207);
                    return a2;
                case 4:
                    c cVar2 = zzi;
                    MethodCollector.o(2207);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<c> igVar = zzj;
                    if (igVar == null) {
                        synchronized (c.class) {
                            try {
                                igVar = zzj;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzi);
                                    zzj = igVar;
                                }
                            } finally {
                                MethodCollector.o(2207);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2207);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2207);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2207);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(c cVar, int i2) {
            cVar.d();
            cVar.zzd.remove(i2);
        }

        static /* synthetic */ void a(c cVar, e eVar) {
            eVar.getClass();
            cVar.d();
            cVar.zzd.add(eVar);
        }

        static /* synthetic */ void a(c cVar, Iterable iterable) {
            cVar.d();
            ev.a(iterable, cVar.zzd);
        }

        static /* synthetic */ void a(c cVar, int i2, e eVar) {
            eVar.getClass();
            cVar.d();
            cVar.zzd.set(i2, eVar);
        }
    }

    public static final class h extends gm<h, a> {
        static final h zzf;
        private static volatile ig<h> zzg;
        private int zzc;
        private int zzd = 1;
        private gv<d> zze = ih.f51015a;

        public enum b implements go {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c  reason: collision with root package name */
            private static final gr<b> f50678c = new az();
            private final int zzd;

            public static gq zzb() {
                return ba.f50680a;
            }

            @Override // com.google.android.gms.internal.measurement.go
            public final int zza() {
                return this.zzd;
            }

            static {
                Covode.recordClassIndex(31658);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzd);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static b zza(int i2) {
                if (i2 == 1) {
                    return RADS;
                }
                if (i2 != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            private b(int i2) {
                this.zzd = i2;
            }
        }

        public static final class a extends gm.a<h, a> {
            static {
                Covode.recordClassIndex(31657);
            }

            private a() {
                super(h.zzf);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(d.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                h.a((h) this.f50937a, (d) aVar.w());
                return this;
            }
        }

        private h() {
        }

        public static a a() {
            return (a) zzf.j();
        }

        static {
            Covode.recordClassIndex(31656);
            h hVar = new h();
            zzf = hVar;
            gm.a(h.class, hVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(1691);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    h hVar = new h();
                    MethodCollector.o(1691);
                    return hVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(1691);
                    return aVar;
                case 3:
                    Object a2 = a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", b.zzb(), "zze", d.class});
                    MethodCollector.o(1691);
                    return a2;
                case 4:
                    h hVar2 = zzf;
                    MethodCollector.o(1691);
                    return hVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<h> igVar = zzg;
                    if (igVar == null) {
                        synchronized (h.class) {
                            try {
                                igVar = zzg;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzf);
                                    zzg = igVar;
                                }
                            } finally {
                                MethodCollector.o(1691);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(1691);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(1691);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(1691);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(h hVar, d dVar) {
            dVar.getClass();
            gv<d> gvVar = hVar.zze;
            if (!gvVar.a()) {
                hVar.zze = gm.a(gvVar);
            }
            hVar.zze.add(dVar);
        }
    }

    static {
        Covode.recordClassIndex(31641);
    }

    public static final class a extends gm<a, C1217a> {
        static final a zzh;
        private static volatile ig<a> zzi;
        public int zzc;
        public int zzd;
        i zze;
        public i zzf;
        public boolean zzg;

        private a() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.ay$a$a  reason: collision with other inner class name */
        public static final class C1217a extends gm.a<a, C1217a> {
            static {
                Covode.recordClassIndex(31643);
            }

            private C1217a() {
                super(a.zzh);
            }

            /* synthetic */ C1217a(byte b2) {
                this();
            }

            public final C1217a a(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a aVar = (a) this.f50937a;
                aVar.zzc |= 1;
                aVar.zzd = i2;
                return this;
            }

            public final C1217a a(i.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a aVar2 = (a) this.f50937a;
                i iVar = (i) aVar.w();
                iVar.getClass();
                aVar2.zze = iVar;
                aVar2.zzc |= 2;
                return this;
            }

            public final C1217a a(i iVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a aVar = (a) this.f50937a;
                iVar.getClass();
                aVar.zzf = iVar;
                aVar.zzc |= 4;
                return this;
            }

            public final C1217a a(boolean z) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                a aVar = (a) this.f50937a;
                aVar.zzc |= 8;
                aVar.zzg = z;
                return this;
            }
        }

        public final i a() {
            i iVar = this.zze;
            if (iVar == null) {
                return i.zzg;
            }
            return iVar;
        }

        public static C1217a b() {
            return (C1217a) zzh.j();
        }

        static {
            Covode.recordClassIndex(31642);
            a aVar = new a();
            zzh = aVar;
            gm.a(a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(4419);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    a aVar = new a();
                    MethodCollector.o(4419);
                    return aVar;
                case 2:
                    C1217a aVar2 = new C1217a((byte) 0);
                    MethodCollector.o(4419);
                    return aVar2;
                case 3:
                    Object a2 = a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.o(4419);
                    return a2;
                case 4:
                    a aVar3 = zzh;
                    MethodCollector.o(4419);
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
                                MethodCollector.o(4419);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(4419);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(4419);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(4419);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class b extends gm<b, a> {
        static final b zzf;
        private static volatile ig<b> zzg;
        int zzc;
        public int zzd;
        public long zze;

        private b() {
        }

        public static final class a extends gm.a<b, a> {
            static {
                Covode.recordClassIndex(31645);
            }

            private a() {
                super(b.zzf);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                b bVar = (b) this.f50937a;
                bVar.zzc |= 1;
                bVar.zzd = i2;
                return this;
            }

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                b bVar = (b) this.f50937a;
                bVar.zzc |= 2;
                bVar.zze = j2;
                return this;
            }
        }

        public static a c() {
            return (a) zzf.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean b() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31644);
            b bVar = new b();
            zzf = bVar;
            gm.a(b.class, bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2188);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    b bVar = new b();
                    MethodCollector.o(2188);
                    return bVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2188);
                    return aVar;
                case 3:
                    Object a2 = a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.o(2188);
                    return a2;
                case 4:
                    b bVar2 = zzf;
                    MethodCollector.o(2188);
                    return bVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<b> igVar = zzg;
                    if (igVar == null) {
                        synchronized (b.class) {
                            try {
                                igVar = zzg;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzf);
                                    zzg = igVar;
                                }
                            } finally {
                                MethodCollector.o(2188);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2188);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2188);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2188);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class g extends gm<g, a> {
        static final g zzaw;
        private static volatile ig<g> zzax;
        public int zzaa;
        public String zzab = "";
        public String zzac = "";
        public boolean zzad;
        public gv<a> zzae = ih.f51015a;
        public String zzaf = "";
        public int zzag;
        private int zzah;
        private int zzai;
        public String zzaj = "";
        public long zzak;
        public long zzal;
        public String zzam = "";
        private String zzan = "";
        public int zzao;
        public String zzap = "";
        h zzaq;
        private gt zzar = gn.f50954a;
        public long zzas;
        long zzat;
        public String zzau = "";
        private String zzav = "";
        public int zzc;
        public int zzd;
        public int zze;
        public gv<c> zzf = ih.f51015a;
        public gv<k> zzg = ih.f51015a;
        public long zzh;
        public long zzi;
        public long zzj;
        public long zzk;
        public long zzl;
        public String zzm = "";
        public String zzn = "";
        public String zzo = "";
        public String zzp = "";
        public int zzq;
        public String zzr = "";
        public String zzs = "";
        public String zzt = "";
        public long zzu;
        public long zzv;
        public String zzw = "";
        public boolean zzx;
        public String zzy = "";
        public long zzz;

        public static final class a extends gm.a<g, a> {
            static {
                Covode.recordClassIndex(31655);
            }

            public final a a(Iterable<? extends c> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, iterable);
                return this;
            }

            public final a a(k kVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, kVar);
                return this;
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 64;
                gVar.zzm = str;
                return this;
            }

            public final a a(boolean z) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 131072;
                gVar.zzx = z;
                return this;
            }

            private a() {
                super(g.zzaw);
            }

            public final long g() {
                return ((g) this.f50937a).zzi;
            }

            public final long h() {
                return ((g) this.f50937a).zzj;
            }

            public final String k() {
                return ((g) this.f50937a).zzs;
            }

            public final String n() {
                return ((g) this.f50937a).zzac;
            }

            public final String r() {
                return ((g) this.f50937a).zzau;
            }

            public final List<c> b() {
                return Collections.unmodifiableList(((g) this.f50937a).zzf);
            }

            public final int c() {
                return ((g) this.f50937a).zzf.size();
            }

            public final List<k> e() {
                return Collections.unmodifiableList(((g) this.f50937a).zzg);
            }

            public final int f() {
                return ((g) this.f50937a).zzg.size();
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.ay$g$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final g a() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 1;
                gVar.zze = 1;
                return this;
            }

            public final a d() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((g) this.f50937a).zzf = ih.f51015a;
                return this;
            }

            public final a i() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc &= -17;
                gVar.zzk = 0;
                return this;
            }

            public final a j() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc &= -33;
                gVar.zzl = 0;
                return this;
            }

            public final a l() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 32768;
                gVar.zzv = 31000;
                return this;
            }

            public final a m() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc &= -2097153;
                gVar.zzab = g.zzaw.zzab;
                return this;
            }

            public final a o() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((g) this.f50937a).zzae = ih.f51015a;
                return this;
            }

            public final a p() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                throw new NullPointerException("getClass");
            }

            public final a q() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc &= Integer.MAX_VALUE;
                gVar.zzam = g.zzaw.zzam;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final c a(int i2) {
                return ((g) this.f50937a).zzf.get(i2);
            }

            public final a b(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, i2);
                return this;
            }

            public final a c(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 8;
                gVar.zzj = j2;
                return this;
            }

            public final a e(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 1024;
                gVar.zzq = i2;
                return this;
            }

            public final a f(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 1048576;
                gVar.zzaa = i2;
                return this;
            }

            public final a g(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 33554432;
                gVar.zzag = i2;
                return this;
            }

            public final a h(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzd |= 2;
                gVar.zzao = i2;
                return this;
            }

            public final a k(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzd |= 32;
                gVar.zzat = j2;
                return this;
            }

            public final a n(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzd |= 4;
                gVar.zzap = str;
                return this;
            }

            public final a b(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 4;
                gVar.zzi = j2;
                return this;
            }

            public final a c(Iterable<? extends a> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.c((g) this.f50937a, iterable);
                return this;
            }

            public final a d(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.b((g) this.f50937a, i2);
                return this;
            }

            public final a e(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 32;
                gVar.zzl = j2;
                return this;
            }

            public final a f(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 16384;
                gVar.zzu = j2;
                return this;
            }

            public final a g(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 524288;
                gVar.zzz = j2;
                return this;
            }

            public final a h(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 536870912;
                gVar.zzak = j2;
                return this;
            }

            public final a i(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 1073741824;
                gVar.zzal = j2;
                return this;
            }

            public final a j(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzd |= 16;
                gVar.zzas = j2;
                return this;
            }

            public final a k(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 4194304;
                gVar.zzac = str;
                return this;
            }

            public final a l(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 16777216;
                gVar.zzaf = str;
                return this;
            }

            public final a m(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 268435456;
                gVar.zzaj = str;
                return this;
            }

            public final a o(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzd |= 64;
                gVar.zzau = str;
                return this;
            }

            public final a b(Iterable<? extends k> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.b((g) this.f50937a, iterable);
                return this;
            }

            public final a c(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 256;
                gVar.zzo = str;
                return this;
            }

            public final a d(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 16;
                gVar.zzk = j2;
                return this;
            }

            public final a e(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 2048;
                gVar.zzr = str;
                return this;
            }

            public final a f(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 4096;
                gVar.zzs = str;
                return this;
            }

            public final a g(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 8192;
                gVar.zzt = str;
                return this;
            }

            public final a h(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 65536;
                gVar.zzw = str;
                return this;
            }

            public final a i(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 262144;
                gVar.zzy = str;
                return this;
            }

            public final a j(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 2097152;
                gVar.zzab = str;
                return this;
            }

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 2;
                gVar.zzh = j2;
                return this;
            }

            public final a b(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 128;
                gVar.zzn = str;
                return this;
            }

            public final k c(int i2) {
                return ((g) this.f50937a).zzg.get(i2);
            }

            public final a d(Iterable<? extends Integer> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.d((g) this.f50937a, iterable);
                return this;
            }

            public final a a(c.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, (c) aVar.w());
                return this;
            }

            public final a b(boolean z) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                gVar.zzc |= 8388608;
                gVar.zzad = z;
                return this;
            }

            public final a d(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                str.getClass();
                gVar.zzc |= 512;
                gVar.zzp = str;
                return this;
            }

            public final a a(h.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g gVar = (g) this.f50937a;
                h hVar = (h) aVar.w();
                hVar.getClass();
                gVar.zzaq = hVar;
                gVar.zzd |= 8;
                return this;
            }

            public final a a(k.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, (k) aVar.w());
                return this;
            }

            public final a a(int i2, c.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, i2, (c) aVar.w());
                return this;
            }

            public final a a(int i2, k kVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                g.a((g) this.f50937a, i2, kVar);
                return this;
            }
        }

        public static a c() {
            return (a) zzaw.j();
        }

        private final void d() {
            gv<c> gvVar = this.zzf;
            if (!gvVar.a()) {
                this.zzf = gm.a(gvVar);
            }
        }

        private final void e() {
            gv<k> gvVar = this.zzg;
            if (!gvVar.a()) {
                this.zzg = gm.a(gvVar);
            }
        }

        static {
            Covode.recordClassIndex(31654);
            g gVar = new g();
            zzaw = gVar;
            gm.a(g.class, gVar);
        }

        private g() {
        }

        public final boolean b() {
            if ((this.zzd & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean a() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(4140);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    g gVar = new g();
                    MethodCollector.o(4140);
                    return gVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(4140);
                    return aVar;
                case 3:
                    Object a2 = a(zzaw, "\u0001,\u0000\u0002\u00014,\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'", new Object[]{"zzc", "zzd", "zze", "zzf", c.class, "zzg", k.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", a.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav"});
                    MethodCollector.o(4140);
                    return a2;
                case 4:
                    g gVar2 = zzaw;
                    MethodCollector.o(4140);
                    return gVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<g> igVar = zzax;
                    if (igVar == null) {
                        synchronized (g.class) {
                            try {
                                igVar = zzax;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzaw);
                                    zzax = igVar;
                                }
                            } finally {
                                MethodCollector.o(4140);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(4140);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(4140);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(4140);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(g gVar, int i2) {
            gVar.d();
            gVar.zzf.remove(i2);
        }

        static /* synthetic */ void b(g gVar, int i2) {
            gVar.e();
            gVar.zzg.remove(i2);
        }

        static /* synthetic */ void b(g gVar, Iterable iterable) {
            gVar.e();
            ev.a(iterable, gVar.zzg);
        }

        static /* synthetic */ void c(g gVar, Iterable iterable) {
            gv<a> gvVar = gVar.zzae;
            if (!gvVar.a()) {
                gVar.zzae = gm.a(gvVar);
            }
            ev.a(iterable, gVar.zzae);
        }

        static /* synthetic */ void d(g gVar, Iterable iterable) {
            int i2;
            gt gtVar = gVar.zzar;
            if (!gtVar.a()) {
                int size = gtVar.size();
                if (size == 0) {
                    i2 = 10;
                } else {
                    i2 = size << 1;
                }
                gVar.zzar = gtVar.b(i2);
            }
            ev.a(iterable, gVar.zzar);
        }

        static /* synthetic */ void a(g gVar, c cVar) {
            cVar.getClass();
            gVar.d();
            gVar.zzf.add(cVar);
        }

        static /* synthetic */ void a(g gVar, k kVar) {
            kVar.getClass();
            gVar.e();
            gVar.zzg.add(kVar);
        }

        static /* synthetic */ void a(g gVar, Iterable iterable) {
            gVar.d();
            ev.a(iterable, gVar.zzf);
        }

        static /* synthetic */ void a(g gVar, int i2, c cVar) {
            cVar.getClass();
            gVar.d();
            gVar.zzf.set(i2, cVar);
        }

        static /* synthetic */ void a(g gVar, int i2, k kVar) {
            kVar.getClass();
            gVar.e();
            gVar.zzg.set(i2, kVar);
        }
    }

    public static final class d extends gm<d, a> {
        static final d zzf;
        private static volatile ig<d> zzg;
        int zzc;
        String zzd = "";
        long zze;

        public static final class a extends gm.a<d, a> {
            static {
                Covode.recordClassIndex(31649);
            }

            private a() {
                super(d.zzf);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                d dVar = (d) this.f50937a;
                dVar.zzc |= 2;
                dVar.zze = j2;
                return this;
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                d dVar = (d) this.f50937a;
                str.getClass();
                dVar.zzc |= 1;
                dVar.zzd = str;
                return this;
            }
        }

        private d() {
        }

        public static a a() {
            return (a) zzf.j();
        }

        static {
            Covode.recordClassIndex(31648);
            d dVar = new d();
            zzf = dVar;
            gm.a(d.class, dVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2169);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    d dVar = new d();
                    MethodCollector.o(2169);
                    return dVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2169);
                    return aVar;
                case 3:
                    Object a2 = a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.o(2169);
                    return a2;
                case 4:
                    d dVar2 = zzf;
                    MethodCollector.o(2169);
                    return dVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<d> igVar = zzg;
                    if (igVar == null) {
                        synchronized (d.class) {
                            try {
                                igVar = zzg;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzf);
                                    zzg = igVar;
                                }
                            } finally {
                                MethodCollector.o(2169);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2169);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2169);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2169);
                    throw unsupportedOperationException;
            }
        }
    }

    public static final class e extends gm<e, a> {
        static final e zzj;
        private static volatile ig<e> zzk;
        public int zzc;
        public String zzd = "";
        public String zze = "";
        public long zzf;
        public float zzg;
        public double zzh;
        public gv<e> zzi = ih.f51015a;

        public static final class a extends gm.a<e, a> {
            static {
                Covode.recordClassIndex(31651);
            }

            private a() {
                super(e.zzj);
            }

            public final int d() {
                return ((e) this.f50937a).d();
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.ay$e$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final e a() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                eVar.zzc &= -3;
                eVar.zze = e.zzj.zze;
                return this;
            }

            public final a b() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                eVar.zzc &= -5;
                eVar.zzf = 0;
                return this;
            }

            public final a c() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                eVar.zzc &= -17;
                eVar.zzh = 0.0d;
                return this;
            }

            public final a e() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((e) this.f50937a).zzi = ih.f51015a;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(double d2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                eVar.zzc |= 16;
                eVar.zzh = d2;
                return this;
            }

            public final a b(String str) {
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

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                eVar.zzc |= 4;
                eVar.zzf = j2;
                return this;
            }

            public final a a(a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e.a((e) this.f50937a, (e) aVar.w());
                return this;
            }

            public final a a(Iterable<? extends e> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e.a((e) this.f50937a, iterable);
                return this;
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                e eVar = (e) this.f50937a;
                str.getClass();
                eVar.zzc |= 1;
                eVar.zzd = str;
                return this;
            }
        }

        public final int d() {
            return this.zzi.size();
        }

        private e() {
        }

        public static a e() {
            return (a) zzj.j();
        }

        private final void f() {
            gv<e> gvVar = this.zzi;
            if (!gvVar.a()) {
                this.zzi = gm.a(gvVar);
            }
        }

        public final boolean b() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if ((this.zzc & 16) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31650);
            e eVar = new e();
            zzj = eVar;
            gm.a(e.class, eVar);
        }

        public final boolean a() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2243);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    e eVar = new e();
                    MethodCollector.o(2243);
                    return eVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2243);
                    return aVar;
                case 3:
                    Object a2 = a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", e.class});
                    MethodCollector.o(2243);
                    return a2;
                case 4:
                    e eVar2 = zzj;
                    MethodCollector.o(2243);
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
                                MethodCollector.o(2243);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2243);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2243);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2243);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(e eVar, e eVar2) {
            eVar2.getClass();
            eVar.f();
            eVar.zzi.add(eVar2);
        }

        static /* synthetic */ void a(e eVar, Iterable iterable) {
            eVar.f();
            ev.a(iterable, eVar.zzi);
        }
    }

    public static final class f extends gm<f, a> {
        static final f zzd;
        private static volatile ig<f> zze;
        public gv<g> zzc = ih.f51015a;

        public static final class a extends gm.a<f, a> {
            static {
                Covode.recordClassIndex(31653);
            }

            private a() {
                super(f.zzd);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.ay$g' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final f a() {
                return ((f) this.f50937a).zzc.get(0);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(g.a aVar) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                f.a((f) this.f50937a, (g) aVar.w());
                return this;
            }
        }

        private f() {
        }

        public static a a() {
            return (a) zzd.j();
        }

        static {
            Covode.recordClassIndex(31652);
            f fVar = new f();
            zzd = fVar;
            gm.a(f.class, fVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2247);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    f fVar = new f();
                    MethodCollector.o(2247);
                    return fVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2247);
                    return aVar;
                case 3:
                    Object a2 = a(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", g.class});
                    MethodCollector.o(2247);
                    return a2;
                case 4:
                    f fVar2 = zzd;
                    MethodCollector.o(2247);
                    return fVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<f> igVar = zze;
                    if (igVar == null) {
                        synchronized (f.class) {
                            try {
                                igVar = zze;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzd);
                                    zze = igVar;
                                }
                            } finally {
                                MethodCollector.o(2247);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2247);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2247);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2247);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(f fVar, g gVar) {
            gVar.getClass();
            gv<g> gvVar = fVar.zzc;
            if (!gvVar.a()) {
                fVar.zzc = gm.a(gvVar);
            }
            fVar.zzc.add(gVar);
        }
    }

    public static final class i extends gm<i, a> {
        public static final i zzg;
        private static volatile ig<i> zzh;
        public gs zzc = hg.f50977a;
        public gs zzd = hg.f50977a;
        public gv<b> zze = ih.f51015a;
        public gv<j> zzf = ih.f51015a;

        public static final class a extends gm.a<i, a> {
            static {
                Covode.recordClassIndex(31660);
            }

            private a() {
                super(i.zzg);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.ay$i$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final i a() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((i) this.f50937a).zzc = hg.f50977a;
                return this;
            }

            public final a b() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                ((i) this.f50937a).zzd = hg.f50977a;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a c(Iterable<? extends b> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.c((i) this.f50937a, iterable);
                return this;
            }

            public final a d(Iterable<? extends j> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.d((i) this.f50937a, iterable);
                return this;
            }

            public final a a(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.a((i) this.f50937a, i2);
                return this;
            }

            public final a b(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.b((i) this.f50937a, i2);
                return this;
            }

            public final a a(Iterable<? extends Long> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.a((i) this.f50937a, iterable);
                return this;
            }

            public final a b(Iterable<? extends Long> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                i.b((i) this.f50937a, iterable);
                return this;
            }
        }

        public final int a() {
            return this.zzc.size();
        }

        public final int b() {
            return this.zze.size();
        }

        public final int c() {
            return this.zzf.size();
        }

        public static a d() {
            return (a) zzg.j();
        }

        private final void e() {
            gv<b> gvVar = this.zze;
            if (!gvVar.a()) {
                this.zze = gm.a(gvVar);
            }
        }

        private final void f() {
            gv<j> gvVar = this.zzf;
            if (!gvVar.a()) {
                this.zzf = gm.a(gvVar);
            }
        }

        static {
            Covode.recordClassIndex(31659);
            i iVar = new i();
            zzg = iVar;
            gm.a(i.class, iVar);
        }

        private i() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2099);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    i iVar = new i();
                    MethodCollector.o(2099);
                    return iVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2099);
                    return aVar;
                case 3:
                    Object a2 = a(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", b.class, "zzf", j.class});
                    MethodCollector.o(2099);
                    return a2;
                case 4:
                    i iVar2 = zzg;
                    MethodCollector.o(2099);
                    return iVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<i> igVar = zzh;
                    if (igVar == null) {
                        synchronized (i.class) {
                            try {
                                igVar = zzh;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzg);
                                    zzh = igVar;
                                }
                            } finally {
                                MethodCollector.o(2099);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2099);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2099);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2099);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(i iVar, int i2) {
            iVar.e();
            iVar.zze.remove(i2);
        }

        static /* synthetic */ void b(i iVar, int i2) {
            iVar.f();
            iVar.zzf.remove(i2);
        }

        static /* synthetic */ void c(i iVar, Iterable iterable) {
            iVar.e();
            ev.a(iterable, iVar.zze);
        }

        static /* synthetic */ void a(i iVar, Iterable iterable) {
            gs gsVar = iVar.zzc;
            if (!gsVar.a()) {
                iVar.zzc = gm.a(gsVar);
            }
            ev.a(iterable, iVar.zzc);
        }

        static /* synthetic */ void b(i iVar, Iterable iterable) {
            gs gsVar = iVar.zzd;
            if (!gsVar.a()) {
                iVar.zzd = gm.a(gsVar);
            }
            ev.a(iterable, iVar.zzd);
        }

        static /* synthetic */ void d(i iVar, Iterable iterable) {
            iVar.f();
            ev.a(iterable, iVar.zzf);
        }
    }

    public static final class j extends gm<j, a> {
        static final j zzf;
        private static volatile ig<j> zzg;
        int zzc;
        public int zzd;
        public gs zze = hg.f50977a;

        public static final class a extends gm.a<j, a> {
            static {
                Covode.recordClassIndex(31662);
            }

            private a() {
                super(j.zzf);
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(int i2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                j jVar = (j) this.f50937a;
                jVar.zzc |= 1;
                jVar.zzd = i2;
                return this;
            }

            public final a a(Iterable<? extends Long> iterable) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                j.a((j) this.f50937a, iterable);
                return this;
            }
        }

        private j() {
        }

        public final int b() {
            return this.zze.size();
        }

        public static a c() {
            return (a) zzf.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31661);
            j jVar = new j();
            zzf = jVar;
            gm.a(j.class, jVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(3231);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    j jVar = new j();
                    MethodCollector.o(3231);
                    return jVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(3231);
                    return aVar;
                case 3:
                    Object a2 = a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.o(3231);
                    return a2;
                case 4:
                    j jVar2 = zzf;
                    MethodCollector.o(3231);
                    return jVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<j> igVar = zzg;
                    if (igVar == null) {
                        synchronized (j.class) {
                            try {
                                igVar = zzg;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzf);
                                    zzg = igVar;
                                }
                            } finally {
                                MethodCollector.o(3231);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(3231);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(3231);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(3231);
                    throw unsupportedOperationException;
            }
        }

        static /* synthetic */ void a(j jVar, Iterable iterable) {
            gs gsVar = jVar.zze;
            if (!gsVar.a()) {
                jVar.zze = gm.a(gsVar);
            }
            ev.a(iterable, jVar.zze);
        }
    }

    public static final class k extends gm<k, a> {
        static final k zzj;
        private static volatile ig<k> zzk;
        public int zzc;
        public long zzd;
        public String zze = "";
        public String zzf = "";
        public long zzg;
        private float zzh;
        public double zzi;

        public static final class a extends gm.a<k, a> {
            static {
                Covode.recordClassIndex(31664);
            }

            private a() {
                super(k.zzj);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.ay$k$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.gm.a
            public final k a() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc &= -5;
                kVar.zzf = k.zzj.zzf;
                return this;
            }

            public final a b() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc &= -9;
                kVar.zzg = 0;
                return this;
            }

            public final a c() {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc &= -33;
                kVar.zzi = 0.0d;
                return this;
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a a(double d2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc |= 32;
                kVar.zzi = d2;
                return this;
            }

            public final a b(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc |= 8;
                kVar.zzg = j2;
                return this;
            }

            public final a a(long j2) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                kVar.zzc |= 1;
                kVar.zzd = j2;
                return this;
            }

            public final a b(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                str.getClass();
                kVar.zzc |= 4;
                kVar.zzf = str;
                return this;
            }

            public final a a(String str) {
                if (this.f50938b) {
                    t();
                    this.f50938b = false;
                }
                k kVar = (k) this.f50937a;
                str.getClass();
                kVar.zzc |= 2;
                kVar.zze = str;
                return this;
            }
        }

        private k() {
        }

        public static a d() {
            return (a) zzj.j();
        }

        public final boolean a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean b() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if ((this.zzc & 32) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31663);
            k kVar = new k();
            zzj = kVar;
            gm.a(k.class, kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.gm
        public final Object a(int i2) {
            MethodCollector.i(2258);
            switch (ax.f50675a[i2 - 1]) {
                case 1:
                    k kVar = new k();
                    MethodCollector.o(2258);
                    return kVar;
                case 2:
                    a aVar = new a((byte) 0);
                    MethodCollector.o(2258);
                    return aVar;
                case 3:
                    Object a2 = a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    MethodCollector.o(2258);
                    return a2;
                case 4:
                    k kVar2 = zzj;
                    MethodCollector.o(2258);
                    return kVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    ig<k> igVar = zzk;
                    if (igVar == null) {
                        synchronized (k.class) {
                            try {
                                igVar = zzk;
                                if (igVar == null) {
                                    igVar = new gm.c<>(zzj);
                                    zzk = igVar;
                                }
                            } finally {
                                MethodCollector.o(2258);
                            }
                        }
                    }
                    return igVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.o(2258);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.o(2258);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.o(2258);
                    throw unsupportedOperationException;
            }
        }
    }
}
