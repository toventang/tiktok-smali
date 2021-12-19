package com.bytedance.webx.i.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.i.a.b;
import com.bytedance.webx.i.d.c;
import com.bytedance.webx.i.e.d;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a implements b {
    static {
        Covode.recordClassIndex(28151);
    }

    protected static boolean c(String str) {
        "needBuildSecLink : ".concat(String.valueOf(str));
        com.bytedance.webx.i.e.a.a("AbsSecStrategy");
        if (!com.bytedance.webx.i.a.f46037c) {
            com.bytedance.webx.i.e.a.a("AbsSecStrategy");
            return false;
        } else if (!d.b(str)) {
            com.bytedance.webx.i.e.a.a("AbsSecStrategy");
            return false;
        } else {
            com.bytedance.webx.i.c.a aVar = com.bytedance.webx.i.a.f46036b;
            if (!(aVar.f46061d == null || str == null)) {
                for (String str2 : aVar.f46061d) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.equals(parse.getHost(), str2) || parse.getHost().endsWith(".".concat(String.valueOf(str2)))) {
                            com.bytedance.webx.i.e.a.a("AbsSecStrategy");
                            return false;
                        }
                    }
                }
            }
            com.bytedance.webx.i.d.b b2 = com.bytedance.webx.i.b.a.a().b(str);
            if (b2 == null || b2.f46065c) {
                if (System.currentTimeMillis() - c.a().f46075d >= c.f46070g) {
                    return true;
                }
                com.bytedance.webx.i.e.a.a("AbsSecStrategy");
                return false;
            }
            try {
                new JSONObject().put("url", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.webx.i.e.a.a("AbsSecStrategy");
            return false;
        }
    }

    protected static boolean a(WebView webView, boolean z) {
        WebBackForwardList copyBackForwardList;
        WebHistoryItem currentItem;
        if (!(!com.bytedance.webx.i.a.f46037c || (copyBackForwardList = webView.copyBackForwardList()) == null || (currentItem = copyBackForwardList.getCurrentItem()) == null || com.bytedance.webx.i.a.f46036b == null)) {
            if (currentItem.getUrl().startsWith(com.bytedance.webx.i.a.f46036b.f46060c)) {
                return webView.canGoBackOrForward(-2);
            }
            if (copyBackForwardList.getSize() == 2 && d.a(copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl())) {
                return webView.canGoBackOrForward(-2);
            }
        }
        return z;
    }
}
