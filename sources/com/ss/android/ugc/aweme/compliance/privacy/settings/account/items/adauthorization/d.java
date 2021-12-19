package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    final o f77517a;

    /* renamed from: b  reason: collision with root package name */
    public final PrivacySettingViewModel f77518b;

    /* renamed from: c  reason: collision with root package name */
    private final int f77519c = R.string.ev7;

    /* renamed from: d  reason: collision with root package name */
    private final int f77520d = R.string.ev6;

    static {
        Covode.recordClassIndex(47974);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77517a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77519c;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final c.a a() {
        return new c(this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer g() {
        return Integer.valueOf(this.f77520d);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ h $holder$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(47975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, h hVar) {
            super(0);
            this.this$0 = dVar;
            this.$holder$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            o oVar = this.this$0.f77517a;
            View view = this.$holder$inlined.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(oVar, context);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$d  reason: collision with other inner class name */
    static final class C1797d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77526b;

        static {
            Covode.recordClassIndex(47978);
        }

        C1797d(d dVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77525a = dVar;
            this.f77526b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77526b, this.f77525a);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77528b;

        static {
            Covode.recordClassIndex(47979);
        }

        e(d dVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77527a = dVar;
            this.f77528b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77528b, this.f77527a);
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77530b;

        static {
            Covode.recordClassIndex(47980);
        }

        f(d dVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77529a = dVar;
            this.f77530b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77530b, this.f77529a);
        }
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77524b = R.layout.up;

        static {
            Covode.recordClassIndex(47977);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.f77523a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c.a
        public final h a(Context context, ViewGroup viewGroup) {
            l.d(context, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(context), this.f77524b, viewGroup, false);
            l.b(a2, "");
            return new a(a2, this.f77523a.f77518b);
        }
    }

    public d(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77518b = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e.a
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
        l.d(eVar, "");
        this.f77518b.f77453e.observe(eVar, new C1797d(this, eVar));
        this.f77518b.f77455g.observe(eVar, new e(this, eVar));
        this.f77518b.f77454f.observe(eVar, new f(this, eVar));
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f77522b;

        static {
            Covode.recordClassIndex(47976);
        }

        b(d dVar, h hVar) {
            this.f77521a = dVar;
            this.f77522b = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            h hVar = this.f77522b;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.ADAuthorizationViewHolder");
            a aVar = (a) hVar;
            if (aVar.f77506a != null) {
                Context context = aVar.f77506a;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    if (z) {
                        r.a("ad_authorization_on", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").f66730a);
                    } else {
                        r.a("ad_authorization_off", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").f66730a);
                    }
                    b.a(aVar.f77506a, z, new a.C1794a(aVar, z), false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        boolean z;
        l.d(hVar, "");
        super.a(hVar, i2);
        View view = hVar.itemView;
        l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        if (!(tuxTextCell.getAccessory() instanceof c.j)) {
            l.b(tuxTextCell, "");
            Context context = tuxTextCell.getContext();
            l.b(context, "");
            tuxTextCell.setAccessory(new c.j(context));
        }
        if ((!l.a((Object) this.f77518b.f77453e.getValue(), (Object) true) || !l.a((Object) this.f77518b.f77454f.getValue(), (Object) true)) && !l.a((Object) this.f77518b.f77455g.getValue(), (Object) true)) {
            z = false;
        } else {
            z = true;
        }
        tuxTextCell.setCellEnabled(c());
        tuxTextCell.setLoading(z);
        c.b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        c.e eVar = (c.e) accessory;
        eVar.c(l.a((Object) this.f77518b.f77454f.getValue(), (Object) true));
        eVar.f45439a = new a(this, hVar);
        eVar.a(new b(this, hVar));
    }
}
