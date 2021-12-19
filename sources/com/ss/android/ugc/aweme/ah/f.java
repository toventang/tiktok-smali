package com.ss.android.ugc.aweme.ah;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.property.bj;
import com.ss.android.ugc.aweme.setting.i.o;
import com.ss.android.ugc.aweme.shortvideo.em;
import com.ss.android.ugc.aweme.sticker.panel.h;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.main.g;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66317a = "ProximaNova-Semibold";

    /* renamed from: b  reason: collision with root package name */
    public static final Bundle f66318b = null;

    static {
        Covode.recordClassIndex(40749);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<g.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66319a = new c();

        static {
            Covode.recordClassIndex(40752);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g.a aVar) {
            g.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f136299a = AnonymousClass1.f66320a;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ d $cameraApiComponent;

        static {
            Covode.recordClassIndex(40750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.$cameraApiComponent = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$cameraApiComponent.a(com.bytedance.bpea.store.a.a.r(), "shoot_icon");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Boolean, Boolean> {
        final /* synthetic */ e $activity;

        static {
            Covode.recordClassIndex(40751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            ac a2 = ae.a(this.$activity, (ad.b) null).a(GameResultViewModel.class);
            l.b(a2, "");
            return Boolean.valueOf(((GameResultViewModel) a2).f136075a);
        }
    }

    public static final j a(e eVar, d dVar, boolean z, boolean z2) {
        com.ss.android.ugc.aweme.sticker.panel.e eVar2;
        long j2;
        l.d(eVar, "");
        l.d(dVar, "");
        if (z2) {
            eVar2 = new com.ss.android.ugc.aweme.sticker.panel.e(em.a(eVar), new a(dVar), new b(eVar), 0, c.f66319a, 17);
        } else {
            eVar2 = null;
        }
        h hVar = new h(0, 0, null, com.bytedance.ies.abmock.b.a().a(true, "creative_tools_sticker_panel_optimize", false), o.a(), o.a(), 3199);
        if (com.bytedance.ies.abmock.b.a().a(true, "creative_tools_sticker_anim_optimize", false)) {
            j2 = 300;
        } else {
            j2 = 490;
        }
        boolean a2 = bj.a();
        return new j(0, 0, eVar2, 0, a2 ? 1 : 0, com.bytedance.ies.abmock.b.a().a(true, "studio_effects_panel_support_search", 0), true, j2, false, null, hVar, false, z, false, 101435);
    }

    public static /* synthetic */ j a(e eVar, d dVar, boolean z, boolean z2, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        return a(eVar, dVar, z, z2);
    }
}
