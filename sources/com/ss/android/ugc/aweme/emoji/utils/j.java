package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.common.utility.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.b;

public final class j {
    static {
        Covode.recordClassIndex(56220);
    }

    private static String a() {
        return a.a(d.a()) + "/im_resources/";
    }

    public static String b(b bVar) {
        return b(bVar.getType(), bVar.getId(), bVar.getVersion());
    }

    public static String a(b bVar) {
        return a(bVar.getType()) + a(bVar.getId(), bVar.getVersion()) + ".zip";
    }

    public static String a(String str) {
        return a() + str + "/";
    }

    public static String a(long j2, String str) {
        String replace;
        StringBuilder append = new StringBuilder().append(j2).append("_");
        if (str == null) {
            replace = "";
        } else {
            replace = str.replace(".", "_");
        }
        return append.append(replace).toString();
    }

    public static String b(String str, long j2, String str2) {
        return a(str, j2, str2) + "/" + j2;
    }

    public static String a(String str, long j2, String str2) {
        return a(str) + a(j2, str2);
    }
}
