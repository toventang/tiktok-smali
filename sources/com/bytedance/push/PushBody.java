package com.bytedance.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new Parcelable.Creator<PushBody>() {
        /* class com.bytedance.push.PushBody.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25698);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PushBody[] newArray(int i2) {
            return new PushBody[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PushBody createFromParcel(Parcel parcel) {
            return new PushBody(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public long f42024a;

    /* renamed from: b  reason: collision with root package name */
    public long f42025b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42026c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f42027d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42028e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42029f;

    /* renamed from: g  reason: collision with root package name */
    public String f42030g;

    /* renamed from: h  reason: collision with root package name */
    public String f42031h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f42032i;

    /* renamed from: j  reason: collision with root package name */
    public JSONObject f42033j;

    /* renamed from: k  reason: collision with root package name */
    public String f42034k;

    /* renamed from: l  reason: collision with root package name */
    public String f42035l;

    /* renamed from: m  reason: collision with root package name */
    public String f42036m;
    public int n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(25697);
    }

    public final String a() {
        JSONObject jSONObject = this.f42033j;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    public String toString() {
        return "PushBody{groupId='" + this.f42026c + '\'' + ", extra='" + this.f42030g + '\'' + ", mNotificationChannelId='" + this.f42031h + '\'' + ", mIsPassThough=" + this.f42032i + ", msgData=" + this.f42033j + ", text='" + this.f42034k + '\'' + ", title='" + this.f42035l + '\'' + ", imageUrl='" + this.f42036m + '\'' + ", imageType=" + this.n + ", id=" + this.f42024a + ", open_url='" + this.o + '\'' + ", useLED=" + this.p + ", useSound=" + this.q + ", useVibrator=" + this.r + ", messageType=" + this.s + '}';
    }

    protected PushBody(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f42024a = parcel.readLong();
        this.f42025b = parcel.readLong();
        this.f42026c = parcel.readString();
        boolean z6 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f42027d = z;
        this.f42028e = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f42029f = z2;
        this.f42030g = parcel.readString();
        this.f42031h = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f42032i = z3;
        try {
            this.f42033j = new JSONObject(parcel.readString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f42034k = parcel.readString();
        this.f42035l = parcel.readString();
        this.f42036m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.p = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.q = z5;
        this.r = parcel.readByte() == 0 ? false : z6;
        this.s = parcel.readInt();
    }

    public PushBody(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.f42033j = jSONObject;
        this.o = jSONObject.optString("open_url");
        this.f42034k = jSONObject.optString("text");
        this.f42035l = jSONObject.optString("title");
        this.f42036m = jSONObject.optString("image_url");
        this.f42024a = jSONObject.optLong("id", 0);
        this.f42025b = jSONObject.optLong("rid64", 0);
        this.p = a(jSONObject, "use_led");
        this.q = a(jSONObject, "sound");
        this.r = a(jSONObject, "use_vibrator");
        boolean z3 = false;
        this.n = jSONObject.optInt("image_type", 0);
        if (jSONObject.optInt("pass_through", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f42032i = z;
        this.f42031h = jSONObject.optString("notify_channel");
        this.s = jSONObject.optInt("msg_from");
        this.f42026c = jSONObject.optString("group_id_str");
        if (jSONObject.optInt("st", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f42027d = z2;
        this.f42028e = jSONObject.optString("ttpush_sec_target_uid");
        this.f42029f = jSONObject.optInt("ttpush_need_filter_uid", 0) > 0 ? true : z3;
        this.f42030g = jSONObject.optString("extra_str");
    }

    private static boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return false;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f42024a);
        parcel.writeLong(this.f42025b);
        parcel.writeString(this.f42026c);
        parcel.writeByte(this.f42027d ? (byte) 1 : 0);
        parcel.writeString(this.f42028e);
        parcel.writeByte(this.f42029f ? (byte) 1 : 0);
        parcel.writeString(this.f42030g);
        parcel.writeString(this.f42031h);
        parcel.writeByte(this.f42032i ? (byte) 1 : 0);
        parcel.writeString(this.f42033j.toString());
        parcel.writeString(this.f42034k);
        parcel.writeString(this.f42035l);
        parcel.writeString(this.f42036m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeByte(this.p ? (byte) 1 : 0);
        parcel.writeByte(this.q ? (byte) 1 : 0);
        parcel.writeByte(this.r ? (byte) 1 : 0);
        parcel.writeInt(this.s);
    }
}
