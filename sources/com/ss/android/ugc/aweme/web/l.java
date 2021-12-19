package com.ss.android.ugc.aweme.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.utils.dc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class l {
    static {
        Covode.recordClassIndex(94852);
    }

    public static String a() {
        if (!((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() || !"boe".equals(dc.g())) {
            return "95bcaef5f85b57bef49180849da0ab20";
        }
        return "9f87ed36c915115ff7febd807c9e1a23";
    }

    public static List<Pattern> b() {
        ArrayList arrayList = new ArrayList();
        List<String> b2 = b.b().b(d.a(), "aweme_gecko_offline_host_prefix", String.class);
        try {
            if (!com.bytedance.common.utility.collection.b.a((Collection) b2)) {
                for (String str : b2) {
                    arrayList.add(Pattern.compile(str));
                }
                return arrayList;
            }
        } catch (Exception e2) {
            ALog.d("OFFLINE PREFIX EXCEPTION", e2.getMessage());
        }
        arrayList.add(Pattern.compile("s16.tiktokcdn.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("s0.ipstatp.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("www.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("m.tiktok.com/falcon/"));
        return arrayList;
    }
}
