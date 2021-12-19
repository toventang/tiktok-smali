package com.ss.android.ugc.aweme.share.improve.e;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.share.improve.f.d;
import com.ss.android.ugc.aweme.sharer.d;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f123910a = i.a((h.f.a.a) b.f123915a);

    /* renamed from: b  reason: collision with root package name */
    public static final C3219a f123911b = new C3219a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a  reason: collision with other inner class name */
    public static final class C3219a {
        static {
            Covode.recordClassIndex(81351);
        }

        public static List<String> a() {
            return (List) a.f123910a.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$b */
        public static final class b implements com.ss.android.ugc.aweme.sharer.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f123913a;

            static {
                Covode.recordClassIndex(81353);
            }

            @Override // com.ss.android.ugc.aweme.sharer.a.a
            public final Activity a() {
                return this.f123913a;
            }

            b(Activity activity) {
                this.f123913a = activity;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$c */
        public static final class c implements com.ss.android.ugc.aweme.sharer.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f123914a;

            static {
                Covode.recordClassIndex(81354);
            }

            @Override // com.ss.android.ugc.aweme.sharer.a.a
            public final Activity a() {
                return this.f123914a;
            }

            c(Activity activity) {
                this.f123914a = activity;
            }
        }

        private C3219a() {
        }

        public /* synthetic */ C3219a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$a  reason: collision with other inner class name */
        public static final class C3220a extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3220a f123912a = new C3220a();

            static {
                Covode.recordClassIndex(81352);
            }

            C3220a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
                boolean z;
                com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
                l.d(bVar2, "");
                if (C3219a.a().isEmpty() || l.a((Object) bVar2.a(), (Object) "download")) {
                    z = true;
                } else {
                    z = C3219a.a().contains(bVar2.a());
                }
                return Boolean.valueOf(z);
            }
        }

        public static List<com.ss.android.ugc.aweme.sharer.b> a(Activity activity) {
            c cVar = new c(activity);
            Drawable drawable = null;
            com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a("whatsapp", null);
            if (a2 != null) {
                drawable = a2.a(activity);
            }
            d dVar = new d("www.tiktokv.com", cVar, drawable, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cc2));
            ArrayList arrayList = new ArrayList();
            a("snapchat", dVar, arrayList);
            a("instagram", dVar, arrayList);
            a("instagram_story", dVar, arrayList);
            a("whatsapp_status", dVar, arrayList);
            a("zalo", dVar, arrayList);
            a("kakaotalk", dVar, arrayList);
            if (activity != null && com.ss.android.ugc.aweme.sharer.a.d.a(activity, "com.facebook.katana")) {
                a("facebook", dVar, arrayList);
            }
            a("facebook_lite", dVar, arrayList);
            a("messenger", dVar, arrayList);
            a("messenger_lite", dVar, arrayList);
            a("sms", dVar, arrayList);
            a("twitter", dVar, arrayList);
            a("viber", dVar, arrayList);
            a("vk", dVar, arrayList);
            a("whatsapp", dVar, arrayList);
            a("line", dVar, arrayList);
            a("email", dVar, arrayList);
            a("imgur", dVar, arrayList);
            a("kakao_story", dVar, arrayList);
            a("naver_blog", dVar, arrayList);
            a("more", dVar, arrayList);
            return arrayList;
        }

        private static void a(String str, d dVar, List<com.ss.android.ugc.aweme.sharer.b> list) {
            com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a(str, dVar);
            if (a2 != null) {
                list.add(a2);
            }
        }

        public static void a(e.b bVar, boolean z, Activity activity, boolean z2) {
            l.d(bVar, "");
            b bVar2 = new b(activity);
            Drawable drawable = null;
            com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a("whatsapp", null);
            if (a2 != null) {
                drawable = a2.a(activity);
            }
            d dVar = new d("www.tiktokv.com", bVar2, drawable, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cc2));
            if (z2) {
                com.ss.android.ugc.aweme.sharer.c.a("snapchat", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("instagram", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("instagram_story", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("facebook", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("facebook_lite", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("messenger", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("messenger_lite", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("sms", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("twitter", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("viber", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("vk", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("whatsapp", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("line", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("band", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("email", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("imgur", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("kakao_story", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("kakaotalk", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("naver_blog", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("naver_cafe", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("zalo", dVar, bVar);
                com.ss.android.ugc.aweme.sharer.c.a("telegram", dVar, bVar);
            }
            d.a.a();
            bVar.o = true;
            bVar.f124671j = R.string.fu7;
            bVar.f124674m = R.string.a9e;
            bVar.f124666e = true;
            bVar.a(new com.ss.android.ugc.aweme.share.improve.d()).b(new com.ss.android.ugc.aweme.share.improve.f.d()).a(C3220a.f123912a);
            if (z) {
                bVar.a("instagram").a("instagram_story").a("snapchat").a("whatsapp_status");
            }
            if (!IMAdapterServiceImpl.d().a()) {
                bVar.a("chat_merge");
            }
            if (z2) {
                if (!z) {
                    bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
                }
                com.ss.android.ugc.aweme.sharer.c.a("more", dVar, bVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(81350);
    }

    static final class b extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123915a = new b();

        static {
            Covode.recordClassIndex(81355);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.util.List<? extends java.lang.String> invoke() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.share.i.a r0 = com.ss.android.ugc.aweme.share.i.a.a()
                java.lang.String r1 = ""
                h.f.b.l.b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r0 = r0.f123566a
                if (r0 == 0) goto L_0x001e
                com.ss.android.ugc.aweme.share.i.a r0 = com.ss.android.ugc.aweme.share.i.a.a()
                h.f.b.l.b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r0 = r0.f123566a
                if (r0 == 0) goto L_0x0045
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0045
            L_0x001e:
                java.util.List r1 = com.ss.android.ugc.aweme.setting.m.a()
            L_0x0022:
                if (r1 == 0) goto L_0x0050
                java.util.ArrayList r2 = new java.util.ArrayList
                r0 = 10
                int r0 = h.a.n.a(r1, r0)
                r2.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L_0x0033:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x004f
                java.lang.Object r0 = r1.next()
                com.ss.android.ugc.aweme.share.ag r0 = (com.ss.android.ugc.aweme.share.ag) r0
                java.lang.String r0 = r0.f123339a
                r2.add(r0)
                goto L_0x0033
            L_0x0045:
                com.ss.android.ugc.aweme.share.i.a r0 = com.ss.android.ugc.aweme.share.i.a.a()
                h.f.b.l.b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r1 = r0.f123566a
                goto L_0x0022
            L_0x004f:
                return r2
            L_0x0050:
                h.a.z r0 = h.a.z.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.e.a.b.invoke():java.lang.Object");
        }
    }
}
