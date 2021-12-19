package com.facebook.core.a.a.a;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Set<a> f47160a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f47161b = new HashMap();

    static {
        Covode.recordClassIndex(28698);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f47164f = new int[2];

        /* renamed from: a  reason: collision with root package name */
        public final String f47165a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47166b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47167c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47168d;

        /* renamed from: e  reason: collision with root package name */
        public final int f47169e;

        static {
            Covode.recordClassIndex(28700);
        }

        public a(WebView webView) {
            this.f47165a = com.a.a("%s{%s}", new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())});
            int[] iArr = f47164f;
            webView.getLocationOnScreen(iArr);
            this.f47166b = iArr[0];
            this.f47167c = iArr[1];
            this.f47168d = webView.getWidth();
            this.f47169e = webView.getHeight();
        }
    }

    d() {
    }

    public final void a(PrintWriter printWriter) {
        try {
            for (a aVar : this.f47160a) {
                String str = this.f47161b.get(aVar.f47165a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(aVar);
                    printWriter.println(":");
                    String replace = str.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
                    printWriter.println(com.a.a("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", new Object[]{aVar.f47165a, Integer.valueOf(aVar.f47166b), Integer.valueOf(aVar.f47167c), Integer.valueOf(aVar.f47168d), Integer.valueOf(aVar.f47169e), replace.substring(1, replace.length() - 1)}));
                }
            }
        } catch (Exception unused) {
        }
        this.f47160a.clear();
        this.f47161b.clear();
    }
}
