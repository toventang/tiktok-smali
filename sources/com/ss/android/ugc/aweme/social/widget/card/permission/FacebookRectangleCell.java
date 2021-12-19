package com.ss.android.ugc.aweme.social.widget.card.permission;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class FacebookRectangleCell extends PermissionRectangleCell<b> {
    static {
        Covode.recordClassIndex(87530);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public final void a(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        tuxIconView.setTuxIcon(c.a(a.f133807a));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public final void b(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        tuxTextView.setText(R.string.bt1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public final void a(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        tuxTextView.setText(R.string.bt2);
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133807a = new a();

        static {
            Covode.recordClassIndex(87531);
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
            aVar2.f44749a = R.raw.icon_color_facebook_circle;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }
}
