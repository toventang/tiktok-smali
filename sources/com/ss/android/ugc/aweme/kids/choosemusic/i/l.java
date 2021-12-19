package com.ss.android.ugc.aweme.kids.choosemusic.i;

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
import com.ss.android.ugc.aweme.kids.a.a.b;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.kids.choosemusic.d.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class l extends a {

    /* renamed from: b  reason: collision with root package name */
    TextView f105789b;

    /* renamed from: c  reason: collision with root package name */
    TextView f105790c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f105791d;

    /* renamed from: e  reason: collision with root package name */
    public b f105792e;

    /* renamed from: f  reason: collision with root package name */
    public c f105793f;

    static {
        Covode.recordClassIndex(67719);
    }

    public l(View view) {
        super(view);
        this.f105789b = (TextView) view.findViewById(R.id.f9p);
        this.f105790c = (TextView) view.findViewById(R.id.f9n);
        this.f105791d = (RecyclerView) view.findViewById(R.id.dr4);
        this.f105790c.setText(view.getContext().getText(R.string.dco));
        final int b2 = (int) n.b(view.getContext(), 16.0f);
        this.f105791d.a(new RecyclerView.h() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67720);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
                rect.bottom = b2;
            }
        });
        this.f105789b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.l.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67721);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && l.this.f105792e != null) {
                    l.this.f105792e.a(null, view, null);
                }
            }
        });
        this.f105791d.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        TextView textView = this.f105789b;
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }

    public final void a(final List<d> list, final int i2) {
        this.f105791d.setAdapter(new RecyclerView.a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.i.l.AnonymousClass3 */

            static {
                Covode.recordClassIndex(67722);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
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

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                k kVar = (k) viewHolder;
                kVar.f105786c = (d) list.get(i2);
                if (kVar.f105786c != null) {
                    kVar.f105784a.setText(kVar.f105786c.f105309b);
                    e.a(kVar.f105785b, kVar.f105786c.f105311d);
                }
            }

            private static RecyclerView.ViewHolder a(AnonymousClass3 r5, ViewGroup viewGroup, int i2) {
                boolean a2;
                MethodCollector.i(12636);
                k kVar = new k(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa5, viewGroup, false), i2, l.this.f105793f);
                try {
                    if (kVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(kVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = kVar.getClass().getName();
                MethodCollector.o(12636);
                return kVar;
            }
        });
    }
}
