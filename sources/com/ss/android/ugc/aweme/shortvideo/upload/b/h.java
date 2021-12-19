package com.ss.android.ugc.aweme.shortvideo.upload.b;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import androidx.core.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.b.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.m;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class h extends a {
    public static final a v = new a((byte) 0);
    public final List<Integer> u = new ArrayList();

    static {
        Covode.recordClassIndex(86513);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public String i() {
        return "SerialPublishWithEndingWatermarkFuture";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86514);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class b extends a.b {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f132047e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f132048f = true;

        /* renamed from: g  reason: collision with root package name */
        private final int f132049g;

        static {
            Covode.recordClassIndex(86515);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a.b
        public final int a() {
            return this.f132049g;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a.b
        public final boolean b() {
            return this.f132048f;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a.b
        public final void a(g gVar, SynthetiseResult synthetiseResult) {
            l.d(gVar, "");
            l.d(synthetiseResult, "");
            this.f132047e.c(synthetiseResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar, g gVar, SynthetiseResult synthetiseResult) {
            super(hVar, gVar, synthetiseResult);
            l.d(gVar, "");
            l.d(synthetiseResult, "");
            this.f132047e = hVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final void h() {
        com.ss.android.ugc.aweme.video.e.c(this.f131996m.b().getPath());
        this.n.extFile = this.f131996m.b().getPath();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements a.AbstractC0029a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f132067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.a f132068b;

        static {
            Covode.recordClassIndex(86519);
        }

        f(h hVar, com.ss.android.ugc.asve.editor.a aVar) {
            this.f132067a = hVar;
            this.f132068b = aVar;
        }

        @Override // androidx.core.d.a.AbstractC0029a
        public final void a() {
            q.d(this.f132067a.i() + " cancel compile video with captions and watermark");
            this.f132068b.s();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final void a(SynthetiseResult synthetiseResult) {
        l.d(synthetiseResult, "");
        g gVar = g().w;
        l.b(gVar, "");
        b((r) new b(this, gVar, synthetiseResult));
    }

    public static final class c implements VEListener.VEInfoStickerBufferListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f132050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f132051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f132052c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f132053d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f132054e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.c f132055f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.c f132056g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ z.c f132057h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f132058i = 720;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f132059j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g f132060k;

        static {
            Covode.recordClassIndex(86516);
        }

        @Override // com.ss.android.vesdk.VEListener.VEInfoStickerBufferListener
        public final Bitmap onGetBuffer(int i2) {
            String str;
            float measuredHeight;
            int i3;
            float measuredWidth;
            int i4;
            com.ss.android.ugc.aweme.sticker.data.h hVar;
            MethodCollector.i(11898);
            Context context = (Context) this.f132051b.get();
            if (context != null) {
                List<com.ss.android.ugc.aweme.sticker.data.h> utterances = this.f132052c.captionStruct.getUtterances();
                if (utterances == null || (hVar = (com.ss.android.ugc.aweme.sticker.data.h) n.b((List) utterances, this.f132050a.u.indexOf(Integer.valueOf(i2)))) == null) {
                    str = null;
                } else {
                    str = hVar.getText();
                }
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.o(11898);
                    return null;
                }
                l.b(context, "");
                TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
                tuxTextView.setTuxFont(32);
                tuxTextView.setText(str);
                Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                l.b(application, "");
                tuxTextView.setTextColor(application.getResources().getColor(R.color.f159928l));
                int a2 = (int) com.ss.android.ugc.tools.utils.r.a(context, 8.0f);
                tuxTextView.setPadding(a2, a2, a2, a2);
                tuxTextView.setBackground(context.getResources().getDrawable(R.drawable.dv));
                tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(com.ss.android.ugc.gamora.editor.subtitle.d.v, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (this.f132052c.captionStruct.getLocation() == com.ss.android.ugc.aweme.sticker.data.a.LEFT_TOP.getValue()) {
                    measuredHeight = ((float) (this.f132053d.element + (tuxTextView.getMeasuredHeight() / 2))) * 1.0f;
                    i3 = this.f132054e.element;
                } else {
                    measuredHeight = ((float) ((this.f132054e.element - this.f132055f.element) - (tuxTextView.getMeasuredHeight() / 2))) * 1.0f;
                    i3 = this.f132054e.element;
                }
                float f2 = measuredHeight / ((float) i3);
                if (gb.a()) {
                    measuredWidth = ((float) ((this.f132056g.element - this.f132057h.element) - (tuxTextView.getMeasuredWidth() / 2))) * 1.0f;
                    i4 = this.f132056g.element;
                } else {
                    measuredWidth = ((float) (this.f132057h.element + (tuxTextView.getMeasuredWidth() / 2))) * 1.0f;
                    i4 = this.f132056g.element;
                }
                float f3 = measuredWidth / ((float) i4);
                float f4 = (((float) this.f132058i) * 1.0f) / ((float) this.f132056g.element);
                q.d(this.f132050a.i() + " getbuffer index " + i2 + " text " + str + " posX " + f3 + " posY " + f2 + ' ' + " width " + tuxTextView.getMeasuredWidth() + " height " + tuxTextView.getMeasuredHeight() + " videowidth " + this.f132058i + " videoHeight " + this.f132059j + " startmargin " + this.f132057h.element + " savedVideoWidth " + this.f132056g.element + " savedVideoHeight " + this.f132054e.element + " finalMargin " + ((((float) this.f132058i) * f3) - ((((float) tuxTextView.getMeasuredWidth()) * f4) / 2.0f)));
                this.f132060k.a(i2, f3, f2);
                Bitmap createBitmap = Bitmap.createBitmap(tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                tuxTextView.draw(canvas);
                Bitmap a3 = com.ss.android.ugc.aweme.photo.d.a(createBitmap, (int) (((float) tuxTextView.getMeasuredWidth()) * f4), (int) (((float) tuxTextView.getMeasuredHeight()) * f4));
                MethodCollector.o(11898);
                return a3;
            }
            MethodCollector.o(11898);
            return null;
        }

        c(h hVar, WeakReference weakReference, VideoPublishEditModel videoPublishEditModel, z.c cVar, z.c cVar2, z.c cVar3, z.c cVar4, z.c cVar5, int i2, g gVar) {
            this.f132050a = hVar;
            this.f132051b = weakReference;
            this.f132052c = videoPublishEditModel;
            this.f132053d = cVar;
            this.f132054e = cVar2;
            this.f132055f = cVar3;
            this.f132056g = cVar4;
            this.f132057h = cVar5;
            this.f132059j = i2;
            this.f132060k = gVar;
        }
    }

    public final void c(SynthetiseResult synthetiseResult) {
        int i2;
        int addInfoStickerWithBuffer;
        VESize watermarkVideoRes;
        VESize watermarkVideoRes2;
        a(c.CaptionSynthesis);
        q.d(i() + " startAddCaptionsAndWaterMark");
        List b2 = n.b(Integer.valueOf(this.f131995l.sourceVideoWidth()), Integer.valueOf(this.f131995l.sourceVideoHeight()));
        Integer[] numArr = new Integer[2];
        VEVideoEncodeSettings vEVideoEncodeSettings = this.f131993j;
        int i3 = -1;
        if (vEVideoEncodeSettings == null || (watermarkVideoRes2 = vEVideoEncodeSettings.getWatermarkVideoRes()) == null) {
            i2 = -1;
        } else {
            i2 = watermarkVideoRes2.width;
        }
        numArr[0] = Integer.valueOf(i2);
        VEVideoEncodeSettings vEVideoEncodeSettings2 = this.f131993j;
        if (!(vEVideoEncodeSettings2 == null || (watermarkVideoRes = vEVideoEncodeSettings2.getWatermarkVideoRes()) == null)) {
            i3 = watermarkVideoRes.height;
        }
        numArr[1] = Integer.valueOf(i3);
        List b3 = n.b(numArr);
        List<Integer> a2 = a(b2, b3);
        String outputFile = this.f131995l.getOutputFile();
        l.b(outputFile, "");
        String draftDir = this.f131995l.draftDir();
        l.b(draftDir, "");
        String localTempPath = this.f131995l.getLocalTempPath();
        l.b(localTempPath, "");
        com.ss.android.ugc.asve.editor.a aVar = new com.ss.android.ugc.asve.editor.a(new g(a2, b3, outputFile, draftDir, localTempPath).f132045d);
        this.n.needExtFile = false;
        k kVar = new k(new String[]{synthetiseResult.outputFile});
        kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
        kVar.f62018a = new int[]{0};
        kVar.f62019b = new int[]{(int) synthetiseResult.videoLength};
        kVar.f62020c = null;
        aVar.a(kVar);
        this.f131993j = m.a(this.f131995l, synthetiseResult, this.n, aVar, this.s);
        List<InteractStickerStruct> a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.f131995l.getMainBusinessContext(), 11, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a3 != null && a3.size() > 0) {
            this.f131995l.captionStruct = a3.get(0).getCaptionStruct();
        }
        if (this.f131995l.captionStruct != null) {
            com.ss.android.ugc.aweme.sticker.data.d dVar = this.f131995l.captionStruct;
            if (dVar == null) {
                l.b();
            }
            List<com.ss.android.ugc.aweme.sticker.data.h> utterances = dVar.getUtterances();
            if (utterances == null) {
                utterances = h.a.z.INSTANCE;
            }
            for (com.ss.android.ugc.aweme.sticker.data.h hVar : utterances) {
                x E = aVar.E();
                if (E.f151513b == null) {
                    an.d("VEEditor", "addInfoStickerWithBuffer STICKER IS NOT SUPPORT !!!");
                    addInfoStickerWithBuffer = -901;
                } else {
                    addInfoStickerWithBuffer = E.f151513b.addInfoStickerWithBuffer();
                }
                this.u.add(Integer.valueOf(addInfoStickerWithBuffer));
                aVar.b(addInfoStickerWithBuffer, (int) hVar.getStartTime(), (int) hVar.getEndTime());
            }
        }
        b((r) new d(this, aVar, synthetiseResult));
        a((r) new e(this, synthetiseResult, aVar));
        aVar.c(f());
        aVar.a(e());
        this.q.a(new f(this, aVar));
        String str = this.n.extFile;
        VEVideoEncodeSettings vEVideoEncodeSettings3 = this.f131993j;
        if (vEVideoEncodeSettings3 == null) {
            l.b();
        }
        aVar.a(str, vEVideoEncodeSettings3);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final VEVideoEncodeSettings a(g gVar, SynthetiseResult synthetiseResult) {
        l.d(gVar, "");
        l.d(synthetiseResult, "");
        return m.a(this.f131995l, synthetiseResult, (VEWatermarkParam) null, gVar, this.s);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public int a(c cVar, int i2) {
        l.d(cVar, "");
        int i3 = i.f132069a[cVar.ordinal()];
        if (i3 == 1) {
            return Math.min(60, h.g.a.a(((float) (i2 * 60)) / 100.0f));
        }
        if (i3 == 2) {
            return Math.min(80, h.g.a.a((((float) (i2 * 20)) / 100.0f) + 60.0f));
        }
        if (i3 == 3) {
            return Math.min(95, h.g.a.a((((float) (i2 * 15)) / 100.0f) + 80.0f));
        }
        if (i3 == 4) {
            return Math.min(100, h.g.a.a((((float) (i2 * 5)) / 100.0f) + 95.0f));
        }
        throw new h.n();
    }

    public static final class d implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f132061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.a f132062b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132063c;

        static {
            Covode.recordClassIndex(86517);
        }

        d(h hVar, com.ss.android.ugc.asve.editor.a aVar, SynthetiseResult synthetiseResult) {
            this.f132061a = hVar;
            this.f132062b = aVar;
            this.f132063c = synthetiseResult;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            int i4;
            Integer videoWidth;
            if (i2 == 4116) {
                q.d("ParallelWithEndWatermark onCallback: serial compile watermark video prepared");
                h hVar = this.f132061a;
                com.ss.android.ugc.asve.editor.a aVar = this.f132062b;
                Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                l.b(application, "");
                VideoPublishEditModel videoPublishEditModel = this.f132061a.f131995l;
                l.d(aVar, "");
                l.d(application, "");
                l.d(videoPublishEditModel, "");
                WeakReference weakReference = new WeakReference(application);
                List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(hVar.f131995l.getMainBusinessContext(), 11, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
                if (a2 != null && a2.size() > 0) {
                    VideoPublishEditModel videoPublishEditModel2 = hVar.f131995l;
                    InteractStickerStruct interactStickerStruct = a2.get(0);
                    l.b(interactStickerStruct, "");
                    videoPublishEditModel2.captionStruct = interactStickerStruct.getCaptionStruct();
                }
                int[] b2 = dmt.av.video.f.b(videoPublishEditModel);
                if (b2[1] == 0 || b2[0] == 0) {
                    i4 = 1280;
                } else {
                    i4 = (int) (((((float) b2[1]) * 1.0f) / ((float) b2[0])) * 720.0f);
                }
                float f3 = (((float) i4) * 1.0f) / 720.0f;
                z.c cVar = new z.c();
                cVar.element = dh.b(application);
                z.c cVar2 = new z.c();
                cVar2.element = (int) (((float) cVar.element) * f3);
                z.c cVar3 = new z.c();
                cVar3.element = com.ss.android.ugc.gamora.editor.subtitle.d.t;
                z.c cVar4 = new z.c();
                cVar4.element = com.ss.android.ugc.gamora.editor.subtitle.d.s;
                z.c cVar5 = new z.c();
                cVar5.element = com.ss.android.ugc.gamora.editor.subtitle.d.r;
                com.ss.android.ugc.aweme.sticker.data.d dVar = hVar.f131995l.captionStruct;
                if (!(dVar == null || dVar.getVideoWidth() == null || ((videoWidth = dVar.getVideoWidth()) != null && videoWidth.intValue() == 0))) {
                    Integer marginStart = dVar.getMarginStart();
                    if (marginStart == null) {
                        l.b();
                    }
                    cVar3.element = marginStart.intValue();
                    Integer videoWidth2 = dVar.getVideoWidth();
                    if (videoWidth2 == null) {
                        l.b();
                    }
                    cVar.element = videoWidth2.intValue();
                    cVar2.element = (int) (((float) cVar.element) * f3);
                    Integer marginTop = dVar.getMarginTop();
                    if (marginTop == null) {
                        l.b();
                    }
                    cVar4.element = marginTop.intValue();
                    Integer marginBottom = dVar.getMarginBottom();
                    if (marginBottom == null) {
                        l.b();
                    }
                    cVar5.element = marginBottom.intValue();
                }
                aVar.a(new c(hVar, weakReference, videoPublishEditModel, cVar4, cVar2, cVar5, cVar, cVar3, i4, aVar));
            } else if (i2 == 4103) {
                q.d(this.f132061a.i() + " compile watermark video with captions done");
                this.f132062b.d(this.f132061a.f());
                this.f132062b.s();
                this.f132061a.b(this.f132063c);
            } else if (i2 == 4105) {
                this.f132061a.b(h.g.a.a(f2 * 100.0f));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f132064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.a f132066c;

        static {
            Covode.recordClassIndex(86518);
        }

        e(h hVar, SynthetiseResult synthetiseResult, com.ss.android.ugc.asve.editor.a aVar) {
            this.f132064a = hVar;
            this.f132065b = synthetiseResult;
            this.f132066c = aVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            l.d(str, "");
            if (((a) this.f132064a).f131990b == c.CaptionSynthesis) {
                SynthetiseResult clone = this.f132065b.clone();
                l.b(clone, "");
                clone.ret = h.g.a.a(f2);
                if (this.f132064a.a((Throwable) c.a.a().a(clone).a("compile video with captions failed. type = " + i2 + " ext = " + i3 + " f = " + f2 + " msg = " + str).a())) {
                    if (i3 == -214) {
                        com.ss.android.ugc.aweme.property.b.f118355a = true;
                    }
                    this.f132066c.s();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar, VEWatermarkParam vEWatermarkParam, androidx.lifecycle.m mVar, int i2, List<String> list, com.ss.android.ugc.aweme.shortvideo.upload.a aVar2, com.ss.android.ugc.aweme.shortvideo.upload.l lVar, String str) {
        super(videoPublishEditModel, aVar, vEWatermarkParam, mVar, i2, list, aVar2, lVar, str);
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        l.d(vEWatermarkParam, "");
        l.d(mVar, "");
        l.d(list, "");
        l.d(aVar2, "");
        l.d(str, "");
    }
}
