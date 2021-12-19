package com.ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f150594a = Keva.getRepo("auto_translation_settings_cache");

    /* renamed from: b  reason: collision with root package name */
    static final Set<String> f150595b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final i f150596c = new i();

    private i() {
    }

    public static boolean b() {
        return f150594a.getBoolean("enable_caption_tts", true);
    }

    public static String c() {
        String string = f150594a.getString("caption_voice_type", "2");
        l.b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(99031);
    }

    public static boolean a() {
        return f150594a.getBoolean("enable_translation", true);
    }

    public static void a(String str) {
        l.d(str, "");
        f150594a.storeString("caption_voice_type", str);
    }
}
