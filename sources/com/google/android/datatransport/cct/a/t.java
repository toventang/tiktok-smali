package com.google.android.datatransport.cct.a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public abstract class t {

    public static abstract class a {
        static {
            Covode.recordClassIndex(30886);
        }

        public abstract a a(b bVar);

        public abstract a a(c cVar);

        public abstract t a();
    }

    static {
        Covode.recordClassIndex(30885);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class b extends Enum<b> {

        /* renamed from: a  reason: collision with root package name */
        private static final SparseArray<b> f49361a;
        public static final b zza;
        public static final b zzb;
        public static final b zzc;
        public static final b zzd;
        public static final b zze;
        public static final b zzf;
        public static final b zzg;
        public static final b zzh;
        public static final b zzi;
        public static final b zzj;
        public static final b zzk;
        public static final b zzl;
        public static final b zzm;
        public static final b zzn;
        public static final b zzo;
        public static final b zzp;
        public static final b zzq;
        public static final b zzr;
        public static final b zzs;
        public static final b zzt;
        public static final b zzu = new b("COMBINED", 20, 100);
        private final int zzw;

        public final int zza() {
            return this.zzw;
        }

        static {
            Covode.recordClassIndex(30887);
            b bVar = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            zza = bVar;
            b bVar2 = new b("GPRS", 1, 1);
            zzb = bVar2;
            b bVar3 = new b("EDGE", 2, 2);
            zzc = bVar3;
            b bVar4 = new b("UMTS", 3, 3);
            zzd = bVar4;
            b bVar5 = new b("CDMA", 4, 4);
            zze = bVar5;
            b bVar6 = new b("EVDO_0", 5, 5);
            zzf = bVar6;
            b bVar7 = new b("EVDO_A", 6, 6);
            zzg = bVar7;
            b bVar8 = new b("RTT", 7, 7);
            zzh = bVar8;
            b bVar9 = new b("HSDPA", 8, 8);
            zzi = bVar9;
            b bVar10 = new b("HSUPA", 9, 9);
            zzj = bVar10;
            b bVar11 = new b("HSPA", 10, 10);
            zzk = bVar11;
            b bVar12 = new b("IDEN", 11, 11);
            zzl = bVar12;
            b bVar13 = new b("EVDO_B", 12, 12);
            zzm = bVar13;
            b bVar14 = new b("LTE", 13, 13);
            zzn = bVar14;
            b bVar15 = new b("EHRPD", 14, 14);
            zzo = bVar15;
            b bVar16 = new b("HSPAP", 15, 15);
            zzp = bVar16;
            b bVar17 = new b("GSM", 16, 16);
            zzq = bVar17;
            b bVar18 = new b("TD_SCDMA", 17, 17);
            zzr = bVar18;
            b bVar19 = new b("IWLAN", 18, 18);
            zzs = bVar19;
            b bVar20 = new b("LTE_CA", 19, 19);
            zzt = bVar20;
            SparseArray<b> sparseArray = new SparseArray<>();
            f49361a = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        public static b zza(int i2) {
            return f49361a.get(i2);
        }

        private b(String str, int i2, int i3) {
            this.zzw = i3;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class c extends Enum<c> {

        /* renamed from: a  reason: collision with root package name */
        private static final SparseArray<c> f49362a;
        public static final c zza;
        public static final c zzb;
        public static final c zzc;
        public static final c zzd;
        public static final c zze;
        public static final c zzf;
        public static final c zzg;
        public static final c zzh;
        public static final c zzi;
        public static final c zzj;
        public static final c zzk;
        public static final c zzl;
        public static final c zzm;
        public static final c zzn;
        public static final c zzo;
        public static final c zzp;
        public static final c zzq;
        public static final c zzr;
        public static final c zzs;
        private final int zzu;

        public final int zza() {
            return this.zzu;
        }

        static {
            Covode.recordClassIndex(30888);
            c cVar = new c("MOBILE", 0, 0);
            zza = cVar;
            c cVar2 = new c("WIFI", 1, 1);
            zzb = cVar2;
            c cVar3 = new c("MOBILE_MMS", 2, 2);
            zzc = cVar3;
            c cVar4 = new c("MOBILE_SUPL", 3, 3);
            zzd = cVar4;
            c cVar5 = new c("MOBILE_DUN", 4, 4);
            zze = cVar5;
            c cVar6 = new c("MOBILE_HIPRI", 5, 5);
            zzf = cVar6;
            c cVar7 = new c("WIMAX", 6, 6);
            zzg = cVar7;
            c cVar8 = new c("BLUETOOTH", 7, 7);
            zzh = cVar8;
            c cVar9 = new c("DUMMY", 8, 8);
            zzi = cVar9;
            c cVar10 = new c("ETHERNET", 9, 9);
            zzj = cVar10;
            c cVar11 = new c("MOBILE_FOTA", 10, 10);
            zzk = cVar11;
            c cVar12 = new c("MOBILE_IMS", 11, 11);
            zzl = cVar12;
            c cVar13 = new c("MOBILE_CBS", 12, 12);
            zzm = cVar13;
            c cVar14 = new c("WIFI_P2P", 13, 13);
            zzn = cVar14;
            c cVar15 = new c("MOBILE_IA", 14, 14);
            zzo = cVar15;
            c cVar16 = new c("MOBILE_EMERGENCY", 15, 15);
            zzp = cVar16;
            c cVar17 = new c("PROXY", 16, 16);
            zzq = cVar17;
            c cVar18 = new c("VPN", 17, 17);
            zzr = cVar18;
            c cVar19 = new c("NONE", 18, -1);
            zzs = cVar19;
            SparseArray<c> sparseArray = new SparseArray<>();
            f49362a = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        public static c zza(int i2) {
            return f49362a.get(i2);
        }

        private c(String str, int i2, int i3) {
            this.zzu = i3;
        }
    }
}
