package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.choosemusic.e.c;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class t extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f71009a;

    /* renamed from: b  reason: collision with root package name */
    public TuxIconView f71010b;

    static {
        Covode.recordClassIndex(43722);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicSearchHistory f71011a;

        static {
            Covode.recordClassIndex(43723);
        }

        public a(MusicSearchHistory musicSearchHistory) {
            this.f71011a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c.g().a(this.f71011a);
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicSearchHistory f71012a;

        static {
            Covode.recordClassIndex(43724);
        }

        public b(MusicSearchHistory musicSearchHistory) {
            this.f71012a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            aj ajVar = new aj();
            ajVar.f70626b = 2;
            ajVar.f70625a = "search_history";
            ajVar.f70627c = this.f71012a.keyword;
            l.b(ajVar, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.choosemusic.b.b(ajVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f0d);
        l.b(findViewById, "");
        this.f71009a = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bvb);
        l.b(findViewById2, "");
        this.f71010b = (TuxIconView) findViewById2;
    }
}
