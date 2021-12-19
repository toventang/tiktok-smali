package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.g.a;

public final class c {
    static {
        Covode.recordClassIndex(56211);
    }

    public static String a() {
        return j.b("STICKER", 0, "0") + "/static/";
    }

    public static String b(a aVar) {
        return a(aVar.getResourcesId(), aVar.getVersion(), aVar.getId(), aVar.getAnimateType());
    }

    public static String c(a aVar) {
        return aVar.getId() + "." + aVar.getStaticType();
    }

    public static String a(a aVar) {
        return j.b("STICKER", aVar.getResourcesId(), aVar.getVersion()) + "/static/" + aVar.getId() + "." + aVar.getStaticType();
    }

    public static String a(long j2, String str, long j3, String str2) {
        return j.b("STICKER", j2, str) + "/animate/" + j3 + "." + str2;
    }
}
