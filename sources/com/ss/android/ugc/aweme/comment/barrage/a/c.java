package com.ss.android.ugc.aweme.comment.barrage.a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f71542a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(44019);
    }

    public static boolean a(Aweme aweme) {
        if (!aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            l.b();
        }
        l.b(awemeRawAd, "");
        if (awemeRawAd.isRightStyle()) {
            return true;
        }
        return false;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentRichTagView f71543a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f71544b;

        static {
            Covode.recordClassIndex(44020);
        }

        public a(CommentRichTagView commentRichTagView, Aweme aweme) {
            this.f71543a = commentRichTagView;
            this.f71544b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean E = b.E(this.f71544b);
            if (b.s(this.f71544b) || !E) {
                IAdCommentDepend b2 = AdCommentDependImpl.b();
                Context context = this.f71543a.getContext();
                l.b(context, "");
                b2.a(context, this.f71544b, 1, new com.ss.android.ugc.aweme.commercialize.j.b() {
                    /* class com.ss.android.ugc.aweme.comment.barrage.a.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(44021);
                    }
                });
                return;
            }
            new com.bytedance.tux.g.b(this.f71543a).e(R.string.of).b();
        }
    }
}
