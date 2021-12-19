package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.l;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.kakao.usermgmt.StringSet;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() {
        /* class com.facebook.FacebookRequestError.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28388);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FacebookRequestError[] newArray(int i2) {
            return new FacebookRequestError[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    static final b f46523a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final a f46524b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46525c;

    /* renamed from: d  reason: collision with root package name */
    public final int f46526d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46527e;

    /* renamed from: f  reason: collision with root package name */
    public final String f46528f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46529g;

    /* renamed from: h  reason: collision with root package name */
    public final String f46530h;

    /* renamed from: i  reason: collision with root package name */
    public final String f46531i;

    /* renamed from: j  reason: collision with root package name */
    public final JSONObject f46532j;

    /* renamed from: k  reason: collision with root package name */
    public final JSONObject f46533k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f46534l;

    /* renamed from: m  reason: collision with root package name */
    public final HttpURLConnection f46535m;
    public final j n;
    private final String o;

    public final int describeContents() {
        return 0;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f46537a;

        /* renamed from: b  reason: collision with root package name */
        final int f46538b;

        static {
            Covode.recordClassIndex(28390);
        }

        private b() {
            this.f46537a = 200;
            this.f46538b = 299;
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        return this.n.getLocalizedMessage();
    }

    static {
        Covode.recordClassIndex(28387);
    }

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        static {
            Covode.recordClassIndex(28389);
        }
    }

    private static synchronized l b() {
        synchronized (FacebookRequestError.class) {
            MethodCollector.i(242);
            ae.a();
            q a2 = r.a(m.f48915a);
            if (a2 == null) {
                l a3 = l.a();
                MethodCollector.o(242);
                return a3;
            }
            l lVar = a2.f48647h;
            MethodCollector.o(242);
            return lVar;
        }
    }

    public final String toString() {
        return "{HttpStatus: " + this.f46525c + ", errorCode: " + this.f46526d + ", subErrorCode: " + this.f46527e + ", errorType: " + this.f46528f + ", errorMessage: " + a() + "}";
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f46525c);
        parcel.writeInt(this.f46526d);
        parcel.writeInt(this.f46527e);
        parcel.writeString(this.f46528f);
        parcel.writeString(this.o);
        parcel.writeString(this.f46529g);
        parcel.writeString(this.f46530h);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r13 = r16
            boolean r0 = r13 instanceof com.facebook.j
            if (r0 == 0) goto L_0x0019
            com.facebook.j r13 = (com.facebook.j) r13
        L_0x0008:
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r14
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0019:
            com.facebook.j r0 = new com.facebook.j
            r0.<init>(r13)
            r13 = r0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        try {
            if (jSONObject.has("code")) {
                int i4 = jSONObject.getInt("code");
                Object a2 = ad.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a2 != null && (a2 instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a2;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) ad.a(jSONObject3, "error", (String) null);
                        str4 = jSONObject4.optString(StringSet.type, null);
                        str3 = jSONObject4.optString("message", null);
                        i3 = jSONObject4.optInt("code", -1);
                        i2 = jSONObject4.optInt("error_subcode", -1);
                        str = jSONObject4.optString("error_user_msg", null);
                        str2 = jSONObject4.optString("error_user_title", null);
                        z = jSONObject4.optBoolean("is_transient", false);
                    } else if (jSONObject3.has("error_code") || jSONObject3.has("error_msg") || jSONObject3.has("error_reason")) {
                        str4 = jSONObject3.optString("error_reason", null);
                        str3 = jSONObject3.optString("error_msg", null);
                        i3 = jSONObject3.optInt("error_code", -1);
                        i2 = jSONObject3.optInt("error_subcode", -1);
                        str2 = null;
                        str = null;
                        z = false;
                    }
                    return new FacebookRequestError(i4, i3, i2, str4, str3, str2, str, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                }
                b bVar = f46523a;
                if (bVar.f46537a > i4 || i4 > bVar.f46538b) {
                    if (jSONObject.has("body")) {
                        jSONObject2 = (JSONObject) ad.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    return new FacebookRequestError(i4, -1, -1, null, null, null, null, false, jSONObject2, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FacebookRequestError(int r5, int r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, org.json.JSONObject r13, org.json.JSONObject r14, java.lang.Object r15, java.net.HttpURLConnection r16, com.facebook.j r17) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.json.JSONObject, org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection, com.facebook.j):void");
    }
}
