package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.o;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.ss.android.ugc.aweme.utils.gr;

public final class bk {

    /* renamed from: a  reason: collision with root package name */
    LighteningRecordLayout.c f125036a;

    /* renamed from: b  reason: collision with root package name */
    public a f125037b;

    public interface a {
        static {
            Covode.recordClassIndex(82146);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(82144);
    }

    public bk(final e eVar, final d dVar, final m mVar, final LighteningRecordLayout lighteningRecordLayout, final ShortVideoContext shortVideoContext, final View.OnClickListener onClickListener) {
        AnonymousClass1 r0 = new LighteningRecordLayout.c() {
            /* class com.ss.android.ugc.aweme.shortvideo.bk.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82145);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final boolean a() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void c() {
                onClickListener.onClick(lighteningRecordLayout);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final boolean e() {
                return com.ss.android.ugc.aweme.shortvideo.ui.a.a.a(dVar);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void d() {
                lighteningRecordLayout.setCurrentScaleMode(0);
                dVar.ab();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void b() {
                if (gr.f143023a) {
                    gr.f143023a = false;
                    gr.a("record_start");
                }
                mVar.a(0);
                if (bk.this.f125037b != null) {
                    bk.this.f125037b.b();
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(float f2) {
                lighteningRecordLayout.setHasBeenMoveScaled(true);
                dVar.b(f2, lighteningRecordLayout.getY());
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(int i2) {
                if (!((ShortVideoContextViewModel) ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class)).a()) {
                    mVar.a(new o(i2));
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.c
            public final void a(boolean z) {
                x xVar = new x("record end");
                if (shortVideoContext.Z != 15 || z) {
                    mVar.b(xVar);
                    return;
                }
                mVar.a().a();
                xVar.f28214a = 5;
                mVar.b(xVar);
                lighteningRecordLayout.setVisibility(8);
                if (bk.this.f125037b != null) {
                    bk.this.f125037b.a();
                }
            }
        };
        this.f125036a = r0;
        lighteningRecordLayout.setRecordListener(r0);
    }
}
