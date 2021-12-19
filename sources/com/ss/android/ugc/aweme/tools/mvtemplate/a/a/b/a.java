package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3718a f140669b = new C3718a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f140670a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f140671c;

    static {
        Covode.recordClassIndex(91863);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a$a  reason: collision with other inner class name */
    public static final class C3718a {
        static {
            Covode.recordClassIndex(91864);
        }

        private C3718a() {
        }

        public /* synthetic */ C3718a(byte b2) {
            this();
        }
    }

    public a() {
        Keva repo = Keva.getRepo("pic_mv_theme_data_keva");
        l.b(repo, "");
        this.f140670a = repo;
        boolean z = false;
        this.f140671c = (SettingsManager.a().a("enable_1080p_photo_mv", false) || cy.a.a().f118429a) ? true : z;
    }

    public final MvThemeData a() {
        String string = this.f140670a.getString("single_mv", "");
        MvThemeData mvThemeData = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            mvThemeData = (MvThemeData) c.f115623b.a(string, MvThemeData.class);
            return mvThemeData;
        } catch (Exception unused) {
            this.f140670a.erase("single_mv");
            return mvThemeData;
        }
    }

    public final MvThemeData b() {
        String string = this.f140670a.getString("slideshow_mv", "");
        MvThemeData mvThemeData = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            mvThemeData = (MvThemeData) c.f115623b.a(string, MvThemeData.class);
            return mvThemeData;
        } catch (Exception unused) {
            this.f140670a.erase("slideshow_mv");
            return mvThemeData;
        }
    }

    public final void a(MvThemeData mvThemeData) {
        this.f140670a.storeBoolean("photo_mv_is1080p", this.f140671c);
        try {
            this.f140670a.storeString("single_mv", c.f115623b.b(mvThemeData));
        } catch (Exception e2) {
            bj.a(e2);
        }
    }

    public final void b(MvThemeData mvThemeData) {
        this.f140670a.storeBoolean("photo_mv_is1080p", this.f140671c);
        try {
            this.f140670a.storeString("slideshow_mv", c.f115623b.b(mvThemeData));
        } catch (Exception e2) {
            bj.a(e2);
        }
    }
}
