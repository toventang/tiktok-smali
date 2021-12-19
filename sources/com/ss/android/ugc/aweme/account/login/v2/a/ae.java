package com.ss.android.ugc.aweme.account.login.v2.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import f.a.d.g;
import f.a.h;
import h.f.b.l;
import java.util.HashMap;
import org.a.c;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f64217a = new ae();

    private ae() {
    }

    static {
        Covode.recordClassIndex(39562);
    }

    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64218a = new a();

        static {
            Covode.recordClassIndex(39563);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b() {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.ae.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39564);
                }

                @Override // org.a.b
                public final void a_(c<? super b> cVar) {
                    int i2;
                    String str;
                    Integer num;
                    Object a2 = NetworkProxyAccount.f65195b.a().a(str, (Class) c.class);
                    l.b(a2, "");
                    c cVar2 = (c) a2;
                    if (TextUtils.equals(cVar2.f64231a, "success")) {
                        cVar.onNext(cVar2.f64232b);
                    } else {
                        b bVar = cVar2.f64232b;
                        if (bVar == null || (num = bVar.f64230d) == null) {
                            i2 = -1;
                        } else {
                            i2 = num.intValue();
                        }
                        b bVar2 = cVar2.f64232b;
                        if (bVar2 != null) {
                            str = bVar2.f64229c;
                        } else {
                            str = null;
                        }
                        cVar.onError(new w(i2, str, j.LOGIN, k.PUSH_VERIFY, null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64220a = new b();

        static {
            Covode.recordClassIndex(39565);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b() {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.ae.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39566);
                }

                @Override // org.a.b
                public final void a_(c<? super ab> cVar) {
                    int i2;
                    String str;
                    Integer num;
                    Object a2 = NetworkProxyAccount.f65195b.a().a(str, (Class) ac.class);
                    l.b(a2, "");
                    ac acVar = (ac) a2;
                    if (TextUtils.equals(acVar.f64201a, "success")) {
                        cVar.onNext(acVar.f64202b);
                    } else {
                        ab abVar = acVar.f64202b;
                        if (abVar == null || (num = abVar.f64194d) == null) {
                            i2 = -1;
                        } else {
                            i2 = num.intValue();
                        }
                        ab abVar2 = acVar.f64202b;
                        if (abVar2 != null) {
                            str = abVar2.f64193c;
                        } else {
                            str = null;
                        }
                        cVar.onError(new w(i2, str, j.LOGIN, k.PUSH_VERIFY, null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    public static h<ab> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                l.b();
            }
            hashMap.put("verify_ticket", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                l.b();
            }
            hashMap.put("wait_ticket", str2);
        }
        h<R> a2 = NetworkProxyAccount.d("/passport/push_challenge/request_2sv/", hashMap).a(b.f64220a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }
}
