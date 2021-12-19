package com.ss.android.ugc.aweme.sticker.types.game;

import android.content.SharedPreferences;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.o;
import com.bytedance.creativex.recorder.b.a.w;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.sticker.types.game.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.a.c;

public final class a {
    static {
        Covode.recordClassIndex(88891);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$a  reason: collision with other inner class name */
    public static class C3550a implements k {

        /* renamed from: a  reason: collision with root package name */
        private final d f136079a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.creativex.recorder.sticker.a.a f136080b;

        static {
            Covode.recordClassIndex(88893);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.k
        public final int a() {
            return this.f136079a.N();
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.k
        public final void b() {
            e.a(this.f136080b, (Effect) null);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.k
        public final void c() {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(i.f115645a, "publish", 0).edit();
            edit.putInt("record_mode", 1);
            com.bytedance.common.utility.e.a.a(edit);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.k
        public final void a(k.a aVar) {
            PrivacyCert privacyCert;
            if (AnonymousClass1.f136078a[aVar.ordinal()] != 1) {
                privacyCert = new PrivacyCert(new j("1041"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()});
            } else {
                privacyCert = new PrivacyCert(new j("1040"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()});
            }
            this.f136079a.a(false, privacyCert, (String) null);
        }

        private C3550a(d dVar, com.bytedance.creativex.recorder.sticker.a.a aVar) {
            this.f136079a = dVar;
            this.f136080b = aVar;
        }

        /* synthetic */ C3550a(d dVar, com.bytedance.creativex.recorder.sticker.a.a aVar, byte b2) {
            this(dVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public final m f136081a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.creativex.recorder.sticker.a.a f136082b;

        static {
            Covode.recordClassIndex(88894);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void b() {
            this.f136081a.c(true);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void d() {
            this.f136081a.c(true);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void e() {
            this.f136081a.a(false);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void a() {
            x xVar = new x("game_record_full");
            xVar.f28214a = 2;
            this.f136081a.b(xVar);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void c() {
            this.f136081a.a(new w(com.ss.android.ugc.aweme.tools.i.NORMAL));
            this.f136081a.a(new o(1));
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.game.l
        public final void f() {
            m mVar = this.f136081a;
            x xVar = new x("quit game");
            xVar.f28214a = 6;
            xVar.f28219f = new Runnable() {
                /* class com.ss.android.ugc.aweme.sticker.types.game.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88895);
                }

                public final void run() {
                    if (b.this.f136082b != null) {
                        b.this.f136082b.b(true);
                    }
                }
            };
            mVar.b(xVar);
        }

        private b(m mVar, com.bytedance.creativex.recorder.sticker.a.a aVar) {
            this.f136081a = mVar;
            this.f136082b = aVar;
        }

        /* synthetic */ b(m mVar, com.bytedance.creativex.recorder.sticker.a.a aVar, byte b2) {
            this(mVar, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f136078a;

        static {
            Covode.recordClassIndex(88892);
            int[] iArr = new int[k.a.values().length];
            f136078a = iArr;
            try {
                iArr[k.a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static m a(androidx.appcompat.app.d dVar, c cVar, d dVar2, m mVar, com.bytedance.creativex.recorder.sticker.a.a aVar, FrameLayout frameLayout, com.ss.android.ugc.aweme.sticker.types.game.a.a aVar2) {
        return new b(dVar, cVar, dVar2, new p(frameLayout), new C3550a(dVar2, aVar, (byte) 0), new b(mVar, aVar, (byte) 0), aVar2);
    }
}
