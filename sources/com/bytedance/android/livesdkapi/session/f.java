package com.bytedance.android.livesdkapi.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f23364a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, c> f23365b = new ConcurrentHashMap(10);

    static {
        Covode.recordClassIndex(13891);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static f f23366a = new f();

        static {
            Covode.recordClassIndex(13892);
        }
    }

    public final EnterRoomLinkSession a() {
        if (m.a(this.f23364a)) {
            JSONObject jSONObject = new JSONObject();
            EnterRoomLinkSession.a(jSONObject, "error_msg", Log.getStackTraceString(new Throwable("")));
            d.a("live_enter_room_session_null_error", new JSONObject(), null, jSONObject);
            a(new EnterRoomLinkSession(new EnterRoomConfig()).a(new Event("session_is_null", 4353, b.BussinessApiCall)));
        }
        return (EnterRoomLinkSession) this.f23365b.get(this.f23364a);
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.f23364a = bundle.getString("enter_room_session_id");
            EnterRoomLinkSession enterRoomLinkSession = (EnterRoomLinkSession) bundle.getParcelable("enter_room_session");
            if (enterRoomLinkSession != null) {
                this.f23365b.put(enterRoomLinkSession.a(), enterRoomLinkSession);
            }
        }
    }

    public final void a(EnterRoomLinkSession enterRoomLinkSession) {
        if (!TextUtils.isEmpty(this.f23364a) && TextUtils.equals(enterRoomLinkSession.f23353a, this.f23364a)) {
            this.f23365b.remove(this.f23364a);
        }
        String str = enterRoomLinkSession.f23353a;
        this.f23364a = str;
        this.f23365b.put(str, enterRoomLinkSession);
    }
}
