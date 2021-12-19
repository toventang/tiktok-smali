package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.i;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.record.b;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq;
import com.ss.android.ugc.tools.view.a.c;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.u;
import h.z;
import java.util.List;

public final class AlbumServiceImpl implements b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(79409);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79410);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.record.b
    public final void subscribeAlbumClose(e eVar, a<z> aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        JediViewModel a2 = t.a(eVar).a(ChooseMediaViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((ChooseMediaViewModel) a2).a(eVar, AlbumServiceImpl$subscribeAlbumClose$1.INSTANCE, new ah(), new AlbumServiceImpl$subscribeAlbumClose$2(aVar));
    }

    @Override // com.ss.android.ugc.aweme.record.b
    public final void subscribeAlbumOpen(e eVar, a<z> aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        JediViewModel a2 = t.a(eVar).a(ChooseMediaViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((ChooseMediaViewModel) a2).a(eVar, AlbumServiceImpl$subscribeAlbumOpen$1.INSTANCE, new ah(), new AlbumServiceImpl$subscribeAlbumOpen$2(aVar));
    }

    private final Bundle generateAlbumBundle(ShortVideoContext shortVideoContext, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("key_support_flag", 5);
        bundle2.putLong("Key_min_duration", 1000);
        bundle2.putInt("key_photo_select_min_count", 1);
        bundle2.putInt("key_photo_select_max_count", 10);
        bundle2.putInt("key_video_select_min_count", 1);
        bundle2.putInt("key_video_select_max_count", 10);
        bundle2.putInt("key_choose_scene", 11);
        bundle2.putParcelable("key_short_video_context", shortVideoContext);
        bundle2.putInt("key_choose_request_code", 1);
        bundle2.putBoolean("from_upload_btn_click", true);
        bundle2.putAll(bundle);
        return bundle2;
    }

    @Override // com.ss.android.ugc.aweme.record.b
    public final u<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j2, long j3) {
        l.d(context, "");
        l.d(list, "");
        return bq.a(context, list, j2, j3);
    }

    @Override // com.ss.android.ugc.aweme.record.b
    public final n openAlbum(ShortVideoContext shortVideoContext, e eVar, int i2, c cVar, Bundle bundle) {
        l.d(shortVideoContext, "");
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(bundle, "");
        ao aoVar = new ao();
        aoVar.r = generateAlbumBundle(shortVideoContext, bundle);
        aoVar.ac = cVar;
        aoVar.ab = true;
        i.a a2 = i.a(eVar, ao.class);
        a2.f42897e = false;
        i.a a3 = a2.a("attachMvChoosePhotoScene");
        a3.f42898f = new AlbumServiceImpl$openAlbum$delegate$1(aoVar);
        a3.f42894b = false;
        a3.f42895c = false;
        a3.f42896d = i2;
        n a4 = a3.a();
        l.b(a4, "");
        return a4;
    }
}
