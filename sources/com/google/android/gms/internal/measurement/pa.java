package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.a;
import java.util.Map;

public interface pa extends IInterface {
    static {
        Covode.recordClassIndex(32060);
    }

    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(pb pbVar);

    void getAppInstanceId(pb pbVar);

    void getCachedAppInstanceId(pb pbVar);

    void getConditionalUserProperties(String str, String str2, pb pbVar);

    void getCurrentScreenClass(pb pbVar);

    void getCurrentScreenName(pb pbVar);

    void getGmpAppId(pb pbVar);

    void getMaxUserProperties(String str, pb pbVar);

    void getTestFlag(pb pbVar, int i2);

    void getUserProperties(String str, String str2, boolean z, pb pbVar);

    void initForTests(Map map);

    void initialize(a aVar, zzae zzae, long j2);

    void isDataCollectionEnabled(pb pbVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, pb pbVar, long j2);

    void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(a aVar, long j2);

    void onActivityPaused(a aVar, long j2);

    void onActivityResumed(a aVar, long j2);

    void onActivitySaveInstanceState(a aVar, pb pbVar, long j2);

    void onActivityStarted(a aVar, long j2);

    void onActivityStopped(a aVar, long j2);

    void performAction(Bundle bundle, pb pbVar, long j2);

    void registerOnMeasurementEventListener(b bVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setCurrentScreen(a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(b bVar);

    void setInstanceIdProvider(c cVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(b bVar);
}
