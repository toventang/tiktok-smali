package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.ff;
import com.google.android.gms.measurement.internal.ga;
import com.google.android.gms.measurement.internal.gg;
import com.google.android.gms.measurement.internal.gk;
import com.google.android.gms.measurement.internal.hi;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppMeasurement {

    /* renamed from: a  reason: collision with root package name */
    private static volatile AppMeasurement f51305a;

    /* renamed from: b  reason: collision with root package name */
    private final ff f51306b;

    /* renamed from: c  reason: collision with root package name */
    private final hi f51307c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f51308d;

    public static final class a extends gg {
        static {
            Covode.recordClassIndex(32078);
        }
    }

    static {
        Covode.recordClassIndex(32076);
    }

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        static {
            Covode.recordClassIndex(32077);
        }

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(StringSet.name, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                ga.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        ConditionalUserProperty(Bundle bundle) {
            r.a(bundle);
            this.mAppId = (String) ga.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) ga.a(bundle, "origin", String.class, null);
            this.mName = (String) ga.a(bundle, StringSet.name, String.class, null);
            this.mValue = ga.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) ga.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) ga.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) ga.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) ga.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) ga.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) ga.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) ga.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) ga.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) ga.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) ga.a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) ga.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) ga.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public long generateEventId() {
        if (this.f51308d) {
            return this.f51307c.e();
        }
        return this.f51306b.e().f();
    }

    public String getAppInstanceId() {
        if (this.f51308d) {
            return this.f51307c.c();
        }
        return this.f51306b.d().x();
    }

    public String getCurrentScreenClass() {
        if (this.f51308d) {
            return this.f51307c.b();
        }
        return this.f51306b.d().A();
    }

    public String getCurrentScreenName() {
        if (this.f51308d) {
            return this.f51307c.a();
        }
        return this.f51306b.d().z();
    }

    public String getGmpAppId() {
        if (this.f51308d) {
            return this.f51307c.d();
        }
        return this.f51306b.d().B();
    }

    public static AppMeasurement getInstance(Context context) {
        return a(context);
    }

    private AppMeasurement(ff ffVar) {
        r.a(ffVar);
        this.f51306b = ffVar;
        this.f51307c = null;
        this.f51308d = false;
    }

    private AppMeasurement(hi hiVar) {
        r.a(hiVar);
        this.f51307c = hiVar;
        this.f51306b = null;
        this.f51308d = true;
    }

    public void beginAdUnitExposure(String str) {
        if (this.f51308d) {
            this.f51307c.a(str);
        } else {
            this.f51306b.n().a(str, this.f51306b.l().b());
        }
    }

    public void endAdUnitExposure(String str) {
        if (this.f51308d) {
            this.f51307c.b(str);
        } else {
            this.f51306b.n().b(str, this.f51306b.l().b());
        }
    }

    public int getMaxUserProperties(String str) {
        if (this.f51308d) {
            return this.f51307c.c(str);
        }
        this.f51306b.d();
        r.a(str);
        return 25;
    }

    private static hi b(Context context) {
        try {
            return (hi) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        r.a(conditionalUserProperty);
        if (this.f51308d) {
            this.f51307c.a(conditionalUserProperty.a());
            return;
        }
        gk d2 = this.f51306b.d();
        d2.a(conditionalUserProperty.a(), d2.l().a());
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        r.a(conditionalUserProperty);
        if (!this.f51308d) {
            gk d2 = this.f51306b.d();
            Bundle a2 = conditionalUserProperty.a();
            r.a(a2);
            r.a(a2.getString("app_id"));
            d2.a();
            d2.b(new Bundle(a2), d2.l().a());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static AppMeasurement a(Context context) {
        MethodCollector.i(7308);
        if (f51305a == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f51305a == null) {
                        hi b2 = b(context);
                        if (b2 != null) {
                            f51305a = new AppMeasurement(b2);
                        } else {
                            f51305a = new AppMeasurement(ff.a(context, new zzae(0, 0, true, null, null, null, null), null));
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7308);
                    throw th;
                }
            }
        }
        AppMeasurement appMeasurement = f51305a;
        MethodCollector.o(7308);
        return appMeasurement;
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a2;
        int size;
        if (this.f51308d) {
            a2 = this.f51307c.a(str, str2);
        } else {
            a2 = this.f51306b.d().a((String) null, str, str2);
        }
        if (a2 == null) {
            size = 0;
        } else {
            size = a2.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : a2) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f51308d) {
            this.f51307c.b(str, str2, bundle);
        } else {
            this.f51306b.d().c(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f51308d) {
            return this.f51307c.a(str, str2, z);
        }
        return this.f51306b.d().a((String) null, str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f51308d) {
            this.f51307c.a(str, str2, bundle);
        } else {
            this.f51306b.d().a(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        int size;
        if (!this.f51308d) {
            gk d2 = this.f51306b.d();
            r.a(str);
            d2.a();
            ArrayList<Bundle> a2 = d2.a(str, str2, str3);
            int i2 = 0;
            if (a2 == null) {
                size = 0;
            } else {
                size = a2.size();
            }
            ArrayList arrayList = new ArrayList(size);
            int size2 = a2.size();
            while (i2 < size2) {
                Bundle bundle = a2.get(i2);
                i2++;
                arrayList.add(new ConditionalUserProperty(bundle));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.f51308d) {
            gk d2 = this.f51306b.d();
            r.a(str);
            d2.a();
            d2.a(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.f51308d) {
            gk d2 = this.f51306b.d();
            r.a(str);
            d2.a();
            return d2.a(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }
}
