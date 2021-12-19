package com.ss.android.ugc.aweme.bn;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.Date;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f68735a = "profile_photo_page";

    /* renamed from: b  reason: collision with root package name */
    public static final a f68736b = new a();

    private a() {
    }

    public static void a() {
        r.a("show_exit_avatar_confirmation_popup", new d().f66730a);
    }

    static {
        Covode.recordClassIndex(42323);
    }

    public static void b(String str) {
        l.d(str, "");
        r.a("cancel_more_option_avatar_profile", new d().a("enter_from", "avatar_hub").a("exit_method", str).f66730a);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("create_avatar", new d().a("enter_from", str).a("enter_method", "click").a("start_time", String.valueOf(new Date().getTime())).f66730a);
    }

    public static void a(String str, String str2, String str3, String str4) {
        l.d(str3, "");
        r.a("select_avatar_item", new d().a("item_id", str).a("item_tab", str2).a("item_subcategory", str3).a(b.f37372a, str4).f66730a);
    }
}
