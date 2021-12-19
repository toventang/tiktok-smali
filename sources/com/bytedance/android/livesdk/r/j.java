package com.bytedance.android.livesdk.r;

import androidx.appcompat.app.d;
import androidx.fragment.app.i;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f20573a = new j();

    public interface a {
        static {
            Covode.recordClassIndex(12148);
        }

        void a();
    }

    private j() {
    }

    static {
        Covode.recordClassIndex(12147);
    }

    public static boolean a(long j2) {
        b<Set<String>> bVar = com.bytedance.android.livesdk.ap.a.W;
        l.b(bVar, "");
        Set<String> a2 = bVar.a();
        if (a2 == null || !a2.contains(String.valueOf(j2))) {
            return true;
        }
        return false;
    }

    public static void a(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "send";
        } else {
            str = "cancel";
        }
        hashMap.put("click_type", str);
        b.a.a("convenient_gift_first_popup_click").a().a((Map<String, String>) hashMap).b();
    }

    public static void a(d dVar, a aVar) {
        l.d(dVar, "");
        l.d(aVar, "");
        b.a.a("shortcut_popup_show").a().b();
        com.bytedance.android.livesdk.widgets.giftwidget.b.a aVar2 = new com.bytedance.android.livesdk.widgets.giftwidget.b.a();
        aVar2.f22678a = aVar;
        i supportFragmentManager = dVar.getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        aVar2.show(supportFragmentManager, "FastGiftConfirmDialog");
        b.a.a("convenient_gift_first_popup_show").a().b();
    }
}
