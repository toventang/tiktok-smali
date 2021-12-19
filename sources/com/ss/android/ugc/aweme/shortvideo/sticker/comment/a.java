package com.ss.android.ugc.aweme.shortvideo.sticker.comment;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.CommentStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.music.e.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a {

    /* renamed from: a  reason: collision with root package name */
    private View f130238a;

    /* renamed from: l  reason: collision with root package name */
    private final b f130239l;

    /* renamed from: m  reason: collision with root package name */
    private final g f130240m;

    static {
        Covode.recordClassIndex(85433);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130239l.a(j2, i2, f2, f3, bVar);
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        VideoReplyStruct videoReplyStruct;
        j jVar = this.f130438k;
        if (jVar == null || (videoReplyStruct = jVar.s) == null || videoReplyStruct.getAwemeId() == 0) {
            return "";
        }
        return String.valueOf(videoReplyStruct.getAwemeId());
    }

    public final boolean c() {
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = o();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107229h) {
            return false;
        }
        a(R.string.de8, 0);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        MethodCollector.i(4939);
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130436i)) {
            if (this.f130238a == null) {
                this.f130238a = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d(this.f130436i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f130238a;
                if (view == null) {
                    l.b();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f130238a;
                if (view2 != null) {
                    ((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d) view2).setPoints(this.f130239l.f130253a);
                    View view3 = this.f130238a;
                    if (view3 == null) {
                        l.b();
                    }
                    view3.postInvalidate();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                    MethodCollector.o(4939);
                    throw nullPointerException;
                }
            }
            View view4 = this.f130238a;
            MethodCollector.o(4939);
            return view4;
        }
        if (this.f130238a == null) {
            this.f130238a = new FrameLayout(this.f130436i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view5 = this.f130238a;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        View view6 = this.f130238a;
        MethodCollector.o(4939);
        return view6;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(5052);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.f159928l));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f130436i.getString(R.string.amj));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(5052);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Long l2;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        VideoReplyStruct videoReplyStruct3 = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.f130438k;
        if (jVar4 == null || (iVar = jVar4.r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str4);
        j jVar5 = this.f130438k;
        String str8 = "";
        if (jVar5 == null || (videoReplyStruct2 = jVar5.s) == null || videoReplyStruct2.getCommentId() != 0) {
            j jVar6 = this.f130438k;
            if (jVar6 == null || (videoReplyStruct = jVar6.s) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(videoReplyStruct.getCommentId());
            }
            str5 = String.valueOf(l2);
        } else {
            str5 = str8;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("reply_comment_id", str5);
        j jVar7 = this.f130438k;
        if (!(jVar7 == null || (str7 = jVar7.t) == null)) {
            str8 = str7;
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("reply_user_id", str8).a("sticker_type", "comment_reply");
        if (com.ss.android.ugc.aweme.shortvideo.sticker.comment.a.a.f130243b) {
            j jVar8 = this.f130438k;
            if (jVar8 != null) {
                videoReplyStruct3 = jVar8.s;
            }
            if (a(videoReplyStruct3)) {
                str6 = "both";
                r.a("sticker_click", a7.a("options_show", str6).f66730a);
            }
        }
        str6 = "see_comment";
        r.a("sticker_click", a7.a("options_show", str6).f66730a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r8 == null) goto L_0x00ca;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a.f():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3394a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130241a;

        static {
            Covode.recordClassIndex(85434);
        }

        View$OnClickListenerC3394a(a aVar) {
            this.f130241a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130241a.n();
            this.f130241a.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130239l.a(jVar);
    }

    static void a(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        try {
            com.bytedance.apm.b.a("stcker_awemeid_issue_error_rate", i2, (JSONObject) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static boolean a(VideoReplyStruct videoReplyStruct) {
        if (videoReplyStruct == null || videoReplyStruct.getUserAvatar() == null || !e.b(videoReplyStruct.getUserAvatar()) || !hl.a(videoReplyStruct.getUserName()) || videoReplyStruct.getCommentUserId() == 0 || videoReplyStruct.getCommentId() == 0 || videoReplyStruct.getAwemeId() == 0) {
            return false;
        }
        return true;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130246a;

        static {
            Covode.recordClassIndex(85435);
        }

        b(a aVar) {
            this.f130246a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$b$a  reason: collision with other inner class name */
        static final class C3395a<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VideoReplyStruct f130247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f130248b;

            static {
                Covode.recordClassIndex(85436);
            }

            C3395a(VideoReplyStruct videoReplyStruct, b bVar) {
                this.f130247a = videoReplyStruct;
                this.f130248b = bVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                int i2;
                l.d(iVar, "");
                if (!iVar.c() && !iVar.b()) {
                    this.f130247a.setCollectStat(0);
                    ICommentFavoriteService a2 = CommentFavoriteServiceImpl.a();
                    String valueOf = String.valueOf(this.f130247a.getCommentId());
                    Integer collectStat = this.f130247a.getCollectStat();
                    if (collectStat != null) {
                        i2 = collectStat.intValue();
                    } else {
                        i2 = -1;
                    }
                    a2.a(valueOf, i2);
                    this.f130248b.f130246a.a(R.string.bsj, 0);
                }
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            VideoReplyStruct videoReplyStruct;
            b.i<BaseResponse> collectComment;
            VideoReplyStruct videoReplyStruct2;
            String valueOf;
            VideoReplyStruct videoReplyStruct3;
            VideoReplyStruct videoReplyStruct4;
            i iVar;
            ClickAgent.onClick(view);
            this.f130246a.n();
            if (!this.f130246a.c()) {
                this.f130246a.a(0);
                j jVar = this.f130246a.f130438k;
                String str4 = "";
                if (jVar == null || (iVar = jVar.r) == null || (str = iVar.f134901a) == null) {
                    str = str4;
                }
                j jVar2 = this.f130246a.f130438k;
                if (jVar2 == null || (videoReplyStruct4 = jVar2.s) == null || (str2 = String.valueOf(videoReplyStruct4.getCommentId())) == null) {
                    str2 = str4;
                }
                j jVar3 = this.f130246a.f130438k;
                if (jVar3 == null || (videoReplyStruct3 = jVar3.s) == null || (str3 = String.valueOf(videoReplyStruct3.getCommentUserId())) == null) {
                    str3 = str4;
                }
                j jVar4 = this.f130246a.f130438k;
                if (!(jVar4 == null || (videoReplyStruct2 = jVar4.s) == null || (valueOf = String.valueOf(videoReplyStruct2.getAwemeId())) == null)) {
                    str4 = valueOf;
                }
                com.ss.android.ugc.aweme.comment.m.c.a(str, "sticker", 0, str2, str3, str4);
                j jVar5 = this.f130246a.f130438k;
                if (jVar5 != null && (videoReplyStruct = jVar5.s) != null && (collectComment = UserFavoritesApi.f90439a.collectComment(String.valueOf(videoReplyStruct.getCommentId()), 0)) != null) {
                    collectComment.a(new C3395a(videoReplyStruct, this), b.i.f4826c, null);
                }
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130249a;

        static {
            Covode.recordClassIndex(85437);
        }

        c(a aVar) {
            this.f130249a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$c$a  reason: collision with other inner class name */
        static final class C3396a<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VideoReplyStruct f130250a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f130251b;

            static {
                Covode.recordClassIndex(85438);
            }

            C3396a(VideoReplyStruct videoReplyStruct, c cVar) {
                this.f130250a = videoReplyStruct;
                this.f130251b = cVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                int i2;
                l.d(iVar, "");
                if (!iVar.c() && !iVar.b()) {
                    this.f130250a.setCollectStat(1);
                    ICommentFavoriteService a2 = CommentFavoriteServiceImpl.a();
                    String valueOf = String.valueOf(this.f130250a.getCommentId());
                    Integer collectStat = this.f130250a.getCollectStat();
                    if (collectStat != null) {
                        i2 = collectStat.intValue();
                    } else {
                        i2 = -1;
                    }
                    a2.a(valueOf, i2);
                    this.f130251b.f130249a.a(R.string.bsh, 2131231219);
                }
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            VideoReplyStruct videoReplyStruct;
            b.i<BaseResponse> collectComment;
            VideoReplyStruct videoReplyStruct2;
            String valueOf;
            VideoReplyStruct videoReplyStruct3;
            VideoReplyStruct videoReplyStruct4;
            i iVar;
            ClickAgent.onClick(view);
            this.f130249a.n();
            if (!this.f130249a.c()) {
                this.f130249a.a(1);
                j jVar = this.f130249a.f130438k;
                String str4 = "";
                if (jVar == null || (iVar = jVar.r) == null || (str = iVar.f134901a) == null) {
                    str = str4;
                }
                j jVar2 = this.f130249a.f130438k;
                if (jVar2 == null || (videoReplyStruct4 = jVar2.s) == null || (str2 = String.valueOf(videoReplyStruct4.getCommentId())) == null) {
                    str2 = str4;
                }
                j jVar3 = this.f130249a.f130438k;
                if (jVar3 == null || (videoReplyStruct3 = jVar3.s) == null || (str3 = String.valueOf(videoReplyStruct3.getCommentUserId())) == null) {
                    str3 = str4;
                }
                j jVar4 = this.f130249a.f130438k;
                if (!(jVar4 == null || (videoReplyStruct2 = jVar4.s) == null || (valueOf = String.valueOf(videoReplyStruct2.getAwemeId())) == null)) {
                    str4 = valueOf;
                }
                com.ss.android.ugc.aweme.comment.m.c.a(str, "sticker", 1, str2, str3, str4);
                j jVar5 = this.f130249a.f130438k;
                if (jVar5 != null && (videoReplyStruct = jVar5.s) != null && (collectComment = UserFavoritesApi.f90439a.collectComment(String.valueOf(videoReplyStruct.getCommentId()), 1)) != null) {
                    collectComment.a(new C3396a(videoReplyStruct, this), b.i.f4826c, null);
                }
            }
        }
    }

    public final void a(int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        Long l2 = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.f130438k;
        if (jVar4 == null || (iVar = jVar4.r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str4).a("to_group_id", g());
        j jVar5 = this.f130438k;
        String str8 = "";
        if (jVar5 == null || (videoReplyStruct2 = jVar5.s) == null || videoReplyStruct2.getCommentId() != 0) {
            j jVar6 = this.f130438k;
            if (!(jVar6 == null || (videoReplyStruct = jVar6.s) == null)) {
                l2 = Long.valueOf(videoReplyStruct.getCommentId());
            }
            str5 = String.valueOf(l2);
        } else {
            str5 = str8;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("reply_comment_id", str5);
        j jVar7 = this.f130438k;
        if (!(jVar7 == null || (str7 = jVar7.t) == null)) {
            str8 = str7;
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("reply_user_id", str8);
        if (i2 == 1) {
            str6 = "add_to_favorites";
        } else {
            str6 = "remove_from_favorites";
        }
        r.a("sticker_toast_click", a7.a("target", str6).a("sticker_type", "comment_reply").f66730a);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130252a;

        static {
            Covode.recordClassIndex(85439);
        }

        d(a aVar) {
            this.f130252a = aVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            VideoReplyStruct videoReplyStruct;
            String str6;
            i iVar;
            User user;
            String str7;
            Long l2;
            VideoReplyStruct videoReplyStruct2;
            VideoReplyStruct videoReplyStruct3;
            i iVar2;
            i iVar3;
            i iVar4;
            i iVar5;
            ClickAgent.onClick(view);
            this.f130252a.n();
            a aVar = this.f130252a;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            j jVar = aVar.f130438k;
            String str8 = null;
            if (jVar == null || (iVar5 = jVar.r) == null) {
                str = null;
            } else {
                str = iVar5.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
            j jVar2 = aVar.f130438k;
            if (jVar2 == null || (iVar4 = jVar2.r) == null) {
                str2 = null;
            } else {
                str2 = iVar4.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
            j jVar3 = aVar.f130438k;
            if (jVar3 == null || (iVar3 = jVar3.r) == null) {
                str3 = null;
            } else {
                str3 = iVar3.f134904d;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
            j jVar4 = aVar.f130438k;
            if (jVar4 == null || (iVar2 = jVar4.r) == null) {
                str4 = null;
            } else {
                str4 = iVar2.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str4).a("to_group_id", aVar.g());
            j jVar5 = aVar.f130438k;
            String str9 = "";
            if (jVar5 == null || (videoReplyStruct3 = jVar5.s) == null || videoReplyStruct3.getCommentId() != 0) {
                j jVar6 = aVar.f130438k;
                if (jVar6 == null || (videoReplyStruct2 = jVar6.s) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(videoReplyStruct2.getCommentId());
                }
                str5 = String.valueOf(l2);
            } else {
                str5 = str9;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("reply_comment_id", str5);
            j jVar7 = aVar.f130438k;
            if (!(jVar7 == null || (str7 = jVar7.t) == null)) {
                str9 = str7;
            }
            r.a("sticker_toast_click", a6.a("reply_user_id", str9).a("target", "reply_with_video").a("sticker_type", "comment_reply").f66730a);
            j jVar8 = aVar.f130438k;
            if (!(jVar8 == null || (videoReplyStruct = jVar8.s) == null)) {
                if (a.a(videoReplyStruct)) {
                    ICommentStickerRecordService a7 = CommentStickerRecordServiceImpl.a();
                    Context context = aVar.f130436i;
                    String valueOf = String.valueOf(videoReplyStruct.getCommentUserId());
                    String userName = videoReplyStruct.getUserName();
                    UrlModel userAvatar = videoReplyStruct.getUserAvatar();
                    String commentMsg = videoReplyStruct.getCommentMsg();
                    String valueOf2 = String.valueOf(videoReplyStruct.getCommentId());
                    String valueOf3 = String.valueOf(videoReplyStruct.getAwemeId());
                    j jVar9 = aVar.f130438k;
                    if (jVar9 == null || (user = jVar9.f134922c) == null) {
                        str6 = null;
                    } else {
                        str6 = user.getUid();
                    }
                    String valueOf4 = String.valueOf(videoReplyStruct.getCommentId());
                    int i2 = aVar.f130435h;
                    CommentVideoModel.Type type = CommentVideoModel.Type.COMMENT;
                    j jVar10 = aVar.f130438k;
                    if (!(jVar10 == null || (iVar = jVar10.r) == null)) {
                        str8 = iVar.f134901a;
                    }
                    a7.a(context, new CommentVideoModel(valueOf, userName, userAvatar, commentMsg, valueOf2, valueOf3, str6, valueOf4, "", i2, "comment_press", 0, 0, type, "comment_reply", str8));
                }
                if (!TextUtils.isEmpty(String.valueOf(videoReplyStruct.getAwemeId())) && !TextUtils.isEmpty(String.valueOf(videoReplyStruct.getCommentId()))) {
                    z = true;
                    a.a(z);
                }
            }
            z = false;
            a.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final int a(com.bytedance.tux.tooltip.a.a.d dVar) {
        Integer num;
        Long l2;
        int i2;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        l.d(dVar, "");
        j jVar = this.f130438k;
        VideoReplyStruct videoReplyStruct3 = null;
        if (jVar == null || jVar.s == null) {
            return 0;
        }
        d.b bVar = new d.b();
        String string = dVar.f45488b.getString(R.string.amh);
        l.b(string, "");
        bVar.a(string);
        bVar.f45495a = 2131232510;
        bVar.f45500f = new View$OnClickListenerC3394a(this);
        dVar.a(bVar);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (videoReplyStruct2 = jVar2.s) == null) {
            num = null;
        } else {
            num = videoReplyStruct2.getCollectStat();
        }
        int i3 = 1;
        if (com.ss.android.ugc.aweme.comment.d.a.a() && num != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                d.b bVar2 = new d.b();
                j jVar3 = this.f130438k;
                if (jVar3 == null || (videoReplyStruct = jVar3.s) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(videoReplyStruct.getCommentId());
                }
                if (l2 != null) {
                    i2 = CommentFavoriteServiceImpl.a().a(String.valueOf(l2.longValue()));
                } else {
                    i2 = -1;
                }
                if ((num.intValue() == 1 && i2 == -1) || i2 == 1) {
                    String string2 = dVar.f45488b.getString(R.string.bsi);
                    l.b(string2, "");
                    bVar2.a(string2);
                    bVar2.f45495a = 2131231217;
                    bVar2.f45500f = new b(this);
                } else if ((num.intValue() == 0 && i2 == -1) || i2 == 0) {
                    if (com.ss.android.ugc.aweme.comment.d.a.b()) {
                        String string3 = dVar.f45488b.getString(R.string.bsf);
                        l.b(string3, "");
                        bVar2.a(string3);
                    } else {
                        String string4 = dVar.f45488b.getString(R.string.bsg);
                        l.b(string4, "");
                        bVar2.a(string4);
                    }
                    bVar2.f45495a = 2131231216;
                    bVar2.f45500f = new c(this);
                }
                dVar.a(bVar2);
                i3 = 2;
            }
        }
        j jVar4 = this.f130438k;
        if (jVar4 != null) {
            videoReplyStruct3 = jVar4.s;
        }
        if (!a(videoReplyStruct3)) {
            return i3;
        }
        d.b bVar3 = new d.b();
        String string5 = dVar.f45488b.getString(R.string.ami);
        l.b(string5, "");
        bVar3.a(string5);
        bVar3.f45495a = 2131232506;
        bVar3.f45500f = new d(this);
        dVar.a(bVar3);
        return i3 + 1;
    }

    public final void a(int i2, int i3) {
        if (i3 != 0) {
            new com.bytedance.tux.g.b(this.f130437j).a(this.f130436i.getString(i2)).b(i3).b();
        } else {
            new com.bytedance.tux.g.b(this.f130437j).a(this.f130436i.getString(i2)).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130239l.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, g gVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130240m = gVar;
        this.f130239l = new b(context, this, interactStickerStruct, jVar, gVar);
    }
}
