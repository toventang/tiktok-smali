package com.ss.android.ugc.aweme.shortvideo.model;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class CanvasVideoEditorTrackViewModel extends ac {
    public static final Companion Companion = new Companion(null);
    public int filterIndex = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(84417);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(84418);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static ad com_ss_android_ugc_aweme_shortvideo_model_CanvasVideoEditorTrackViewModel$Companion_androidx_lifecycle_VScopeLancet_of(e eVar) {
            return ae.a(eVar, (ad.b) null);
        }

        public final CanvasVideoEditorTrackViewModel get(Context context) {
            if (context instanceof e) {
                return (CanvasVideoEditorTrackViewModel) com_ss_android_ugc_aweme_shortvideo_model_CanvasVideoEditorTrackViewModel$Companion_androidx_lifecycle_VScopeLancet_of((e) context).a(CanvasVideoEditorTrackViewModel.class);
            }
            return null;
        }
    }

    public final boolean isFilterIndexValid() {
        if (this.filterIndex != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }
}
