package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.m;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.k;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132365a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132366b;

    /* renamed from: c  reason: collision with root package name */
    private final j f132367c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f132368d;

    static {
        Covode.recordClassIndex(86674);
    }

    s(Context context, String str, j jVar, Bundle bundle) {
        this.f132365a = context;
        this.f132366b = str;
        this.f132367c = jVar;
        this.f132368d = bundle;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        Context context = this.f132365a;
        String str = this.f132366b;
        j jVar = this.f132367c;
        Bundle bundle = this.f132368d;
        boolean[] zArr = {false};
        b[] bVarArr = {null};
        if (context instanceof m) {
            zArr[0] = true;
            new SafeHandler((m) context).postDelayed(new Runnable(zArr, context, bVarArr) {
                /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean[] f132299a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Context f132300b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ b[] f132301c;

                static {
                    Covode.recordClassIndex(86647);
                }

                public final void run() {
                    if (this.f132299a[0]) {
                        Context context = this.f132300b;
                        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                            this.f132301c[0] = b.C3836b.a(this.f132300b);
                            this.f132301c[0].setMessage(this.f132300b.getResources().getString(R.string.g4k));
                        }
                    }
                }

                {
                    this.f132299a = r1;
                    this.f132300b = r2;
                    this.f132301c = r3;
                }
            }, 300);
        }
        IAVEffectService effectService = AVExternalServiceImpl.a().abilityService().effectService();
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "");
        effectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<f>(str, hashMap, zArr, bVarArr, jVar, bundle) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f132302a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Map f132303b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean[] f132304c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b[] f132305d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ j f132306e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f132307f;

            static {
                Covode.recordClassIndex(86648);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
                com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f132302a);
                    fVar2.a((List<String>) arrayList, this.f132303b, false, (IFetchEffectListListener) new IFetchEffectListListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass6.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(86649);
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            AnonymousClass6.this.f132304c[0] = false;
                            k.b(AnonymousClass6.this.f132305d[0]);
                            if (exceptionResult != null) {
                                exceptionResult.getException().printStackTrace();
                                AnonymousClass6.this.f132306e.a(exceptionResult.getException());
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            List<Effect> list2 = list;
                            AnonymousClass6.this.f132304c[0] = false;
                            k.b(AnonymousClass6.this.f132305d[0]);
                            if (list2 != null && list2.size() > 0 && list2.get(0) != null) {
                                Effect effect = list2.get(0);
                                AnonymousClass6.this.f132307f.putParcelable("first_sticker", effect);
                                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                                    String a2 = e.a(effect.getMusic().get(0));
                                    if (!TextUtils.isEmpty(a2)) {
                                        AnonymousClass6.this.f132307f.putString("path", a2);
                                    }
                                }
                                AnonymousClass6.this.f132306e.a(AnonymousClass6.this.f132307f);
                            }
                        }
                    });
                }
            }

            {
                this.f132302a = r1;
                this.f132303b = r2;
                this.f132304c = r3;
                this.f132305d = r4;
                this.f132306e = r5;
                this.f132307f = r6;
            }
        }, null);
        return z.f158842a;
    }
}
