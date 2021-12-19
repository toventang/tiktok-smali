package com.ss.android.ugc.aweme.feed.ui.instagram;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f94782g;

    /* renamed from: h  reason: collision with root package name */
    public static final C2282a f94783h = new C2282a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f94784a;

    /* renamed from: b  reason: collision with root package name */
    public final Keva f94785b;

    /* renamed from: c  reason: collision with root package name */
    public final b f94786c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f94787d;

    /* renamed from: e  reason: collision with root package name */
    public final String f94788e;

    /* renamed from: f  reason: collision with root package name */
    public final String f94789f;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.ies.dmt.ui.dialog.a f94790i;

    /* renamed from: j  reason: collision with root package name */
    private final String f94791j;

    static {
        Covode.recordClassIndex(60132);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a$a  reason: collision with other inner class name */
    public static final class C2282a {
        static {
            Covode.recordClassIndex(60133);
        }

        private C2282a() {
        }

        public static d a() {
            c a2;
            List<String> list = f.a().f94806a;
            if (com.ss.android.ugc.tools.utils.d.a(list)) {
                return null;
            }
            if (list == null) {
                l.b();
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = list.get(i2);
                Locale locale = Locale.ENGLISH;
                l.b(locale, "");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str.toLowerCase(locale);
                l.b(lowerCase, "");
                if (com.ss.android.sdk.a.b.f60131a.a(lowerCase) && (a2 = f.a().a(lowerCase)) != null) {
                    return new d(lowerCase, a2);
                }
            }
            return null;
        }

        public /* synthetic */ C2282a(byte b2) {
            this();
        }
    }

    public final void b() {
        com.bytedance.ies.dmt.ui.dialog.a aVar = this.f94790i;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        if (r5.getBoolean(r1.append(r0.getCurUserId()).toString(), false) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
        r1 = new com.bytedance.ies.dmt.ui.dialog.a.C0731a(r9.f94787d);
        r1.E = true;
        r0 = r9.f94784a.f94800b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        if (r0 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0086, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        r1.f33401a = r0;
        r0 = r9.f94784a.f94801c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r0 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r1.f33402b = r0;
        r1.M = false;
        r0 = r9.f94784a.f94802d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        r2 = r1.a(r2, (android.content.DialogInterface.OnClickListener) new com.ss.android.ugc.aweme.feed.ui.instagram.a.d(r9), true);
        r2.F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (android.text.TextUtils.isEmpty(r9.f94784a.f94803e) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        r2.b(r9.f94784a.f94803e, (android.content.DialogInterface.OnClickListener) new com.ss.android.ugc.aweme.feed.ui.instagram.a.c(r9), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        r0 = r2.a();
        r9.f94790i = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        if (r0 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        h.f.b.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        r0.c();
        r2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").a("enter_method", "feed_popup");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        if (android.text.TextUtils.isEmpty(r9.f94784a.f94803e) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e8, code lost:
        r1 = "single_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        com.ss.android.ugc.aweme.common.r.a("bind_notify", r2.a("ui", r1).a("platform", r9.f94791j).f66730a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ff, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0100, code lost:
        r1 = "double_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r6.getLong(r1.append(r0.getCurUserId()).toString(), 0) < java.lang.System.currentTimeMillis()) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.instagram.a.a():boolean");
    }

    public static String a(String str) {
        StringBuilder append = new StringBuilder().append(str);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return append.append(g2.getCurUserId()).toString();
    }

    public final void a(boolean z) {
        String str;
        if (z) {
            b();
        } else {
            com.ss.android.ugc.aweme.account.b.e().bindMobileOrEmailAndSetPwd(this.f94787d, this.f94788e, this.f94789f, null, new b(this));
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").a("enter_method", "feed_popup");
            if (TextUtils.isEmpty(this.f94784a.f94803e)) {
                str = "single_button";
            } else {
                str = "double_button";
            }
            r.a("bind_notify_confirm", a2.a("ui", str).a("platform", this.f94791j).f66730a);
        }
        this.f94785b.storeLong(a(this.f94786c.f94796b), System.currentTimeMillis() + 86400000);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94793a;

        static {
            Covode.recordClassIndex(60135);
        }

        c(a aVar) {
            this.f94793a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f94793a.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94794a;

        static {
            Covode.recordClassIndex(60136);
        }

        d(a aVar) {
            this.f94794a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f94794a.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94792a;

        static {
            Covode.recordClassIndex(60134);
        }

        b(a aVar) {
            this.f94792a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            Integer num = this.f94792a.f94784a.f94799a;
            if (num != null && 2 == num.intValue()) {
                if (i3 == 1) {
                    this.f94792a.f94785b.storeBoolean(a.a(this.f94792a.f94786c.f94797c), true);
                } else {
                    return;
                }
            }
            this.f94792a.b();
        }
    }

    public a(d dVar, b bVar, Activity activity, String str, String str2) {
        l.d(dVar, "");
        l.d(bVar, "");
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        this.f94786c = bVar;
        this.f94787d = activity;
        this.f94788e = str;
        this.f94789f = str2;
        this.f94784a = dVar.f94805b;
        this.f94791j = dVar.f94804a;
        this.f94785b = Keva.getRepo(bVar.f94795a);
    }
}
