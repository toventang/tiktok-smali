package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.a.a;
import com.ss.android.ugc.playerkit.model.v;

public abstract class oz extends av implements pa {
    static {
        Covode.recordClassIndex(32058);
    }

    public oz() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static pa asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof pa) {
            return (pa) queryLocalInterface;
        }
        return new pc(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.av
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        pb pbVar = null;
        pb pdVar = null;
        pb pdVar2 = null;
        b dVar = null;
        b dVar2 = null;
        b dVar3 = null;
        pb pdVar3 = null;
        pb pdVar4 = null;
        pb pdVar5 = null;
        pb pdVar6 = null;
        pb pdVar7 = null;
        pb pdVar8 = null;
        c eVar = null;
        pb pdVar9 = null;
        pb pdVar10 = null;
        pb pdVar11 = null;
        pb pdVar12 = null;
        pb pdVar13 = null;
        switch (i2) {
            case 1:
                initialize(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), (zzae) z.a(parcel, zzae.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) z.a(parcel, Bundle.CREATOR), z.a(parcel), z.a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof pb) {
                        pbVar = (pb) queryLocalInterface;
                    } else {
                        pbVar = new pd(readStrongBinder);
                    }
                }
                logEventAndBundle(readString, readString2, bundle, pbVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), a.AbstractBinderC1201a.a(parcel.readStrongBinder()), z.a(parcel), parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a2 = z.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof pb) {
                        pdVar13 = (pb) queryLocalInterface2;
                    } else {
                        pdVar13 = new pd(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, a2, pdVar13);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof pb) {
                        pdVar12 = (pb) queryLocalInterface3;
                    } else {
                        pdVar12 = new pd(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, pdVar12);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                setConditionalUserProperty((Bundle) z.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) z.a(parcel, Bundle.CREATOR));
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof pb) {
                        pdVar11 = (pb) queryLocalInterface4;
                    } else {
                        pdVar11 = new pd(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, pdVar11);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                setMeasurementEnabled(z.a(parcel), parcel.readLong());
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                resetAnalyticsData(parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case ABRConfig.ABR_SELECT_SCENE:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof pb) {
                        pdVar10 = (pb) queryLocalInterface5;
                    } else {
                        pdVar10 = new pd(readStrongBinder5);
                    }
                }
                getCurrentScreenName(pdVar10);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof pb) {
                        pdVar9 = (pb) queryLocalInterface6;
                    } else {
                        pdVar9 = new pd(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(pdVar9);
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof c) {
                        eVar = (c) queryLocalInterface7;
                    } else {
                        eVar = new e(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(eVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof pb) {
                        pdVar8 = (pb) queryLocalInterface8;
                    } else {
                        pdVar8 = new pd(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(pdVar8);
                break;
            case v.U /*{ENCODED_INT: 20}*/:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof pb) {
                        pdVar7 = (pb) queryLocalInterface9;
                    } else {
                        pdVar7 = new pd(readStrongBinder9);
                    }
                }
                getAppInstanceId(pdVar7);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof pb) {
                        pdVar6 = (pb) queryLocalInterface10;
                    } else {
                        pdVar6 = new pd(readStrongBinder10);
                    }
                }
                getGmpAppId(pdVar6);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof pb) {
                        pdVar5 = (pb) queryLocalInterface11;
                    } else {
                        pdVar5 = new pd(readStrongBinder11);
                    }
                }
                generateEventId(pdVar5);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), (Bundle) z.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC1201a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                a a3 = a.AbstractBinderC1201a.a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof pb) {
                        pdVar4 = (pb) queryLocalInterface12;
                    } else {
                        pdVar4 = new pd(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(a3, pdVar4, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof pb) {
                        pdVar3 = (pb) queryLocalInterface13;
                    } else {
                        pdVar3 = new pd(readStrongBinder13);
                    }
                }
                performAction(bundle2, pdVar3, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC1201a.a(parcel.readStrongBinder()), a.AbstractBinderC1201a.a(parcel.readStrongBinder()), a.AbstractBinderC1201a.a(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof b) {
                        dVar3 = (b) queryLocalInterface14;
                    } else {
                        dVar3 = new d(readStrongBinder14);
                    }
                }
                setEventInterceptor(dVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof b) {
                        dVar2 = (b) queryLocalInterface15;
                    } else {
                        dVar2 = new d(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(dVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof b) {
                        dVar = (b) queryLocalInterface16;
                    } else {
                        dVar = new d(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(dVar);
                break;
            case 37:
                initForTests(parcel.readHashMap(z.f51297a));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof pb) {
                        pdVar2 = (pb) queryLocalInterface17;
                    } else {
                        pdVar2 = new pd(readStrongBinder17);
                    }
                }
                getTestFlag(pdVar2, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(z.a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof pb) {
                        pdVar = (pb) queryLocalInterface18;
                    } else {
                        pdVar = new pd(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(pdVar);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) z.a(parcel, Bundle.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
