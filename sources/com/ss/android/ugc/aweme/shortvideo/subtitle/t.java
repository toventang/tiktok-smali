package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.property.ag;
import com.ss.android.ugc.aweme.sticker.data.h;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class t extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public int f131007a = -1;

    /* renamed from: b  reason: collision with root package name */
    public View f131008b;

    /* renamed from: c  reason: collision with root package name */
    public a f131009c;

    /* renamed from: d  reason: collision with root package name */
    public float f131010d;

    /* renamed from: e  reason: collision with root package name */
    public float f131011e;

    /* renamed from: f  reason: collision with root package name */
    public int f131012f = -1;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<h> f131013g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f131014h;

    public interface a {
        static {
            Covode.recordClassIndex(85873);
        }

        void a(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(85872);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f131013g.size();
    }

    public t(ArrayList<h> arrayList) {
        l.d(arrayList, "");
        this.f131013g = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f131014h = recyclerView;
    }

    public final void a(List<h> list) {
        l.d(list, "");
        ArrayList<h> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new h(list.get(i2)));
        }
        this.f131013g = arrayList;
        notifyDataSetChanged();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f131019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f131021c;

        static {
            Covode.recordClassIndex(85876);
        }

        d(t tVar, int i2, b bVar) {
            this.f131019a = tVar;
            this.f131020b = i2;
            this.f131021c = bVar;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            if (this.f131019a.f131012f == this.f131020b) {
                i2 = this.f131021c.f131015a.getOffsetForPosition(this.f131019a.f131010d, this.f131019a.f131011e);
            } else {
                i2 = -1;
            }
            a aVar = this.f131019a.f131009c;
            if (aVar != null) {
                int i3 = this.f131020b;
                if (!ag.a()) {
                    i2 = this.f131019a.f131013g.get(this.f131020b).getText().length();
                }
                aVar.a(i3, i2);
            }
        }
    }

    public final void a(int i2) {
        int i3;
        RecyclerView.ViewHolder viewHolder;
        RecyclerView.ViewHolder f2;
        if (i2 != -1 && i2 != (i3 = this.f131007a)) {
            this.f131007a = i2;
            RecyclerView recyclerView = this.f131014h;
            RecyclerView.ViewHolder viewHolder2 = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i3);
            } else {
                viewHolder = null;
            }
            if (viewHolder != null) {
                RecyclerView recyclerView2 = this.f131014h;
                if (recyclerView2 != null) {
                    viewHolder2 = recyclerView2.f(i3);
                }
                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter.SubtitleViewHolder");
                ((b) viewHolder2).f131015a.setTextColor(com.ss.android.ugc.aweme.df.b.a().getResources().getColor(R.color.ac));
            }
            RecyclerView recyclerView3 = this.f131014h;
            if (recyclerView3 != null && (f2 = recyclerView3.f(i2)) != null) {
                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter.SubtitleViewHolder");
                ((b) f2).f131015a.setTextColor(com.ss.android.ugc.aweme.df.b.a().getResources().getColor(R.color.f159928l));
            }
        }
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f131015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f131016b;

        static {
            Covode.recordClassIndex(85874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar, View view) {
            super(view);
            l.d(view, "");
            this.f131016b = tVar;
            View findViewById = view.findViewById(R.id.eed);
            l.b(findViewById, "");
            this.f131015a = (TextView) findViewById;
        }
    }

    static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f131017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131018b;

        static {
            Covode.recordClassIndex(85875);
        }

        c(t tVar, int i2) {
            this.f131017a = tVar;
            this.f131018b = i2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            this.f131017a.f131010d = motionEvent.getX();
            this.f131017a.f131011e = motionEvent.getY();
            this.f131017a.f131012f = this.f131018b;
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        if (this.f131007a == i2) {
            bVar2.f131015a.setTextColor(com.ss.android.ugc.aweme.df.b.a().getResources().getColor(R.color.f159928l));
        } else {
            bVar2.f131015a.setTextColor(com.ss.android.ugc.aweme.df.b.a().getResources().getColor(R.color.ac));
        }
        bVar2.f131015a.setVisibility(0);
        bVar2.f131015a.setText(this.f131013g.get(i2).getText());
        if (!TextUtils.isEmpty(bVar2.f131015a.getText())) {
            bVar2.f131015a.setOnTouchListener(new c(this, i2));
            bVar2.f131015a.setOnClickListener(new d(this, i2, bVar2));
        }
    }

    private static RecyclerView.ViewHolder a(t tVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5531);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3b, viewGroup, false);
        l.b(a3, "");
        tVar.f131008b = a3;
        View view = tVar.f131008b;
        if (view == null) {
            l.a("view");
        }
        b bVar = new b(tVar, view);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(5531);
        return bVar;
    }
}
