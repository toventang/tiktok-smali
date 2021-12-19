package com.ss.android.ugc.aweme.sticker;

import android.os.Build;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.e;
import com.bytedance.creativex.recorder.sticker.panel.g;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter;
import com.ss.android.ugc.aweme.sticker.panel.guide.j;
import com.ss.android.ugc.aweme.sticker.panel.guide.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;
import java.lang.reflect.Type;

public final class k {
    static {
        Covode.recordClassIndex(88198);
    }

    public static final class b implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f134938a = {new y(b.class, "gameApiComponent", "getGameApiComponent()Lcom/ss/android/ugc/aweme/sticker/GameStickerApiComponent;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f134939b;

        /* renamed from: c  reason: collision with root package name */
        private final h.h.d f134940c;

        static {
            Covode.recordClassIndex(88200);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            e eVar = (e) this.f134940c.a(this, f134938a[0]);
            if (eVar != null) {
                z = eVar.b();
            }
            return Boolean.valueOf(z);
        }

        b(f fVar) {
            this.f134939b = fVar;
            this.f134940c = com.bytedance.o.b.a.b(fVar, e.class);
        }
    }

    public static final class a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f134937a;

        static {
            Covode.recordClassIndex(88199);
        }

        a(ShortVideoContext shortVideoContext) {
            this.f134937a = shortVideoContext;
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.guide.j
        public final com.ss.android.ugc.aweme.sticker.panel.guide.i a(FrameLayout frameLayout) {
            l.d(frameLayout, "");
            ShortVideoContext shortVideoContext = this.f134937a;
            l.d(shortVideoContext, "");
            m.c cVar = m.c.f135198a;
            l.d(cVar, "");
            com.ss.android.ugc.aweme.sticker.panel.guide.b bVar = new com.ss.android.ugc.aweme.sticker.panel.guide.b(cVar, (byte) 0);
            bVar.a(new m.a(shortVideoContext));
            bVar.f135143a = new m.b(shortVideoContext);
            return new DefaultStickerGuidePresenter(bVar, frameLayout);
        }
    }

    public static final j a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        return new a(shortVideoContext);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Boolean, Boolean> {
        final /* synthetic */ e $activity;

        static {
            Covode.recordClassIndex(88201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i2 = Build.VERSION.SDK_INT;
            }
            return false;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<e.a, z> {
        final /* synthetic */ f $diContainer;

        static {
            Covode.recordClassIndex(88202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f28470a = k.a((androidx.fragment.app.e) this.$diContainer.a((Type) androidx.fragment.app.e.class, (String) null));
            aVar2.f28471b = k.a(this.$diContainer);
            f fVar = this.$diContainer;
            l.d(fVar, "");
            aVar2.f28472c = new com.ss.android.ugc.gamora.recorder.sticker.b.a(fVar);
            aVar2.f28473d = com.ss.android.ugc.aweme.setting.i.j.a();
            return z.f158842a;
        }
    }

    public static final h.f.a.a<Boolean> a(f fVar) {
        l.d(fVar, "");
        return new b(fVar);
    }

    public static final h.f.a.b<Boolean, Boolean> a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        return new c(eVar);
    }

    public static final g a(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        return new g(fVar, bVar, R.id.dj5, new d(fVar));
    }
}
