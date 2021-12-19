package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class u extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<j> f13374a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f13375b;

    /* renamed from: c  reason: collision with root package name */
    public j f13376c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super j, z> f13377d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f13378e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13379f;

    static {
        Covode.recordClassIndex(7455);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f13374a.size();
    }

    public /* synthetic */ u(Context context) {
        this(context, true);
    }

    public final void a(List<j> list) {
        l.d(list, "");
        this.f13374a.clear();
        this.f13374a.addAll(list);
        this.f13375b = null;
        this.f13376c = null;
        notifyDataSetChanged();
    }

    public final void a(j jVar) {
        l.d(jVar, "");
        int indexOf = this.f13374a.indexOf(jVar);
        Integer num = this.f13375b;
        if ((num == null || indexOf != num.intValue()) && indexOf >= 0) {
            Integer num2 = this.f13375b;
            this.f13375b = Integer.valueOf(indexOf);
            this.f13376c = jVar;
            notifyItemChanged(indexOf);
            if (num2 != null) {
                notifyItemChanged(num2.intValue());
            }
            b<? super j, z> bVar = this.f13377d;
            if (bVar != null) {
                bVar.invoke(jVar);
            }
        }
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13380a;

        /* renamed from: b  reason: collision with root package name */
        public final RadioButton f13381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f13382c;

        /* renamed from: d  reason: collision with root package name */
        private final View f13383d;

        static {
            Covode.recordClassIndex(7456);
        }

        /* renamed from: com.bytedance.android.livesdk.a.u$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC0282a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f13384a;

            static {
                Covode.recordClassIndex(7457);
            }

            View$OnClickListenerC0282a(a aVar) {
                this.f13384a = aVar;
            }

            public final void onClick(View view) {
                Integer num = this.f13384a.f13382c.f13375b;
                this.f13384a.f13382c.f13375b = Integer.valueOf(this.f13384a.getAdapterPosition());
                this.f13384a.f13382c.f13376c = this.f13384a.f13382c.f13374a.get(this.f13384a.getAdapterPosition());
                Integer num2 = this.f13384a.f13382c.f13375b;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    this.f13384a.f13382c.notifyItemChanged(intValue);
                    b<? super j, z> bVar = this.f13384a.f13382c.f13377d;
                    if (bVar != null) {
                        bVar.invoke(this.f13384a.f13382c.f13374a.get(intValue));
                    }
                }
                if (num != null) {
                    this.f13384a.f13382c.notifyItemChanged(num.intValue());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, View view) {
            super(view);
            l.d(view, "");
            this.f13382c = uVar;
            View findViewById = view.findViewById(R.id.crn);
            l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.f13380a = textView;
            View findViewById2 = view.findViewById(R.id.cro);
            l.b(findViewById2, "");
            RadioButton radioButton = (RadioButton) findViewById2;
            this.f13381b = radioButton;
            View findViewById3 = view.findViewById(R.id.ca6);
            l.b(findViewById3, "");
            this.f13383d = findViewById3;
            View$OnClickListenerC0282a aVar = new View$OnClickListenerC0282a(this);
            radioButton.setOnClickListener(aVar);
            view.setOnClickListener(aVar);
            if (!uVar.f13379f) {
                textView.setTextColor(-1);
                findViewById3.setBackgroundColor(Color.parseColor("#80FFFFFF"));
            }
        }
    }

    public u(Context context, boolean z) {
        l.d(context, "");
        this.f13378e = context;
        this.f13379f = z;
        this.f13374a = new ArrayList();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        String quantityString;
        a aVar2 = aVar;
        l.d(aVar2, "");
        TextView textView = aVar2.f13380a;
        j jVar = this.f13374a.get(i2);
        Context context = this.f13378e;
        l.d(jVar, "");
        l.d(context, "");
        boolean z = false;
        if (jVar.f7925a == -1) {
            quantityString = context.getString(R.string.egc);
            l.b(quantityString, "");
        } else if (jVar.f7925a < 60) {
            quantityString = context.getResources().getQuantityString(R.plurals.gc, (int) jVar.f7925a, Integer.valueOf((int) jVar.f7925a));
            l.b(quantityString, "");
        } else {
            Resources resources = context.getResources();
            int i3 = (int) (jVar.f7925a / 60);
            quantityString = resources.getQuantityString(R.plurals.gb, i3, Integer.valueOf(i3));
            l.b(quantityString, "");
        }
        textView.setText(quantityString);
        RadioButton radioButton = aVar2.f13381b;
        Integer num = this.f13375b;
        if (num != null && i2 == num.intValue()) {
            z = true;
        }
        radioButton.setChecked(z);
    }

    private static RecyclerView.ViewHolder a(u uVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2413);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bae, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(uVar, a3);
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
        MethodCollector.o(2413);
        return aVar;
    }
}
