package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.utils.et;
import h.a.i;
import h.f.b.l;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f146927a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f146928b = new k();

    private k() {
    }

    public static String c() {
        String string = f146927a.getString("setCheckVoice", "");
        l.b(string, "");
        return string;
    }

    public static String d() {
        String string = f146927a.getString("setCheckText", "");
        l.b(string, "");
        return string;
    }

    private static String f() {
        String string = f146927a.getString("setLastVoice", "");
        l.b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(96764);
        Keva repo = Keva.getRepo("text_to_speech_v2");
        l.b(repo, "");
        f146927a = repo;
    }

    public static boolean a() {
        return f146927a.contains("checkbox");
    }

    public static boolean b() {
        if (!h.a()) {
            return false;
        }
        return f146927a.getBoolean("checkbox", false);
    }

    public static String e() {
        if (!b()) {
            return f();
        }
        if (c().length() > 0) {
            return c();
        }
        return "";
    }

    public static void a(boolean z) {
        f146927a.storeBoolean("checkbox", z);
    }

    public static void a(String str) {
        l.d(str, "");
        f146927a.storeString("setCheckVoice", str);
    }

    public static void b(String str) {
        l.d(str, "");
        f146927a.storeString("setCheckText", str);
    }

    public static void c(String str) {
        l.d(str, "");
        f146927a.storeString("setLastVoice", str);
    }

    public static List<String> d(String str) {
        l.d(str, "");
        String[] stringArray = f146927a.getStringArray(et.a(str), new String[0]);
        l.b(stringArray, "");
        return i.j(stringArray);
    }
}
