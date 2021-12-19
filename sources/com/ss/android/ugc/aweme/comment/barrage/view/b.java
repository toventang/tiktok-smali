package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.o.c;
import com.ss.android.ugc.aweme.story.b.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedHashSet;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71724b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.i.b f71725a;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.comment.barrage.c.a f71726c;

    /* renamed from: d  reason: collision with root package name */
    private final AwemeCommentBubbleList f71727d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f71728e;

    /* renamed from: f  reason: collision with root package name */
    private View f71729f;

    /* renamed from: g  reason: collision with root package name */
    private Aweme f71730g;

    static {
        Covode.recordClassIndex(44115);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44116);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void b() {
        com.ss.android.ugc.aweme.comment.barrage.c.a aVar = this.f71726c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void d() {
        this.f71727d.s();
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void e() {
        this.f71727d.r();
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void c() {
        com.ss.android.ugc.aweme.comment.barrage.c.a aVar = this.f71726c;
        if (aVar != null) {
            aVar.b();
        }
        this.f71726c = null;
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void a() {
        String str;
        com.ss.android.ugc.aweme.comment.barrage.c.a aVar = this.f71726c;
        if (aVar != null) {
            aVar.b();
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        g2.getCurUser();
        Aweme aweme = this.f71730g;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f71726c = new com.ss.android.ugc.aweme.comment.barrage.c.c(str, this.f71725a, this.f71727d);
        AwemeCommentBubbleList awemeCommentBubbleList = this.f71727d;
        awemeCommentBubbleList.R = true;
        awemeCommentBubbleList.S = awemeCommentBubbleList.getFirstDataPositionInState();
        ViewGroup.LayoutParams layoutParams = awemeCommentBubbleList.P.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 192.0f, system.getDisplayMetrics()));
        awemeCommentBubbleList.P.setLayoutParams(layoutParams);
        this.f71727d.setBubbleListManager(this.f71726c);
    }

    public b(com.ss.android.ugc.aweme.comment.i.b bVar) {
        l.d(bVar, "");
        this.f71725a = bVar;
        Context context = bVar.a().getContext();
        l.b(context, "");
        this.f71728e = context;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.jk, bVar.a(), true);
        l.b(a2, "");
        this.f71729f = a2;
        AwemeCommentBubbleList awemeCommentBubbleList = (AwemeCommentBubbleList) a2.findViewById(R.id.a9x);
        l.b(awemeCommentBubbleList, "");
        this.f71727d = awemeCommentBubbleList;
    }

    @Override // com.ss.android.ugc.aweme.o.c
    public final void a(Aweme aweme) {
        String str;
        l.d(aweme, "");
        this.f71725a.a().setVisibility(0);
        this.f71727d.setVisibility(0);
        if (!TextUtils.isEmpty(aweme.getAid())) {
            aweme.getAid();
            com.ss.android.ugc.aweme.comment.barrage.c.a aVar = this.f71726c;
            if (aVar != null) {
                aVar.b();
            }
            AwemeCommentBubbleList awemeCommentBubbleList = this.f71727d;
            String str2 = this.f71725a.f71981c;
            String groupId = aweme.getGroupId();
            int a2 = h.a(aweme.getAuthor());
            if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            awemeCommentBubbleList.setMMobEventParam(new com.ss.android.ugc.aweme.comment.barrage.a(aweme, str2, groupId, a2, str, this.f71725a.f71982d, new LinkedHashSet()));
            com.ss.android.ugc.aweme.comment.barrage.c.a aVar2 = this.f71726c;
            if (aVar2 != null) {
                aVar2.a(aweme);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.comment.barrage.c.a aVar3 = this.f71726c;
        if (aVar3 != null) {
            aVar3.b();
        }
    }
}
