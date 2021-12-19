package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.af;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class l extends b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    final o f77576a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f77577b;

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f77578c;

    /* renamed from: d  reason: collision with root package name */
    final h f77579d;

    /* renamed from: e  reason: collision with root package name */
    public final PrivacySettingViewModel f77580e;

    /* renamed from: f  reason: collision with root package name */
    private final int f77581f = R.string.fof;

    /* renamed from: g  reason: collision with root package name */
    private final int f77582g = R.string.fog;

    static {
        Covode.recordClassIndex(48002);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77576a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77581f;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final c.a a() {
        return new c(this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer g() {
        return Integer.valueOf(this.f77582g);
    }

    static final class g extends m implements h.f.a.a<IAVSettingsService> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f77592a = new g();

        static {
            Covode.recordClassIndex(48009);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVSettingsService invoke() {
            return AVExternalServiceImpl.a().configService().avsettingsConfig();
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h $holder$inlined;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(48003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar) {
            super(0);
            this.this$0 = lVar;
            this.$holder$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            o oVar = this.this$0.f77576a;
            View view = this.$holder$inlined.itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(oVar, context);
            return z.f158842a;
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f77588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77589b;

        static {
            Covode.recordClassIndex(48007);
        }

        e(l lVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77588a = lVar;
            this.f77589b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77589b, this.f77588a);
        }
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f77585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77586b = R.layout.up;

        static {
            Covode.recordClassIndex(48005);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(l lVar) {
            this.f77585a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c.a
        public final com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h a(Context context, ViewGroup viewGroup) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(context), this.f77586b, viewGroup, false);
            h.f.b.l.b(a2, "");
            return new m(a2, this.f77585a.f77580e, this.f77585a.f77577b, this.f77585a.f77578c);
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f77587a;

        static {
            Covode.recordClassIndex(48006);
        }

        d(l lVar) {
            this.f77587a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = (com.ss.android.ugc.aweme.setting.serverpush.a.f) obj;
            t<Boolean> tVar = this.f77587a.f77578c;
            h.f.b.l.b(fVar, "");
            tVar.setValue(Boolean.valueOf(com.ss.android.ugc.aweme.setting.serverpush.a.b.a(fVar.T)));
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f77590a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77591b;

        static {
            Covode.recordClassIndex(48008);
        }

        f(l lVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77590a = lVar;
            this.f77591b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77591b, this.f77590a);
            h.f.b.l.b(bool, "");
            ((IAVSettingsService) this.f77590a.f77579d.getValue()).setEnablePreUploadByUser(bool.booleanValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e.a
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
        h.f.b.l.d(eVar, "");
        this.f77580e.f77449a.observe(eVar, new d(this));
        this.f77577b.observe(eVar, new e(this, eVar));
        this.f77578c.observe(eVar, new f(this, eVar));
    }

    public l(PrivacySettingViewModel privacySettingViewModel) {
        h.f.b.l.d(privacySettingViewModel, "");
        this.f77580e = privacySettingViewModel;
        t<Boolean> tVar = new t<>();
        tVar.setValue(false);
        this.f77577b = tVar;
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enablePreUploadByUser()));
        this.f77578c = tVar2;
        this.f77579d = i.a((h.f.a.a) g.f77592a);
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f77583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h f77584b;

        static {
            Covode.recordClassIndex(48004);
        }

        b(l lVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar) {
            this.f77583a = lVar;
            this.f77584b = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar = this.f77584b;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.PreUploadingViewHolder");
            m mVar = (m) hVar;
            if (mVar.f77593a != null) {
                Context context = mVar.f77593a;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    boolean z2 = !z;
                    m.a("onSelect originStatus:" + z2 + " newStatus:" + z);
                    mVar.f77596d.setValue(Boolean.valueOf(z));
                    mVar.f77595c.setValue(true);
                    ab.a((af) new m.a(z)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m.b(mVar, z), new m.c(mVar, z2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar, int i2) {
        h.f.b.l.d(hVar, "");
        super.a(hVar, i2);
        View view = hVar.itemView;
        h.f.b.l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        if (!(tuxTextCell.getAccessory() instanceof c.j)) {
            h.f.b.l.b(tuxTextCell, "");
            Context context = tuxTextCell.getContext();
            h.f.b.l.b(context, "");
            tuxTextCell.setAccessory(new c.j(context));
        }
        boolean a2 = h.f.b.l.a((Object) this.f77577b.getValue(), (Object) true);
        tuxTextCell.setCellEnabled(c());
        tuxTextCell.setLoading(a2);
        c.b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        c.e eVar = (c.e) accessory;
        this.f77578c.getValue();
        eVar.c(h.f.b.l.a((Object) this.f77578c.getValue(), (Object) true));
        eVar.f45439a = new a(this, hVar);
        eVar.a(new b(this, hVar));
    }
}
