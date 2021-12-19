package com.ss.android.ugc.aweme.user.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cv;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.user.e;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f142318a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(93091);
    }

    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142319a = new a();

        static {
            Covode.recordClassIndex(93092);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b() {
                /* class com.ss.android.ugc.aweme.user.a.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(93093);
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super b> cVar) {
                    com.ss.android.ugc.aweme.account.network.a aVar = dr.f83127b;
                    l.b(aVar, "");
                    cVar.onNext(aVar.a().a(str, (Class) b.class));
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.a.c$c  reason: collision with other inner class name */
    public static final class C3804c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cv f142322a;

        static {
            Covode.recordClassIndex(93095);
        }

        public C3804c(cv cvVar) {
            this.f142322a = cvVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            cv cvVar = this.f142322a;
            if (cvVar != null) {
                cvVar.onUpdateFailed(com.ss.android.ugc.aweme.a.f62426a.getString(R.string.de2));
            }
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cv f142321a;

        static {
            Covode.recordClassIndex(93094);
        }

        public b(cv cvVar) {
            this.f142321a = cvVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            a aVar;
            boolean z;
            a aVar2;
            Boolean bool;
            b bVar = (b) obj;
            String str2 = null;
            if (bVar != null) {
                str = bVar.f142316a;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, "success")) {
                if (bVar == null || (aVar2 = bVar.f142317b) == null || (bool = aVar2.f142313a) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                c.a(z);
                cv cvVar = this.f142321a;
                if (cvVar != null) {
                    cvVar.onUpdateSuccess(z);
                    return;
                }
                return;
            }
            cv cvVar2 = this.f142321a;
            if (cvVar2 != null) {
                if (!(bVar == null || (aVar = bVar.f142317b) == null)) {
                    str2 = aVar.f142314b;
                }
                cvVar2.onUpdateFailed(str2);
            }
        }
    }

    public static final void a(boolean z) {
        Keva.getRepo("password_status").storeBoolean(e.f142364k.e() + "_password_set_status", z);
    }
}
