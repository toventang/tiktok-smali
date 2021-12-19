package com.ss.android.ugc.gamora.recorder.n.a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.k;
import com.ss.android.ugc.gamora.recorder.n.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f148105a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f148106b = true;

    static {
        Covode.recordClassIndex(97627);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f148105a.size();
    }

    public c(List<? extends b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        this.f148105a = arrayList;
        arrayList.addAll(list);
    }

    public final void a(List<? extends b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f148105a);
        this.f148105a.clear();
        this.f148105a.addAll(list);
        j.d a2 = j.a(new d(arrayList, this.f148105a), true);
        l.b(a2, "");
        a2.a(this);
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SmartImageView f148107a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f148108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f148109c;

        static {
            Covode.recordClassIndex(97628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, final View view) {
            super(view);
            l.d(view, "");
            this.f148109c = cVar;
            View findViewById = view.findViewById(R.id.by0);
            l.b(findViewById, "");
            this.f148107a = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.f0e);
            l.b(findViewById2, "");
            this.f148108b = (TextView) findViewById2;
            view.setOnClickListener(new k(this) {
                /* class com.ss.android.ugc.gamora.recorder.n.a.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f148110a;

                static {
                    Covode.recordClassIndex(97629);
                }

                @Override // com.ss.android.ugc.aweme.views.k
                public final void a(View view) {
                    l.d(view, "");
                    int adapterPosition = this.f148110a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        b bVar = this.f148110a.f148109c.f148105a.get(adapterPosition);
                        com.ss.android.ugc.gamora.recorder.n.a aVar = bVar.f148162e;
                        if (bVar.f148161d) {
                            if (bVar.f148166i != null) {
                                bVar.f148166i.a(this.f148110a.f148107a);
                            }
                            if (aVar != null) {
                                aVar.a(view, bVar);
                                if (bVar.f148164g) {
                                    this.f148110a.f148107a.setImageResource(bVar.f148159b);
                                    bVar.f148164g = false;
                                }
                            }
                        } else if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                }

                {
                    this.f148110a = r3;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        float f2;
        l.d(viewHolder, "");
        b bVar = this.f148105a.get(i2);
        a aVar = (a) viewHolder;
        SmartImageView smartImageView = aVar.f148107a;
        if (bVar.f148160c != null) {
            v a2 = r.a(bVar.f148160c);
            a2.f39917m = 0;
            a2.E = smartImageView;
            a2.c();
        } else {
            smartImageView.setImageResource(bVar.f148159b);
            if (bVar.f148159b == 2131232233 && gb.a()) {
                smartImageView.setScaleX(-1.0f);
            }
        }
        if (bVar.f148161d) {
            i3 = 255;
        } else {
            i3 = 127;
        }
        smartImageView.setImageAlpha(i3);
        TextView textView = aVar.f148108b;
        View view = viewHolder.itemView;
        l.b(view, "");
        if (bVar.f148161d) {
            f2 = 1.0f;
        } else {
            f2 = 0.49803922f;
        }
        textView.setAlpha(f2);
        if (bVar.f148165h <= 0) {
            textView.setVisibility(8);
            view.setContentDescription(null);
        } else {
            textView.setVisibility(0);
            textView.setText(bVar.f148165h);
            view.setContentDescription(view.getContext().getText(bVar.f148165h));
        }
        if (bVar.f148163f && bVar.f148166i != null) {
            bVar.f148166i.a(smartImageView);
        }
        if (bVar.f148158a == 6 && this.f148106b) {
            Context context = smartImageView.getContext();
            l.b(context, "");
            Activity a3 = com.ss.android.ugc.aweme.scene.a.a(context);
            if (a3 != null) {
                this.f148106b = false;
                com.ss.android.ugc.aweme.shortvideo.duet.j.a(smartImageView, a3);
            }
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11310);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aat, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(cVar, a3);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(11310);
        return aVar;
    }
}
