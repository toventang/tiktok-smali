package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3728a f140869a = new C3728a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, MvNetFileBean> f140870b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f140871c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(91990);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.a$a  reason: collision with other inner class name */
    public static final class C3728a {
        static {
            Covode.recordClassIndex(91991);
        }

        private C3728a() {
        }

        public /* synthetic */ C3728a(byte b2) {
            this();
        }
    }

    public final String a(String str) {
        l.d(str, "");
        String b2 = d.b(str);
        Map<String, String> map = this.f140871c;
        l.b(b2, "");
        map.put(b2, str);
        return b2;
    }

    public final String b(String str) {
        l.d(str, "");
        if (!this.f140871c.containsKey(str)) {
            return "";
        }
        for (Map.Entry<String, String> entry : this.f140871c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (l.a((Object) str, (Object) key)) {
                return value;
            }
        }
        return "";
    }

    public final MvNetFileBean a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f140870b.get(str + str2);
    }

    public final void a(String str, String str2, MvNetFileBean mvNetFileBean) {
        l.d(str, "");
        l.d(str2, "");
        l.d(mvNetFileBean, "");
        String str3 = str + str2;
        if (!this.f140870b.containsKey(str3)) {
            this.f140870b.put(str3, mvNetFileBean);
        }
    }
}
