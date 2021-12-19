package com.ss.android.ugc.aweme.choosemusic.h.a;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.model.ar;
import com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.ss.android.ugc.aweme.choosemusic.viewholder.u;
import com.ss.android.ugc.aweme.choosemusic.viewholder.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public List<an> f70542a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public MusicSearchStateViewModel f70543b;

    /* renamed from: c  reason: collision with root package name */
    private SugCompletionView.a f70544c;

    static {
        Covode.recordClassIndex(43504);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f70542a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        an anVar;
        if (b.a((Collection) this.f70542a) || (anVar = this.f70542a.get(i2)) == null || !anVar.isHistoryType()) {
            return 0;
        }
        return 1;
    }

    public a(e eVar) {
        if (eVar != null) {
            this.f70543b = (MusicSearchStateViewModel) ae.a(eVar, (ad.b) null).a(MusicSearchStateViewModel.class);
            this.f70544c = new SugCompletionView.a() {
                /* class com.ss.android.ugc.aweme.choosemusic.h.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43505);
                }

                @Override // com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView.a
                public final void a() {
                    if (a.this.f70543b != null) {
                        a.this.f70543b.d().setValue(true);
                    }
                }

                @Override // com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView.a
                public final void a(boolean z) {
                    if (a.this.f70543b != null) {
                        a.this.f70543b.e().setValue(Boolean.valueOf(z));
                    }
                }
            };
        }
    }

    public final an a(String str) {
        List<an> list = this.f70542a;
        if (list == null) {
            return null;
        }
        for (an anVar : list) {
            if (TextUtils.equals(anVar.getContent(), str)) {
                return anVar;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        if (getItemViewType(i2) == 1) {
            u uVar = (u) viewHolder;
            an anVar = this.f70542a.get(i2);
            b bVar = new b(this);
            String str3 = "";
            l.d(anVar, str3);
            l.d(str3, str3);
            l.d(bVar, str3);
            uVar.a();
            com.ss.android.ugc.aweme.discover.h.b bVar2 = (com.ss.android.ugc.aweme.discover.h.b) uVar.f71015a.getValue();
            View view = uVar.itemView;
            l.b(view, str3);
            Context context = view.getContext();
            l.b(context, str3);
            String content = anVar.getContent();
            if (content == null) {
                content = str3;
            }
            List<Position> hignLightPositions = anVar.getHignLightPositions();
            if (hignLightPositions == null) {
                hignLightPositions = new ArrayList<>();
            }
            SpannableString a2 = bVar2.a(context, content, hignLightPositions);
            View view2 = uVar.itemView;
            l.b(view2, str3);
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.exf);
            l.b(tuxTextView, str3);
            tuxTextView.setText(a2);
            uVar.itemView.setOnClickListener(new u.c(uVar, anVar, i2));
            View view3 = uVar.itemView;
            l.b(view3, str3);
            ((TuxIconView) view3.findViewById(R.id.bw9)).setOnClickListener(new u.d(uVar, anVar, i2, bVar));
            if (!anVar.isMobShow()) {
                anVar.setMobShow(true);
                com.ss.android.ugc.aweme.choosemusic.h.d.a a3 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("words_source", "sug").a("search_position", "video_music").a("words_position", i2).a("words_content", anVar.getContent());
                if (anVar.getWordRecord() != null) {
                    ar wordRecord = anVar.getWordRecord();
                    if (wordRecord == null) {
                        l.b();
                    }
                    str = wordRecord.getId();
                } else {
                    str = str3;
                }
                r.a("trending_words_show", a3.a("group_id", str).a("creation_id", com.ss.android.ugc.aweme.choosemusic.utils.b.f70721d).a(anVar.getExtraParam()).a("new_sug_session_id", c.f70567d).f70563a);
                com.ss.android.ugc.aweme.choosemusic.h.d.a a4 = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("enter_method", "sug");
                Map<String, String> extraParam = anVar.getExtraParam();
                String str4 = null;
                if (extraParam != null) {
                    str2 = extraParam.get("impr_id");
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.choosemusic.h.d.a a5 = a4.a("query_id", str2);
                Map<String, String> extraParam2 = anVar.getExtraParam();
                if (extraParam2 != null) {
                    str4 = extraParam2.get("raw_query");
                }
                com.ss.android.ugc.aweme.choosemusic.h.d.a a6 = a5.a("input_keyword", str4).a("search_keyword", anVar.getContent()).a("order", i2).a("search_type", "video_music");
                if (anVar.getWordRecord() != null) {
                    ar wordRecord2 = anVar.getWordRecord();
                    if (wordRecord2 == null) {
                        l.b();
                    }
                    str3 = wordRecord2.getId();
                }
                r.a("search_trending_show", a6.a("group_id", str3).a("words_type", "history").a("new_sug_session_id", c.f70567d).f70563a);
                return;
            }
            return;
        }
        ((com.ss.android.ugc.aweme.choosemusic.h.e.a) viewHolder).a(this.f70542a.get(i2), i2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(3564);
        boolean z = true;
        if (i2 == 1) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aab, viewGroup, false);
            l.b(a2, "");
            viewHolder = new u(a2);
        } else {
            SugCompletionView.a aVar2 = aVar.f70544c;
            l.d(viewGroup, "");
            l.d(aVar2, "");
            viewHolder = new v(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaa, viewGroup, false), aVar2);
            l.b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(3564);
        return viewHolder;
    }
}
