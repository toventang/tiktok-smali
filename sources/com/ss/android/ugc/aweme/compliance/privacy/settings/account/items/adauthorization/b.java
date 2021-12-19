package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.d;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AdAuthorizationApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f77510a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f77511b = i.a((h.f.a.a) a.f77512a);

    private b() {
    }

    static final class a extends m implements h.f.a.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77512a = new a();

        static {
            Covode.recordClassIndex(47968);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q();
        }
    }

    static {
        Covode.recordClassIndex(47967);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b  reason: collision with other inner class name */
    public static final class C1795b implements d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f77514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f77515c;

        static {
            Covode.recordClassIndex(47969);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b$a */
        static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
            final /* synthetic */ C1795b this$0;

            static {
                Covode.recordClassIndex(47970);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1795b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(R.string.mz, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b.C1795b.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(47971);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        b.a(this.this$0.this$0.f77514b, this.this$0.this$0.f77515c, this.this$0.this$0.f77513a, true);
                        return z.f158842a;
                    }
                });
                bVar2.b(R.string.b6z, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                bVar2.f44820b = true;
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b$b$b  reason: collision with other inner class name */
        static final class C1796b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1796b f77516a = new C1796b();

            static {
                Covode.recordClassIndex(47972);
            }

            C1796b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(R.string.b75, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                return z.f158842a;
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            c cVar = this.f77513a;
            if (cVar != null) {
                cVar.b();
            }
            Context context = this.f77514b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new com.bytedance.tux.g.b((Activity) context).a("Request Failed").b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
            if (r1 != null) goto L_0x0024;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        @Override // com.bytedance.retrofit2.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.bytedance.retrofit2.b<java.lang.String> r5, com.bytedance.retrofit2.u<java.lang.String> r6) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.b.C1795b.a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
        }

        C1795b(c cVar, Context context, boolean z) {
            this.f77513a = cVar;
            this.f77514b = context;
            this.f77515c = z;
        }
    }

    public static o a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            f77511b.getValue();
            com.google.gson.l a2 = q.a(str);
            l.b(a2, "");
            return a2.j();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Context context, boolean z, c cVar, boolean z2) {
        l.d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("ad_authorization", Boolean.valueOf(z));
        hashMap.put("confirmed", Boolean.valueOf(z2));
        if (cVar != null) {
            cVar.c();
        }
        AdAuthorizationApi.a.f77504a.requestAdAuthorization(hashMap).enqueue(new C1795b(cVar, context, z));
    }
}
