package com.ss.android.ugc.aweme.im.sdk.group.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.proto.GroupRole;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102632a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65706);
    }

    public static final boolean a(SharePackage sharePackage) {
        String str;
        if (sharePackage != null) {
            str = sharePackage.f124590d;
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "group");
    }

    public static final int d(h hVar) {
        if (c(hVar)) {
            return 1;
        }
        return 0;
    }

    public static final String a(int i2) {
        String string = d.a().getString(R.string.c7e, Integer.valueOf(i2));
        l.b(string, "");
        return string;
    }

    public static final boolean c(h hVar) {
        i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || coreInfo.getOwner() != c.e()) {
            return false;
        }
        return true;
    }

    public static final boolean a(h hVar) {
        if (!(hVar == null || !hVar.isGroupChat() || hVar.getCoreInfo() == null)) {
            i coreInfo = hVar.getCoreInfo();
            l.b(coreInfo, "");
            if (coreInfo.getExt() != null) {
                i coreInfo2 = hVar.getCoreInfo();
                l.b(coreInfo2, "");
                if (l.a((Object) coreInfo2.getExt().get("a:s_banned"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(h hVar) {
        if (hVar != null && hVar.isMember() && hVar != null && !hVar.isDissolved()) {
            String str = null;
            if (!(hVar == null || hVar.getCoreInfo() == null)) {
                i coreInfo = hVar.getCoreInfo();
                l.b(coreInfo, "");
                Map<String, String> ext = coreInfo.getExt();
                if (ext != null) {
                    str = ext.get("ban_status");
                }
                if (!l.a((Object) str, (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String e(h hVar) {
        i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null) {
            String string = d.a().getString(R.string.aj4);
            l.b(string, "");
            return string;
        }
        String name = coreInfo.getName();
        if (name == null) {
            return "";
        }
        return name;
    }

    public static final boolean a(String str) {
        l.d(str, "");
        h c2 = b.a.a(str).c();
        if (!(c2 == null || !c2.isGroupChat() || c2.getCoreInfo() == null)) {
            i coreInfo = c2.getCoreInfo();
            l.b(coreInfo, "");
            if (coreInfo.getExt() != null) {
                i coreInfo2 = c2.getCoreInfo();
                l.b(coreInfo2, "");
                if (l.a((Object) coreInfo2.getExt().get("a:group_name_modified"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean a(List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list) {
        return a(c.b().toString(), list);
    }

    private static boolean a(String str, List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list) {
        T t;
        ah member;
        l.d(str, "");
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.getUid(), (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (member = t2.getMember()) == null || member.getRole() != GroupRole.OWNER.getValue()) {
            return false;
        }
        return true;
    }
}
