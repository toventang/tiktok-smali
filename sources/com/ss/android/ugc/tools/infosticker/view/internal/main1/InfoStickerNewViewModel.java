package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.infosticker.a.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.l;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.d.f;
import java.util.concurrent.LinkedBlockingQueue;

public final class InfoStickerNewViewModel extends HumbleViewModel implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f149849a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f149850b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedBlockingQueue<InfoStickerEffect> f149851c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f149852d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.b.a f149853e;

    /* renamed from: f  reason: collision with root package name */
    private final c f149854f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.a f149855g;

    static {
        Covode.recordClassIndex(98657);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.s.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerNewViewModel f149858a;

        static {
            Covode.recordClassIndex(98660);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void a() {
            if (com.ss.android.ugc.aweme.shortvideo.s.c.c(this.f149858a.f149850b)) {
                this.f149858a.a();
            }
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f149851c.clear();
        this.f149853e.dispose();
        com.ss.android.ugc.aweme.shortvideo.s.b.b(this.f149854f);
    }

    public final void a() {
        if (!isDestroyed() && this.f149852d && !this.f149849a && !com.ss.android.ugc.aweme.shortvideo.s.c.c(this.f149850b)) {
            this.f149849a = true;
            if (this.f149851c.poll() == null) {
                this.f149849a = false;
                return;
            }
            this.f149853e.a(this.f149855g.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerNewViewModel f149857a;

        static {
            Covode.recordClassIndex(98659);
        }

        b(InfoStickerNewViewModel infoStickerNewViewModel) {
            this.f149857a = infoStickerNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149857a.f149849a = false;
            this.f149857a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f<j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerNewViewModel f149856a;

        static {
            Covode.recordClassIndex(98658);
        }

        a(InfoStickerNewViewModel infoStickerNewViewModel) {
            this.f149856a = infoStickerNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(j jVar) {
            j jVar2 = jVar;
            if (jVar2.f149366b.f149381a == l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS || jVar2.f149366b.f149381a == l.INFO_STICKER_STATE_DOWNLOAD_FAILED) {
                this.f149856a.f149849a = false;
                this.f149856a.a();
            }
        }
    }
}
