package com.ss.android.ugc.aweme.story.interaction.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.b;
import com.bytedance.ies.powerlist.page.config.c;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.story.view.ReactionBubbleList;
import h.c.d;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public String f137870a = "";

    /* renamed from: b  reason: collision with root package name */
    public final b<b> f137871b;

    /* renamed from: c  reason: collision with root package name */
    public final ReactionBubbleList f137872c;

    static {
        Covode.recordClassIndex(90185);
    }

    public abstract void a(d<? super f<b>> dVar);

    public abstract void a(d<? super f<b>> dVar, b bVar);

    public abstract boolean a();

    public abstract void b();

    public void c() {
        this.f137870a = "";
        this.f137872c.q();
    }

    public a(ReactionBubbleList reactionBubbleList) {
        l.d(reactionBubbleList, "");
        this.f137872c = reactionBubbleList;
        c cVar = new c();
        cVar.f34356a = 10;
        cVar.f34357b = false;
        AnonymousClass1 r2 = new b<b>(this, cVar) {
            /* class com.ss.android.ugc.aweme.story.interaction.c.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f137873a;

            static {
                Covode.recordClassIndex(90186);
            }

            @Override // com.bytedance.ies.powerlist.page.config.d
            public final void a(d<? super f<b>> dVar) {
                l.d(dVar, "");
                this.f137873a.a(dVar);
            }

            {
                this.f137873a = r1;
            }

            @Override // com.bytedance.ies.powerlist.page.config.d
            public final /* synthetic */ void b(d dVar, Object obj) {
                b bVar = (b) obj;
                l.d(dVar, "");
                l.d(bVar, "");
                this.f137873a.a(dVar, bVar);
            }
        };
        this.f137871b = r2;
        reactionBubbleList.a(r2);
        b();
    }

    public void a(Aweme aweme) {
        l.d(aweme, "");
        Story story = aweme.getStory();
        if (story == null) {
            c();
        } else if (story.isOfficial() || story.isPublishing() || aweme.isProhibited()) {
            c();
        } else {
            String aid = aweme.getAid();
            l.b(aid, "");
            this.f137870a = aid;
            if (this.f137872c.getState().b() > 0) {
                this.f137872c.setVisibility(0);
            }
            this.f137871b.f34367c.e();
        }
    }
}
