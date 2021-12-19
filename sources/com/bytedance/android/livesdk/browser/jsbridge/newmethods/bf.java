package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.view.Window;
import android.webkit.WebView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class bf extends f<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.livesdk.browser.d.a f14546a;

    static {
        Covode.recordClassIndex(8097);
    }

    static final class a {
        @c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        String f14547a;
        @c(a = "args")

        /* renamed from: b  reason: collision with root package name */
        C0315a f14548b;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf$a$a  reason: collision with other inner class name */
        static final class C0315a {
            @c(a = "url")

            /* renamed from: a  reason: collision with root package name */
            String f14549a;
            @c(a = "width")

            /* renamed from: b  reason: collision with root package name */
            int f14550b;
            @c(a = "height")

            /* renamed from: c  reason: collision with root package name */
            int f14551c;
            @c(a = "radius")

            /* renamed from: d  reason: collision with root package name */
            int f14552d;
            @c(a = "close_by_mask")

            /* renamed from: e  reason: collision with root package name */
            int f14553e;

            static {
                Covode.recordClassIndex(8099);
            }
        }

        static {
            Covode.recordClassIndex(8098);
        }

        a() {
        }
    }

    public bf(com.bytedance.android.livesdk.browser.d.a aVar) {
        this.f14546a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(a aVar, g gVar) {
        String str;
        a aVar2 = aVar;
        if (TextUtils.equals("webview_popup", aVar2.f14547a)) {
            a.C0315a aVar3 = aVar2.f14548b;
            com.bytedance.android.livesdk.browser.d.a aVar4 = this.f14546a;
            String str2 = aVar3.f14549a;
            int i2 = aVar3.f14550b;
            int i3 = aVar3.f14551c;
            int i4 = aVar3.f14552d;
            int i5 = aVar3.f14553e;
            if (aVar4.getDialog() == null || aVar4.getDialog().getWindow() == null) {
                return null;
            }
            aVar4.getDialog().show();
            Window window = aVar4.getDialog().getWindow();
            if (window != null) {
                window.clearFlags(32);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (aVar4.p == null || !(aVar4.p.f() instanceof WebView)) {
                str = "";
            } else {
                str = ((WebView) aVar4.p.f()).getUrl();
            }
            if (!TextUtils.equals(str2, str)) {
                return null;
            }
            aVar4.a(i4);
            e activity = aVar4.getActivity();
            boolean z = true;
            if (activity != null && activity.getRequestedOrientation() == 1) {
                if (aVar4.q) {
                    i3 += 48;
                }
                aVar4.getDialog();
                aVar4.a(i2, i3);
            }
            if (i5 != 1) {
                z = false;
            }
            aVar4.a(z);
            return null;
        }
        terminate();
        return null;
    }
}
