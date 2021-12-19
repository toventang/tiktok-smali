package com.ss.android.ugc.aweme.live.slot;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.live.slot.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class d extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b>> f108602a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final v f108603b;

    /* renamed from: c  reason: collision with root package name */
    public final IIconSlot.b f108604c;

    /* renamed from: d  reason: collision with root package name */
    public final c.a f108605d;

    static {
        Covode.recordClassIndex(69602);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f108602a.size();
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final View f108606a;

        static {
            Covode.recordClassIndex(69603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            this.f108606a = view;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f108607a;

        static {
            Covode.recordClassIndex(69604);
        }

        b(a aVar) {
            this.f108607a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            LiveTextView liveTextView = (LiveTextView) this.f108607a.f108606a.findViewById(R.id.title);
            l.b(liveTextView, "");
            liveTextView.setText(str);
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f108608a;

        static {
            Covode.recordClassIndex(69605);
        }

        c(a aVar) {
            this.f108608a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Drawable drawable = (Drawable) obj;
            l.d(drawable, "");
            ((ImageView) this.f108608a.f108606a.findViewById(R.id.bi7)).setImageDrawable(drawable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$d  reason: collision with other inner class name */
    static final class C2784d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f108609a;

        static {
            Covode.recordClassIndex(69606);
        }

        C2784d(a aVar) {
            this.f108609a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            a aVar = this.f108609a;
            if (str == null || str.length() <= 0) {
                LiveTextView liveTextView = (LiveTextView) aVar.f108606a.findViewById(R.id.az2);
                l.b(liveTextView, "");
                liveTextView.setText((CharSequence) null);
                return;
            }
            LiveTextView liveTextView2 = (LiveTextView) aVar.f108606a.findViewById(R.id.az2);
            l.b(liveTextView2, "");
            String a2 = com.a.a("(%s)", Arrays.copyOf(new Object[]{str}, 1));
            l.b(a2, "");
            liveTextView2.setText(a2);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f108610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ab f108611b;

        static {
            Covode.recordClassIndex(69607);
        }

        e(d dVar, ab abVar) {
            this.f108610a = dVar;
            this.f108611b = abVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:71:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0252  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r22) {
            /*
            // Method dump skipped, instructions count: 702
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.slot.d.e.onClick(android.view.View):void");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar;
        ac acVar;
        a aVar2 = aVar;
        l.d(aVar2, "");
        ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar2 = this.f108602a.get(i2);
        IIconSlot.SlotViewModel slotViewModel = null;
        if (!(abVar2 instanceof com.bytedance.android.live.slot.b)) {
            abVar = null;
        } else {
            abVar = abVar2;
        }
        com.bytedance.android.live.slot.b bVar = (com.bytedance.android.live.slot.b) abVar;
        if (bVar != null) {
            acVar = bVar.f12762a;
        } else {
            acVar = null;
        }
        if (acVar instanceof IIconSlot.SlotViewModel) {
            slotViewModel = acVar;
        }
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        if (slotViewModel2 != null) {
            t<String> tVar = slotViewModel2.f12722j;
            if (tVar != null) {
                tVar.observe(this.f108603b, new b(aVar2));
            }
            t<Drawable> tVar2 = slotViewModel2.f12719g;
            if (tVar2 != null) {
                tVar2.observe(this.f108603b, new c(aVar2));
            }
            t<String> tVar3 = slotViewModel2.f12715c;
            if (tVar3 != null) {
                tVar3.observe(this.f108603b, new C2784d(aVar2));
            }
        }
        aVar2.f108606a.setOnClickListener(new e(this, abVar2));
        boolean z = true;
        int i3 = 0;
        if (i2 == getItemCount() - 1) {
            z = false;
        }
        View findViewById = aVar2.f108606a.findViewById(R.id.an6);
        l.b(findViewById, "");
        if (!z) {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12557);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.be5, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(a3);
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
        MethodCollector.o(12557);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f108612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ab f108613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.l.a f108614c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f108615d;

        static {
            Covode.recordClassIndex(69608);
        }

        f(d dVar, ab abVar, com.bytedance.android.livesdk.l.a aVar, View view) {
            this.f108612a = dVar;
            this.f108613b = abVar;
            this.f108614c = aVar;
            this.f108615d = view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x00c4 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(final android.content.DialogInterface r13, int r14) {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.slot.d.f.onClick(android.content.DialogInterface, int):void");
        }
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f108616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ab f108617b;

        static {
            Covode.recordClassIndex(69611);
        }

        g(d dVar, ab abVar) {
            this.f108616a = dVar;
            this.f108617b = abVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x00c6 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r13, int r14) {
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.slot.d.g.onClick(android.content.DialogInterface, int):void");
        }
    }

    public d(v vVar, IIconSlot.b bVar, c.a aVar) {
        l.d(vVar, "");
        l.d(bVar, "");
        l.d(aVar, "");
        this.f108603b = vVar;
        this.f108604c = bVar;
        this.f108605d = aVar;
    }
}
