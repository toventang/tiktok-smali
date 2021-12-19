package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f91470a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f91471b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private f f91472c = new f();

    static {
        Covode.recordClassIndex(57556);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f91473a = new ac();

        static {
            Covode.recordClassIndex(57557);
        }
    }

    public final String a(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return this.f91472c.b(logPbBean);
    }

    public final String a(String str) {
        if (!TextUtils.isEmpty(str) && this.f91470a.containsKey(str)) {
            return this.f91470a.get(str);
        }
        return "";
    }

    public final String c(String str) {
        if (!TextUtils.isEmpty(str) && this.f91471b.containsKey(str)) {
            return this.f91471b.get(str);
        }
        return "";
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f91470a.containsKey(str)) {
            return this.f91470a.get(str);
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String b2 = this.f91472c.b(logPbBean);
        this.f91470a.put(str, b2);
        return b2;
    }

    public final void b(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f91471b.put(str, this.f91472c.b(logPbBean));
        }
    }

    public final void a(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f91470a.put(str, this.f91472c.b(logPbBean));
        }
    }
}
