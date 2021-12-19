package com.bytedance.android.livesdkapi.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EnterRoomLinkSession implements ILinkSession {
    public static final Parcelable.Creator<EnterRoomLinkSession> CREATOR = new Parcelable.Creator<EnterRoomLinkSession>() {
        /* class com.bytedance.android.livesdkapi.session.EnterRoomLinkSession.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13882);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EnterRoomLinkSession[] newArray(int i2) {
            return new EnterRoomLinkSession[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnterRoomLinkSession createFromParcel(Parcel parcel) {
            return new EnterRoomLinkSession(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final String f23353a;

    /* renamed from: b  reason: collision with root package name */
    public EnterRoomConfig f23354b;

    /* renamed from: c  reason: collision with root package name */
    private List<Event> f23355c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f23356d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f23357e;

    @Override // com.bytedance.android.livesdkapi.session.ILinkSession
    public final String c() {
        return "ttlive_room_enter_link_monitor";
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.session.c
    public final String a() {
        return this.f23353a;
    }

    static {
        Covode.recordClassIndex(13881);
    }

    @Override // com.bytedance.android.livesdkapi.session.ILinkSession
    public final JSONObject b() {
        a(this.f23356d, "event_session_id", this.f23353a);
        EnterRoomConfig enterRoomConfig = this.f23354b;
        if (enterRoomConfig != null) {
            a(this.f23356d, "enter_from", enterRoomConfig.f23299c.J);
            a(this.f23356d, "room_id", new StringBuilder().append(this.f23354b.f23299c.R).toString());
            a(this.f23356d, "user_id", this.f23354b.f23299c.D);
            a(this.f23356d, "anchor_id", this.f23354b.f23298b.f23310b);
            a(this.f23356d, "enter_method", this.f23354b.f23299c.L);
            a(this.f23356d, "action_type", this.f23354b.f23299c.ab);
            a(this.f23356d, "live_window_mode", this.f23354b.f23299c.W);
            a(this.f23356d, "from_auto_jump", String.valueOf(this.f23354b.f23299c.ak ? 1 : 0));
        }
        for (Event event : this.f23355c) {
            Iterator<String> keys = event.f23358a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!this.f23356d.has(next) && (!this.f23357e.contains(next))) {
                    a(this.f23356d, next, event.f23358a.optString(next));
                }
            }
        }
        if (this.f23355c.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < this.f23355c.size(); i2++) {
                a(this.f23355c.get(i2).f23358a, "event_session_id", this.f23353a);
                try {
                    jSONArray.put(i2, this.f23355c.get(i2).f23358a);
                } catch (JSONException e2) {
                    a.a(6, "EnterRoomLinkSession", e2.getMessage());
                }
            }
            try {
                this.f23356d.put("event_list", jSONArray);
            } catch (JSONException e3) {
                a.a(6, "EnterRoomLinkSession", e3.getMessage());
            }
        }
        return this.f23356d;
    }

    public static EnterRoomLinkSession a(EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        f.a.f23366a.a(enterRoomLinkSession);
        return enterRoomLinkSession;
    }

    public EnterRoomLinkSession(EnterRoomConfig enterRoomConfig) {
        this.f23355c = new CopyOnWriteArrayList();
        this.f23356d = new JSONObject();
        this.f23357e = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.f23353a = UUID.randomUUID().toString();
        this.f23354b = enterRoomConfig;
    }

    protected EnterRoomLinkSession(Parcel parcel) {
        this.f23355c = new CopyOnWriteArrayList();
        this.f23356d = new JSONObject();
        this.f23357e = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.f23353a = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f23355c = arrayList;
        parcel.readList(arrayList, Event.class.getClassLoader());
        this.f23354b = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
        try {
            this.f23356d = new JSONObject(parcel.readString());
        } catch (Throwable unused) {
            this.f23356d = new JSONObject();
        }
        this.f23357e = parcel.createStringArrayList();
    }

    public final EnterRoomLinkSession a(Event event) {
        this.f23355c.add(event);
        if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isOffline()) {
            a.a(3, "ttlive_room_enter_link_monitor", event.f23358a.toString());
        }
        int intValue = Integer.valueOf(event.f23358a.optString("status_code")).intValue();
        if (intValue > 32768) {
            EnterRoomLinkSession a2 = f.a.f23366a.a();
            if (d.a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
                g.b(new e(a2, intValue));
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23353a);
        parcel.writeList(this.f23355c);
        parcel.writeParcelable(this.f23354b, i2);
        parcel.writeString(this.f23356d.toString());
        parcel.writeStringList(this.f23357e);
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            a.a(6, "EnterRoomLinkSession", e2.getMessage());
        }
    }
}
