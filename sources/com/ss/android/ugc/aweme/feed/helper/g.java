package com.ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.assem.arch.b.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.api.ExposeShareMsgApi;
import com.ss.android.ugc.aweme.feed.experiment.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import f.a.z;
import h.f.b.ab;
import h.f.b.l;

public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final a f93325g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f93326a;

    /* renamed from: b  reason: collision with root package name */
    public ExposeSharerData f93327b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f93328c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f93329d;

    /* renamed from: e  reason: collision with root package name */
    public String f93330e;

    /* renamed from: f  reason: collision with root package name */
    public b f93331f;

    public interface b {
        static {
            Covode.recordClassIndex(59164);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(59162);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59163);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Activity activity) {
            if (activity == null || activity.getIntent() == null) {
                return false;
            }
            return activity.getIntent().getBooleanExtra("share_expose_sharer", false);
        }
    }

    public static final class c implements z<ExposeSharerData> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f93332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f93333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f93334c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f93335d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f93336e;

        static {
            Covode.recordClassIndex(59165);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f93332a.f93326a = false;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f93332a.f93326a = false;
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f93332a.f93328c = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(ExposeSharerData exposeSharerData) {
            b bVar;
            ExposeSharerData exposeSharerData2 = exposeSharerData;
            String str = "";
            l.d(exposeSharerData2, str);
            if (exposeSharerData2.status_code == 0) {
                String str2 = this.f93333b;
                if (str2 != null) {
                    String str3 = this.f93334c;
                    if (str3 == null) {
                        str3 = str;
                    }
                    String str4 = this.f93335d;
                    if (str4 != null) {
                        str = str4;
                    }
                    com.ss.android.ugc.aweme.notice.repo.a.b.b(str2, new com.ss.android.ugc.aweme.notice.repo.a.a(null, str, str3, 1));
                }
                exposeSharerData2.aid = this.f93336e;
                this.f93332a.f93327b = exposeSharerData2;
                if (this.f93332a.f93331f != null && !this.f93332a.f93329d && exposeSharerData2.exposeSharer != null && (bVar = this.f93332a.f93331f) != null) {
                    if (exposeSharerData2.exposeSharer == null) {
                        l.b();
                    }
                    bVar.a();
                }
            }
        }

        c(g gVar, String str, String str2, String str3, String str4) {
            this.f93332a = gVar;
            this.f93333b = str;
            this.f93334c = str2;
            this.f93335d = str3;
            this.f93336e = str4;
        }
    }

    public final boolean a(aj ajVar) {
        if (ajVar == null || ajVar.b() == null || !b(ajVar.b())) {
            return false;
        }
        a(ajVar.b());
        b(ajVar);
        return true;
    }

    public final boolean b(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(aweme.getAid(), this.f93330e)) {
            return false;
        }
        return true;
    }

    public static void b(aj ajVar) {
        aj ajVar2;
        com.ss.android.ugc.aweme.feed.assem.b bVar;
        if (ajVar instanceof ce) {
            ((ce) ajVar).at().a("show_expose_sharer_info_view", (Object) true);
            if (!(ajVar instanceof VideoBaseCell)) {
                ajVar2 = null;
            } else {
                ajVar2 = ajVar;
            }
            VideoBaseCell videoBaseCell = (VideoBaseCell) ajVar2;
            if (videoBaseCell != null && videoBaseCell.K() && w.b() && (bVar = ((VideoBaseCell) ajVar).o) != null) {
                u.a(bVar, ab.a(com.ss.android.ugc.aweme.feed.assem.sharer.a.class));
            }
        }
    }

    public final boolean a(Aweme aweme) {
        ExposeSharer exposeSharer;
        if (!b(aweme) || this.f93327b == null) {
            return false;
        }
        if (aweme == null) {
            l.b();
        }
        ExposeSharerData exposeSharerData = this.f93327b;
        if (exposeSharerData != null) {
            exposeSharer = exposeSharerData.exposeSharer;
        } else {
            exposeSharer = null;
        }
        aweme.setExposeSharer(exposeSharer);
        this.f93329d = true;
        return true;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r14 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r14 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r14 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r14 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r14 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13, android.app.Activity r14) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.helper.g.a(java.lang.String, android.app.Activity):void");
    }

    public final void a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        if (z && !this.f93326a && !TextUtils.isEmpty(str) && !TextUtils.equals(this.f93330e, str)) {
            this.f93330e = str;
            this.f93326a = true;
            this.f93329d = false;
            ExposeShareMsgApi.a(str2, str3, str4, str5, str, str6, str7).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new c(this, str4, str, str2, str));
        }
    }
}
