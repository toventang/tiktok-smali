package com.ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.bu.b.a;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f74513a = n.c("dou+", "company_link", "iron_man", "shopping_cart", "open_platform", "movie", "sticker");

    /* renamed from: b  reason: collision with root package name */
    public static final b f74514b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(45949);
    }

    private static boolean b(Aweme aweme, boolean z) {
        Integer valueOf;
        ac a2 = bh.a(aweme);
        if (a2 == null || (valueOf = Integer.valueOf(a2.getLinkType())) == null || valueOf.intValue() != 0) {
            return false;
        }
        if (z) {
            return a2.showOnComment();
        }
        return a2.showOnFeed();
    }

    static final String a(Aweme aweme, boolean z) {
        boolean z2;
        if (aweme == null) {
            return null;
        }
        for (String str : f74513a) {
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        z2 = PropReuseServiceImpl.c().a(aweme);
                        break;
                    } else {
                        continue;
                    }
                case -1648893033:
                    if (str.equals("shopping_cart") && z && aweme.getPromotion() != null) {
                        s sVar = s.a.f66880a;
                        l.b(sVar, "");
                        aj<Boolean> p = sVar.p();
                        l.b(p, "");
                        Boolean c2 = p.c();
                        l.b(c2, "");
                        if (c2.booleanValue()) {
                            return str;
                        }
                    }
                case -309942941:
                    if (str.equals("iron_man") && aweme.getMicroAppInfo() != null) {
                        return str;
                    }
                case -210508088:
                    if (str.equals("open_platform") && !z) {
                        AnchorInfo anchorInfo = aweme.getAnchorInfo();
                        Integer type = anchorInfo != null ? anchorInfo.getType() : null;
                        int type2 = ab.OPEN_PLATFORM_ANCHOR.getTYPE();
                        if (type != null && type.intValue() == type2) {
                            return str;
                        }
                    }
                case 3089441:
                    if (str.equals("dou+")) {
                        z2 = com.ss.android.ugc.aweme.commercialize.e.a.b.i(aweme);
                        break;
                    } else {
                        continue;
                    }
                case 104087344:
                    if (str.equals("movie")) {
                        z2 = a.C1555a.a(aweme);
                        break;
                    } else {
                        continue;
                    }
                case 1429828220:
                    if (str.equals("company_link")) {
                        z2 = b(aweme, z);
                        break;
                    } else {
                        continue;
                    }
            }
            if (z2) {
                return str;
            }
        }
        return null;
    }

    public static boolean a(String str, Aweme aweme, boolean z) {
        return TextUtils.equals(str, a(aweme, z));
    }

    public static /* synthetic */ boolean a(Aweme aweme, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return a("iron_man", aweme, z);
    }
}
