package com.ss.android.ugc.aweme.editSticker.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.j.h;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f88166b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f88167a;

    static {
        Covode.recordClassIndex(55430);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55431);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        return this.f88167a.getBoolean("info_sticker_hint_set", false);
    }

    public final void b() {
        this.f88167a.storeBoolean("info_sticker_hint_set", true);
    }

    public final boolean c() {
        return this.f88167a.getBoolean("text_sticker_hint_set", false);
    }

    public final boolean d() {
        return this.f88167a.getBoolean("interact_sticker_hint_set", false);
    }

    public final boolean e() {
        return this.f88167a.getBoolean("lyric_sticker_hint_set", false);
    }

    public final boolean f() {
        if (this.f88167a.getInt("read_text_toast_shown", 0) < 3) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.f88167a.getInt("change_text_toast_shown", 0) < 3) {
            return true;
        }
        return false;
    }

    public g() {
        Keva repo = Keva.getRepo("text_sticker_keva");
        l.b(repo, "");
        this.f88167a = repo;
    }

    public final void a(boolean z) {
        if (z) {
            this.f88167a.storeInt("edit_text_tux_bubble_1", 3);
            return;
        }
        Keva keva = this.f88167a;
        keva.storeInt("edit_text_tux_bubble_1", h.c(keva.getInt("edit_text_tux_bubble_1", 0) + 1, 3));
    }

    public final void b(boolean z) {
        if (z) {
            this.f88167a.storeInt("change_text_toast_shown", 4);
            return;
        }
        Keva keva = this.f88167a;
        keva.storeInt("change_text_toast_shown", h.c(keva.getInt("change_text_toast_shown", 0) + 1, 4));
    }

    public final void c(boolean z) {
        if (z) {
            this.f88167a.storeInt("read_text_toast_shown", 4);
            return;
        }
        Keva keva = this.f88167a;
        keva.storeInt("read_text_toast_shown", h.c(keva.getInt("read_text_toast_shown", 0) + 1, 4));
    }
}
