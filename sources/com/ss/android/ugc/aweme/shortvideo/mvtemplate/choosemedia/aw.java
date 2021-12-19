package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class aw extends RecyclerView.a<c> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public d f129022a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f129023b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, a> f129024c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.c.d<MvImageChooseAdapter.MyMediaModel> f129025d = new androidx.c.d<>();

    /* renamed from: e  reason: collision with root package name */
    private int f129026e;

    /* renamed from: f  reason: collision with root package name */
    private Context f129027f;

    /* renamed from: g  reason: collision with root package name */
    private LayoutInflater f129028g;

    /* renamed from: h  reason: collision with root package name */
    private b f129029h;

    /* renamed from: i  reason: collision with root package name */
    private a f129030i = null;

    /* renamed from: j  reason: collision with root package name */
    private String f129031j;

    public interface b {
        static {
            Covode.recordClassIndex(84688);
        }

        void a(a aVar, boolean z, int i2, boolean z2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(84690);
        }

        void a(int i2, com.ss.android.ugc.aweme.mediachoose.d dVar);
    }

    static {
        Covode.recordClassIndex(84686);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f129023b.size();
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f129032a = "";

        /* renamed from: b  reason: collision with root package name */
        List<MvImageChooseAdapter.MyMediaModel> f129033b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<MvImageChooseAdapter.MyMediaModel> f129034c = new ArrayList();

        static {
            Covode.recordClassIndex(84687);
        }

        a() {
        }

        public final List<MvImageChooseAdapter.MyMediaModel> a() {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f129033b.size() && i3 < this.f129034c.size()) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f129033b.get(i2);
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f129034c.get(i3);
                if (myMediaModel.f109394f >= myMediaModel2.f109394f) {
                    arrayList.add(myMediaModel);
                    i2++;
                } else {
                    arrayList.add(myMediaModel2);
                    i3++;
                }
            }
            while (i2 < this.f129033b.size()) {
                arrayList.add(this.f129033b.get(i2));
                i2++;
            }
            while (i3 < this.f129034c.size()) {
                arrayList.add(this.f129034c.get(i3));
                i3++;
            }
            return arrayList;
        }
    }

    private a a() {
        if (this.f129023b.size() > 0) {
            return this.f129023b.get(0);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return super.getItemViewType(i2);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = (a) view.getTag();
        b bVar = this.f129029h;
        if (bVar != null) {
            bVar.a(aVar, true, this.f129026e, true);
            this.f129030i = aVar;
        }
    }

    public aw(Context context, b bVar) {
        this.f129027f = context;
        this.f129028g = LayoutInflater.from(context);
        this.f129029h = bVar;
        a aVar = new a();
        String string = this.f129027f.getResources().getString(R.string.sh);
        this.f129031j = string;
        aVar.f129032a = string;
        this.f129023b.add(aVar);
        this.f129024c = new HashMap<>();
        Iterator<a> it = this.f129023b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            this.f129024c.put(next.f129032a, next);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
        MvImageChooseAdapter.MyMediaModel myMediaModel;
        c cVar2 = cVar;
        a aVar = this.f129023b.get(i2);
        cVar2.f129035a.setTag(aVar);
        cVar2.f129037c.setText(aVar.f129032a);
        cVar2.f129038d.setText(String.valueOf(aVar.f129033b.size() + aVar.f129034c.size()));
        if (aVar.f129033b.size() != 0 || aVar.f129034c.size() != 0) {
            if (h.a(aVar.f129033b)) {
                myMediaModel = aVar.f129034c.get(0);
            } else {
                myMediaModel = aVar.f129033b.get(0);
            }
            if (myMediaModel != null) {
                i.a(myMediaModel.f109390b, new ax(cVar2, myMediaModel));
            }
        }
    }

    private static void a(a aVar, MvImageChooseAdapter.MyMediaModel myMediaModel, int i2) {
        if (myMediaModel != null) {
            if (i2 == 4) {
                aVar.f129034c.add(myMediaModel);
            } else if (i2 == 3) {
                aVar.f129033b.add(myMediaModel);
            } else if (i2 == 1) {
                aVar.f129033b.add(myMediaModel);
            }
        }
    }

    private static RecyclerView.ViewHolder a(aw awVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9949);
        View a3 = com.a.a(awVar.f129028g, R.layout.aah, viewGroup, false);
        c cVar = new c(a3, (AnimatedImageView) a3.findViewById(R.id.by0), (TextView) a3.findViewById(R.id.bmf), (TextView) a3.findViewById(R.id.bma));
        a3.setOnClickListener(awVar);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(9949);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(List<MvImageChooseAdapter.MyMediaModel> list, int i2, com.ss.android.ugc.aweme.mediachoose.d dVar) {
        MvImageChooseAdapter.MyMediaModel a2;
        if (dVar == d.b.f109381a) {
            Iterator<a> it = this.f129023b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (i2 == 4) {
                    next.f129034c.clear();
                } else if (i2 == 3) {
                    next.f129033b.clear();
                } else if (i2 == 1) {
                    next.f129033b.clear();
                }
                if (next.f129033b.size() + next.f129034c.size() == 0 && !TextUtils.equals(next.f129032a, this.f129031j)) {
                    it.remove();
                    this.f129024c.remove(next.f129032a);
                }
            }
        }
        a aVar = this.f129023b.get(0);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (MvImageChooseAdapter.MyMediaModel myMediaModel : list) {
            try {
                if (dVar == d.a.f109380a) {
                    this.f129025d.b(Long.parseLong(myMediaModel.f109389a), myMediaModel);
                } else if (this.f129025d.b() > 0 && (a2 = this.f129025d.a(Long.parseLong(myMediaModel.f109389a))) != null) {
                    this.f129025d.b(Long.parseLong(myMediaModel.f109389a));
                    myMediaModel = a2;
                }
            } catch (NumberFormatException unused) {
            }
            a(aVar, myMediaModel, i2);
            String str = myMediaModel.f109393e;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            a aVar2 = this.f129024c.get(str);
            if (aVar2 == null) {
                aVar2 = new a();
                aVar2.f129032a = str;
                arrayList.add(aVar2);
                this.f129024c.put(str, aVar2);
            }
            a(aVar2, myMediaModel, i2);
            hashSet.add(aVar2);
        }
        this.f129026e |= 1 << i2;
        this.f129023b.addAll(arrayList);
        notifyDataSetChanged();
        b bVar = this.f129029h;
        if (bVar != null) {
            a aVar3 = this.f129030i;
            if (aVar3 == null) {
                bVar.a(a(), false, this.f129026e, true);
                this.f129030i = a();
            } else if (hashSet.contains(aVar3) || this.f129030i == a()) {
                this.f129029h.a(this.f129030i, false, this.f129026e, false);
            }
        }
        d dVar2 = this.f129022a;
        if (dVar2 != null) {
            dVar2.a(i2, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f129035a;

        /* renamed from: b  reason: collision with root package name */
        AnimatedImageView f129036b;

        /* renamed from: c  reason: collision with root package name */
        TextView f129037c;

        /* renamed from: d  reason: collision with root package name */
        TextView f129038d;

        static {
            Covode.recordClassIndex(84689);
        }

        c(View view, AnimatedImageView animatedImageView, TextView textView, TextView textView2) {
            super(view);
            this.f129035a = view;
            this.f129036b = animatedImageView;
            this.f129037c = textView;
            this.f129038d = textView2;
        }
    }
}
