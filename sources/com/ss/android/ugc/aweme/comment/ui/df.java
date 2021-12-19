package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class df extends com.bytedance.ies.uikit.a.b implements com.ss.android.ugc.aweme.comment.e.a, com.ss.android.ugc.aweme.comment.services.b, org.greenrobot.eventbus.i, j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f72726k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.services.a f72727a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.b f72728b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.g.c f72729c;

    /* renamed from: d  reason: collision with root package name */
    public String f72730d = "";

    /* renamed from: e  reason: collision with root package name */
    public v<Aweme> f72731e;

    /* renamed from: j  reason: collision with root package name */
    public final StringBuffer f72732j = new StringBuffer();

    /* renamed from: l  reason: collision with root package name */
    private boolean f72733l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f72734m;
    private t<Aweme> n;
    private final f.a.b.a o = new f.a.b.a();
    private SparseArray p;

    static {
        Covode.recordClassIndex(44812);
    }

    public final View a(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void g(Comment comment) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(df.class, "onVideoEvent", ag.class, ThreadMode.MAIN, 0, false));
        hashMap.put(5, new org.greenrobot.eventbus.g(df.class, "onCommentEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Comment n() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void onEvent(com.ss.android.ugc.aweme.forward.a.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final int p() {
        return 1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44813);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Aweme m() {
        return l();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f35364f = false;
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f72744b;

        static {
            Covode.recordClassIndex(44821);
        }

        i(df dfVar, boolean z) {
            this.f72743a = dfVar;
            this.f72744b = z;
        }

        public final void run() {
            this.f72743a.a(!this.f72744b);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b
    public final boolean ab_() {
        if (!super.ab_() || getContext() == null) {
            return false;
        }
        return true;
    }

    public final Aweme l() {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final String o() {
        String i2;
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (aVar == null || (i2 = aVar.i()) == null) {
            return "";
        }
        return i2;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        cg.b(this);
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b();
        b(9);
    }

    private final bj t() {
        androidx.fragment.app.i k2;
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        Fragment fragment = null;
        if (!(aVar == null || (k2 = aVar.k()) == null)) {
            fragment = k2.a("comment_page");
        }
        return (bj) fragment;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void d() {
        this.f72733l = true;
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
            linearLayout.setEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void e() {
        this.f72733l = false;
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void i() {
        androidx.fragment.app.i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            l.b(fragmentManager, "");
            Fragment a2 = fragmentManager.a("story_comment_input_tag");
            if (a2 != null) {
                fragmentManager.a().a(a2).c();
            }
        }
    }

    public final String r() {
        Aweme h2;
        String aid;
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (aVar == null || (h2 = aVar.h()) == null || (aid = h2.getAid()) == null) {
            return "";
        }
        return aid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 < 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s() {
        /*
            r6 = this;
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.l()
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.CommentServiceImpl.e()
            boolean r0 = r0.c(r1)
            r3 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.ss.android.ugc.aweme.login.b.a.a(r1)
            if (r0 == 0) goto L_0x001f
        L_0x0018:
            r1 = 0
        L_0x001a:
            r3 = r1
        L_0x001b:
            r2 = 2131369405(0x7f0a1dbd, float:1.8358787E38)
            goto L_0x0030
        L_0x001f:
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r1.getStatistics()
            if (r0 == 0) goto L_0x0018
            long r1 = r0.getCommentCount()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            goto L_0x001b
        L_0x0030:
            java.lang.String r1 = com.ss.android.ugc.aweme.i18n.b.a(r3)     // Catch:{ Exception -> 0x0044 }
            h.f.b.l.b(r1, r5)     // Catch:{ Exception -> 0x0044 }
            android.view.View r0 = r6.a(r2)     // Catch:{ Exception -> 0x0044 }
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0     // Catch:{ Exception -> 0x0044 }
            h.f.b.l.b(r0, r5)     // Catch:{ Exception -> 0x0044 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0044 }
            return
        L_0x0044:
            r0 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a(r0)
            android.view.View r1 = r6.a(r2)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            h.f.b.l.b(r1, r5)
            java.lang.String r0 = "0"
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.df.s():void");
    }

    private final boolean u() {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (!(aVar == null || aVar.h() == null)) {
            com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72727a;
            if (aVar2 == null) {
                l.b();
            }
            Aweme h2 = aVar2.h();
            if (!(h2 == null || h2.getStatus() == null)) {
                AwemeStatus status = h2.getStatus();
                l.b(status, "");
                if (status.getPrivateStatus() == 1 && h2.getAuthor() != null) {
                    User author = h2.getAuthor();
                    l.b(author, "");
                    String uid = author.getUid();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    User curUser = g2.getCurUser();
                    l.b(curUser, "");
                    if (TextUtils.equals(uid, curUser.getUid())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void j() {
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        if (this.f72734m != a2 && this.f72728b != null) {
            this.f72734m = a2;
            if (a2) {
                LinearLayout linearLayout = (LinearLayout) a(R.id.cfl);
                l.b(linearLayout, "");
                linearLayout.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) a(R.id.cfl);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
            com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
            if (bVar == null) {
                l.b();
            }
            bVar.b(this.f72734m);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void k() {
        if (ab_() && a(R.id.ave) != null) {
            Aweme bindAweme = ((StoryEmojiReactionView) a(R.id.ave)).getBindAweme();
            if (this.f72732j.length() > 0) {
                String stringBuffer = this.f72732j.toString();
                l.b(stringBuffer, "");
                if (bindAweme != null) {
                    bindAweme.getAid();
                }
                com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
                if (aVar != null) {
                    aVar.a(false);
                }
                com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
                if (bVar != null) {
                    bVar.a(stringBuffer, bindAweme);
                }
                this.f72732j.setLength(0);
            }
            ((StoryEmojiReactionView) a(R.id.ave)).a(l());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void b() {
        if (ab_()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                MentionEditText mentionEditText = (MentionEditText) a(R.id.a_5);
                l.b(mentionEditText, "");
                mentionEditText.setFocusable(false);
            } else {
                MentionEditText mentionEditText2 = (MentionEditText) a(R.id.a_5);
                l.b(mentionEditText2, "");
                mentionEditText2.setFocusable(true);
                MentionEditText mentionEditText3 = (MentionEditText) a(R.id.a_5);
                l.b(mentionEditText3, "");
                mentionEditText3.setFocusableInTouchMode(true);
                ((MentionEditText) a(R.id.a_5)).requestFocus();
            }
            Aweme l2 = l();
            if (l2 == null || !l2.isProhibited()) {
                MentionEditText mentionEditText4 = (MentionEditText) a(R.id.a_5);
                l.b(mentionEditText4, "");
                mentionEditText4.setEnabled(true);
                com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
                if (bVar != null) {
                    bVar.a();
                }
                if (a(l2)) {
                    StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) a(R.id.ave);
                    l.b(storyEmojiReactionView, "");
                    storyEmojiReactionView.setVisibility(8);
                    return;
                }
                StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) a(R.id.ave);
                l.b(storyEmojiReactionView2, "");
                storyEmojiReactionView2.setVisibility(0);
                return;
            }
            MentionEditText mentionEditText5 = (MentionEditText) a(R.id.a_5);
            l.b(mentionEditText5, "");
            mentionEditText5.setEnabled(false);
            ((MentionEditText) a(R.id.a_5)).setHint(R.string.alc);
            StoryEmojiReactionView storyEmojiReactionView3 = (StoryEmojiReactionView) a(R.id.ave);
            l.b(storyEmojiReactionView3, "");
            storyEmojiReactionView3.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a() {
        if (a(R.id.a_5) != null) {
            Aweme l2 = l();
            s();
            if (l2 == null || !l2.isProhibited()) {
                MentionEditText mentionEditText = (MentionEditText) a(R.id.a_5);
                l.b(mentionEditText, "");
                mentionEditText.setEnabled(true);
                com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
                if (bVar != null) {
                    bVar.a();
                    bVar.k();
                    FadeImageView fadeImageView = (FadeImageView) a(R.id.en2);
                    l.b(fadeImageView, "");
                    fadeImageView.setVisibility(8);
                }
                if (a(l2)) {
                    StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) a(R.id.ave);
                    l.b(storyEmojiReactionView, "");
                    storyEmojiReactionView.setVisibility(8);
                    return;
                }
                StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) a(R.id.ave);
                l.b(storyEmojiReactionView2, "");
                storyEmojiReactionView2.setVisibility(0);
                return;
            }
            MentionEditText mentionEditText2 = (MentionEditText) a(R.id.a_5);
            l.b(mentionEditText2, "");
            mentionEditText2.setEnabled(false);
            ((MentionEditText) a(R.id.a_5)).setHint(R.string.alc);
            StoryEmojiReactionView storyEmojiReactionView3 = (StoryEmojiReactionView) a(R.id.ave);
            l.b(storyEmojiReactionView3, "");
            storyEmojiReactionView3.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x00ea;
     */
    @Override // com.ss.android.ugc.aweme.comment.services.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.df.q():boolean");
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72735a;

        static {
            Covode.recordClassIndex(44814);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(df dfVar) {
            this.f72735a = dfVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            IBanAppealService c2 = com.ss.android.ugc.aweme.compliance.api.a.c();
            Context context = this.f72735a.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            c2.a(context, "float_comment");
        }
    }

    public static final class g implements StoryEmojiReactionView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72740a;

        static {
            Covode.recordClassIndex(44819);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(df dfVar) {
            this.f72740a = dfVar;
        }

        @Override // com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.d
        public final void a(StoryEmojiReactionView.c cVar, Aweme aweme) {
            boolean z;
            l.d(cVar, "");
            if (aweme != null && !com.ss.android.ugc.aweme.story.d.a.k(aweme)) {
                boolean z2 = false;
                if (this.f72740a.f72732j.length() <= 148) {
                    if (this.f72740a.f72732j.length() == 0) {
                        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72740a.f72727a;
                        if (aVar != null) {
                            z = aVar.b(cVar.f89487b);
                        } else {
                            z = false;
                        }
                        aweme.getAid();
                        if (!z) {
                            this.f72740a.f72732j.setLength(0);
                            return;
                        }
                        com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72740a.f72727a;
                        if (aVar2 != null) {
                            aVar2.a(true);
                        }
                    } else {
                        aweme.getAid();
                        com.ss.android.ugc.aweme.comment.services.a aVar3 = this.f72740a.f72727a;
                        if (aVar3 != null) {
                            aVar3.c(cVar.f89487b);
                        }
                    }
                    this.f72740a.f72732j.append(cVar.f89487b);
                    v<Aweme> vVar = this.f72740a.f72731e;
                    if (vVar != null) {
                        vVar.a(aweme);
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.comment.services.a aVar4 = this.f72740a.f72727a;
                if (aVar4 != null) {
                    aVar4.a(false);
                }
                String stringBuffer = this.f72740a.f72732j.toString();
                l.b(stringBuffer, "");
                aweme.getAid();
                com.ss.android.ugc.aweme.comment.b bVar = this.f72740a.f72728b;
                if (bVar != null) {
                    bVar.a(stringBuffer, aweme);
                }
                this.f72740a.f72732j.setLength(0);
                com.ss.android.ugc.aweme.comment.services.a aVar5 = this.f72740a.f72727a;
                if (aVar5 != null) {
                    z2 = aVar5.b(cVar.f89487b);
                }
                aweme.getAid();
                if (z2) {
                    this.f72740a.f72732j.append(cVar.f89487b);
                    com.ss.android.ugc.aweme.comment.services.a aVar6 = this.f72740a.f72727a;
                    if (aVar6 != null) {
                        aVar6.a(true);
                    }
                }
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72737a;

        static {
            Covode.recordClassIndex(44816);
        }

        d(df dfVar) {
            this.f72737a = dfVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
            com.ss.android.ugc.aweme.comment.services.a aVar = this.f72737a.f72727a;
            if (aVar != null) {
                aVar.a(false);
            }
        }
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72738a;

        static {
            Covode.recordClassIndex(44817);
        }

        e(df dfVar) {
            this.f72738a = dfVar;
        }

        @Override // f.a.w
        public final void subscribe(v<Aweme> vVar) {
            l.d(vVar, "");
            this.f72738a.f72731e = vVar;
        }
    }

    private final void b(int i2) {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (aVar != null) {
            aVar.a(new ag(i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str) {
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        l.b(linearLayout, "");
        linearLayout.setVisibility(4);
        b(8);
        com.ss.android.ugc.aweme.comment.g.c cVar = this.f72729c;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(String str) {
        String aid;
        Aweme l2 = l();
        String str2 = this.f72730d;
        String str3 = "";
        if (l2 == null) {
            aid = str3;
        } else {
            aid = l2.getAid();
            str3 = l2.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.m.b.a(str, str2, aid, str3);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(boolean z) {
        if (z) {
            ForwardStatisticsServiceImpl.b().a(o(), l(), "detail", "click_original");
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72728b = new com.ss.android.ugc.aweme.comment.b(this, hashCode(), this);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72736a;

        static {
            Covode.recordClassIndex(44815);
        }

        c(df dfVar) {
            this.f72736a = dfVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme = (Aweme) obj;
            if (this.f72736a.f72732j.length() > 0) {
                String stringBuffer = this.f72736a.f72732j.toString();
                l.b(stringBuffer, "");
                if (aweme != null) {
                    aweme.getAid();
                }
                com.ss.android.ugc.aweme.comment.services.a aVar = this.f72736a.f72727a;
                if (aVar != null) {
                    aVar.a(false);
                }
                com.ss.android.ugc.aweme.comment.b bVar = this.f72736a.f72728b;
                if (bVar != null) {
                    bVar.a(stringBuffer, aweme);
                }
                this.f72736a.f72732j.setLength(0);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72739a;

        static {
            Covode.recordClassIndex(44818);
        }

        f(df dfVar) {
            this.f72739a = dfVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.comment.services.a aVar;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f72739a.l()) && (aVar = this.f72739a.f72727a) != null) {
                aVar.a("click_comment_icon");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void d(boolean z) {
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        if (linearLayout != null) {
            linearLayout.post(new i(this, z));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(Comment comment) {
        bj t = t();
        if (t != null) {
            t.a(comment);
        }
        if (comment != null) {
            if (comment.isStoryEmojiComment()) {
                if (comment != null) {
                    comment.getAwemeId();
                    comment.getFakeId();
                    comment.getText();
                }
                com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
                if (aVar != null) {
                    aVar.a(comment);
                    return;
                }
                return;
            } else if (comment != null) {
                comment.getAwemeId();
                comment.getFakeId();
                comment.getText();
            }
        }
        com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72727a;
        if (aVar2 != null) {
            aVar2.b(comment);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onVideoEvent(ag agVar) {
        String str;
        l.d(agVar, "");
        if (14 == agVar.f93450a) {
            Object obj = agVar.f93451b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Aweme l2 = l();
            if (l2 != null) {
                str = l2.getAid();
            } else {
                str = null;
            }
            if (m.a(str, str2)) {
                s();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(boolean z) {
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        MentionEditText mentionEditText = (MentionEditText) a(R.id.a_5);
        l.b(mentionEditText, "");
        if (!TextUtils.isEmpty(mentionEditText.getText())) {
            FadeImageView fadeImageView = (FadeImageView) a(R.id.en2);
            l.b(fadeImageView, "");
            fadeImageView.setVisibility(0);
        } else {
            FadeImageView fadeImageView2 = (FadeImageView) a(R.id.en2);
            l.b(fadeImageView2, "");
            fadeImageView2.setVisibility(8);
        }
        b(9);
        com.ss.android.ugc.aweme.comment.g.c cVar = this.f72729c;
        if (cVar != null) {
            cVar.d();
        }
        if (this.f72728b != null && a(R.id.a_5) != null) {
            if (this.f72728b == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.comment.b.a((MentionEditText) a(R.id.a_5), (int) R.color.a9);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        com.ss.android.ugc.aweme.comment.b bVar;
        l.d(cVar, "");
        int i2 = cVar.f71746a;
        Aweme l2 = l();
        if (i2 == 8) {
            if (cVar.f71747b instanceof String) {
                Object obj = cVar.f71747b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                if (!(l2 == null || l2.getAid() == null || !l.a((Object) l2.getAid(), obj) || (bVar = this.f72728b) == null)) {
                    bVar.a();
                }
            } else {
                return;
            }
        } else if (!(i2 == 3 || i2 == 4 || i2 == 8)) {
            return;
        }
        if (cVar.f71747b instanceof Object[]) {
            Object obj2 = cVar.f71747b;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<*>");
            if (((Object[]) obj2).length == 2) {
                s();
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ df f72741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f72742b;

        static {
            Covode.recordClassIndex(44820);
        }

        h(df dfVar, View view) {
            this.f72741a = dfVar;
            this.f72742b = view;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.emoji.g.a aVar;
            AwemeControl awemeControl;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(this.f72742b, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f72741a.l())) {
                Aweme l2 = this.f72741a.l();
                if (l2 == null || (awemeControl = l2.getAwemeControl()) == null || awemeControl.canComment()) {
                    this.f72741a.r();
                    MentionEditText mentionEditText = (MentionEditText) this.f72741a.a(R.id.a_5);
                    l.b(mentionEditText, "");
                    String.valueOf(mentionEditText.getText());
                    com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72741a.f72727a;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    com.ss.android.ugc.aweme.comment.b bVar = this.f72741a.f72728b;
                    if (bVar != null) {
                        MentionEditText mentionEditText2 = (MentionEditText) this.f72741a.a(R.id.a_5);
                        l.b(mentionEditText2, "");
                        Editable text = mentionEditText2.getText();
                        MentionEditText mentionEditText3 = (MentionEditText) this.f72741a.a(R.id.a_5);
                        l.b(mentionEditText3, "");
                        ArrayList<TextExtraStruct> textExtraStructList = mentionEditText3.getTextExtraStructList();
                        com.ss.android.ugc.aweme.comment.b bVar2 = this.f72741a.f72728b;
                        if (bVar2 != null) {
                            aVar = bVar2.f71477k;
                        } else {
                            aVar = null;
                        }
                        bVar.a((CharSequence) text, (List<TextExtraStruct>) textExtraStructList, aVar, false, false);
                    }
                    FadeImageView fadeImageView = (FadeImageView) this.f72741a.a(R.id.en2);
                    l.b(fadeImageView, "");
                    fadeImageView.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.df.a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(Comment comment) {
        String str;
        String str2;
        l.d(comment, "");
        comment.getAwemeId();
        comment.getFakeId();
        comment.getText();
        String awemeId = comment.getAwemeId();
        if (awemeId == null || awemeId.length() == 0) {
            str = r();
        } else {
            str = comment.getAwemeId();
        }
        AwemeService.b().c(str);
        List<TextExtraStruct> textExtra = comment.getTextExtra();
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 == null || awemeId2.length() == 0) {
            str2 = r();
        } else {
            str2 = comment.getAwemeId();
        }
        if (!(textExtra == null || this.f72728b == null)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
                if (bVar == null) {
                    l.b();
                }
                Iterator<User> it = bVar.f71470d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    l.b(next, "");
                    String uid = next.getUid();
                    l.b(textExtraStruct, "");
                    if (TextUtils.equals(uid, textExtraStruct.getUserId())) {
                        int atType = next.getAtType();
                        if (atType == 3) {
                            getContext();
                            com.ss.android.ugc.aweme.common.r.a("comment_at", "follow", str2, next.getUid());
                        } else if (atType == 1) {
                            getContext();
                            com.ss.android.ugc.aweme.common.r.a("comment_at", "search", str2, next.getUid());
                        } else if (atType == 4) {
                            getContext();
                            com.ss.android.ugc.aweme.common.r.a("comment_at", "recent", str2, next.getUid());
                        }
                    }
                }
            }
        }
        bj t = t();
        comment.setIgnoreToast(true);
        if (t != null) {
            t.a(comment, false);
        }
        if (comment.isStoryEmojiComment()) {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
            com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
            if (aVar != null) {
                aVar.c(comment);
            }
        } else {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
            com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72727a;
            if (aVar2 != null) {
                aVar2.c(comment);
            }
        }
        if (ab_() && getActivity() != null) {
            new com.bytedance.tux.g.b(this).e(R.string.aln).b();
            a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(3, new Object[]{str, comment.clone()}));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(boolean z) {
        if (!ab_()) {
            ab_();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) a(R.id.cee);
        l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.cfy);
            l.b(linearLayout2, "");
            if (linearLayout2.getVisibility() == 8 && com.ss.android.ugc.aweme.story.d.a.m(l())) {
                LinearLayout linearLayout3 = (LinearLayout) a(R.id.cfy);
                l.b(linearLayout3, "");
                linearLayout3.setVisibility(0);
                o.a(a(R.id.fe5), 0);
                Context context = getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                marginLayoutParams.height = context.getResources().getDimensionPixelOffset(R.dimen.ds);
                l.b(c.b.f66221a, "");
                if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                    marginLayoutParams.height += com.ss.android.ugc.aweme.adaptation.c.f66195e;
                }
                LinearLayout linearLayout4 = (LinearLayout) a(R.id.cee);
                l.b(linearLayout4, "");
                linearLayout4.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        LinearLayout linearLayout5 = (LinearLayout) a(R.id.cfy);
        l.b(linearLayout5, "");
        if (linearLayout5.getVisibility() == 0) {
            LinearLayout linearLayout6 = (LinearLayout) a(R.id.cfy);
            l.b(linearLayout6, "");
            linearLayout6.setVisibility(8);
            View a2 = a(R.id.fe5);
            l.b(a2, "");
            a2.setVisibility(8);
            marginLayoutParams.height = 1;
            LinearLayout linearLayout7 = (LinearLayout) a(R.id.cee);
            l.b(linearLayout7, "");
            linearLayout7.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((LinearLayout) a(R.id.cfy)).setBackgroundResource(R.drawable.b1t);
        a(R.id.etq);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.etq);
        l.b(tuxTextView, "");
        String str = getString(R.string.aju) + " ";
        String string = getString(R.string.hch);
        l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + string);
        spannableStringBuilder.setSpan(new b(this), str.length(), spannableStringBuilder.length(), 18);
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.a9)), str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.etq);
        l.b(tuxTextView2, "");
        tuxTextView2.setMovementMethod(new LinkMovementMethod());
        com.ss.android.ugc.aweme.comment.b bVar = this.f72728b;
        if (bVar != null) {
            a(R.id.c58);
            bVar.a((MentionEditText) a(R.id.a_5), null, null, null, (TextView) a(R.id.etq), r(), this.f72730d, true);
        }
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        this.f72734m = a2;
        com.ss.android.ugc.aweme.comment.b bVar2 = this.f72728b;
        if (bVar2 != null) {
            bVar2.b(a2);
        }
        if (this.f72734m) {
            LinearLayout linearLayout = (LinearLayout) a(R.id.cfl);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.cfl);
            l.b(linearLayout2, "");
            linearLayout2.setVisibility(0);
        }
        MentionEditText mentionEditText = (MentionEditText) a(R.id.a_5);
        mentionEditText.setCursorVisible(false);
        l.b(mentionEditText, "");
        mentionEditText.setTextColor(androidx.core.content.b.c(mentionEditText.getContext(), R.color.a_));
        mentionEditText.setHintTextColor(androidx.core.content.b.c(mentionEditText.getContext(), R.color.ln));
        mentionEditText.setTextAlignment(5);
        ((LinearLayout) a(R.id.cep)).setOnClickListener(new f(this));
        s();
        t<Aweme> a3 = t.a(new e(this));
        this.n = a3;
        if (a3 != null) {
            f.a.b.b a4 = a3.d(1, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this));
            l.b(a4, "");
            f.a.j.a.a(a4, this.o);
        }
        if (a(l())) {
            StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) a(R.id.ave);
            l.b(storyEmojiReactionView, "");
            i.a.a.a.a.b.a(storyEmojiReactionView);
        } else {
            StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) a(R.id.ave);
            l.b(storyEmojiReactionView2, "");
            i.a.a.a.a.b.c(storyEmojiReactionView2);
        }
        ((StoryEmojiReactionView) a(R.id.ave)).f89473b = l();
        ((StoryEmojiReactionView) a(R.id.ave)).setStoryEmojiReactionListener(new g(this));
        ((FadeImageView) a(R.id.en2)).setOnClickListener(new h(this, view));
        com.ss.android.ugc.aweme.adaptation.c.a(a(R.id.cfy), a(R.id.fe5), null);
        if (!com.ss.android.ugc.aweme.story.d.a.m(l())) {
            a(false);
        }
        if (this.f72733l) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3 == null) goto L_0x0013;
     */
    @Override // com.ss.android.ugc.aweme.comment.services.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.l()
            java.lang.String r2 = r4.f72730d
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.getAid()
            if (r0 != 0) goto L_0x0017
        L_0x0010:
            r0 = r1
            if (r3 != 0) goto L_0x0017
        L_0x0013:
            com.ss.android.ugc.aweme.comment.m.b.a(r5, r6, r2, r0, r1)
            return
        L_0x0017:
            java.lang.String r1 = r3.getAuthorUid()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.df.a(java.lang.String, int):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(Exception exc, int i2, Comment comment) {
        l.d(exc, "");
        if (comment != null) {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
        }
        boolean unused = com.ss.android.ugc.aweme.comment.api.c.a(getContext(), exc, R.string.akk, false, false);
        if (comment != null) {
            comment.setIgnoreToast(true);
        }
        bj t = t();
        if (t != null) {
            t.a(exc, i2, comment);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.b.c.a(getActivity(), R.layout.ih, viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n.a(getContext()), -2);
            layoutParams.addRule(12);
            l.b(a2, "");
            a2.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(n.a(getContext()), -2);
            layoutParams2.gravity = 80;
            l.b(a2, "");
            a2.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(n.a(getContext()), -2);
            l.b(a2, "");
            a2.setLayoutParams(layoutParams3);
        }
        cg.a(this);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(int i2, int i3, String str, String str2, boolean z) {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.f72727a;
        if (aVar != null) {
            aVar.a(i3);
        }
        if (TextUtils.equals(str2, "story_button_send")) {
            b(57);
            return;
        }
        ag agVar = new ag(11);
        Bundle bundle = new Bundle();
        bundle.putInt("emojiReact", z ? 1 : 0);
        agVar.f93452c = bundle;
        com.ss.android.ugc.aweme.comment.services.a aVar2 = this.f72727a;
        if (aVar2 != null) {
            aVar2.a(agVar);
        }
    }
}
