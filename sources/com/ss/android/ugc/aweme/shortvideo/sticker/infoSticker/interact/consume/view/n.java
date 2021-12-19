package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f130599a;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d f130600l;

    static {
        Covode.recordClassIndex(85628);
    }

    public final FrameLayout c() {
        return (FrameLayout) this.f130599a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        return c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(1947);
        View view = new View(this.f130436i);
        MethodCollector.o(1947);
        return view;
    }

    static final class h extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(85639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            MethodCollector.i(1642);
            FrameLayout frameLayout = new FrameLayout(this.$context);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            MethodCollector.o(1642);
            return frameLayout;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130601a;

        static {
            Covode.recordClassIndex(85629);
        }

        a(n nVar) {
            this.f130601a = nVar;
        }

        public final void run() {
            MentionStruct mentionInfo;
            InteractStickerStruct interactStickerStruct = this.f130601a.f130433f;
            if (interactStickerStruct != null && (mentionInfo = interactStickerStruct.getMentionInfo()) != null) {
                SmartRouter.buildRoute(this.f130601a.f130436i, "//user/profile").withParam("uid", mentionInfo.getUserId()).withParam("sec_user_id", mentionInfo.getSecUid()).open();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130602a;

        static {
            Covode.recordClassIndex(85630);
        }

        b(n nVar) {
            this.f130602a = nVar;
        }

        public final void run() {
            HashtagStruct hashtagInfo;
            String str;
            i iVar;
            InteractStickerStruct interactStickerStruct = this.f130602a.f130433f;
            if (interactStickerStruct != null && (hashtagInfo = interactStickerStruct.getHashtagInfo()) != null) {
                SmartRoute withParam = SmartRouter.buildRoute(this.f130602a.f130436i, "//challenge/detail").withParam("id", hashtagInfo.getHashtagName());
                j jVar = this.f130602a.f130438k;
                if (jVar == null || (iVar = jVar.r) == null) {
                    str = null;
                } else {
                    str = iVar.f134901a;
                }
                withParam.withParam("extra_challenge_from", str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", true).open(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashtagStruct hashtagInfo;
        HashtagStruct hashtagInfo2;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        String str6;
        String str7;
        String str8;
        String str9;
        MentionStruct mentionInfo;
        i iVar5;
        i iVar6;
        i iVar7;
        i iVar8;
        String str10 = null;
        if (this.f130435h == 8) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "at_prop");
            j jVar = this.f130438k;
            if (jVar == null || (iVar8 = jVar.r) == null) {
                str6 = null;
            } else {
                str6 = iVar8.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_from", str6);
            j jVar2 = this.f130438k;
            if (jVar2 == null || (iVar7 = jVar2.r) == null) {
                str7 = null;
            } else {
                str7 = iVar7.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str7);
            j jVar3 = this.f130438k;
            if (jVar3 == null || (iVar6 = jVar3.r) == null) {
                str8 = null;
            } else {
                str8 = iVar6.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", str8);
            j jVar4 = this.f130438k;
            if (jVar4 == null || (iVar5 = jVar4.r) == null) {
                str9 = null;
            } else {
                str9 = iVar5.f134904d;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("log_pb", str9);
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (!(interactStickerStruct == null || (mentionInfo = interactStickerStruct.getMentionInfo()) == null)) {
                str10 = mentionInfo.getUserId();
            }
            r.a("at_prop_click", a6.a("to_user_id", str10).f66730a);
        } else if (this.f130435h == 9) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            j jVar5 = this.f130438k;
            if (jVar5 == null || (iVar4 = jVar5.r) == null) {
                str = null;
            } else {
                str = iVar4.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a7 = dVar.a("enter_from", str);
            j jVar6 = this.f130438k;
            if (jVar6 == null || (iVar3 = jVar6.r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("author_id", str2);
            j jVar7 = this.f130438k;
            if (jVar7 == null || (iVar2 = jVar7.r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a9 = a8.a("group_id", str3);
            j jVar8 = this.f130438k;
            if (jVar8 == null || (iVar = jVar8.r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f134904d;
            }
            com.ss.android.ugc.aweme.app.f.d a10 = a9.a("log_pb", str4);
            InteractStickerStruct interactStickerStruct2 = this.f130433f;
            if (interactStickerStruct2 == null || (hashtagInfo2 = interactStickerStruct2.getHashtagInfo()) == null) {
                str5 = null;
            } else {
                str5 = hashtagInfo2.getHashtagId();
            }
            com.ss.android.ugc.aweme.app.f.d a11 = a10.a("tag_id", str5);
            InteractStickerStruct interactStickerStruct3 = this.f130433f;
            if (!(interactStickerStruct3 == null || (hashtagInfo = interactStickerStruct3.getHashtagInfo()) == null)) {
                str10 = hashtagInfo.getHashtagName();
            }
            r.a("tag_prop_click", a11.a("tag_name", str10).f66730a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashtagStruct hashtagInfo;
        HashtagStruct hashtagInfo2;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        MentionStruct mentionInfo;
        i iVar5;
        i iVar6;
        i iVar7;
        i iVar8;
        MentionStruct mentionInfo2;
        String str12;
        i iVar9;
        MentionStruct mentionInfo3;
        String str13 = null;
        if (this.f130435h == 8) {
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (interactStickerStruct == null || (mentionInfo3 = interactStickerStruct.getMentionInfo()) == null) {
                str6 = null;
            } else {
                str6 = mentionInfo3.getUserId();
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (l.a((Object) str6, (Object) g2.getCurUserId())) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                j jVar = this.f130438k;
                if (jVar == null || (iVar9 = jVar.r) == null) {
                    str12 = null;
                } else {
                    str12 = iVar9.f134901a;
                }
                r.a("self_mention_click", dVar.a("enter_from", str12).f66730a);
            }
            c().postDelayed(new a(this), 300);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "at_prop");
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            String curUserId = g3.getCurUserId();
            InteractStickerStruct interactStickerStruct2 = this.f130433f;
            if (interactStickerStruct2 == null || (mentionInfo2 = interactStickerStruct2.getMentionInfo()) == null) {
                str7 = null;
            } else {
                str7 = mentionInfo2.getUserId();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("self_click", l.a(curUserId, str7) ? 1 : 0);
            j jVar2 = this.f130438k;
            if (jVar2 == null || (iVar8 = jVar2.r) == null) {
                str8 = null;
            } else {
                str8 = iVar8.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("enter_from", str8);
            j jVar3 = this.f130438k;
            if (jVar3 == null || (iVar7 = jVar3.r) == null) {
                str9 = null;
            } else {
                str9 = iVar7.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str9);
            j jVar4 = this.f130438k;
            if (jVar4 == null || (iVar6 = jVar4.r) == null) {
                str10 = null;
            } else {
                str10 = iVar6.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("group_id", str10);
            j jVar5 = this.f130438k;
            if (jVar5 == null || (iVar5 = jVar5.r) == null) {
                str11 = null;
            } else {
                str11 = iVar5.f134904d;
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("log_pb", str11);
            InteractStickerStruct interactStickerStruct3 = this.f130433f;
            if (!(interactStickerStruct3 == null || (mentionInfo = interactStickerStruct3.getMentionInfo()) == null)) {
                str13 = mentionInfo.getUserId();
            }
            r.a("enter_personal_detail", a7.a("to_user_id", str13).f66730a);
        } else if (this.f130435h == 9) {
            c().postDelayed(new b(this), 300);
            com.ss.android.ugc.aweme.app.f.d a8 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "tag_prop");
            j jVar6 = this.f130438k;
            if (jVar6 == null || (iVar4 = jVar6.r) == null) {
                str = null;
            } else {
                str = iVar4.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a9 = a8.a("enter_from", str);
            j jVar7 = this.f130438k;
            if (jVar7 == null || (iVar3 = jVar7.r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a10 = a9.a("author_id", str2);
            j jVar8 = this.f130438k;
            if (jVar8 == null || (iVar2 = jVar8.r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a11 = a10.a("group_id", str3);
            j jVar9 = this.f130438k;
            if (jVar9 == null || (iVar = jVar9.r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f134904d;
            }
            com.ss.android.ugc.aweme.app.f.d a12 = a11.a("log_pb", str4);
            InteractStickerStruct interactStickerStruct4 = this.f130433f;
            if (interactStickerStruct4 == null || (hashtagInfo2 = interactStickerStruct4.getHashtagInfo()) == null) {
                str5 = null;
            } else {
                str5 = hashtagInfo2.getHashtagId();
            }
            com.ss.android.ugc.aweme.app.f.d a13 = a12.a("tag_id", str5);
            InteractStickerStruct interactStickerStruct5 = this.f130433f;
            if (!(interactStickerStruct5 == null || (hashtagInfo = interactStickerStruct5.getHashtagInfo()) == null)) {
                str13 = hashtagInfo.getHashtagName();
            }
            r.a("enter_tag_detail", a13.a("tag_name", str13).f66730a);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130603a;

        static {
            Covode.recordClassIndex(85631);
        }

        public c(n nVar) {
            this.f130603a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130603a.f();
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130604a;

        static {
            Covode.recordClassIndex(85632);
        }

        public d(n nVar) {
            this.f130604a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130604a.f();
        }
    }

    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f130607a;

        static {
            Covode.recordClassIndex(85638);
        }

        public g(n nVar) {
            this.f130607a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130607a.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130600l.a(jVar);
    }

    public static final class e extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ String $avatarUrl;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(n nVar, String str) {
            super(1);
            this.this$0 = nVar;
            this.$avatarUrl = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            String str;
            MentionStruct mentionInfo;
            final com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            l.d(dVar2, "");
            d.a aVar = new d.a();
            InteractStickerStruct interactStickerStruct = this.this$0.f130433f;
            if (interactStickerStruct == null || (mentionInfo = interactStickerStruct.getMentionInfo()) == null || (str = mentionInfo.getNickname()) == null) {
                str = "";
            }
            aVar.a(str);
            aVar.f45491c = new h.f.a.b<ImageView, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(85634);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(ImageView imageView) {
                    ImageView imageView2 = imageView;
                    l.d(imageView2, "");
                    v a2 = com.bytedance.lighten.a.r.a(this.this$0.$avatarUrl);
                    e.a aVar = new e.a();
                    aVar.f39827a = true;
                    a2.w = aVar.a();
                    a2.F = imageView2;
                    a2.c();
                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                    l.b(layoutParams, "");
                    layoutParams.height = (int) com.bytedance.common.utility.n.b(dVar2.f45488b, 24.0f);
                    layoutParams.width = (int) com.bytedance.common.utility.n.b(dVar2.f45488b, 24.0f);
                    imageView2.setLayoutParams(layoutParams);
                    return z.f158842a;
                }
            };
            aVar.f45494f = new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f130605a;

                static {
                    Covode.recordClassIndex(85635);
                }

                {
                    this.f130605a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f130605a.this$0.f();
                }
            };
            dVar2.a(aVar);
            return z.f158842a;
        }
    }

    public static final class f extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            l.d(dVar2, "");
            d.a aVar = new d.a();
            String string = dVar2.f45488b.getResources().getString(R.string.cay);
            l.b(string, "");
            aVar.a(string);
            aVar.f45494f = new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f130606a;

                static {
                    Covode.recordClassIndex(85637);
                }

                {
                    this.f130606a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f130606a.this$0.f();
                }
            };
            dVar2.a(aVar);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130600l.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130599a = h.i.a((h.f.a.a) new h(context));
        this.f130600l = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d(context, this, interactStickerStruct, jVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130600l.a(j2, i2, f2, f3, bVar);
    }
}
