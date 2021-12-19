package com.ss.android.ugc.aweme.choosemusic.bullet.jsb;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.t;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ShootMusicMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f70400b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f70401c = "shootMusic";

    static {
        Covode.recordClassIndex(43419);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43420);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.gson.b.a<Music> {
        static {
            Covode.recordClassIndex(43421);
        }

        b() {
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f70401c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShootMusicMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    private static Music b(String str) {
        try {
            Type type = new b().type;
            GsonProvider c2 = GsonHolder.c();
            l.b(c2, "");
            return (Music) c2.b().a(str, type);
        } catch (t e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("music", "");
            if (!TextUtils.isEmpty(optString)) {
                l.b(optString, "");
                Music b2 = b(optString);
                if (b2 != null) {
                    c.a(new com.ss.android.ugc.aweme.search.f.b(b2));
                }
            }
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
