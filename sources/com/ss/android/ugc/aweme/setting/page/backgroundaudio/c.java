package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dc.g;
import com.ss.android.ugc.aweme.feed.experiment.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f122429a;

    /* renamed from: b  reason: collision with root package name */
    public final b f122430b;

    /* renamed from: c  reason: collision with root package name */
    private final h f122431c = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(80285);
    }

    public final BGAudioViewModel a() {
        return (BGAudioViewModel) this.f122431c.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.g, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.g b() {
        return b();
    }

    static final class d extends m implements h.f.a.a<BGAudioViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(80290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BGAudioViewModel invoke() {
            ac a2 = ae.a(this.this$0.f122429a, (ad.b) null).a(BGAudioViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.g d() {
        a().f122420b.observe(this.f122429a.getViewLifecycleOwner(), new a(this));
        return (com.ss.android.ugc.aweme.be.g) super.d();
    }

    @Override // com.ss.android.ugc.aweme.dc.g
    public final com.ss.android.ugc.aweme.be.g c() {
        boolean z;
        String string = this.f122429a.getString(this.f122430b.getTitle());
        l.b(string, "");
        if (a().f122420b.getValue() == this.f122430b.getPlayOrder()) {
            z = true;
        } else {
            z = false;
        }
        return new com.ss.android.ugc.aweme.be.g(z, string, com.bytedance.tux.c.c.a(new b(this)), new View$OnClickListenerC3167c(this));
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122432a;

        static {
            Covode.recordClassIndex(80286);
        }

        a(c cVar) {
            this.f122432a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final c.a aVar = (c.a) obj;
            this.f122432a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.g, com.ss.android.ugc.aweme.be.g>(this) {
                /* class com.ss.android.ugc.aweme.setting.page.backgroundaudio.c.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(80287);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.g invoke(com.ss.android.ugc.aweme.be.g gVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.be.g gVar2 = gVar;
                    l.d(gVar2, "");
                    if (aVar == this.this$0.f122432a.f122430b.getPlayOrder()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener = gVar2.f68589d;
                    String str = gVar2.f68590e;
                    com.bytedance.tux.table.cell.b bVar = gVar2.f68591f;
                    com.bytedance.tux.c.a aVar = gVar2.f68592g;
                    boolean z2 = gVar2.f68593h;
                    boolean z3 = gVar2.f68594i;
                    String str2 = gVar2.f68595j;
                    boolean z4 = gVar2.f68596k;
                    boolean z5 = gVar2.f68597l;
                    View.OnClickListener onClickListener = gVar2.f68598m;
                    l.d(str, "");
                    l.d(bVar, "");
                    return new com.ss.android.ugc.aweme.be.g(z, onCheckedChangeListener, str, bVar, aVar, z2, z3, str2, z4, z5, onClickListener);
                }
            });
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(80288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.this$0.f122430b.getIcon();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC3167c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122433a;

        static {
            Covode.recordClassIndex(80289);
        }

        View$OnClickListenerC3167c(c cVar) {
            this.f122433a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!((com.ss.android.ugc.aweme.be.g) this.f122433a.l()).f68588c) {
                BGAudioViewModel a2 = this.f122433a.a();
                c.a playOrder = this.f122433a.f122430b.getPlayOrder();
                l.d(playOrder, "");
                l.d(playOrder, "");
                com.ss.android.ugc.aweme.feed.experiment.c.a().storeInt("BackgroundAudioPlayOrder", playOrder.ordinal());
                a2.f122420b.setValue(playOrder);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Fragment fragment, b bVar) {
        super((byte) 0);
        l.d(fragment, "");
        l.d(bVar, "");
        this.f122429a = fragment;
        this.f122430b = bVar;
    }
}
