package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f35265a = " \"'<>#";

    /* renamed from: b  reason: collision with root package name */
    private final String f35266b = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f35267c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(21131);
    }

    public final void b(String str) {
        l.d(str, "");
        this.f35267c.remove(str);
    }

    public final String a(String str) {
        l.d(str, "");
        List<String> list = this.f35267c.get(str);
        if (list != null) {
            return (String) n.h((List) list);
        }
        return null;
    }

    public final void a(StringBuilder sb) {
        l.d(sb, "");
        sb.append('?');
        for (Map.Entry<String, List<String>> entry : this.f35267c.entrySet()) {
            String a2 = a.a(entry.getKey(), this.f35266b, true, true);
            for (String str : entry.getValue()) {
                l.b(a2, "");
                sb.append(a2);
                if (str != null) {
                    sb.append('=');
                    sb.append(a.a(str, this.f35266b, true, true));
                }
                sb.append('&');
            }
        }
        sb.setLength(sb.length() - 1);
    }

    public final void c(String str) {
        this.f35267c.clear();
        if (str != null) {
            int i2 = 0;
            while (i2 <= str.length()) {
                int a2 = p.a((CharSequence) str, '&', i2, false, 4);
                if (a2 == -1) {
                    a2 = str.length();
                }
                int a3 = p.a((CharSequence) str, '=', i2, false, 4);
                if (a3 == -1 || a3 > a2) {
                    String substring = str.substring(i2, a2);
                    l.b(substring, "");
                    c(substring, null);
                } else {
                    String substring2 = str.substring(i2, a3);
                    l.b(substring2, "");
                    String substring3 = str.substring(a3 + 1, a2);
                    l.b(substring3, "");
                    c(substring2, substring3);
                }
                i2 = a2 + 1;
            }
        }
    }

    public final void b(String str, String str2) {
        String str3;
        l.d(str, "");
        String a2 = a.a(str, this.f35266b, true, true);
        l.b(a2, "");
        if (str2 != null) {
            str3 = a.a(str2, this.f35266b, true, true);
        } else {
            str3 = null;
        }
        c(a2, str3);
    }

    private final void c(String str, String str2) {
        String a2;
        String a3 = a.a(str, true);
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = a.a(str2, true);
        }
        List<String> list = this.f35267c.get(a3);
        if (list == null) {
            list = new ArrayList<>();
            Map<String, List<String>> map = this.f35267c;
            l.b(a3, "");
            map.put(a3, list);
        }
        list.add(a2);
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        List<String> list = this.f35267c.get(str);
        if (list != null) {
            list.clear();
        }
        b(str, str2);
    }
}
