package com.ss.android.ugc.gamora.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;
import h.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public IRecordingOperationPanel f145637a;

    /* renamed from: b  reason: collision with root package name */
    public e f145638b;

    /* renamed from: c  reason: collision with root package name */
    public ShortVideoContext f145639c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.asve.recorder.c.a f145640d;

    /* renamed from: e  reason: collision with root package name */
    public d f145641e;

    /* renamed from: f  reason: collision with root package name */
    public m f145642f;

    /* renamed from: g  reason: collision with root package name */
    public h<? extends j> f145643g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.creativex.recorder.a.a.a f145644h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.creativex.recorder.filter.a.a f145645i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.x.m f145646j;

    /* renamed from: k  reason: collision with root package name */
    public String f145647k;

    static {
        Covode.recordClassIndex(95644);
    }

    public final void a(h<? extends j> hVar) {
        l.d(hVar, "");
        this.f145643g = hVar;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.x.m mVar) {
        l.d(mVar, "");
        this.f145646j = mVar;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f145647k = str;
    }

    public final e a() {
        e eVar = this.f145638b;
        if (eVar == null) {
            l.a("activity");
        }
        return eVar;
    }

    public final ShortVideoContext b() {
        ShortVideoContext shortVideoContext = this.f145639c;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return shortVideoContext;
    }

    public final com.ss.android.ugc.asve.recorder.c.a c() {
        com.ss.android.ugc.asve.recorder.c.a aVar = this.f145640d;
        if (aVar == null) {
            l.a("mediaController");
        }
        return aVar;
    }

    public final d d() {
        d dVar = this.f145641e;
        if (dVar == null) {
            l.a("cameraApiComponent");
        }
        return dVar;
    }

    public final m e() {
        m mVar = this.f145642f;
        if (mVar == null) {
            l.a("recordControlApi");
        }
        return mVar;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.h<? extends com.ss.android.ugc.gamora.recorder.sticker.c.j>, h.h<com.ss.android.ugc.gamora.recorder.sticker.c.j> */
    public final h<j> f() {
        h hVar = this.f145643g;
        if (hVar == null) {
            l.a("stickerModule");
        }
        return hVar;
    }

    public final com.bytedance.creativex.recorder.a.a.a g() {
        com.bytedance.creativex.recorder.a.a.a aVar = this.f145644h;
        if (aVar == null) {
            l.a("beautyApi");
        }
        return aVar;
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        this.f145638b = eVar;
    }

    public final void a(com.bytedance.creativex.recorder.a.a.a aVar) {
        l.d(aVar, "");
        this.f145644h = aVar;
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f145641e = dVar;
    }

    public final void a(m mVar) {
        l.d(mVar, "");
        this.f145642f = mVar;
    }

    public final void a(com.bytedance.creativex.recorder.filter.a.a aVar) {
        l.d(aVar, "");
        this.f145645i = aVar;
    }

    public final void a(com.ss.android.ugc.asve.recorder.c.a aVar) {
        l.d(aVar, "");
        this.f145640d = aVar;
    }

    public final void a(IRecordingOperationPanel iRecordingOperationPanel) {
        l.d(iRecordingOperationPanel, "");
        this.f145637a = iRecordingOperationPanel;
    }

    public final void a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f145639c = shortVideoContext;
    }
}
