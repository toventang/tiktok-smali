package com.ss.android.ugc.aweme.sticker.favorite;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.j;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class c implements com.bytedance.o.a, b {

    /* renamed from: b  reason: collision with root package name */
    private final h f134879b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final f f134880c;

    static {
        Covode.recordClassIndex(88168);
    }

    public final d c() {
        return (d) this.f134879b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.b
    public final Bundle a() {
        return com.ss.android.ugc.aweme.ah.f.f66318b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f134880c;
    }

    static final class a extends m implements h.f.a.a<d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(88169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return this.this$0.getDiContainer().a((Type) d.class, (String) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.b
    public final boolean b() {
        return g.a().A().b();
    }

    public static final class b implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f134881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f134882b;

        static {
            Covode.recordClassIndex(88170);
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void a() {
            d c2;
            this.f134882b.invoke();
            d c3 = this.f134881a.c();
            if ((c3 == null || !c3.b()) && (c2 = this.f134881a.c()) != null) {
                c2.a(false, new PrivacyCert(new j("1006"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void b() {
            d c2;
            d c3 = this.f134881a.c();
            if ((c3 == null || !c3.b()) && (c2 = this.f134881a.c()) != null) {
                c2.a(false, new PrivacyCert(new j("1007"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            }
        }

        b(c cVar, h.f.a.a aVar) {
            this.f134881a = cVar;
            this.f134882b = aVar;
        }
    }

    public c(f fVar) {
        l.d(fVar, "");
        this.f134880c = fVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.b
    public final void a(Effect effect) {
        l.d(effect, "");
        g.a().D().b(effect.getId());
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.b
    public final void a(Activity activity, String str, int i2, Bundle bundle, h.f.a.a<h.z> aVar) {
        String str2;
        d c2;
        l.d(activity, "");
        l.d(str, "");
        l.d(aVar, "");
        if (i2 == 241) {
            str2 = "click_my_prop";
        } else if (i2 == 242) {
            str2 = "click_favorite_prop";
        } else {
            throw new IllegalStateException("not support favorite login method".toString());
        }
        d c3 = c();
        if ((c3 == null || !c3.b()) && (c2 = c()) != null) {
            c2.b(false, new PrivacyCert(new j("1027"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
        }
        g.a().A().a(activity, str, str2, bundle, new b(this, aVar));
    }
}
