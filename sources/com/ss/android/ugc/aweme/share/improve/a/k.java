package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.w;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.g;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

public class k implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f123759h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.n.e f123760a = new e(this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f123761b = true;

    /* renamed from: c  reason: collision with root package name */
    public Uri f123762c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f123763d;

    /* renamed from: e  reason: collision with root package name */
    public final Aweme f123764e;

    /* renamed from: f  reason: collision with root package name */
    public final String f123765f;

    /* renamed from: g  reason: collision with root package name */
    public final String f123766g;

    /* renamed from: i  reason: collision with root package name */
    private final String f123767i;

    static {
        Covode.recordClassIndex(81231);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "save";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_arrow_down_to_line;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81232);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.share.m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f123768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharePackage f123769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f123770c;

        static {
            Covode.recordClassIndex(81233);
        }

        @Override // com.ss.android.ugc.aweme.share.m.f
        public final void b() {
            w.a.a(this.f123768a.f123764e.getAid(), this.f123768a.f123764e.getAuthorUid(), this.f123770c, this.f123768a.f123766g, "cancel");
        }

        @Override // com.ss.android.ugc.aweme.share.m.f
        public final void a() {
            this.f123768a.a(this.f123769b);
            w.a.a(this.f123768a.f123764e.getAid(), this.f123768a.f123764e.getAuthorUid(), this.f123770c, this.f123768a.f123766g, "download");
        }

        b(k kVar, SharePackage sharePackage, String str) {
            this.f123768a = kVar;
            this.f123769b = sharePackage;
            this.f123770c = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123771a = new c();

        static {
            Covode.recordClassIndex(81234);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (com.ss.android.ugc.aweme.language.d.i()) {
                com.ss.android.ugc.aweme.base.h.e g2 = com.ss.android.ugc.aweme.base.h.d.g();
                if (g2.a("japan_share_download_dot", -1) != 1) {
                    g2.b("japan_share_download_dot", 1);
                }
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        if (!com.ss.android.ugc.aweme.share.d.c.b() || !com.ss.android.ugc.aweme.share.d.c.a()) {
            return R.string.fgc;
        }
        return R.string.bvg;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f123764e.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
    }

    public static final class f extends com.ss.android.ugc.aweme.feed.share.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f123776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f123777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f123778c = false;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f123779d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f123780e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f123781f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f123782g;

        static {
            Covode.recordClassIndex(81239);
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.a, com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a() {
            super.a();
            if (this.f123778c) {
                r.a("download_without_logo_status", new com.ss.android.ugc.aweme.app.f.d().a("download_result", "fail").a("group_id", this.f123779d.getAid()).a("author_id", ac.a(this.f123779d)).a("enter_from", this.f123780e).f66730a);
            }
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f123783a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f123784b;

            static {
                Covode.recordClassIndex(81240);
            }

            a(f fVar, String str) {
                this.f123783a = fVar;
                this.f123784b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.i(10161);
                try {
                    this.f123783a.f123776a.f123762c = c.b.e.b(this.f123783a.f123781f, new File(this.f123784b).getName());
                    if (this.f123783a.f123776a.f123762c == null) {
                        this.f123783a.f123776a.f123762c = c.b.e.b(this.f123783a.f123781f, new File(this.f123784b).getName(), "video/mp4");
                        if (this.f123783a.f123776a.f123762c != null) {
                            ContentResolver contentResolver = this.f123783a.f123781f.getContentResolver();
                            Uri uri = this.f123783a.f123776a.f123762c;
                            if (uri == null) {
                                l.b();
                            }
                            c.b.d.a(new FileInputStream(this.f123784b), contentResolver.openOutputStream(uri, "w"));
                        }
                        String a2 = c.d.a.a(this.f123783a.f123781f, this.f123783a.f123776a.f123762c);
                        if (a2 != null) {
                            c.b.e.c(this.f123783a.f123781f, a2);
                        }
                    }
                } catch (Exception e2) {
                    this.f123783a.f123776a.f123761b = false;
                    com.bytedance.services.apm.api.a.a((Throwable) e2, "open share video failed");
                }
                z zVar = z.f158842a;
                MethodCollector.o(10161);
                return zVar;
            }
        }

        public static final class d extends g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f123787a;

            static {
                Covode.recordClassIndex(81243);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            d(f fVar) {
                this.f123787a = fVar;
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.g, com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
                String str = this.f123787a.f123780e;
                l.b(str, "");
                aVar.a(3, str, "download", context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b, com.ss.android.ugc.aweme.sharer.ui.g
            public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f123787a.f123779d.getAid()).a("author_id", ac.a(this.f123787a.f123779d)).a("enter_from", this.f123787a.f123780e).a("is_downloaded_share_window", "1").a("platform", bVar.a()).a("share_form", "video_form");
                ShareInfo shareInfo = this.f123787a.f123779d.getShareInfo();
                l.b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                if (shareUrl == null) {
                    shareUrl = this.f123787a.f123779d.getShareUrl();
                }
                r.a("share_video", a2.a("share_url", shareUrl).a(y.b(FeedParamProvider.a.a(context).getPreviousPage(), FeedParamProvider.a.a(context).getFromGroupId())).f66730a);
            }
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.a, com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a(String str) {
            Context b2;
            String str2;
            if (!this.f123777b) {
                boolean exists = new File(str).exists();
                com.bytedance.ies.ugc.appcontext.d.a();
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = com.ss.android.ugc.trill.share.a.a();
                }
                if (j.f107226e) {
                    n.a("aweme_share_monitor", new com.ss.android.ugc.aweme.app.f.c().a("filePath", str).a("share_platform", "download").a("fileLength", String.valueOf(new File(str).length())).a("fileExist", String.valueOf(exists)).a());
                }
            }
            if (this.f123778c) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (TextUtils.isEmpty(str)) {
                    str2 = "fail";
                } else {
                    str2 = "success";
                }
                r.a("download_without_logo_status", dVar.a("download_result", str2).a("group_id", this.f123779d.getAid()).a("author_id", ac.a(this.f123779d)).a("enter_from", this.f123780e).f66730a);
            }
            if (TextUtils.isEmpty(str) || (b2 = b()) == null) {
                return;
            }
            if (com.ss.android.ugc.aweme.utils.permission.e.c(b2) != 0) {
                com.bytedance.services.apm.api.a.a((Throwable) new IllegalStateException("try to download video, but no permission"));
            } else {
                i.b(new a(this, str), i.f4824a).a(new b(this), i.f4826c, null);
            }
        }

        static final class b<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f123785a;

            static {
                Covode.recordClassIndex(81241);
            }

            b(f fVar) {
                this.f123785a = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1 A[Catch:{ Exception -> 0x0174 }] */
            @Override // b.g
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object then(b.i r13) {
                /*
                // Method dump skipped, instructions count: 381
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.k.f.b.then(b.i):java.lang.Object");
            }
        }

        public static final class c extends com.ss.android.ugc.aweme.sharer.e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123786a;

            static {
                Covode.recordClassIndex(81242);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(com.ss.android.ugc.aweme.sharer.b bVar, com.ss.android.ugc.aweme.sharer.b bVar2) {
                super(bVar2);
                this.f123786a = bVar;
            }

            @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
            public final boolean a(com.ss.android.ugc.aweme.sharer.h hVar, Context context) {
                l.d(hVar, "");
                l.d(context, "");
                com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a("facebook_story", null);
                if (a2 == null || !(hVar instanceof com.ss.android.ugc.aweme.sharer.n) || !a2.b(context)) {
                    return this.f123786a.a(hVar, context);
                }
                return a2.a(hVar, context);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar, boolean z, boolean z2, Aweme aweme, String str, Context context, String str2, Context context2) {
            super(context2);
            this.f123776a = kVar;
            this.f123777b = z;
            this.f123779d = aweme;
            this.f123780e = str;
            this.f123781f = context;
            this.f123782g = str2;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f123764e.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2 || !com.ss.android.ugc.aweme.language.d.i() || com.ss.android.ugc.aweme.base.h.d.g().a("japan_share_download_dot", -1) == 1) {
            return false;
        }
        return true;
    }

    static final class e implements com.ss.android.ugc.aweme.feed.n.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f123775a;

        static {
            Covode.recordClassIndex(81238);
        }

        e(k kVar) {
            this.f123775a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.feed.n.e
        public final String a_(boolean z) {
            return this.f123775a.f123765f;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f123772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharePackage f123773b;

        static {
            Covode.recordClassIndex(81235);
        }

        d(k kVar, SharePackage sharePackage) {
            this.f123772a = kVar;
            this.f123773b = sharePackage;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (!ai.a(iVar)) {
                return null;
            }
            final int i2 = this.f123773b.f124595i.getInt("page_type");
            aw.a(this.f123772a.f123763d, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.a.k.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(81236);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    m.f68150a.a(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.share.improve.a.k.d.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f123774a;

                        static {
                            Covode.recordClassIndex(81237);
                        }

                        {
                            this.f123774a = r1;
                        }

                        public final void run() {
                            boolean z;
                            boolean z2;
                            k kVar = this.f123774a.this$0.f123772a;
                            Aweme aweme = this.f123774a.this$0.f123772a.f123764e;
                            Activity activity = this.f123774a.this$0.f123772a.f123763d;
                            int i2 = i2;
                            String str = this.f123774a.this$0.f123772a.f123765f;
                            Aweme aweme2 = this.f123774a.this$0.f123772a.f123764e;
                            l.d(aweme2, "");
                            SharePrefCache inst = SharePrefCache.inst();
                            l.b(inst, "");
                            aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
                            l.b(isPrivateAvailable, "");
                            Boolean c2 = isPrivateAvailable.c();
                            boolean d2 = com.ss.android.ugc.aweme.utils.z.d(aweme2);
                            if (aweme2.getAuthor() != null) {
                                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                                l.b(g2, "");
                                String curUserId = g2.getCurUserId();
                                User author = aweme2.getAuthor();
                                l.b(author, "");
                                if (com.bytedance.common.utility.m.a(curUserId, author.getUid())) {
                                    z = true;
                                    l.b(c2, "");
                                    if (c2.booleanValue() || !d2 || !z) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    kVar.a(aweme, activity, i2, str, z2);
                                }
                            }
                            z = false;
                            l.b(c2, "");
                            if (c2.booleanValue()) {
                            }
                            z2 = false;
                            kVar.a(aweme, activity, i2, str, z2);
                        }
                    }, 500);
                    return z.f158842a;
                }
            });
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    private static Integer a(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (l.a((Object) com.ss.android.ugc.aweme.share.c.f123414a, (Object) "long_press_download")) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadMaskPanel = awemeACLShareInfo.getDownloadMaskPanel()) == null) {
                return null;
            }
            return Integer.valueOf(downloadMaskPanel.getCode());
        }
        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 == null || (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) == null) {
            return null;
        }
        return Integer.valueOf(downloadGeneral.getCode());
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public final void a(SharePackage sharePackage) {
        Integer a2 = a(this.f123764e);
        if (a2 != null && a2.intValue() == 0) {
            i.b(c.f123771a, i.f4824a).a(new d(this, sharePackage), i.f4826c, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r6, com.ss.android.ugc.aweme.sharer.ui.SharePackage r7) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.k.a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }

    public k(Activity activity, Aweme aweme, String str, String str2, String str3) {
        l.d(activity, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f123763d = activity;
        this.f123764e = aweme;
        this.f123765f = str;
        this.f123766g = str2;
        this.f123767i = str3;
    }

    public final void a(Aweme aweme, Context context, int i2, String str, boolean z) {
        String str2;
        l.d(aweme, "");
        l.d(context, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.share.d.c.a(str);
        com.ss.android.ugc.aweme.share.d.c.f123458j = i2;
        com.ss.android.ugc.aweme.feed.n.e eVar = this.f123760a;
        if (eVar != null) {
            str2 = eVar.a_(true);
        } else {
            str2 = str;
        }
        com.ss.android.ugc.trill.share.base.b bVar = new com.ss.android.ugc.trill.share.base.b(context, false, i2, "download");
        l.b(str2, "");
        bVar.a(str2);
        bVar.b(this.f123766g);
        bVar.c(this.f123767i);
        bVar.a(new f(this, z, false, aweme, str2, context, str, context));
        com.ss.android.ugc.aweme.share.c.a(str, aweme);
        bVar.a(aweme, "download_action", false);
    }
}
