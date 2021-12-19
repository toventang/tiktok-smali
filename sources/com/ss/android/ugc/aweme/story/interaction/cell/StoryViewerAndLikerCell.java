package com.ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.story.interaction.b.h;
import com.ss.android.ugc.aweme.story.interaction.b.j;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Iterator;
import java.util.List;

public final class StoryViewerAndLikerCell extends PowerCell<h> {

    /* renamed from: a  reason: collision with root package name */
    public NewFollowButton f137928a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f137929b = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    private SmartImageView f137930j;

    /* renamed from: k  reason: collision with root package name */
    private TuxIconView f137931k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextView f137932l;

    /* renamed from: m  reason: collision with root package name */
    private TuxTextView f137933m;
    private TuxTextView n;
    private ImageView o;

    static {
        Covode.recordClassIndex(90214);
    }

    private final com.ss.android.ugc.aweme.follow.widet.a a() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f137929b.getValue();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ StoryViewerAndLikerCell this$0;

        static {
            Covode.recordClassIndex(90215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryViewerAndLikerCell storyViewerAndLikerCell) {
            super(0);
            this.this$0 = storyViewerAndLikerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            return new com.ss.android.ugc.aweme.follow.widet.a(StoryViewerAndLikerCell.a(this.this$0), new a.g(this) {
                /* class com.ss.android.ugc.aweme.story.interaction.cell.StoryViewerAndLikerCell.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f137934a;

                static {
                    Covode.recordClassIndex(90216);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f137934a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
                public final void a(int i2, User user) {
                    j jVar;
                    h hVar = (h) this.f137934a.this$0.f34234d;
                    String str = null;
                    if (hVar != null && (jVar = hVar.f137862c) != null) {
                        v vVar = new v();
                        String str2 = jVar.f137864b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        v a2 = vVar.a(str2);
                        a2.s = jVar.f137865c;
                        if (user != null) {
                            str = user.getUid();
                        }
                        a2.f109608e = str;
                        a2.p = jVar.f137866d;
                        a2.V = jVar.f137867e;
                        a2.W = jVar.f137868f;
                        a2.b_(jVar.f137869g).f();
                    }
                }
            });
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerAndLikerCell f137935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f137936b;

        static {
            Covode.recordClassIndex(90217);
        }

        b(StoryViewerAndLikerCell storyViewerAndLikerCell, User user) {
            this.f137935a = storyViewerAndLikerCell;
            this.f137936b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137935a.a(this.f137936b);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerAndLikerCell f137937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f137938b;

        static {
            Covode.recordClassIndex(90218);
        }

        c(StoryViewerAndLikerCell storyViewerAndLikerCell, User user) {
            this.f137937a = storyViewerAndLikerCell;
            this.f137938b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137937a.a(this.f137938b);
        }
    }

    public static final class e implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerAndLikerCell f137941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f137942b;

        static {
            Covode.recordClassIndex(90220);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                StoryViewerAndLikerCell.a(this.f137941a).a(followStatus.followStatus, followStatus.followerStatus);
            }
        }

        e(StoryViewerAndLikerCell storyViewerAndLikerCell, h hVar) {
            this.f137941a = storyViewerAndLikerCell;
            this.f137942b = hVar;
        }
    }

    public static final /* synthetic */ NewFollowButton a(StoryViewerAndLikerCell storyViewerAndLikerCell) {
        NewFollowButton newFollowButton = storyViewerAndLikerCell.f137928a;
        if (newFollowButton == null) {
            l.a("followBtn");
        }
        return newFollowButton;
    }

    static final class f implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f137943a;

        static {
            Covode.recordClassIndex(90221);
        }

        f(h hVar) {
            this.f137943a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            l.b(followStatus, "");
            String str = null;
            if (followStatus.followStatus == 0) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                j jVar = this.f137943a.f137862c;
                if (jVar != null) {
                    str = jVar.f137864b;
                }
                r.a("follow_cancel_finish", dVar.a("enter_from", str).a("to_user_id", followStatus.userId).f66730a);
                return;
            }
            com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
            j jVar2 = this.f137943a.f137862c;
            if (jVar2 != null) {
                str = jVar2.f137864b;
            }
            r.a("follow_finish", dVar2.a("enter_from", str).a("to_user_id", followStatus.userId).f66730a);
        }
    }

    public final void a(User user) {
        j jVar;
        h hVar = (h) this.f34234d;
        if (hVar != null) {
            jVar = hVar.f137862c;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            q f2 = new q().g(jVar.f137863a);
            String str = jVar.f137864b;
            if (str == null) {
                str = "";
            }
            q qVar = (q) f2.o(str).a("click_head");
            qVar.Y = "story_detail";
            qVar.Z = jVar.f137865c;
            qVar.f109594e = jVar.f137866d;
            qVar.V = jVar.f137867e;
            qVar.W = jVar.f137868f;
            qVar.b_(jVar.f137869g).f();
        }
        View view = this.itemView;
        l.b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }

    static final class d implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerAndLikerCell f137939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f137940b;

        static {
            Covode.recordClassIndex(90219);
        }

        d(StoryViewerAndLikerCell storyViewerAndLikerCell, h hVar) {
            this.f137939a = storyViewerAndLikerCell;
            this.f137940b = hVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            j jVar;
            String str;
            String str2;
            String str3;
            int i3;
            String str4;
            if (i2 != 2) {
                return false;
            }
            StoryViewerAndLikerCell storyViewerAndLikerCell = this.f137939a;
            User user = this.f137940b.f137860a.getUser();
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                l.b(createIIMServicebyMonsterPlugin, "");
                IIMAdapterService d2 = IMAdapterServiceImpl.d();
                if (!(d2 == null || !d2.a() || createIIMServicebyMonsterPlugin == null)) {
                    h hVar = (h) storyViewerAndLikerCell.f34234d;
                    String str5 = null;
                    if (hVar != null) {
                        jVar = hVar.f137862c;
                        if (jVar != null) {
                            u o = new u().a(jVar.f137864b).o(jVar.f137865c);
                            o.f109597b = u.a.ENTER_CHAT;
                            u r = o.r(jVar.f137866d);
                            r.V = jVar.f137867e;
                            r.W = jVar.f137868f;
                            ((u) r.b_(jVar.f137869g)).a(user).f();
                        }
                    } else {
                        jVar = null;
                    }
                    IIMService createIIMServicebyMonsterPlugin2 = IMService.createIIMServicebyMonsterPlugin(false);
                    View view = storyViewerAndLikerCell.itemView;
                    l.b(view, "");
                    a.C2643a a2 = a.b.a(view.getContext(), IMUser.fromUser(user));
                    if (jVar != null) {
                        str = jVar.f137864b;
                    } else {
                        str = null;
                    }
                    a.C2643a c2 = a2.c(str);
                    if (jVar != null) {
                        str2 = jVar.f137865c;
                    } else {
                        str2 = null;
                    }
                    a.C2643a b2 = c2.b(str2);
                    if (jVar != null) {
                        str3 = jVar.f137866d;
                    } else {
                        str3 = null;
                    }
                    a.C2643a e2 = b2.e(str3);
                    if (jVar != null) {
                        i3 = jVar.f137867e;
                    } else {
                        i3 = -1;
                    }
                    a.C2643a d3 = e2.d(i3);
                    if (jVar != null) {
                        str4 = jVar.f137868f;
                    } else {
                        str4 = null;
                    }
                    a.C2643a f2 = d3.f(str4);
                    if (jVar != null) {
                        str5 = jVar.f137869g;
                    }
                    f2.f103883a.setStoryCollectionId(str5);
                    createIIMServicebyMonsterPlugin2.startChat(f2.f103883a);
                }
            } else {
                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            }
            return true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b39, viewGroup, false);
        l.b(a2, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) a2.findViewById(R.id.ov);
        l.b(smartAvatarImageView, "");
        this.f137930j = smartAvatarImageView;
        TuxIconView tuxIconView = (TuxIconView) a2.findViewById(R.id.ou);
        l.b(tuxIconView, "");
        this.f137931k = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.fct);
        l.b(tuxTextView, "");
        this.f137932l = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.dkd);
        l.b(tuxTextView2, "");
        this.f137933m = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) a2.findViewById(R.id.ak_);
        l.b(tuxTextView3, "");
        this.n = tuxTextView3;
        TuxIconView tuxIconView2 = (TuxIconView) a2.findViewById(R.id.fk7);
        l.b(tuxIconView2, "");
        this.o = tuxIconView2;
        NewFollowButton newFollowButton = (NewFollowButton) a2.findViewById(R.id.b7b);
        l.b(newFollowButton, "");
        this.f137928a = newFollowButton;
        if (newFollowButton == null) {
            l.a("followBtn");
        }
        newFollowButton.setShouldShowMessageText(true);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        User user = hVar2.f137860a.getUser();
        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb())).a("ReactionBubbleCommentCell");
        SmartImageView smartImageView = this.f137930j;
        if (smartImageView == null) {
            l.a("avatarIv");
        }
        a2.E = smartImageView;
        e.a aVar = new e.a();
        boolean z = true;
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a3 = aVar.a();
        l.b(a3, "");
        a2.w = a3;
        a2.f39907c = true;
        a2.c();
        SmartImageView smartImageView2 = this.f137930j;
        if (smartImageView2 == null) {
            l.a("avatarIv");
        }
        smartImageView2.setOnClickListener(new b(this, user));
        this.itemView.setOnClickListener(new c(this, user));
        int i2 = hVar2.f137861b;
        if (i2 == 1) {
            TuxIconView tuxIconView = this.f137931k;
            if (tuxIconView == null) {
                l.a("avatarIconIv");
            }
            tuxIconView.setVisibility(4);
            List<com.ss.android.ugc.aweme.story.model.a> emojiList = hVar2.f137860a.getEmojiList();
            if (emojiList != null && !emojiList.isEmpty()) {
                z = false;
            }
            if (z) {
                ImageView imageView = this.o;
                if (imageView == null) {
                    l.a("viewerIv");
                }
                imageView.setVisibility(0);
                TuxTextView tuxTextView = this.n;
                if (tuxTextView == null) {
                    l.a("descTv");
                }
                tuxTextView.setVisibility(4);
            } else {
                ImageView imageView2 = this.o;
                if (imageView2 == null) {
                    l.a("viewerIv");
                }
                imageView2.setVisibility(4);
                TuxTextView tuxTextView2 = this.n;
                if (tuxTextView2 == null) {
                    l.a("descTv");
                }
                tuxTextView2.setVisibility(0);
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = emojiList.iterator();
                while (it.hasNext()) {
                    sb.append(StoryEmojiReactionView.a.a(it.next().getEmojiId()));
                }
                TuxTextView tuxTextView3 = this.n;
                if (tuxTextView3 == null) {
                    l.a("descTv");
                }
                tuxTextView3.setTextColor(-16777216);
                TuxTextView tuxTextView4 = this.n;
                if (tuxTextView4 == null) {
                    l.a("descTv");
                }
                a.C0730a aVar2 = new a.C0730a();
                String sb2 = sb.toString();
                l.b(sb2, "");
                tuxTextView4.setText(aVar2.a(sb2).f33382a);
            }
        } else if (i2 == 2) {
            TuxIconView tuxIconView2 = this.f137931k;
            if (tuxIconView2 == null) {
                l.a("avatarIconIv");
            }
            tuxIconView2.setVisibility(0);
            TuxIconView tuxIconView3 = this.f137931k;
            if (tuxIconView3 == null) {
                l.a("avatarIconIv");
            }
            tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
            TuxTextView tuxTextView5 = this.n;
            if (tuxTextView5 == null) {
                l.a("descTv");
            }
            tuxTextView5.setVisibility(0);
            TuxTextView tuxTextView6 = this.n;
            if (tuxTextView6 == null) {
                l.a("descTv");
            }
            a.C0730a aVar3 = new a.C0730a();
            String nickname = user.getNickname();
            l.b(nickname, "");
            tuxTextView6.setText(aVar3.a(nickname).f33382a);
        } else if (i2 == 3) {
            TuxIconView tuxIconView4 = this.f137931k;
            if (tuxIconView4 == null) {
                l.a("avatarIconIv");
            }
            tuxIconView4.setVisibility(0);
            TuxIconView tuxIconView5 = this.f137931k;
            if (tuxIconView5 == null) {
                l.a("avatarIconIv");
            }
            tuxIconView5.setIconRes(R.raw.icon_color_like_circle);
            TuxTextView tuxTextView7 = this.n;
            if (tuxTextView7 == null) {
                l.a("descTv");
            }
            tuxTextView7.setVisibility(0);
            TuxTextView tuxTextView8 = this.n;
            if (tuxTextView8 == null) {
                l.a("descTv");
            }
            a.C0730a aVar4 = new a.C0730a();
            String nickname2 = user.getNickname();
            l.b(nickname2, "");
            tuxTextView8.setText(aVar4.a(nickname2).f33382a);
        }
        TuxTextView tuxTextView9 = this.f137932l;
        if (tuxTextView9 == null) {
            l.a("userTv");
        }
        tuxTextView9.setText(user.getUniqueId());
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView10 = this.f137932l;
        if (tuxTextView10 == null) {
            l.a("userTv");
        }
        io.a(context, customVerify, enterpriseVerifyReason, tuxTextView10);
        if (user.getFollowStatus() == 2) {
            TuxTextView tuxTextView11 = this.f137933m;
            if (tuxTextView11 == null) {
                l.a("relationTv");
            }
            tuxTextView11.setVisibility(0);
        } else {
            TuxTextView tuxTextView12 = this.f137933m;
            if (tuxTextView12 == null) {
                l.a("relationTv");
            }
            tuxTextView12.setVisibility(8);
        }
        a().a(hVar2.f137860a.getUser());
        a().f96288e = new d(this, hVar2);
        a().f96287d = new e(this, hVar2);
        a().f96289f = new f(hVar2);
    }
}
