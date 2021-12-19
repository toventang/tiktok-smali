package com.bytedance.webx.monitor.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.d.e;
import com.bytedance.android.monitor.d.f;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.al;
import com.bytedance.ies.web.jsbridge2.q;
import com.bytedance.ies.web.jsbridge2.w;
import java.lang.ref.SoftReference;

public class a implements q {

    /* renamed from: c  reason: collision with root package name */
    public SoftReference<WebView> f46100c;

    static {
        Covode.recordClassIndex(28175);
    }

    public static int a(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i3;
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(w wVar, int i2) {
    }

    public a(WebView webView) {
        this.f46100c = new SoftReference<>(webView);
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public void a(final String str) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.webx.monitor.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28176);
            }

            public final void run() {
                WebView webView = a.this.f46100c.get();
                if (webView != null && !TextUtils.isEmpty(str)) {
                    f fVar = new f();
                    fVar.f23468a = str;
                    fVar.f23469b = 0;
                    fVar.f23473f = 0;
                    if (fVar.f23473f != 0) {
                        fVar.f23474g = elapsedRealtime;
                        fVar.f23472e = fVar.f23474g - fVar.f23473f;
                    }
                    i.f23764a.a(webView, fVar);
                }
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public void a(final String str, final al alVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.webx.monitor.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28177);
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 109
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.monitor.a.a.AnonymousClass2.run():void");
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(String str, String str2, int i2) {
        b(str, str2, i2);
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public void b(String str, final String str2, final int i2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.webx.monitor.a.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(28178);
            }

            public final void run() {
                WebView webView = a.this.f46100c.get();
                if (webView != null && !TextUtils.isEmpty(str2)) {
                    f fVar = new f();
                    fVar.f23468a = str2;
                    fVar.f23469b = a.a(i2);
                    fVar.f23473f = 0;
                    if (fVar.f23473f != 0) {
                        fVar.f23474g = elapsedRealtime;
                        fVar.f23472e = fVar.f23474g - fVar.f23473f;
                    }
                    i.f23764a.a(webView, fVar);
                    e eVar = new e();
                    eVar.f23463c = str2;
                    eVar.f23461a = a.a(i2);
                    i.f23764a.a(webView, eVar);
                }
            }
        });
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public void a(String str, final String str2, final int i2, final String str3, final al alVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.webx.monitor.a.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(28179);
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 144
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.monitor.a.a.AnonymousClass4.run():void");
            }
        });
    }
}
