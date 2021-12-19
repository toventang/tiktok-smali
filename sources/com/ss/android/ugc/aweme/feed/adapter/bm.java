package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.tooltip.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.api.FeedBubbleAckApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.y;
import f.a.b.a;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bm implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91714a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f91715b;

    static {
        Covode.recordClassIndex(57742);
    }

    bm(VideoViewCell videoViewCell, Aweme aweme) {
        this.f91714a = videoViewCell;
        this.f91715b = aweme;
    }

    @Override // com.bytedance.tux.tooltip.b.a
    public final void a() {
        VideoViewCell videoViewCell = this.f91714a;
        Aweme aweme = this.f91715b;
        if (aweme.getBubbleInfo() != null) {
            int biz = aweme.getBubbleInfo().getBiz();
            int type = aweme.getBubbleInfo().getType();
            if (biz != 0 && type != 0 && type != 3) {
                y.f124428a = true;
                y.f124429b = true;
                StringBuilder sb = new StringBuilder("promote_guide_shown_history_");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                d.c().a(sb.append(g2.getCurUserId()).toString(), System.currentTimeMillis());
                a aVar = videoViewCell.aJ;
                Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(FeedBubbleAckApi.class);
                l.b(a2, "");
                f.a.b a3 = ((FeedBubbleAckApi) a2).sendBubbleAck(biz, type).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                VideoViewCell.AnonymousClass4 r0 = new f.a.g.a() {
                    /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(57638);
                    }

                    @Override // f.a.d
                    public final void onComplete() {
                    }

                    @Override // f.a.d
                    public final void onError(Throwable th) {
                        th.getMessage();
                    }
                };
                a3.a(r0);
                aVar.a(r0);
                l.d(aweme, "");
                r.a("Promote_bubble_show", y.b(aweme).f66730a);
            }
        }
    }
}
