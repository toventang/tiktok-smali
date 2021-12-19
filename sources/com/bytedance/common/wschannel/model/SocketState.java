package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new Parcelable.Creator<SocketState>() {
        /* class com.bytedance.common.wschannel.model.SocketState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16069);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SocketState[] newArray(int i2) {
            return new SocketState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SocketState createFromParcel(Parcel parcel) {
            return new SocketState(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f27267a;

    /* renamed from: b  reason: collision with root package name */
    public int f27268b;

    /* renamed from: c  reason: collision with root package name */
    public String f27269c;

    /* renamed from: d  reason: collision with root package name */
    public int f27270d;

    /* renamed from: e  reason: collision with root package name */
    public int f27271e;

    /* renamed from: f  reason: collision with root package name */
    public String f27272f;

    /* renamed from: g  reason: collision with root package name */
    public int f27273g;

    public int describeContents() {
        return 0;
    }

    public SocketState() {
    }

    static {
        Covode.recordClassIndex(16068);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.f27270d);
            jSONObject.put(StringSet.type, this.f27267a);
            jSONObject.put("state", this.f27268b);
            jSONObject.put("url", this.f27269c);
            jSONObject.put("channel_type", this.f27271e);
            jSONObject.put("error", this.f27272f);
            jSONObject.put("error_code", this.f27273g);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "SocketState{connectionType=" + this.f27267a + ", connectionState=" + this.f27268b + ", connectionUrl='" + this.f27269c + '\'' + ", channelId=" + this.f27270d + ", channelType=" + this.f27271e + ", error='" + this.f27272f + '\'' + '}';
    }

    protected SocketState(Parcel parcel) {
        this.f27267a = parcel.readInt();
        this.f27268b = parcel.readInt();
        this.f27269c = parcel.readString();
        this.f27270d = parcel.readInt();
        this.f27271e = parcel.readInt();
        this.f27272f = parcel.readString();
        this.f27273g = parcel.readInt();
    }

    public static SocketState a(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.f27270d = jSONObject.optInt("channel_id", Integer.MIN_VALUE);
        socketState.f27267a = jSONObject.optInt(StringSet.type, -1);
        socketState.f27268b = jSONObject.optInt("state", -1);
        socketState.f27269c = jSONObject.optString("url", "");
        socketState.f27271e = jSONObject.optInt("channel_type");
        socketState.f27272f = jSONObject.optString("error", "");
        socketState.f27273g = jSONObject.optInt("error_code");
        return socketState;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27267a);
        parcel.writeInt(this.f27268b);
        parcel.writeString(this.f27269c);
        parcel.writeInt(this.f27270d);
        parcel.writeInt(this.f27271e);
        parcel.writeString(this.f27272f);
        parcel.writeInt(this.f27273g);
    }
}
