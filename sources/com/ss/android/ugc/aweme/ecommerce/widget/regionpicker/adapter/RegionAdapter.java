package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;
import java.util.Objects;

public final class RegionAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final m f87663d;

    static {
        Covode.recordClassIndex(55131);
    }

    public final class IndicatorViewHolder extends JediSimpleViewHolder<String> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RegionAdapter f87669f;

        static {
            Covode.recordClassIndex(55137);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            View view = this.itemView;
            l.b(view, "");
            a.C2089a.a(view, false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(String str) {
            String str2 = str;
            l.d(str2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(str2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IndicatorViewHolder(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f87669f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558965(0x7f0d0235, float:1.874326E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.IndicatorViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter, android.view.ViewGroup):void");
        }
    }

    public final class DistrictViewHolder extends JediSimpleViewHolder<District> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RegionAdapter f87664f;

        /* renamed from: g  reason: collision with root package name */
        private final h f87665g;

        static {
            Covode.recordClassIndex(55132);
        }

        public final DistrictPickerViewModel m() {
            return (DistrictPickerViewModel) this.f87665g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            View view = this.itemView;
            View view2 = this.itemView;
            l.b(view2, "");
            v.a(view, com.bytedance.ies.dmt.ui.common.c.c(view2.getContext()));
        }

        public static final class a extends h.f.b.m implements h.f.a.a<DistrictPickerViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(55133);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.DistrictViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_adapter_RegionAdapter$DistrictViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        public static final class b extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f87666a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DistrictViewHolder f87667b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ District f87668c;

            static {
                Covode.recordClassIndex(55134);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    DistrictPickerViewModel m2 = this.f87667b.m();
                    District district = this.f87668c;
                    l.d(district, "");
                    m2.c(new DistrictPickerViewModel.d(district));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(DistrictViewHolder districtViewHolder, District district) {
                super(700);
                this.f87667b = districtViewHolder;
                this.f87668c = district;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<DistrictPickerState, z> {
            final /* synthetic */ District $item;
            final /* synthetic */ DistrictViewHolder this$0;

            static {
                Covode.recordClassIndex(55135);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(DistrictViewHolder districtViewHolder, District district) {
                super(1);
                this.this$0 = districtViewHolder;
                this.$item = district;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(DistrictPickerState districtPickerState) {
                String str;
                DistrictPickerState districtPickerState2 = districtPickerState;
                l.d(districtPickerState2, "");
                View view = this.this$0.itemView;
                l.b(view, "");
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.dgn);
                l.b(radioButton, "");
                District selectedDistrict = districtPickerState2.getSelectedDistrict();
                if (selectedDistrict != null) {
                    str = selectedDistrict.f87672b;
                } else {
                    str = null;
                }
                radioButton.setChecked(l.a((Object) str, (Object) this.$item.f87672b));
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(District district) {
            int i2;
            District district2 = district;
            l.d(district2, "");
            View view = this.itemView;
            l.b(view, "");
            boolean z = true;
            int i3 = 0;
            if (this.f39676i == this.f87664f.getItemCount() - 1) {
                z = false;
            }
            a.C2089a.a(view, z);
            withState(m(), new c(this, district2));
            View view2 = this.itemView;
            l.b(view2, "");
            RadioButton radioButton = (RadioButton) view2.findViewById(R.id.dgn);
            l.b(radioButton, "");
            if (m().b()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            radioButton.setVisibility(i2);
            View view3 = this.itemView;
            l.b(view3, "");
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view3.findViewById(R.id.b8z);
            l.b(autoRTLImageView, "");
            if (!m().b()) {
                i3 = 8;
            }
            autoRTLImageView.setVisibility(i3);
            View view4 = this.itemView;
            l.b(view4, "");
            TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.c46);
            l.b(tuxTextView, "");
            tuxTextView.setText(district2.f87671a);
            View view5 = this.itemView;
            l.b(view5, "");
            view5.setOnClickListener(new b(this, district2));
            f.a.b.b unused = selectSubscribe(m(), a.f87670a, new ah(), new d(district2));
        }

        static final class d extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<District>, District, z> {
            final /* synthetic */ District $item;

            static {
                Covode.recordClassIndex(55136);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(District district) {
                super(2);
                this.$item = district;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(JediSimpleViewHolder<District> jediSimpleViewHolder, District district) {
                String str;
                JediSimpleViewHolder<District> jediSimpleViewHolder2 = jediSimpleViewHolder;
                District district2 = district;
                l.d(jediSimpleViewHolder2, "");
                View view = jediSimpleViewHolder2.itemView;
                l.b(view, "");
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.dgn);
                l.b(radioButton, "");
                if (district2 != null) {
                    str = district2.f87672b;
                } else {
                    str = null;
                }
                radioButton.setChecked(l.a((Object) str, (Object) this.$item.f87672b));
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DistrictViewHolder(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f87664f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558966(0x7f0d0236, float:1.8743263E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f87665g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.DistrictViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ RegionAdapter this$0;

        static {
            Covode.recordClassIndex(55139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RegionAdapter regionAdapter) {
            super(1);
            this.this$0 = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new IndicatorViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ RegionAdapter this$0;

        static {
            Covode.recordClassIndex(55141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RegionAdapter regionAdapter) {
            super(1);
            this.this$0 = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new DistrictViewHolder(this.this$0, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegionAdapter(m mVar) {
        super(mVar, (j.e) null, 6);
        l.d(mVar, "");
        this.f87663d = mVar;
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ RegionAdapter this$0;

        static {
            Covode.recordClassIndex(55138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RegionAdapter regionAdapter) {
            super(1);
            this.this$0 = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof String);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ RegionAdapter this$0;

        static {
            Covode.recordClassIndex(55140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RegionAdapter regionAdapter) {
            super(1);
            this.this$0 = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof District);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, ?>> gVar) {
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, new b(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new c(this), null, new d(this));
    }
}
