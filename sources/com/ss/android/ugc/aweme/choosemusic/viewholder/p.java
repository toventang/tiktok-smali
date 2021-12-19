package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.choosemusic.d.c;
import com.ss.android.ugc.aweme.music.b.b;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class p extends a {

    /* renamed from: b  reason: collision with root package name */
    TuxTextView f70937b;

    /* renamed from: c  reason: collision with root package name */
    TextView f70938c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f70939d;

    /* renamed from: e  reason: collision with root package name */
    public b f70940e;

    /* renamed from: f  reason: collision with root package name */
    public c f70941f;

    static {
        Covode.recordClassIndex(43689);
    }

    public p(View view) {
        super(view);
        this.f70937b = (TuxTextView) view.findViewById(R.id.f9p);
        this.f70938c = (TextView) view.findViewById(R.id.f9n);
        this.f70939d = (RecyclerView) view.findViewById(R.id.dr4);
        this.f70938c.setText(view.getContext().getText(R.string.dco));
        final int b2 = (int) n.b(view.getContext(), 16.0f);
        this.f70939d.a(new RecyclerView.h() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43690);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
                rect.bottom = b2;
            }
        });
        this.f70939d.setNestedScrollingEnabled(false);
        this.f70937b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.p.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43691);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && p.this.f70940e != null) {
                    p.this.f70940e.a(view);
                }
            }
        });
        this.f70939d.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        this.f70937b.setTuxFont(62);
    }

    public final void a(final List<MusicCollectionItem> list, final int i2) {
        this.f70939d.setAdapter(new RecyclerView.a<o>() {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.p.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43692);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ o onCreateViewHolder(ViewGroup viewGroup, int i2) {
                return a(this, viewGroup, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final int getItemCount() {
                List list = list;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ void onBindViewHolder(o oVar, int i2) {
                o oVar2 = oVar;
                oVar2.f70934c = (MusicCollectionItem) list.get(i2);
                if (oVar2.f70934c != null) {
                    oVar2.f70932a.setText(oVar2.f70934c.mcName);
                    e.a(oVar2.f70933b, oVar2.f70934c.awemeCover);
                }
            }

            private static RecyclerView.ViewHolder a(AnonymousClass3 r5, ViewGroup viewGroup, int i2) {
                boolean a2;
                MethodCollector.i(4852);
                o oVar = new o(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa5, viewGroup, false), i2, p.this.f70941f);
                try {
                    if (oVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(oVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) oVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(oVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = oVar.getClass().getName();
                MethodCollector.o(4852);
                return oVar;
            }
        });
    }
}
