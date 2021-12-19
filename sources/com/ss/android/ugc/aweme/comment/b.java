package com.ss.android.ugc.aweme.comment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.activity.processor.w;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.g;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.i.a;
import com.ss.android.ugc.aweme.comment.i.f;
import com.ss.android.ugc.aweme.comment.j.n;
import com.ss.android.ugc.aweme.comment.j.q;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.ui.br;
import com.ss.android.ugc.aweme.comment.ui.bz;
import com.ss.android.ugc.aweme.comment.ui.k;
import com.ss.android.ugc.aweme.comment.util.s;
import com.ss.android.ugc.aweme.comment.util.u;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.z;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class b implements w, q, bz.a, bz.b, bz.c {
    private int A = 0;
    private View.OnTouchListener B;
    private View.OnClickListener C;
    private View D;
    private View E;
    private TextView F;
    private boolean G = false;
    private a H;
    private View I;
    private boolean J;
    private boolean K;
    private List<Object> L = new CopyOnWriteArrayList();
    private boolean M = false;

    /* renamed from: a  reason: collision with root package name */
    public MentionEditText f71467a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f71468b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.services.b f71469c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<User> f71470d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public n f71471e;

    /* renamed from: f  reason: collision with root package name */
    public a f71472f;

    /* renamed from: g  reason: collision with root package name */
    boolean f71473g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f71474h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f71475i;

    /* renamed from: j  reason: collision with root package name */
    public AbstractC1611b f71476j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.emoji.g.a f71477k;

    /* renamed from: l  reason: collision with root package name */
    public View f71478l;

    /* renamed from: m  reason: collision with root package name */
    public DataCenter f71479m;
    public boolean n = false;
    public String o = "";
    public List<EditText> p = new CopyOnWriteArrayList();
    public com.bytedance.tux.sheet.a.a q;
    public ConstraintLayout r;
    public GiftViewModel s;
    IVideoGiftService t = VideoGiftService.l();
    public boolean u = false;
    private String v;
    private int w;
    private boolean x;
    private String y = "";
    private int z;

    /* renamed from: com.ss.android.ugc.aweme.comment.b$b  reason: collision with other inner class name */
    public interface AbstractC1611b {
        static {
            Covode.recordClassIndex(44009);
        }

        int a();
    }

    static {
        Covode.recordClassIndex(43990);
    }

    private static int d(boolean z2) {
        return z2 ? 60 : 150;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void h() {
        b();
    }

    public final void a(EditText editText) {
        if (!(editText == null || !this.p.contains(editText) || this.G)) {
            this.G = true;
            for (EditText editText2 : this.p) {
                if (editText2 != editText && !g.a(editText2.getText(), editText.getText())) {
                    editText2.setText(editText.getText());
                }
            }
            this.G = false;
        }
    }

    public final void a(MentionEditText mentionEditText, View view, View view2, View view3, TextView textView, String str, String str2, boolean z2) {
        this.f71475i = str2;
        this.M = z2;
        if (v() != null) {
            this.s.a(this.f71475i, v().getGroupId(), s(), v().getRequestId());
        }
        this.f71467a = mentionEditText;
        b(mentionEditText);
        this.F = textView;
        textView.setVisibility(this.n ? 0 : 8);
        Fragment fragment = this.f71468b;
        if (fragment != null && this.f71467a != null) {
            if (fragment.getContext() != null) {
                this.f71467a.setMentionTextColor(androidx.core.content.b.c(this.f71468b.getContext(), R.color.bx));
            }
            this.C = new c(this, str2, str);
            this.B = new d(this, str2, str);
            this.f71467a.setFocusable(false);
            this.f71467a.setFocusableInTouchMode(false);
            this.f71467a.setInputType(0);
            this.f71467a.setOnClickListener(this.C);
            this.f71467a.setOnTouchListener(this.B);
            if (view != null) {
                this.D = view;
                if (in.d() || this.n) {
                    view.setVisibility(8);
                }
                this.D.setOnClickListener(new f(this, str2, str, mentionEditText));
            }
            if (view2 != null) {
                this.E = view2;
                if (in.d() || this.n) {
                    view2.setVisibility(8);
                }
                com.bytedance.android.livesdk.util.rxutils.a.a.a(view2).g(1, TimeUnit.SECONDS).d(new g(this, mentionEditText, str, str2));
            }
            if (view3 != null) {
                this.I = view3;
                if (this.t.a(v())) {
                    this.I.setVisibility(0);
                } else {
                    this.I.setVisibility(8);
                }
                com.bytedance.android.livesdk.util.rxutils.a.a.a(this.I).g(1, TimeUnit.SECONDS).d(new h(this));
            }
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(String str, String str2, View view, MotionEvent motionEvent) {
        if (this.f71467a.isFocused() || this.f71467a.isFocusable() || this.f71467a.isFocusableInTouchMode()) {
            this.f71467a.setFocusable(false);
            this.f71467a.setFocusableInTouchMode(false);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                view.performClick();
                a(view, str, str2);
            } else if (action != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, String str, String str2) {
        Context context;
        Fragment fragment = this.f71468b;
        if (fragment == null || (context = fragment.getContext()) == null) {
            context = d.a();
        }
        if (!n() || com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            return;
        }
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            c.a(this.f71468b.getActivity(), str, "click_type_comment", new ap().a("group_id", str2).a("log_pb", ac.c(str2)).f142646a);
        } else if (in.d()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.add).a();
        } else if (!e()) {
            if (this.A == 1) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.amd).a();
            } else if (this.f71469c.m() != null && !z.d(this.f71469c.m())) {
                this.f71473g = true;
                if (view instanceof MentionEditText) {
                    a(((MentionEditText) view).getHint(), false);
                } else if (n()) {
                    a();
                    a((CharSequence) this.v, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (!n() || e()) {
            return;
        }
        if (z2) {
            a(this.f71467a.getHint(), "click_gift_icon");
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f71468b.getContext()).a(R.string.hb2).a();
        }
    }

    public final void a(CharSequence charSequence, boolean z2) {
        if (n()) {
            Bundle a2 = a(charSequence);
            a2.putBoolean("showEmojiPanel", z2);
            a2.putBoolean("isCommentDesc", this.M);
            a(bz.a(this.f71469c.p(), f(), this.f71475i, a2));
            d();
        }
    }

    public final void a(CharSequence charSequence, String str) {
        if (n()) {
            Bundle a2 = a(charSequence);
            a2.putBoolean("showGiftPanel", true);
            this.s.f71913e = str;
            bz a3 = bz.a(this.f71469c.p(), f(), this.f71475i, a2);
            a(str);
            a(a3);
            d();
        }
    }

    public final void a(User user, String str) {
        if (n()) {
            this.y = str;
            int o2 = o();
            int p2 = this.f71469c.p();
            f();
            bz a2 = bz.a(p2, false, this.f71475i);
            Bundle arguments = a2.getArguments();
            if (arguments != null) {
                arguments.putSerializable("user", user);
                arguments.putInt("maxLength", o2);
                arguments.putBoolean("showAt", true);
            }
            a(a2);
        }
    }

    public final void a(bz bzVar) {
        bzVar.H = this;
        bzVar.G = this;
        bzVar.I = this;
        t();
        u();
        bzVar.S = v();
        bzVar.a(this);
        bzVar.Z = this.s;
        m();
        bzVar.U = this.H;
        bzVar.a(this.f71477k);
        CommentVideoModel.Type type = CommentVideoModel.Type.NONE;
        Fragment fragment = this.f71468b;
        if (fragment instanceof k) {
            if (((k) fragment).z()) {
                type = CommentVideoModel.Type.COMMENT;
            }
            bzVar.aa = ((k) this.f71468b).y();
        }
        if (this.u) {
            type = CommentVideoModel.Type.COMMENT;
        }
        bzVar.X = type;
        try {
            bzVar.show(this.f71468b.getChildFragmentManager(), "input");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(CharSequence charSequence, Aweme aweme) {
        String str;
        this.w = 1;
        this.f71469c.a(1, charSequence.length() / 2, charSequence.toString(), "close_text_button_send", true);
        this.J = false;
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        String o2 = bVar == null ? "" : bVar.o();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        f.a aVar = (f.a) new f.a().a(str).b(charSequence.toString()).a((List<? extends TextExtraStruct>) null).a((com.ss.android.ugc.aweme.emoji.g.a) null).a(com.ss.android.ugc.aweme.app.c.c.a(o2)).d("");
        aVar.p = true;
        this.f71471e.f72053a = 1;
        this.f71471e.a(aVar.b());
        b((com.ss.android.ugc.aweme.emoji.g.a) null);
        this.J = false;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void a(CommentVideoModel.Type type) {
        if (type == CommentVideoModel.Type.NONE) {
            return;
        }
        if (this.u) {
            a("collection_text_panel", type);
        } else {
            a("comment_click", type);
        }
    }

    public final void a(String str, CommentVideoModel.Type type) {
        com.ss.android.ugc.aweme.comment.services.b bVar;
        Comment n2;
        User user;
        String cid;
        String str2;
        String str3;
        if (n() && this.f71468b.getActivity() != null && (bVar = this.f71469c) != null && bVar.n() != null && (user = (n2 = this.f71469c.n()).getUser()) != null) {
            String o2 = this.f71469c.o();
            if (n2.getCommentType() == 2) {
                cid = n2.getReplyId();
                str2 = n2.getCid();
            } else {
                cid = n2.getCid();
                str2 = "";
            }
            String o3 = this.f71469c.o().isEmpty() ? this.f71475i : this.f71469c.o();
            if (this.u && (str.equals("collection_text_panel") || str.equals("comment_press") || str.equals("collection_reply_button"))) {
                o3 = "collection_comment";
            }
            e activity = this.f71468b.getActivity();
            String uid = user.getUid();
            String b2 = in.b(user);
            UrlModel avatarThumb = user.getAvatarThumb();
            String text = n2.getText();
            String cid2 = n2.getCid();
            String awemeId = n2.getAwemeId();
            String s2 = s();
            int a2 = com.ss.android.ugc.aweme.app.c.c.a(o2);
            if (type == CommentVideoModel.Type.COMMENT) {
                str3 = "comment_reply";
            } else {
                str3 = "question_and_answer";
            }
            u.a(activity, new CommentVideoModel(uid, b2, avatarThumb, text, cid2, awemeId, s2, cid, str2, a2, str, 0, 0, type, str3, o3));
            if (type == CommentVideoModel.Type.COMMENT) {
                Fragment fragment = this.f71468b;
                if (fragment instanceof k) {
                    ((k) fragment).a(n2, str);
                    g();
                }
            }
            if (o3.equals("collection_comment")) {
                a(n2, o3, str);
            }
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void a(String str, int i2) {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar != null) {
            bVar.a(str, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void a(int i2, int i3, int i4, String str, String str2, CommentAtSummonFriendItem commentAtSummonFriendItem) {
        User user;
        Aweme m2 = this.f71469c.m();
        String str3 = this.f71475i;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("input_text_length", i2).a("user_text_length", i3).a("rank", i4).a("search_keyword", str).a("enter_from", str3).a("to_user_id", str2);
        if (m2 != null) {
            a2.a("group_id", m2.getAid()).a("author_id", m2.getAuthorUid());
            h.a(a2, m2);
            com.ss.android.ugc.aweme.upvote.event.c.a(a2, m2, str3);
            user = m2.getAuthor();
        } else {
            user = null;
        }
        eu.a(a2, user);
        if (ac.a(str3)) {
            a2.a("log_pb", ac.a.f91473a.a(m2.getRequestId()));
            a2.a("search_id", commentAtSummonFriendItem.searchId);
            r.b("add_comment_at", com.ss.android.ugc.aweme.metrics.ac.a(a2.f66730a));
            return;
        }
        r.a("add_comment_at", a2.f66730a);
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void a(User user) {
        Context context;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        IMUser fromUser = IMUser.fromUser(user);
        Fragment fragment = this.f71468b;
        if (fragment == null || (context = fragment.getContext()) == null) {
            context = d.a();
        }
        Aweme v2 = v();
        if (v2 != null) {
            createIIMServicebyMonsterPlugin.shareSingleMsg(context, fromUser, ah.f123352a.a(context, v2, this.f71475i, "comment_at"), new i(this, v2, fromUser, createIIMServicebyMonsterPlugin));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.c
    public final void a(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        bz bzVar;
        MentionEditText.MentionSpan[] mentionText;
        Editable text;
        MentionEditText mentionEditText = this.f71467a;
        boolean z2 = false;
        boolean z3 = !this.x && (mentionEditText != null && ((text = mentionEditText.getText()) == null || text.length() == 0)) && aVar == null;
        this.f71469c.e(z3);
        if (n() && (bzVar = (bz) this.f71468b.getChildFragmentManager().a("input")) != null) {
            if (bzVar.f72651d == null || (mentionText = bzVar.f72651d.getMentionText()) == null || mentionText.length == 0) {
                this.f71470d.clear();
            } else {
                Iterator<User> it = this.f71470d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    boolean z4 = false;
                    for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                        if (TextUtils.equals(next.getUid(), mentionSpan.f144649a)) {
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        it.remove();
                    }
                }
            }
        }
        if (z3) {
            k();
            b((com.ss.android.ugc.aweme.emoji.g.a) null);
        } else {
            b(aVar);
        }
        View view = this.f71478l;
        if (view != null && view.getVisibility() == 0) {
            this.f71478l.setVisibility(8);
        }
        View view2 = this.I;
        if (view2 != null && (view2 instanceof TuxIconView)) {
            if (this.f71469c.p() == 1 || this.f71469c.p() == 2) {
                z2 = true;
            }
            ((TuxIconView) this.I).setTintColorRes(R.attr.ac);
            this.I.setAlpha(z2 ? 1.0f : 0.5f);
            com.bytedance.android.livesdk.util.rxutils.a.a.a(this.I).g(1, TimeUnit.SECONDS).d(new j(this, z2));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.j.q
    public final void a(Exception exc, Comment comment) {
        if (n()) {
            CaptchaHelperServiceImpl.a();
        }
        a aVar = this.f71472f;
        if (aVar != null) {
            if (!aVar.a(exc, this.w, comment)) {
                this.f71472f.a(comment);
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar != null) {
            bVar.b(exc, this.w, comment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r3 = (com.ss.android.ugc.aweme.profile.model.User) r8.getSerializableExtra("extra_data");
     */
    @Override // com.ss.android.ugc.aweme.activity.processor.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, int r7, android.content.Intent r8) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.b.a(int, int, android.content.Intent):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.a
    public final void a(String str, CharSequence charSequence, String str2, int i2, LogPbBean logPbBean) {
        a(false, str, charSequence, str2, i2, logPbBean);
    }

    public final void a(String str) {
        r.a("show_gift_panel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71475i).a("group_id", r()).a("author_id", s()).a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("is_follow", s.b(v())).a("is_like", s.a(v())).a("enter_method", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void a(CharSequence charSequence, List<TextExtraStruct> list, com.ss.android.ugc.aweme.emoji.g.a aVar, boolean z2, boolean z3) {
        String str;
        Aweme v2 = v();
        GiftViewModel giftViewModel = this.s;
        if (!((giftViewModel == null || giftViewModel.b().getValue() == null) && TextUtils.isEmpty(charSequence)) && n()) {
            if (in.d()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f71468b.getContext()).a(R.string.add).a();
                return;
            }
            this.f71468b.getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = q();
            }
            if (!j.f107229h) {
                new com.bytedance.tux.g.b(this.f71468b).e(R.string.de8).b();
            } else if (CommentServiceImpl.e().c(v2)) {
                CommentServiceImpl.e().a(this.f71468b.getContext(), R.string.akh, this.f71468b.getString(R.string.amq));
            } else if (!CommentServiceImpl.e().b(v2)) {
                CommentServiceImpl.e().a(this.f71468b.getContext(), R.string.akz, this.f71468b.getString(R.string.aky));
            } else if (charSequence.length() > d(z2)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f71468b.getContext()).a(R.string.a50).a();
            } else {
                if (aVar != null) {
                    com.ss.android.ugc.aweme.emoji.d.a.b.a(aVar);
                }
                int i2 = 2;
                if (z2) {
                    this.w = 3;
                } else if (this.f71469c.n() != null) {
                    this.w = 2;
                } else {
                    this.w = 1;
                }
                this.K = false;
                this.f71469c.a(this.w, com.ss.android.ugc.aweme.emoji.i.b.b.a(charSequence.toString()), charSequence.toString(), z3 ? "close_text_button_send" : "button_send", false);
                this.J = false;
                com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
                String o2 = bVar == null ? "" : bVar.o();
                if (v2 != null) {
                    str = v2.getAid();
                } else {
                    str = "";
                }
                f.a aVar2 = (f.a) new f.a().a(str).b(charSequence.toString()).a(list).a(aVar).a(com.ss.android.ugc.aweme.app.c.c.a(o2)).d("");
                aVar2.p = false;
                com.ss.android.ugc.aweme.comment.services.b bVar2 = this.f71469c;
                if (bVar2 == null || bVar2.n() == null) {
                    this.f71471e.f72053a = this.f71474h ? 1 : 0;
                } else {
                    Comment n2 = this.f71469c.n();
                    if (n2.getCommentType() == 2) {
                        this.f71471e.f72053a = 2;
                        a.AbstractC1619a c2 = aVar2.c(n2.getReplyId());
                        c2.f71971e = n2.getCid();
                        aVar2 = (f.a) c2.a();
                    } else {
                        n nVar = this.f71471e;
                        if (!this.f71474h) {
                            i2 = 0;
                        }
                        nVar.f72053a = i2;
                        aVar2 = (f.a) aVar2.c(n2.getCid());
                    }
                }
                GiftViewModel giftViewModel2 = this.s;
                if (!(giftViewModel2 == null || giftViewModel2.b().getValue() == null)) {
                    long id = this.s.b().getValue().getId();
                    aVar2.f71977k = id;
                    aVar2.f71976j = s();
                    if (this.s.c().getValue() != null) {
                        aVar2.f71978l = this.s.c().getValue().get(Long.valueOf(id));
                    }
                    if (!this.t.d()) {
                        this.t.e();
                    }
                }
                if ((this.f71468b instanceof k) && com.ss.android.ugc.aweme.comment.d.d.a() != 0) {
                    aVar2.o = 0;
                }
                aVar2.n = 0;
                this.f71471e.a(aVar2.b());
                if (list != null && list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct textExtraStruct : list) {
                        arrayList.add(textExtraStruct.getUserId());
                    }
                    r.a("send_comment_at", new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", arrayList).a("group_id", v2.getAid()).a("author_id", v2.getAuthorUid()).a("enter_from", this.f71475i).f66730a);
                    this.H.f71258d.clear();
                }
                b((com.ss.android.ugc.aweme.emoji.g.a) null);
                this.J = false;
            }
        }
    }

    public final void c() {
        com.bytedance.tux.sheet.a.a aVar = this.q;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void l() {
        k();
        b((com.ss.android.ugc.aweme.emoji.g.a) null);
    }

    public final void m() {
        this.H = new a();
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Editable> f71517a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Comment> f71518b;

        /* renamed from: c  reason: collision with root package name */
        public br f71519c;

        /* renamed from: d  reason: collision with root package name */
        public Comment f71520d;

        /* renamed from: f  reason: collision with root package name */
        private Comment f71522f;

        /* renamed from: g  reason: collision with root package name */
        private int f71523g;

        static {
            Covode.recordClassIndex(44007);
        }

        public final void a() {
            this.f71517a.clear();
            this.f71518b.clear();
            this.f71520d = null;
        }

        private a() {
            this.f71517a = new HashMap();
            this.f71518b = new HashMap();
            this.f71523g = 0;
        }

        /* access modifiers changed from: package-private */
        public final void a(Comment comment) {
            if (comment != null) {
                this.f71517a.remove(comment.getFakeId());
                this.f71518b.remove(comment.getFakeId());
            }
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }

        public final void a(Comment comment, boolean z) {
            m.d(comment);
            com.ss.android.ugc.aweme.comment.i.a i2 = m.i(comment);
            if (i2 instanceof f) {
                ((f) i2).p = 1;
                b.this.f71471e.b(i2);
            } else {
                m.c(comment);
            }
            a();
            if (z) {
                a("comment_rethink_hit", comment, new com.ss.android.ugc.aweme.app.f.d().a("no_sw", 0));
            }
        }

        public final void a(String str, Comment comment, com.ss.android.ugc.aweme.app.f.d dVar) {
            r.a(str, dVar.a(UGCMonitor.EVENT_COMMENT, comment.getText()).a("group_id", comment.getAwemeId()).a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("resend_same_cmt", this.f71523g).f66730a);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(final Exception exc, final int i2, final Comment comment) {
            CommentRethinkPopup commentRethinkPopup = null;
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                if (aVar.getErrorCode() == 3017002) {
                    Object rawResponse = aVar.getRawResponse();
                    if (rawResponse instanceof CommentResponse) {
                        commentRethinkPopup = rawResponse;
                    }
                    CommentResponse commentResponse = (CommentResponse) commentRethinkPopup;
                    if (commentResponse == null || (commentRethinkPopup = commentResponse.commentRethinkPopup) == null) {
                        commentRethinkPopup = new CommentRethinkPopup(null, null, null, null, 15, null);
                    }
                }
            }
            if (commentRethinkPopup == null || comment == null) {
                return false;
            }
            this.f71520d = comment;
            Comment comment2 = this.f71522f;
            if (comment2 == null || !TextUtils.equals(comment2.getText(), comment.getText())) {
                this.f71523g = 0;
            } else {
                this.f71523g = 1;
            }
            this.f71522f = comment;
            if (!(b.this.f71468b instanceof k)) {
                a(comment, true);
                return true;
            }
            Fragment a2 = b.this.f71468b.getChildFragmentManager().a("input");
            Fragment a3 = b.this.f71468b.getChildFragmentManager().a("comment_rethink");
            final k kVar = (k) b.this.f71468b;
            if (kVar.a() && a2 == null && a3 == null) {
                br a4 = br.c.a(commentRethinkPopup);
                this.f71519c = a4;
                a4.f72596a = new br.d() {
                    /* class com.ss.android.ugc.aweme.comment.b.a.AnonymousClass1 */

                    /* renamed from: f  reason: collision with root package name */
                    private boolean f71529f;

                    static {
                        Covode.recordClassIndex(44008);
                    }

                    @Override // com.ss.android.ugc.aweme.comment.ui.br.d
                    public final void c() {
                        this.f71529f = true;
                        a.this.a("comment_rethink_cg_ck", comment, new com.ss.android.ugc.aweme.app.f.d());
                    }

                    @Override // com.ss.android.ugc.aweme.comment.ui.br.d
                    public final void a() {
                        a.this.a(comment, false);
                        a.this.a("comment_rethink_post_ck", comment, new com.ss.android.ugc.aweme.app.f.d().a("if_click_cg", Boolean.valueOf(this.f71529f)));
                    }

                    @Override // com.ss.android.ugc.aweme.comment.ui.br.d
                    public final void b() {
                        if (b.this.f71469c != null) {
                            b.this.f71469c.b(exc, i2, comment);
                        }
                        Comment comment = a.this.f71518b.get(comment.getFakeId());
                        if (comment != null) {
                            kVar.b(comment, "");
                        } else {
                            b.this.f71467a.performClick();
                        }
                        b.this.f71467a.setText(a.this.f71517a.get(comment.getFakeId()));
                        a.this.a();
                        a.this.a("comment_rethink_edit_ck", comment, new com.ss.android.ugc.aweme.app.f.d().a("if_click_cg", Boolean.valueOf(this.f71529f)));
                    }
                };
                try {
                    this.f71519c.show(b.this.f71468b.getChildFragmentManager(), "comment_rethink");
                    a("comment_rethink_sw", comment, new com.ss.android.ugc.aweme.app.f.d());
                    return true;
                } catch (IllegalStateException unused) {
                    a(comment, true);
                    return true;
                }
            } else {
                a(comment, true);
                return true;
            }
        }
    }

    private static boolean q() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private Aweme v() {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar == null) {
            return null;
        }
        return bVar.m();
    }

    public final void d() {
        DataCenter dataCenter = this.f71479m;
        if (dataCenter != null) {
            dataCenter.a("comment_dialog_state", (Object) 6);
        }
    }

    public final boolean f() {
        if (this.f71469c.m() == null) {
            return false;
        }
        this.f71469c.m();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final int i() {
        AbstractC1611b bVar = this.f71476j;
        if (bVar != null) {
            return bVar.a();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.c
    public final void j() {
        this.f71469c.a(this.y);
        this.f71473g = false;
        this.y = "";
    }

    public final boolean n() {
        Fragment fragment = this.f71468b;
        if (fragment == null || !fragment.isAdded()) {
            return false;
        }
        return true;
    }

    private boolean p() {
        Aweme m2 = this.f71469c.m();
        if (m2 == null || m2.getVideoControl() == null || m2.getVideoControl().timerStatus != 0) {
            return false;
        }
        return true;
    }

    private String r() {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar == null || bVar.m() == null) {
            return "";
        }
        return this.f71469c.m().getAid();
    }

    private String s() {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar == null || bVar.m() == null) {
            return "";
        }
        return this.f71469c.m().getAuthorUid();
    }

    private boolean t() {
        Aweme m2 = this.f71469c.m();
        if (m2 == null || !m2.getAwemeControl().canForward()) {
            return false;
        }
        return true;
    }

    private boolean u() {
        Aweme m2 = this.f71469c.m();
        if (m2 == null || !m2.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        r.a("click_emoji_entrance", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71475i).f66730a);
    }

    public final void g() {
        androidx.fragment.app.d dVar;
        if (n() && (dVar = (androidx.fragment.app.d) this.f71468b.getChildFragmentManager().a("input")) != null) {
            try {
                dVar.dismiss();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int o() {
        boolean z2;
        if (this.f71469c.p() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        return d(z2);
    }

    public final void k() {
        MentionEditText mentionEditText = this.f71467a;
        if (mentionEditText != null) {
            mentionEditText.setText("");
            this.f71467a.setHint(this.v);
            a(this.f71467a);
            GiftViewModel giftViewModel = this.s;
            if (giftViewModel != null) {
                giftViewModel.b().setValue(null);
            }
        }
        this.f71470d.clear();
    }

    public final boolean e() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.ab(this.f71469c.m())) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.nz).a();
            return true;
        }
        Aweme m2 = this.f71469c.m();
        if (m2 != null && m2.isScheduleVideo()) {
            return true;
        }
        if (p()) {
            Fragment fragment = this.f71468b;
            if (fragment == null || fragment.getContext() == null) {
                d.a();
            }
            return true;
        } else if (!this.f71469c.q() || CommentServiceImpl.e().c(this.f71469c.m()) || !CommentServiceImpl.e().b(this.f71469c.m()) || z.d(this.f71469c.m()) || in.d()) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (n()) {
            com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
            if (bVar != null) {
                String str = null;
                if (bVar.m() != null && this.f71469c.getClass().equals(k.class)) {
                    this.f71469c.m().getAid();
                    String h2 = SettingServiceImpl.v().h();
                    if ("in".equals(h2)) {
                        h2 = "id";
                    }
                    ICommerceEggService c2 = CommerceEggServiceImpl.c();
                    if (c2 != null) {
                        str = c2.a(h2);
                    }
                }
                if (this.f71469c.m() != null && this.f71469c.m().isScheduleVideo()) {
                    this.v = this.f71468b.getResources().getString(R.string.fgz);
                } else if (CommentServiceImpl.e().c(this.f71469c.m())) {
                    this.v = this.f71468b.getResources().getString(R.string.amq);
                } else if (!CommentServiceImpl.e().b(this.f71469c.m())) {
                    this.v = this.f71468b.getResources().getString(R.string.aky);
                } else if (str != null) {
                    this.v = str;
                } else {
                    int p2 = this.f71469c.p();
                    if (p2 == 2) {
                        this.v = this.f71468b.getResources().getString(R.string.ajp);
                    } else if (p2 == 4) {
                        this.v = this.f71468b.getResources().getString(R.string.c0x);
                    } else if (p2 != 7) {
                        this.v = this.f71468b.getResources().getString(R.string.ajp);
                    } else {
                        this.v = this.f71468b.getResources().getString(R.string.p6);
                    }
                }
            } else {
                this.v = this.f71468b.getResources().getString(R.string.ajp);
            }
            MentionEditText mentionEditText = this.f71467a;
            if (mentionEditText != null) {
                mentionEditText.setHint(this.v);
            }
        }
    }

    public final void a(int i2) {
        this.A = i2;
        MentionEditText mentionEditText = this.f71467a;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void b(User user) {
        this.f71470d.add(user);
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void b(CharSequence charSequence) {
        MentionEditText mentionEditText = this.f71467a;
        if (mentionEditText != null) {
            mentionEditText.setHint(charSequence);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void c(boolean z2) {
        this.f71469c.f(z2);
    }

    @Override // com.ss.android.ugc.aweme.comment.j.q
    public final void d(Comment comment) {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar != null) {
            bVar.g(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.a
    public final void e(String str) {
        r.a("show_emoji_board", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f71475i).a("tab_name", str).f66730a);
    }

    public final void b(EditText editText) {
        if (editText != null && !this.p.contains(editText)) {
            MentionEditText mentionEditText = this.f71467a;
            if (mentionEditText != null) {
                editText.setText(mentionEditText.getText());
            }
            this.p.add(editText);
        }
    }

    public static void a(Comment comment) {
        try {
            av.a("copy_label", d.a().getResources().getString(R.string.aul, in.a(comment.getUser())) + comment.getText(), d.a(), PrivacyCert.Builder.with("bpea-221").usage("Long press the comment content to provide copy function. ").tag("longPressToCopyComment").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } catch (Exception unused) {
        }
    }

    public static String d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("UTF8"));
            byte[] digest = instance.digest();
            String str2 = "";
            for (int i2 = 0; i2 < digest.length; i2++) {
                str2 = str2 + Integer.toHexString((digest[i2] & 255) | -256).substring(6);
            }
            return str2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.j.q
    public final void b(Comment comment) {
        b((com.ss.android.ugc.aweme.emoji.g.a) null);
        if (!this.u) {
            this.f71467a.setText("");
        }
        if (comment == null || !comment.isStoryEmojiComment()) {
            g();
        }
        a aVar = this.f71472f;
        if (aVar != null) {
            MentionEditText mentionEditText = this.f71467a;
            Comment n2 = this.f71469c.n();
            if (comment != null && !TextUtils.isEmpty(mentionEditText.getText())) {
                aVar.f71517a.put(comment.getFakeId(), mentionEditText.getText());
                if (n2 != null) {
                    aVar.f71518b.put(comment.getFakeId(), n2);
                }
            }
        }
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar != null) {
            bVar.f(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void c(String str) {
        if (this.f71469c.m() != null) {
            Aweme m2 = this.f71469c.m();
            String str2 = this.f71475i;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", str).a("group_id", m2.getAid()).a("author_id", m2.getAuthorUid());
            if (com.ss.android.ugc.aweme.metrics.ac.a(str2)) {
                a2.a("log_pb", ac.a.f91473a.a(m2.getRequestId()));
                r.b("search_comment_at", com.ss.android.ugc.aweme.metrics.ac.a(a2.f66730a));
                return;
            }
            r.a("search_comment_at", a2.f66730a);
        }
    }

    public final void f(String str) {
        GiftViewModel giftViewModel = this.s;
        if (giftViewModel != null && giftViewModel.b().getValue() != null) {
            r.a("video_gift_send_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", str).a("author_id", s()).a("group_id", r()).a("enter_from", this.f71475i).a("current_balance", this.s.d().getValue()).f66730a);
        }
    }

    public final void b(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        if (this.f71477k != aVar) {
            this.f71477k = aVar;
            Iterator<Object> it = this.L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.j.q
    public final void c(Comment comment) {
        if (this.f71469c != null) {
            if (comment != null) {
                com.ss.android.ugc.aweme.comment.n.a a2 = com.ss.android.ugc.aweme.comment.n.a.a();
                Comment b2 = a2.b(comment.getCid());
                if (b2 != null) {
                    comment.setText(com.ss.android.ugc.aweme.comment.util.f.c(b2));
                    comment.setTextExtra(b2.getTextExtra());
                }
                List<Comment> replyComments = comment.getReplyComments();
                if (!com.bytedance.common.utility.collection.b.a((Collection) replyComments)) {
                    for (Comment comment2 : replyComments) {
                        Comment b3 = a2.b(comment2.getCid());
                        if (b3 != null) {
                            comment2.setText(com.ss.android.ugc.aweme.comment.util.f.c(b3));
                            comment2.setTextExtra(b3.getTextExtra());
                        }
                    }
                }
            }
            this.f71469c.e(comment);
            com.ss.android.ugc.aweme.discover.hitrank.d.f81205b.a(this.f71469c.m(), 2);
        }
        if (comment != null) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.g(comment.getLabelInfo(), comment.getAwemeId()));
        }
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog(UGCMonitor.EVENT_COMMENT, new k(this), new l(this));
        if (this.f71468b.getActivity() != null) {
            ae.f115954a.showRemindUserCompleteProfileDialog(this.f71468b.getActivity(), this.f71475i, UGCMonitor.EVENT_COMMENT, new e(this));
        }
        a aVar = this.f71472f;
        if (aVar != null) {
            aVar.a(comment);
        }
        SpecActServiceImpl.i().b("post_comment");
    }

    public final Bundle a(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("hint", charSequence);
        bundle.putInt("maxLength", o());
        bundle.putBoolean("showAt", true);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.b
    public final void b(String str) {
        com.ss.android.ugc.aweme.comment.services.b bVar = this.f71469c;
        if (bVar != null) {
            bVar.b(str);
        }
    }

    public final void b(boolean z2) {
        this.n = z2;
        if (z2) {
            this.F.setVisibility(0);
            this.f71467a.setVisibility(8);
            View view = this.D;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.E;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            r.a("tns_ags_float_comment_ban", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            return;
        }
        this.F.setVisibility(8);
        this.f71467a.setVisibility(0);
        View view3 = this.D;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.E;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    public static void a(MentionEditText mentionEditText, int i2) {
        if (mentionEditText != null && !com.bytedance.common.utility.collection.b.a((Collection) mentionEditText.getTextExtraStructList())) {
            mentionEditText.setMentionTextColor(mentionEditText.getResources().getColor(i2));
            mentionEditText.a();
        }
    }

    public b(Fragment fragment, int i2, com.ss.android.ugc.aweme.comment.services.b bVar) {
        if (fragment != null) {
            this.f71468b = fragment;
            this.f71469c = bVar;
            n nVar = new n();
            this.f71471e = nVar;
            nVar.a_(this);
            this.z = i2;
            this.v = this.f71468b.getResources().getString(R.string.ajp);
            this.H = new a();
            if (this.f71468b instanceof k) {
                this.f71472f = new a(this, (byte) 0);
            }
            this.s = (GiftViewModel) androidx.lifecycle.ae.a(fragment.getActivity(), (ad.b) null).a(GiftViewModel.class);
            if (v() != null) {
                this.s.f71916h = v();
                return;
            }
            return;
        }
        throw new RuntimeException("Empty fragment/service!");
    }

    private static void a(Comment comment, String str, String str2) {
        String cid;
        String str3;
        String str4;
        if (comment.getCommentType() == 2) {
            cid = comment.getReplyId();
        } else {
            cid = comment.getCid();
        }
        if (!TextUtils.isEmpty(comment.getReplyToReplyCommentId()) && !TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) {
            str3 = "reply_to_reply";
        } else if (TextUtils.isEmpty(comment.getReplyId()) || TextUtils.equals(comment.getReplyId(), "0")) {
            str3 = "original";
        } else {
            str3 = "reply";
        }
        if (comment.getAliasAweme() != null) {
            str4 = comment.getAliasAweme().getAuthorUid();
        } else {
            str4 = "";
        }
        com.ss.android.ugc.aweme.comment.m.b.a(str2, comment.getAwemeId(), comment.getCid(), comment.getUser().getUid(), cid, -1, -1, str3, str, null, !TextUtils.equals(str4, com.ss.android.ugc.aweme.account.b.g().getCurUserId()) ? 1 : 0);
    }

    public final a.d a(final com.ss.android.ugc.aweme.comment.g.b bVar, String str, Comment comment) {
        if (comment == null) {
            return null;
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.fcr))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_flag).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(43993);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.c();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.cam))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_arrow_turn_up_right).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(43994);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.a();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.b5g))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_trash_bin).b(1).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(43995);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.b();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.aui))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_doc_on_doc).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(43996);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.d();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.amo))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_globe).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(43997);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.f();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.am7))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_globe).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(43998);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.g();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.alf))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_pin).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43999);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.h();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.amv))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_pin_fill).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(44000);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.i();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.am6))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_video).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(44001);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.a(CommentVideoModel.Type.COMMENT);
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.ak8))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_pen_on_paper).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(44002);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.j();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.bsf)) || TextUtils.equals(str, this.f71468b.getString(R.string.bsg))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_bookmark).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(44003);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.k();
                }
            });
        }
        if (TextUtils.equals(str, this.f71468b.getString(R.string.bsi))) {
            return (a.d) ((a.d) new a.d().a(str)).c(R.raw.icon_bookmark_fill).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.b.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(44004);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.c();
                    bVar.l();
                }
            });
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.bz.a
    public final void b(String str, CharSequence charSequence, String str2, int i2, LogPbBean logPbBean) {
        if (TextUtils.equals(str, "recommend") || TextUtils.equals(str, "search")) {
            a(true, str, charSequence, str2, i2, logPbBean);
        }
    }

    private void a(boolean z2, String str, CharSequence charSequence, String str2, int i2, LogPbBean logPbBean) {
        String str3;
        String str4;
        String str5 = "";
        if (charSequence != null) {
            str3 = charSequence.toString();
        } else {
            str3 = str5;
        }
        Aweme m2 = this.f71469c.m();
        if (m2 != null) {
            str4 = m2.getAuthorUid();
            str5 = m2.getAid();
        } else {
            str4 = str5;
        }
        if (z2) {
            com.ss.android.ugc.aweme.comment.m.c.b(str, str5, str4, str3, str2, i2, logPbBean);
        } else {
            com.ss.android.ugc.aweme.comment.m.c.a(str, str5, str4, str3, str2, i2, logPbBean);
        }
    }

    public final void a(MentionEditText mentionEditText, View view, View view2, View view3, TextView textView, String str, String str2) {
        a(mentionEditText, view, view2, view3, textView, str, str2, false);
    }
}
