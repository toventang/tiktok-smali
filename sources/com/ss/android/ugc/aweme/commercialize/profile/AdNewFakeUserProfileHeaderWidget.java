package com.ss.android.ugc.aweme.commercialize.profile;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Objects;

public final class AdNewFakeUserProfileHeaderWidget extends AbsAdProfileWidget implements au {

    /* renamed from: k  reason: collision with root package name */
    public static final a f75112k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final h f75113j = i.a((h.f.a.a) new g(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f75114l = i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f75115m = i.a((h.f.a.a) new f(this));
    private final h n = i.a((h.f.a.a) new e(this));

    static {
        Covode.recordClassIndex(46324);
    }

    public final TextView e() {
        return (TextView) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46325);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.bytedance.lighten.a.a.a a(User user) {
            UrlModel avatarLarger;
            if (user == null) {
                return null;
            }
            if (user.getAvatarMedium() != null) {
                avatarLarger = user.getAvatarMedium();
            } else if (user.getAvatarThumb() != null) {
                avatarLarger = user.getAvatarThumb();
            } else {
                if (user.getAvatarLarger() != null) {
                    avatarLarger = user.getAvatarLarger();
                }
                return null;
            }
            if (avatarLarger != null) {
                return new com.bytedance.lighten.a.a.a(avatarLarger.getUrlList());
            }
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<SmartAvatarImageView> {
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget this$0;

        static {
            Covode.recordClassIndex(46329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.this$0.a(R.id.d_e);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget this$0;

        static {
            Covode.recordClassIndex(46330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.d_i);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget this$0;

        static {
            Covode.recordClassIndex(46331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.db_);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget this$0;

        static {
            Covode.recordClassIndex(46332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.a(R.id.cgk);
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f75116a;

        static {
            Covode.recordClassIndex(46326);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            TextView e2 = this.f75116a.e();
            if (!(e2 == null || (viewTreeObserver = e2.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = this.f75116a;
            LinearLayout linearLayout = (LinearLayout) adNewFakeUserProfileHeaderWidget.f75113j.getValue();
            if (linearLayout != null) {
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c(adNewFakeUserProfileHeaderWidget, linearLayout));
                TextView e3 = adNewFakeUserProfileHeaderWidget.e();
                if (e3 == null || e3.getLineCount() <= 3) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            this.f75116a = adNewFakeUserProfileHeaderWidget;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f75117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f75118b;

        static {
            Covode.recordClassIndex(46327);
        }

        public final void onGlobalLayout() {
            String desc;
            this.f75118b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView e2 = this.f75117a.e();
            if (e2 != null) {
                String str = null;
                if (this.f75118b.getVisibility() == 0) {
                    int width = e2.getWidth();
                    int width2 = this.f75118b.getWidth();
                    this.f75118b.setOnClickListener(new a(e2, this));
                    TextPaint paint = e2.getPaint();
                    int lineStart = e2.getLayout().getLineStart(2);
                    int lineEnd = e2.getLayout().getLineEnd(2);
                    while (((float) width) - paint.measureText(e2.getText().subSequence(lineStart, lineEnd).toString()) < paint.measureText("...") + ((float) width2)) {
                        lineEnd--;
                    }
                    Aweme aweme = ((AbsAdProfileWidget) this.f75117a).f75063a;
                    if (!(aweme == null || (desc = aweme.getDesc()) == null)) {
                        Objects.requireNonNull(desc, "null cannot be cast to non-null type java.lang.String");
                        str = desc.substring(0, lineEnd);
                        l.b(str, "");
                    }
                    e2.setText(l.a(str, (Object) "..."));
                    return;
                }
                this.f75118b.setOnClickListener(null);
            }
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f75119a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f75120b;

            static {
                Covode.recordClassIndex(46328);
            }

            a(TextView textView, c cVar) {
                this.f75119a = textView;
                this.f75120b = cVar;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                this.f75119a.setGravity(17);
                TextView textView = this.f75119a;
                Aweme aweme = ((AbsAdProfileWidget) this.f75120b.f75117a).f75063a;
                if (aweme != null) {
                    str = aweme.getDesc();
                } else {
                    str = null;
                }
                textView.setText(str);
                l.b(view, "");
                view.setVisibility(8);
            }
        }

        c(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget, LinearLayout linearLayout) {
            this.f75117a = adNewFakeUserProfileHeaderWidget;
            this.f75118b = linearLayout;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(i iVar) {
        User user;
        String str;
        User author;
        User author2;
        ViewTreeObserver viewTreeObserver;
        String str2;
        User author3;
        l.d(iVar, "");
        super.a(iVar);
        TextView textView = (TextView) this.f75115m.getValue();
        String str3 = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
            if (aweme == null || (author3 = aweme.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author3.getNickname();
            }
            textView.setText(str2);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        com.bytedance.lighten.a.a.a a2 = a.a(user);
        if (a2 != null) {
            v a3 = r.a(a2);
            a3.E = (SmartAvatarImageView) this.f75114l.getValue();
            a3.c();
        }
        TextView e2 = e();
        if (!(e2 == null || (viewTreeObserver = e2.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new b(this));
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
            str = null;
        } else {
            str = author2.getAdAuthorDesc();
        }
        if (!TextUtils.isEmpty(str)) {
            TextView e3 = e();
            if (e3 != null) {
                Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
                if (!(aweme4 == null || (author = aweme4.getAuthor()) == null)) {
                    str3 = author.getAdAuthorDesc();
                }
                e3.setText(str3);
                return;
            }
            return;
        }
        TextView e4 = e();
        if (e4 != null) {
            Aweme aweme5 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme5 != null) {
                str3 = aweme5.getDesc();
            }
            e4.setText(str3);
        }
    }
}
