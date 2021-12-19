package dmt.av.video;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.experiment.eq;
import com.ss.android.ugc.aweme.filter.c.a;
import com.ss.android.ugc.aweme.filter.repository.a.a.c;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.filter.repository.internal.main.r;
import com.ss.android.ugc.aweme.property.bu;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.b.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import dmt.av.video.b.j;
import dmt.av.video.b.p;
import dmt.av.video.b.s;
import dmt.av.video.n;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

public final class z {
    public t<Void> A = new t<>();
    public t<Boolean> B = new t<>();
    boolean C = false;
    boolean D = false;
    boolean E = false;
    volatile boolean F = false;
    VEAudioSamiFilterParam G = null;
    public j H;
    public int I;
    public t<g> J;
    private int K;
    private final String L;

    /* renamed from: a  reason: collision with root package name */
    public Context f156977a;

    /* renamed from: b  reason: collision with root package name */
    m f156978b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceView f156979c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f156980d;

    /* renamed from: e  reason: collision with root package name */
    public LiveData<VEPreviewParams> f156981e;

    /* renamed from: f  reason: collision with root package name */
    public LiveData<VEPreviewMusicParams> f156982f;

    /* renamed from: g  reason: collision with root package name */
    public LiveData<a> f156983g;

    /* renamed from: h  reason: collision with root package name */
    public LiveData<t> f156984h;

    /* renamed from: i  reason: collision with root package name */
    public LiveData<p> f156985i;

    /* renamed from: j  reason: collision with root package name */
    public k<w> f156986j;

    /* renamed from: k  reason: collision with root package name */
    public k<n> f156987k;

    /* renamed from: l  reason: collision with root package name */
    public t<AudioRecorderParam> f156988l;

    /* renamed from: m  reason: collision with root package name */
    public LiveData<VEVolumeChangeOp> f156989m;
    public LiveData<s> n;
    public LiveData<v> o;
    public t<InfoStickerModel> p;
    public t<InfoStickerModel> q;
    public t<Boolean> r;
    public LiveData<b> s;
    public t<Boolean> t;
    public t<com.ss.android.ugc.gamora.editor.a.a> u;
    public VEEditorAutoStartStopArbiter v;
    public g w;
    public t<Integer> x = new t<>();
    public boolean y = false;
    public t<Void> z = new t<>();

    static {
        Covode.recordClassIndex(104256);
    }

    public final void a() {
        this.H.q = false;
    }

    public final void d() {
        this.w.u();
    }

    public final void e() {
        this.w.t();
    }

    public final void b() {
        t<g> tVar = this.J;
        if (tVar != null) {
            tVar.setValue(null);
        }
        g gVar = this.w;
        if (gVar != null) {
            gVar.s();
        }
    }

    public final k<n> c() {
        k<n> kVar = this.f156987k;
        if (kVar == null) {
            return new k<>();
        }
        return kVar;
    }

    public final void b(t<IAudioEffectParam> tVar) {
        this.H.f156776c = tVar;
    }

    public final void a(int i2) {
        this.K = i2;
        j jVar = this.H;
        if (jVar != null) {
            jVar.r = i2;
        }
    }

    public final void a(t<Boolean> tVar) {
        this.H.f156774a = tVar;
    }

    public final void a(ArrayList<EffectPointModel> arrayList) {
        this.H.f156777d = arrayList;
    }

    public z(int i2, String str) {
        n a2;
        this.L = str;
        s sVar = new s();
        sVar.f156865b = 3;
        sVar.a(aa.f156762a);
        sVar.f156867d = bu.a();
        sVar.f156869f = eq.a();
        j a3 = dmt.av.video.b.m.a(i2, sVar);
        this.H = a3;
        if (i2 == 6) {
            this.E = true;
        }
        String str2 = VEVideoPublishEditActivity.f126700e;
        if (com.ss.android.ugc.aweme.filter.b.b.a()) {
            a2 = r.a.a(str2);
        } else {
            a2 = l.a.a(str2);
        }
        a3.p = a2;
    }

    public final boolean a(InfoStickerModel infoStickerModel, VEPreviewParams vEPreviewParams) {
        int a2;
        float canvasHeight;
        TextStickerData textStickerData;
        MethodCollector.i(4401);
        if (infoStickerModel == null || h.a(infoStickerModel.stickers)) {
            MethodCollector.o(4401);
            return false;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel == null) {
                com.ss.android.ugc.aweme.port.in.g.a();
            } else {
                String str = e.b(stickerItemModel.path) ? stickerItemModel.path : infoStickerModel.infoStickerDraftDir + File.separator + new File(stickerItemModel.path).getName();
                if (!e.b(str)) {
                    com.ss.android.ugc.aweme.port.in.g.a();
                    com.ss.android.ugc.aweme.df.e.a((Throwable) new Exception("infoSticker not exist ".concat(String.valueOf(stickerItemModel))));
                } else {
                    if (stickerItemModel.isImageSticker()) {
                        a2 = this.w.a(str, stickerItemModel.x, stickerItemModel.y, stickerItemModel.w, stickerItemModel.f88243h);
                    } else if (!stickerItemModel.isImageStickerLayer) {
                        a2 = this.w.a(str, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra});
                    } else if (vEPreviewParams == null || vEPreviewParams.getCanvasWidth() <= 0 || vEPreviewParams.getCanvasHeight() <= 0) {
                        a2 = this.w.a(str, 0.0f, 0.0f, 1.0f, 1.0f);
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        if (i.a(str)) {
                            BitmapFactory.decodeFile(str, options);
                            canvasHeight = (((float) options.outHeight) * 1.0f) / ((float) options.outWidth);
                        } else {
                            canvasHeight = (((float) vEPreviewParams.getCanvasHeight()) * 1.0f) / ((float) vEPreviewParams.getCanvasWidth());
                        }
                        a2 = this.w.a(str, new BigDecimal((double) canvasHeight).setScale(4, 4).floatValue());
                        vEPreviewParams.getCanvasWidth();
                        vEPreviewParams.getCanvasHeight();
                    }
                    q.d("changeInfoSticker id = ".concat(String.valueOf(a2)));
                    if (a2 == -1) {
                        com.ss.android.ugc.aweme.port.in.g.a();
                    } else {
                        if (!stickerItemModel.isPin() || !i.a(stickerItemModel.pinAlgorithmFile)) {
                            this.w.a(a2, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                            this.w.b(a2, stickerItemModel.scale);
                            this.w.a(a2, -stickerItemModel.rotateAngle);
                            this.w.b(a2, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.w.f(a2, stickerItemModel.layerWeight);
                        } else {
                            this.w.b(a2, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.w.f(a2, stickerItemModel.layerWeight);
                            ByteBuffer a3 = al.a(stickerItemModel.pinAlgorithmFile);
                            if (a3 != null) {
                                this.w.a(a2, a3);
                                int i2 = this.K;
                                if (i2 == 1) {
                                    this.w.n(this.I);
                                } else if (i2 == 2) {
                                    this.w.n(1);
                                }
                            }
                        }
                        if (stickerItemModel.isTextSticker() && (textStickerData = (TextStickerData) com.ss.android.ugc.aweme.port.in.g.a().G().a(stickerItemModel.extra, TextStickerData.class)) != null && textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getAudioTrackFilePath())) {
                            a("TextSticker", this.w.a((String) Objects.requireNonNull(textStickerData.getAudioTrackFilePath()), 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false), 1, 1.0f);
                        }
                    }
                }
            }
        }
        MethodCollector.o(4401);
        return true;
    }

    public final void a(Context context, m mVar, SurfaceView surfaceView, VideoPublishEditModel videoPublishEditModel) {
        b(context, mVar, surfaceView, videoPublishEditModel);
    }

    public final void a(String str, int i2, int i3, float f2) {
        com.ss.android.ugc.aweme.port.in.g.a().o().k().a("compileSetEditorVolume", "creator: " + this.L + ", invoker: " + str + ", trackIndex: " + i2 + ", trackType: " + i3 + ", volume: " + f2);
        this.w.a(i2, i3, f2);
    }

    private void b(Context context, final m mVar, SurfaceView surfaceView, final VideoPublishEditModel videoPublishEditModel) {
        this.C = false;
        this.f156977a = context;
        this.f156978b = mVar;
        this.f156979c = surfaceView;
        this.f156981e.observe(mVar, new u<VEPreviewParams>() {
            /* class dmt.av.video.z.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104257);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(VEPreviewParams vEPreviewParams) {
                boolean z;
                VEPreviewParams vEPreviewParams2 = vEPreviewParams;
                b.a.f132249a.step("av_video_edit", "VEEditor init start");
                q.a("VEEditor init start");
                c.a(vEPreviewParams2);
                z.this.H.y = new ai(this);
                int a2 = z.this.H.a(z.this.f156977a, vEPreviewParams2, z.this.f156979c, mVar);
                z zVar = z.this;
                zVar.w = zVar.H.b();
                if (z.this.w instanceof com.ss.android.ugc.asve.editor.a) {
                    ((com.ss.android.ugc.asve.editor.a) z.this.w).E().c(true);
                }
                z zVar2 = z.this;
                zVar2.v = zVar2.H.f156778e;
                if (!(vEPreviewParams2.veCherEffectParam == null || vEPreviewParams2.veCherEffectParam.getMatrix() == null)) {
                    z.this.w.a(vEPreviewParams2.veCherEffectParam);
                }
                z zVar3 = z.this;
                VideoPublishEditModel videoPublishEditModel = videoPublishEditModel;
                o d2 = com.ss.android.ugc.aweme.port.in.g.a().r().d();
                com.ss.android.ugc.aweme.filter.repository.a.q f2 = d2.f();
                d2.a();
                m mVar = zVar3.f156978b;
                String str = videoPublishEditModel.mSelectedFilterId;
                String str2 = videoPublishEditModel.mSelectedFilterResId;
                ah ahVar = new ah(zVar3, videoPublishEditModel);
                h.f.b.l.d(f2, "");
                h.f.b.l.d(mVar, "");
                h.f.b.l.d(ahVar, "");
                f2.b().observe(mVar, new c.b(ahVar, str2, str));
                z.this.H.i();
                j jVar = z.this.H;
                if (!z.this.E || !vEPreviewParams2.recordData.isMultiEditRetake) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.a(z);
                if (vEPreviewParams2.mVeAudioRecordParam != null && !TextUtils.isEmpty(vEPreviewParams2.mVeAudioRecordParam.getAudioUrl())) {
                    z.this.f156988l.setValue(vEPreviewParams2.mVeAudioRecordParam);
                }
                if (!(vEPreviewParams2.mVeAudioEffectParam == null || z.this.c() == null)) {
                    z.this.c().setValue(n.a.a(vEPreviewParams2.mVeAudioEffectParam));
                }
                if (z.this.H instanceof dmt.av.video.b.o) {
                    z.this.a("MusicEffect", 0, 1, vEPreviewParams2.mMusicVolume);
                } else if (z.this.H instanceof p) {
                    z.this.a("MV", 0, 1, vEPreviewParams2.mMusicVolume);
                } else if (z.this.H instanceof dmt.av.video.b.n) {
                    z.this.a("MultiEdit", 0, 0, vEPreviewParams2.mVolume);
                } else if (vEPreviewParams2.mAudioPaths != null && vEPreviewParams2.mAudioPaths.length == 1) {
                    z.this.a("AudioPaths", 0, 0, vEPreviewParams2.mVolume);
                }
                if (vEPreviewParams2.isFastImport || vEPreviewParams2.isCutSameType) {
                    z zVar4 = z.this;
                    zVar4.a("FastImport", zVar4.w.a().f151435j, z.this.w.a().f151436k, vEPreviewParams2.mVolume);
                }
                z.this.x.setValue(Integer.valueOf(a2));
                if (z.this.J != null) {
                    z.this.J.setValue(z.this.w);
                }
                b.a.f132249a.step("av_video_edit", "VEEditor init end");
                q.a("VEEditor init end");
            }
        });
        this.f156981e.observe(this.f156978b, new e());
        this.f156982f.observe(this.f156978b, new u<VEPreviewMusicParams>() {
            /* class dmt.av.video.z.AnonymousClass4 */

            static {
                Covode.recordClassIndex(104262);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(VEPreviewMusicParams vEPreviewMusicParams) {
                z.this.H.a(vEPreviewMusicParams);
            }
        });
        this.f156982f.observe(this.f156978b, new e());
        this.f156983g.observe(this.f156978b, new u<a>() {
            /* class dmt.av.video.z.AnonymousClass5 */

            static {
                Covode.recordClassIndex(104263);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(a aVar) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    z.this.H.a(aVar2.f95494b, true);
                }
            }
        });
        this.f156983g.observe(this.f156978b, new e());
        this.f156984h.observe(this.f156978b, new u<t>() {
            /* class dmt.av.video.z.AnonymousClass6 */

            static {
                Covode.recordClassIndex(104264);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(t tVar) {
                z.this.H.a(tVar);
            }
        });
        this.f156984h.observe(this.f156978b, new e());
        this.f156985i.observe(this.f156978b, new u<p>() {
            /* class dmt.av.video.z.AnonymousClass7 */

            static {
                Covode.recordClassIndex(104265);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(p pVar) {
                z.this.H.a(pVar);
            }
        });
        this.f156985i.observe(this.f156978b, new e());
        this.f156986j.a(this.f156978b, new d<w>() {
            /* class dmt.av.video.z.AnonymousClass8 */

            static {
                Covode.recordClassIndex(104266);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // dmt.av.video.d
            public final /* bridge */ /* synthetic */ void a(w wVar, w wVar2) {
                z.this.H.a(wVar, wVar2);
            }
        });
        this.f156986j.observe(this.f156978b, new e());
        t<AudioRecorderParam> tVar = this.f156988l;
        if (tVar != null) {
            tVar.observe(this.f156978b, new ab(this));
        }
        c().a(this.f156978b, new d<n>() {
            /* class dmt.av.video.z.AnonymousClass9 */

            static {
                Covode.recordClassIndex(104267);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // dmt.av.video.d
            public final /* synthetic */ void a(n nVar, n nVar2) {
                j jVar = z.this.H;
                c.a.a();
                jVar.a(nVar, nVar2, c.a.c());
            }
        });
        this.f156989m.observe(this.f156978b, new u<VEVolumeChangeOp>() {
            /* class dmt.av.video.z.AnonymousClass10 */

            static {
                Covode.recordClassIndex(104258);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(VEVolumeChangeOp vEVolumeChangeOp) {
                z.this.H.a(vEVolumeChangeOp);
            }
        });
        this.f156989m.observe(this.f156978b, new e());
        this.n.observe(this.f156978b, new u<s>() {
            /* class dmt.av.video.z.AnonymousClass11 */

            static {
                Covode.recordClassIndex(104259);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(s sVar) {
                z.this.H.a(sVar);
            }
        });
        this.n.observe(this.f156978b, new e());
        this.o.observe(this.f156978b, new u<v>() {
            /* class dmt.av.video.z.AnonymousClass2 */

            static {
                Covode.recordClassIndex(104260);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(v vVar) {
                z.this.H.a(vVar);
            }
        });
        t<InfoStickerModel> tVar2 = this.p;
        if (tVar2 != null) {
            tVar2.observe(this.f156978b, new ac(this));
            this.p.observe(this.f156978b, new e());
        }
        t<Boolean> tVar3 = this.r;
        if (tVar3 != null) {
            tVar3.observe(this.f156978b, new ad(this));
        }
        t<Boolean> tVar4 = this.t;
        if (tVar4 != null) {
            tVar4.observe(this.f156978b, new ae(this));
        }
        t<InfoStickerModel> tVar5 = this.q;
        if (tVar5 != null) {
            tVar5.observe(this.f156978b, new af(this));
            this.q.observe(this.f156978b, new e());
        }
        LiveData<com.ss.android.ugc.aweme.shortvideo.edit.b.b> liveData = this.s;
        if (liveData != null) {
            liveData.observe(this.f156978b, new e<com.ss.android.ugc.aweme.shortvideo.edit.b.b>() {
                /* class dmt.av.video.z.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(104261);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u, dmt.av.video.e
                public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.shortvideo.edit.b.b bVar) {
                    z.this.H.a(bVar, "");
                }
            });
        }
        t<com.ss.android.ugc.gamora.editor.a.a> tVar6 = this.u;
        if (tVar6 != null) {
            tVar6.observe(this.f156978b, new ag(this));
        }
    }
}
