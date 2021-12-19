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
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.aweme.utils.gr;

public final class cz {

    /* renamed from: a  reason: collision with root package name */
    RecordLayout.a f126418a;

    /* renamed from: b  reason: collision with root package name */
    public final Cif f126419b = new Cif();

    static {
        Covode.recordClassIndex(82940);
    }

    public cz(final e eVar, final d dVar, final m mVar, final RecordLayout recordLayout, final View.OnClickListener onClickListener) {
        AnonymousClass1 r0 = new RecordLayout.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.cz.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82941);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final boolean b() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void e() {
                onClickListener.onClick(recordLayout);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final boolean g() {
                return a.a(dVar);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void d() {
                mVar.b(new x("record end"));
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void f() {
                recordLayout.setCurrentScaleMode(0);
                dVar.ab();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void c() {
                if (gr.f143023a) {
                    gr.f143023a = false;
                    gr.a("record_start");
                }
                mVar.a(0);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void h() {
                cz.this.f126419b.a("click_record", System.currentTimeMillis() - recordLayout.getActionDownTime());
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void a(float f2) {
                recordLayout.setHasBeenMoveScaled(true);
                dVar.b(f2, recordLayout.getY());
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a
            public final void a(int i2) {
                if (!((ShortVideoContextViewModel) ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class)).a()) {
                    mVar.a(new o(i2));
                }
            }
        };
        this.f126418a = r0;
        recordLayout.setRecordListener(r0);
    }
}
