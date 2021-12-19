package com.bytedance.ies.bullet.e.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.f;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {
    static {
        Covode.recordClassIndex(18849);
    }

    public static final BulletContainerView a(View view) {
        if (view == null || !(view instanceof BulletContainerView)) {
            return null;
        }
        return (BulletContainerView) view;
    }

    /* renamed from: com.bytedance.ies.bullet.e.c.a$a  reason: collision with other inner class name */
    public static final class C0679a extends m implements h.f.a.b<ViewGroup, z> {
        final /* synthetic */ View $this_removeParent;

        static {
            Covode.recordClassIndex(18850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0679a(View view) {
            super(1);
            this.$this_removeParent = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup viewGroup) {
            MethodCollector.i(6125);
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            viewGroup2.removeView(this.$this_removeParent);
            z zVar = z.f158842a;
            MethodCollector.o(6125);
            return zVar;
        }
    }

    public static final f a(com.bytedance.ies.bullet.service.base.b bVar) {
        l.c(bVar, "");
        return new f(bVar.f32568a, bVar.f32569b, bVar.f32571d);
    }

    public static final class b extends m implements h.f.a.b<ViewGroup, z> {
        final /* synthetic */ BulletContainerView $newBulletView;
        final /* synthetic */ BulletContainerView $originBulletView;

        static {
            Covode.recordClassIndex(18851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(BulletContainerView bulletContainerView, BulletContainerView bulletContainerView2) {
            super(1);
            this.$originBulletView = bulletContainerView;
            this.$newBulletView = bulletContainerView2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup viewGroup) {
            MethodCollector.i(7473);
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            viewGroup2.removeView(this.$originBulletView);
            viewGroup2.addView(this.$newBulletView, this.$originBulletView.getLayoutParams());
            z zVar = z.f158842a;
            MethodCollector.o(7473);
            return zVar;
        }
    }

    public static final void a(View view, h.f.a.b<? super ViewGroup, z> bVar) {
        l.c(view, "");
        l.c(bVar, "");
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            bVar.invoke(parent);
        }
    }
}
