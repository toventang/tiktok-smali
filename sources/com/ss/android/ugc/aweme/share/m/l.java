package com.ss.android.ugc.aweme.share.m;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.gj;
import com.ss.android.ugc.aweme.share.ShortenUrlApi;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.al;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.utils.hl;
import f.a.n;
import h.a.ag;
import h.v;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, z> f124093a = ag.a(v.a("aweme", z.ShareVideo), v.a("user", z.ShareUser), v.a("challenge", z.ShareChallenge), v.a("music", z.ShareMusic), v.a("sticker", z.ShareStickers), v.a("live", z.ShareLive), v.a("qna", z.ShareQA), v.a("invite_friends", z.ShareInviteFriends), v.a("group", z.ShareGroupChat), v.a("search", z.ShareSearch));

    /* renamed from: b  reason: collision with root package name */
    public static final l f124094b = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(81498);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124096a;

        static {
            Covode.recordClassIndex(81500);
        }

        b(String str) {
            this.f124096a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            return this.f124096a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f124098a = new d();

        static {
            Covode.recordClassIndex(81502);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124104a;

        static {
            Covode.recordClassIndex(81506);
        }

        h(String str) {
            this.f124104a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            return this.f124104a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f124097a = new c();

        static {
            Covode.recordClassIndex(81501);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.share.model.b bVar = (com.ss.android.ugc.aweme.share.model.b) obj;
            h.f.b.l.d(bVar, "");
            return bVar.f124105a;
        }
    }

    private static void a(String str) {
        ah.f123353b.a(com.bytedance.ies.ugc.appcontext.d.a(), str);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124095a = new a();

        static {
            Covode.recordClassIndex(81499);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ShortenModel shortenModel = (ShortenModel) obj;
            h.f.b.l.d(shortenModel, "");
            if (gj.f90148a) {
                return shortenModel.getData();
            }
            return shortenModel.getShortenUrl();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124099a;

        static {
            Covode.recordClassIndex(81503);
        }

        e(String str) {
            this.f124099a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            h.f.b.l.d(str, "");
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(this.f124099a);
            gVar.a("checksum", str);
            return gVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f124103a = new g();

        static {
            Covode.recordClassIndex(81505);
        }

        g() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ShortenModel shortenModel = (ShortenModel) obj;
            h.f.b.l.d(shortenModel, "");
            if (gj.f90148a) {
                return shortenModel.getData();
            }
            return shortenModel.getShortenUrl();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f124101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f124102c;

        static {
            Covode.recordClassIndex(81504);
        }

        f(String str, String str2, String str3) {
            this.f124100a = str;
            this.f124101b = str2;
            this.f124102c = str3;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            h.f.b.l.d(str, "");
            if (gj.f90148a) {
                n<ShortenModel> a2 = ShortenUrlApi.a(str, "musical_ly");
                h.f.b.l.b(a2, "");
                return a2;
            }
            z zVar = l.f124093a.get(this.f124100a);
            if (zVar == null) {
                zVar = z.ShareDefault;
            }
            return al.a(zVar, this.f124101b, this.f124102c);
        }
    }

    public static n<String> a(String str, String str2, String str3) {
        String str4;
        n<ShortenModel> a2;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        a(str3);
        if (hl.a(str3)) {
            Uri parse = Uri.parse(str3);
            h.f.b.l.b(parse, "");
            if (parse.isOpaque() || parse.getQueryParameterNames().isEmpty()) {
                n<String> a3 = n.a(str3);
                h.f.b.l.b(a3, "");
                return a3;
            }
            str4 = parse.getQueryParameter("share_item_id");
        } else {
            str4 = "";
        }
        if (TextUtils.isEmpty(str4)) {
            if (gj.f90148a) {
                a2 = ShortenUrlApi.a(str3, "musical_ly");
                h.f.b.l.b(a2, "");
            } else {
                z zVar = f124093a.get(str);
                if (zVar == null) {
                    zVar = z.ShareDefault;
                }
                a2 = al.a(zVar, str2, str3);
            }
            n<R> b2 = a2.c(a.f124095a).a(3, TimeUnit.SECONDS).d(new b(str3)).c(f.a.e.b.a.f157195h).b(f.a.h.a.b(f.a.k.a.f158006c));
            h.f.b.l.b(b2, "");
            return b2;
        }
        n<R> b3 = ShortenUrlApi.a(str4).c(c.f124097a).a(1, TimeUnit.SECONDS).d(d.f124098a).c(new e(str3)).a(new f(str, str2, str3)).c(g.f124103a).a(3, TimeUnit.SECONDS).d(new h(str3)).c(f.a.e.b.a.f157195h).b(f.a.h.a.b(f.a.k.a.f158006c));
        h.f.b.l.b(b3, "");
        return b3;
    }
}
