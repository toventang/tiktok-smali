package com.ss.android.ugc.gamora.editor.a;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.property.dr;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import h.a.n;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e extends j<d> implements a, d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145682a = {new y(e.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(e.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f145683b = this;

    /* renamed from: c  reason: collision with root package name */
    private final d f145684c = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private final d f145685d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);

    /* renamed from: e  reason: collision with root package name */
    private final t<Boolean> f145686e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Integer> f145687f;

    /* renamed from: g  reason: collision with root package name */
    private final VEAudioSamiFilterParam f145688g;

    /* renamed from: h  reason: collision with root package name */
    private final f f145689h;

    static {
        Covode.recordClassIndex(95680);
    }

    private final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.f145684c.a(this, f145682a[0]);
    }

    @Override // com.ss.android.ugc.gamora.editor.a.d
    public final LiveData<Boolean> a() {
        return this.f145686e;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ d getApiComponent() {
        return this.f145683b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145689h;
    }

    private final g e() {
        g value = ((com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145685d.a(this, f145682a[1])).C().getValue();
        if (value == null) {
            l.b();
        }
        return value;
    }

    private final void f() {
        if (!this.f145687f.isEmpty()) {
            e().c(n.e((Collection<Integer>) this.f145687f));
            this.f145687f.clear();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.a.d
    public final void b() {
        Boolean value = this.f145686e.getValue();
        if (value == null) {
            l.b();
        }
        l.b(value, "");
        boolean booleanValue = value.booleanValue();
        d().isAudioEnhance = !booleanValue;
        this.f145686e.setValue(Boolean.valueOf(!booleanValue));
    }

    @Override // com.ss.android.ugc.gamora.editor.a.d
    public final void c() {
        c cVar;
        if (c.c()) {
            if (this.f145688g.samiModelPath == null) {
                this.f145688g.samiModelPath = c.a();
            }
            VideoPublishEditModel d2 = d();
            l.d(d2, "");
            if ((d2.realHasOriginalSound() || d2.isFastImport || ((cVar = cr.a().f125295a) != null && !cVar.isPgc())) && d().isAudioEnhance) {
                f();
                if (d().isFastImport) {
                    int a2 = e().a(0, 0, this.f145688g);
                    e().a(a2, this.f145688g);
                    this.f145687f.add(Integer.valueOf(a2));
                } else if (d().realHasOriginalSound()) {
                    int a3 = e().a(1, e().a().f151435j, this.f145688g);
                    e().a(a3, this.f145688g);
                    this.f145687f.add(Integer.valueOf(a3));
                } else {
                    c cVar2 = cr.a().f125295a;
                    if (cVar2 != null && !cVar2.isPgc()) {
                        int a4 = e().a(1, 0, this.f145688g);
                        e().a(a4, this.f145688g);
                        this.f145687f.add(Integer.valueOf(a4));
                    }
                }
            } else {
                f();
            }
        }
    }

    public e(f fVar) {
        l.d(fVar, "");
        this.f145689h = fVar;
        t<Boolean> tVar = new t<>();
        tVar.setValue(Boolean.valueOf(d().isAudioEnhance));
        this.f145686e = tVar;
        this.f145687f = new ArrayList();
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        vEAudioSamiFilterParam.samiModelPath = null;
        vEAudioSamiFilterParam.samiParam = p.b("\n            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":" + dr.a() + ",\n                    \"denoiserate\":1.0\n                }\n            }\n        ");
        this.f145688g = vEAudioSamiFilterParam;
        c.c();
    }
}
