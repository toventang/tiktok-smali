package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.ap;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.be;
import com.google.android.gms.internal.measurement.bs;
import com.google.android.gms.internal.measurement.fy;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.gv;
import com.google.android.gms.internal.measurement.hw;
import com.google.android.gms.internal.measurement.kx;
import com.kakao.usermgmt.StringSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class jv extends jp {
    static {
        Covode.recordClassIndex(32352);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: package-private */
    public final void a(ay.k.a aVar, Object obj) {
        r.a(obj);
        aVar.a().b().c();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            q().f51468c.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ay.e.a aVar, Object obj) {
        r.a(obj);
        aVar.a().b().c().e();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            kx.b();
            if (!s().d(null, p.aG) || !(obj instanceof Bundle[])) {
                q().f51468c.a("Ignoring invalid (type) event param value", obj);
            } else {
                aVar.a(a((Bundle[]) obj));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ay.c a(m mVar) {
        ay.c.a b2 = ay.c.c().b(mVar.f52031d);
        Iterator<String> it = mVar.f52032e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            ay.e.a a2 = ay.e.e().a(next);
            a(a2, mVar.f52032e.a(next));
            b2.a(a2);
        }
        return (ay.c) ((gm) b2.w());
    }

    /* access modifiers changed from: package-private */
    public final void a(ay.c.a aVar, String str, Object obj) {
        List a2 = aVar.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a2.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((ay.e) a2.get(i2)).zzd)) {
                break;
            } else {
                i2++;
            }
        }
        ay.e.a a3 = ay.e.e().a(str);
        if (obj instanceof Long) {
            a3.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            a3.b((String) obj);
        } else if (obj instanceof Double) {
            a3.a(((Double) obj).doubleValue());
        } else {
            kx.b();
            if (s().d(null, p.aG) && (obj instanceof Bundle[])) {
                a3.a(a((Bundle[]) obj));
            }
        }
        if (i2 >= 0) {
            aVar.a(i2, a3);
        } else {
            aVar.a(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(ay.f fVar) {
        ay.i iVar;
        if (fVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (ay.g gVar : fVar.zzc) {
            if (gVar != null) {
                a(sb, 1);
                sb.append("bundle {\n");
                if ((gVar.zzc & 1) != 0) {
                    a(sb, 1, "protocol_version", Integer.valueOf(gVar.zze));
                }
                a(sb, 1, "platform", gVar.zzm);
                if ((gVar.zzc & 16384) != 0) {
                    a(sb, 1, "gmp_version", Long.valueOf(gVar.zzu));
                }
                if ((gVar.zzc & 32768) != 0) {
                    a(sb, 1, "uploading_gmp_version", Long.valueOf(gVar.zzv));
                }
                if ((gVar.zzd & 16) != 0) {
                    a(sb, 1, "dynamite_version", Long.valueOf(gVar.zzas));
                }
                if ((gVar.zzc & 536870912) != 0) {
                    a(sb, 1, "config_version", Long.valueOf(gVar.zzak));
                }
                a(sb, 1, "gmp_app_id", gVar.zzac);
                a(sb, 1, "admob_app_id", gVar.zzap);
                a(sb, 1, "app_id", gVar.zzs);
                a(sb, 1, "app_version", gVar.zzt);
                if ((gVar.zzc & 33554432) != 0) {
                    a(sb, 1, "app_version_major", Integer.valueOf(gVar.zzag));
                }
                a(sb, 1, "firebase_instance_id", gVar.zzaf);
                if ((gVar.zzc & 524288) != 0) {
                    a(sb, 1, "dev_cert_hash", Long.valueOf(gVar.zzz));
                }
                a(sb, 1, "app_store", gVar.zzr);
                if ((gVar.zzc & 2) != 0) {
                    a(sb, 1, "upload_timestamp_millis", Long.valueOf(gVar.zzh));
                }
                if ((gVar.zzc & 4) != 0) {
                    a(sb, 1, "start_timestamp_millis", Long.valueOf(gVar.zzi));
                }
                if (gVar.a()) {
                    a(sb, 1, "end_timestamp_millis", Long.valueOf(gVar.zzj));
                }
                if ((gVar.zzc & 16) != 0) {
                    a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(gVar.zzk));
                }
                if ((gVar.zzc & 32) != 0) {
                    a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(gVar.zzl));
                }
                a(sb, 1, "app_instance_id", gVar.zzy);
                a(sb, 1, "resettable_device_id", gVar.zzw);
                a(sb, 1, "device_id", gVar.zzaj);
                a(sb, 1, "ds_id", gVar.zzam);
                if ((gVar.zzc & 131072) != 0) {
                    a(sb, 1, "limited_ad_tracking", Boolean.valueOf(gVar.zzx));
                }
                a(sb, 1, "os_version", gVar.zzn);
                a(sb, 1, "device_model", gVar.zzo);
                a(sb, 1, "user_default_language", gVar.zzp);
                if ((gVar.zzc & 1024) != 0) {
                    a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(gVar.zzq));
                }
                if ((gVar.zzc & 1048576) != 0) {
                    a(sb, 1, "bundle_sequential_index", Integer.valueOf(gVar.zzaa));
                }
                if ((gVar.zzc & 8388608) != 0) {
                    a(sb, 1, "service_upload", Boolean.valueOf(gVar.zzad));
                }
                a(sb, 1, "health_monitor", gVar.zzab);
                if (!(s().d(null, p.aM) || (gVar.zzc & 1073741824) == 0 || gVar.zzal == 0)) {
                    a(sb, 1, "android_id", Long.valueOf(gVar.zzal));
                }
                if (gVar.b()) {
                    a(sb, 1, "retry_counter", Integer.valueOf(gVar.zzao));
                }
                gv<ay.k> gvVar = gVar.zzg;
                if (gvVar != null) {
                    for (ay.k kVar : gvVar) {
                        if (kVar != null) {
                            a(sb, 2);
                            sb.append("user_property {\n");
                            a(sb, 2, "set_timestamp_millis", kVar.a() ? Long.valueOf(kVar.zzd) : null);
                            a(sb, 2, StringSet.name, n().c(kVar.zze));
                            a(sb, 2, "string_value", kVar.zzf);
                            a(sb, 2, "int_value", kVar.b() ? Long.valueOf(kVar.zzg) : null);
                            a(sb, 2, "double_value", kVar.c() ? Double.valueOf(kVar.zzi) : null);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                gv<ay.a> gvVar2 = gVar.zzae;
                if (gvVar2 != null) {
                    for (ay.a aVar : gvVar2) {
                        if (aVar != null) {
                            a(sb, 2);
                            sb.append("audience_membership {\n");
                            if ((aVar.zzc & 1) != 0) {
                                a(sb, 2, "audience_id", Integer.valueOf(aVar.zzd));
                            }
                            if ((aVar.zzc & 8) != 0) {
                                a(sb, 2, "new_audience", Boolean.valueOf(aVar.zzg));
                            }
                            a(sb, "current_data", aVar.a());
                            if ((aVar.zzc & 4) != 0) {
                                if (aVar.zzf == null) {
                                    iVar = ay.i.zzg;
                                } else {
                                    iVar = aVar.zzf;
                                }
                                a(sb, "previous_data", iVar);
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                gv<ay.c> gvVar3 = gVar.zzf;
                if (gvVar3 != null) {
                    for (ay.c cVar : gvVar3) {
                        if (cVar != null) {
                            a(sb, 2);
                            sb.append("event {\n");
                            a(sb, 2, StringSet.name, n().a(cVar.zze));
                            if (cVar.b()) {
                                a(sb, 2, "timestamp_millis", Long.valueOf(cVar.zzf));
                            }
                            if ((cVar.zzc & 4) != 0) {
                                a(sb, 2, "previous_timestamp_millis", Long.valueOf(cVar.zzg));
                            }
                            if ((cVar.zzc & 8) != 0) {
                                a(sb, 2, "count", Integer.valueOf(cVar.zzh));
                            }
                            if (cVar.a() != 0) {
                                a(sb, 2, cVar.zzd);
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String a(ap.b bVar) {
        if (bVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (bVar.a()) {
            a(sb, 0, "filter_id", Integer.valueOf(bVar.zzd));
        }
        a(sb, 0, "event_name", n().a(bVar.zze));
        String a2 = a(bVar.zzi, bVar.zzj, bVar.zzk);
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", a2);
        }
        if (bVar.c()) {
            a(sb, 1, "event_count_filter", bVar.d());
        }
        if (bVar.b() > 0) {
            sb.append("  filters {\n");
            for (ap.c cVar : bVar.zzf) {
                a(sb, 2, cVar);
            }
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String a(ap.e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (eVar.a()) {
            a(sb, 0, "filter_id", Integer.valueOf(eVar.zzd));
        }
        a(sb, 0, "property_name", n().c(eVar.zze));
        String a2 = a(eVar.zzg, eVar.zzh, eVar.zzi);
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", a2);
        }
        a(sb, 1, eVar.b());
        sb.append("}\n");
        return sb.toString();
    }

    private final void a(StringBuilder sb, int i2, List<ay.e> list) {
        if (list != null) {
            int i3 = i2 + 1;
            for (ay.e eVar : list) {
                if (eVar != null) {
                    a(sb, i3);
                    sb.append("param {\n");
                    kx.b();
                    Double d2 = null;
                    if (s().d(null, p.aE)) {
                        a(sb, i3, StringSet.name, (eVar.zzc & 1) != 0 ? n().b(eVar.zzd) : null);
                        a(sb, i3, "string_value", eVar.a() ? eVar.zze : null);
                        a(sb, i3, "int_value", eVar.b() ? Long.valueOf(eVar.zzf) : null);
                        if (eVar.c()) {
                            d2 = Double.valueOf(eVar.zzh);
                        }
                        a(sb, i3, "double_value", d2);
                        if (eVar.d() > 0) {
                            a(sb, i3, eVar.zzi);
                        }
                    } else {
                        a(sb, i3, StringSet.name, n().b(eVar.zzd));
                        a(sb, i3, "string_value", eVar.zze);
                        a(sb, i3, "int_value", eVar.b() ? Long.valueOf(eVar.zzf) : null);
                        if (eVar.c()) {
                            d2 = Double.valueOf(eVar.zzh);
                        }
                        a(sb, i3, "double_value", d2);
                    }
                    a(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder sb, String str, ay.i iVar) {
        if (iVar != null) {
            a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (iVar.zzd.size() != 0) {
                a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Object obj : iVar.zzd) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(obj);
                    i2 = i3;
                }
                sb.append('\n');
            }
            if (iVar.a() != 0) {
                a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Object obj2 : iVar.zzc) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(obj2);
                    i4 = i5;
                }
                sb.append('\n');
            }
            if (iVar.b() != 0) {
                a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (ay.b bVar : iVar.zze) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(bVar.a() ? Integer.valueOf(bVar.zzd) : null).append(":").append(bVar.b() ? Long.valueOf(bVar.zze) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (iVar.c() != 0) {
                a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (ay.j jVar : iVar.zzf) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jVar.a() ? Integer.valueOf(jVar.zzd) : null).append(": [");
                    int i10 = 0;
                    for (Long l2 : jVar.zze) {
                        long longValue = l2.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            a(sb, 3);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i2, String str, ap.d dVar) {
        if (dVar != null) {
            a(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            if (dVar.a()) {
                a(sb, i2, "comparison_type", dVar.b().name());
            }
            if (dVar.c()) {
                a(sb, i2, "match_as_float", Boolean.valueOf(dVar.zze));
            }
            if (dVar.d()) {
                a(sb, i2, "comparison_value", dVar.zzf);
            }
            if (dVar.e()) {
                a(sb, i2, "min_comparison_value", dVar.zzg);
            }
            if (dVar.f()) {
                a(sb, i2, "max_comparison_value", dVar.zzh);
            }
            a(sb, i2);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            a(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        q().f51468c.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L_0x0004
            return r3
        L_0x0004:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            int r1 = r5.length     // Catch:{ a -> 0x001a }
            r0 = 0
            r2.unmarshall(r5, r0, r1)     // Catch:{ a -> 0x001a }
            r2.setDataPosition(r0)     // Catch:{ a -> 0x001a }
            java.lang.Object r0 = r6.createFromParcel(r2)     // Catch:{ a -> 0x001a }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ a -> 0x001a }
            r2.recycle()
            return r0
        L_0x001a:
            com.google.android.gms.measurement.internal.eb r0 = r4.q()     // Catch:{ all -> 0x0029 }
            com.google.android.gms.measurement.internal.ee r1 = r0.f51468c     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "Failed to load parcelable from buffer"
            r1.a(r0)     // Catch:{ all -> 0x0029 }
            r2.recycle()
            return r3
        L_0x0029:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jv.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    static boolean a(zzao zzao, zzn zzn) {
        r.a(zzao);
        r.a(zzn);
        return !TextUtils.isEmpty(zzn.f52074b) || !TextUtils.isEmpty(zzn.r);
    }

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(List<Long> list, int i2) {
        if (i2 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
    }

    /* access modifiers changed from: package-private */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                q().f51471f.a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    q().f51471f.a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            size = size2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, size);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(l().a() - j2) > j3;
    }

    /* access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        r.a(bArr);
        o().c();
        MessageDigest h2 = jz.h();
        if (h2 != null) {
            return jz.a(h2.digest(bArr));
        }
        q().f51468c.a("Failed to get MD5");
        return 0;
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ ey I_() {
        return super.I_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ e J_() {
        return super.J_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ kd K_() {
        return super.K_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ jv L_() {
        return super.L_();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> e() {
        Map<String, String> a2;
        be a3 = be.a(this.f51935j.m().getContentResolver(), bs.a("com.google.android.gms.measurement"));
        if (a3 == null) {
            a2 = Collections.emptyMap();
        } else {
            a2 = a3.a();
        }
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = p.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = a2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            q().f51471f.a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    q().f51471f.a("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    jv(jo joVar) {
        super(joVar);
    }

    /* access modifiers changed from: package-private */
    public final byte[] c(byte[] bArr) {
        MethodCollector.i(5299);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            MethodCollector.o(5299);
            return byteArray;
        } catch (IOException e2) {
            q().f51468c.a("Failed to gzip content", e2);
            MethodCollector.o(5299);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) {
        MethodCollector.i(5291);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.o(5291);
                    return byteArray;
                }
            }
        } catch (IOException e2) {
            q().f51468c.a("Failed to ungzip content", e2);
            MethodCollector.o(5291);
            throw e2;
        }
    }

    static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            int i3 = 0;
            do {
                int i4 = (i2 << 6) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
                i3++;
            } while (i3 < 64);
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    private static List<ay.e> a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                ay.e.a e2 = ay.e.e();
                for (String str : bundle.keySet()) {
                    ay.e.a a2 = ay.e.e().a(str);
                    Object a3 = a(bundle, str);
                    if (a3 instanceof Long) {
                        a2.a(((Long) a3).longValue());
                    } else if (a3 instanceof String) {
                        a2.b((String) a3);
                    } else if (a3 instanceof Double) {
                        a2.a(((Double) a3).doubleValue());
                    }
                    e2.a(a2);
                }
                if (e2.d() > 0) {
                    arrayList.add((gm) e2.w());
                }
            }
        }
        return arrayList;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    static <Builder extends hw> Builder a(Builder builder, byte[] bArr) {
        fy b2 = fy.b();
        return b2 != null ? (Builder) builder.a(bArr, b2) : (Builder) builder.a(bArr);
    }

    static int a(ay.g.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < aVar.f(); i2++) {
            if (str.equals(aVar.c(i2).zze)) {
                return i2;
            }
        }
        return -1;
    }

    static ay.e a(ay.c cVar, String str) {
        for (ay.e eVar : cVar.zzd) {
            if (eVar.zzd.equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Object b(ay.c cVar, String str) {
        ay.e a2 = a(cVar, str);
        if (a2 != null) {
            if (a2.a()) {
                return a2.zze;
            }
            if (a2.b()) {
                return Long.valueOf(a2.zzf);
            }
            if (a2.c()) {
                return Double.valueOf(a2.zzh);
            }
            kx.b();
            if (s().d(null, p.aG) && a2.d() > 0) {
                gv<ay.e> gvVar = a2.zzi;
                ArrayList arrayList = new ArrayList();
                for (ay.e eVar : gvVar) {
                    if (eVar != null) {
                        Bundle bundle = new Bundle();
                        for (ay.e eVar2 : eVar.zzi) {
                            if (eVar2.a()) {
                                bundle.putString(eVar2.zzd, eVar2.zze);
                            } else if (eVar2.b()) {
                                bundle.putLong(eVar2.zzd, eVar2.zzf);
                            } else if (eVar2.c()) {
                                bundle.putDouble(eVar2.zzd, eVar2.zzh);
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    private static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void a(StringBuilder sb, int i2, ap.c cVar) {
        if (cVar != null) {
            a(sb, i2);
            sb.append("filter {\n");
            if (cVar.e()) {
                a(sb, i2, "complement", Boolean.valueOf(cVar.zzf));
            }
            if ((cVar.zzc & 8) != 0) {
                a(sb, i2, "param_name", n().b(cVar.zzg));
            }
            if (cVar.a()) {
                int i3 = i2 + 1;
                ap.f b2 = cVar.b();
                if (b2 != null) {
                    a(sb, i3);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (b2.a()) {
                        a(sb, i3, "match_type", b2.b().name());
                    }
                    if (b2.c()) {
                        a(sb, i3, "expression", b2.zze);
                    }
                    if ((b2.zzc & 4) != 0) {
                        a(sb, i3, "case_sensitive", Boolean.valueOf(b2.zzf));
                    }
                    if (b2.d() > 0) {
                        a(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        for (String str : b2.zzg) {
                            a(sb, i3 + 2);
                            sb.append(str);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    a(sb, i3);
                    sb.append("}\n");
                }
            }
            if (cVar.c()) {
                a(sb, i2 + 1, "number_filter", cVar.d());
            }
            a(sb, i2);
            sb.append("}\n");
        }
    }
}
