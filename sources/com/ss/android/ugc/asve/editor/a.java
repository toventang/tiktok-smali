package com.ss.android.ugc.asve.editor;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.bj;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class a implements g {

    /* renamed from: e  reason: collision with root package name */
    public static final C1353a f61981e = new C1353a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<g.b> f61982a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<VEListener.v> f61983b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<r> f61984c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList<r> f61985d;

    /* renamed from: f  reason: collision with root package name */
    private final r f61986f;

    /* renamed from: g  reason: collision with root package name */
    private final h f61987g;

    /* renamed from: h  reason: collision with root package name */
    private final VEListener.v f61988h;

    /* renamed from: i  reason: collision with root package name */
    private final r f61989i;

    /* renamed from: j  reason: collision with root package name */
    private final r f61990j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61991k;

    /* renamed from: l  reason: collision with root package name */
    private s f61992l;

    /* renamed from: m  reason: collision with root package name */
    private final x f61993m;

    static {
        Covode.recordClassIndex(38114);
    }

    public final Handler m() {
        return (Handler) this.f61987g.getValue();
    }

    /* renamed from: com.ss.android.ugc.asve.editor.a$a  reason: collision with other inner class name */
    public static final class C1353a {
        static {
            Covode.recordClassIndex(38115);
        }

        private C1353a() {
        }

        public /* synthetic */ C1353a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final com.ss.android.vesdk.runtime.b a() {
        com.ss.android.vesdk.runtime.b bVar = E().f151516e;
        l.b(bVar, "");
        return bVar;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final VESize b() {
        VESize c2 = E().c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(String[] strArr) {
        E().b(strArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(VEListener.v vVar) {
        l.d(vVar, "");
        if (this.f61983b.isEmpty()) {
            E().f151522k = this.f61988h;
            s sVar = this.f61992l;
            if (sVar != null) {
                VEListener.v vVar2 = this.f61988h;
                l.d(vVar2, "");
                sVar.f62068d = vVar2;
            }
        }
        if (!a(this.f61983b, vVar)) {
            this.f61983b.add(vVar);
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(r rVar) {
        l.d(rVar, "");
        if (this.f61984c.isEmpty()) {
            E().a(this.f61989i);
            s sVar = this.f61992l;
            if (sVar != null) {
                r rVar2 = this.f61989i;
                l.d(rVar2, "");
                sVar.f62073i = rVar2;
                x xVar = sVar.f62066b;
                if (xVar == null) {
                    l.a("veEditor");
                } else {
                    xVar.a(rVar2);
                }
            }
        }
        if (!a(this.f61984c, rVar)) {
            this.f61984c.add(rVar);
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void b(r rVar) {
        l.d(rVar, "");
        this.f61984c.remove(rVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final VESize a(int i2, int i3) {
        VESize b2 = E().b(i2, i3);
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(float f2, float f3, float f4, int i2, int i3) {
        E().a(f2, f3, f4, i2, i3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final Bitmap a(int i2) {
        return E().a(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(i iVar) {
        s sVar;
        x xVar;
        l.d(iVar, "");
        if (this.f61991k && (iVar instanceof o) && (sVar = this.f61992l) != null) {
            x xVar2 = sVar.f62066b;
            if (xVar2 == null) {
                l.a("veEditor");
            } else {
                xVar2.j();
            }
            HandlerThread handlerThread = sVar.f62065a;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            Looper looper = null;
            sVar.f62065a = null;
            bj a2 = com.ss.android.ugc.asve.editor.nle.b.a();
            if (sVar.t == null) {
                xVar = new x(sVar.s, a2);
            } else {
                xVar = new x(sVar.s, sVar.t, a2);
            }
            xVar.d(false);
            xVar.f(30);
            xVar.e(sVar.n);
            xVar.a(sVar.f62075k);
            if (sVar.f62065a == null) {
                HandlerThread handlerThread2 = new HandlerThread("nle-ve-async");
                handlerThread2.start();
                sVar.f62065a = handlerThread2;
            }
            HandlerThread handlerThread3 = sVar.f62065a;
            if (handlerThread3 != null) {
                looper = handlerThread3.getLooper();
            }
            xVar.a(looper);
            xVar.a(sVar.f62075k);
            xVar.f(sVar.f62076l);
            xVar.f(sVar.f62077m);
            xVar.d(sVar.o);
            xVar.l(sVar.p);
            xVar.k(sVar.q);
            xVar.b(sVar.r);
            xVar.f151522k = sVar.f62069e;
            if (sVar.f62070f != null) {
                xVar.a(sVar.f62070f);
            }
            if (sVar.f62071g != null) {
                xVar.a(sVar.f62071g);
            }
            if (sVar.f62072h != null) {
                r rVar = sVar.f62072h;
                if (rVar == null) {
                    l.b();
                }
                xVar.b(rVar);
            }
            if (sVar.f62073i != null) {
                r rVar2 = sVar.f62073i;
                if (rVar2 == null) {
                    l.b();
                }
                xVar.a(rVar2);
            }
            if (sVar.f62074j != null) {
                VEListener.aa aaVar = sVar.f62074j;
                if (aaVar == null) {
                    l.b();
                }
                xVar.a(aaVar);
            }
            sVar.f62066b = xVar;
        }
        int a3 = iVar.a(E(), this.f61991k);
        this.f61991k = true;
        return a3;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(VERecordData vERecordData, boolean z, boolean z2) {
        return E().a(vERecordData, z, z2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, int i2, int i3) {
        l.d(str, "");
        return E().a(str, i2, i3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(bg bgVar) {
        l.d(bgVar, "");
        return E().a(bgVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(bg bgVar, int i2, int i3) {
        l.d(bgVar, "");
        return E().a(bgVar, i2, i3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, ROTATE_DEGREE rotate_degree) {
        l.d(rotate_degree, "");
        return E().a(i2, rotate_degree);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        l.d(arrayList, "");
        l.d(arrayList2, "");
        return E().a(i2, arrayList, arrayList2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        l.d(iArr, "");
        l.d(vEClipTimelineParamArr, "");
        return E().a(i2, iArr, vEClipTimelineParamArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        l.d(vEBaseFilterParam, "");
        return E().a(i2, 0, vEBaseFilterParam, i3, i4);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, VEBaseFilterParam vEBaseFilterParam) {
        l.d(vEBaseFilterParam, "");
        return E().a(i2, vEBaseFilterParam);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int[] iArr) {
        l.d(iArr, "");
        return E().b(iArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(Bitmap bitmap) {
        l.d(bitmap, "");
        E().a(bitmap);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(boolean z) {
        E().e(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void b(boolean z) {
        E().f(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(VEListener.p pVar) {
        l.d(pVar, "");
        E().a(pVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(String[] strArr) {
        return E().a(strArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return -100;
        }
        return E().a(strArr, strArr2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(x.e eVar) {
        l.d(eVar, "");
        return E().a(eVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, x.f fVar) {
        l.d(fVar, "");
        m().removeMessages(100);
        m().sendEmptyMessage(100);
        return E().a(i2, fVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, x.f fVar, VEListener.s sVar) {
        l.d(fVar, "");
        return E().a(i2, fVar, sVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, VEListener.w wVar) {
        l.d(wVar, "");
        return E().a(i2, wVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, int i2, int i3, boolean z) {
        l.d(str, "");
        return E().a(str, i2, i3, z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, int i2, int i3, int i4, int i5, boolean z) {
        l.d(str, "");
        return E().a(str, i2, i3, i4, i5, z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean a(int i2, int i3, float f2) {
        return E().a(i2, i3, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, String[] strArr) {
        l.d(str, "");
        return E().a(str, strArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        return E().a(vEInfoStickerBufferListener);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, float f2, float f3, float f4, float f5) {
        l.d(str, "");
        return E().a(str, f2, f3, f4, f5);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, float f2) {
        l.d(str, "");
        return E().c(str, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, String str2, float f2) {
        return E().a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, String str2, float f2, float f3, float f4) {
        return E().a(str, str2, f2, f3, f4);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str) {
        return E().c(str);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int[] a(int[] iArr, int[] iArr2, String[] strArr) {
        l.d(iArr, "");
        l.d(iArr2, "");
        l.d(strArr, "");
        int[] a2 = E().a(iArr, iArr2, strArr);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int[] iArr) {
        l.d(iArr, "");
        return E().a(iArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int[] a(VECherEffectParam vECherEffectParam) {
        l.d(vECherEffectParam, "");
        int[] a2 = E().a(vECherEffectParam);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, String str, byte[] bArr, int i4, int i5, VEListener.a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        return E().a(i2, i3, str, bArr, i4, i5, aVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int[] iArr, String str, byte[] bArr, VEListener.a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        return E().a(iArr[0], iArr[1], str, bArr, iArr[2], aVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return E().a(str, str2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(VEListener.t tVar) {
        E().Z = tVar;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int[] iArr, int i2, int i3, x.a aVar, VEListener.w wVar) {
        l.d(iArr, "");
        l.d(aVar, "");
        l.d(wVar, "");
        return E().a(iArr, i2, i3, aVar, wVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        l.d(vEVideoEncodeSettings, "");
        return E().a(vEVideoEncodeSettings);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.q qVar) {
        l.d(vEVideoEncodeSettings, "");
        return E().a(str, str2, vEVideoEncodeSettings, qVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean a(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        l.d(vEVideoEncodeSettings, "");
        return E().a(str, (String) null, vEVideoEncodeSettings);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath) {
        l.d(str, "");
        l.d(vEAlgorithmPath, "");
        return E().a(str, i2, i3, vEAlgorithmPath);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, VEListener.i iVar) {
        return E().a(i2, iVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int[] a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        l.d(iArr, "");
        l.d(iArr2, "");
        l.d(strArr, "");
        l.d(iArr3, "");
        l.d(iArr4, "");
        l.d(strArr2, "");
        int[] a2 = E().a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, String str, String str2) {
        return E().a(i2, str, str2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, float[] fArr) {
        l.d(fArr, "");
        return E().a(i2, fArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, ByteBuffer[] byteBufferArr) {
        l.d(byteBufferArr, "");
        return E().a(i2, byteBufferArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, ByteBuffer byteBuffer) {
        return E().a(i2, byteBuffer);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(mv_reesult_in_type, "");
        return E().a(str, str2, str3, mv_reesult_in_type);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(VEListener.aa aaVar) {
        l.d(aaVar, "");
        E().a(aaVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(VEBaseFilterParam vEBaseFilterParam) {
        return E().a(vEBaseFilterParam);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(c cVar) {
        l.d(cVar, "");
        return E().a(cVar.f61998a, cVar.f61999b, cVar.f62000c, cVar.f62001d, cVar.f62002e, cVar.f62003f, cVar.f62004g, cVar.f62005h, cVar.f62006i, cVar.f62007j, cVar.f62008k);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(boolean[] zArr, c cVar) {
        l.d(zArr, "");
        l.d(cVar, "");
        return E().a(zArr, cVar.f61998a, cVar.f61999b, cVar.f62000c, cVar.f62001d, cVar.f62002e, cVar.f62003f, cVar.f62004g, cVar.f62005h, cVar.f62006i, cVar.f62007j, cVar.f62008k);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final String a(int i2, int i3, int i4, String str) {
        l.d(str, "");
        return E().a(i2, i3, i4, str);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(g.b bVar) {
        if (bVar != null && !this.f61982a.contains(bVar)) {
            this.f61982a.add(bVar);
            m().removeMessages(100);
            m().sendEmptyMessageDelayed(100, 100);
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void b(g.b bVar) {
        if (bVar != null) {
            this.f61982a.remove(bVar);
            if (this.f61982a.isEmpty()) {
                m().removeMessages(100);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final float F() {
        return E().ai;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void J() {
        E().e();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void K() {
        E().G();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void r() {
        E().i();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int x() {
        return a().f151436k;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int y() {
        return a().f151435j;
    }

    static final class c extends m implements h.f.a.a<Handler> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper(), new Handler.Callback(this) {
                /* class com.ss.android.ugc.asve.editor.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f61995a;

                static {
                    Covode.recordClassIndex(38118);
                }

                {
                    this.f61995a = r1;
                }

                public final boolean handleMessage(Message message) {
                    l.d(message, "");
                    if (message.what != 100) {
                        return true;
                    }
                    Iterator<T> it = this.f61995a.this$0.f61982a.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.f61995a.this$0.E().t());
                    }
                    if (this.f61995a.this$0.E().k() != x.j.STARTED) {
                        return true;
                    }
                    this.f61995a.this$0.m().sendEmptyMessageDelayed(100, 100);
                    return true;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean A() {
        return E().v();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int B() {
        return E().C();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int C() {
        return E().D();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int D() {
        return E().F();
    }

    public final x E() {
        x a2;
        s sVar = this.f61992l;
        if (sVar == null || (a2 = sVar.a()) == null) {
            return this.f61993m;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int H() {
        return E().A();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int I() {
        return E().B();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void L() {
        this.f61982a.clear();
        m().removeMessages(100);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int d() {
        return E().H();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int j() {
        return E().s();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int k() {
        return E().t();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int n() {
        return E().a(true);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int q() {
        return E().z();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int u() {
        return E().p();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int v() {
        return E().q();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int w() {
        return E().r();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int z() {
        return E().u();
    }

    static final class b implements VEListener.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61994a;

        static {
            Covode.recordClassIndex(38116);
        }

        b(a aVar) {
            this.f61994a = aVar;
        }

        @Override // com.ss.android.vesdk.VEListener.v
        public final void a() {
            Iterator<T> it = this.f61994a.f61983b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int G() {
        return E().p(E().s());
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final x.j f() {
        return E().k();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final String[] h() {
        return E().m();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final String[] i() {
        return E().n();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final List<VEClipAlgorithmParam> l() {
        return E().E();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int o() {
        return E().y();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int p() {
        return E().f();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void s() {
        m().removeMessages(100);
        E().j();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int t() {
        m().removeMessages(100);
        m().sendEmptyMessageDelayed(100, 100);
        return E().o();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final VEMVAudioInfo e() {
        return E().I();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final String[] g() {
        return E().l();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final Bitmap c() {
        return E().d();
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void b(int i2) {
        E().b(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void c(float f2) {
        E().a(f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void d(int i2) {
        E().e(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void e(boolean z) {
        E().j(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void f(boolean z) {
        E().h(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void g(boolean z) {
        E().d(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void m(int i2) {
        E().y(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(float f2) {
        return E().b(f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(float f2) {
        return E().c(f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final float c(String str) {
        l.d(str, "");
        return E().b(str);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int e(int i2) {
        return E().g(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int g(int i2) {
        return E().r(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final float[] h(int i2) {
        float[] s = E().s(i2);
        l.b(s, "");
        return s;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int i(int i2) {
        return E().f(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int l(int i2) {
        return E().x(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final float o(int i2) {
        return E().u(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final float p(int i2) {
        return E().v(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int r(int i2) {
        return E().o(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int s(int i2) {
        return E().n(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int t(int i2) {
        return E().m(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(new x(str), new s(str, null));
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final String d(String str) {
        l.d(str, "");
        String a2 = E().a(str);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int j(int i2) {
        return E().j(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int k(int i2) {
        return E().k(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int n(int i2) {
        return E().t(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean q(int i2) {
        return E().w(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final boolean f(int i2) {
        return E().q(i2);
    }

    public a(x xVar) {
        l.d(xVar, "");
        this.f61986f = new r();
        this.f61982a = new ArrayList();
        this.f61987g = i.a((h.f.a.a) new c(this));
        this.f61983b = new CopyOnWriteArrayList<>();
        this.f61988h = new b(this);
        this.f61984c = new CopyOnWriteArrayList<>();
        this.f61989i = new d(this);
        this.f61985d = new CopyOnWriteArrayList<>();
        this.f61990j = new e(this);
        this.f61993m = xVar;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int c(boolean z) {
        return E().g(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void d(r rVar) {
        l.d(rVar, "");
        this.f61985d.remove(rVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int c(int[] iArr) {
        l.d(iArr, "");
        return E().c(iArr);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void d(boolean z) {
        E().i(z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void c(int i2) {
        E().d(i2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(String str) {
        return E().d(str);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void c(r rVar) {
        l.d(rVar, "");
        if (this.f61985d.isEmpty()) {
            E().b(this.f61990j);
            s sVar = this.f61992l;
            if (sVar != null) {
                r rVar2 = this.f61990j;
                l.d(rVar2, "");
                sVar.f62072h = rVar2;
                x xVar = sVar.f62066b;
                if (xVar == null) {
                    l.a("veEditor");
                } else {
                    xVar.b(rVar2);
                }
            }
        }
        if (!a(this.f61985d, rVar)) {
            this.f61985d.add(rVar);
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int f(int i2, int i3) {
        return E().i(i2, i3);
    }

    private static boolean a(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, float f2) {
        return E().b(i2, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int c(int i2, float f2) {
        return E().c(i2, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int e(int i2, int i3) {
        return E().f(i2, i3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int g(int i2, int i3) {
        return E().h(i2, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, SurfaceView surfaceView) {
        this(new x(str, surfaceView), new s(str, surfaceView));
        l.d(str, "");
        l.d(surfaceView, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, float f2) {
        return E().a(i2, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int c(String str, float f2) {
        return E().b(str, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void d(int i2, int i3) {
        E().d(i2, i3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, int i3) {
        return E().e(i2, i3);
    }

    private a(x xVar, s sVar) {
        l.d(xVar, "");
        l.d(sVar, "");
        this.f61986f = new r();
        this.f61982a = new ArrayList();
        this.f61987g = i.a((h.f.a.a) new c(this));
        this.f61983b = new CopyOnWriteArrayList<>();
        this.f61988h = new b(this);
        this.f61984c = new CopyOnWriteArrayList<>();
        this.f61989i = new d(this);
        this.f61985d = new CopyOnWriteArrayList<>();
        this.f61990j = new e(this);
        this.f61993m = xVar;
        this.f61992l = sVar;
        if (sVar != null) {
            l.d(xVar, "");
            sVar.f62066b = xVar;
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, ROTATE_DEGREE rotate_degree) {
        l.d(rotate_degree, "");
        return E().b(i2, rotate_degree);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, TextureView textureView) {
        this(new x(str, textureView), new s(str, null));
        l.d(str, "");
        l.d(textureView, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void c(int i2, int i3) {
        E().c(i2, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, bj bjVar) {
        this(new x(str, bjVar), new s(str, null));
        l.d(str, "");
        l.d(bjVar, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(String str, float f2) {
        return E().a(str, f2);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, float f2, float f3) {
        return E().b(i2, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, float f2, float f3) {
        return E().a(i2, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, int i4) {
        return E().a(i2, i3, i4);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, int i3, int i4) {
        return E().b(i2, i3, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, SurfaceView surfaceView, long j2) {
        this(new x(str, surfaceView, j2), new s(str, surfaceView));
        l.d(str, "");
        l.d(surfaceView, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int b(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        l.d(vEBaseFilterParam, "");
        return E().b(i2, i3, vEBaseFilterParam);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, SurfaceView surfaceView, bj bjVar) {
        this(new x(str, surfaceView, bjVar), new s(str, surfaceView));
        l.d(str, "");
        l.d(surfaceView, "");
        l.d(bjVar, "");
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        l.d(vEBaseFilterParam, "");
        return E().a(i2, i3, vEBaseFilterParam);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, x.g gVar) {
        l.d(gVar, "");
        return E().a(i2, i3, gVar);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final void a(int i2, int i3, int i4, int i5) {
        E().a(i2, i3, i4, i5);
    }

    static final class d implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61996a;

        static {
            Covode.recordClassIndex(38119);
        }

        d(a aVar) {
            this.f61996a = aVar;
        }

        @Override // com.ss.android.vesdk.r
        public final /* synthetic */ void onCallback(int i2, int i3, float f2, String str) {
            Iterator<T> it = this.f61996a.f61984c.iterator();
            while (it.hasNext()) {
                it.next().onCallback(i2, i3, f2, str);
            }
        }
    }

    static final class e implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f61997a;

        static {
            Covode.recordClassIndex(38120);
        }

        e(a aVar) {
            this.f61997a = aVar;
        }

        @Override // com.ss.android.vesdk.r
        public final /* synthetic */ void onCallback(int i2, int i3, float f2, String str) {
            Iterator<T> it = this.f61997a.f61985d.iterator();
            while (it.hasNext()) {
                it.next().onCallback(i2, i3, f2, str);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, int i4, boolean z) {
        return E().a(i2, i3, i4, z);
    }

    @Override // com.ss.android.ugc.asve.editor.g
    public final int a(int i2, int i3, int i4, int i5, int i6, boolean z) {
        return E().a(i2, i3, i4, i5, i6, z);
    }
}
