package com.ss.android.ugc.aweme.canvas.guide;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class EditPhotoCanvasPromptViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69696b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f69697a = new t<>();

    static {
        Covode.recordClassIndex(42980);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42981);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static EditPhotoCanvasPromptViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(EditPhotoCanvasPromptViewModel.class);
            l.b(a2, "");
            return (EditPhotoCanvasPromptViewModel) a2;
        }
    }

    public final void a() {
        this.f69697a.postValue(true);
    }
}
