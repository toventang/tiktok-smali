package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.service.model.i;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f100158a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final a f100159b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f100160c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f100161d;

    private a() {
    }

    public static final boolean a() {
        if ((f100160c & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if ((f100160c & 4) == 4) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if ((f100160c & 8) == 8) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        if ((f100161d & 16) == 16) {
            return true;
        }
        return false;
    }

    static {
        int i2;
        int i3;
        Covode.recordClassIndex(63835);
        i iMSetting = b.b().getIMSetting();
        if (iMSetting != null) {
            i2 = iMSetting.f103911h;
        } else {
            i2 = 5;
        }
        f100160c = i2;
        if (iMSetting != null) {
            i3 = iMSetting.f103912i;
        } else {
            i3 = 3;
        }
        f100161d = i3;
        com.ss.android.ugc.aweme.im.service.m.a.b("AuthorSupporterHelper", "init: enableMsgTypes=" + i2 + ", enableFunctions=" + i3);
    }

    public static final boolean a(String str) {
        if (str != null) {
            return a(a.C0745a.a().a(str));
        }
        return false;
    }

    public static final boolean a(h hVar) {
        Map<String, String> ext;
        if (hVar == null) {
            return false;
        }
        com.bytedance.im.core.d.i coreInfo = hVar.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && l.a((Object) "1", (Object) ext.get("a:s_author_im_supporter"))) {
            return true;
        }
        Map<String, String> localExt = hVar.getLocalExt();
        if (localExt == null || !l.a((Object) "1", (Object) localExt.get("a:s_author_im_supporter"))) {
            return false;
        }
        return true;
    }
}
