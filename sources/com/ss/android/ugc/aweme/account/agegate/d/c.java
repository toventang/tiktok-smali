package com.ss.android.ugc.aweme.account.agegate.d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import f.a.d.f;
import h.f.a.m;
import h.f.b.l;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(38678);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f62769b;

        static {
            Covode.recordClassIndex(38679);
        }

        public a(h.f.a.b bVar, m mVar) {
            this.f62768a = bVar;
            this.f62769b = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            com.ss.android.ugc.aweme.account.agegate.api.b bVar = (com.ss.android.ugc.aweme.account.agegate.api.b) obj;
            if (bVar.status_code == 0) {
                h.f.a.b bVar2 = this.f62768a;
                Integer num = bVar.f62626a;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                bVar2.invoke(Integer.valueOf(i2));
                JSONObject a2 = new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/tiktok/v1/calculate/age/").a("status", (Integer) 0).a();
                l.b(a2, "");
                com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", a2);
                return;
            }
            m mVar = this.f62769b;
            Integer valueOf = Integer.valueOf(bVar.status_code);
            String str = bVar.message;
            l.b(str, "");
            mVar.invoke(valueOf, str);
            JSONObject a3 = new com.ss.android.ugc.aweme.app.f.c().a("error_message", Integer.valueOf(bVar.status_code)).a(StringSet.type, "/tiktok/v1/calculate/age/").a("status", (Integer) 1).a();
            l.b(a3, "");
            com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", a3);
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f62770a;

        static {
            Covode.recordClassIndex(38680);
        }

        public b(m mVar) {
            this.f62770a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            Throwable th = (Throwable) obj;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                m mVar = this.f62770a;
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                Integer valueOf = Integer.valueOf(aVar.getErrorCode());
                String errorMsg = aVar.getErrorMsg();
                l.b(errorMsg, "");
                mVar.invoke(valueOf, errorMsg);
            } else {
                this.f62770a.invoke(1, "");
            }
            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.a) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = 0;
            }
            JSONObject a2 = cVar.a("error_message", Integer.valueOf(i2)).a(StringSet.type, "/tiktok/v1/calculate/age/").a("status", (Integer) 1).a();
            l.b(a2, "");
            com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", a2);
        }
    }
}
