package com.ss.android.ugc.aweme.shortvideo.edit.videolength;

import android.app.Activity;
import android.view.Window;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VideoLengthChecker implements IVideoLengthChecker {
    static {
        Covode.recordClassIndex(83916);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f128044a;

        static {
            Covode.recordClassIndex(83917);
        }

        a(Activity activity) {
            this.f128044a = activity;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f128044a).a(R.string.dck).a();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f128045a;

        static {
            Covode.recordClassIndex(83918);
        }

        b(Activity activity) {
            this.f128045a = activity;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f128045a).a(R.string.dck).a();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f128046a;

        static {
            Covode.recordClassIndex(83919);
        }

        c(Activity activity) {
            this.f128046a = activity;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f128046a).a(R.string.d13).a();
        }
    }

    public static IVideoLengthChecker a() {
        MethodCollector.i(3978);
        Object a2 = com.ss.android.ugc.b.a(IVideoLengthChecker.class, false);
        if (a2 != null) {
            IVideoLengthChecker iVideoLengthChecker = (IVideoLengthChecker) a2;
            MethodCollector.o(3978);
            return iVideoLengthChecker;
        }
        if (com.ss.android.ugc.b.ec == null) {
            synchronized (IVideoLengthChecker.class) {
                try {
                    if (com.ss.android.ugc.b.ec == null) {
                        com.ss.android.ugc.b.ec = new VideoLengthChecker();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3978);
                    throw th;
                }
            }
        }
        VideoLengthChecker videoLengthChecker = (VideoLengthChecker) com.ss.android.ugc.b.ec;
        MethodCollector.o(3978);
        return videoLengthChecker;
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f128047a;

        static {
            Covode.recordClassIndex(83920);
        }

        d(VideoPublishEditModel videoPublishEditModel) {
            this.f128047a = videoPublishEditModel;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            EditVideoInfoServiceImpl.a().setVideoLength(this.f128047a.creationId, (long) ((g) obj).j());
            EditVideoInfoServiceImpl.a().setVideoInfoData(this.f128047a.creationId, new VideoInfoData(this.f128047a.voiceVolume, this.f128047a.musicVolume));
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.preview.a f128048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FTCEditToolbarViewModel f128049b;

        static {
            Covode.recordClassIndex(83921);
        }

        e(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, FTCEditToolbarViewModel fTCEditToolbarViewModel) {
            this.f128048a = aVar;
            this.f128049b = fTCEditToolbarViewModel;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.preview.a aVar = this.f128048a;
            if (aVar != null) {
                g value = aVar.C().getValue();
                if (value == null) {
                    l.b();
                }
                if (value.j() >= 61000) {
                    this.f128049b.d(1, false);
                    w.a("music", -1);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void a(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        l.d(activity, "");
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        IInternalCommerceService h2 = AVCommerceServiceImpl.h();
        l.b(h2, "");
        boolean b2 = h2.b();
        if (a.a(videoPublishEditModel) && b2 && cVar != null && !cVar.isCommerceMusic()) {
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
            a.a(videoPublishEditModel, "");
            Window window = activity.getWindow();
            l.b(window, "");
            window.getDecorView().post(new a(activity));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void a(Activity activity, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.gamora.editor.rootscene.d dVar) {
        l.d(videoPublishEditModel, "");
        l.d(dVar, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        IInternalCommerceService h2 = AVCommerceServiceImpl.h();
        l.b(h2, "");
        boolean b2 = h2.b();
        if (a.a(videoPublishEditModel) && b2 && cVar != null && (!cVar.isCommerceMusic() || a.a(cVar))) {
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
            a.a(videoPublishEditModel, "");
            dVar.aq().a();
            Window window = activity.getWindow();
            l.b(window, "");
            window.getDecorView().post(new b(activity));
        } else if (a.a(videoPublishEditModel) && cVar != null && a.a(cVar)) {
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
            a.a(videoPublishEditModel, "");
            dVar.aq().a();
            Window window2 = activity.getWindow();
            l.b(window2, "");
            window2.getDecorView().post(new c(activity));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void a(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, m mVar, FTCEditToolbarViewModel fTCEditToolbarViewModel) {
        l.d(mVar, "");
        l.d(fTCEditToolbarViewModel, "");
        if (aVar != null) {
            aVar.C().observe(mVar, new e(aVar, fTCEditToolbarViewModel));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void a(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, m mVar, EditToolbarViewModel editToolbarViewModel) {
        l.d(videoPublishEditModel, "");
        l.d(mVar, "");
        l.d(editToolbarViewModel, "");
        if (aVar != null) {
            aVar.C().observe(mVar, new d(videoPublishEditModel));
        }
    }
}
