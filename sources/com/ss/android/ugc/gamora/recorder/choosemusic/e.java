package com.ss.android.ugc.gamora.recorder.choosemusic;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.vesdk.VEListener;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final androidx.fragment.app.e f147561a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f147562b;

    /* renamed from: c  reason: collision with root package name */
    final j f147563c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a f147564d;

    /* renamed from: e  reason: collision with root package name */
    public final a f147565e;

    /* renamed from: f  reason: collision with root package name */
    final ShortVideoContext f147566f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.b.b f147567g;

    static {
        Covode.recordClassIndex(97238);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(97240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(new PrivacyCert(new com.bytedance.bpea.basics.j("1010"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(97241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f147562b.b()) {
                this.this$0.f147562b.d().a("ChooseMusicScene", com.bytedance.bpea.store.a.a.m());
            } else {
                this.this$0.f147562b.b(false, com.bytedance.bpea.store.a.a.m());
            }
            return z.f158842a;
        }
    }

    static String a(ShortVideoContext shortVideoContext) {
        Mission mission = PublishExtensionModel.fromString(shortVideoContext.af.f124735c).mission;
        if (mission != null && !mission.isMusicToasted()) {
            return mission.getMusicId();
        }
        return null;
    }

    static String b(ShortVideoContext shortVideoContext) {
        Mission mission = PublishExtensionModel.fromString(shortVideoContext.af.f124735c).mission;
        if (mission == null) {
            return null;
        }
        return mission.getMissionId();
    }

    public final void a(PrivacyCert privacyCert) {
        this.f147562b.ag();
        if (this.f147566f.f124757b.r != null) {
            this.f147563c.E().e();
        }
        if (this.f147562b.b()) {
            this.f147562b.d().b("ChooseMusicScene", privacyCert);
        } else if (this.f147567g.isCurrentTabNeedCamera()) {
            this.f147562b.a(false, privacyCert);
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.cz.a.d, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(97239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.cz.a.d dVar) {
            com.ss.android.ugc.aweme.cz.a.d dVar2 = dVar;
            l.d(dVar2, "");
            this.this$0.a(new PrivacyCert(new com.bytedance.bpea.basics.j("1009"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            this.this$0.f147565e.onChooseMusicDone(dVar2.f79323a, dVar2.f79324b, dVar2.f79325c, dVar2.f79326d);
            com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a aVar = this.this$0.f147564d;
            if (aVar != null) {
                aVar.a(!dVar2.f79323a);
            }
            if (dVar2.f79323a) {
                com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a aVar2 = this.this$0.f147564d;
                if (aVar2 != null) {
                    aVar2.a(false);
                }
            } else {
                com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a aVar3 = this.this$0.f147564d;
                if (aVar3 != null) {
                    aVar3.a(true);
                }
            }
            this.this$0.f147565e.handleChooseMusic(dVar2);
            this.this$0.a(dVar2.f79323a);
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        if (com.ss.android.ugc.aweme.sticker.f.e.a(this.f147563c) != null) {
            this.f147565e.setStickerMusicCancelState(new p<>(com.ss.android.ugc.aweme.sticker.f.e.a(this.f147563c), Boolean.valueOf(z)));
        }
    }

    static final class d implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147568a;

        static {
            Covode.recordClassIndex(97242);
        }

        d(e eVar) {
            this.f147568a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:116:0x030e, code lost:
            if (r11 != null) goto L_0x02bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
            if (r1.f() != false) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
            if (r1 != false) goto L_0x011c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0247  */
        @Override // com.ss.android.vesdk.VEListener.j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r22) {
            /*
            // Method dump skipped, instructions count: 854
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.e.d.a(int):void");
        }
    }

    public e(androidx.fragment.app.e eVar, com.bytedance.creativex.recorder.b.a.d dVar, j jVar, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a aVar, a aVar2, com.ss.android.ugc.gamora.recorder.b.b bVar, ShortVideoContext shortVideoContext) {
        l.d(eVar, "");
        l.d(dVar, "");
        l.d(jVar, "");
        l.d(aVar2, "");
        l.d(bVar, "");
        l.d(shortVideoContext, "");
        this.f147561a = eVar;
        this.f147562b = dVar;
        this.f147563c = jVar;
        this.f147564d = aVar;
        this.f147565e = aVar2;
        this.f147567g = bVar;
        this.f147566f = shortVideoContext;
    }
}
