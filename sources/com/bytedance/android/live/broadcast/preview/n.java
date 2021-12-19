package com.bytedance.android.live.broadcast.preview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class n {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8256g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f8257a;

    /* renamed from: b  reason: collision with root package name */
    final Context f8258b;

    /* renamed from: c  reason: collision with root package name */
    public int f8259c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.l.a f8260d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.android.livesdk.ui.a f8261e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<com.bytedance.android.livesdkapi.depend.model.a.e> f8262f;

    static {
        Covode.recordClassIndex(4187);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4188);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Dialog a() {
        com.bytedance.android.livesdk.l.a aVar = this.f8260d;
        if (aVar != null) {
            return p.b(aVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a.e $this_run;

        static {
            Covode.recordClassIndex(4194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
            super(0);
            this.$this_run = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.$this_run;
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
            l.b(bVar, "");
            Integer a2 = bVar.a();
            l.b(a2, "");
            eVar.a(a2.intValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a.e $this_run;

        static {
            Covode.recordClassIndex(4191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
            super(0);
            this.$this_run = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.$this_run;
            float f2 = LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18948a;
            com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
            l.b(bVar, "");
            Float a2 = bVar.a();
            l.b(a2, "");
            eVar.a(f2 * a2.floatValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a.e $this_run;

        static {
            Covode.recordClassIndex(4192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
            super(0);
            this.$this_run = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.$this_run;
            float f2 = LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18948a;
            com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.R;
            l.b(bVar, "");
            Float a2 = bVar.a();
            l.b(a2, "");
            eVar.b(f2 * a2.floatValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a.e $this_run;

        static {
            Covode.recordClassIndex(4193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
            super(0);
            this.$this_run = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.$this_run;
            float f2 = LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18948a;
            com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.S;
            l.b(bVar, "");
            Float a2 = bVar.a();
            l.b(a2, "");
            eVar.c(f2 * a2.floatValue());
            return z.f158842a;
        }
    }

    public final void b() {
        com.bytedance.android.livesdkapi.depend.model.a.e invoke = this.f8262f.invoke();
        if (invoke != null) {
            h.a(new d(invoke));
            h.a(new e(invoke));
            h.a(new f(invoke));
            h.a(new g(invoke));
        }
    }

    static final class b implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f8263a;

        static {
            Covode.recordClassIndex(4189);
        }

        b(n nVar) {
            this.f8263a = nVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            androidx.fragment.app.e eVar;
            if (!com.bytedance.android.live.broadcast.p.INST.isLoadedRes()) {
                if (this.f8263a.f8262f.invoke() == null && (eVar = this.f8263a.f8257a) != null) {
                    eVar.finish();
                }
                com.bytedance.android.livesdkapi.depend.model.a.e invoke = this.f8263a.f8262f.invoke();
                if (invoke != null) {
                    invoke.a();
                }
                l.d("ttlive_resource_load", "");
                l.d("ttlive_resource_load", "");
                com.bytedance.android.livesdk.ab.a b2 = com.bytedance.android.live.broadcast.api.c.d.a(new com.bytedance.android.livesdk.ab.a("ttlive_resource_load").a(2)).b("preview");
                b2.f13426c = true;
                b2.f13427d = true;
                b2.a();
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f8264a;

        static {
            Covode.recordClassIndex(4190);
        }

        c(n nVar) {
            this.f8264a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (l.a(obj, (Object) true)) {
                com.bytedance.android.livesdk.l.a aVar = this.f8264a.f8260d;
                if (aVar != null) {
                    p.b(aVar);
                }
                this.f8264a.b();
                com.bytedance.android.livesdk.ab.a b2 = c.a.b("ttlive_resource_load").b("preview");
                b2.f13426c = true;
                b2.f13427d = true;
                b2.a();
            } else if (this.f8264a.f8259c > 3) {
                if (this.f8264a.f8261e.isViewValid()) {
                    ao.a(y.e(), (int) R.string.gus);
                }
                com.bytedance.android.livesdk.ab.a b3 = c.a.c("ttlive_resource_load").b("preview").b("reason", "exceed max retry count");
                b3.f13427d = true;
                b3.a();
                com.bytedance.android.livesdk.l.a aVar2 = this.f8264a.f8260d;
                if (aVar2 != null) {
                    p.b(aVar2);
                }
            } else {
                com.bytedance.android.live.broadcast.p.INST.loadResources();
                this.f8264a.f8259c++;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(com.bytedance.android.livesdk.ui.a aVar, h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f8261e = aVar;
        this.f8262f = aVar2;
        this.f8257a = aVar.getActivity();
        this.f8258b = aVar.getContext();
    }
}
