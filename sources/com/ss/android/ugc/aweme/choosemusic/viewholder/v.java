package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.choosemusic.h.e.a;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.zhiliaoapp.musically.R;

public final class v extends RecyclerView.ViewHolder implements a {

    /* renamed from: a  reason: collision with root package name */
    TextView f71025a;

    /* renamed from: b  reason: collision with root package name */
    SugCompletionView f71026b;

    /* renamed from: c  reason: collision with root package name */
    TuxIconView f71027c;

    /* renamed from: d  reason: collision with root package name */
    public an f71028d;

    /* renamed from: e  reason: collision with root package name */
    public int f71029e;

    static {
        Covode.recordClassIndex(43731);
    }

    public v(View view, SugCompletionView.a aVar) {
        super(view);
        this.f71025a = (TextView) view.findViewById(R.id.f8g);
        this.f71026b = (SugCompletionView) view.findViewById(R.id.c1q);
        this.f71027c = (TuxIconView) view.findViewById(R.id.c12);
        this.f71026b.setImageDrawable(c.a(w.f71031a).a(view.getContext()));
        view.setOnTouchListener(new com.ss.android.ugc.aweme.choosemusic.h.b.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43732);
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.h.b.a
            public final void a(View view) {
                String str;
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && v.this.f71028d != null && !TextUtils.isEmpty(v.this.f71028d.getContent())) {
                    int i2 = v.this.f71029e;
                    an anVar = v.this.f71028d;
                    com.ss.android.ugc.aweme.choosemusic.h.d.a a2 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("words_source", "sug").a("search_position", "video_music").a("words_position", i2).a("words_content", anVar.getContent());
                    if (anVar.getWordRecord() != null) {
                        str = anVar.getWordRecord().getId();
                    } else {
                        str = "";
                    }
                    r.a("trending_words_click", a2.a("group_id", str).a("creation_id", b.f70721d).a(anVar.getExtraParam()).a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
                    aj ajVar = new aj();
                    ajVar.f70628d = false;
                    ajVar.f70629e = v.this.f71029e;
                    ajVar.f70627c = v.this.f71028d.getContent();
                    ajVar.f70625a = "search_sug";
                    ajVar.f70626b = 3;
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.choosemusic.b.b(ajVar));
                }
            }
        });
        this.f71026b.setKeyboardDismissHandler(aVar);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.h.e.a
    public final void a(an anVar, int i2) {
        String str;
        if (anVar != null) {
            this.f71026b.setOnClickListener(new x(this, anVar, i2));
            this.f71028d = anVar;
            this.f71029e = i2;
            this.f71025a.setText(SearchServiceImpl.t().f().a(this.itemView.getContext(), anVar.getContent(), anVar.getHignLightPositions()));
            if (!anVar.isMobShow()) {
                anVar.setMobShow(true);
                com.ss.android.ugc.aweme.choosemusic.h.d.a a2 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("words_source", "sug").a("search_position", "video_music").a("words_position", i2).a("words_content", anVar.getContent());
                if (anVar.getWordRecord() != null) {
                    str = anVar.getWordRecord().getId();
                } else {
                    str = "";
                }
                r.a("trending_words_show", a2.a("group_id", str).a("creation_id", b.f70721d).a(anVar.getExtraParam()).a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
            }
        }
    }
}
