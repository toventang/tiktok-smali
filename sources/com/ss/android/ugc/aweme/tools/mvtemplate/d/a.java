package com.ss.android.ugc.aweme.tools.mvtemplate.d;

import android.text.TextUtils;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.choosemusic.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class a implements com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    public RecordMVViewModel f140808a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f140809b;

    /* renamed from: c  reason: collision with root package name */
    public final d f140810c;

    /* renamed from: d  reason: collision with root package name */
    public final f f140811d;

    /* renamed from: e  reason: collision with root package name */
    private final h f140812e = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(91943);
    }

    static final class b extends m implements h.f.a.a<o> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(91945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return new o(this.this$0.f140811d);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return (k) this.f140812e.getValue();
    }

    public static final /* synthetic */ RecordMVViewModel a(a aVar) {
        RecordMVViewModel recordMVViewModel = aVar.f140808a;
        if (recordMVViewModel == null) {
            l.a("mvViewModel");
        }
        return recordMVViewModel;
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f140811d = fVar;
        this.f140809b = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) fVar.b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
        Object a2 = fVar.a(d.class);
        l.b(a2, "");
        this.f140810c = (d) a2;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        boolean z;
        l.d(aVar, "");
        String string = aVar.a().getString(R.string.f_c);
        l.b(string, "");
        RecordMVViewModel recordMVViewModel = this.f140808a;
        if (recordMVViewModel == null) {
            l.a("mvViewModel");
        }
        if (com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(recordMVViewModel.a())) {
            RecordMVViewModel recordMVViewModel2 = this.f140808a;
            if (recordMVViewModel2 == null) {
                l.a("mvViewModel");
            }
            if (recordMVViewModel2.f140632a != null) {
                com.ss.android.ugc.aweme.tools.mvtemplate.e.b.f140823a = "mv_reuse";
                z = true;
                return new com.ss.android.ugc.gamora.recorder.b.d(string, "record_mode_mv", "mv", z, new C3724a(this, aVar));
            }
        }
        z = false;
        return new com.ss.android.ugc.gamora.recorder.b.d(string, "record_mode_mv", "mv", z, new C3724a(this, aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        JediViewModel a2 = t.a(aVar.a()).a(RecordMVViewModel.class);
        l.b(a2, "");
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) a2;
        this.f140808a = recordMVViewModel;
        if (recordMVViewModel == null) {
            l.a("mvViewModel");
        }
        ShortVideoContext b2 = aVar.b();
        l.d(b2, "");
        recordMVViewModel.f140633b = b2;
        RecordMVViewModel recordMVViewModel2 = this.f140808a;
        if (recordMVViewModel2 == null) {
            l.a("mvViewModel");
        }
        recordMVViewModel2.f140632a = ((ShortVideoContext) this.f140811d.a((Type) ShortVideoContext.class, (String) null)).n;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a$a  reason: collision with other inner class name */
    public static final class C3724a implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f140814b;

        /* renamed from: c  reason: collision with root package name */
        private Effect f140815c;

        static {
            Covode.recordClassIndex(91944);
        }

        C3724a(a aVar, com.ss.android.ugc.gamora.a.a aVar2) {
            this.f140813a = aVar;
            this.f140814b = aVar2;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            j value;
            j value2;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f E;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            if (!(a.a(this.f140813a).a().f124757b.r == null || (value2 = this.f140814b.f().getValue()) == null || (E = value2.E()) == null)) {
                E.e();
            }
            if (!(this.f140815c == null || !aVar.f147481b || (value = this.f140814b.f().getValue()) == null)) {
                e.a(value, this.f140815c);
            }
            if (!aVar.f147480a) {
                return false;
            }
            this.f140814b.g().j();
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            Effect effect;
            String musicId;
            String stickerId;
            String musicId2;
            String str;
            String str2;
            String stickerId2;
            d dVar2;
            j value;
            j value2;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f E;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            ApiCenter a2 = ApiCenter.a.a(this.f140814b.a());
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f140813a.f140809b;
            Integer num = null;
            if (aVar2 != null) {
                aVar2.c(null);
            }
            ((com.ss.android.ugc.aweme.shortvideo.h.a) a2.a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).b(false);
            a.C3961a.a(this.f140814b.a()).tryHideMusicTips();
            if (!(a.a(this.f140813a).a().f124757b.r == null || (value2 = this.f140814b.f().getValue()) == null || (E = value2.E()) == null)) {
                E.d();
            }
            j value3 = this.f140814b.f().getValue();
            if (value3 != null) {
                effect = e.a(value3);
            } else {
                effect = null;
            }
            this.f140815c = effect;
            if (!(effect == null || (value = this.f140814b.f().getValue()) == null)) {
                e.a(value, (Effect) null);
            }
            Mission a3 = c.f115633l.a(a.a(this.f140813a).a().af.f124735c);
            if (a3 != null && (!(((musicId = a3.getMusicId()) == null || musicId.length() == 0) && ((stickerId2 = a3.getStickerId()) == null || stickerId2.length() == 0)) && (((stickerId = a3.getStickerId()) == null || stickerId.length() == 0 || !a3.isStickerToasted()) && ((musicId2 = a3.getMusicId()) == null || musicId2.length() == 0 || !a3.isMusicToasted())))) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null) {
                    str = cVar.getMusicId();
                } else {
                    str = null;
                }
                if (TextUtils.equals(a3.getMusicId(), str)) {
                    com.ss.android.ugc.tools.view.widget.d.b(this.f140814b.a(), R.string.d57).b();
                    com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("reason", 6).a("mission_id", a3.getMissionId()).a("page_source", a3.getEnterFrom());
                    com.ss.android.ugc.aweme.account.model.a e2 = c.u.e();
                    if (e2 != null) {
                        num = Integer.valueOf(e2.m());
                    }
                    com.ss.android.ugc.tools.f.b a5 = a4.a("creator_followers", num);
                    if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().j()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    r.a("mission_requirement_toast", a5.a("creator_type", str2).f149193a);
                }
            }
            com.ss.android.ugc.aweme.z.a aVar3 = (com.ss.android.ugc.aweme.z.a) a2.b(com.ss.android.ugc.aweme.z.a.class);
            if (aVar3 != null) {
                aVar3.a(false);
            }
            if (!this.f140813a.f140810c.b() && (dVar2 = (d) a2.b(d.class)) != null) {
                dVar2.b(false, new PrivacyCert(new com.bytedance.bpea.basics.j("1024"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()}));
            }
            return false;
        }
    }
}
