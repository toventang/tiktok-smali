package com.ss.android.ugc.aweme.user.b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.user.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f142324a = "https://api-va.tiktokv.com/aweme/v1/friend/register/notice/";

    static {
        Covode.recordClassIndex(93097);
    }

    public static void a(Handler handler, final String str) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass3 */

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f142331b = false;

            static {
                Covode.recordClassIndex(93100);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.a(str, this.f142331b);
            }
        }, 112);
    }

    public static void a(Handler handler, final Map<String, String> map, int i2) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93099);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.a(map);
            }
        }, i2);
    }

    public static void a(Handler handler, String str, String str2, int i2, int i3) {
        a(handler, str, str2, i2, i3, false);
    }

    public static void a(Handler handler, final String str, final int i2, final String str2, final List<com.ss.android.http.a.b.d> list, int i3) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(93101);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dr.f83127b.a(str, i2, str2, AvatarUri.class, "data", list);
            }
        }, i3);
    }

    public static void a(Handler handler, final String str, final String str2, final int i2, int i3, final boolean z) {
        n.a().a(handler, new Callable() {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93098);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                String str2 = str;
                String str3 = str2;
                int i2 = i2;
                boolean z = z;
                HashMap hashMap = new HashMap();
                hashMap.put("page_from", String.valueOf(i2));
                if (str2.equals("unique_id")) {
                    hashMap.put("login_name", str3);
                    hashMap.put("mt_update_username", "mt_update_username");
                    return d.a(hashMap);
                }
                hashMap.put(str2, str3);
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("confirmed", str);
                return d.a(hashMap);
            }
        }, i3);
    }
}
