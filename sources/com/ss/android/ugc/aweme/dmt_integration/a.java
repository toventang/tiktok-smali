package com.ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditVideoSegmentDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.ImportVideoInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.ar;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.bc;
import com.ss.android.ugc.aweme.port.in.bh;
import com.ss.android.ugc.aweme.port.in.bj;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.port.in.bl;
import com.ss.android.ugc.aweme.port.in.bm;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.property.ez;
import com.ss.android.ugc.aweme.services.AndroidAssetServiceImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.ImportVideoServiceImpl;
import com.ss.android.ugc.aweme.services.InternalRecordServiceImpl;
import com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl;
import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.servicimpl.ae;
import com.ss.android.ugc.aweme.servicimpl.af;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import java.lang.reflect.Type;

public final class a implements com.ss.android.ugc.aweme.port.in.u {
    private final h.h A = h.i.a((h.f.a.a) w.f82920a);
    private final h.h B = h.i.a((h.f.a.a) i.f82906a);

    /* renamed from: a  reason: collision with root package name */
    public final Application f82884a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f82885b = h.i.a((h.f.a.a) q.f82914a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f82886c = h.i.a((h.f.a.a) p.f82913a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f82887d = h.i.a((h.f.a.a) h.f82905a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f82888e = h.i.a(h.m.SYNCHRONIZED, e.f82902a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f82889f = h.i.a((h.f.a.a) d.f82901a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f82890g = h.i.a((h.f.a.a) j.f82907a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f82891h = h.i.a((h.f.a.a) u.f82918a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f82892i = h.i.a((h.f.a.a) t.f82917a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f82893j = h.i.a((h.f.a.a) l.f82909a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f82894k = h.i.a((h.f.a.a) y.f82922a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f82895l = h.i.a((h.f.a.a) g.f82904a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f82896m = h.i.a((h.f.a.a) b.f82899a);
    private final h.h n = h.i.a((h.f.a.a) s.f82916a);
    private final h.h o = h.i.a((h.f.a.a) m.f82910a);
    private final h.h p = h.i.a((h.f.a.a) v.f82919a);
    private final h.h q = h.i.a((h.f.a.a) r.f82915a);
    private final h.h r = h.i.a((h.f.a.a) aa.f82898a);
    private final h.h s = h.i.a((h.f.a.a) new z(this));
    private final h.h t = h.i.a((h.f.a.a) k.f82908a);
    private final h.h u = h.i.a((h.f.a.a) o.f82912a);
    private final h.h v = h.i.a((h.f.a.a) c.f82900a);
    private final h.h w = h.i.a((h.f.a.a) f.f82903a);
    private final h.h x = h.i.a((h.f.a.a) C1949a.f82897a);
    private final h.h y = h.i.a((h.f.a.a) n.f82911a);
    private final h.h z = h.i.a((h.f.a.a) x.f82921a);

    static {
        Covode.recordClassIndex(51648);
    }

    private final IFoundationAVServiceProxy R() {
        return (IFoundationAVServiceProxy) this.f82885b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final ap I() {
        return (ap) this.y.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bl J() {
        return (bl) this.z.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bh K() {
        return (bh) this.A.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.ak.b L() {
        return (com.ss.android.ugc.aweme.ak.b) this.B.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.v b() {
        return (com.ss.android.ugc.aweme.port.in.v) this.f82886c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.internal.c c() {
        return (com.ss.android.ugc.aweme.port.internal.c) this.f82887d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.internal.b d() {
        return (com.ss.android.ugc.aweme.port.internal.b) this.f82888e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final AVPreferences e() {
        return (AVPreferences) this.f82889f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.internal.f f() {
        return (com.ss.android.ugc.aweme.port.internal.f) this.f82890g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.cs.h.f g() {
        return (com.ss.android.ugc.aweme.cs.h.f) this.f82891h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final IVideoConfigService h() {
        return (IVideoConfigService) this.f82892i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final IVideoConfigService i() {
        return (IVideoConfigService) this.f82893j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bm j() {
        return (bm) this.f82894k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.common.c.b k() {
        return (com.ss.android.ugc.aweme.common.c.b) this.f82895l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.record.d l() {
        return (com.ss.android.ugc.aweme.record.d) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.az.a m() {
        return (com.ss.android.ugc.aweme.az.a) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.story.h.c.a.a n() {
        return (com.ss.android.ugc.aweme.story.h.c.a.a) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.publish.g o() {
        return (com.ss.android.ugc.aweme.publish.g) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.watermark.f p() {
        return (com.ss.android.ugc.aweme.watermark.f) this.r.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final ez q() {
        return (ez) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.filter.d.a r() {
        return (com.ss.android.ugc.aweme.filter.d.a) this.t.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.p s() {
        return (com.ss.android.ugc.aweme.port.in.p) this.v.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final void a() {
        com.ss.android.ugc.aweme.port.in.c.e();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final void v() {
        com.ss.android.ugc.aweme.port.in.c.d();
    }

    static final class aa extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.watermark.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f82898a = new aa();

        static {
            Covode.recordClassIndex(51650);
        }

        aa() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.watermark.i invoke() {
            return new com.ss.android.ugc.aweme.watermark.i();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<AndroidAssetServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82899a = new b();

        static {
            Covode.recordClassIndex(51651);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AndroidAssetServiceImpl invoke() {
            return new AndroidAssetServiceImpl();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.tools.music.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82900a = new c();

        static {
            Covode.recordClassIndex(51652);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.music.c invoke() {
            return new com.ss.android.ugc.aweme.tools.music.c();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.x.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f82902a = new e();

        static {
            Covode.recordClassIndex(51654);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.x.a invoke() {
            return new com.ss.android.ugc.aweme.x.a();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<AVDownloadServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f82904a = new g();

        static {
            Covode.recordClassIndex(51656);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVDownloadServiceImpl invoke() {
            return new AVDownloadServiceImpl();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.tools.draft.j.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f82905a = new h();

        static {
            Covode.recordClassIndex(51657);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.j.a invoke() {
            return new com.ss.android.ugc.aweme.tools.draft.j.a();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.s> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f82906a = new i();

        static {
            Covode.recordClassIndex(51658);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.s invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.editcut.s();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f82907a = new j();

        static {
            Covode.recordClassIndex(51659);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return new o();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.d.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f82908a = new k();

        static {
            Covode.recordClassIndex(51660);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.d.a.c invoke() {
            return new com.ss.android.ugc.aweme.filter.d.a.c();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.port.internal.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f82909a = new l();

        static {
            Covode.recordClassIndex(51661);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.port.internal.i invoke() {
            return new com.ss.android.ugc.aweme.port.internal.i();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ImportVideoServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f82910a = new m();

        static {
            Covode.recordClassIndex(51662);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImportVideoServiceImpl invoke() {
            return new ImportVideoServiceImpl();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.servicimpl.v> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f82911a = new n();

        static {
            Covode.recordClassIndex(51663);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.servicimpl.v invoke() {
            return new com.ss.android.ugc.aweme.servicimpl.v();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.d.a.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f82912a = new o();

        static {
            Covode.recordClassIndex(51664);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.d.a.g invoke() {
            return new com.ss.android.ugc.aweme.filter.d.a.g();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.servicimpl.x> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f82913a = new p();

        static {
            Covode.recordClassIndex(51665);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.servicimpl.x invoke() {
            return new com.ss.android.ugc.aweme.servicimpl.x();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.publish.h.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f82915a = new r();

        static {
            Covode.recordClassIndex(51667);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.publish.h.e invoke() {
            return new com.ss.android.ugc.aweme.publish.h.e();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<InternalRecordServiceImpl> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f82916a = new s();

        static {
            Covode.recordClassIndex(51668);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InternalRecordServiceImpl invoke() {
            return new InternalRecordServiceImpl();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.port.internal.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f82917a = new t();

        static {
            Covode.recordClassIndex(51669);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.port.internal.n invoke() {
            return new com.ss.android.ugc.aweme.port.internal.n();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f82919a = new v();

        static {
            Covode.recordClassIndex(51671);
        }

        v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.d invoke() {
            return new com.ss.android.ugc.aweme.story.d();
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<ae> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f82920a = new w();

        static {
            Covode.recordClassIndex(51672);
        }

        w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ae invoke() {
            return new ae();
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<af> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f82921a = new x();

        static {
            Covode.recordClassIndex(51673);
        }

        x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ af invoke() {
            return new af();
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.port.internal.o> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f82922a = new y();

        static {
            Covode.recordClassIndex(51674);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.port.internal.o invoke() {
            return new com.ss.android.ugc.aweme.port.internal.o();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final ar t() {
        return new com.ss.android.ugc.aweme.tools.music.b();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final void u() {
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
    }

    static final class q extends h.f.b.m implements h.f.a.a<IAVServiceProxy> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f82914a = new q();

        static {
            Covode.recordClassIndex(51666);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVServiceProxy invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            if (createIAVServiceProxybyMonsterPlugin != null) {
                return createIAVServiceProxybyMonsterPlugin;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.cs.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f82918a = new u();

        static {
            Covode.recordClassIndex(51670);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.cs.b invoke() {
            com.ss.android.ugc.aweme.cs.b bVar = new com.ss.android.ugc.aweme.cs.b();
            bVar.a(new AVStorageManagerImpl());
            return bVar;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<ez> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ez invoke() {
            return new ez(this.this$0.f82884a);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.z A() {
        com.ss.android.ugc.aweme.port.in.z accountService = R().getAccountService();
        h.f.b.l.b(accountService, "");
        return accountService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.r B() {
        com.ss.android.ugc.aweme.port.in.r bridgeService = R().getBridgeService();
        h.f.b.l.b(bridgeService, "");
        return bridgeService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final au C() {
        au networkService = R().getNetworkService();
        h.f.b.l.b(networkService, "");
        return networkService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bc D() {
        bc iStickerPropService = R().getIStickerPropService();
        h.f.b.l.b(iStickerPropService, "");
        return iStickerPropService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bj E() {
        bj uiService = R().getUiService();
        h.f.b.l.b(uiService, "");
        return uiService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final bk F() {
        bk unlockStickerService = R().unlockStickerService();
        h.f.b.l.b(unlockStickerService, "");
        return unlockStickerService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.google.gson.f G() {
        return (com.google.gson.f) this.w.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.google.gson.f H() {
        return (com.google.gson.f) this.x.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final boolean O() {
        com.ss.android.ugc.aweme.port.in.k kVar = k.a.f115657a;
        kVar.a();
        if (kVar.f115650c == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final an Q() {
        an localHashTagService = R().getLocalHashTagService();
        h.f.b.l.b(localHashTagService, "");
        return localHashTagService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.q w() {
        com.ss.android.ugc.aweme.port.in.q applicationService = R().getApplicationService();
        h.f.b.l.b(applicationService, "");
        return applicationService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final ag x() {
        ag challengeService = R().getChallengeService();
        h.f.b.l.b(challengeService, "");
        return challengeService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.x y() {
        com.ss.android.ugc.aweme.port.in.x regionService = R().getRegionService();
        h.f.b.l.b(regionService, "");
        return regionService;
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.port.in.s z() {
        com.ss.android.ugc.aweme.port.in.s commerceService = R().getCommerceService();
        h.f.b.l.b(commerceService, "");
        return commerceService;
    }

    static final class d extends h.f.b.m implements h.f.a.a<AVPreferences> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f82901a = new d();

        static {
            Covode.recordClassIndex(51653);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVPreferences invoke() {
            com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            h.f.b.l.b(application, "");
            return aVar.a(application, AVPreferences.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final long M() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getAVAppContextManager().getVersionCode();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final long N() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        return createIAVServiceProxybyMonsterPlugin.getAVAppContextManager().getUpdateVersionCode();
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final String P() {
        IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
        h.f.b.l.b(createIAVSettingServicebyMonsterPlugin, "");
        String appLanguage = createIAVSettingServicebyMonsterPlugin.getAppLanguage();
        h.f.b.l.b(appLanguage, "");
        return appLanguage;
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$a  reason: collision with other inner class name */
    static final class C1949a extends h.f.b.m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1949a f82897a = new C1949a();

        static {
            Covode.recordClassIndex(51649);
        }

        C1949a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            com.google.gson.g gVar = new com.google.gson.g();
            gVar.f54714d = true;
            return gVar.a((Type) MultiEditVideoSegmentRecordData.class, (Object) new MultiEditVideoSegmentRecordDataDeserializer()).a((Type) MvNetFileBean.class, (Object) new MvNetFileBeanDeserializer()).a((Type) Integer.TYPE, (Object) new com.ss.android.ugc.tools.i.a()).b();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f82903a = new f();

        static {
            Covode.recordClassIndex(51655);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            com.google.gson.g gVar = new com.google.gson.g();
            gVar.f54714d = true;
            return gVar.a((Type) MultiEditVideoSegmentRecordData.class, (Object) new MultiEditVideoSegmentRecordDataDeserializer()).a((Type) EditVideoSegment.class, (Object) new EditVideoSegmentDeserializer()).a((Type) ImportVideoInfo.class, (Object) new ImportVideoInfoDeserializer()).a((Type) MultiEditVideoRecordData.class, (Object) new MultiEditVideoRecordDataDeserializer()).a((Type) com.ss.android.ugc.aweme.mvtheme.d.class, (Object) new MvCreateVideoDataDeserializer()).a((Type) EditPreviewInfo.class, (Object) new EditPreviewInfoDeserializer()).a((Type) AVUploadSaveModel.class, (Object) new AVUploadSaveModelDeserializer()).a((Type) com.ss.android.ugc.aweme.mvtheme.e.class, (Object) new MvSourceItemInfoDeserializer()).a((Type) com.ss.android.ugc.aweme.sticker.model.a.class, (Object) new BackgroundVideoDeserializer()).a((Type) Integer.TYPE, (Object) new com.ss.android.ugc.tools.i.a()).a((Type) TextStickerTextPair.class, (Object) new TextStickerTextPairDeserializer()).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.u
    public final com.ss.android.ugc.aweme.filter.d.a a(String str) {
        h.f.b.l.d(str, "");
        if (h.f.b.l.a((Object) str, (Object) "story-filter")) {
            return com.ss.android.ugc.aweme.story.base.e.f136896b.a();
        }
        return r();
    }

    public a(Application application) {
        h.f.b.l.d(application, "");
        this.f82884a = application;
    }
}
