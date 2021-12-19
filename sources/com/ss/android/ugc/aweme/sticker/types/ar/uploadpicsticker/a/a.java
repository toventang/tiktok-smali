package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: i  reason: collision with root package name */
    public static final C3541a f135929i = new C3541a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f135930a = -1;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a f135931b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a f135932c;

    /* renamed from: d  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a> f135933d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Map<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, Integer> f135934e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f135935f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c f135936g;

    /* renamed from: h  reason: collision with root package name */
    final q<Integer, Boolean, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, z> f135937h;

    /* renamed from: j  reason: collision with root package name */
    private View f135938j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b f135939k;

    static {
        Covode.recordClassIndex(88821);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$a  reason: collision with other inner class name */
    public static final class C3541a {
        static {
            Covode.recordClassIndex(88822);
        }

        private C3541a() {
        }

        public /* synthetic */ C3541a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ int $pos;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, int i2) {
            super(0);
            this.this$0 = aVar;
            this.$pos = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            a aVar = this.this$0;
            aVar.f135932c = aVar.f135933d.get(this.$pos);
            a aVar2 = this.this$0;
            aVar2.notifyItemChanged(aVar2.f135930a);
            this.this$0.notifyItemChanged(this.$pos);
            this.this$0.f135930a = this.$pos;
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135942a;

        static {
            Covode.recordClassIndex(88826);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.a
        public final void a() {
            this.f135942a.a();
        }

        e(d dVar) {
            this.f135942a = dVar;
        }
    }

    public final int a() {
        return this.f135933d.size();
    }

    public final int c() {
        return this.f135934e.size();
    }

    public final void d() {
        this.f135932c = null;
        int i2 = this.f135930a;
        if (i2 >= 0) {
            notifyItemChanged(i2);
        }
        this.f135930a = -1;
    }

    public final void e() {
        this.f135935f = false;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b bVar = this.f135939k;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f135935f) {
            return a() + 1;
        }
        return a();
    }

    public final void f() {
        this.f135933d.clear();
        this.f135934e.clear();
        this.f135932c = null;
        this.f135930a = -1;
    }

    public final void g() {
        Iterator<T> it = this.f135933d.iterator();
        while (it.hasNext()) {
            it.next().f135954l = -1;
        }
        this.f135934e.clear();
    }

    public final List<j> b() {
        List<Map.Entry> a2 = n.a((Iterable) this.f135934e.entrySet(), (Comparator) new c());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a2) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a) entry.getKey();
            String str = aVar.f135944b;
            if (str != null) {
                long j2 = aVar.f135950h;
                int i2 = aVar.f135951i;
                String str2 = aVar.f135943a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = aVar.f135952j;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new j(str, j2, i2, str2, str3, "media_tray"));
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (!this.f135935f || i2 != getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public final void a(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
        l.d(aVar, "");
        this.f135933d.add(aVar);
        notifyItemInserted(getItemCount() - 1);
    }

    public final void a(List<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a> list) {
        l.d(list, "");
        this.f135933d.clear();
        this.f135933d.addAll(list);
        e();
        notifyDataSetChanged();
    }

    public final void a(String str) {
        if (!(TextUtils.isEmpty(str) || this.f135933d.isEmpty())) {
            int size = this.f135933d.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (p.a(str, this.f135933d.get(i2).f135944b, false)) {
                    this.f135932c = this.f135933d.get(i2);
                    int i3 = this.f135930a;
                    if (i3 >= 0) {
                        notifyItemChanged(i3);
                    }
                    notifyItemChanged(i2);
                    this.f135930a = i2;
                    return;
                }
            }
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a f135941b;

        static {
            Covode.recordClassIndex(88823);
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar = this.f135940a.f135931b;
            if (aVar != null) {
                boolean z = true;
                if (aVar.f135925c) {
                    a aVar2 = this.f135940a;
                    int adapterPosition = this.f135941b.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition < aVar2.f135933d.size()) {
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar3 = aVar2.f135933d.get(adapterPosition);
                        if (aVar2.f135934e.containsKey(aVar3)) {
                            aVar3.f135954l = -1;
                            Integer remove = aVar2.f135934e.remove(aVar3);
                            if (remove != null) {
                                int intValue = remove.intValue();
                                for (T t : aVar2.f135933d) {
                                    if (t.f135954l != -1 && t.f135954l > intValue) {
                                        t.f135954l--;
                                        aVar2.f135934e.put(t, Integer.valueOf(t.f135954l));
                                    }
                                }
                                z = false;
                            } else {
                                return;
                            }
                        } else {
                            int size = aVar2.f135934e.size();
                            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar4 = aVar2.f135931b;
                            if (aVar4 == null || size != aVar4.f135927e) {
                                int size2 = aVar2.f135934e.size() + 1;
                                aVar2.f135934e.put(aVar3, Integer.valueOf(size2));
                                aVar3.f135954l = size2;
                                z = false;
                            }
                        }
                        aVar2.f135937h.invoke(Integer.valueOf(aVar2.f135934e.size()), Boolean.valueOf(z), aVar3);
                        aVar2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            }
            a aVar5 = this.f135940a;
            int adapterPosition2 = this.f135941b.getAdapterPosition();
            if (adapterPosition2 >= 0 && adapterPosition2 < aVar5.f135933d.size()) {
                if (adapterPosition2 == aVar5.f135930a) {
                    aVar5.f135932c = null;
                    aVar5.notifyItemChanged(aVar5.f135930a);
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar = aVar5.f135936g;
                    if (cVar != null) {
                        cVar.a();
                    }
                    aVar5.f135930a = -1;
                    return;
                }
                d dVar = new d(aVar5, adapterPosition2);
                if (aVar5.f135936g != null) {
                    aVar5.f135936g.a(aVar5.f135933d.get(adapterPosition2), new e(dVar));
                    return;
                }
                dVar.a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a aVar2) {
            super(800);
            this.f135940a = aVar;
            this.f135941b = aVar2;
        }
    }

    public static final class c<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(88824);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Integer) t.getValue(), (Integer) t2.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        int i3;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar;
        String str;
        String str2;
        l.d(viewHolder, "");
        if (viewHolder instanceof com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b bVar = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b) viewHolder;
            View view = bVar.itemView;
            l.b(view, "");
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f136004b, "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(800L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.start();
            bVar.f136003a = ofFloat;
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a aVar2 = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a) viewHolder;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar3 = this.f135933d.get(i2);
            ImageView imageView = aVar2.f135999a;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar4 = this.f135932c;
            if (aVar4 == null || (str = aVar4.f135944b) == null || str.length() == 0) {
                z = false;
            } else {
                String str3 = aVar4.f135944b;
                if (aVar3 != null) {
                    str2 = aVar3.f135944b;
                } else {
                    str2 = null;
                }
                z = l.a((Object) str3, (Object) str2);
            }
            if (!z || ((aVar = this.f135931b) != null && aVar.f135925c)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (aVar3.f135954l != -1) {
                aVar2.f136002d.setVisibility(0);
                aVar2.f136002d.setText(String.valueOf(aVar3.f135954l));
            } else {
                aVar2.f136002d.setVisibility(8);
            }
            Uri d2 = h.d(aVar3.f135944b);
            Context context = aVar2.f136000b.getContext();
            l.b(context, "");
            int a2 = (int) r.a(context, 50.0f);
            if (aVar3.f135951i == 3) {
                com.ss.android.ugc.tools.c.a.b(aVar2.f136000b, d2.toString(), a2, a2);
            } else {
                com.ss.android.ugc.tools.c.a.a(aVar2.f136000b, d2, a2, a2);
            }
            if (aVar3.f135951i == 2) {
                TextView textView = aVar2.f136001c;
                StringBuilder sb = new StringBuilder();
                String a3 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) aVar3.f135950h) * 1.0f) / 1000.0f)}, 1));
                l.b(a3, "");
                textView.setText(sb.append(a3).append("s").toString());
                textView.setVisibility(0);
                return;
            }
            aVar2.f136001c.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.q<? super java.lang.Integer, ? super java.lang.Boolean, ? super com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar, q<? super Integer, ? super Boolean, ? super com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, z> qVar) {
        l.d(context, "");
        l.d(qVar, "");
        MethodCollector.i(10228);
        this.f135936g = cVar;
        this.f135937h = qVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a9j, (ViewGroup) null);
        int a2 = (int) r.a(context, 50.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a2, a2);
        marginLayoutParams.rightMargin = (int) r.a(context, 6.5f);
        inflate.setLayoutParams(marginLayoutParams);
        this.f135938j = inflate;
        this.f135935f = true;
        MethodCollector.o(10228);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b */
    /* JADX WARN: Multi-variable type inference failed */
    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a aVar2;
        MethodCollector.i(10224);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 1) {
            View view = aVar.f135938j;
            l.b(view, "");
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b bVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b(view);
            aVar.f135939k = bVar;
            aVar2 = bVar;
        } else {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9k, viewGroup, false);
            l.b(a2, "");
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a aVar3 = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.a(a2);
            a2.setOnClickListener(new b(aVar, aVar3));
            aVar2 = aVar3;
        }
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.o(10224);
        return aVar2;
    }
}
