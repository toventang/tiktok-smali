package com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.i;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.address.edit.j;
import com.ss.android.ugc.aweme.ecommerce.address.widget.b;
import com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class RegionInputItemViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.address.a.a> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final i f84487f;

    /* renamed from: g  reason: collision with root package name */
    private final h f84488g;

    static {
        Covode.recordClassIndex(52716);
    }

    public final AddressEditViewModel m() {
        return (AddressEditViewModel) this.f84488g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ RegionInputItemViewHolder this$0;

        static {
            Covode.recordClassIndex(52721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RegionInputItemViewHolder regionInputItemViewHolder) {
            super(0);
            this.this$0 = regionInputItemViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Object obj = ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.aI_()).f84262b;
            if (!(obj instanceof List)) {
                obj = null;
            }
            if (obj != null) {
                View view = this.this$0.itemView;
                l.b(view, "");
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ej6);
                l.b(tuxTextView, "");
                tuxTextView.setText(RegionInputItemViewHolder.c(obj));
                return;
            }
            View view2 = this.this$0.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.ej6);
            l.b(tuxTextView2, "");
            tuxTextView2.setText("");
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84489a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RegionInputItemViewHolder f84490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f84491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f84492d;

        static {
            Covode.recordClassIndex(52718);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(52719);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f84490b.m();
                String a2 = AddressEditViewModel.a(((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84261a.f84315i, ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84262b);
                if (a2 != null) {
                    View view = this.this$0.f84490b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).a(a2);
                    ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84263c = a2;
                }
                j jVar = this.this$0.f84490b.m().f84362l;
                if (jVar != null) {
                    jVar.f84457b = SystemClock.elapsedRealtime();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null && this.f84491c != null) {
                j jVar = this.f84490b.m().f84362l;
                if (jVar != null) {
                    jVar.a(true, "next", this.f84490b.m().g());
                }
                String str2 = this.f84491c;
                androidx.fragment.app.i iVar = this.f84490b.f84487f;
                if (this.f84490b.m().q == null) {
                    str = "add";
                } else {
                    str = "edit";
                }
                b.a.a(false, str2, Integer.MAX_VALUE, iVar, str, new a(this), new C2017b(this), null, 129);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$b$b  reason: collision with other inner class name */
        static final class C2017b extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(52720);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2017b(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends Region> list) {
                l.d(list, "");
                if (!l.a((Object) RegionInputItemViewHolder.c(list), (Object) RegionInputItemViewHolder.c(((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84262b))) {
                    this.this$0.f84490b.m().f84358e = true;
                }
                Object obj = ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84262b;
                ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84262b = list;
                this.this$0.f84492d.a();
                if (!this.this$0.f84490b.m().p || !(!l.a(((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84490b.aI_()).f84262b, obj))) {
                    View view = this.this$0.f84490b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).a();
                } else {
                    View view2 = this.this$0.f84490b.itemView;
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    View view3 = this.this$0.f84490b.itemView;
                    l.b(view3, "");
                    ((InputItem) view2).a(((InputItem) view3).getContext().getString(R.string.bim));
                    this.this$0.f84490b.m().p = false;
                }
                j jVar = this.this$0.f84490b.m().f84362l;
                if (jVar != null) {
                    jVar.f84457b = SystemClock.elapsedRealtime();
                }
                return z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(RegionInputItemViewHolder regionInputItemViewHolder, String str, c cVar) {
            super(700);
            this.f84490b = regionInputItemViewHolder;
            this.f84491c = str;
            this.f84492d = cVar;
        }
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84493a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RegionInputItemViewHolder f84494b;

        static {
            Covode.recordClassIndex(52722);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(52723);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f84494b.m();
                String a2 = AddressEditViewModel.a(((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84494b.aI_()).f84261a.f84315i, ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84494b.aI_()).f84262b);
                if (a2 != null) {
                    View view = this.this$0.f84494b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).a(a2);
                    ((com.ss.android.ugc.aweme.ecommerce.address.a.a) this.this$0.f84494b.aI_()).f84263c = a2;
                }
                j jVar = this.this$0.f84494b.m().f84362l;
                if (jVar != null) {
                    jVar.f84457b = SystemClock.elapsedRealtime();
                }
                return z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(RegionInputItemViewHolder regionInputItemViewHolder) {
            super(700);
            this.f84494b = regionInputItemViewHolder;
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(52724);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends Region> list) {
                String str;
                List<? extends Region> list2 = list;
                l.d(list2, "");
                AddressEditViewModel m2 = this.this$0.f84494b.m();
                Region region = (Region) list2.get(0);
                l.d(region, "");
                Region region2 = m2.f84354a;
                if (region2 != null) {
                    str = region2.f84321b;
                } else {
                    str = null;
                }
                if (!l.a((Object) str, (Object) region.f84321b)) {
                    m2.c(AddressEditViewModel.w.f84381a);
                    f.a.b.b a2 = AddressApi.a.a(region).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new AddressEditViewModel.x(m2, region), new AddressEditViewModel.y(m2));
                    l.b(a2, "");
                    m2.a(a2);
                }
                j jVar = this.this$0.f84494b.m().f84362l;
                if (jVar != null) {
                    jVar.f84457b = SystemClock.elapsedRealtime();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null) {
                j jVar = this.f84494b.m().f84362l;
                if (jVar != null) {
                    jVar.a(true, "next", this.f84494b.m().g());
                }
                androidx.fragment.app.i iVar = this.f84494b.f84487f;
                if (this.f84494b.m().q == null) {
                    str = "add";
                } else {
                    str = "edit";
                }
                b.a.a(false, null, 1, iVar, str, new a(this), new b(this), null, 131);
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<AddressEditViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_RegionInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84495a = new e();

        static {
            Covode.recordClassIndex(52725);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return str2;
        }
    }

    public static String c(Object obj) {
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<Region> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Region region : list) {
            String str = region.f84320a;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, e.f84495a, 30);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
        com.ss.android.ugc.aweme.ecommerce.address.a.a aVar2 = aVar;
        l.d(aVar2, "");
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view;
        inputItem.setTitle(aVar2.f84261a.f84313g);
        TuxTextView tuxTextView = (TuxTextView) inputItem.a(R.id.ej6);
        l.b(tuxTextView, "");
        tuxTextView.setHint(aVar2.f84261a.f84309c);
        String str = aVar2.f84263c;
        if (str != null) {
            inputItem.a(str);
        } else {
            inputItem.a();
        }
        String str2 = aVar2.f84261a.f84310d;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            String str3 = null;
            if (hashCode != -934795532) {
                if (hashCode == 367869605 && str2.equals("districts")) {
                    Region region = m().f84354a;
                    if (region == null || (str3 = region.f84321b) == null) {
                        View view2 = this.itemView;
                        l.b(view2, "");
                        com.ss.android.ugc.aweme.ecommerce.util.n.a(view2, 0);
                    } else {
                        View view3 = this.itemView;
                        l.b(view3, "");
                        com.ss.android.ugc.aweme.ecommerce.util.n.a(view3, -2);
                    }
                    c cVar = new c(this);
                    cVar.a();
                    View view4 = this.itemView;
                    l.b(view4, "");
                    FrameLayout frameLayout = (FrameLayout) view4.findViewById(R.id.adq);
                    l.b(frameLayout, "");
                    frameLayout.setOnClickListener(new b(this, str3, cVar));
                }
            } else if (str2.equals("region")) {
                View view5 = this.itemView;
                l.b(view5, "");
                com.ss.android.ugc.aweme.ecommerce.util.n.a(view5, -2);
                Object obj = ((com.ss.android.ugc.aweme.ecommerce.address.a.a) aI_()).f84262b;
                if (obj instanceof Region) {
                    str3 = obj;
                }
                Region region2 = (Region) str3;
                if (region2 != null) {
                    View view6 = this.itemView;
                    l.b(view6, "");
                    TuxTextView tuxTextView2 = (TuxTextView) view6.findViewById(R.id.ej6);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setText(region2.f84320a);
                } else {
                    View view7 = this.itemView;
                    l.b(view7, "");
                    TuxTextView tuxTextView3 = (TuxTextView) view7.findViewById(R.id.ej6);
                    l.b(tuxTextView3, "");
                    tuxTextView3.setText("");
                }
                View view8 = this.itemView;
                l.b(view8, "");
                FrameLayout frameLayout2 = (FrameLayout) view8.findViewById(R.id.adq);
                l.b(frameLayout2, "");
                frameLayout2.setOnClickListener(new d(this));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegionInputItemViewHolder(android.view.ViewGroup r5, androidx.fragment.app.i r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558948(0x7f0d0224, float:1.8743226E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f84487f = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f84488g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.i):void");
    }
}
