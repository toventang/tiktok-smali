package dmt.av.video.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.asve.editor.h;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.effect.ClipsModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.tools.view.widget.j;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.VECurveSpeedUtils;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.bj;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.b.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class j implements f {
    public static final String F = j.class.getSimpleName();
    public static final a G = new a((byte) 0);
    public int A;
    public FilterBean B;
    public float C = -1.0f;
    public androidx.lifecycle.t<dmt.av.video.t> D;
    public s E;
    private Executor H;
    private final com.ss.android.ugc.aweme.filter.repository.a.k I = new s(this);
    private ExecutorService J;
    private int K = -1;
    private int L = -1;
    private com.ss.android.ugc.aweme.effect.c.a.b M;
    private final ScheduledExecutorService N;

    /* renamed from: a  reason: collision with root package name */
    public androidx.lifecycle.t<Boolean> f156774a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.lifecycle.t<dmt.av.video.w> f156775b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.lifecycle.t<IAudioEffectParam> f156776c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<EffectPointModel> f156777d;

    /* renamed from: e  reason: collision with root package name */
    public VEEditorAutoStartStopArbiter f156778e;

    /* renamed from: f  reason: collision with root package name */
    public Context f156779f;

    /* renamed from: g  reason: collision with root package name */
    protected com.ss.android.ugc.asve.editor.g f156780g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.creativex.editor.preview.a f156781h;

    /* renamed from: i  reason: collision with root package name */
    public int f156782i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f156783j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f156784k = -1;

    /* renamed from: l  reason: collision with root package name */
    public List<Integer> f156785l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public List<Integer> f156786m = new ArrayList();
    public dmt.av.video.n n;
    public dmt.av.video.r o;
    public com.ss.android.ugc.aweme.filter.repository.a.n p;
    public boolean q = true;
    public int r;
    public com.ss.android.ugc.tools.view.widget.o s;
    public SafeHandler t;
    public com.ss.android.ugc.tools.utils.j u = com.ss.android.ugc.tools.c.f149151f;
    public SurfaceView v;
    public androidx.lifecycle.m w;
    public VEListener.v x;
    public f.a y;
    public String z;

    public void a(SurfaceView surfaceView) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104135);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public int a(Context context, com.bytedance.creativex.editor.preview.a aVar, SurfaceView surfaceView, androidx.lifecycle.m mVar) {
        com.ss.android.ugc.asve.editor.f fVar;
        h.f.b.l.d(aVar, "");
        this.f156779f = context;
        this.f156781h = aVar;
        this.v = surfaceView;
        this.w = mVar;
        if (this.E.f156864a.invoke().booleanValue()) {
            fVar = com.ss.android.ugc.asve.editor.f.NLEEditorType;
        } else {
            fVar = com.ss.android.ugc.asve.editor.f.VEEditorTYPE;
        }
        bj bjVar = null;
        if (aVar.getNeedVEUserConfig()) {
            bjVar = com.ss.android.ugc.asve.editor.nle.b.a();
        }
        if (this.E.f156869f) {
            bjVar = com.ss.android.ugc.asve.editor.b.a(bjVar);
        }
        this.f156780g = com.ss.android.ugc.asve.a.a().r().a(surfaceView, new h.b(fVar, aVar.getWorkspace(), aVar.getEditorHandler(), bjVar));
        if (this.v != null) {
            if (aVar.getEditorHandler() > 0) {
                com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                if (gVar == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar.b(false);
                com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                if (gVar2 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar2.c(0);
            }
            Context context2 = this.f156779f;
            androidx.lifecycle.m mVar2 = this.w;
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            this.f156778e = new VEEditorAutoStartStopArbiter(context2, mVar2, gVar3, this.v, aVar.getEnableAutoStart());
            SurfaceView surfaceView2 = this.v;
            if (surfaceView2 == null) {
                h.f.b.l.b();
            }
            a(surfaceView2);
            if (this.x != null) {
                com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
                if (gVar4 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                VEListener.v vVar = this.x;
                if (vVar == null) {
                    h.f.b.l.b();
                }
                gVar4.a(vVar);
            }
        }
        this.u.a("yarkey mVEEditor create");
        this.u.a(Log.getStackTraceString(new Throwable()));
        com.ss.android.ugc.asve.editor.g gVar5 = this.f156780g;
        if (gVar5 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar5.n();
        if (this.y != null) {
            com.ss.android.ugc.asve.editor.g gVar6 = this.f156780g;
            if (gVar6 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar6.c(new r(this));
        }
        com.ss.android.ugc.asve.editor.g gVar7 = this.f156780g;
        if (gVar7 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar7.i(aVar.getFps());
        if (aVar.getPreviewHeight() <= 0 || aVar.getPreviewWidth() <= 0) {
            return -1;
        }
        com.ss.android.ugc.asve.editor.g gVar8 = this.f156780g;
        if (gVar8 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar8.d(aVar.getPreviewWidth(), aVar.getPreviewHeight());
        return -1;
    }

    public void a(boolean z2) {
        com.bytedance.creativex.editor.preview.a aVar = this.f156781h;
        if (this.v != null && aVar != null && aVar.getCanvasWidth() > 0 && aVar.getCanvasHeight() > 0 && !aVar.isCanvasVEEditorType()) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.a(x.e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.c(aVar.getCanvasWidth(), aVar.getCanvasHeight());
            aVar.getCanvasWidth();
            aVar.getCanvasHeight();
        }
        com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
        if (gVar3 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar3.a(true);
        if (this.v == null) {
            List<IAudioEffectParam> list = null;
            if (aVar != null) {
                if (aVar.getVeAudioEffectParam() == null) {
                    if (aVar != null) {
                        list = aVar.getVeAudioEffectParamList();
                    }
                }
            }
            if (com.ss.android.ugc.tools.utils.d.a(list)) {
                return;
            }
        }
        if (!z2) {
            return;
        }
        if (this.E.f156868e) {
            ExecutorService executorService = this.J;
            if (executorService == null) {
                executorService = k();
                this.J = executorService;
                h.f.b.l.b(executorService, "");
            }
            executorService.submit(new t(this));
            return;
        }
        com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
        if (gVar4 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar4.p();
    }

    public final boolean a(dmt.av.video.t tVar) {
        h.f.b.l.d(tVar, "");
        if (this.E.f156867d) {
            c(tVar);
            return false;
        }
        d(tVar);
        return false;
    }

    public final void a(dmt.av.video.t tVar, Runnable runnable) {
        b.j jVar = new b.j();
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar.c(new z(this, jVar));
        com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
        if (gVar2 == null) {
            h.f.b.l.a("mVEEditor");
        }
        int a2 = gVar2.a((int) tVar.f156955b, x.f.EDITOR_SEEK_FLAG_LastSeek);
        if (a2 == 0) {
            try {
                jVar.f4869a.f();
            } catch (InterruptedException unused) {
            }
        } else {
            try {
                com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
                if (gVar3 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                x.j f2 = gVar3.f();
                this.u.a("Seek failed. ret = " + a2 + " state = " + (f2 != null ? Integer.valueOf(f2.ordinal()) : null));
            } catch (com.ss.android.vesdk.z e2) {
                this.u.a(e2);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        h.f.b.l.d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mType == 0) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            int y2 = gVar2.y();
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.a(y2, gVar3.x(), vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
            if (gVar4 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar4.a(this.f156782i, 1, vEVolumeChangeOp.mVolume);
        }
        if (this.f156780g != null) {
            return false;
        }
        h.f.b.l.a("mVEEditor");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0109, code lost:
        if (r8 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(dmt.av.video.s r25) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.j.a(dmt.av.video.s):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(dmt.av.video.VEPreviewMusicParams r25) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.j.a(dmt.av.video.VEPreviewMusicParams):boolean");
    }

    public final void a(int i2, double d2, double d3, double d4) {
        if (d2 != 0.0d) {
            VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
            vEAudioLoudnessBalanceFilter.targetLoudness = d2;
            vEAudioLoudnessBalanceFilter.avgLoudness = d4;
            vEAudioLoudnessBalanceFilter.peakLoudness = d3;
            vEAudioLoudnessBalanceFilter.enable = true;
            if (this.K == -1) {
                com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                if (gVar == null) {
                    h.f.b.l.a("mVEEditor");
                }
                this.K = gVar.a(1, i2, vEAudioLoudnessBalanceFilter);
                return;
            }
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.a(this.K, vEAudioLoudnessBalanceFilter);
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.b.b bVar, String str) {
        if (bVar != null) {
            int i2 = bVar.f126944b;
            if (i2 == 1) {
                a(bVar.f126943a, bVar.f126945c);
            } else if (i2 != 2) {
                switch (i2) {
                    case 20001:
                    case 20002:
                    case 20003:
                    case 20004:
                        b(bVar, str);
                        return;
                    default:
                        an.b("HDREnhance", "Draw frame failed，current type = " + bVar.f126944b);
                        c(bVar, str);
                        return;
                }
            } else {
                c(bVar, str);
            }
        }
    }

    private final void a(boolean z2, boolean z3) {
        if (z3) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.e(z2);
        } else {
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.d(z2);
        }
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    public final boolean a(dmt.av.video.p pVar) {
        EffectPointModel effectPointModel;
        h.f.b.l.d(pVar, "");
        ArrayList<EffectPointModel> arrayList = this.f156777d;
        if (arrayList == null) {
            h.f.b.l.b();
        }
        if (pVar.f156931g == 0) {
            if (!pVar.q.booleanValue()) {
                pVar.f156927c = pVar.f156929e;
            }
            if (this.E.f156869f) {
                Boolean bool = pVar.q;
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                    if (gVar == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    h.f.b.l.d(gVar, "");
                    h.f.b.l.d(pVar, "");
                    VEAmazingFilterParam vEAmazingFilterParam = new VEAmazingFilterParam();
                    vEAmazingFilterParam.path = pVar.f156934j;
                    vEAmazingFilterParam.order = 1000;
                    vEAmazingFilterParam.amazingEngineType = 0;
                    String str = pVar.p;
                    vEAmazingFilterParam.param = (str == null || str.length() == 0) ? "{}" : pVar.p;
                    dmt.av.video.x.a(gVar, pVar, vEAmazingFilterParam);
                } else {
                    com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                    if (gVar2 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    h.f.b.l.d(gVar2, "");
                    h.f.b.l.d(pVar, "");
                    VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
                    vEEffectFilterParam.effectPath = pVar.f156934j;
                    dmt.av.video.x.a(gVar2, pVar, vEEffectFilterParam);
                }
            } else {
                com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
                if (gVar3 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                h.f.b.l.d(gVar3, "");
                h.f.b.l.d(pVar, "");
                pVar.f156925a = new int[]{gVar3.a((int) pVar.f156927c, pVar.f156934j, pVar.o)};
            }
            EffectPointModel effectPointModel2 = new EffectPointModel();
            effectPointModel2.setType(1);
            effectPointModel2.setSelectedColor(pVar.f156933i);
            effectPointModel2.setResDir(pVar.f156934j);
            effectPointModel2.setKey(pVar.f156935k);
            effectPointModel2.setFromEnd(pVar.f156932h);
            effectPointModel2.setStartPoint((int) pVar.f156927c);
            effectPointModel2.setUiStartPoint((int) pVar.f156929e);
            effectPointModel2.setUiEndPoint((int) pVar.f156930f);
            effectPointModel2.setName(pVar.f156936l);
            effectPointModel2.setDuration(pVar.f156937m);
            effectPointModel2.setCategory(pVar.n);
            effectPointModel2.setExtra(pVar.o);
            effectPointModel2.setAdjustParams(pVar.p);
            effectPointModel2.setIsNewEngineEffect(pVar.q);
            effectPointModel2.setIndex(pVar.f156925a[0]);
            arrayList.add(effectPointModel2);
            return true;
        } else if (pVar.f156931g == 5) {
            a(pVar, arrayList);
            return true;
        } else {
            if (pVar.f156931g == 6) {
                if (arrayList.isEmpty()) {
                    return false;
                }
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        effectPointModel = arrayList.get(size);
                        h.f.b.l.b(effectPointModel, "");
                    }
                } while (!h.f.b.l.a((Object) "sticker", (Object) effectPointModel.getCategory()));
                com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
                if (gVar4 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                EffectPointModel effectPointModel3 = arrayList.get(size);
                h.f.b.l.b(effectPointModel3, "");
                gVar4.b(new int[]{effectPointModel3.getIndex()});
                EffectPointModel effectPointModel4 = arrayList.get(size);
                h.f.b.l.b(effectPointModel4, "");
                effectPointModel4.setFromEnd(pVar.f156932h);
                EffectPointModel effectPointModel5 = arrayList.get(size);
                h.f.b.l.b(effectPointModel5, "");
                effectPointModel5.setStartPoint((int) pVar.f156927c);
                EffectPointModel effectPointModel6 = arrayList.get(size);
                h.f.b.l.b(effectPointModel6, "");
                effectPointModel6.setEndPoint((int) pVar.f156928d);
                EffectPointModel effectPointModel7 = arrayList.get(size);
                h.f.b.l.b(effectPointModel7, "");
                effectPointModel7.setUiStartPoint((int) pVar.f156929e);
                EffectPointModel effectPointModel8 = arrayList.get(size);
                h.f.b.l.b(effectPointModel8, "");
                effectPointModel8.setUiEndPoint((int) pVar.f156930f);
                com.ss.android.ugc.asve.editor.g gVar5 = this.f156780g;
                if (gVar5 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                EffectPointModel effectPointModel9 = arrayList.get(size);
                h.f.b.l.b(effectPointModel9, "");
                EffectPointModel effectPointModel10 = effectPointModel9;
                h.f.b.l.d(gVar5, "");
                h.f.b.l.d(effectPointModel10, "");
                pVar.f156925a = gVar5.a(new int[]{effectPointModel10.getStartPoint()}, new int[]{effectPointModel10.getEndPoint()}, new String[]{effectPointModel10.getResDir()}, new int[]{0}, new int[]{0}, new String[]{effectPointModel10.getExtra()});
                EffectPointModel effectPointModel11 = arrayList.get(size);
                h.f.b.l.b(effectPointModel11, "");
                effectPointModel11.setIndex(pVar.f156925a[0]);
                return true;
            } else if (pVar.f156931g == 1) {
                EffectPointModel effectPointModel12 = arrayList.get(arrayList.size() - 1);
                h.f.b.l.b(effectPointModel12, "");
                EffectPointModel effectPointModel13 = effectPointModel12;
                if (pVar.f156927c < ((long) effectPointModel13.getStartPoint())) {
                    long j2 = pVar.f156927c;
                    pVar.f156927c = (long) effectPointModel13.getStartPoint();
                    effectPointModel13.setStartPoint((int) j2);
                }
                if (!pVar.q.booleanValue()) {
                    pVar.f156927c = pVar.f156930f;
                }
                com.ss.android.ugc.asve.editor.g gVar6 = this.f156780g;
                if (gVar6 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                h.f.b.l.d(gVar6, "");
                gVar6.a(effectPointModel13.getIndex(), effectPointModel13.getStartPoint(), (int) pVar.f156927c);
                effectPointModel13.setEndPoint((int) pVar.f156927c);
                effectPointModel13.setUiEndPoint((int) pVar.f156930f);
            } else if (pVar.f156931g == 2 || pVar.f156931g == 7) {
                a(pVar.f156925a[0], arrayList);
            } else if (pVar.f156931g == 3) {
                if (this.E.f156869f) {
                    com.ss.android.ugc.asve.editor.g gVar7 = this.f156780g;
                    if (gVar7 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    int[] iArr = pVar.f156925a;
                    h.f.b.l.b(iArr, "");
                    gVar7.a(iArr);
                } else {
                    com.ss.android.ugc.asve.editor.g gVar8 = this.f156780g;
                    if (gVar8 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    int[] iArr2 = pVar.f156925a;
                    h.f.b.l.b(iArr2, "");
                    gVar8.b(iArr2);
                }
                arrayList.clear();
            } else if (pVar.f156931g == 4) {
                if (this.E.f156869f) {
                    com.ss.android.ugc.asve.editor.g gVar9 = this.f156780g;
                    if (gVar9 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    int[] iArr3 = pVar.f156925a;
                    h.f.b.l.b(iArr3, "");
                    gVar9.a(iArr3);
                } else {
                    com.ss.android.ugc.asve.editor.g gVar10 = this.f156780g;
                    if (gVar10 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    int[] iArr4 = pVar.f156925a;
                    h.f.b.l.b(iArr4, "");
                    gVar10.b(iArr4);
                }
                int[] iArr5 = pVar.f156925a;
                h.f.b.l.b(iArr5, "");
                int length = iArr5.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else if (pVar.f156931g == 8) {
                a(pVar.f156925a[0], arrayList);
                a(pVar, arrayList);
            }
            return false;
        }
    }

    private final void a(dmt.av.video.p pVar, ArrayList<EffectPointModel> arrayList) {
        EffectPointModel effectPointModel = new EffectPointModel();
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        dmt.av.video.x.a(gVar, pVar);
        effectPointModel.setIndex(pVar.f156925a[0]);
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
        effectPointModel.setType(1);
        effectPointModel.setSelectedColor(pVar.f156933i);
        effectPointModel.setResDir(pVar.f156934j);
        effectPointModel.setKey(pVar.f156935k);
        effectPointModel.setFromEnd(pVar.f156932h);
        effectPointModel.setStartPoint((int) pVar.f156927c);
        effectPointModel.setEndPoint((int) pVar.f156928d);
        effectPointModel.setUiStartPoint((int) pVar.f156929e);
        effectPointModel.setUiEndPoint((int) pVar.f156930f);
        effectPointModel.setName(pVar.f156936l);
        effectPointModel.setCategory(pVar.n);
        effectPointModel.setExtra(pVar.o);
        effectPointModel.setAdjustParams(pVar.p);
        effectPointModel.setIsNewEngineEffect(pVar.q);
        arrayList.add(effectPointModel);
    }

    public final int a(AudioRecorderParam audioRecorderParam, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        h.f.b.l.d(audioRecorderParam, "");
        h.f.b.l.d(gVar, "");
        if (audioRecorderParam.getNeedDel()) {
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.e(audioRecorderParam.getAudioRecordIndex());
            audioRecorderParam.setNeedDel(false);
            audioRecorderParam.setAudioRecordIndex(-2);
            this.f156784k = -1;
            return -2;
        } else if (!audioRecorderParam.hasRecord()) {
            return -1;
        } else {
            if (audioRecorderParam.getAudioRecordIndex() >= 0) {
                int audioRecordIndex = audioRecorderParam.getAudioRecordIndex();
                this.f156783j = audioRecordIndex;
                return audioRecordIndex;
            }
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            String audioUrl = audioRecorderParam.getAudioUrl();
            com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
            if (gVar4 == null) {
                h.f.b.l.a("mVEEditor");
            }
            this.f156783j = gVar3.a(audioUrl, 0, gVar4.j(), false);
            dmt.av.video.n nVar = this.n;
            if (h.f.b.l.a((Object) (nVar != null ? nVar.f156915d : null), (Object) "apply") && this.f156784k == -1) {
                a(nVar, nVar, gVar);
            }
            audioRecorderParam.setAudioRecordIndex(this.f156783j);
            return this.f156783j;
        }
    }

    public final void a(dmt.av.video.n nVar, dmt.av.video.n nVar2, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        h.f.b.l.d(nVar2, "");
        h.f.b.l.d(gVar, "");
        boolean z2 = nVar2.f156916e;
        String str = nVar2.f156915d;
        switch (str.hashCode()) {
            case -934343034:
                if (str.equals("revoke")) {
                    b(nVar2);
                    return;
                }
                return;
            case -788452891:
                if (str.equals("stop_apply_segment")) {
                    a(nVar2);
                    return;
                }
                return;
            case 93029230:
                if (str.equals("apply")) {
                    a(nVar, nVar2, gVar, z2);
                    return;
                }
                return;
            case 94746189:
                if (str.equals("clear")) {
                    b(nVar, nVar2, z2);
                    return;
                }
                return;
            case 116685666:
                if (str.equals("apply_segment")) {
                    a(nVar2, gVar);
                    return;
                }
                return;
            case 1645967087:
                if (str.equals("add_effect")) {
                    List<IAudioEffectParam> list = nVar2.f156918g;
                    if (list == null) {
                        h.f.b.l.b();
                    }
                    a(list, gVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a(dmt.av.video.n nVar, dmt.av.video.n nVar2, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar, boolean z2) {
        this.n = nVar2;
        if (nVar2.f156917f != null) {
            Callable<Boolean> a2 = a(nVar, nVar2, z2, gVar);
            b.g<Boolean, h.z> c2 = c(nVar2);
            if (this.q) {
                b.i.a(a2, l()).a(new g(n(), this, nVar2, nVar, z2, gVar), l()).a(c2, b.i.f4826c);
            } else {
                b.i.b((Callable) a2).a(c2, b.i.f4826c);
            }
        }
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    private final void a(dmt.av.video.n nVar, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        IAudioEffectParam iAudioEffectParam = nVar.f156917f;
        if (iAudioEffectParam == null) {
            h.f.b.l.b();
        }
        a(iAudioEffectParam, nVar.f156920i, gVar);
    }

    private void a(List<? extends IAudioEffectParam> list, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(gVar, "");
        b bVar = new b(this, list, true, gVar);
        if (this.q) {
            b.i.a(bVar, l());
        } else {
            b.i.b((Callable) bVar);
        }
    }

    public final void a(dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z2) {
        int i2;
        if (nVar != null) {
            if (z2) {
                i2 = nVar.f156913b.get();
            } else {
                i2 = nVar.f156912a.get();
            }
            int[] iArr = nVar.f156914c.get() > 0 ? new int[]{i2, nVar.f156914c.get()} : new int[]{i2};
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.c(iArr);
            if (z2) {
                AtomicInteger atomicInteger = nVar.f156912a;
                h.f.b.l.d(atomicInteger, "");
                nVar2.f156912a = atomicInteger;
            } else {
                AtomicInteger atomicInteger2 = nVar.f156913b;
                h.f.b.l.d(atomicInteger2, "");
                nVar2.f156913b = atomicInteger2;
            }
        }
        if (z2) {
            nVar2.f156913b.set(-1);
        } else {
            nVar2.f156912a.set(-1);
        }
    }

    public final boolean a(dmt.av.video.w wVar, dmt.av.video.w wVar2) {
        h.f.b.l.d(wVar2, "");
        boolean n2 = n();
        Iterator<T> it = m().f88909a.iterator();
        while (it.hasNext()) {
            it.next().a(wVar == null ? dmt.av.video.w.a() : wVar);
        }
        if (wVar != null) {
            if (dmt.av.video.w.a(wVar)) {
                androidx.lifecycle.t<Boolean> tVar = this.f156774a;
                if (tVar != null) {
                    tVar.setValue(false);
                }
            } else if (dmt.av.video.w.b(wVar)) {
                com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                if (gVar == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar.t(wVar.f156975e);
            } else if (dmt.av.video.w.c(wVar)) {
                com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                if (gVar2 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar2.t(wVar.f156975e);
            }
        }
        if (dmt.av.video.w.a(wVar2)) {
            androidx.lifecycle.t<Boolean> tVar2 = this.f156774a;
            if (tVar2 != null) {
                tVar2.setValue(true);
            }
        } else if (dmt.av.video.w.b(wVar2)) {
            int i2 = (int) wVar2.f156972b;
            VERepeatFilterParam vERepeatFilterParam = new VERepeatFilterParam();
            vERepeatFilterParam.seqIn = i2;
            vERepeatFilterParam.repeatTime = wVar2.f156974d;
            vERepeatFilterParam.repeatDuration = (int) (a(wVar2.f156973c) - wVar2.f156972b);
            vERepeatFilterParam.timeMode = x.h.EDITOR_SLOMO_MODE.ordinal();
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            a(wVar2, gVar3.a(vERepeatFilterParam));
        } else if (dmt.av.video.w.c(wVar2)) {
            int i3 = (int) wVar2.f156972b;
            VESlowMotionFilterParam vESlowMotionFilterParam = new VESlowMotionFilterParam();
            vESlowMotionFilterParam.seqIn = i3;
            vESlowMotionFilterParam.slowMotionDuration = (int) (a(wVar2.f156973c) - wVar2.f156972b);
            vESlowMotionFilterParam.slowMotionSpeed = 0.5f;
            vESlowMotionFilterParam.timeMode = x.h.EDITOR_SLOMO_MODE.ordinal();
            com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
            if (gVar4 == null) {
                h.f.b.l.a("mVEEditor");
            }
            a(wVar2, gVar4.a(vESlowMotionFilterParam));
        }
        Iterator<T> it2 = m().f88909a.iterator();
        while (it2.hasNext()) {
            it2.next().b(wVar2 == null ? dmt.av.video.w.a() : wVar2);
        }
        b(n2);
        return false;
    }

    private final void a(dmt.av.video.w wVar, int i2) {
        if (i2 >= 0) {
            wVar.f156975e = i2;
        }
        androidx.lifecycle.t<dmt.av.video.w> tVar = this.f156775b;
        if (tVar != null) {
            tVar.setValue(wVar);
        }
    }

    public final boolean a(FilterBean filterBean, boolean z2) {
        float f2;
        if (filterBean == null) {
            return false;
        }
        if (z2) {
            f2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, a(), this.I);
            if (f2 == -1.0f) {
                f2 = 0.8f;
            }
        } else {
            f2 = 1.0f;
        }
        a(filterBean, f2, z2);
        return false;
    }

    public final void a(FilterBean filterBean) {
        if (filterBean != null) {
            float a2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, a(), this.I);
            if (a2 == -1.0f) {
                a2 = 0.8f;
            }
            a(filterBean, a2, true);
        }
    }

    public final String a(FilterBean filterBean, String str) {
        if (filterBean == null) {
            return null;
        }
        j();
        if (!TextUtils.isEmpty(this.z)) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.removeComposerNodes(new String[]{this.z});
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.a(this.L, vEComposerFilterParam);
        }
        VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
        vEComposerFilterParam2.autoDump = true;
        vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{str}, new String[]{""});
        com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
        if (gVar2 == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar2.a(this.L, vEComposerFilterParam2);
        this.z = str;
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
        return this.z;
    }

    public final float a(String str) {
        h.f.b.l.d(str, "");
        if (this.f156780g == null) {
            return 0.0f;
        }
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        float c2 = gVar.c(str);
        if (this.f156780g != null) {
            return c2;
        }
        h.f.b.l.a("mVEEditor");
        return c2;
    }

    public final void a(MultiSegmentPropExtra multiSegmentPropExtra) {
        if (!(multiSegmentPropExtra == null || multiSegmentPropExtra.getClips().isEmpty() || this.f156780g == null)) {
            List<ClipsModel> clips = multiSegmentPropExtra.getClips();
            int[] iArr = new int[clips.size()];
            int size = clips.size();
            VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = i2;
                ClipsModel clipsModel = clips.get(i2);
                float component3 = clipsModel.component3();
                List<Float> component4 = clipsModel.component4();
                List<Float> component5 = clipsModel.component5();
                float[] a2 = com.ss.android.vesdk.utils.a.a(component4);
                float[] a3 = com.ss.android.vesdk.utils.a.a(component5);
                float[] transferTrimPointXtoSeqPointX = VECurveSpeedUtils.transferTrimPointXtoSeqPointX(a2, a3);
                double aveCurveSpeed = new VECurveSpeedUtils(transferTrimPointXtoSeqPointX, a3).getAveCurveSpeed();
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.curveSpeedPointX = transferTrimPointXtoSeqPointX;
                vEClipTimelineParam.curveSpeedPointY = a3;
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) (component3 * 1000.0f);
                vEClipTimelineParam.speed = aveCurveSpeed;
                vEClipTimelineParamArr[i2] = vEClipTimelineParam;
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.g(false);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.J();
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar3.a(0, iArr, vEClipTimelineParamArr);
            com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
            if (gVar4 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar4.a(1, iArr, vEClipTimelineParamArr);
            com.ss.android.ugc.asve.editor.g gVar5 = this.f156780g;
            if (gVar5 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar5.g(true);
        }
    }

    public final boolean a(dmt.av.video.v vVar) {
        dmt.av.video.r rVar;
        int a2;
        h.f.b.l.d(vVar, "");
        if (this.f156782i != -1) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.e(this.f156782i);
        }
        if (!TextUtils.isEmpty(vVar.f156969a) && (rVar = this.o) != null) {
            if (rVar.f156941d != 0) {
                com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                if (gVar2 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                String str = vVar.f156969a;
                h.f.b.l.b(str, "");
                a2 = gVar2.a(str, rVar.f156939b, rVar.f156940c, rVar.f156941d, rVar.f156942e, vVar.f156970b);
            } else {
                com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
                if (gVar3 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                String str2 = vVar.f156969a;
                h.f.b.l.b(str2, "");
                a2 = gVar3.a(str2, rVar.f156939b, rVar.f156940c, vVar.f156970b);
            }
            this.f156782i = a2;
            this.K = -1;
            if (rVar.f156945h != 0.0d) {
                if (rVar.f156947j) {
                    a(this.f156782i, rVar.f156945h, rVar.f156948k, rVar.f156949l);
                } else {
                    String str3 = vVar.f156969a;
                    h.f.b.l.b(str3, "");
                    b(str3);
                }
            }
            rVar.f156938a = this.f156782i;
        }
        if (this.f156780g != null) {
            return false;
        }
        h.f.b.l.a("mVEEditor");
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class ac extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.asve.editor.g> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.asve.editor.g invoke() {
            return this.this$0.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad extends h.f.b.m implements h.f.a.a<List<? extends EffectPointModel>> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<? extends EffectPointModel> invoke() {
            return this.this$0.f156777d;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag extends h.f.b.m implements h.f.a.a<dmt.av.video.r> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ dmt.av.video.r invoke() {
            return this.this$0.o;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ah extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<IAudioEffectParam>> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ androidx.lifecycle.t<IAudioEffectParam> invoke() {
            return this.this$0.f156776c;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.t f156832b;

        static {
            Covode.recordClassIndex(104161);
        }

        l(j jVar, dmt.av.video.t tVar) {
            this.f156831a = jVar;
            this.f156832b = tVar;
        }

        public final void run() {
            this.f156831a.b(this.f156832b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aa implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.t f156788b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f156789c;

        static {
            Covode.recordClassIndex(104136);
        }

        aa(j jVar, dmt.av.video.t tVar, Runnable runnable) {
            this.f156787a = jVar;
            this.f156788b = tVar;
            this.f156789c = runnable;
        }

        public final void run() {
            this.f156787a.a(this.f156788b, this.f156789c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f156822d;

        static {
            Covode.recordClassIndex(104155);
        }

        h(j jVar, dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z) {
            this.f156819a = jVar;
            this.f156820b = nVar;
            this.f156821c = nVar2;
            this.f156822d = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ h.z call() {
            this.f156819a.a(this.f156820b, this.f156821c, this.f156822d);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.b.j$j  reason: collision with other inner class name */
    public static final class RunnableC4144j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156827a;

        static {
            Covode.recordClassIndex(104157);
        }

        RunnableC4144j(j jVar) {
            this.f156827a = jVar;
        }

        public final void run() {
            SafeHandler safeHandler = this.f156827a.t;
            if (safeHandler != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.av.video.b.j.RunnableC4144j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RunnableC4144j f156828a;

                    static {
                        Covode.recordClassIndex(104158);
                    }

                    {
                        this.f156828a = r1;
                    }

                    public final void run() {
                        this.f156828a.f156827a.e();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156829a;

        static {
            Covode.recordClassIndex(104159);
        }

        k(j jVar) {
            this.f156829a = jVar;
        }

        public final void run() {
            SafeHandler safeHandler = this.f156829a.t;
            if (safeHandler != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.av.video.b.j.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f156830a;

                    static {
                        Covode.recordClassIndex(104160);
                    }

                    {
                        this.f156830a = r1;
                    }

                    public final void run() {
                        this.f156830a.f156829a.f();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.t f156834b;

        static {
            Covode.recordClassIndex(104162);
        }

        m(j jVar, dmt.av.video.t tVar) {
            this.f156833a = jVar;
            this.f156834b = tVar;
        }

        public final void run() {
            this.f156833a.a(this.f156834b, (Runnable) null);
        }
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156846a;

        static {
            Covode.recordClassIndex(104171);
        }

        t(j jVar) {
            this.f156846a = jVar;
        }

        public final void run() {
            this.f156846a.c().p();
        }
    }

    private final Executor l() {
        Executor executor = this.H;
        if (executor != null) {
            return executor;
        }
        ExecutorService k2 = k();
        this.H = k2;
        h.f.b.l.b(k2, "");
        return k2;
    }

    private final boolean n() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f156778e;
        if (vEEditorAutoStartStopArbiter == null) {
            return false;
        }
        boolean z2 = vEEditorAutoStartStopArbiter.f156721a;
        if (z2) {
            return z2;
        }
        vEEditorAutoStartStopArbiter.a(true);
        return z2;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.asve.editor.g c() {
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        return gVar;
    }

    public final void f() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f156778e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.a(true);
        }
    }

    static {
        Covode.recordClassIndex(104134);
    }

    private final com.ss.android.ugc.aweme.filter.repository.a.n a() {
        com.ss.android.ugc.aweme.filter.repository.a.n nVar = this.p;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static ExecutorService k() {
        return com.ss.android.ugc.aweme.cw.g.a(com.ss.android.ugc.aweme.cw.l.a(com.ss.android.ugc.aweme.cw.o.FIXED).a(1).a());
    }

    public final int d() {
        if (this.f156780g == null) {
            return 0;
        }
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        return gVar.G();
    }

    public final void e() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f156778e;
        if (vEEditorAutoStartStopArbiter == null) {
            return;
        }
        if (vEEditorAutoStartStopArbiter.f156721a) {
            vEEditorAutoStartStopArbiter.a(false);
        } else {
            vEEditorAutoStartStopArbiter.b();
        }
    }

    public final void i() {
        w wVar = new w(this);
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        gVar.c(wVar);
    }

    /* access modifiers changed from: package-private */
    public static final class ab implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f156791b;

        static {
            Covode.recordClassIndex(104137);
        }

        ab(j jVar, CountDownLatch countDownLatch) {
            this.f156790a = jVar;
            this.f156791b = countDownLatch;
        }

        public final void run() {
            SafeHandler safeHandler;
            this.f156791b.countDown();
            if (this.f156790a.t == null && (this.f156790a.f156779f instanceof androidx.lifecycle.m)) {
                j jVar = this.f156790a;
                Context context = this.f156790a.f156779f;
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                jVar.t = new SafeHandler((androidx.lifecycle.m) context);
            }
            if (this.f156790a.s != null && (safeHandler = this.f156790a.t) != null) {
                safeHandler.post(new Runnable(this) {
                    /* class dmt.av.video.b.j.ab.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ ab f156792a;

                    static {
                        Covode.recordClassIndex(104138);
                    }

                    {
                        this.f156792a = r1;
                    }

                    public final void run() {
                        com.ss.android.ugc.tools.view.widget.k.b(this.f156792a.f156790a.s);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable<LoudnessDetectResult[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f156801b;

        static {
            Covode.recordClassIndex(104148);
        }

        c(j jVar, String str) {
            this.f156800a = jVar;
            this.f156801b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ LoudnessDetectResult[] call() {
            dmt.av.video.r rVar = this.f156800a.o;
            if (rVar == null) {
                h.f.b.l.b();
            }
            return com.ss.android.vesdk.x.a(new String[]{this.f156801b}, new int[]{rVar.f156939b}, new int[]{rVar.f156940c});
        }
    }

    public final void g() {
        FilterBean filterBean = this.B;
        if (filterBean != null && com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
            j();
            if (this.L != -1) {
                VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                vEComposerFilterParam.autoDump = true;
                vEComposerFilterParam.setComposerMode(1, 0);
                com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                if (gVar == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar.a(this.L, vEComposerFilterParam);
                a(filterBean);
            }
            if (this.f156780g == null) {
                h.f.b.l.a("mVEEditor");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<V> implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f156855b;

        static {
            Covode.recordClassIndex(104176);
        }

        x(j jVar, int i2) {
            this.f156854a = jVar;
            this.f156855b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            if (this.f156854a.f156786m.size() == 0) {
                return -1;
            }
            int i2 = 0;
            int g2 = this.f156854a.c().g(this.f156854a.f156786m.get(this.f156854a.f156786m.size() - 1).intValue(), this.f156855b);
            if (this.f156854a.f156783j >= 0) {
                i2 = this.f156854a.c().g(this.f156854a.f156785l.get(this.f156854a.f156785l.size() - 1).intValue(), this.f156855b);
            }
            return Integer.valueOf(i2 | g2);
        }
    }

    private final com.ss.android.ugc.aweme.effect.c.a.b m() {
        com.ss.android.ugc.aweme.effect.c.a.b bVar = this.M;
        if (bVar != null) {
            return bVar;
        }
        com.ss.android.ugc.aweme.effect.c.a.b bVar2 = new com.ss.android.ugc.aweme.effect.c.a.b();
        ac acVar = new ac(this);
        bVar2.a(new com.ss.android.ugc.aweme.effect.c.a.d(acVar, new ad(this), new ae(this), new af(this)));
        bVar2.a(new com.ss.android.ugc.aweme.effect.c.a.e(acVar, new ag(this)));
        bVar2.a(new com.ss.android.ugc.aweme.effect.c.a.c(acVar, new ah(this)));
        this.M = bVar2;
        return bVar2;
    }

    public final void h() {
        FilterBean filterBean = this.B;
        if (filterBean != null && com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
            j();
            com.ss.android.ugc.tools.c.f149151f.a("append composer filter in composer callback, filter resId: " + filterBean.getResId());
            float f2 = this.C;
            if (f2 == -1.0f) {
                f2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, a(), this.I);
            }
            if (f2 == -1.0f) {
                f2 = 0.8f;
            }
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.appendComposerNodesWithTag(new String[]{com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean, f2)}, new String[]{""});
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.a(this.L, vEComposerFilterParam);
        }
    }

    public final int j() {
        if (this.f156780g == null) {
            return -1;
        }
        if (this.L == -1) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            this.L = gVar.a(0, 0, vEComposerFilterParam);
            vEComposerFilterParam.setComposerMode(1, 0);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.a(this.L, vEComposerFilterParam);
        }
        this.u.d(F + "enableComposerFilter: mComposerFilterIndex = " + this.L);
        return this.L;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f156794b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f156795c = true;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g f156796d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f156797e;

        static {
            Covode.recordClassIndex(104145);
        }

        b(j jVar, List list, boolean z, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
            this.f156793a = jVar;
            this.f156794b = list;
            this.f156796d = gVar;
            this.f156797e = true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ h.z call() {
            boolean z;
            Object[] objArr = new Object[3];
            objArr[0] = j.F;
            if (this.f156793a.f156783j >= 0) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            Object[] array = this.f156794b.toArray(new IAudioEffectParam[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String arrays = Arrays.toString(array);
            h.f.b.l.b(arrays, "");
            objArr[2] = arrays;
            h.f.b.l.b(com.a.a("%s hasRecord %b params %s", Arrays.copyOf(objArr, 3)), "");
            if (this.f156795c) {
                for (IAudioEffectParam iAudioEffectParam : this.f156794b) {
                    this.f156793a.f156786m.add(Integer.valueOf(this.f156793a.c().a(this.f156793a.c().x(), this.f156793a.c().y(), iAudioEffectParam.getEffectPath(), this.f156796d.a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new a(this))));
                }
            }
            if (this.f156797e && this.f156793a.f156783j >= 0) {
                for (IAudioEffectParam iAudioEffectParam2 : this.f156794b) {
                    this.f156793a.f156785l.add(Integer.valueOf(this.f156793a.c().a(1, this.f156793a.f156783j, iAudioEffectParam2.getEffectPath(), this.f156796d.a(iAudioEffectParam2.getEffectPath()), iAudioEffectParam2.getSeqIn(), iAudioEffectParam2.getSeqOut(), new C4143b(this))));
                }
            }
            return h.z.f158842a;
        }

        static final class a implements VEListener.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f156798a;

            static {
                Covode.recordClassIndex(104146);
            }

            a(b bVar) {
                this.f156798a = bVar;
            }

            @Override // com.ss.android.vesdk.VEListener.a
            public final void a(String str, int i2, byte[] bArr) {
                if (i2 >= 0) {
                    this.f156798a.f156796d.a(str, bArr);
                }
            }
        }

        /* renamed from: dmt.av.video.b.j$b$b  reason: collision with other inner class name */
        static final class C4143b implements VEListener.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f156799a;

            static {
                Covode.recordClassIndex(104147);
            }

            C4143b(b bVar) {
                this.f156799a = bVar;
            }

            @Override // com.ss.android.vesdk.VEListener.a
            public final void a(String str, int i2, byte[] bArr) {
                if (i2 >= 0) {
                    this.f156799a.f156796d.a(str, bArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable<List<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAudioEffectParam f156804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g f156805c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.b f156806d;

        static {
            Covode.recordClassIndex(104150);
        }

        e(j jVar, IAudioEffectParam iAudioEffectParam, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar, dmt.av.video.b bVar) {
            this.f156803a = jVar;
            this.f156804b = iAudioEffectParam;
            this.f156805c = gVar;
            this.f156806d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<Integer> call() {
            ArrayList arrayList = new ArrayList();
            int a2 = this.f156803a.c().a(new int[]{this.f156803a.c().x(), this.f156803a.c().y(), this.f156804b.getSeqIn()}, this.f156804b.getEffectPath(), this.f156805c.a(this.f156804b.getEffectPath()), new VEListener.a(this) {
                /* class dmt.av.video.b.j.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f156807a;

                static {
                    Covode.recordClassIndex(104151);
                }

                {
                    this.f156807a = r1;
                }

                @Override // com.ss.android.vesdk.VEListener.a
                public final void a(String str, int i2, byte[] bArr) {
                    if (i2 >= 0) {
                        this.f156807a.f156805c.a(str, bArr);
                    }
                }
            });
            this.f156803a.f156786m.add(Integer.valueOf(a2));
            arrayList.add(Integer.valueOf(a2));
            if (this.f156803a.f156783j >= 0) {
                this.f156803a.f156785l.add(Integer.valueOf(this.f156803a.c().a(new int[]{1, this.f156803a.f156783j, this.f156804b.getSeqIn()}, this.f156804b.getEffectPath(), this.f156805c.a(this.f156804b.getEffectPath()), new VEListener.a(this) {
                    /* class dmt.av.video.b.j.e.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f156808a;

                    static {
                        Covode.recordClassIndex(104152);
                    }

                    {
                        this.f156808a = r1;
                    }

                    @Override // com.ss.android.vesdk.VEListener.a
                    public final void a(String str, int i2, byte[] bArr) {
                        if (i2 >= 0) {
                            this.f156808a.f156805c.a(str, bArr);
                        }
                    }
                })));
                arrayList.add(Integer.valueOf(this.f156803a.f156783j));
            }
            h.f.b.l.b(com.a.a("%s apply audio effect path %s seqIn %d filter index %s", Arrays.copyOf(new Object[]{j.F, this.f156804b.getEffectPath(), Integer.valueOf(this.f156804b.getSeqIn()), arrayList.toString()}, 4)), "");
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156835a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156837c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f156838d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g f156839e;

        static {
            Covode.recordClassIndex(104165);
        }

        p(j jVar, dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
            this.f156835a = jVar;
            this.f156836b = nVar;
            this.f156837c = nVar2;
            this.f156838d = z;
            this.f156839e = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            int trackType;
            int trackIndex;
            this.f156835a.a(this.f156836b, this.f156837c, this.f156838d);
            IAudioEffectParam iAudioEffectParam = this.f156837c.f156917f;
            boolean z = false;
            if (iAudioEffectParam != null && com.ss.android.ugc.tools.utils.i.a(iAudioEffectParam.getEffectPath())) {
                if (this.f156838d) {
                    trackType = this.f156835a.c().x();
                } else {
                    trackType = iAudioEffectParam.getTrackType();
                }
                if (this.f156838d) {
                    trackIndex = this.f156835a.c().y();
                } else {
                    trackIndex = iAudioEffectParam.getTrackIndex();
                }
                System.currentTimeMillis();
                int a2 = this.f156835a.c().a(trackType, trackIndex, iAudioEffectParam.getEffectPath(), this.f156839e.a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new VEListener.a(this) {
                    /* class dmt.av.video.b.j.p.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ p f156840a;

                    static {
                        Covode.recordClassIndex(104166);
                    }

                    {
                        this.f156840a = r1;
                    }

                    @Override // com.ss.android.vesdk.VEListener.a
                    public final void a(String str, int i2, byte[] bArr) {
                        if (i2 >= 0) {
                            this.f156840a.f156839e.a(str, bArr);
                        }
                    }
                });
                System.currentTimeMillis();
                if (this.f156838d) {
                    this.f156837c.f156913b.set(a2);
                } else {
                    this.f156837c.f156912a.set(a2);
                }
                int i2 = -1;
                if (this.f156835a.f156783j >= 0) {
                    System.currentTimeMillis();
                    i2 = this.f156835a.c().a(1, this.f156835a.f156783j, iAudioEffectParam.getEffectPath(), this.f156839e.a(iAudioEffectParam.getEffectPath()), iAudioEffectParam.getSeqIn(), iAudioEffectParam.getSeqOut(), new VEListener.a(this) {
                        /* class dmt.av.video.b.j.p.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ p f156841a;

                        static {
                            Covode.recordClassIndex(104167);
                        }

                        {
                            this.f156841a = r1;
                        }

                        @Override // com.ss.android.vesdk.VEListener.a
                        public final void a(String str, int i2, byte[] bArr) {
                            if (i2 >= 0) {
                                this.f156841a.f156839e.a(str, bArr);
                            }
                        }
                    });
                    System.currentTimeMillis();
                    this.f156835a.f156784k = i2;
                    this.f156837c.f156914c.set(i2);
                }
                if (a2 >= 0 || (this.f156835a.f156783j >= 0 && i2 >= 0)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<V> implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f156848b = true;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f156849c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f156850d;

        static {
            Covode.recordClassIndex(104172);
        }

        u(j jVar, boolean z, int i2) {
            this.f156847a = jVar;
            this.f156849c = i2;
            this.f156850d = true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            int size;
            int i2;
            int size2;
            int i3;
            ArrayList arrayList = new ArrayList();
            if (this.f156848b && this.f156849c <= this.f156847a.f156786m.size() && this.f156847a.f156786m.size() - 1 >= (size2 = this.f156847a.f156786m.size() - this.f156849c)) {
                while (true) {
                    arrayList.add(this.f156847a.f156786m.get(i3));
                    if (i3 == size2) {
                        break;
                    }
                    i3--;
                }
            }
            if (this.f156850d && this.f156847a.f156783j >= 0 && this.f156849c <= this.f156847a.f156785l.size() && this.f156847a.f156785l.size() - 1 >= (size = this.f156847a.f156785l.size() - this.f156849c)) {
                while (true) {
                    arrayList.add(this.f156847a.f156785l.get(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2--;
                }
            }
            if (arrayList.size() == 0) {
                return 0;
            }
            int size3 = arrayList.size();
            int[] iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = ((Number) arrayList.get(i4)).intValue();
            }
            int c2 = this.f156847a.c().c(iArr);
            if (c2 == 0) {
                if (this.f156849c <= this.f156847a.f156786m.size()) {
                    j jVar = this.f156847a;
                    jVar.f156786m = jVar.f156786m.subList(0, this.f156847a.f156786m.size() - this.f156849c);
                }
                if (this.f156849c <= this.f156847a.f156785l.size()) {
                    j jVar2 = this.f156847a;
                    jVar2.f156785l = jVar2.f156785l.subList(0, this.f156847a.f156785l.size() - this.f156849c);
                }
            }
            return Integer.valueOf(c2);
        }
    }

    public final com.ss.android.ugc.asve.editor.g b() {
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar != null) {
            return gVar;
        }
        h.f.b.l.a("mVEEditor");
        throw new IllegalArgumentException("initVEEditor not called yet".toString());
    }

    public static final class s implements com.ss.android.ugc.aweme.filter.repository.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156845a;

        static {
            Covode.recordClassIndex(104170);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(j jVar) {
            this.f156845a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            h.f.b.l.d(filterBean, "");
            float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
            if (c2 != 0.0f || this.f156845a.f156780g == null) {
                return c2;
            }
            com.ss.android.ugc.asve.editor.g c3 = this.f156845a.c();
            String filterFolder = filterBean.getFilterFolder();
            h.f.b.l.b(filterFolder, "");
            float c4 = c3.c(filterFolder);
            this.f156845a.c();
            return c4;
        }
    }

    private final void b(dmt.av.video.n nVar) {
        b(nVar.f156919h);
    }

    private final b.g<Boolean, h.z> c(dmt.av.video.n nVar) {
        return new q(this, nVar);
    }

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g<h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156824b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156825c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f156826d;

        static {
            Covode.recordClassIndex(104156);
        }

        i(j jVar, dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z) {
            this.f156823a = jVar;
            this.f156824b = nVar;
            this.f156825c = nVar2;
            this.f156826d = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<h.z> iVar) {
            androidx.lifecycle.t<IAudioEffectParam> tVar = this.f156823a.f156776c;
            if (tVar == null) {
                return null;
            }
            tVar.setValue(null);
            return h.z.f158842a;
        }
    }

    private final long a(long j2) {
        return Math.min((long) d(), j2);
    }

    public final void b(boolean z2) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        if (!z2 && (vEEditorAutoStartStopArbiter = this.f156778e) != null) {
            vEEditorAutoStartStopArbiter.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ae extends h.f.b.m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            Integer num2 = num;
            com.ss.android.ugc.asve.editor.g c2 = this.this$0.c();
            if (num2 == null) {
                h.f.b.l.b();
            }
            return Integer.valueOf(c2.r(num2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af extends h.f.b.m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(104142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            Integer num2 = num;
            com.ss.android.ugc.asve.editor.g c2 = this.this$0.c();
            if (num2 == null) {
                h.f.b.l.b();
            }
            return Integer.valueOf(c2.s(num2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f156813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f156814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156815c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156816d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f156817e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g f156818f;

        static {
            Covode.recordClassIndex(104154);
        }

        g(boolean z, j jVar, dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z2, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
            this.f156813a = z;
            this.f156814b = jVar;
            this.f156815c = nVar;
            this.f156816d = nVar2;
            this.f156817e = z2;
            this.f156818f = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ Boolean then(b.i<Boolean> iVar) {
            h.f.b.l.d(iVar, "");
            this.f156814b.b(this.f156813a);
            return iVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<TTaskResult, TContinuationResult> implements b.g<Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f156851a = new v();

        static {
            Covode.recordClassIndex(104173);
        }

        v() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<Integer> iVar) {
            h.f.b.l.b(iVar, "");
            if (iVar.c()) {
                iVar.e().printStackTrace();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<TTaskResult, TContinuationResult> implements b.g<Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f156856a = new y();

        static {
            Covode.recordClassIndex(104177);
        }

        y() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<Integer> iVar) {
            h.f.b.l.b(iVar, "");
            if (iVar.c()) {
                iVar.e().printStackTrace();
            }
            return h.z.f158842a;
        }
    }

    private final void b(int i2) {
        b.i.a(new u(this, true, i2), l()).a((b.g) v.f156851a);
    }

    private final void c(dmt.av.video.t tVar) {
        int i2 = tVar.f156954a;
        if (i2 == 0) {
            e();
        } else if (i2 == 1) {
            f();
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            b(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g<LoudnessDetectResult[], h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156802a;

        static {
            Covode.recordClassIndex(104149);
        }

        d(j jVar) {
            this.f156802a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<LoudnessDetectResult[]> iVar) {
            LoudnessDetectResult loudnessDetectResult;
            h.f.b.l.b(iVar, "");
            LoudnessDetectResult[] d2 = iVar.d();
            if (!(d2 == null || d2[0] == null || (loudnessDetectResult = d2[0]) == null || loudnessDetectResult.result != 0)) {
                double d3 = d2[0].peakLoudness;
                double d4 = d2[0].avgLoudness;
                j jVar = this.f156802a;
                int i2 = jVar.f156782i;
                dmt.av.video.r rVar = this.f156802a.o;
                if (rVar == null) {
                    h.f.b.l.b();
                }
                jVar.a(i2, rVar.f156945h, d3, d4);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements b.g<List<Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAudioEffectParam f156810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g f156811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.b f156812d;

        static {
            Covode.recordClassIndex(104153);
        }

        f(j jVar, IAudioEffectParam iAudioEffectParam, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar, dmt.av.video.b bVar) {
            this.f156809a = jVar;
            this.f156810b = iAudioEffectParam;
            this.f156811c = gVar;
            this.f156812d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<List<Integer>> iVar) {
            h.f.b.l.b(iVar, "");
            if (iVar.c()) {
                iVar.e().printStackTrace();
            }
            if (iVar.a()) {
                Objects.requireNonNull(iVar.d(), "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                if (this.f156812d == null) {
                    h.f.b.l.b();
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<TTaskResult, TContinuationResult> implements b.g<Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dmt.av.video.n f156843b;

        static {
            Covode.recordClassIndex(104168);
        }

        q(j jVar, dmt.av.video.n nVar) {
            this.f156842a = jVar;
            this.f156843b = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(b.i<Boolean> iVar) {
            Context context;
            h.f.b.l.d(iVar, "");
            if (!iVar.d().booleanValue()) {
                IAudioEffectParam iAudioEffectParam = this.f156843b.f156917f;
                if (!(iAudioEffectParam == null || !iAudioEffectParam.getShowErrorToast() || (context = this.f156842a.f156779f) == null)) {
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    j.a.a(applicationContext, (int) R.string.zh, 0).a();
                }
            } else {
                IAudioEffectParam iAudioEffectParam2 = this.f156843b.f156917f;
                if (iAudioEffectParam2 != null) {
                    iAudioEffectParam2.setPreprocessResult(null);
                    androidx.lifecycle.t<IAudioEffectParam> tVar = this.f156842a.f156776c;
                    if (tVar != null) {
                        tVar.setValue(iAudioEffectParam2);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    private void a(int i2) {
        b.i.a(new x(this, i2), l()).a((b.g) y.f156856a);
    }

    private void b(String str) {
        h.f.b.l.d(str, "");
        b.i.a((Callable) new c(this, str)).a((b.g) new d(this));
    }

    private final void e(dmt.av.video.t tVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.N.execute(new aa(this, tVar, new ab(this, countDownLatch)));
        try {
            int i2 = this.E.f156865b;
            if (i2 < 0) {
                i2 = 0;
            }
            if (!countDownLatch.await((long) i2, TimeUnit.SECONDS)) {
                this.u.c("syncVESeekTimeout max time ".concat(String.valueOf(i2)));
                if (this.s == null && (this.f156779f instanceof Activity)) {
                    Context context = this.f156779f;
                    if (context != null) {
                        this.s = new com.ss.android.ugc.tools.view.widget.o((Activity) context);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
                com.ss.android.ugc.tools.view.widget.k.a(this.s);
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    private final void d(dmt.av.video.t tVar) {
        if (this.t == null && (this.f156779f instanceof androidx.lifecycle.m)) {
            this.t = new SafeHandler((androidx.lifecycle.m) this.f156779f);
        }
        if (tVar.f156954a == 0) {
            if (this.E.f156866c.invoke().booleanValue()) {
                this.N.execute(new RunnableC4144j(this));
            } else {
                e();
            }
        }
        if (tVar.f156954a == 1) {
            if (this.E.f156866c.invoke().booleanValue()) {
                this.N.execute(new k(this));
            } else {
                f();
            }
        }
        if (tVar.f156954a == 2) {
            if (this.E.f156866c.invoke().booleanValue()) {
                this.N.execute(new l(this, tVar));
            } else {
                b(tVar);
            }
        }
        if (tVar.f156954a == 3) {
            if (this.E.f156866c.invoke().booleanValue()) {
                e(tVar);
            } else {
                a(tVar, (Runnable) null);
            }
        }
        if (tVar.f156954a == 4) {
            this.N.execute(new m(this, tVar));
        }
    }

    private final void a(dmt.av.video.n nVar) {
        IAudioEffectParam iAudioEffectParam = nVar.f156917f;
        if (iAudioEffectParam == null) {
            h.f.b.l.b();
        }
        a(iAudioEffectParam.getSeqOut());
    }

    public final void b(dmt.av.video.t tVar) {
        x.f fVar;
        com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
        if (gVar == null) {
            h.f.b.l.a("mVEEditor");
        }
        int i2 = (int) tVar.f156955b;
        if (tVar.f156954a == 2) {
            fVar = x.f.EDITOR_SEEK_FLAG_OnGoing;
        } else {
            fVar = x.f.EDITOR_SEEK_FLAG_LastSeek;
        }
        int a2 = gVar.a(i2, fVar);
        if (a2 != 0) {
            this.u.a("Seek failed. ret = " + a2 + " See logs for more details.");
        }
    }

    public static final class z implements com.ss.android.vesdk.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.j f156858b;

        static {
            Covode.recordClassIndex(104178);
        }

        z(j jVar, b.j jVar2) {
            this.f156857a = jVar;
            this.f156858b = jVar2;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == 4101) {
                this.f156858b.a((Object) null);
                this.f156857a.c().d(this);
            }
        }
    }

    public j(s sVar, ScheduledExecutorService scheduledExecutorService) {
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(scheduledExecutorService, "");
        this.E = sVar;
        this.N = scheduledExecutorService;
    }

    private final void c(com.ss.android.ugc.aweme.shortvideo.edit.b.b bVar, String str) {
        String str2 = "";
        if (bVar.f126946d) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            if (bVar.f126943a) {
                str2 = bVar.f126947e;
            }
            gVar.b(str2);
        } else {
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            if (!bVar.f126943a) {
                str = str2;
            }
            gVar2.a(str);
        }
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    private final void a(int i2, ArrayList<EffectPointModel> arrayList) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (arrayList == null) {
            h.f.b.l.b();
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            EffectPointModel effectPointModel = arrayList.get(i3);
            h.f.b.l.b(effectPointModel, "");
            if (effectPointModel.getIndex() == i2) {
                if (this.E.f156869f) {
                    com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                    if (gVar == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    gVar.a(new int[]{i2});
                } else {
                    com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                    if (gVar2 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    gVar2.b(new int[]{i2});
                }
                arrayList.remove(i3);
                atomicBoolean.set(true);
            }
            if (this.f156780g == null) {
                h.f.b.l.a("mVEEditor");
            }
            if (atomicBoolean.get()) {
                return;
            }
        }
    }

    private void b(com.ss.android.ugc.aweme.shortvideo.edit.b.b bVar, String str) {
        h.f.b.l.d(bVar, "");
        if (!bVar.f126948f.f126956b || bVar.f126944b < 0) {
            an.b(F, "Model acquisition error, not available");
            c(bVar, str);
            return;
        }
        int i2 = 1;
        if (bVar.f126943a) {
            VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam = new VEVideoLensOneKeyHdrParam();
            vEVideoLensOneKeyHdrParam.model_path = bVar.f126948f.f126955a;
            vEVideoLensOneKeyHdrParam.kernel_path = bVar.f126948f.f126957c;
            if (bVar.f126948f.f126958d && bVar.f126944b == 20004) {
                i2 = 0;
            }
            vEVideoLensOneKeyHdrParam.disable_denoise = i2;
            vEVideoLensOneKeyHdrParam.scene_case = bVar.f126944b;
            vEVideoLensOneKeyHdrParam.power_level = 3;
            if (bVar.f126948f.f126959e) {
                vEVideoLensOneKeyHdrParam.asf_mode = bVar.f126948f.f126960f;
                vEVideoLensOneKeyHdrParam.hdr_mode = bVar.f126948f.f126961g;
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            this.A = gVar.a(0, 0, vEVideoLensOneKeyHdrParam);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            an.b("SingleVideoHDREnhance", "useDenoise = " + vEVideoLensOneKeyHdrParam.disable_denoise + ",  asf_mode = " + vEVideoLensOneKeyHdrParam.asf_mode + ", hdr_mode = " + vEVideoLensOneKeyHdrParam.hdr_mode + ", ret = " + gVar2.b(0, this.A, vEVideoLensOneKeyHdrParam) + ", lensOneKeyHdrFilterId = " + this.A);
        } else {
            int[] iArr = {this.A};
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar3.a(iArr);
        }
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    public final void b(FilterBean filterBean, boolean z2) {
        if (filterBean == null) {
            com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
            if (gVar == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar.c("", 0.0f);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
            if (gVar2 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar2.b("", 0.0f);
        } else if (com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
            VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
            vEComposerFilterParam.autoDump = true;
            vEComposerFilterParam.removeComposerNodes(new String[]{filterBean.getFilterFolder()});
            com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
            if (gVar3 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar3.a(this.L, vEComposerFilterParam);
            this.B = null;
        } else {
            com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
            if (gVar4 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar4.c("", 0.0f);
            com.ss.android.ugc.asve.editor.g gVar5 = this.f156780g;
            if (gVar5 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar5.b("", 0.0f);
        }
        if (z2 && this.L != -1) {
            com.ss.android.ugc.asve.editor.g gVar6 = this.f156780g;
            if (gVar6 == null) {
                h.f.b.l.a("mVEEditor");
            }
            gVar6.a(new int[]{this.L});
            this.L = -1;
        }
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    private final void b(dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z2) {
        this.n = null;
        b.i.a(new h(this, nVar, nVar2, z2), l()).a(new i(this, nVar, nVar2, z2), b.i.f4826c);
        if (this.f156780g == null) {
            h.f.b.l.a("mVEEditor");
        }
    }

    private void a(IAudioEffectParam iAudioEffectParam, dmt.av.video.b bVar, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        h.f.b.l.d(iAudioEffectParam, "");
        h.f.b.l.d(gVar, "");
        b.i.a(new e(this, iAudioEffectParam, gVar, bVar), l()).a(new f(this, iAudioEffectParam, gVar, bVar), b.i.f4826c);
    }

    private final void a(FilterBean filterBean, float f2, boolean z2) {
        if (filterBean != null) {
            if (com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
                j();
                if (this.B != null) {
                    VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                    vEComposerFilterParam.autoDump = true;
                    String[] strArr = new String[1];
                    FilterBean filterBean2 = this.B;
                    if (filterBean2 == null) {
                        h.f.b.l.b();
                    }
                    strArr[0] = filterBean2.getFilterFolder();
                    vEComposerFilterParam.replaceComposerNodesWithTag(strArr, new String[]{com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean, f2)}, new String[]{filterBean.getExtra()});
                    com.ss.android.ugc.asve.editor.g gVar = this.f156780g;
                    if (gVar == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    gVar.a(this.L, vEComposerFilterParam);
                } else {
                    VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
                    vEComposerFilterParam2.autoDump = true;
                    vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean, f2)}, new String[]{filterBean.getExtra()});
                    com.ss.android.ugc.asve.editor.g gVar2 = this.f156780g;
                    if (gVar2 == null) {
                        h.f.b.l.a("mVEEditor");
                    }
                    gVar2.a(this.L, vEComposerFilterParam2);
                }
                if (this.f156780g == null) {
                    h.f.b.l.a("mVEEditor");
                }
                this.B = filterBean;
                this.C = f2;
            } else if (z2) {
                com.ss.android.ugc.asve.editor.g gVar3 = this.f156780g;
                if (gVar3 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar3.c(filterBean.getFilterFolder(), f2);
            } else {
                com.ss.android.ugc.asve.editor.g gVar4 = this.f156780g;
                if (gVar4 == null) {
                    h.f.b.l.a("mVEEditor");
                }
                gVar4.b(filterBean.getFilterFolder(), 1.0f);
            }
        }
    }

    static final class r implements com.ss.android.vesdk.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156844a;

        static {
            Covode.recordClassIndex(104169);
        }

        r(j jVar) {
            this.f156844a = jVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == 4116) {
                f.a aVar = this.f156844a.y;
                if (aVar == null) {
                    h.f.b.l.b();
                }
                aVar.a();
            }
        }
    }

    static final class n extends h.f.b.m implements h.f.a.r<Integer, Integer, Integer, Integer, h.z> {
        final /* synthetic */ dmt.av.video.r $mMusicParamCache;
        final /* synthetic */ VEPreviewMusicParams $params;

        static {
            Covode.recordClassIndex(104163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(dmt.av.video.r rVar, VEPreviewMusicParams vEPreviewMusicParams) {
            super(4);
            this.$mMusicParamCache = rVar;
            this.$params = vEPreviewMusicParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            int intValue4 = num4.intValue();
            this.$mMusicParamCache.f156939b = intValue;
            this.$mMusicParamCache.f156940c = intValue2;
            this.$mMusicParamCache.f156941d = intValue3;
            this.$mMusicParamCache.f156942e = intValue4;
            this.$mMusicParamCache.f156943f = this.$params.n;
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.r<Integer, Integer, Integer, Integer, h.z> {
        final /* synthetic */ dmt.av.video.r $mMusicParamCache;

        static {
            Covode.recordClassIndex(104164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(dmt.av.video.r rVar) {
            super(4);
            this.$mMusicParamCache = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            int intValue4 = num4.intValue();
            this.$mMusicParamCache.f156939b = intValue;
            this.$mMusicParamCache.f156940c = intValue2;
            this.$mMusicParamCache.f156941d = intValue3;
            this.$mMusicParamCache.f156942e = intValue4;
            return h.z.f158842a;
        }
    }

    static final class w implements com.ss.android.vesdk.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156852a;

        static {
            Covode.recordClassIndex(104174);
        }

        w(j jVar) {
            this.f156852a = jVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            FilterBean filterBean;
            if (i2 == 4143 && (filterBean = this.f156852a.B) != null && com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
                if (this.f156852a.t == null) {
                    this.f156852a.t = new SafeHandler(this.f156852a.w);
                }
                SafeHandler safeHandler = this.f156852a.t;
                if (safeHandler != null) {
                    safeHandler.post(new Runnable(this) {
                        /* class dmt.av.video.b.j.w.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ w f156853a;

                        static {
                            Covode.recordClassIndex(104175);
                        }

                        {
                            this.f156853a = r1;
                        }

                        public final void run() {
                            this.f156853a.f156852a.h();
                        }
                    });
                }
            }
        }
    }

    private final Callable<Boolean> a(dmt.av.video.n nVar, dmt.av.video.n nVar2, boolean z2, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g gVar) {
        return new p(this, nVar, nVar2, z2, gVar);
    }
}
