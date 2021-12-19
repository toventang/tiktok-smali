package com.bytedance.android.livesdk.olddialog;

import androidx.lifecycle.u;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.olddialog.giftpanellist.b.b;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f20017a;

    static {
        Covode.recordClassIndex(11824);
    }

    c(a aVar) {
        this.f20017a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f20017a;
        b bVar = (b) obj;
        if (bVar != null) {
            com.bytedance.android.livesdk.olddialog.b.b bVar2 = aVar.f19997c;
            String str = bVar.f20038a;
            String str2 = bVar.f20039b;
            if (bVar2.f20015a != null && str != null && !str.isEmpty()) {
                int b2 = ap.b(bVar2.f20015a, (float) ap.a(bVar2.f20015a));
                d webViewManager = ((f) a.a(f.class)).webViewManager();
                d.b a2 = e.a(str);
                a2.f14301b = b2;
                a2.f14302c = (int) ((((float) b2) / 375.0f) * 275.0f);
                a2.f14310k = 0;
                d.b a3 = a2.a(8, 8, 0, 0);
                a3.f14309j = 80;
                a3.q = false;
                com.bytedance.android.live.core.widget.a a4 = webViewManager.a(a3);
                if (bVar2.f20015a instanceof androidx.fragment.app.e) {
                    com.bytedance.android.live.core.widget.a.a((androidx.fragment.app.e) bVar2.f20015a, a4);
                    l.d(str2, "");
                    if (l.a((Object) "gray_prop", (Object) str2)) {
                        b.a.a("gray_prop_click").a().b();
                    } else if (l.a((Object) "more_prop", (Object) str2)) {
                        b.a.a("more_prop_click").a().b();
                    }
                    b.a.a("task_show").a().a("request_page", str2).b();
                }
            }
        }
    }
}
