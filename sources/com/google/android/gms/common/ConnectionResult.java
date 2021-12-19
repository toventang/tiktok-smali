package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.ss.android.ugc.playerkit.model.v;
import java.util.Arrays;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public static final ConnectionResult f49941a = new ConnectionResult(0);

    /* renamed from: b  reason: collision with root package name */
    public final int f49942b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f49943c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49944d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49945e;

    public final boolean b() {
        if (this.f49942b == 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.f49942b == 0 || this.f49943c == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(31176);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49942b), this.f49943c, this.f49944d});
    }

    public final String toString() {
        return p.a(this).a("statusCode", a(this.f49942b)).a("resolution", this.f49943c).a("message", this.f49944d).toString();
    }

    public ConnectionResult(int i2) {
        this(i2, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f49942b != connectionResult.f49942b || !p.a(this.f49943c, connectionResult.f49943c) || !p.a(this.f49944d, connectionResult.f49944d)) {
            return false;
        }
        return true;
    }

    static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "INVALID_ACCOUNT";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "RESOLUTION_REQUIRED";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "NETWORK_ERROR";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "INTERNAL_ERROR";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "SERVICE_INVALID";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "DEVELOPER_ERROR";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        return "CANCELED";
                    case ABRConfig.ABR_SELECT_SCENE:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case v.U /*{ENCODED_INT: 20}*/:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i2).append(")").toString();
                }
        }
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f49945e);
        b.b(parcel, 2, this.f49942b);
        b.a(parcel, 3, this.f49943c, i2);
        b.a(parcel, 4, this.f49944d);
        b.b(parcel, a2);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    ConnectionResult(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f49945e = i2;
        this.f49942b = i3;
        this.f49943c = pendingIntent;
        this.f49944d = str;
    }
}
