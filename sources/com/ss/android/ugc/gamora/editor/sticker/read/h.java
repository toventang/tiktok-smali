package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.g;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f146923a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(96761);
    }

    public static final int d() {
        return b.a().a(true, "text_reader_allowing_choose_sound_effects", 0);
    }

    public static final boolean b() {
        if (!a() || b.a().a(true, "text_reader_allowing_choose_sound_effects", 0) == 2) {
            return false;
        }
        return true;
    }

    public static final boolean c() {
        if (!a() || b.a().a(true, "text_reader_allowing_choose_sound_effects", 0) == 3) {
            return false;
        }
        return true;
    }

    public static final boolean a() {
        if (!g.a().A().b() || g.a().A().a() || b.a().a(true, "text_reader_allowing_choose_sound_effects", 0) <= 0) {
            return false;
        }
        return true;
    }
}
