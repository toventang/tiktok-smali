package com.ss.android.ugc.aweme.kids.a.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.g.a.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class d implements c {
    static {
        Covode.recordClassIndex(67510);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105323a = new a();

        static {
            Covode.recordClassIndex(67511);
        }

        a() {
        }

        public final void run() {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.h5u).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.c
    public final void a(f fVar, b bVar, HashMap<String, HashMap<String, Object>> hashMap, JSONObject jSONObject) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(hashMap, "");
        l.d(jSONObject, "");
        if (bVar == b.NO_NETWORK && fVar.b()) {
            m.a(a.f105323a);
        }
        try {
            o.a("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
