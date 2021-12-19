package com.ss.android.ugc.aweme.sticker.m.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.f.d;
import h.f.b.l;

public final class d implements com.ss.android.ugc.tools.f.d {

    /* renamed from: a  reason: collision with root package name */
    public static String f134954a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f134955b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoContext f134956c;

    static {
        Covode.recordClassIndex(88224);
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(String str) {
        l.d(str, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88225);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final String a() {
        ShortVideoContext shortVideoContext = this.f134956c;
        if (shortVideoContext != null) {
            return shortVideoContext.r;
        }
        return null;
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final String b() {
        ShortVideoContext shortVideoContext = this.f134956c;
        if (shortVideoContext != null) {
            return shortVideoContext.q;
        }
        return null;
    }

    public d(ShortVideoContext shortVideoContext) {
        this.f134956c = shortVideoContext;
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(d.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        a(aVar.f149196a, aVar.f149197b, aVar.f149198c);
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void b(String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        b bVar = new b();
        ShortVideoContext shortVideoContext = this.f134956c;
        if (shortVideoContext != null) {
            str3 = shortVideoContext.X;
        } else {
            str3 = null;
        }
        r.a("search_gif", bVar.a("prop_id", str3).a("creation_id", b()).a("enter_from", str2).a("search_keyword", str).f149193a);
        f134954a = str;
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("click_gif_button", new b().a("creation_id", b()).a("tab_name", str).a("enter_from", str2).f149193a);
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(String str, boolean z) {
        r.a("show_media_tray", new b().a("creation_id", b()).a("prop_id", str).a("giphy_show", z ? 1 : 0).f149193a);
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(String str, int i2, String str2) {
        l.d(str, "");
        r.a("load_gif_results", new b().a("creation_id", b()).a("duration", i2).a("load_type", str).a("search_keyword", str2).a("is_success", 1).f149193a);
    }

    @Override // com.ss.android.ugc.tools.f.d
    public final void a(String str, String str2, String str3) {
        l.d(str3, "");
        r.a("choose_gif_content", new b().a("creation_id", b()).a("giphy_id", str).a("prop_id", str2).a("tab_name", str3).a("search_keyword", f134954a).f149193a);
    }
}
