package com.ss.android.ugc.aweme.ftc.components.sticker.text.a;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import h.f.b.l;

public final class a extends com.bytedance.f.a.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final FTCEditTextStickerViewModel f98131a;

    static {
        Covode.recordClassIndex(62384);
    }

    public a(FTCEditTextStickerViewModel fTCEditTextStickerViewModel) {
        l.d(fTCEditTextStickerViewModel, "");
        this.f98131a = fTCEditTextStickerViewModel;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(float f2) {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.a(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean c(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(motionEvent, "");
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean f(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(motionEvent, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.b(motionEvent)) {
                fTCEditTextStickerViewModel.c(FTCEditTextStickerViewModel.i.f98126a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(motionEvent, "");
        fTCEditTextStickerViewModel.f98112c = false;
        if (fTCEditTextStickerViewModel.f98111b) {
            for (q qVar : fTCEditTextStickerViewModel.f98110a) {
                qVar.m();
            }
            for (q qVar2 : fTCEditTextStickerViewModel.f98110a) {
                if (qVar2.a(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(scaleGestureDetector, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.b(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(scaleGestureDetector, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.a(scaleGestureDetector)) {
                fTCEditTextStickerViewModel.c(new FTCEditTextStickerViewModel.h(qVar));
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(b bVar) {
        l.d(bVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(bVar, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.a(bVar)) {
                fTCEditTextStickerViewModel.c(FTCEditTextStickerViewModel.g.f98125a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(c cVar) {
        l.d(cVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(cVar, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.a(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(b bVar, float f2, float f3) {
        l.d(bVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(bVar, "");
        if (!fTCEditTextStickerViewModel.f98111b) {
            return false;
        }
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.d(f2, f3)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f98131a;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        for (q qVar : fTCEditTextStickerViewModel.f98110a) {
            if (qVar.i()) {
                return true;
            }
        }
        if (!fTCEditTextStickerViewModel.f98112c) {
            return false;
        }
        fTCEditTextStickerViewModel.f98112c = false;
        return true;
    }
}
