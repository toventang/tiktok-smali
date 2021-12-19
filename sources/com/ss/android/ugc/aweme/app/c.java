package com.ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f66675a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66676b = new a((byte) 0);

    static {
        Covode.recordClassIndex(41046);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41047);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, Uri uri) {
            String str2;
            if (uri != null) {
                str2 = uri.getQueryParameter("gd_label");
            } else {
                str2 = null;
            }
            j a2 = j.a();
            l.b(a2, "");
            a2.f66809b = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("land_position", str);
                r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName(str2).setJsonObject(jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (c.f66675a) {
                r.a("open_url", new d().a("enter_to", str).a("url", String.valueOf(uri)).f66730a);
                c.f66675a = false;
            }
        }
    }
}
