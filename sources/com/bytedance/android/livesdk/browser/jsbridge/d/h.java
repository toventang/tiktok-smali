package com.bytedance.android.livesdk.browser.jsbridge.d;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.e;
import com.bytedance.android.live.share.a;
import com.bytedance.android.live.share.c;
import com.bytedance.android.livesdk.browser.i.b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.a.d;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f14474a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<bg.a> f14475b;

    static {
        Covode.recordClassIndex(8026);
    }

    public h(WeakReference<Context> weakReference, bg.a aVar) {
        this.f14474a = weakReference;
        this.f14475b = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
        b c2;
        JSONObject jSONObject2 = hVar.f35533d;
        if (jSONObject2 != null) {
            jSONObject2.optString("title");
            jSONObject2.optString("desc");
            jSONObject2.optString("image");
            jSONObject2.optString("url");
            String optString = jSONObject2.optString("platform");
            String optString2 = jSONObject2.optString(StringSet.type);
            WeakReference<Context> weakReference = this.f14474a;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if (!m.a(optString) && context != null) {
                int i2 = 0;
                if ("live_room".equals(optString2)) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("url_extra");
                    HashMap hashMap = new HashMap();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = optJSONObject.get(next);
                            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                hashMap.put(next, String.valueOf(obj));
                            }
                        }
                    }
                    Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    if (room == null || room.getShareUrl() == null) {
                        jSONObject.put("code", 0);
                        return;
                    }
                    Uri.Builder buildUpon = Uri.parse(room.getShareUrl()).buildUpon();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(u.a().b().c()));
                    a share = ((c) com.bytedance.android.live.t.a.a(c.class)).share();
                    e a2 = p.a(context);
                    c.a a3 = com.bytedance.android.livesdkapi.depend.e.c.a(room);
                    a3.f22978a = optString;
                    a3.A = hashMap;
                    a3.f22989l = buildUpon.toString();
                    share.a(a2, a3.a());
                    jSONObject.put("code", 1);
                } else if ("open_platform".equals(optString2)) {
                    a share2 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
                    e a4 = p.a(context);
                    c.a a5 = com.bytedance.android.livesdkapi.depend.e.c.a();
                    a5.f22978a = optString;
                    a5.C = true;
                    share2.a(a4, a5.a());
                    jSONObject.put("code", 1);
                } else {
                    if (!(this.f14475b.get() == null || (c2 = this.f14475b.get().c()) == null || c2.f14431d == null)) {
                        Uri.Builder buildUpon2 = Uri.parse(c2.f14431d).buildUpon();
                        buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(u.a().b().c()));
                        a share3 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
                        e a6 = p.a(context);
                        c.a a7 = com.bytedance.android.livesdkapi.depend.e.c.a();
                        a7.f22978a = optString;
                        a7.f22990m = c2.f14428a;
                        a7.n = c2.f14429b;
                        a7.o = c2.f14430c;
                        a7.f22989l = buildUpon2.toString();
                        share3.a(a6, a7.a());
                        i2 = 1;
                    }
                    jSONObject.put("code", i2);
                }
            }
        }
    }
}
