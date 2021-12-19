package com.google.android.datatransport.cct.a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class b extends Enum<b> {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<b> f49306a;
    public static final b zza;
    public static final b zzb;
    public static final b zzc;
    public static final b zzd;
    public static final b zze;
    public static final b zzf;

    static {
        Covode.recordClassIndex(30858);
        b bVar = new b("DEFAULT", 0);
        zza = bVar;
        b bVar2 = new b("UNMETERED_ONLY", 1);
        zzb = bVar2;
        b bVar3 = new b("UNMETERED_OR_DAILY", 2);
        zzc = bVar3;
        b bVar4 = new b("FAST_IF_RADIO_AWAKE", 3);
        zzd = bVar4;
        b bVar5 = new b("NEVER", 4);
        zze = bVar5;
        b bVar6 = new b("UNRECOGNIZED", 5);
        zzf = bVar6;
        SparseArray<b> sparseArray = new SparseArray<>();
        f49306a = sparseArray;
        sparseArray.put(0, bVar);
        sparseArray.put(1, bVar2);
        sparseArray.put(2, bVar3);
        sparseArray.put(3, bVar4);
        sparseArray.put(4, bVar5);
        sparseArray.put(-1, bVar6);
    }

    private b(String str, int i2) {
    }
}
