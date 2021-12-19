package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.at.k;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import org.json.JSONObject;

public final class bs extends e<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    private b f14644a;

    static {
        Covode.recordClassIndex(8132);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14644a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, Context context) {
        if (aVar != null) {
            if (!u.a().b().e()) {
                if (context instanceof androidx.fragment.app.e) {
                    f b2 = u.a().b();
                    j.a a2 = j.a();
                    a2.f14158a = y.a((int) R.string.gw3);
                    a2.f14160c = -1;
                    a2.f14162e = "search_result";
                    a2.f14161d = "recommend";
                    a2.f14163f = "follow";
                    this.f14644a = b2.a(context, a2.a()).a(new bu(this, aVar, context), new bv(this));
                }
            } else if (aVar.f23025g) {
                this.f14644a = u.a().b().a(((d.a) new d.b().a(aVar.f23019a)).b(aVar.f23020b).c(aVar.f23021c).c()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new bw(this), new bx(this));
            } else {
                this.f14644a = u.a().b().a(((k.b) ((k.a) new k.b().a(aVar.f23019a)).a(aVar.f23021c).a(aVar.f23023e)).c()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new by(this), new bz(this));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        if (optJSONObject == null) {
            finishWithFailure();
        } else if (TextUtils.equals("follow", optString)) {
            Context context = gVar.f35646a;
            long parseLong = Long.parseLong(optJSONObject.getString("user_id"));
            long j2 = 0;
            try {
                j2 = Long.parseLong(optJSONObject.getString("room_id"));
            } catch (Exception e2) {
                i.b();
                com.bytedance.android.live.core.c.a.a(5, "ttlive_exception", e2.getStackTrace());
            }
            String string = optJSONObject.getString("from_label");
            String optString2 = optJSONObject.optString("url");
            a aVar = new a();
            aVar.f23024f = a.EnumC0505a.FromWeb;
            aVar.f23019a = parseLong;
            aVar.f23020b = j2;
            aVar.f23022d = optString2;
            aVar.f23021c = string;
            aVar.f23025g = true;
            a(aVar, context);
        } else if (TextUtils.equals("unfollow", optString)) {
            Context context2 = gVar.f35646a;
            long parseLong2 = Long.parseLong(optJSONObject.getString("user_id"));
            String optString3 = optJSONObject.optString("from_label", "");
            u.a().b().a(y.a((int) R.string.gn8), new bt(this, optJSONObject, parseLong2, optJSONObject.optString("url", ""), optString3, context2), context2, optString3, "", parseLong2);
        } else {
            finishWithFailure();
        }
    }
}
