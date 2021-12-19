package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3329a f127775a = new C3329a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Keva f127776b;

    static {
        Covode.recordClassIndex(83751);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a$a  reason: collision with other inner class name */
    public static final class C3329a {
        static {
            Covode.recordClassIndex(83752);
        }

        private C3329a() {
        }

        public /* synthetic */ C3329a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        return this.f127776b.getBoolean("has_live_cd_edit_hint_show", false);
    }

    public final void b() {
        this.f127776b.storeBoolean("has_live_cd_edit_hint_show", true);
    }

    public final boolean c() {
        return this.f127776b.getBoolean("is_has_live_cd_permission", false);
    }

    public a() {
        Keva repo = Keva.getRepo("live_cd_sticker_keva_repo");
        l.b(repo, "");
        this.f127776b = repo;
    }

    public final void a(boolean z) {
        this.f127776b.storeBoolean("is_has_live_cd_permission", z);
    }
}
