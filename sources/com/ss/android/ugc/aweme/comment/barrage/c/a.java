package com.ss.android.ugc.aweme.comment.barrage.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.b;
import com.bytedance.ies.powerlist.page.config.c;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.c.d;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public String f71567a = "";

    /* renamed from: b  reason: collision with root package name */
    public final AwemeCommentBubbleList f71568b;

    /* renamed from: c  reason: collision with root package name */
    private final b<b> f71569c;

    static {
        Covode.recordClassIndex(44036);
    }

    public abstract void a();

    public abstract void a(d<? super f<b>> dVar);

    public abstract void a(d<? super f<b>> dVar, b bVar);

    public void b() {
        this.f71567a = "";
        this.f71568b.q();
    }

    public final void c() {
        this.f71568b.q();
        this.f71569c.f34367c.e();
    }

    public a(AwemeCommentBubbleList awemeCommentBubbleList) {
        l.d(awemeCommentBubbleList, "");
        this.f71568b = awemeCommentBubbleList;
        c cVar = new c();
        cVar.f34356a = 10;
        cVar.f34357b = false;
        AnonymousClass1 r2 = new b<b>(this, cVar) {
            /* class com.ss.android.ugc.aweme.comment.barrage.c.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f71570a;

            static {
                Covode.recordClassIndex(44037);
            }

            @Override // com.bytedance.ies.powerlist.page.config.d
            public final void a(d<? super f<b>> dVar) {
                l.d(dVar, "");
                this.f71570a.a(dVar);
            }

            {
                this.f71570a = r1;
            }

            @Override // com.bytedance.ies.powerlist.page.config.d
            public final /* synthetic */ void b(d dVar, Object obj) {
                b bVar = (b) obj;
                l.d(dVar, "");
                l.d(bVar, "");
                this.f71570a.a(dVar, bVar);
            }
        };
        this.f71569c = r2;
        awemeCommentBubbleList.a(r2);
        a();
    }

    public void a(Aweme aweme) {
        l.d(aweme, "");
        String aid = aweme.getAid();
        l.b(aid, "");
        this.f71567a = aid;
        if (this.f71568b.getState().b() > 0) {
            this.f71568b.setVisibility(0);
        }
        this.f71569c.f34367c.e();
    }
}
