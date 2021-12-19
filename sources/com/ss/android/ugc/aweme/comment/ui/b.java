package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.f.d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.c.a.p;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.e.a;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.bx;
import com.ss.android.ugc.aweme.comment.util.s;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.u.u;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.utils.z;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class b extends com.bytedance.ies.uikit.a.b implements a, com.ss.android.ugc.aweme.comment.services.b, i, j {
    private static String D;
    private static String E;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean F;

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f72548a;

    /* renamed from: b  reason: collision with root package name */
    TuxTextView f72549b;

    /* renamed from: c  reason: collision with root package name */
    View f72550c;

    /* renamed from: d  reason: collision with root package name */
    MentionEditText f72551d;

    /* renamed from: e  reason: collision with root package name */
    TuxIconView f72552e;

    /* renamed from: j  reason: collision with root package name */
    TuxIconView f72553j;

    /* renamed from: k  reason: collision with root package name */
    TuxIconView f72554k;

    /* renamed from: l  reason: collision with root package name */
    FadeImageView f72555l;

    /* renamed from: m  reason: collision with root package name */
    TuxTextView f72556m;
    ConstraintLayout n;
    View o;
    View p;
    AppCompatCheckBox q;
    public u r;
    public com.ss.android.ugc.aweme.comment.services.a s;
    com.ss.android.ugc.aweme.comment.b t;
    public c u;
    public String v;
    String w = "";
    private View x;
    private a y;
    private IVideoGiftService z;

    static {
        Covode.recordClassIndex(44706);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new g(b.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(5, new g(b.class, "onCommentEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(54, new g(b.class, "onEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(150, new g(b.class, "onAfterLoginInEvent", com.ss.android.ugc.aweme.al.f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void k() {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Comment n() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public void onEvent(com.ss.android.ugc.aweme.forward.a.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final int p() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f72551d.setText(str);
            this.f72551d.setEnabled(false);
            this.C = true;
            this.f72552e.setVisibility(8);
            this.f72554k.setVisibility(8);
            this.f72556m.setVisibility(0);
            D = str;
            E = str2;
            Aweme l2 = l();
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.P(l2)) {
                this.f72556m.setOnClickListener(null);
                return;
            }
            this.f72556m.setOnClickListener(new f(this, str2, l2, l2.getCommerceVideoAuthInfo()));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(boolean z2) {
        if (ab_()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            if (z2) {
                if (this.f72548a.getVisibility() == 8 && com.ss.android.ugc.aweme.story.d.a.m(l())) {
                    com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
                    if (aVar == null || !aVar.j()) {
                        this.f72548a.setVisibility(0);
                        o.a(this.p, 0);
                        marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.ds);
                        if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                            marginLayoutParams.height += com.ss.android.ugc.aweme.adaptation.c.f66195e;
                        }
                        this.o.setLayoutParams(marginLayoutParams);
                    }
                }
            } else if (this.f72548a.getVisibility() == 0) {
                this.f72548a.setVisibility(8);
                this.p.setVisibility(8);
                marginLayoutParams.height = 1;
                this.o.setLayoutParams(marginLayoutParams);
                g();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str) {
        this.o.setVisibility(4);
        a(8);
        c cVar = this.u;
        if (cVar != null) {
            cVar.c();
        }
        a(false, false, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str, int i2) {
        String aid;
        Aweme l2 = l();
        String str2 = this.v;
        String str3 = "";
        if (l2 == null) {
            aid = str3;
        } else {
            aid = l2.getAid();
            str3 = l2.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.m.b.a(str, i2, str2, aid, str3);
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void c() {
        E = null;
        D = null;
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void g() {
        ab_();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Aweme m() {
        return l();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f35364f = false;
    }

    @Override // com.bytedance.ies.uikit.a.b
    public final boolean ab_() {
        if (!super.ab_() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Aweme l() {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final String o() {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar != null) {
            return aVar.i();
        }
        return "";
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.s = null;
        EventBus.a().b(this);
    }

    private bj r() {
        if (getActivity() == null) {
            return null;
        }
        return (bj) getActivity().getSupportFragmentManager().a("comment_page");
    }

    private String s() {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar == null || aVar.h() == null) {
            return "";
        }
        return this.s.h().getAid();
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void d() {
        this.A = true;
        View view = this.o;
        if (view != null) {
            view.setVisibility(4);
            this.o.setEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void e() {
        int i2 = 0;
        this.A = false;
        View view = this.o;
        if (view != null) {
            if (this.B) {
                i2 = 4;
            }
            view.setVisibility(i2);
            this.o.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void i() {
        Fragment a2;
        androidx.fragment.app.i fragmentManager = getFragmentManager();
        if (fragmentManager != null && (a2 = fragmentManager.a("comment_input_tag")) != null) {
            fragmentManager.a().a(a2).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void h() {
        View view = this.x;
        if (view != null && this.f72551d != null && view.getVisibility() == 0) {
            this.x.setVisibility(8);
            this.f72551d.setEnabled(true);
            this.f72551d.setFocusable(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void j() {
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        if (this.F != a2 && this.t != null) {
            this.F = a2;
            if (a2) {
                this.y.a();
                this.f72549b.setVisibility(0);
            }
            this.t.b(this.F);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.F) {
            this.y.a();
            this.f72549b.setVisibility(0);
        }
        b();
        a(D, E);
        a(9);
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void b() {
        if (ab_()) {
            boolean z2 = true;
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                this.f72551d.setFocusable(false);
            } else {
                this.f72551d.setFocusable(true);
                this.f72551d.setFocusableInTouchMode(true);
                this.f72551d.requestFocus();
            }
            Aweme l2 = l();
            if (l2 == null || !l2.isProhibited()) {
                this.f72551d.setEnabled(true);
                com.ss.android.ugc.aweme.comment.b bVar = this.t;
                if (bVar != null) {
                    bVar.a();
                    Editable text = this.f72551d.getText();
                    boolean a2 = a(l2);
                    if (text == null || text.length() <= 0) {
                        z2 = false;
                    }
                    a(a2, false, z2);
                    return;
                }
                return;
            }
            this.f72551d.setEnabled(false);
            this.f72551d.setHint(R.string.alc);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final boolean q() {
        Aweme h2;
        if (!ab_() || getActivity() == null || !com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        final Aweme l2 = l();
        if (com.ss.android.ugc.aweme.login.b.a.a(l2)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(com.ss.android.ugc.aweme.login.b.a.a(l2, R.string.har)).a();
            return false;
        }
        if (l2 != null) {
            if (!l2.isCanPlay()) {
                if (l2.isImage()) {
                    new com.bytedance.tux.g.b(this).e(R.string.cjs).b();
                } else {
                    new com.bytedance.tux.g.b(this).e(R.string.har).b();
                }
                return false;
            } else if (l2.getStatus() != null && l2.getStatus().isDelete()) {
                new com.bytedance.tux.g.b(this).e(R.string.h_6).b();
                return false;
            } else if (l2.getStatus() != null && !l2.getStatus().isAllowComment()) {
                new com.bytedance.tux.g.b(this).e(R.string.a9_).b();
                return false;
            }
        }
        if (!z.c(l2) || z.e(l2) || (l2.getAuthor() != null && TextUtils.equals(l2.getAuthor().getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUser().getUid()))) {
            com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
            if (aVar != null && aVar.h() != null && (h2 = this.s.h()) != null && h2.getStatus() != null && h2.getStatus().getPrivateStatus() == 1 && h2.getAuthor() != null && TextUtils.equals(h2.getAuthor().getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUser().getUid())) {
                if (l2 != null) {
                    this.r.a(l2, 0);
                    new a.C0731a(getContext()).b(R.string.evi).b(R.string.a9e, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.comment.ui.b.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(44709);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(l2.getAid()));
                        }
                    }, false).a(R.string.cui, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.comment.ui.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(44708);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            b.this.r.a(l2.getAid(), 1);
                            r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(l2.getAid()));
                        }
                    }, false).a().b();
                }
                return false;
            } else if (l2 == null || !l2.isAwemeFromXiGua()) {
                return true;
            } else {
                return false;
            }
        } else {
            new com.bytedance.tux.g.b(this).e(R.string.c21).b();
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a() {
        if (this.f72551d != null && !this.C) {
            g();
            Aweme l2 = l();
            if (l2 == null || !l2.isProhibited()) {
                boolean z2 = true;
                this.f72551d.setEnabled(true);
                com.ss.android.ugc.aweme.comment.b bVar = this.t;
                if (bVar != null) {
                    bVar.a();
                    Editable text = this.f72551d.getText();
                    boolean a2 = a(l2);
                    if (text == null || text.length() <= 0) {
                        z2 = false;
                    }
                    a(a2, z2, false);
                    this.t.k();
                    return;
                }
                return;
            }
            this.f72551d.setEnabled(false);
            this.f72551d.setHint(R.string.alc);
        }
    }

    @org.greenrobot.eventbus.r
    public void onAfterLoginInEvent(com.ss.android.ugc.aweme.al.f fVar) {
        ViewGroup viewGroup = this.f72548a;
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
        ViewGroup viewGroup = this.f72548a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(boolean z2) {
        a(!z2);
    }

    private void a(int i2) {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar != null) {
            aVar.a(new ag(i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void d(boolean z2) {
        View view = this.o;
        if (view != null) {
            view.post(new h(this, z2));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(boolean z2) {
        a(!z2);
    }

    private static l.a a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107225d != l.a.UNKNOWN && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107225d;
        }
        l.a c2 = l.c(context);
        com.ss.android.ugc.aweme.lancet.j.f107225d = c2;
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(String str) {
        String aid;
        Aweme l2 = l();
        String str2 = this.v;
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
    public final void f(boolean z2) {
        if (z2) {
            ForwardStatisticsServiceImpl.b().a(o(), l(), "detail", "click_original");
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void g(Comment comment) {
        a();
        if (comment != null && comment.getFakeGiftId() != 0) {
            a(true, comment, 0);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t = new com.ss.android.ugc.aweme.comment.b(this, hashCode(), this);
        this.z = VideoGiftService.l();
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void a(float f2) {
        int i2;
        View view = this.o;
        if (view != null) {
            view.setAlpha(f2);
            View view2 = this.o;
            boolean z2 = false;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view2.setVisibility(i2);
            if (f2 > 0.0f) {
                z2 = true;
            }
            a(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void c(boolean z2) {
        int i2;
        View view = this.x;
        if (view != null && this.f72551d != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            this.f72551d.setEnabled(!z2);
            this.f72551d.setFocusable(!z2);
            Aweme l2 = l();
            if (l2 != null && this.x.getVisibility() == 0) {
                this.x.setOnClickListener(new i(this, l2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(boolean z2) {
        MentionEditText mentionEditText;
        this.o.setVisibility(0);
        a(false, false, !TextUtils.isEmpty(this.f72551d.getText()));
        a(9);
        c cVar = this.u;
        if (cVar != null) {
            cVar.d();
        }
        if (this.t != null && (mentionEditText = this.f72551d) != null) {
            com.ss.android.ugc.aweme.comment.b.a(mentionEditText, (int) R.color.a9);
        }
    }

    @org.greenrobot.eventbus.r
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        com.ss.android.ugc.aweme.comment.b bVar;
        if (cVar.f71746a == 8) {
            Object obj = cVar.f71747b;
            Aweme l2 = l();
            if (l2 != null && l2.getAid() != null && l2.getAid().equals(obj) && (bVar = this.t) != null) {
                bVar.a();
                a(a(l2), false, false);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onDislikeAwemeEvent(f fVar) {
        float f2;
        if (getActivity() != null && fVar.f93479e == getActivity().hashCode() && fVar.f93476b == 2) {
            if (fVar.f93475a) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            ViewGroup viewGroup = this.f72548a;
            d.a(viewGroup, viewGroup.getAlpha(), f2);
            View view = this.p;
            d.a(view, view.getAlpha(), f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(Comment comment) {
        if (comment == null || p.a(comment.getGiftEffectPath()) || comment.getFakeGiftId() == 0) {
            bj r2 = r();
            if (r2 != null) {
                r2.a(comment);
            }
            if (com.ss.android.ugc.aweme.experiment.f.c()) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.a(1, comment));
                return;
            }
            return;
        }
        bx.a.a(comment).show(getActivity().getSupportFragmentManager().a(), "GiftAnimationFragment");
    }

    @Override // com.ss.android.ugc.aweme.comment.e.a
    public final void b(boolean z2) {
        float f2;
        View view = this.o;
        if (view == null) {
            this.B = z2;
            return;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
        if (z2) {
            this.o.setVisibility(4);
        }
        this.o.post(new g(this, z2));
    }

    private static boolean a(Aweme aweme) {
        if (aweme == null || aweme.isProhibited() || aweme.getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        int commentSetting = author.getCommentSetting();
        int commentSetting2 = aweme.getCommentSetting();
        if (commentSetting == com.ss.android.ugc.aweme.comment.b.a.f71516d || commentSetting2 == com.ss.android.ugc.aweme.comment.b.a.f71516d) {
            return true;
        }
        if (AccountService.a().e().isMe(author.getUid())) {
            if (AccountService.a().e().getCurUser().getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d || aweme.getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d) {
                return true;
            }
            return false;
        } else if (commentSetting == com.ss.android.ugc.aweme.comment.b.a.f71514b && !z.e(aweme)) {
            return true;
        } else {
            if (commentSetting != com.ss.android.ugc.aweme.comment.b.a.f71515c || z.f(aweme)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(Comment comment) {
        if (ab_() && getActivity() != null) {
            String awemeId = comment.getAwemeId();
            if (TextUtils.isEmpty(awemeId)) {
                awemeId = s();
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.aln).a();
            a();
            AwemeService.b().c(awemeId);
            Aweme l2 = l();
            if (l2 != null && l2.isAd() && TextUtils.equals(awemeId, l2.getAid())) {
                AdCommentDependImpl.b().a(getContext(), l2, "comment_sign");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", UGCMonitor.EVENT_COMMENT, l2.getAwemeRawAd()).b("refer", "comment_sign").a("anchor_id", com.ss.android.ugc.aweme.comment.util.a.b(l2)).a("room_id", com.ss.android.ugc.aweme.comment.util.a.a(l2)).c();
            }
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            String awemeId2 = comment.getAwemeId();
            if (awemeId2 == null) {
                awemeId2 = s();
            }
            if (!(textExtra == null || this.t == null)) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    Iterator<User> it = this.t.f71470d.iterator();
                    while (it.hasNext()) {
                        User next = it.next();
                        if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                            int atType = next.getAtType();
                            if (atType == 3) {
                                getContext();
                                r.a("comment_at", "follow", awemeId2, next.getUid());
                            } else if (atType == 1) {
                                getContext();
                                r.a("comment_at", "search", awemeId2, next.getUid());
                            } else if (atType == 4) {
                                getContext();
                                r.a("comment_at", "recent", awemeId2, next.getUid());
                            }
                        }
                    }
                }
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(3, new Object[]{awemeId, comment.clone()}));
            bj r2 = r();
            if (r2 != null) {
                comment.setIgnoreToast(true);
                r2.a(comment, false);
            }
            if (comment.getGift() != null) {
                a(true, comment, 0);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.f72549b.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
        TuxTextView tuxTextView = this.f72549b;
        String str2 = getString(R.string.aju) + " ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + getString(R.string.hch));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.ugc.aweme.comment.ui.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(44707);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                com.ss.android.ugc.aweme.compliance.api.a.c().a(b.this.getContext(), "float_comment");
            }
        }, str2.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.a9)), str2.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str2.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        this.f72549b.setMovementMethod(new LinkMovementMethod());
        com.ss.android.ugc.aweme.comment.b bVar = this.t;
        if (bVar != null) {
            MentionEditText mentionEditText = this.f72551d;
            TuxIconView tuxIconView = this.f72552e;
            TuxIconView tuxIconView2 = this.f72554k;
            TuxIconView tuxIconView3 = this.f72553j;
            TuxTextView tuxTextView2 = this.f72549b;
            Aweme l2 = l();
            if (l2 != null) {
                str = l2.getAid();
            } else {
                str = "";
            }
            bVar.a(mentionEditText, tuxIconView, tuxIconView2, tuxIconView3, tuxTextView2, str, this.v);
        }
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        this.F = a2;
        this.t.b(a2);
        if (this.F) {
            this.y.a();
            this.f72549b.setVisibility(0);
        }
        this.f72551d.setCursorVisible(false);
        this.q.setVisibility(8);
        this.f72556m.setVisibility(8);
        this.f72555l.setOnClickListener(new c(this));
        this.f72548a.setBackgroundResource(R.drawable.b1t);
        MentionEditText mentionEditText2 = this.f72551d;
        mentionEditText2.setTextColor(mentionEditText2.getResources().getColor(R.color.a_));
        MentionEditText mentionEditText3 = this.f72551d;
        mentionEditText3.setHintTextColor(mentionEditText3.getResources().getColor(R.color.ln));
        this.f72551d.setTextAlignment(5);
        com.ss.android.ugc.aweme.adaptation.c.a(this.f72548a, this.p, this.x);
        a(a(l()), false, false);
        if (this.A) {
            d();
        }
        b(this.B);
        e activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) ae.a(activity, (ad.b) null).a(SlideData.class);
            if (slideData.f68146a == null) {
                slideData.f68146a = new t<>();
            }
            slideData.f68146a.observe(this, new d(this));
            if (slideData.f68147b == null) {
                slideData.f68147b = new t<>();
            }
            slideData.f68147b.observe(this, new e(this));
        }
        if (!com.ss.android.ugc.aweme.story.d.a.m(l())) {
            a(false);
        }
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar != null && aVar.j()) {
            a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(Exception exc, int i2, Comment comment) {
        int i3;
        boolean unused = com.ss.android.ugc.aweme.comment.api.c.a(this.f72551d.getContext(), exc, R.string.akk, false, false);
        bj r2 = r();
        if (r2 != null) {
            comment.setIgnoreToast(true);
            r2.a(exc, i2, comment);
        } else if (comment == null) {
            return;
        }
        if (comment.getFakeGiftId() != 0) {
            try {
                i3 = ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode();
            } catch (Exception unused2) {
                i3 = 0;
            }
            a(false, comment, i3);
        }
    }

    private void a(boolean z2, boolean z3, boolean z4) {
        com.ss.android.ugc.aweme.comment.b bVar;
        this.f72552e.setTintColorRes(R.attr.ac);
        this.f72554k.setTintColorRes(R.attr.ac);
        if (this.f72553j != null) {
            if (this.z.a(l())) {
                this.f72553j.setTintColorRes(R.attr.ac);
                this.f72553j.setVisibility(0);
            } else {
                this.f72553j.setVisibility(8);
            }
        }
        if (z2) {
            this.f72552e.setVisibility(8);
            this.f72554k.setVisibility(8);
            this.y.a(false, false, false);
            return;
        }
        this.f72552e.setVisibility(0);
        this.f72554k.setVisibility(0);
        this.y.a(z4, z3, false);
        if (!(z4 || this.f72551d == null || (bVar = this.t) == null)) {
            bVar.a();
        }
        MentionEditText mentionEditText = this.f72551d;
        if (mentionEditText != null) {
            mentionEditText.setFocusable(true);
            this.f72551d.setFocusableInTouchMode(true);
            this.f72551d.requestFocus();
        }
    }

    private void a(boolean z2, Comment comment, int i2) {
        long id;
        if (l() != null && comment != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.v).a("group_id", ac.e(l())).a("author_id", ac.a(l())).a("is_success", z2 ? 1 : 0);
            if (comment.getGift() == null) {
                id = comment.getFakeGiftId();
            } else {
                id = comment.getGift().getId();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("gift_id", id).a("is_follow", s.b(l())).a("is_like", s.a(l())).a("is_comment", !p.a(comment.getText()) ? 1 : 0);
            if (i2 != 0) {
                a3.a("error_code", i2);
                a3.a("newtork_condition", a(getContext()));
            }
            if (!this.w.isEmpty()) {
                a3.a("enter_method", this.w);
            } else if (!this.t.o.isEmpty()) {
                a3.a("enter_method", this.t.o);
            } else {
                a3.a("enter_method", "send_button");
            }
            this.w = "";
            r.a("send_gift", a3.f66730a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.b.c.a(getActivity(), R.layout.f366if, viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n.a(getActivity()), -2);
            layoutParams.addRule(12);
            a2.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(n.a(getActivity()), -2);
            layoutParams2.gravity = 80;
            a2.setLayoutParams(layoutParams2);
        } else {
            a2.setLayoutParams(new ViewGroup.LayoutParams(n.a(getActivity()), -2));
        }
        EventBus.a(EventBus.a(), this);
        this.f72548a = (ViewGroup) a2.findViewById(R.id.ash);
        this.f72549b = (TuxTextView) a2.findViewById(R.id.a9w);
        this.f72550c = a2.findViewById(R.id.c5j);
        this.f72551d = (MentionEditText) a2.findViewById(R.id.a_7);
        this.f72552e = (TuxIconView) a2.findViewById(R.id.btt);
        this.f72553j = (TuxIconView) a2.findViewById(R.id.bx_);
        this.f72554k = (TuxIconView) a2.findViewById(R.id.bwl);
        this.f72555l = (FadeImageView) a2.findViewById(R.id.aa2);
        this.f72556m = (TuxTextView) a2.findViewById(R.id.aa1);
        this.n = (ConstraintLayout) a2.findViewById(R.id.a_6);
        this.y = new a(this.n);
        this.x = a2.findViewById(R.id.fa);
        this.o = a2.findViewById(R.id.ad7);
        this.p = a2.findViewById(R.id.eh7);
        this.q = (AppCompatCheckBox) a2.findViewById(R.id.a35);
        com.ss.android.ugc.aweme.feed.u.p pVar = new com.ss.android.ugc.aweme.feed.u.p(getActivity());
        this.r = pVar;
        pVar.a(new com.ss.android.ugc.aweme.feed.u.o());
        this.y.a(false, 0);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(int i2, int i3, String str, String str2, boolean z2) {
        com.ss.android.ugc.aweme.comment.services.a aVar = this.s;
        if (aVar != null) {
            aVar.a(i3);
        }
        if (TextUtils.equals(str2, "button_send")) {
            a(57);
        } else {
            a(11);
        }
        a(false, true, false);
    }
}
