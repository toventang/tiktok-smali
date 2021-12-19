package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.a;
import com.bytedance.ies.web.jsbridge2.n;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public WebView f35672a;

    /* renamed from: b  reason: collision with root package name */
    a f35673b;

    /* renamed from: c  reason: collision with root package name */
    public b f35674c;

    /* renamed from: d  reason: collision with root package name */
    public String f35675d;

    /* renamed from: e  reason: collision with root package name */
    public j f35676e;

    /* renamed from: f  reason: collision with root package name */
    public Context f35677f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f35678g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f35679h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f35680i;

    /* renamed from: j  reason: collision with root package name */
    final Set<q> f35681j;

    /* renamed from: k  reason: collision with root package name */
    public s f35682k;

    /* renamed from: l  reason: collision with root package name */
    public String f35683l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<String> f35684m;
    public final Set<String> n;
    public boolean o;
    public boolean p;
    public n.c q;
    n.d r;
    public List<TimeLineEvent> s;
    public boolean t;
    public boolean u;

    static {
        Covode.recordClassIndex(21300);
    }

    public final l a() {
        this.f35680i = true;
        return this;
    }

    public final l b() {
        this.f35679h = true;
        return this;
    }

    public final l c() {
        this.p = true;
        return this;
    }

    l() {
        this.f35675d = "IESJSBridge";
        this.f35681j = new LinkedHashSet();
        this.f35683l = "host";
        this.f35684m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.s = new CopyOnWriteArrayList();
        this.t = true;
    }

    private void e() {
        if (!(this.f35672a == null && !this.o && this.f35674c == null) && ((!TextUtils.isEmpty(this.f35675d) || this.f35672a == null) && this.f35676e != null)) {
            a(this.f35678g, this.t, this.f35672a);
            return;
        }
        throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
    }

    public final x d() {
        boolean z;
        e();
        TimeLineEvent.a a2 = new TimeLineEvent.a().a("jsObjectName", this.f35675d).a("debug", Boolean.valueOf(this.f35678g)).a("shouldFlattenData", Boolean.valueOf(this.f35679h)).a("enablePermissionCheck", Boolean.valueOf(this.f35680i)).a("namespace", this.f35683l).a("safeHostSet", this.f35684m).a("publicMethodSet", this.n).a("dummy", Boolean.valueOf(this.o));
        if (this.q != null) {
            z = true;
        } else {
            z = false;
        }
        TimeLineEvent.a a3 = a2.a("jsbPermissionValidator", Boolean.valueOf(z)).a("disableAllPermissionCheck", Boolean.valueOf(this.p)).a("isShowDebugToast", Boolean.valueOf(this.t));
        WebView webView = this.f35672a;
        if (webView != null) {
            a3.a("webView", webView.getClass().getSimpleName());
        }
        a3.a(TimeLineEvent.b.aj, this.s);
        return new x(this);
    }

    public final l a(n.c cVar) {
        this.q = cVar;
        return this;
    }

    public final l b(q qVar) {
        this.f35681j.add(qVar);
        return this;
    }

    public final l a(o oVar) {
        j a2 = j.a(oVar);
        this.f35676e = a2;
        a2.f35670b = this.u;
        return this;
    }

    public final l b(Collection<String> collection) {
        this.n.addAll(collection);
        return this;
    }

    public final l a(q qVar) {
        return b(qVar);
    }

    l(WebView webView) {
        this.f35675d = "IESJSBridge";
        this.f35681j = new LinkedHashSet();
        this.f35683l = "host";
        this.f35684m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.s = new CopyOnWriteArrayList();
        this.t = true;
        this.f35672a = webView;
        this.f35673b = new a.C0808a(webView);
    }

    public final l a(String str) {
        this.f35675d = str;
        return this;
    }

    public l(a aVar) {
        this.f35675d = "IESJSBridge";
        this.f35681j = new LinkedHashSet();
        this.f35683l = "host";
        this.f35684m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.s = new CopyOnWriteArrayList();
        this.t = true;
        this.f35673b = aVar;
    }

    public final l a(Collection<String> collection) {
        this.f35684m.addAll(collection);
        return this;
    }

    l(l lVar) {
        this.f35675d = "IESJSBridge";
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f35681j = linkedHashSet;
        this.f35683l = "host";
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f35684m = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.n = linkedHashSet3;
        this.s = new CopyOnWriteArrayList();
        this.t = true;
        this.f35672a = lVar.f35672a;
        this.f35673b = lVar.f35673b;
        this.f35675d = lVar.f35675d;
        this.f35676e = lVar.f35676e;
        this.f35677f = lVar.f35677f;
        this.f35678g = lVar.f35678g;
        this.f35679h = lVar.f35679h;
        this.f35680i = lVar.f35680i;
        linkedHashSet.addAll(lVar.f35681j);
        this.f35683l = lVar.f35683l;
        linkedHashSet2.addAll(lVar.f35684m);
        linkedHashSet3.addAll(lVar.n);
        this.o = lVar.o;
        this.f35674c = lVar.f35674c;
        this.f35682k = lVar.f35682k;
        this.p = lVar.p;
        this.t = lVar.t;
        this.u = lVar.u;
    }

    public final l a(boolean z) {
        this.f35678g = z;
        return this;
    }

    public static void a(boolean z, boolean z2, WebView webView) {
        if (z && z2 && webView != null && !(webView instanceof t)) {
            webView.post(new m(webView));
        }
    }
}
