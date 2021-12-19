package com.ss.android.ugc.tiktok.security.b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.h;
import com.bytedance.ies.web.jsbridge2.b;
import com.bytedance.ies.web.jsbridge2.w;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public abstract class a implements c, d, e {
    static {
        Covode.recordClassIndex(98157);
    }

    @Override // com.ss.android.ugc.tiktok.security.b.d
    public String a(WebView webView, String str) {
        l.d(webView, "");
        if (a() == null) {
            return str;
        }
        f a2 = a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.ILoadURLProcessor");
        String a3 = ((d) a2).a(webView, str);
        return a3 == null ? str : a3;
    }

    @Override // com.ss.android.ugc.tiktok.security.b.e
    public p<String, Boolean> a(String str, LynxView lynxView) {
        if (a() == null) {
            return new p<>(str, true);
        }
        f a2 = a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.ILynxApiProcessor");
        return ((e) a2).a(str, lynxView);
    }

    @Override // com.ss.android.ugc.tiktok.security.b.c
    public void a(b bVar, w wVar) {
        if (a() != null) {
            f a2 = a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.IBridgeProcessor");
            ((c) a2).a(bVar, wVar);
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.b.c
    public void a(h hVar, List<String> list, JSONObject jSONObject) {
        if (a() != null) {
            f a2 = a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.IBridgeProcessor");
            ((c) a2).a(hVar, list, jSONObject);
        }
    }
}
