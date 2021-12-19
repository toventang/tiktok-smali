package com.ss.android.ugc.aweme.comment.gift.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.api.GiftListApi;
import com.ss.android.ugc.aweme.comment.util.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.m.p;
import java.util.HashMap;
import java.util.List;

public final class GiftViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public String f71909a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f71910b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f71911c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f71912d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f71913e = "";

    /* renamed from: f  reason: collision with root package name */
    public Long f71914f;

    /* renamed from: g  reason: collision with root package name */
    public final t<Integer> f71915g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public Aweme f71916h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f71917i = i.a((h.f.a.a) g.f71928a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f71918j = i.a((h.f.a.a) b.f71922a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f71919k = i.a((h.f.a.a) f.f71927a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f71920l = i.a((h.f.a.a) a.f71921a);

    static {
        Covode.recordClassIndex(44216);
    }

    public final t<GiftResponse> a() {
        return (t) this.f71917i.getValue();
    }

    public final t<GiftStruct> b() {
        return (t) this.f71918j.getValue();
    }

    public final t<HashMap<Long, String>> c() {
        return (t) this.f71919k.getValue();
    }

    public final t<Long> d() {
        return (t) this.f71920l.getValue();
    }

    static final class b extends m implements h.f.a.a<t<GiftStruct>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71922a = new b();

        static {
            Covode.recordClassIndex(44218);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<GiftStruct> invoke() {
            return new t();
        }
    }

    static final class g extends m implements h.f.a.a<t<GiftResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f71928a = new g();

        static {
            Covode.recordClassIndex(44223);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<GiftResponse> invoke() {
            return new t();
        }
    }

    static final class a extends m implements h.f.a.a<t<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71921a = new a();

        static {
            Covode.recordClassIndex(44217);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Long> invoke() {
            t tVar = new t();
            tVar.setValue(-1L);
            return tVar;
        }
    }

    static final class f extends m implements h.f.a.a<t<HashMap<Long, String>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f71927a = new f();

        static {
            Covode.recordClassIndex(44222);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<HashMap<Long, String>> invoke() {
            t tVar = new t();
            tVar.setValue(new HashMap());
            return tVar;
        }
    }

    public final void e() {
        String str;
        a().getValue();
        Aweme aweme = this.f71916h;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        new f.a.b.a().a(GiftListApi.a.a(str, this.f71911c).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this)));
    }

    private static boolean a(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getFileHash()) && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            return true;
        }
        return false;
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiftViewModel f71926a;

        static {
            Covode.recordClassIndex(44221);
        }

        e(GiftViewModel giftViewModel) {
            this.f71926a = giftViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            l.d(th, str);
            this.f71926a.a().setValue(null);
            th.getMessage();
            GiftViewModel giftViewModel = this.f71926a;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            giftViewModel.a((Integer) 0, str);
        }
    }

    public static final class h implements com.bytedance.android.livesdkapi.depend.d.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiftViewModel f71929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f71931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f71932d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Long f71933e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f71934f;

        static {
            Covode.recordClassIndex(44224);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(long j2) {
            this.f71929a.d().setValue(Long.valueOf(j2));
            if (l.a((Object) this.f71930b, (Object) "from_recharge")) {
                this.f71929a.a(Integer.valueOf(this.f71931c), Long.valueOf(this.f71932d), this.f71933e);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(Throwable th) {
            l.d(th, "");
            this.f71929a.d().setValue(-1L);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("failure_reason", message).a("enter_from", this.f71929a.f71909a);
            l.b(a2, "");
            r.a("refresh_coin_balance_fail", a2.f66730a);
            if (l.a((Object) this.f71930b, (Object) "from_recharge")) {
                this.f71929a.a(Integer.valueOf(this.f71931c), Long.valueOf(this.f71932d), this.f71933e);
            }
            if (this.f71934f != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f71934f).a(R.string.hb1).a();
            }
        }

        h(GiftViewModel giftViewModel, String str, int i2, long j2, Long l2, Context context) {
            this.f71929a = giftViewModel;
            this.f71930b = str;
            this.f71931c = i2;
            this.f71932d = j2;
            this.f71933e = l2;
            this.f71934f = context;
        }
    }

    public static final class c implements com.ss.ugc.live.a.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiftViewModel f71923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f71924b;

        static {
            Covode.recordClassIndex(44219);
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a() {
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a(Throwable th) {
            l.d(th, "");
        }

        @Override // com.ss.ugc.live.a.a.d
        public final void a(String str) {
            l.d(str, "");
            HashMap<Long, String> value = this.f71923a.c().getValue();
            if (value == null) {
                value = new HashMap<>();
            } else if (value.containsKey(Long.valueOf(this.f71924b)) && p.a(value.get(Long.valueOf(this.f71924b)), str, false)) {
                return;
            }
            value.put(Long.valueOf(this.f71924b), str);
            this.f71923a.c().postValue(value);
        }

        c(GiftViewModel giftViewModel, long j2) {
            this.f71923a = giftViewModel;
            this.f71924b = j2;
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiftViewModel f71925a;

        static {
            Covode.recordClassIndex(44220);
        }

        d(GiftViewModel giftViewModel) {
            this.f71925a = giftViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            int i2 = 0;
            if (obj != null) {
                this.f71925a.a().setValue(obj);
                GiftViewModel giftViewModel = this.f71925a;
                if (giftViewModel.f71914f == null) {
                    giftViewModel.f71915g.setValue(0);
                } else {
                    GiftResponse value = giftViewModel.a().getValue();
                    if (!(value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null)) {
                        int i3 = 0;
                        for (T t : giftPageList2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                n.a();
                            }
                            List<GiftStruct> giftList = t.getGiftList();
                            if (giftList != null) {
                                for (T t2 : giftList) {
                                    long id = t2.getId();
                                    Long l2 = giftViewModel.f71914f;
                                    if (l2 != null && id == l2.longValue()) {
                                        giftViewModel.f71914f = null;
                                        giftViewModel.f71915g.setValue(Integer.valueOf(i3));
                                        giftViewModel.b().setValue(t2);
                                        giftViewModel.a(t2.getId(), t2.getEffectAsset());
                                    }
                                }
                            }
                            i3 = i4;
                        }
                    }
                }
                i2 = 1;
            } else {
                this.f71925a.a().setValue(null);
            }
            this.f71925a.a(Integer.valueOf(i2), "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.ugc.live.a.a.c b(long r3, com.ss.android.ugc.aweme.base.model.UrlModel r5) {
        /*
            boolean r1 = a(r5)
            r0 = 0
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.ss.ugc.live.a.a.c r2 = new com.ss.ugc.live.a.a.c
            if (r5 == 0) goto L_0x0028
            java.util.List r1 = r5.getUrlList()
            if (r1 == 0) goto L_0x0028
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
        L_0x0020:
            java.lang.String r0 = r5.getFileHash()
        L_0x0024:
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0028:
            r1 = r0
            if (r5 == 0) goto L_0x0024
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel.b(long, com.ss.android.ugc.aweme.base.model.UrlModel):com.ss.ugc.live.a.a.c");
    }

    public final void a(long j2, UrlModel urlModel) {
        com.ss.ugc.live.a.a.c b2;
        if (urlModel != null && (b2 = b(j2, urlModel)) != null) {
            a.f71941g.a(b2, (com.ss.ugc.live.a.a.d) new c(this, j2));
        }
    }

    public final void a(Integer num, String str) {
        String str2 = this.f71913e;
        if (str2 != null && str2.length() != 0) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71909a).a("group_id", this.f71910b).a("author_id", this.f71911c).a("is_follow", s.b(this.f71916h)).a("is_like", s.b(this.f71916h)).a("enter_method", this.f71913e).a("is_success", num).a("error_code", str);
            l.b(a2, "");
            this.f71913e = "";
            r.a("show_gift_panel_result", a2.f66730a);
        }
    }

    public final void a(Integer num, Long l2, Long l3) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71909a).a("group_id", this.f71910b).a("author_id", this.f71911c).a("product_id", l2).a("is_success", num).a("previous_balance", l3).a("new_balance", d().getValue());
        l.b(a2, "");
        r.a("confirm_coin_recharge", a2.f66730a);
    }

    public final void a(String str, Context context, int i2, long j2) {
        l.d(str, "");
        d().setValue(-1L);
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().a(new h(this, str, i2, j2, d().getValue(), context));
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.f71909a = str;
        this.f71910b = str2;
        this.f71911c = str3;
        this.f71912d = str4;
    }
}
