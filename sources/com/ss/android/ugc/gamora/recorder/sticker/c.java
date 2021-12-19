package com.ss.android.ugc.gamora.recorder.sticker;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.e;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.g;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.h;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.i;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(97741);
    }

    public static final class a implements i {
        static {
            Covode.recordClassIndex(97742);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.i
        public final void a() {
            com.ss.android.ugc.aweme.mediachoose.helper.c cVar = com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a;
            if (cVar != null) {
                cVar.b();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$a$a  reason: collision with other inner class name */
        public static final class C4001a implements e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f148316a;

            static {
                Covode.recordClassIndex(97743);
            }

            C4001a(m mVar) {
                this.f148316a = mVar;
            }

            @Override // com.ss.android.ugc.aweme.mediachoose.e
            public final void a(boolean z, int i2, List<MediaModel> list, com.ss.android.ugc.aweme.mediachoose.d dVar) {
                l.d(dVar, "");
                this.f148316a.invoke(Boolean.valueOf(z), list);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.i
        public final void a(m<? super Boolean, ? super List<? extends MediaModel>, z> mVar) {
            l.d(mVar, "");
            com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.a(4, 100, 0, new C4001a(mVar));
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f148360a;

        static {
            Covode.recordClassIndex(97744);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.g
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 4);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_support_flag", 4);
            bundle.putParcelable("key_short_video_context", this.f148360a);
            return bundle;
        }

        public b(ShortVideoContext shortVideoContext) {
            this.f148360a = shortVideoContext;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.g
        public final com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a a(Intent intent) {
            l.d(intent, "");
            String a2 = a(intent, "videoPath");
            if (a2 == null) {
                a2 = "";
            }
            l.b(a2, "");
            String a3 = a(intent, "audioPath");
            if (a3 == null) {
                a3 = "";
            }
            l.b(a3, "");
            String a4 = a(intent, "videoOriginPath");
            if (a4 == null) {
                a4 = "";
            }
            l.b(a4, "");
            return new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a(a2, a3, a4);
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$c  reason: collision with other inner class name */
    public static final class C4008c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f148404a;

        static {
            Covode.recordClassIndex(97745);
        }

        public C4008c(ShortVideoContext shortVideoContext) {
            this.f148404a = shortVideoContext;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.h
        public final com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a a(Intent intent) {
            l.d(intent, "");
            String a2 = a(intent, "videoPath");
            if (a2 == null) {
                a2 = "";
            }
            l.b(a2, "");
            String a3 = a(intent, "audioPath");
            if (a3 == null) {
                a3 = "";
            }
            l.b(a3, "");
            String a4 = a(intent, "videoOriginPath");
            if (a4 == null) {
                a4 = "";
            }
            l.b(a4, "");
            return new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a(a2, a3, a4);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.h
        public final Intent a(String str) {
            BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
            l.d(str, "");
            Intent intent = new Intent();
            intent.putExtra("file_path", str);
            intent.putExtra("from_background_video", true);
            intent.putExtra("background_video_max_length", com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(this.f148404a, com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().getMaxShootingDuration(true ^ this.f148404a.f124757b.t, this.f148404a)));
            Workspace workspace = this.f148404a.f124757b.f124713h;
            if (workspace != null) {
                backgroundVideoCompileConfigure = com.ss.android.ugc.aweme.shortvideo.cut.a.a(workspace);
            } else {
                backgroundVideoCompileConfigure = null;
            }
            intent.putExtra("background_video_compile_configure", backgroundVideoCompileConfigure);
            return intent;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;

        static {
            Covode.recordClassIndex(97746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.e eVar) {
            super(1);
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            aa.a(this.$activity, num.intValue(), 1000);
            return z.f158842a;
        }
    }
}
