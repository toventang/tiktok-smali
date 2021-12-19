package com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;

public final class ProfileAdvancedFeaturesCell extends PowerCell<d> implements b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f116156a = {new y(ProfileAdvancedFeaturesCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/profile/editprofile/advancedfeatures/powerlist/IProfileCreatorCellControl;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public Context f116157b;

    /* renamed from: j  reason: collision with root package name */
    public boolean f116158j;

    /* renamed from: k  reason: collision with root package name */
    final d f116159k = new a(this);

    /* renamed from: l  reason: collision with root package name */
    private TuxTextCell f116160l;

    /* renamed from: m  reason: collision with root package name */
    private final h f116161m = h.i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(74925);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.b
    public final boolean a() {
        return this.f116158j;
    }

    static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ ProfileAdvancedFeaturesCell this$0;

        static {
            Covode.recordClassIndex(74928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ProfileAdvancedFeaturesCell profileAdvancedFeaturesCell) {
            super(0);
            this.this$0 = profileAdvancedFeaturesCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Context context = this.this$0.f116157b;
            if (context == null) {
                l.a("parentContext");
            }
            return com.bytedance.tux.h.d.a(context, R.attr.f159900k);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.b
    public final void b() {
        Integer num = (Integer) this.f116161m.getValue();
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.b
    public final void c() {
        int i2 = 0;
        this.f116158j = false;
        this.itemView.setBackgroundColor(0);
        d dVar = (d) this.f34234d;
        if (dVar != null) {
            i2 = dVar.f116166a;
        }
        int adapterPosition = getAdapterPosition();
        String a2 = e.a(i2);
        if (!TextUtils.isEmpty(a2)) {
            l.d(a2, "");
            r.a("change_creator_tools_order", new com.ss.android.ugc.aweme.app.f.d().a("target", a2).a("change_to", adapterPosition).f66730a);
        }
    }

    public static final class a implements d<Object, a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerCell f116162a;

        static {
            Covode.recordClassIndex(74926);
        }

        public a(PowerCell powerCell) {
            this.f116162a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a a(java.lang.Object r6, h.k.i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesCell.a.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        this.f116157b = context;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.and, viewGroup, false);
        l.b(a2, "");
        View findViewById = a2.findViewById(R.id.i6);
        l.b(findViewById, "");
        TuxTextCell tuxTextCell = (TuxTextCell) findViewById;
        this.f116160l = tuxTextCell;
        if (tuxTextCell == null) {
            l.a("advancedFeaturesCell");
        }
        Context context2 = this.f116157b;
        if (context2 == null) {
            l.a("parentContext");
        }
        c.f fVar = new c.f(context2);
        Context context3 = this.f116157b;
        if (context3 == null) {
            l.a("parentContext");
        }
        TuxIconView tuxIconView = new TuxIconView(context3, null, 0, 6);
        tuxIconView.setIconRes(R.raw.icon_3_lines_horizontal);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        tuxIconView.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        tuxIconView.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics())));
        tuxIconView.setTintColorRes(R.attr.bd);
        tuxIconView.setOnTouchListener(new b(this));
        fVar.a(tuxIconView, false);
        tuxTextCell.setAccessory(fVar);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(d dVar) {
        String str;
        d dVar2 = dVar;
        String str2 = "";
        l.d(dVar2, str2);
        TuxTextCell tuxTextCell = this.f116160l;
        if (tuxTextCell == null) {
            l.a("advancedFeaturesCell");
        }
        int i2 = dVar2.f116166a;
        if (i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.LiveEvent.getId() ? !(i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.QA.getId() ? i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Translations.getId() ? i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId() ? i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Shoutouts.getId() ? i2 != com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Tipping.getId() || (str = com.bytedance.android.live.core.f.y.a((int) R.string.ghx)) == null : (str = com.bytedance.android.live.core.f.y.a((int) R.string.cbe)) == null : (str = com.bytedance.android.live.core.f.y.a((int) R.string.diq)) == null : (str = com.bytedance.android.live.core.f.y.a((int) R.string.cux)) == null : (str = com.bytedance.android.live.core.f.y.a((int) R.string.dc)) == null) : (str = com.bytedance.android.live.core.f.y.a((int) R.string.cbd)) != null) {
            str2 = str;
        }
        tuxTextCell.setTitle(str2);
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileAdvancedFeaturesCell f116163a;

        static {
            Covode.recordClassIndex(74927);
        }

        b(ProfileAdvancedFeaturesCell profileAdvancedFeaturesCell) {
            this.f116163a = profileAdvancedFeaturesCell;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f116163a.f116158j = true;
                ProfileAdvancedFeaturesCell profileAdvancedFeaturesCell = this.f116163a;
                a aVar = (a) profileAdvancedFeaturesCell.f116159k.a(profileAdvancedFeaturesCell, ProfileAdvancedFeaturesCell.f116156a[0]);
                if (aVar != null) {
                    aVar.a(this.f116163a);
                }
            } else if (actionMasked == 1) {
                this.f116163a.f116158j = false;
                view.performClick();
            }
            return true;
        }
    }
}
