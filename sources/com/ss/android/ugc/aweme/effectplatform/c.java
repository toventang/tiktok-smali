package com.ss.android.ugc.aweme.effectplatform;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.knadapt.DataPreProcess;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final h f89019a = i.a((h.f.a.a) a.f89021a);

    /* renamed from: b  reason: collision with root package name */
    private static final h f89020b = i.a((h.f.a.a) b.f89022a);

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89021a = new a();

        static {
            Covode.recordClassIndex(55990);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "creative_tools_open_effect_callback", false));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89022a = new b();

        static {
            Covode.recordClassIndex(55991);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "creative_tools_open_effect_decryption", false));
        }
    }

    static {
        Covode.recordClassIndex(55989);
    }

    public static final f a(Context context, h.f.a.b<? super EffectPlatformBuilder, z> bVar) {
        l.d(context, "");
        IEffectPlatformFactory a2 = EffectPlatformFactory.a();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(context);
        DataPreProcess.enable = ((Boolean) f89019a.getValue()).booleanValue();
        com.ss.ugc.effectplatform.d.a.f153565a = ((Boolean) f89020b.getValue()).booleanValue();
        if (bVar != null) {
            bVar.invoke(effectPlatformBuilder);
        }
        return a2.create(effectPlatformBuilder);
    }
}
