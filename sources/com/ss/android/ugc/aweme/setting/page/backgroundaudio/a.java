package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dc.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f122424a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f122425b = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(80279);
    }

    public final BGAudioViewModel c() {
        return (BGAudioViewModel) this.f122425b.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    static final class c extends m implements h.f.a.a<BGAudioViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BGAudioViewModel invoke() {
            ac a2 = ae.a(this.this$0.f122424a, (ad.b) null).a(BGAudioViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h d() {
        c().f122419a.observe(this.f122424a.getViewLifecycleOwner(), new C3166a(this));
        return (com.ss.android.ugc.aweme.be.h) super.d();
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        Boolean value = c().f122419a.getValue();
        if (value == null) {
            value = false;
        }
        l.b(value, "");
        boolean booleanValue = value.booleanValue();
        String string = this.f122424a.getString(R.string.vx);
        l.b(string, "");
        return new com.ss.android.ugc.aweme.be.h(booleanValue, string, new b(this), false, null, null, null, null, null, false, 16376);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.a$a  reason: collision with other inner class name */
    static final class C3166a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122426a;

        static {
            Covode.recordClassIndex(80280);
        }

        C3166a(a aVar) {
            this.f122426a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f122426a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h>() {
                /* class com.ss.android.ugc.aweme.setting.page.backgroundaudio.a.C3166a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(80281);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
                    com.ss.android.ugc.aweme.be.h hVar2 = hVar;
                    l.d(hVar2, "");
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, booleanValue, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
        }
    }

    public a(Fragment fragment) {
        l.d(fragment, "");
        this.f122424a = fragment;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122427a;

        static {
            Covode.recordClassIndex(80282);
        }

        b(a aVar) {
            this.f122427a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BGAudioViewModel c2 = this.f122427a.c();
            boolean z = !((com.ss.android.ugc.aweme.be.h) this.f122427a.l()).f68599c;
            com.ss.android.ugc.aweme.feed.experiment.c.a().storeBoolean("IsBackgroundAudioEnabled", z);
            c2.f122419a.setValue(Boolean.valueOf(z));
        }
    }
}
