package com.bytedance.android.livesdkapi.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() {
        /* class com.bytedance.android.livesdkapi.session.Event.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13884);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Event[] newArray(int i2) {
            return new Event[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f23358a = new JSONObject();

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(13883);
    }

    public final Event a() {
        a(this.f23358a, "has_warmed_up", "true");
        return this;
    }

    public final Event a(String str) {
        a(this.f23358a, "status_msg", str);
        return this;
    }

    protected Event(Parcel parcel) {
        try {
            this.f23358a = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            this.f23358a = new JSONObject();
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23358a.toString());
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            a.a(6, "Event", e2.getMessage());
        }
    }

    public Event(String str, int i2, b bVar) {
        a(this.f23358a, "service", !str.startsWith("ttlive_") ? "ttlive_".concat(String.valueOf(str)) : str);
        a(this.f23358a, "timestamp", String.valueOf(SystemClock.elapsedRealtime()));
        a(this.f23358a, "event_module", "enter_room");
        a(this.f23358a, "status_code", String.valueOf(i2));
        a(this.f23358a, "event_type", bVar.getType());
    }
}
