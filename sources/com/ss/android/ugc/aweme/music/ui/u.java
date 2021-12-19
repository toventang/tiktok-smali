package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.cc.c;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.a.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.l;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.g.a;
import com.ss.android.ugc.aweme.music.model.Music;

public final class u extends s {
    public Music I;
    private a J;

    static {
        Covode.recordClassIndex(71999);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.challenge.ui.s
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.a(false);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.challenge.ui.s
    public final void onStop() {
        super.onStop();
        if (f.j() == null) {
            b.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final /* bridge */ /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
        a((e) viewHolder);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.I = (Music) bundle.getSerializable("detail_music_data");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v = new l() {
            /* class com.ss.android.ugc.aweme.music.ui.u.AnonymousClass2 */

            static {
                Covode.recordClassIndex(72001);
            }

            @Override // com.ss.android.ugc.aweme.detail.l
            public final void b() {
                b.b("music", "list");
            }

            @Override // com.ss.android.ugc.aweme.detail.l
            public final void a() {
                b.b("music", "list");
                c.a("single_song", (com.ss.android.ugc.aweme.cc.b) null, 6);
            }

            @Override // com.ss.android.ugc.aweme.detail.l
            public final void a(boolean z) {
                b.b("music", "list", z ? 1 : 0);
            }

            @Override // com.ss.android.ugc.aweme.detail.l
            public final void a(Exception exc) {
                b.a("music", "list", com.bytedance.ies.b.a.a.a(d.a(), exc));
                c.a("single_song", com.ss.android.ugc.aweme.cc.b.FAIL, 4);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final void a(e eVar) {
        super.a(eVar);
        com.ss.android.ugc.aweme.common.a.a aVar = (com.ss.android.ugc.aweme.common.a.a) eVar;
        if (aVar != null && aVar.f76353m != null) {
            Aweme aweme = (Aweme) aVar.f76353m;
            String str = this.f70204c;
            String str2 = this.f70206e;
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            int adapterPosition = aVar.getAdapterPosition();
            if (adapterPosition >= 0) {
                adapterPosition++;
            }
            r.a("show_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").a("music_id", str).a("process_id", str2).a("group_id", aid).a("author_id", authorUid).a("order", adapterPosition).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final SmartRoute a(Aweme aweme, s.c cVar) {
        SmartRoute a2 = super.a(aweme, cVar);
        Music music = this.I;
        if (music != null) {
            a2.withParam("feed_data_music", music);
        }
        a2.withParam("feed_data_author_id", aweme.getAuthorUid());
        a2.withParam("feed_data_is_ad", aweme.isAd());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.challenge.ui.s
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass1 r1 = new a(requireActivity()) {
            /* class com.ss.android.ugc.aweme.music.ui.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72000);
            }

            @Override // com.ss.android.ugc.aweme.base.a.a
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                if (i2 == 4) {
                    b.c("music", "list");
                }
                return false;
            }
        };
        this.J = r1;
        r1.a(true);
    }
}
