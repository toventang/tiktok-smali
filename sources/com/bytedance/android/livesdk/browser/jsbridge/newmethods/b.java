package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.zhiliaoapp.musically.R;

public final class b extends e<a, C0314b> {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.livesdk.l.b f14534a;

    static {
        Covode.recordClassIndex(8087);
    }

    static final class a {
        @c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        String f14535a;
        @c(a = "content")

        /* renamed from: b  reason: collision with root package name */
        String f14536b;
        @c(a = "confirmText")

        /* renamed from: c  reason: collision with root package name */
        String f14537c;
        @c(a = "showCancel")

        /* renamed from: d  reason: collision with root package name */
        boolean f14538d;
        @c(a = "cancelText")

        /* renamed from: e  reason: collision with root package name */
        String f14539e;

        static {
            Covode.recordClassIndex(8088);
        }

        a() {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        com.bytedance.android.livesdk.l.b bVar = this.f14534a;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f14534a = null;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b  reason: collision with other inner class name */
    static final class C0314b {
        @c(a = "data")

        /* renamed from: a  reason: collision with root package name */
        a f14540a;

        static {
            Covode.recordClassIndex(8089);
        }

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b$a */
        static final class a {
            @c(a = "confirm")

            /* renamed from: a  reason: collision with root package name */
            boolean f14541a;
            @c(a = "cancel")

            /* renamed from: b  reason: collision with root package name */
            boolean f14542b;

            static {
                Covode.recordClassIndex(8090);
            }

            a(boolean z) {
                this.f14541a = z;
                this.f14542b = !z;
            }
        }

        private C0314b(boolean z) {
            this.f14540a = new a(z);
        }

        /* synthetic */ C0314b(boolean z, byte b2) {
            this(z);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, g gVar) {
        String str;
        String str2;
        a aVar2 = aVar;
        b.a aVar3 = new b.a(gVar.f35646a);
        aVar3.f18285b = aVar2.f14536b;
        if (!TextUtils.isEmpty(aVar2.f14535a)) {
            aVar3.f18284a = aVar2.f14535a;
        }
        if (TextUtils.isEmpty(aVar2.f14537c)) {
            str = y.a((int) R.string.gwr);
        } else {
            str = aVar2.f14537c;
        }
        aVar3.a((CharSequence) str, (DialogInterface.OnClickListener) new c(this), false);
        if (aVar2.f14538d) {
            if (TextUtils.isEmpty(aVar2.f14539e)) {
                str2 = y.a((int) R.string.gle);
            } else {
                str2 = aVar2.f14539e;
            }
            aVar3.b((CharSequence) str2, (DialogInterface.OnClickListener) new d(this), false);
        }
        com.bytedance.android.livesdk.l.b a2 = aVar3.a();
        this.f14534a = a2;
        a2.show();
    }
}
