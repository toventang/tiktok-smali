package com.ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a */
    public static final C3201a f123576a = new C3201a((byte) 0);

    static {
        Covode.recordClassIndex(81121);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a */
    public static final class C3201a {
        static {
            Covode.recordClassIndex(81122);
        }

        private C3201a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$a */
        public static final class C3203a implements com.ss.android.ugc.aweme.sharer.a.a {

            /* renamed from: a */
            final /* synthetic */ Activity f123581a;

            static {
                Covode.recordClassIndex(81123);
            }

            @Override // com.ss.android.ugc.aweme.sharer.a.a
            public final Activity a() {
                Activity activity = this.f123581a;
                if (activity != null) {
                    return activity;
                }
                return f.j();
            }

            C3203a(Activity activity) {
                this.f123581a = activity;
            }
        }

        public /* synthetic */ C3201a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$b */
        public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

            /* renamed from: a */
            public static final b f123587a = new b();

            static {
                Covode.recordClassIndex(81124);
            }

            b() {
                super(1);
            }

            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f44749a = R.raw.icon_color_whatsapp_circle;
                return z.f158842a;
            }
        }

        public static com.ss.android.ugc.aweme.sharer.b a(String str, Activity activity) {
            C3203a aVar = new C3203a(activity);
            com.bytedance.tux.c.b bVar = null;
            if (str == null) {
                return null;
            }
            if (activity != null) {
                bVar = c.a(b.f123587a).a(activity);
            }
            return com.ss.android.ugc.aweme.sharer.c.a(str, new d("www.tiktokv.com", aVar, bVar, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cc2)));
        }
    }
}
