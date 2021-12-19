package com.bytedance.ies.web.jsbridge2;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.e;
import com.bytedance.ies.web.a.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public class y implements e, u {

    /* renamed from: a  reason: collision with root package name */
    public final a f35719a;

    /* renamed from: b  reason: collision with root package name */
    private final b f35720b;

    /* renamed from: c  reason: collision with root package name */
    private final x f35721c;

    /* renamed from: d  reason: collision with root package name */
    private final aa f35722d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, d> f35723e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f35724f;

    static {
        Covode.recordClassIndex(21323);
    }

    public final y b(String str) {
        this.f35719a.f35514e = str;
        return this;
    }

    public final y a(WebChromeClient webChromeClient) {
        this.f35719a.a(webChromeClient);
        return this;
    }

    public final y b(List<String> list) {
        this.f35719a.f35515f = list;
        this.f35720b.f35637l.f35652b.a(list);
        return this;
    }

    public final y a(WebViewClient webViewClient) {
        this.f35719a.a(webViewClient);
        return this;
    }

    public final y a(List<String> list) {
        this.f35719a.f35516g = list;
        this.f35720b.f35637l.f35652b.b(list);
        for (String str : list) {
            d dVar = this.f35723e.get(str);
            if (dVar != null) {
                dVar.f35645a = ai.PUBLIC;
            }
        }
        return this;
    }

    @Override // com.bytedance.ies.web.jsbridge2.u
    public final void a(u uVar) {
        if (uVar instanceof y) {
            y yVar = (y) uVar;
            this.f35723e.putAll(yVar.f35723e);
            this.f35724f.addAll(yVar.f35724f);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.u
    public final void a(String str) {
        this.f35724f.remove(str);
        aa aaVar = this.f35722d;
        if (aaVar != null) {
            this.f35719a.a(str, aaVar);
        }
    }

    public static y a(WebView webView, x xVar) {
        return new y(webView, xVar);
    }

    private y(WebView webView, x xVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f35724f = copyOnWriteArraySet;
        this.f35721c = xVar;
        b bVar = xVar.f35711b;
        this.f35720b = bVar;
        a a2 = a.a(webView);
        a2.f35520k = true;
        this.f35719a = a2;
        if (bVar instanceof am) {
            this.f35722d = new aa((am) bVar, copyOnWriteArraySet);
        } else {
            this.f35722d = null;
        }
    }

    public final y a(String str, d dVar) {
        aa aaVar = this.f35722d;
        if (aaVar != null) {
            this.f35719a.a(str, aaVar);
        }
        p pVar = new p(dVar);
        this.f35720b.f35637l.a(str, (d) pVar);
        this.f35723e.put(str, pVar);
        return this;
    }

    @Override // com.bytedance.ies.web.a.e
    public final void a(List<String> list, h hVar, JSONObject jSONObject) {
        this.f35719a.a(list, hVar, jSONObject);
    }
}
