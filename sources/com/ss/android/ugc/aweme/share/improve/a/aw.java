package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.dialog.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class aw {

    public static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a */
        public static final i f123669a = new i();

        static {
            Covode.recordClassIndex(81184);
        }

        i() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(81171);
    }

    public static final class f implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final f f123667a = new f();

        static {
            Covode.recordClassIndex(81181);
        }

        f() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(false));
        }
    }

    public static final class g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public static final g f123668a = new g();

        static {
            Covode.recordClassIndex(81182);
        }

        g() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(true));
        }
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ String $imprId;
        final /* synthetic */ s $listener;
        final /* synthetic */ String $tabName;

        static {
            Covode.recordClassIndex(81173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.$listener = sVar;
            this.$aweme = aweme;
            this.$enterFrom = str;
            this.$tabName = str2;
            this.$imprId = str3;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(R.string.eru, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.a.aw.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(81174);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    s sVar = this.this$0.$listener;
                    if (sVar != null) {
                        sVar.a(new ag(2, this.this$0.$aweme));
                    }
                    aw.b(true, this.this$0.$aweme, this.this$0.$enterFrom, this.this$0.$tabName, this.this$0.$imprId);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.erv, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.a.aw.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(81175);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    aw.b(false, this.this$0.$aweme, this.this$0.$enterFrom, this.this$0.$tabName, this.this$0.$imprId);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ String $imprId;
        final /* synthetic */ s $listener;
        final /* synthetic */ String $tabName;

        static {
            Covode.recordClassIndex(81176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.$listener = sVar;
            this.$aweme = aweme;
            this.$enterFrom = str;
            this.$tabName = str2;
            this.$imprId = str3;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.eru, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.a.aw.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(81177);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    s sVar = this.this$0.$listener;
                    if (sVar != null) {
                        sVar.a(new ag(2, this.this$0.$aweme));
                    }
                    aw.b(true, this.this$0.$aweme, this.this$0.$enterFrom, this.this$0.$tabName, this.this$0.$imprId);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.erv, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.a.aw.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(81178);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    aw.b(false, this.this$0.$aweme, this.this$0.$enterFrom, this.this$0.$tabName, this.this$0.$imprId);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final void a(Aweme aweme) {
        boolean z;
        String uid;
        String str = "";
        l.d(aweme, str);
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        User author = aweme.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        com.ss.android.ugc.aweme.app.f.c a2 = cVar.a("author_id", str);
        if (aweme.getVideo() == null) {
            z = true;
        } else {
            z = false;
        }
        n.a("aweme_video_author_info_unmatch", a2.a("video_is_null", Boolean.valueOf(z)).a());
    }

    public static final class h extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ String $imprId;
        final /* synthetic */ s $listener;
        final /* synthetic */ String $tabName;

        static {
            Covode.recordClassIndex(81183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(s sVar, Aweme aweme, String str, String str2, String str3) {
            super(1);
            this.$listener = sVar;
            this.$aweme = aweme;
            this.$enterFrom = str;
            this.$tabName = str2;
            this.$imprId = str3;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            Long l2;
            String str;
            TcmConfig i2;
            User currentUser;
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
            l.d(aVar, "");
            s sVar = this.$listener;
            if (sVar != null) {
                sVar.a(new ag(2, this.$aweme));
            }
            Aweme aweme = this.$aweme;
            if (aweme != null) {
                aw.b(true, aweme, this.$enterFrom, this.$tabName, this.$imprId);
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("reason", 10);
            Aweme aweme2 = this.$aweme;
            Integer num = null;
            if (aweme2 == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(commerceVideoAuthInfo.getMissionId());
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("mission_id", l2);
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (!(createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null)) {
                num = Integer.valueOf(currentUser.getFollowerCount());
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("creator_followers", num);
            ITcmService j2 = TcmServiceImpl.j();
            if (j2 == null || (i2 = j2.i()) == null || !i2.isTcmCreator()) {
                str = "1";
            } else {
                str = "0";
            }
            r.a("mission_requirement_toast", a4.a("creator_type", str).f66730a);
            return z.f158842a;
        }
    }

    private static final boolean a(Integer num) {
        if (num == null) {
            return false;
        }
        if (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 7 || num.intValue() == 8) {
            return true;
        }
        return false;
    }

    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f123658a;

        /* renamed from: b */
        final /* synthetic */ String f123659b;

        /* renamed from: c */
        final /* synthetic */ String f123660c;

        /* renamed from: d */
        final /* synthetic */ String f123661d;

        static {
            Covode.recordClassIndex(81179);
        }

        d(Aweme aweme, String str, String str2, String str3) {
            this.f123658a = aweme;
            this.f123659b = str;
            this.f123660c = str2;
            this.f123661d = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            aw.b(false, this.f123658a, this.f123659b, this.f123660c, this.f123661d);
        }
    }

    public static final class a implements b.AbstractC1579b {

        /* renamed from: a */
        final /* synthetic */ h.f.a.a f123656a;

        /* renamed from: b */
        final /* synthetic */ Activity f123657b;

        static {
            Covode.recordClassIndex(81172);
        }

        a(h.f.a.a aVar, Activity activity) {
            this.f123656a = aVar;
            this.f123657b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    h.f.a.a aVar = this.f123656a;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                ShareDependService.a.a().a(this.f123657b);
            }
        }
    }

    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ s f123662a;

        /* renamed from: b */
        final /* synthetic */ Aweme f123663b;

        /* renamed from: c */
        final /* synthetic */ String f123664c;

        /* renamed from: d */
        final /* synthetic */ String f123665d;

        /* renamed from: e */
        final /* synthetic */ String f123666e;

        static {
            Covode.recordClassIndex(81180);
        }

        e(s sVar, Aweme aweme, String str, String str2, String str3) {
            this.f123662a = sVar;
            this.f123663b = aweme;
            this.f123664c = str;
            this.f123665d = str2;
            this.f123666e = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            s sVar = this.f123662a;
            if (sVar != null) {
                sVar.a(new ag(2, this.f123663b));
            }
            aw.b(true, this.f123663b, this.f123664c, this.f123665d, this.f123666e);
            dialogInterface.dismiss();
        }
    }

    public static final void a(Activity activity, h.f.a.a<z> aVar) {
        l.d(activity, "");
        if (com.ss.android.ugc.aweme.utils.permission.e.c(activity) == 0) {
            aVar.invoke();
        } else {
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new a(aVar, activity));
        }
    }

    public static final boolean a(Aweme aweme, Context context) {
        l.d(context, "");
        if (aweme == null) {
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        if (status == null || status.isAllowShare()) {
            return true;
        }
        AwemeStatus status2 = aweme.getStatus();
        l.b(status2, "");
        if (status2.isInReviewing()) {
            AwemeStatus status3 = aweme.getStatus();
            l.b(status3, "");
            if (status3.isSelfSee()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.gj9).a();
                return false;
            }
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.a9b).a();
        return false;
    }

    public static void b(boolean z, Aweme aweme, String str, String str2, String str3) {
        String str4;
        long j2;
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        Story story = aweme.getStory();
        if (story != null) {
            j2 = story.getViewerCount();
        } else {
            j2 = -1;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme.getAid()).a("enter_from", str).a("impr_id", str3).a("story_type", str4).a("item_vv", j2);
        if (TextUtils.equals(str, "personal_homepage")) {
            a2.a("tab_name", str2);
        }
        if (z) {
            r.a("confirm_delete_video", a2.f66730a);
        } else {
            r.a("cancel_delete_video", a2.f66730a);
        }
    }

    private static void a(Context context, Aweme aweme, s<ag> sVar, String str, String str2, String str3) {
        QaStruct qaStruct;
        Integer num;
        Integer num2;
        int i2;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2;
        Integer valueOf;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo3;
        String valueOf2;
        String str4 = "";
        l.d(context, str4);
        l.d(aweme, str4);
        l.d(str, str4);
        l.d(str2, str4);
        l.d(str3, str4);
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<T> it = interactStickerStructs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                l.b(next, str4);
                if (next.getQaStruct() != null) {
                    qaStruct = next.getQaStruct();
                    break;
                }
            }
        }
        qaStruct = null;
        a.C0731a aVar = new a.C0731a(context);
        if (aweme.getStarAtlasOrderId() > 0) {
            aVar.b(R.string.b5y);
        } else {
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo4 = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo4 == null || !commerceVideoAuthInfo4.isAdvPromotable()) {
                AwemeStatus status = aweme.getStatus();
                l.b(status, str4);
                if (status.isInReviewing()) {
                    AwemeStatus status2 = aweme.getStatus();
                    l.b(status2, str4);
                    if (status2.isSelfSee() && !aweme.isPrivate()) {
                        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.erx).b(R.string.erw), new b(sVar, aweme, str2, str, str3)).a().b().show();
                        return;
                    }
                }
                if (!(qaStruct == null || (valueOf2 = String.valueOf(qaStruct.getItemId())) == null)) {
                    str4 = valueOf2;
                }
                if (TextUtils.equals(str4, aweme.getAid()) && QnaService.a().enablePublicQna()) {
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.f5i).b(R.string.f5k), new c(sVar, aweme, str2, str, str3)).a().b().show();
                    return;
                } else if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
                    aVar.b(R.string.b65);
                } else {
                    if (aweme == null || (commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(commerceVideoAuthInfo3.getMissionItemStatus());
                    }
                    if (a(num) || !(aweme == null || (commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo()) == null || (valueOf = Integer.valueOf(commerceVideoAuthInfo2.getMissionItemStatus())) == null || (valueOf.intValue() != 5 && valueOf.intValue() != 6))) {
                        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(context);
                        bVar.a(R.string.d4v, new h(sVar, aweme, str2, str, str3));
                        bVar.b(R.string.d4u, i.f123669a);
                        com.bytedance.tux.dialog.internal.b a2 = a.C1094a.a(context).a(R.string.d4y);
                        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf(commerceVideoAuthInfo.getMissionItemStatus());
                        }
                        if (a(num2)) {
                            i2 = R.string.d4w;
                        } else {
                            i2 = R.string.d4x;
                        }
                        ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a2.b(i2)).a(bVar).a(false)).a().b().show();
                        return;
                    }
                    aVar.b(R.string.b5s);
                }
            } else {
                aVar.b(R.string.f1_);
            }
        }
        a.C0731a a3 = aVar.b(R.string.a9e, (DialogInterface.OnClickListener) new d(aweme, str2, str, str3), false).a(R.string.b5p, (DialogInterface.OnClickListener) new e(sVar, aweme, str2, str, str3), false);
        a3.n = f.f123667a;
        a3.o = g.f123668a;
        a3.a().b();
    }

    public static /* synthetic */ void a(Context context, Aweme aweme, s sVar, String str, String str2, String str3, int i2) {
        String str4 = str;
        String str5 = str2;
        String str6 = "";
        if ((i2 & 8) != 0) {
            str4 = str6;
        }
        if ((i2 & 16) != 0) {
            str5 = str6;
        }
        if ((i2 & 32) == 0) {
            str6 = str3;
        }
        a(context, aweme, sVar, str4, str5, str6);
    }
}
