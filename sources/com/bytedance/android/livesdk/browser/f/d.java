package com.bytedance.android.livesdk.browser.f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import c.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f14414a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f14415b;

    static {
        Covode.recordClassIndex(7986);
    }

    private d() {
        LinkedList linkedList = new LinkedList();
        this.f14415b = linkedList;
        linkedList.add(new e());
        this.f14415b.add(new c());
        this.f14415b.add(new a());
    }

    public static d a() {
        MethodCollector.i(8281);
        if (f14414a == null) {
            synchronized (d.class) {
                try {
                    if (f14414a == null) {
                        f14414a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8281);
                    throw th;
                }
            }
        }
        d dVar = f14414a;
        MethodCollector.o(8281);
        return dVar;
    }

    public static String a(String str) {
        Uri.Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str);
        return buildUpon.build().toString();
    }

    public static String a(Context context, Uri uri) {
        return a(a.a(context, uri));
    }

    public final WebResourceResponse a(String str, WebView webView) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        for (b bVar : this.f14415b) {
            WebResourceResponse a2 = bVar.a(parse, webView);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
