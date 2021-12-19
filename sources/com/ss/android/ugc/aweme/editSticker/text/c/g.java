package com.ss.android.ugc.aweme.editSticker.text.c;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.a.a;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import h.f.b.l;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final EditTextStickerViewModel f88458a;

    static {
        Covode.recordClassIndex(55683);
    }

    public g(EditTextStickerViewModel editTextStickerViewModel) {
        l.d(editTextStickerViewModel, "");
        this.f88458a = editTextStickerViewModel;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(float f2) {
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.a(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean c(float f2) {
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        if (editTextStickerViewModel.f88320f) {
            for (q qVar : editTextStickerViewModel.f88319e) {
                Float.valueOf(f2);
                if (qVar.f()) {
                    qVar.z = false;
                    qVar.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean f(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(motionEvent, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.b(motionEvent)) {
                editTextStickerViewModel.c(EditTextStickerViewModel.t.f88336a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(motionEvent, "");
        editTextStickerViewModel.f88321g = false;
        if (editTextStickerViewModel.f88320f) {
            for (q qVar : editTextStickerViewModel.f88319e) {
                qVar.m();
            }
            for (q qVar2 : editTextStickerViewModel.f88319e) {
                if (qVar2.a(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean c(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(motionEvent, "");
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(scaleGestureDetector, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.b(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(scaleGestureDetector, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.a(scaleGestureDetector)) {
                editTextStickerViewModel.c(new EditTextStickerViewModel.s(qVar));
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(b bVar) {
        l.d(bVar, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(bVar, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.a(bVar)) {
                editTextStickerViewModel.c(EditTextStickerViewModel.r.f88335a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(c cVar) {
        l.d(cVar, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(cVar, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.a(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
    public final boolean a(b bVar, float f2, float f3) {
        l.d(bVar, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(bVar, "");
        if (!editTextStickerViewModel.f88320f) {
            return false;
        }
        for (q qVar : editTextStickerViewModel.f88319e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        for (q qVar : editTextStickerViewModel.f88319e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f88458a;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        for (q qVar : editTextStickerViewModel.f88319e) {
            if (qVar.i()) {
                return true;
            }
        }
        if (!editTextStickerViewModel.f88321g) {
            return false;
        }
        editTextStickerViewModel.f88321g = false;
        return true;
    }
}
