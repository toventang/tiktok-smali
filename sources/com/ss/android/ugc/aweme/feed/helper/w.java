package com.ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f93432a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93433b = i.a((h.f.a.a) b.f93438a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f93434c = i.a((h.f.a.a) c.f93439a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f93435d = i.a((h.f.a.a) a.f93437a);

    /* renamed from: e  reason: collision with root package name */
    private static final ArrayList<String> f93436e = new ArrayList<>();

    public static Keva a() {
        return (Keva) f93435d.getValue();
    }

    private static com.ss.android.ugc.aweme.sharer.b b() {
        return (com.ss.android.ugc.aweme.sharer.b) f93433b.getValue();
    }

    private static com.ss.android.ugc.aweme.sharer.b c() {
        return (com.ss.android.ugc.aweme.sharer.b) f93434c.getValue();
    }

    private w() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93437a = new a();

        static {
            Covode.recordClassIndex(59200);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("SHARE_CHANNEL_RECORDER");
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.sharer.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93438a = new b();

        static {
            Covode.recordClassIndex(59201);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sharer.b invoke() {
            return com.ss.android.ugc.aweme.sharer.c.a("whatsapp", null);
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.sharer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f93441a;

        static {
            Covode.recordClassIndex(59204);
        }

        @Override // com.ss.android.ugc.aweme.sharer.a.a
        public final Activity a() {
            Activity activity = this.f93441a;
            if (activity != null) {
                return activity;
            }
            return f.j();
        }

        d(Activity activity) {
            this.f93441a = activity;
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.sharer.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f93439a = new c();

        static {
            Covode.recordClassIndex(59202);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sharer.b invoke() {
            com.bytedance.tux.c.b bVar;
            Activity j2 = f.j();
            if (j2 != null) {
                bVar = com.bytedance.tux.c.c.a(a.f93440a).a(j2);
            } else {
                bVar = null;
            }
            return com.ss.android.ugc.aweme.sharer.c.a("whatsapp_status", new com.ss.android.ugc.aweme.sharer.d(null, null, bVar, null));
        }

        static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f93440a = new a();

            static {
                Covode.recordClassIndex(59203);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f44749a = R.raw.icon_color_whatsapp_circle;
                return z.f158842a;
            }
        }
    }

    static {
        Covode.recordClassIndex(59199);
    }

    public static final boolean a(Context context) {
        if (com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_whatsapp_style", 0) == 0 || !b(context)) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context) {
        if (context == null || b() == null) {
            return false;
        }
        com.ss.android.ugc.aweme.sharer.b b2 = b();
        if (b2 == null) {
            l.b();
        }
        return b2.b(context);
    }

    public static final boolean a(Aweme aweme) {
        long[] typeLabels;
        l.d(aweme, "");
        if (aweme.getAwemeType() == 56) {
            return true;
        }
        User author = aweme.getAuthor();
        if (!(author == null || (typeLabels = author.getTypeLabels()) == null || !h.a.i.a(typeLabels))) {
            return true;
        }
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (textExtra != null && !textExtra.isEmpty()) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                l.b(textExtraStruct, "");
                String hashTagName = textExtraStruct.getHashTagName();
                if (hashTagName != null && !p.a((CharSequence) hashTagName)) {
                    String hashTagName2 = textExtraStruct.getHashTagName();
                    l.b(hashTagName2, "");
                    if (!p.a((CharSequence) hashTagName2, (CharSequence) "status", false)) {
                        String hashTagName3 = textExtraStruct.getHashTagName();
                        l.b(hashTagName3, "");
                        if (p.a((CharSequence) hashTagName3, (CharSequence) "Status", false)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static ArrayList<String> b(Activity activity) {
        ArrayList<String> arrayList = f93436e;
        if (arrayList.isEmpty()) {
            d dVar = new d(activity);
            com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a("instagram", null);
            if (a2 != null) {
                arrayList.add(a2.a());
            }
            com.ss.android.ugc.aweme.sharer.b a3 = com.ss.android.ugc.aweme.sharer.c.a("instagram_story", null);
            if (a3 != null) {
                arrayList.add(a3.a());
            }
            com.ss.android.ugc.aweme.sharer.b a4 = com.ss.android.ugc.aweme.sharer.c.a("facebook", new com.ss.android.ugc.aweme.sharer.d(null, dVar, null, null));
            if (a4 != null) {
                arrayList.add(a4.a());
            }
            com.ss.android.ugc.aweme.sharer.b a5 = com.ss.android.ugc.aweme.sharer.c.a("facebook_lite", null);
            if (a5 != null) {
                arrayList.add(a5.a());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r2) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(android.app.Activity r10) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.helper.w.a(android.app.Activity):boolean");
    }
}
