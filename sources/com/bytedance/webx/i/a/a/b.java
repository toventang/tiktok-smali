package com.bytedance.webx.i.a.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.i.d.a;
import com.bytedance.webx.i.d.c;
import com.bytedance.webx.i.d.d;
import com.bytedance.webx.i.e.d;
import java.util.concurrent.TimeUnit;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public WebView f46038a;

    /* renamed from: b  reason: collision with root package name */
    public String f46039b;

    /* renamed from: c  reason: collision with root package name */
    public String f46040c;

    /* renamed from: d  reason: collision with root package name */
    public String f46041d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f46042e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public a f46043f = new a() {
        /* class com.bytedance.webx.i.a.a.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(28154);
        }

        @Override // com.bytedance.webx.i.d.a
        public final void a(final String str, com.bytedance.webx.i.d.b bVar) {
            if (bVar != null && bVar.f46065c) {
                b.this.f46042e.post(new Runnable() {
                    /* class com.bytedance.webx.i.a.a.b.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28155);
                    }

                    public final void run() {
                        MethodCollector.i(11571);
                        try {
                            if (b.this.f46038a == null || b.this.f46038a == null || !str.equals(b.this.f46040c)) {
                                com.bytedance.webx.i.e.a.b("AsyncSecStrategy");
                                MethodCollector.o(11571);
                                return;
                            }
                            b.this.f46038a.loadUrl(d.a(str, b.this.f46039b, -1));
                            MethodCollector.o(11571);
                        } catch (Exception unused) {
                            com.bytedance.webx.i.e.a.d("AsyncSecStrategy");
                            MethodCollector.o(11571);
                        }
                    }
                });
            }
            b.this.f46041d = str;
            com.bytedance.webx.i.e.a.b("AsyncSecStrategy");
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private boolean f46044g = true;

    /* renamed from: h  reason: collision with root package name */
    private String f46045h;

    static {
        Covode.recordClassIndex(28152);
    }

    @Override // com.bytedance.webx.i.a.b
    public final boolean b() {
        return a(this.f46038a, true);
    }

    @Override // com.bytedance.webx.i.a.b
    public final void a() {
        this.f46044g = true;
        this.f46045h = null;
        this.f46040c = null;
        this.f46041d = null;
        com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
    }

    @Override // com.bytedance.webx.i.a.b
    public final boolean c() {
        if (!a(this.f46038a, false)) {
            return false;
        }
        this.f46038a.goBackOrForward(-2);
        com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
        this.f46041d = null;
        return true;
    }

    private int e(String str) {
        if (d.a(this.f46045h, str)) {
            return 1;
        }
        if (!this.f46044g) {
            return 3;
        }
        this.f46044g = false;
        return 2;
    }

    @Override // com.bytedance.webx.i.a.b
    public final boolean b(String str) {
        try {
            d(str);
            if (!d.a(this.f46041d, str)) {
                return a(str, e(str), true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void d(String str) {
        if (d.a(this.f46041d, str) && d.a(this.f46045h, str)) {
            com.bytedance.webx.i.d.b bVar = new com.bytedance.webx.i.d.b();
            bVar.f46065c = false;
            bVar.f46064b = 0;
            com.bytedance.webx.i.b.a.a().a(str, bVar);
            "handleLoadUrl save first check in cache :".concat(String.valueOf(str));
            com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
        }
        if (d.b(str)) {
            this.f46040c = str;
        }
    }

    @Override // com.bytedance.webx.i.a.b
    public final void a(String str) {
        "handleOverrideUrlLoading :".concat(String.valueOf(str));
        com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
        try {
            d(str);
            if (!d.a(this.f46041d, str)) {
                a(str, e(str), false);
            }
        } catch (Exception unused) {
        }
    }

    private void b(final String str, final int i2) {
        this.f46042e.postDelayed(new Runnable() {
            /* class com.bytedance.webx.i.a.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28153);
            }

            public final void run() {
                if (str == null || b.this.f46038a == null || !str.equals(b.this.f46040c)) {
                    com.bytedance.webx.i.e.a.b("AsyncSecStrategy");
                    return;
                }
                com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
                String str = str;
                String str2 = b.this.f46039b;
                int i2 = i2;
                a aVar = b.this.f46043f;
                d.a aVar2 = new d.a();
                aVar2.f46090a = com.bytedance.webx.i.a.f46036b.f46058a;
                aVar2.f46093d = com.bytedance.webx.i.a.f46036b.f46059b;
                aVar2.f46092c = str;
                aVar2.f46091b = str2;
                aVar2.f46095f = aVar;
                aVar2.f46096g = i2;
                com.bytedance.webx.i.d.d a2 = aVar2.a();
                c a3 = c.a();
                String str3 = a2.f46083c;
                if (TextUtils.isEmpty(str3)) {
                    com.bytedance.webx.i.e.a.c("CheckUrlSecManager");
                } else if (com.bytedance.webx.i.e.d.a(str3)) {
                    com.bytedance.webx.i.e.a.c("CheckUrlSecManager");
                } else if (com.bytedance.webx.i.b.a.a().a(a2.f46083c)) {
                    com.bytedance.webx.i.e.a.c("CheckUrlSecManager");
                } else {
                    a3.a(a2);
                }
            }
        }, 100);
    }

    public b(WebView webView, String str) {
        this.f46038a = webView;
        this.f46039b = str;
    }

    private boolean a(String str, int i2) {
        MethodCollector.i(12996);
        String str2 = this.f46039b;
        d.a aVar = new d.a();
        aVar.f46090a = com.bytedance.webx.i.a.f46036b.f46058a;
        aVar.f46093d = com.bytedance.webx.i.a.f46036b.f46059b;
        aVar.f46092c = str;
        aVar.f46091b = str2;
        aVar.f46096g = i2;
        aVar.f46094e = true;
        try {
            com.bytedance.webx.i.d.b bVar = c.a().b(aVar.a()).get(com.bytedance.webx.i.a.f46036b.f46062e, TimeUnit.MILLISECONDS);
            if (!bVar.f46063a || !bVar.f46065c) {
                "onFail url : ".concat(String.valueOf(str));
                com.bytedance.webx.i.e.a.c("AsyncSecStrategy");
                MethodCollector.o(12996);
                return false;
            }
            this.f46038a.loadUrl(com.bytedance.webx.i.e.d.a(str, this.f46039b, bVar.f46064b));
            this.f46041d = str;
            com.bytedance.webx.i.e.a.b("AsyncSecStrategy");
            MethodCollector.o(12996);
            return true;
        } catch (Exception unused) {
            MethodCollector.o(12996);
            return false;
        }
    }

    private boolean a(String str, int i2, boolean z) {
        MethodCollector.i(13088);
        com.bytedance.webx.i.d.b b2 = com.bytedance.webx.i.b.a.a().b(str);
        if (b2 == null) {
            if (!c(str)) {
                MethodCollector.o(13088);
                return false;
            } else if (z) {
                boolean a2 = a(str, i2);
                MethodCollector.o(13088);
                return a2;
            } else {
                b(str, i2);
                MethodCollector.o(13088);
                return false;
            }
        } else if (b2.f46065c) {
            "checkUrlSafely : jump seclink page directly : ".concat(String.valueOf(str));
            com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
            this.f46038a.loadUrl(com.bytedance.webx.i.e.d.a(str, this.f46039b, -1));
            MethodCollector.o(13088);
            return true;
        } else {
            "checkUrlSafely : safe url : ".concat(String.valueOf(str));
            com.bytedance.webx.i.e.a.a("AsyncSecStrategy");
            MethodCollector.o(13088);
            return false;
        }
    }
}
