package com.ss.android.ugc.aweme.im.sdk.common.controller.h.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f102327c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, j> f102328b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(65482);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65483);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f102329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f102330b;

        static {
            Covode.recordClassIndex(65484);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a.b
        public final void a() {
            j jVar = this.f102329a.f102328b.get(this.f102330b);
            if (jVar != null) {
                jVar.b();
                String str = this.f102330b;
                long c2 = jVar.c();
                String concat = "im_first_frame_".concat(String.valueOf(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("draw_time", c2);
                com.bytedance.apm.b.a(concat, new JSONObject(), jSONObject, (JSONObject) null);
            }
        }

        b(c cVar, String str) {
            this.f102329a = cVar;
            this.f102330b = str;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f102328b.put(str, j.a.a());
    }

    public final void a(View view, String str) {
        l.d(view, "");
        l.d(str, "");
        a.C2562a.a(view, new b(this, str));
    }
}
