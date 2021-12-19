package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settings.aa;
import com.ss.android.ugc.aweme.settings.z;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;

public class b extends WebChromeClient {

    /* renamed from: d  reason: collision with root package name */
    public static final a f78878d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h f78879a = i.a((h.f.a.a) C1833b.f78881a);

    /* renamed from: c  reason: collision with root package name */
    public boolean f78880c = true;

    static {
        Covode.recordClassIndex(48948);
    }

    private final z a() {
        return (z) this.f78879a.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48949);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b$b  reason: collision with other inner class name */
    static final class C1833b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1833b f78881a = new C1833b();

        static {
            Covode.recordClassIndex(48950);
        }

        C1833b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            return aa.a();
        }
    }

    private final boolean a(String str) {
        int i2;
        boolean z;
        String[] strArr;
        if (str == null) {
            return false;
        }
        if (a() == null) {
            return this.f78880c;
        }
        z a2 = a();
        if (a2 != null) {
            i2 = a2.f123148a;
        } else {
            i2 = 1;
        }
        z a3 = a();
        if (a3 != null && (strArr = a3.f123149b) != null) {
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (p.a((CharSequence) str, (CharSequence) strArr[i3], false)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (this.f78880c || i2 == 0 || i2 != 1 || z) {
                return false;
            }
            return true;
        }
        z = false;
        if (this.f78880c) {
        }
        return false;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (a(str)) {
            return false;
        }
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
