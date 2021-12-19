package com.ss.android.ugc.aweme.utils;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.api.LinkPrivacyPopupApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class ei {

    /* renamed from: d  reason: collision with root package name */
    public static final a f142850d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f142851a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f142852b;

    /* renamed from: c  reason: collision with root package name */
    public final i f142853c;

    /* renamed from: e  reason: collision with root package name */
    private final h f142854e = h.i.a((h.f.a.a) b.f142856a);

    /* renamed from: f  reason: collision with root package name */
    private final h f142855f = h.i.a((h.f.a.a) c.f142857a);

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142859a = new e();

        static {
            Covode.recordClassIndex(93477);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f142861a = new g();

        static {
            Covode.recordClassIndex(93479);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(93472);
    }

    public final Keva a() {
        return (Keva) this.f142854e.getValue();
    }

    public final LinkPrivacyPopupApi b() {
        return (LinkPrivacyPopupApi) this.f142855f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93473);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142856a = new b();

        static {
            Covode.recordClassIndex(93474);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("LINK_PRIVACY_DIALOG_SHOWED");
        }
    }

    static final class c extends m implements h.f.a.a<LinkPrivacyPopupApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f142857a = new c();

        static {
            Covode.recordClassIndex(93475);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkPrivacyPopupApi invoke() {
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(LinkPrivacyPopupApi.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ei f142858a;

        static {
            Covode.recordClassIndex(93476);
        }

        d(ei eiVar) {
            this.f142858a = eiVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142858a.a().storeBoolean(this.f142858a.f142851a, true);
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ei f142860a;

        static {
            Covode.recordClassIndex(93478);
        }

        public f(ei eiVar) {
            this.f142860a = eiVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.ss.android.ugc.aweme.setting.model.i iVar = (com.ss.android.ugc.aweme.setting.model.i) obj;
            ei eiVar = this.f142860a;
            l.b(iVar, "");
            if (iVar.f122329a) {
                Fragment a2 = eiVar.f142853c.a("Privacy_Guide");
                if (a2 == null || !(a2 instanceof com.ss.android.ugc.aweme.setting.ui.a.a)) {
                    boolean z2 = eiVar.f142852b;
                    Boolean bool = iVar.f122330b;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_sharer", z2);
                    bundle.putBoolean("privacy_toggle", z);
                    com.ss.android.ugc.aweme.setting.ui.a.a aVar = new com.ss.android.ugc.aweme.setting.ui.a.a();
                    aVar.setArguments(bundle);
                    n a3 = eiVar.f142853c.a();
                    l.b(a3, "");
                    a3.a(R.id.cic, aVar, "Privacy_Guide").c();
                    r.onEventV3("link_privacy_pop_up");
                    eiVar.b().updateLinkPrivacyPopupStatus(true).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(eiVar), e.f142859a);
                }
            } else if (iVar.f122331c) {
                eiVar.a().storeBoolean(eiVar.f142851a, true);
            }
        }
    }

    public ei(String str, boolean z, i iVar) {
        l.d(str, "");
        l.d(iVar, "");
        this.f142851a = str;
        this.f142852b = z;
        this.f142853c = iVar;
    }
}
