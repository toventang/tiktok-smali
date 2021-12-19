package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.z;
import java.util.ArrayList;
import java.util.List;

public final class dv extends a implements dt {
    static {
        Covode.recordClassIndex(32189);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzao zzao, zzn zzn) {
        MethodCollector.i(7008);
        Parcel F_ = F_();
        z.a(F_, zzao);
        z.a(F_, zzn);
        b(1, F_);
        MethodCollector.o(7008);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzkr zzkr, zzn zzn) {
        MethodCollector.i(7011);
        Parcel F_ = F_();
        z.a(F_, zzkr);
        z.a(F_, zzn);
        b(2, F_);
        MethodCollector.o(7011);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzn zzn) {
        MethodCollector.i(7016);
        Parcel F_ = F_();
        z.a(F_, zzn);
        b(4, F_);
        MethodCollector.o(7016);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzao zzao, String str, String str2) {
        MethodCollector.i(7074);
        Parcel F_ = F_();
        z.a(F_, zzao);
        F_.writeString(str);
        F_.writeString(str2);
        b(5, F_);
        MethodCollector.o(7074);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final byte[] a(zzao zzao, String str) {
        MethodCollector.i(7126);
        Parcel F_ = F_();
        z.a(F_, zzao);
        F_.writeString(str);
        Parcel a2 = a(9, F_);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        MethodCollector.o(7126);
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzw zzw, zzn zzn) {
        MethodCollector.i(7306);
        Parcel F_ = F_();
        z.a(F_, zzw);
        z.a(F_, zzn);
        b(12, F_);
        MethodCollector.o(7306);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(zzw zzw) {
        MethodCollector.i(7312);
        Parcel F_ = F_();
        z.a(F_, zzw);
        b(13, F_);
        MethodCollector.o(7312);
    }

    dv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
        MethodCollector.i(7004);
        MethodCollector.o(7004);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void b(zzn zzn) {
        MethodCollector.i(7087);
        Parcel F_ = F_();
        z.a(F_, zzn);
        b(6, F_);
        MethodCollector.o(7087);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final String c(zzn zzn) {
        MethodCollector.i(7301);
        Parcel F_ = F_();
        z.a(F_, zzn);
        Parcel a2 = a(11, F_);
        String readString = a2.readString();
        a2.recycle();
        MethodCollector.o(7301);
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void d(zzn zzn) {
        MethodCollector.i(7456);
        Parcel F_ = F_();
        z.a(F_, zzn);
        b(18, F_);
        MethodCollector.o(7456);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(zzn zzn, boolean z) {
        MethodCollector.i(7096);
        Parcel F_ = F_();
        z.a(F_, zzn);
        z.a(F_, z);
        Parcel a2 = a(7, F_);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkr.CREATOR);
        a2.recycle();
        MethodCollector.o(7096);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(Bundle bundle, zzn zzn) {
        MethodCollector.i(7466);
        Parcel F_ = F_();
        z.a(F_, bundle);
        z.a(F_, zzn);
        b(19, F_);
        MethodCollector.o(7466);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzw> a(String str, String str2, zzn zzn) {
        MethodCollector.i(7435);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, zzn);
        Parcel a2 = a(16, F_);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzw.CREATOR);
        a2.recycle();
        MethodCollector.o(7435);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzw> a(String str, String str2, String str3) {
        MethodCollector.i(7446);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        Parcel a2 = a(17, F_);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzw.CREATOR);
        a2.recycle();
        MethodCollector.o(7446);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final void a(long j2, String str, String str2, String str3) {
        MethodCollector.i(7204);
        Parcel F_ = F_();
        F_.writeLong(j2);
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        b(10, F_);
        MethodCollector.o(7204);
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(String str, String str2, String str3, boolean z) {
        MethodCollector.i(7354);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        z.a(F_, z);
        Parcel a2 = a(15, F_);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkr.CREATOR);
        a2.recycle();
        MethodCollector.o(7354);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.dt
    public final List<zzkr> a(String str, String str2, boolean z, zzn zzn) {
        MethodCollector.i(7340);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, z);
        z.a(F_, zzn);
        Parcel a2 = a(14, F_);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzkr.CREATOR);
        a2.recycle();
        MethodCollector.o(7340);
        return createTypedArrayList;
    }
}
