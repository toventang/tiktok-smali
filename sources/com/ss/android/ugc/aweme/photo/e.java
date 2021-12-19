package com.ss.android.ugc.aweme.photo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.j;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.cx;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.property.p;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import dmt.av.video.SingleImageCoverBitmapData;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f114853a;

    /* renamed from: b  reason: collision with root package name */
    private a f114854b = new a(0, 0);

    /* renamed from: c  reason: collision with root package name */
    private final u f114855c;

    static {
        Covode.recordClassIndex(73883);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ Intent $intent;

        static {
            Covode.recordClassIndex(73885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.e eVar, Intent intent) {
            super(0);
            this.$activity = eVar;
            this.$intent = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.shortvideo.r.a.a().e(this.$activity, this.$intent);
            return z.f158842a;
        }
    }

    public final void a() {
        a aVar;
        a aVar2;
        int i2;
        int i3;
        AVETParameter j2;
        String str;
        ShortVideoContext shortVideoContext = this.f114855c.f114906h;
        boolean z = this.f114853a.f114858a.f114907i;
        if (!(shortVideoContext == null || (j2 = shortVideoContext.j()) == null)) {
            j2.setShootMode(shortVideoContext.Z);
            if (z) {
                str = "shoot";
            } else {
                str = "upload";
            }
            j2.setContentSource(str);
            j2.setContentType("photo_canvas");
        }
        if (!j.f69703a) {
            aVar = new a(com.ss.android.ugc.aweme.canvas.e.b().getFirst().intValue(), com.ss.android.ugc.aweme.canvas.e.b().getSecond().intValue());
        } else {
            aVar = new a(com.ss.android.ugc.aweme.canvas.e.b().getFirst().intValue(), com.ss.android.ugc.aweme.canvas.e.b().getSecond().intValue());
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            h.a(this.f114853a.f114859b, options);
            if (!(options.outWidth == 0 || options.outHeight == 0)) {
                a aVar3 = new a(options.outWidth, options.outHeight);
                if (aVar3.f114857b * aVar.f114856a > aVar.f114857b * aVar3.f114856a) {
                    if (aVar3.f114857b <= aVar.f114857b) {
                        aVar2 = new a((aVar3.f114857b * aVar.f114856a) / aVar.f114857b, aVar3.f114857b);
                    }
                } else if (aVar3.f114856a <= aVar.f114856a) {
                    aVar2 = new a(aVar3.f114856a, (aVar3.f114856a * aVar.f114857b) / aVar.f114856a);
                }
                aVar = aVar2;
            }
        }
        this.f114854b = aVar;
        u uVar = this.f114853a.f114858a;
        MusicModel a2 = g.a().s().a(cr.a().f125295a);
        if (a2 != null && i.a(uVar.f114906h.f124757b.e())) {
            String e2 = uVar.f114906h.f124757b.e();
            if (e2 == null) {
                e2 = "";
            }
            l.b(e2, "");
            if (uVar.f114906h.f124757b.f124713h == null) {
                uVar.f114906h.a(c.a());
            }
            uVar.f114906h.f124757b.f124713h.a(e2);
            uVar.f114906h.a(e2);
            uVar.f114906h.P = false;
            int duration = a2.getDuration();
            if (duration > 0) {
                uVar.f114906h.f124764i = duration;
            }
            uVar.f114900b = a2;
            uVar.f114901c = e2;
            uVar.f114902d = true;
            uVar.f114903e = false;
        }
        f fVar = this.f114853a;
        String str2 = fVar.f114859b;
        if (cx.a() && dh.a() != 0 && !g.a().A().a() && !AVCommerceServiceImpl.h().a() && com.ss.android.ugc.aweme.port.in.c.u.b()) {
            new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.a(new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(null, new WeakReference(this.f114853a.f114858a.f114905g), null, null, n.a(str2), "", 448)).a(null);
        }
        fVar.f114858a.f114904f = n.a(fVar.f114859b);
        Intent a3 = t.a(fVar.f114858a);
        SingleImageCoverBitmapData singleImageCoverBitmapData = fVar.f114862e;
        if (singleImageCoverBitmapData != null) {
            Objects.requireNonNull(singleImageCoverBitmapData, "null cannot be cast to non-null type android.os.Parcelable");
            a3.putExtra("key_choose_media_item_cover_bitmap_data", (Parcelable) singleImageCoverBitmapData);
        }
        if (fVar.f114864g) {
            a3.putExtra("origin", 0);
        }
        p a4 = com.ss.android.ugc.aweme.canvas.e.a();
        if (fVar.f114858a.f114906h.f124762g != null) {
            i2 = Math.max(Math.min(fVar.f114858a.f114906h.f124764i, a4.f118591c), a4.f118590b);
        } else if (fVar.f114858a.f114900b != null) {
            MusicModel musicModel = fVar.f114858a.f114900b;
            if (musicModel != null) {
                i3 = musicModel.getDuration();
            } else {
                i3 = 10000;
            }
            i2 = Math.max(Math.min(i3, a4.f118591c), a4.f118590b);
        } else {
            i2 = a4.f118589a;
        }
        a3.putExtra("extra_edit_preview_info", (Parcelable) new com.ss.android.ugc.aweme.shortvideo.edit.model.h(this.f114854b.f114856a, this.f114854b.f114857b, null, 28).a(new EditVideoSegment(com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("contact_video") + File.separator + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".mp4"), null, new VideoFileInfo(this.f114854b.f114856a, this.f114854b.f114857b, (long) i2, 30, 0, 0, 0, 0, 240, null))));
        MediaModel mediaModel = fVar.f114861d;
        if (mediaModel != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.add(new ImportVideoInfo(mediaModel.f109400l, mediaModel.f109401m, 0, 0, "0", mediaModel.f109396h, mediaModel.f109396h, null, null, 0, 0.0f, mediaModel.f109390b, 1932, null));
            a3.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
        }
        a3.putExtra("photo_canvas_data", fVar.f114863f);
        androidx.fragment.app.e eVar = fVar.f114858a.f114905g;
        b bVar = new b(eVar, a3);
        if (eVar instanceof androidx.lifecycle.m) {
            androidx.fragment.app.e eVar2 = eVar;
            androidx.lifecycle.i lifecycle = eVar2.getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a().isAtLeast(i.b.RESUMED)) {
                bVar.invoke();
            } else {
                eVar2.getLifecycle().a(new PhotoCanvasEnterEditNextImpl$startActivitySafely$1(eVar, bVar));
            }
        } else {
            bVar.invoke();
        }
        h.f.a.b<Boolean, z> bVar2 = fVar.f114865h;
        if (bVar2 != null) {
            bVar2.invoke(true);
        }
    }

    public e(f fVar) {
        l.d(fVar, "");
        this.f114853a = fVar;
        this.f114855c = fVar.f114858a;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f114856a;

        /* renamed from: b  reason: collision with root package name */
        public final int f114857b;

        static {
            Covode.recordClassIndex(73884);
        }

        public a(int i2, int i3) {
            this.f114856a = i2;
            this.f114857b = i3;
        }
    }
}
