package com.ss.android.ugc.aweme.social.widget.card.permission;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.c.c;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class FacebookLargeSquareCell extends FacebookSquareCell {
    static {
        Covode.recordClassIndex(87528);
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133806a = new a();

        static {
            Covode.recordClassIndex(87529);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_color_facebook_circle;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public final void a(TuxButton tuxButton) {
        l.d(tuxButton, "");
        super.a(tuxButton);
        ViewGroup.LayoutParams layoutParams = tuxButton.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 136.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 28.0f, system2.getDisplayMetrics()));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell, com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell
    public final void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        super.b(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 226.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 160.0f, system2.getDisplayMetrics()));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell, com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell, com.ss.android.ugc.aweme.social.widget.card.permission.FacebookSquareCell
    public final void a(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system2.getDisplayMetrics()));
        tuxIconView.setLayoutParams(layoutParams);
        tuxIconView.setTuxIcon(c.a(a.f133806a));
    }
}
