package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public int f129204a = -1;

    static {
        Covode.recordClassIndex(84817);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c, androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    private static MvImageChooseAdapter.MyMediaModel c() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = new MvImageChooseAdapter.MyMediaModel(String.valueOf(System.currentTimeMillis()));
        myMediaModel.f109390b = "";
        myMediaModel.f109399k = "";
        myMediaModel.f109396h = 0;
        myMediaModel.f109395g = 4;
        return myMediaModel;
    }

    private final void d() {
        int i2 = this.f129204a;
        if (i2 >= 0 && i2 < getItemCount()) {
            notifyItemChanged(this.f129204a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final CutSameVideoImageExtraData b() {
        int a2 = a();
        if (a2 < 0 || a2 >= this.f129444c.size()) {
            return null;
        }
        return this.f129444c.get(a2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final int a() {
        int i2 = 0;
        for (T t : this.f129443b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (d(t)) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(int i2) {
        if (i2 > 0) {
            int i3 = 1;
            while (true) {
                this.f129443b.add(c());
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        this.f129204a = 0;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        l.d(myMediaModel, "");
        int a2 = a();
        if (a2 >= 0 && a2 < getItemCount()) {
            this.f129443b.remove(a2);
            this.f129443b.add(a2, myMediaModel);
            notifyItemChanged(a2);
            this.f129204a = a();
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f129443b.size();
            for (int i2 = 0; i2 < size; i2++) {
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f129443b.get(i2);
                l.b(myMediaModel2, "");
                if (l.a((Object) myMediaModel2.f109390b, (Object) myMediaModel.f109390b)) {
                    if (i2 >= 0) {
                        int a2 = a();
                        if (a2 == -1) {
                            this.f129204a = i2;
                        } else if (a2 >= i2) {
                            d();
                            this.f129204a = i2;
                        }
                        this.f129443b.remove(myMediaModel);
                        this.f129443b.add(i2, c());
                        notifyItemChanged(i2);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(ArrayList<CutSameVideoImageExtraData> arrayList) {
        if (!k.a(arrayList)) {
            if (arrayList == null) {
                l.b();
            }
            l.d(arrayList, "");
            this.f129444c = arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.a$a  reason: collision with other inner class name */
    public final class C3363a extends c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129205a;

        static {
            Covode.recordClassIndex(84818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3363a(a aVar, ViewGroup viewGroup) {
            super(aVar, viewGroup);
            l.d(viewGroup, "");
            this.f129205a = aVar;
        }

        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, C3363a aVar, int i2) {
            l.d(aVar, "");
            super.a(myMediaModel, (c.b) aVar, i2);
            this.f129450c.setVisibility(0);
            int i3 = 8;
            if (a.d(myMediaModel)) {
                this.f129451d.setVisibility(8);
                TextView textView = this.f129450c;
                Context context = this.f129450c.getContext();
                l.b(context, "");
                textView.setTextColor(context.getResources().getColor(R.color.bz));
                View view = this.f129452e;
                if (i2 == this.f129205a.f129204a) {
                    i3 = 0;
                }
                view.setVisibility(i3);
            } else {
                this.f129451d.setVisibility(0);
                this.f129452e.setVisibility(8);
                TextView textView2 = this.f129450c;
                Context context2 = this.f129450c.getContext();
                l.b(context2, "");
                textView2.setTextColor(context2.getResources().getColor(R.color.a_));
            }
            a aVar2 = this.f129205a;
            long j2 = 0;
            if (!k.a(aVar2.f129444c) && i2 >= 0 && i2 < aVar2.f129444c.size()) {
                j2 = aVar2.f129444c.get(i2).f129203a;
            }
            TextView textView3 = this.f129450c;
            Context context3 = this.f129450c.getContext();
            l.b(context3, "");
            textView3.setText(context3.getResources().getString(R.string.dd7, Float.valueOf((1.0f * ((float) j2)) / 1000.0f)));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c, androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        C3363a aVar = (C3363a) viewHolder;
        aVar.a(this.f129443b.get(i2), aVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f129443b.size() && adapterPosition2 < this.f129443b.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            MvImageChooseAdapter.MyMediaModel remove = this.f129443b.remove(adapterPosition);
            l.b(remove, "");
            this.f129443b.add(adapterPosition2, remove);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8472);
        l.d(viewGroup, "");
        C3363a aVar2 = new C3363a(aVar, viewGroup);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(8472);
        return aVar2;
    }
}
