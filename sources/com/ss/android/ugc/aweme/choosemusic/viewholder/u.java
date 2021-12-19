package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.model.ar;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;

public final class u extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71013b = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f71014d = n.a(48.0d);

    /* renamed from: a  reason: collision with root package name */
    public final h f71015a = i.a((h.f.a.a) e.f71024a);

    /* renamed from: c  reason: collision with root package name */
    private Integer f71016c;

    public interface b {
        static {
            Covode.recordClassIndex(43727);
        }

        void a(int i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43726);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.h.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f71024a = new e();

        static {
            Covode.recordClassIndex(43730);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.h.b invoke() {
            return SearchServiceImpl.t().f();
        }
    }

    static {
        Covode.recordClassIndex(43725);
    }

    public final void a() {
        int i2 = f71014d;
        Integer num = this.f71016c;
        if (num == null || num.intValue() != i2) {
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f71016c = Integer.valueOf(i2);
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(View view) {
        super(view);
        l.d(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.exf);
        l.b(tuxTextView, "");
        tuxTextView.setMaxLines(2);
        a();
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f71020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f71021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f71022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f71023d;

        static {
            Covode.recordClassIndex(43729);
        }

        public d(u uVar, an anVar, int i2, b bVar) {
            this.f71020a = uVar;
            this.f71021b = anVar;
            this.f71022c = i2;
            this.f71023d = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            u uVar = this.f71020a;
            an anVar = this.f71021b;
            int i2 = this.f71022c;
            this.f71023d.a(uVar.getAdapterPosition());
            com.ss.android.ugc.aweme.choosemusic.e.c.g().a(new MusicSearchHistory(anVar.getContent(), 1));
            com.ss.android.ugc.aweme.choosemusic.h.d.a a2 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("action_type", "clear").a("enter_method", "sug");
            if (anVar.getWordRecord() != null) {
                ar wordRecord = anVar.getWordRecord();
                if (wordRecord == null) {
                    l.b();
                }
                str = wordRecord.getId();
            } else {
                str = "";
            }
            com.ss.android.ugc.aweme.choosemusic.h.d.a a3 = a2.a("group_id", str);
            Map<String, String> extraParam = anVar.getExtraParam();
            String str3 = null;
            if (extraParam != null) {
                str2 = extraParam.get("raw_query");
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.choosemusic.h.d.a a4 = a3.a("input_keyword", str2).a("order", i2);
            Map<String, String> extraParam2 = anVar.getExtraParam();
            if (extraParam2 != null) {
                str3 = extraParam2.get("impr_id");
            }
            r.a("search_trending_click", a4.a("query_id", str3).a("search_keyword", anVar.getContent()).a("search_type", "video_music").a("words_type", "history").a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f71017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f71018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f71019c;

        static {
            Covode.recordClassIndex(43728);
        }

        public c(u uVar, an anVar, int i2) {
            this.f71017a = uVar;
            this.f71018b = anVar;
            this.f71019c = i2;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            aj ajVar = new aj();
            ajVar.f70626b = 3;
            ajVar.f70625a = "search_sug";
            ajVar.f70627c = this.f71018b.getContent();
            String str3 = "";
            l.b(ajVar, str3);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.choosemusic.b.b(ajVar));
            int i2 = this.f71019c;
            an anVar = this.f71018b;
            com.ss.android.ugc.aweme.choosemusic.h.d.a a2 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("words_source", "sug").a("search_position", "video_music").a("words_position", i2).a("words_content", anVar.getContent());
            if (anVar.getWordRecord() != null) {
                ar wordRecord = anVar.getWordRecord();
                if (wordRecord == null) {
                    l.b();
                }
                str = wordRecord.getId();
            } else {
                str = str3;
            }
            r.a("trending_words_click", a2.a("group_id", str).a("creation_id", com.ss.android.ugc.aweme.choosemusic.utils.b.f70721d).a(anVar.getExtraParam()).a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
            com.ss.android.ugc.aweme.choosemusic.h.d.a a3 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("action_type", "search").a("enter_method", "sug");
            if (anVar.getWordRecord() != null) {
                ar wordRecord2 = anVar.getWordRecord();
                if (wordRecord2 == null) {
                    l.b();
                }
                str3 = wordRecord2.getId();
            }
            com.ss.android.ugc.aweme.choosemusic.h.d.a a4 = a3.a("group_id", str3);
            Map<String, String> extraParam = anVar.getExtraParam();
            String str4 = null;
            if (extraParam != null) {
                str2 = extraParam.get("raw_query");
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.choosemusic.h.d.a a5 = a4.a("input_keyword", str2).a("order", i2);
            Map<String, String> extraParam2 = anVar.getExtraParam();
            if (extraParam2 != null) {
                str4 = extraParam2.get("impr_id");
            }
            r.a("search_trending_click", a5.a("query_id", str4).a("search_keyword", anVar.getContent()).a("search_type", "video_music").a("words_type", "history").a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
        }
    }
}
