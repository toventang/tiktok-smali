package com.ss.android.ugc.aweme.shortvideo.n;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.effectplatform.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f129514c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final a f129515d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Effect f129516a;

    /* renamed from: b  reason: collision with root package name */
    public int f129517b = -1;

    /* renamed from: e  reason: collision with root package name */
    private f f129518e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b$b  reason: collision with other inner class name */
    public static final class C3374b implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f129520b;

        static {
            Covode.recordClassIndex(85011);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b$b$a */
        public static final class a implements IFetchEffectListener {
            static {
                Covode.recordClassIndex(85012);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            }

            a() {
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f129520b.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.ERROR, (Object) null));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            List<Effect> list2 = list;
            if (com.bytedance.framwork.core.b.e.b.a(list2)) {
                this.f129520b.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.ERROR, (Object) null));
                return;
            }
            if (list2 == null) {
                l.b();
            }
            boolean z = false;
            if (list2.get(0) == null) {
                this.f129520b.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.ERROR, (Object) null));
                return;
            }
            this.f129519a.f129516a = list2.get(0);
            this.f129519a.f129517b = 2;
            if (this.f129519a.f129516a != null) {
                z = true;
            }
            this.f129520b.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.SUCCESS, new p(Boolean.valueOf(z), 2)));
            b.a(this.f129519a).a(this.f129519a.f129516a, new a());
        }

        C3374b(b bVar, t tVar) {
            this.f129519a = bVar;
            this.f129520b = tVar;
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85010);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f129516a = null;
        this.f129517b = -1;
        f fVar = this.f129518e;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f129518e = null;
    }

    static {
        Covode.recordClassIndex(85009);
    }

    static /* synthetic */ f a(b bVar) {
        Application application = i.f115645a;
        l.b(application, "");
        if (bVar.f129518e == null) {
            bVar.f129518e = c.a(application, null);
        }
        f fVar = bVar.f129518e;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.IEffectPlatform");
        return fVar;
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString("live_sticker_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final LiveData<com.ss.android.ugc.aweme.bw.b.a<p<Boolean, Integer>>> a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(b(str))) {
            new t().setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.ERROR, (Object) null));
            return new t();
        }
        String b2 = b(str);
        t tVar = new t();
        if (b2 == null || b2.length() == 0) {
            return tVar;
        }
        a(this).a(n.c(b2), (Map<String, String>) null, false, (IFetchEffectListListener) new C3374b(this, tVar));
        return tVar;
    }
}
