package com.ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.i;
import com.bytedance.creativex.recorder.b.a.n;
import com.bytedance.creativex.recorder.b.a.z;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.ap.b;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.property.an;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.servicimpl.z;
import com.ss.android.ugc.aweme.setting.v;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.shortvideo.widget.k;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.aweme.tools.h;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.runtime.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class j implements n, f.a {

    /* renamed from: a  reason: collision with root package name */
    ASCameraView f121902a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoContextViewModel f121903b;

    /* renamed from: c  reason: collision with root package name */
    long f121904c;

    /* renamed from: d  reason: collision with root package name */
    int f121905d;

    /* renamed from: e  reason: collision with root package name */
    int f121906e;

    /* renamed from: f  reason: collision with root package name */
    e f121907f;

    /* renamed from: g  reason: collision with root package name */
    final z f121908g;

    /* renamed from: h  reason: collision with root package name */
    final g f121909h;

    /* renamed from: i  reason: collision with root package name */
    final ShortVideoContext f121910i;

    /* renamed from: j  reason: collision with root package name */
    final c f121911j;

    /* renamed from: k  reason: collision with root package name */
    List<i> f121912k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    k f121913l = null;

    /* renamed from: m  reason: collision with root package name */
    private long f121914m = 1000;
    private final com.ss.android.ugc.gamora.recorder.sticker.c.j n;
    private PhotoModule o;
    private a p;

    static {
        Covode.recordClassIndex(79930);
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(i iVar) {
        this.f121912k.add(iVar);
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(h hVar) {
        List<EmbaddedWindowInfo> list;
        if (this.f121903b.b()) {
            q.d("VideoRecordActivity hasGoNext true return");
            return;
        }
        boolean z = true;
        this.f121903b.b(true);
        if (this.f121910i.f124757b.f124712g < this.f121914m) {
            if (this.f121913l == null) {
                k kVar = new k(this.p.f145638b);
                this.f121913l = kVar;
                kVar.setCancelable(false);
            }
            this.f121913l.show();
            if (com.ss.android.ugc.aweme.sticker.f.e.a((com.ss.android.ugc.aweme.sticker.presenter.i) this.p.f145643g.getValue()) == null) {
                z = false;
            }
            this.o.a(this.p.f145639c.f124757b.f124708c, this.p.f145639c.f124757b.f124709d, z);
            this.f121908g.J();
            return;
        }
        for (int i2 = 0; i2 < this.f121912k.size(); i2++) {
            if (this.f121912k.get(i2).a(hVar)) {
                q.d("VideoRecordActivity interceptor handle return");
                this.f121909h.U();
                return;
            }
        }
        q.d("VideoRecordActivity setHasGoNext true");
        this.f121903b.b(true);
        b.a.f132249a.start("av_video_edit", "showProgressDialog");
        this.f121904c = System.currentTimeMillis();
        if (this.f121910i.f124757b.u == 1) {
            this.f121902a.c(true);
        } else if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(this.f121910i)) {
            this.f121902a.b(this.f121910i.f124757b.f124717l);
        }
        if (cr.a().f125295a == null && this.f121910i.O && bz.a(this.f121910i)) {
            this.f121902a.b(true);
        }
        if (this.f121910i.c() || this.f121910i.f124757b.c() || this.f121910i.f124757b.i()) {
            if (this.f121910i.f124757b.f124717l) {
                this.f121902a.c(false);
            } else {
                this.f121902a.c(true);
            }
        }
        b.a.f132249a.step("av_video_edit", "startConcat");
        this.f121908g.aq();
        a.C3440a aVar = new a.C3440a();
        aVar.f132972a = this.f121910i.f124757b.f124713h.a().getPath();
        aVar.f132973b = this.f121910i.f124757b.f124713h.b().getPath();
        aVar.f132976e = this.f121902a.getMediaController();
        aVar.f132975d = this.f121910i.G;
        aVar.f132978g = !this.f121910i.c();
        aVar.f132979h = d.b().a();
        aVar.f132977f = v.a();
        String path = this.f121910i.f124757b.f124713h.a().getPath();
        Integer valueOf = Integer.valueOf((int) this.f121910i.f124757b.f124712g);
        Integer valueOf2 = Integer.valueOf(this.f121910i.f124757b.f124708c);
        Integer valueOf3 = Integer.valueOf(this.f121910i.f124757b.f124709d);
        if (this.f121910i.f124757b.b()) {
            list = this.f121910i.f124757b.o.f124731l;
        } else {
            list = null;
        }
        aVar.f132974c = com.ss.android.ugc.aweme.shortvideo.i.n.a(path, valueOf, valueOf2, valueOf3, list);
        aVar.a(new k(this));
        this.f121905d++;
    }

    @Override // com.ss.android.ugc.aweme.record.f.a
    public final void a(String str, List<String> list) {
        FaceStickerBean i2;
        com.ss.android.ugc.gamora.recorder.sticker.c.j jVar;
        ArrayList arrayList = new ArrayList();
        try {
            if (!(!an.a() || (jVar = this.n) == null || jVar.I() == null)) {
                o H = this.f121908g.H();
                com.ss.android.ugc.gamora.recorder.sticker.c.j jVar2 = this.n;
                l.d(H, "");
                l.d(arrayList, "");
                l.d(jVar2, "");
                if (jVar2.I() != null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    List<String> I = jVar2.I();
                    if (I == null) {
                        l.b();
                    }
                    H.a(I, new b.a(arrayList, countDownLatch));
                    countDownLatch.await(2, TimeUnit.SECONDS);
                }
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        e eVar = this.f121907f;
        ShortVideoContext shortVideoContext = this.f121910i;
        if (this.p.f145643g.getValue() == null) {
            i2 = null;
        } else {
            i2 = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) this.p.f145643g.getValue()).i();
        }
        aa.a(new z.a(eVar, str, arrayList, shortVideoContext, i2, false, this.f121908g.H().e(), null, new s(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.j.a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01cf, code lost:
        if (r9 != null) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.j.a(android.content.Context, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public j(e eVar, com.bytedance.creativex.recorder.b.a.z zVar, g gVar, ShortVideoContext shortVideoContext, c cVar, com.ss.android.ugc.gamora.recorder.sticker.c.j jVar, com.ss.android.ugc.gamora.a.a aVar) {
        this.f121907f = eVar;
        this.f121908g = zVar;
        this.f121909h = gVar;
        this.f121902a = zVar.D();
        this.n = jVar;
        this.f121910i = shortVideoContext;
        this.f121911j = cVar;
        this.p = aVar;
        this.f121903b = (ShortVideoContextViewModel) ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class);
        this.o = (PhotoModule) com.ss.android.ugc.aweme.port.in.g.a().l().getPhotoModule(eVar, zVar.D().getMediaController(), this);
    }
}
