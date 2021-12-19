package com.ss.android.ugc.aweme.services;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

final class InternalRecordServiceImpl$photoCanvasGoNext$1 extends m implements b<Boolean, z> {
    final /* synthetic */ e $activity;
    final /* synthetic */ b $onFinish;

    static {
        Covode.recordClassIndex(79505);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InternalRecordServiceImpl$photoCanvasGoNext$1(e eVar, b bVar) {
        super(1);
        this.$activity = eVar;
        this.$onFinish = bVar;
    }

    public static ad com_ss_android_ugc_aweme_services_InternalRecordServiceImpl$photoCanvasGoNext$1_androidx_lifecycle_VScopeLancet_of(e eVar) {
        return ae.a(eVar, (ad.b) null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(Boolean bool) {
        invoke(bool);
        return z.f158842a;
    }

    public final void invoke(Boolean bool) {
        ac a2 = com_ss_android_ugc_aweme_services_InternalRecordServiceImpl$photoCanvasGoNext$1_androidx_lifecycle_VScopeLancet_of(this.$activity).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ((ShortVideoContextViewModel) a2).b(false);
        this.$onFinish.invoke(Boolean.valueOf(l.a((Object) bool, (Object) true)));
    }
}
