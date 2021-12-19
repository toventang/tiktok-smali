package com.ss.android.ugc.aweme.tools.live.a;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.b.d;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.vesdk.VESafeAreaParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f140225a;

    /* renamed from: b  reason: collision with root package name */
    public final f f140226b;

    /* renamed from: c  reason: collision with root package name */
    private final j f140227c;

    /* renamed from: d  reason: collision with root package name */
    private final h f140228d = i.a((h.f.a.a) b.f140232a);

    static {
        Covode.recordClassIndex(91621);
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.live.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f140232a = new b();

        static {
            Covode.recordClassIndex(91623);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.live.a invoke() {
            return new com.ss.android.ugc.aweme.tools.live.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return (k) this.f140228d.getValue();
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f140226b = fVar;
        this.f140225a = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) fVar.b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
        this.f140227c = (j) fVar.b(j.class, null);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new d(ig.a(R.string.cx3), ig.a(R.string.f_b), "live", aVar.b().aj, new C3699a(this, aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) ae.a(aVar.a(), (ad.b) null).a(RecordLiveViewModel.class);
        IRecordingOperationPanel iRecordingOperationPanel = aVar.f145637a;
        if (iRecordingOperationPanel == null) {
            l.a("recordingOperationPanel");
        }
        recordLiveViewModel.f140216a = iRecordingOperationPanel;
        com.bytedance.creativex.recorder.b.a.d d2 = aVar.d();
        l.d(d2, "");
        recordLiveViewModel.f140217b = d2;
        recordLiveViewModel.f140219d = aVar.b();
        com.ss.android.ugc.asve.recorder.c.a c2 = aVar.c();
        l.d(c2, "");
        recordLiveViewModel.f140218c = c2;
        c.s.a(aVar.a());
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$a  reason: collision with other inner class name */
    public static final class C3699a implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f140230b;

        /* renamed from: c  reason: collision with root package name */
        private Effect f140231c;

        static {
            Covode.recordClassIndex(91622);
        }

        C3699a(a aVar, com.ss.android.ugc.gamora.a.a aVar2) {
            this.f140229a = aVar;
            this.f140230b = aVar2;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(d dVar, l.a aVar) {
            j value;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f140229a.f140225a;
            if (aVar2 != null) {
                aVar2.a(2, false);
            }
            if (!(this.f140231c == null || !aVar.f147481b || (value = this.f140230b.f().getValue()) == null)) {
                e.a(value, this.f140231c);
            }
            if (aVar.f147480a) {
                this.f140230b.g().j();
            }
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(d dVar, l.a aVar) {
            String musicId;
            String stickerId;
            String musicId2;
            Long l2;
            String stickerId2;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f E;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f E2;
            Effect effect;
            j value;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f140229a.f140225a;
            if (aVar2 != null) {
                aVar2.c(null);
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar3 = this.f140229a.f140225a;
            if (aVar3 != null) {
                aVar3.a(2, true);
            }
            this.f140230b.g().a("live");
            ac a2 = ae.a(this.f140230b.a(), (ad.b) null).a(ShortVideoContextViewModel.class);
            h.f.b.l.b(a2, "");
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a2;
            ApiCenter a3 = ApiCenter.a.a(this.f140230b.a());
            ((com.ss.android.ugc.aweme.shortvideo.h.a) a3.a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).b(false);
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            h.f.b.l.b(shortVideoContext, "");
            if (shortVideoContext.f124757b.f124711f.isEmpty()) {
                this.f140230b.d().a(0);
                j value2 = this.f140230b.f().getValue();
                if (value2 != null) {
                    effect = e.a(value2);
                } else {
                    effect = null;
                }
                this.f140231c = effect;
                if (!(effect == null || (value = this.f140230b.f().getValue()) == null)) {
                    e.a(value, (Effect) null);
                }
                this.f140230b.g().e(false);
            }
            Mission a4 = c.f115633l.a(this.f140230b.b().af.f124735c);
            if (a4 != null && (!(((musicId = a4.getMusicId()) == null || musicId.length() == 0) && ((stickerId2 = a4.getStickerId()) == null || stickerId2.length() == 0)) && (((stickerId = a4.getStickerId()) == null || stickerId.length() == 0 || !a4.isStickerToasted()) && ((musicId2 = a4.getMusicId()) == null || musicId2.length() == 0 || !a4.isMusicToasted())))) {
                if (!a4.isMusicToasted()) {
                    String musicId3 = a4.getMusicId();
                    com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                    if (cVar != null) {
                        l2 = Long.valueOf(cVar.id);
                    } else {
                        l2 = null;
                    }
                    if (!TextUtils.equals(musicId3, String.valueOf(l2))) {
                        a4.setMusicToasted(true);
                        this.f140230b.b().af.f124735c = c.f115633l.a(this.f140230b.b().af.f124735c, a4);
                    }
                }
                com.ss.android.ugc.tools.view.widget.d.b(this.f140230b.a(), R.string.d54).b();
            }
            this.f140230b.d().D().getMediaController().a(0, (VESafeAreaParams[]) null);
            ((com.ss.android.ugc.gamora.recorder.k.a) a3.a(com.ss.android.ugc.gamora.recorder.k.a.class)).b(false);
            ShortVideoContext shortVideoContext2 = shortVideoContextViewModel.f124769a;
            h.f.b.l.b(shortVideoContext2, "");
            if (shortVideoContext2.f124757b.r != null) {
                j value3 = this.f140230b.f().getValue();
                if (!(value3 == null || (E2 = value3.E()) == null)) {
                    E2.d();
                }
                j value4 = this.f140230b.f().getValue();
                if (!(value4 == null || (E = value4.E()) == null)) {
                    E.b();
                }
            }
            com.ss.android.ugc.aweme.z.a aVar4 = (com.ss.android.ugc.aweme.z.a) a3.b(com.ss.android.ugc.aweme.z.a.class);
            if (aVar4 != null) {
                aVar4.a(false);
            }
            return false;
        }
    }
}
