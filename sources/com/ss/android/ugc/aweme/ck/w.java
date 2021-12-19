package com.ss.android.ugc.aweme.ck;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.deeplink.m;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class w implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71179a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f71180b = n.d("aweme://challenge/detail/:id", "aweme://music/detail/:id", "aweme://assmusic/category/:cid", "aweme://music/category/:mc_id", "aweme://user/profile/:uid", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", "aweme://story/detail/:id", "aweme://aweme/detail/:id", "aweme://aweme/detaillist/:id", "aweme://tuwen/detail/:id", "aweme://aweme/zhima/:type", "aweme://stickers/detail/:id", "aweme://user/qna/profile/:to_user_id", "aweme://user/ask/:id", "aweme://qna/detail/:id");

    /* renamed from: c  reason: collision with root package name */
    private String f71181c = "";

    static {
        Covode.recordClassIndex(43808);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43809);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        if (!(str == null || (p.b(str, "//", false) && (str = "aweme:".concat(String.valueOf(str))) == null))) {
            str2 = p.a(str, m.f79501a.e(), "aweme", false);
        }
        Iterator<String> it = this.f71180b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (v.a(next, str2)) {
                l.b(next, "");
                this.f71181c = next;
                return true;
            }
        }
        this.f71181c = "";
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Set<String> queryParameterNames;
        Uri uri;
        if (TextUtils.isEmpty(this.f71181c)) {
            return false;
        }
        List<String> b2 = p.b(this.f71181c, new String[]{"/:"});
        if ((b2 != null ? Integer.valueOf(b2.size()) : null).intValue() > 0) {
            str = b2.get(0);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        g gVar = new g(str);
        List<String> a2 = v.a(this.f71181c);
        List<String> a3 = v.a((routeIntent == null || (uri = routeIntent.getUri()) == null) ? null : uri.toString());
        int size = a2.size();
        for (int i2 = 1; i2 < size; i2++) {
            if (i2 < size) {
                String str2 = a2.get(i2);
                l.b(str2, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String substring = str2.substring(1);
                l.b(substring, "");
                gVar.a(substring, a3.get(i2));
            }
        }
        if (routeIntent != null) {
            Uri uri2 = routeIntent.getUri();
            if (!(uri2 == null || (queryParameterNames = uri2.getQueryParameterNames()) == null)) {
                for (T t : queryParameterNames) {
                    if (!TextUtils.isEmpty(t)) {
                        Uri uri3 = routeIntent.getUri();
                        gVar.a(t, uri3 != null ? uri3.getQueryParameter(t) : null);
                    }
                }
            }
            routeIntent.setUrl(gVar.a());
        }
        this.f71181c = "";
        return false;
    }
}
