package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;
import h.m.j;
import h.m.p;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class i {

    /* renamed from: a */
    public static final String[] f102210a = new String[0];

    /* renamed from: b */
    public static final i f102211b = new i();

    /* renamed from: c */
    private static final Pattern f102212c;

    private i() {
    }

    static {
        Covode.recordClassIndex(65404);
        Pattern compile = Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);
        l.b(compile, "");
        f102212c = compile;
    }

    private static String[] a() {
        SettingsManager a2 = SettingsManager.a();
        String[] strArr = f102210a;
        String[] strArr2 = (String[]) a2.a("tt_dm_sec_domain", String[].class, strArr);
        return strArr2 == null ? strArr : strArr2;
    }

    public static /* synthetic */ boolean a(SystemContent systemContent) {
        String[] a2 = a();
        l.d(a2, "");
        if (!(systemContent == null || a2.length == 0)) {
            if (b(systemContent.getNewTips(), a2) || b(systemContent.getTips(), a2)) {
                return true;
            }
            SystemContent.Key[] template = systemContent.getTemplate();
            if (template != null) {
                for (SystemContent.Key key : template) {
                    l.b(key, "");
                    if (a(key.getLink(), a2)) {
                        return true;
                    }
                }
            }
            SystemContent.Key[] newTemplate = systemContent.getNewTemplate();
            if (newTemplate != null) {
                for (SystemContent.Key key2 : newTemplate) {
                    l.b(key2, "");
                    if (a(key2.getLink(), a2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(UrlModel urlModel, String[] strArr) {
        List<String> urlList;
        l.d(strArr, "");
        if (!(strArr.length == 0 || urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            Iterator<T> it = urlList.iterator();
            while (it.hasNext()) {
                if (a((String) it.next(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, String[] strArr) {
        l.d(strArr, "");
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        Iterator a2 = h.m.l.findAll$default(new h.m.l(f102212c), str, 0, 2, null).a();
        while (a2.hasNext()) {
            if (a(((j) a2.next()).b(), strArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String[] strArr) {
        String str2;
        l.d(strArr, "");
        boolean z = true;
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        try {
            String host = new URL(str).getHost();
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                str2 = strArr[i2];
                if (p.a(host, str2, true)) {
                    break;
                }
                l.b(host, "");
                if (p.c(host, ".".concat(String.valueOf(str2)), true)) {
                    break;
                }
                i2++;
            }
            if (str2 != null) {
                z = false;
            }
            return z;
        } catch (MalformedURLException e2) {
            a.a("MessagingSecureDomainSetting", "url is malformed ".concat(String.valueOf(str)), e2);
            return false;
        }
    }
}
