package com.ss.android.ugc.aweme.ttep.ttepcomponent.a;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.o;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.utils.gr;
import h.f.b.l;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public RecordLayout.a f141388a;

    static {
        Covode.recordClassIndex(92351);
    }

    public static final class a implements RecordLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f141389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f141390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f141391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f141392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RecordLayout f141393e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f141394f;

        static {
            Covode.recordClassIndex(92352);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final boolean b() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void h() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a() {
            this.f141389a.invoke();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void e() {
            this.f141392d.onClick(this.f141393e);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final boolean g() {
            return com.ss.android.ugc.aweme.shortvideo.ui.a.a.a(this.f141394f);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void d() {
            x xVar = new x("record end");
            m mVar = this.f141390b;
            if (mVar != null) {
                mVar.b(xVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void f() {
            this.f141393e.setCurrentScaleMode(0);
            this.f141394f.ab();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void c() {
            if (gr.f143023a) {
                gr.f143023a = false;
                gr.a("record_start");
            }
            m mVar = this.f141390b;
            if (mVar != null) {
                mVar.a(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a(float f2) {
            this.f141393e.setHasBeenMoveScaled(true);
            this.f141394f.b(f2, this.f141393e.getY());
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
        public final void a(int i2) {
            m mVar;
            e eVar = this.f141391c;
            if (eVar == null) {
                l.b();
            }
            ac a2 = ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class);
            l.b(a2, "");
            if (!((ShortVideoContextViewModel) a2).a() && (mVar = this.f141390b) != null) {
                mVar.a(new o(i2, 0, 6));
            }
        }

        a(h.f.a.a aVar, m mVar, e eVar, View.OnClickListener onClickListener, RecordLayout recordLayout, d dVar) {
            this.f141389a = aVar;
            this.f141390b = mVar;
            this.f141391c = eVar;
            this.f141392d = onClickListener;
            this.f141393e = recordLayout;
            this.f141394f = dVar;
        }
    }

    public c(e eVar, d dVar, m mVar, RecordLayout recordLayout, h.f.a.a<z> aVar, View.OnClickListener onClickListener) {
        l.d(dVar, "");
        l.d(recordLayout, "");
        l.d(aVar, "");
        l.d(onClickListener, "");
        a aVar2 = new a(aVar, mVar, eVar, onClickListener, recordLayout, dVar);
        this.f141388a = aVar2;
        recordLayout.setRecordListener(aVar2);
    }
}
