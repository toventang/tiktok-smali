package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.ac;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class e extends z {

    /* renamed from: i  reason: collision with root package name */
    public h f125877i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f125878j;

    static {
        Covode.recordClassIndex(82704);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final List<ac> c() {
        List<ac> list = this.f126299a;
        l.b(list, "");
        return list;
    }

    public final boolean d() {
        if (!f.b() || !this.f125878j) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final int getItemCount() {
        if (d()) {
            return super.getItemCount() + 1;
        }
        return super.getItemCount();
    }

    public final void a(boolean z) {
        this.f125878j = z;
        notifyDataSetChanged();
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125879a;

        static {
            Covode.recordClassIndex(82705);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3273a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f125880a;

            static {
                Covode.recordClassIndex(82706);
            }

            View$OnClickListenerC3273a(a aVar) {
                this.f125880a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h hVar = this.f125880a.f125879a.f125877i;
                if (hVar != null) {
                    hVar.b(view);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab8, viewGroup, false));
            l.d(viewGroup, "");
            this.f125879a = eVar;
        }
    }

    public final class b extends z.c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f125881d;

        static {
            Covode.recordClassIndex(82707);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.z.c
        public final void a(z.c cVar) {
            l.d(cVar, "");
            this.itemView.setOnClickListener(new a(this, cVar));
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f125882a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.c f125883b;

            static {
                Covode.recordClassIndex(82708);
            }

            a(b bVar, z.c cVar) {
                this.f125882a = bVar;
                this.f125883b = cVar;
            }

            public final void onClick(View view) {
                int b2;
                ClickAgent.onClick(view);
                if (this.f125882a.f125881d.f126302d && (b2 = this.f125882a.f125881d.b(this.f125883b.getAdapterPosition())) >= 0 && b2 < this.f125882a.f125881d.f126299a.size()) {
                    z.b bVar = this.f125882a.f125881d.f126301c;
                    VideoSegment videoSegment = ((ac) this.f125882a.f125881d.f126299a.get(b2)).f125450b;
                    l.b(videoSegment, "");
                    bVar.a(b2, videoSegment.a(true));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, ViewGroup viewGroup) {
            super(viewGroup);
            l.d(viewGroup, "");
            this.f125881d = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void a(View view) {
        l.d(view, "");
        h hVar = this.f125877i;
        if (hVar != null) {
            hVar.c(view);
        }
    }

    public final int b(int i2) {
        if (d()) {
            return i2 - 1;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.z
    public final ac a(int i2) {
        if (!d()) {
            return super.a(i2);
        }
        if (getItemViewType(i2) != 10002) {
            return null;
        }
        return (ac) this.f126299a.get(b(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final long getItemId(int i2) {
        if (!d()) {
            return super.getItemId(i2);
        }
        if (getItemViewType(i2) == 10001) {
            return 10001;
        }
        if (getItemViewType(i2) == 10003) {
            return 10003;
        }
        return (long) ((ac) this.f126299a.get(b(i2))).f125449a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final int getItemViewType(int i2) {
        if (!d()) {
            return super.getItemViewType(i2);
        }
        if (i2 == 0) {
            return 10001;
        }
        if (b(i2) < this.f126299a.size()) {
            return 10002;
        }
        return 10003;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.z
    public final int a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        if (d()) {
            i2++;
        }
        return super.a(recyclerView, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.itemView.setOnClickListener(new a.View$OnClickListenerC3273a(aVar));
        } else if (viewHolder instanceof b) {
            ((z.c) viewHolder).a(a(i2), (z.c) viewHolder);
        }
        super.onBindViewHolder(viewHolder, i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l, com.ss.android.ugc.aweme.shortvideo.cut.z
    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        if (!d()) {
            super.a(viewHolder, viewHolder2);
            return;
        }
        int b2 = b(viewHolder.getAdapterPosition());
        int b3 = b(viewHolder2.getAdapterPosition());
        if (b2 < this.f126299a.size() && b3 < this.f126299a.size()) {
            int i2 = ((z.c) viewHolder).f126309b.f125477a;
            int i3 = ((z.c) viewHolder2).f126309b.f125477a;
            a(i2, i3);
            this.f126299a.add(b3, this.f126299a.remove(b2));
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            this.f126304f.a(new com.ss.android.ugc.aweme.shortvideo.cut.model.f(1, i2, i3));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
        l.d(videoEditViewModel, "");
        l.d(cutMultiVideoViewModel, "");
        l.d(list, "");
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(3479);
        l.d(viewGroup, "");
        if (i2 == 10001) {
            viewHolder = new a(eVar, viewGroup);
        } else if (i2 == 10002) {
            viewHolder = new b(eVar, viewGroup);
        } else {
            viewHolder = super.onCreateViewHolder(viewGroup, i2);
            l.b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(3479);
        return viewHolder;
    }
}
