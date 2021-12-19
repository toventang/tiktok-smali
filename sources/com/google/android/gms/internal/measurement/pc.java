package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import java.util.Map;

public final class pc extends a implements pa {
    static {
        Covode.recordClassIndex(32062);
    }

    pc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        MethodCollector.i(2988);
        MethodCollector.o(2988);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void generateEventId(pb pbVar) {
        MethodCollector.i(4407);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(22, F_);
        MethodCollector.o(4407);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getAppInstanceId(pb pbVar) {
        MethodCollector.i(4387);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(20, F_);
        MethodCollector.o(4387);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getCachedAppInstanceId(pb pbVar) {
        MethodCollector.i(4357);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(19, F_);
        MethodCollector.o(4357);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getCurrentScreenClass(pb pbVar) {
        MethodCollector.i(3988);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(17, F_);
        MethodCollector.o(3988);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getCurrentScreenName(pb pbVar) {
        MethodCollector.i(3747);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(16, F_);
        MethodCollector.o(3747);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getGmpAppId(pb pbVar) {
        MethodCollector.i(4405);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(21, F_);
        MethodCollector.o(4405);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void initForTests(Map map) {
        MethodCollector.i(4850);
        Parcel F_ = F_();
        F_.writeMap(map);
        b(37, F_);
        MethodCollector.o(4850);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void isDataCollectionEnabled(pb pbVar) {
        MethodCollector.i(5117);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        b(40, F_);
        MethodCollector.o(5117);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void registerOnMeasurementEventListener(b bVar) {
        MethodCollector.i(4667);
        Parcel F_ = F_();
        z.a(F_, bVar);
        b(35, F_);
        MethodCollector.o(4667);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void resetAnalyticsData(long j2) {
        MethodCollector.i(3009);
        Parcel F_ = F_();
        F_.writeLong(j2);
        b(12, F_);
        MethodCollector.o(3009);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setDataCollectionEnabled(boolean z) {
        MethodCollector.i(5027);
        Parcel F_ = F_();
        z.a(F_, z);
        b(39, F_);
        MethodCollector.o(5027);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setDefaultEventParameters(Bundle bundle) {
        MethodCollector.i(5138);
        Parcel F_ = F_();
        z.a(F_, bundle);
        b(42, F_);
        MethodCollector.o(5138);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setEventInterceptor(b bVar) {
        MethodCollector.i(4663);
        Parcel F_ = F_();
        z.a(F_, bVar);
        b(34, F_);
        MethodCollector.o(4663);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setInstanceIdProvider(c cVar) {
        MethodCollector.i(4159);
        Parcel F_ = F_();
        z.a(F_, cVar);
        b(18, F_);
        MethodCollector.o(4159);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setMinimumSessionDuration(long j2) {
        MethodCollector.i(3391);
        Parcel F_ = F_();
        F_.writeLong(j2);
        b(13, F_);
        MethodCollector.o(3391);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setSessionTimeoutDuration(long j2) {
        MethodCollector.i(3403);
        Parcel F_ = F_();
        F_.writeLong(j2);
        b(14, F_);
        MethodCollector.o(3403);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void unregisterOnMeasurementEventListener(b bVar) {
        MethodCollector.i(4757);
        Parcel F_ = F_();
        z.a(F_, bVar);
        b(36, F_);
        MethodCollector.o(4757);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void beginAdUnitExposure(String str, long j2) {
        MethodCollector.i(4410);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeLong(j2);
        b(23, F_);
        MethodCollector.o(4410);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void endAdUnitExposure(String str, long j2) {
        MethodCollector.i(4413);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeLong(j2);
        b(24, F_);
        MethodCollector.o(4413);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getMaxUserProperties(String str, pb pbVar) {
        MethodCollector.i(2996);
        Parcel F_ = F_();
        F_.writeString(str);
        z.a(F_, pbVar);
        b(6, F_);
        MethodCollector.o(2996);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getTestFlag(pb pbVar, int i2) {
        MethodCollector.i(4971);
        Parcel F_ = F_();
        z.a(F_, pbVar);
        F_.writeInt(i2);
        b(38, F_);
        MethodCollector.o(4971);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityDestroyed(a aVar, long j2) {
        MethodCollector.i(4537);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeLong(j2);
        b(28, F_);
        MethodCollector.o(4537);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityPaused(a aVar, long j2) {
        MethodCollector.i(4548);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeLong(j2);
        b(29, F_);
        MethodCollector.o(4548);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityResumed(a aVar, long j2) {
        MethodCollector.i(4562);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeLong(j2);
        b(30, F_);
        MethodCollector.o(4562);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityStarted(a aVar, long j2) {
        MethodCollector.i(4414);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeLong(j2);
        b(25, F_);
        MethodCollector.o(4414);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityStopped(a aVar, long j2) {
        MethodCollector.i(4418);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeLong(j2);
        b(26, F_);
        MethodCollector.o(4418);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        MethodCollector.i(2998);
        Parcel F_ = F_();
        z.a(F_, bundle);
        F_.writeLong(j2);
        b(8, F_);
        MethodCollector.o(2998);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setMeasurementEnabled(boolean z, long j2) {
        MethodCollector.i(3006);
        Parcel F_ = F_();
        z.a(F_, z);
        F_.writeLong(j2);
        b(11, F_);
        MethodCollector.o(3006);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setUserId(String str, long j2) {
        MethodCollector.i(2997);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeLong(j2);
        b(7, F_);
        MethodCollector.o(2997);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        MethodCollector.i(3000);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, bundle);
        b(9, F_);
        MethodCollector.o(3000);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getConditionalUserProperties(String str, String str2, pb pbVar) {
        MethodCollector.i(3002);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, pbVar);
        b(10, F_);
        MethodCollector.o(3002);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void initialize(a aVar, zzae zzae, long j2) {
        MethodCollector.i(2990);
        Parcel F_ = F_();
        z.a(F_, aVar);
        z.a(F_, zzae);
        F_.writeLong(j2);
        b(1, F_);
        MethodCollector.o(2990);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivityCreated(a aVar, Bundle bundle, long j2) {
        MethodCollector.i(4481);
        Parcel F_ = F_();
        z.a(F_, aVar);
        z.a(F_, bundle);
        F_.writeLong(j2);
        b(27, F_);
        MethodCollector.o(4481);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void onActivitySaveInstanceState(a aVar, pb pbVar, long j2) {
        MethodCollector.i(4631);
        Parcel F_ = F_();
        z.a(F_, aVar);
        z.a(F_, pbVar);
        F_.writeLong(j2);
        b(31, F_);
        MethodCollector.o(4631);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void performAction(Bundle bundle, pb pbVar, long j2) {
        MethodCollector.i(4648);
        Parcel F_ = F_();
        z.a(F_, bundle);
        z.a(F_, pbVar);
        F_.writeLong(j2);
        b(32, F_);
        MethodCollector.o(4648);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void getUserProperties(String str, String str2, boolean z, pb pbVar) {
        MethodCollector.i(2995);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, z);
        z.a(F_, pbVar);
        b(5, F_);
        MethodCollector.o(2995);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setCurrentScreen(a aVar, String str, String str2, long j2) {
        MethodCollector.i(3405);
        Parcel F_ = F_();
        z.a(F_, aVar);
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeLong(j2);
        b(15, F_);
        MethodCollector.o(3405);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void logEventAndBundle(String str, String str2, Bundle bundle, pb pbVar, long j2) {
        MethodCollector.i(2993);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, bundle);
        z.a(F_, pbVar);
        F_.writeLong(j2);
        b(3, F_);
        MethodCollector.o(2993);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j2) {
        MethodCollector.i(2994);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, aVar);
        z.a(F_, z);
        F_.writeLong(j2);
        b(4, F_);
        MethodCollector.o(2994);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) {
        MethodCollector.i(4662);
        Parcel F_ = F_();
        F_.writeInt(i2);
        F_.writeString(str);
        z.a(F_, aVar);
        z.a(F_, aVar2);
        z.a(F_, aVar3);
        b(33, F_);
        MethodCollector.o(4662);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        MethodCollector.i(2992);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, bundle);
        z.a(F_, z);
        z.a(F_, z2);
        F_.writeLong(j2);
        b(2, F_);
        MethodCollector.o(2992);
    }
}
