package com.ss.android.ugc.aweme.choosemusic.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.Toast;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Objects;

public final class AVMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f70706b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final m f70707a;
    private final h v = i.a((h.f.a.a) d.f70710a);
    private Handler w;
    private Toast x;

    static {
        Covode.recordClassIndex(43588);
    }

    public final HandlerThread a() {
        return (HandlerThread) this.v.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43589);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<HandlerThread> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f70710a = new d();

        static {
            Covode.recordClassIndex(43592);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("av_player_thread");
            handlerThread.start();
            return handlerThread;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void b() {
        this.f111796f.a(new b(this));
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void c() {
        if (this.q != null) {
            this.q.cancel();
        }
        com.ss.android.ugc.musicprovider.d dVar = this.f111796f;
        if (dVar != null) {
            dVar.b();
        }
        Handler handler = this.w;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            handler.sendMessage(obtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void d() {
        super.d();
        a().quit();
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f111796f.a((com.ss.android.ugc.musicprovider.interfaces.a) null);
        this.f111796f.a((com.ss.android.ugc.musicprovider.interfaces.b) null);
        this.f111796f.a((com.ss.android.ugc.musicprovider.interfaces.c) null);
        this.f111796f.a();
    }

    static final class b implements com.ss.android.ugc.musicprovider.interfaces.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AVMusicDownloadPlayHelper f70708a;

        static {
            Covode.recordClassIndex(43590);
        }

        b(AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper) {
            this.f70708a = aVMusicDownloadPlayHelper;
        }

        @Override // com.ss.android.ugc.musicprovider.interfaces.c
        public final void a(int i2) {
            this.f70708a.f70707a.a(this.f70708a.o, 0);
        }
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVMusicDownloadPlayHelper(m mVar) {
        super(mVar);
        l.d(mVar, "");
        this.f70707a = mVar;
        Activity i2 = mVar.i();
        l.b(i2, "");
        f fVar = new f(i2, true, true, true, "av_record_player_music");
        fVar.f111468a = 1;
        this.f111797g = fVar;
        b();
    }

    static final class c implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AVMusicDownloadPlayHelper f70709a;

        static {
            Covode.recordClassIndex(43591);
        }

        c(AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper) {
            this.f70709a = aVMusicDownloadPlayHelper;
        }

        public final boolean handleMessage(Message message) {
            l.d(message, "");
            int i2 = message.what;
            if (i2 == 1) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.utils.PlayMusicInfo");
                f fVar = (f) obj;
                AVMusicDownloadPlayHelper.super.a((AVMusicDownloadPlayHelper) fVar.f70745a, (MusicModel) fVar.f70746b, (int) fVar.f70747c);
            } else if (i2 == 2) {
                com.ss.android.ugc.musicprovider.d dVar = this.f70709a.f111796f;
                if (dVar != null) {
                    dVar.b();
                }
            } else if (i2 == 3) {
                this.f70709a.a().quit();
                com.ss.android.ugc.musicprovider.d dVar2 = this.f70709a.f111796f;
                if (dVar2 != null) {
                    dVar2.a();
                }
            }
            return true;
        }
    }

    private final void a(Context context, String str) {
        Toast toast = this.x;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setGravity(17, 0, 0);
        this.x = makeText;
        a(makeText);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean a(MusicModel musicModel, Context context) {
        l.d(context, "");
        if (musicModel != null && !musicModel.isPlayUrlValid()) {
            String string = context.getString(R.string.dcc);
            l.b(string, "");
            a(context, string);
            return false;
        } else if (musicModel == null || musicModel.getMusicStatus() != 0) {
            return true;
        } else {
            String offlineDesc = musicModel.getOfflineDesc();
            l.b(offlineDesc, "");
            if (offlineDesc.length() == 0) {
                offlineDesc = context.getString(R.string.dcb);
            }
            l.b(offlineDesc, "");
            a(context, offlineDesc);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void a(MusicModel musicModel, int i2, boolean z) {
        if (this.w == null) {
            this.w = new Handler(a().getLooper(), new c(this));
        }
        Handler handler = this.w;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = new f(musicModel, i2, z);
            handler.sendMessage(obtain);
        }
    }
}
