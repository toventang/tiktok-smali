package com.ss.android.ugc.aweme.ftc.l.a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.gamora.recorder.n.b> f98685a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f98686b = true;

    static {
        Covode.recordClassIndex(62765);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f98685a.size();
    }

    public b(List<? extends com.ss.android.ugc.gamora.recorder.n.b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        this.f98685a = arrayList;
        arrayList.addAll(list);
    }

    public final void a(List<? extends com.ss.android.ugc.gamora.recorder.n.b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f98685a);
        this.f98685a.clear();
        this.f98685a.addAll(list);
        j.d a2 = j.a(new j(arrayList, this.f98685a), true);
        l.b(a2, "");
        a2.a(this);
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SmartImageView f98687a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f98688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f98689c;

        static {
            Covode.recordClassIndex(62766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, final View view) {
            super(view);
            l.d(view, "");
            this.f98689c = bVar;
            View findViewById = view.findViewById(R.id.by0);
            l.b(findViewById, "");
            this.f98687a = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.f0e);
            l.b(findViewById2, "");
            this.f98688b = (TextView) findViewById2;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ftc.l.a.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f98690a;

                static {
                    Covode.recordClassIndex(62767);
                }

                {
                    this.f98690a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f98690a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        com.ss.android.ugc.gamora.recorder.n.b bVar = this.f98690a.f98689c.f98685a.get(adapterPosition);
                        com.ss.android.ugc.gamora.recorder.n.a aVar = bVar.f148162e;
                        if (bVar.f148161d) {
                            if (bVar.f148166i != null) {
                                bVar.f148166i.a(this.f98690a.f98687a);
                            }
                            if (aVar != null) {
                                aVar.a(view, bVar);
                                if (bVar.f148164g) {
                                    this.f98690a.f98687a.setImageResource(bVar.f148159b);
                                    bVar.f148164g = false;
                                }
                            }
                        } else if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        float f2;
        l.d(viewHolder, "");
        com.ss.android.ugc.gamora.recorder.n.b bVar = this.f98685a.get(i2);
        a aVar = (a) viewHolder;
        SmartImageView smartImageView = aVar.f98687a;
        if (bVar.f148160c != null) {
            v a2 = r.a(bVar.f148160c);
            a2.f39916l = bVar.f148159b;
            a2.E = smartImageView;
            a2.c();
        } else {
            smartImageView.setImageResource(bVar.f148159b);
        }
        if (bVar.f148161d) {
            i3 = 255;
        } else {
            i3 = 127;
        }
        smartImageView.setImageAlpha(i3);
        TextView textView = aVar.f98688b;
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
        if (bVar.f148158a == 6 && this.f98686b) {
            Context context = smartImageView.getContext();
            l.b(context, "");
            Activity a3 = com.ss.android.ugc.aweme.scene.a.a(context);
            if (a3 != null) {
                this.f98686b = false;
                com.ss.android.ugc.aweme.shortvideo.duet.j.a(smartImageView, a3);
            }
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11980);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a31, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(bVar, a3);
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
        MethodCollector.o(11980);
        return aVar;
    }
}
