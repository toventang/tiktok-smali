package com.ss.android.ugc.aweme.social.widget.card.permission;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.social.widget.card.permission.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;

public abstract class PermissionSquareCell<T extends c> extends PermissionCell<T> {

    /* renamed from: l  reason: collision with root package name */
    public static int f133819l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f133820m = new a((byte) 0);
    private final int n = R.layout.b11;

    static {
        Covode.recordClassIndex(87542);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87543);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public final int b() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f133822a = new c();

        static {
            Covode.recordClassIndex(87545);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44779e = Integer.valueOf((int) R.color.f159922f);
            eVar2.f44782h = 1;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public void a(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        e a2 = f.a(c.f133822a);
        Context context = tuxIconView.getContext();
        l.b(context, "");
        tuxIconView.setBackground(a2.a(context));
    }

    static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f133821a = new b();

        static {
            Covode.recordClassIndex(87544);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.w);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            eVar2.f44778d = 1;
            eVar2.f44780f = Integer.valueOf((int) R.attr.f159897h);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    public void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        e a2 = f.a(b.f133821a);
        Context context = viewGroup.getContext();
        l.b(context, "");
        viewGroup.setBackground(a2.a(context));
        if (f133819l != 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = f133819l;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }
}
