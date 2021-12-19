package com.ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.filter.a.a;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.asve.e.c;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.port.internal.h;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.l;
import com.ss.android.ugc.aweme.shortvideo.x.k;
import com.ss.android.ugc.aweme.tools.g;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.zhiliaoapp.musically.R;

public abstract class dc extends b implements IRecordingOperationPanel {

    /* renamed from: d  reason: collision with root package name */
    public static final String f126450d = dc.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private ShortVideoContextViewModel f126451b;

    /* renamed from: c  reason: collision with root package name */
    private ev f126452c;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f126453e;

    public abstract f E();

    static {
        Covode.recordClassIndex(82947);
    }

    private com.bytedance.creativex.recorder.gesture.api.b I() {
        return (com.bytedance.creativex.recorder.gesture.api.b) E().a(com.bytedance.creativex.recorder.gesture.api.b.class, (String) null);
    }

    @Override // com.bytedance.scene.group.b
    public final void D() {
        super.D();
        Runnable runnable = this.f126453e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final f H() {
        return ((l) t()).j();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public i fragmentManager() {
        return ((e) this.f42913m).getSupportFragmentManager();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public RemoteImageView backgroundView() {
        if (this.n != null) {
            return (RemoteImageView) this.n.findViewById(R.id.dje);
        }
        return null;
    }

    public final ShortVideoContextViewModel G() {
        if (this.f126451b == null) {
            this.f126451b = (ShortVideoContextViewModel) ae.a((e) this.f42913m, (ad.b) null).a(ShortVideoContextViewModel.class);
        }
        return this.f126451b;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeRecording() {
        if (this.f42913m != null) {
            ((m) H().a(m.class, (String) null)).a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public com.ss.android.ugc.aweme.shortvideo.x.i filterModule() {
        if (this.f126452c == null && this.f42913m != null) {
            this.f126452c = new ev((a) H().a(a.class));
        }
        return this.f126452c;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public int getCameraPos() {
        int i2 = Build.VERSION.SDK_INT;
        return ((d) H().a(d.class, (String) null)).N();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public LiveData<Float> getZoomEvent() {
        return ((d) H().a(d.class, (String) null)).p();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public k videoRecorder() {
        if (this.f42913m instanceof h) {
            return ((h) this.f42913m).p();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void updateLiveBackgroundView() {
        FrameLayout.LayoutParams layoutParams;
        RemoteImageView F = backgroundView();
        if (this.f42913m instanceof com.ss.android.ugc.aweme.shortvideo.ui.m) {
            layoutParams = ((com.ss.android.ugc.aweme.shortvideo.ui.m) this.f42913m).l();
        } else {
            layoutParams = null;
        }
        if (F != null && layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) F.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            F.setLayoutParams(layoutParams2);
        }
    }

    private static boolean b(String str) {
        if ("xssticker".equals(str) || "xsbeauty".equals(str) || "livestreaming".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeCamera(PrivacyCert privacyCert) {
        ((d) H().a(d.class, (String) null)).c(c.a(), privacyCert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onHidePanel(String str) {
        if (b(str)) {
            ((d) E().a(d.class, (String) null)).a(new ac(true, false, true));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onShowPanel(String str) {
        if (b(str)) {
            ((d) E().a(d.class, (String) null)).a(new ac(false, false, true));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void openCamera(PrivacyCert privacyCert) {
        ((d) H().a(d.class, (String) null)).a(privacyCert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f42913m != null) {
            I().a(new d.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f42913m != null) {
            I().a(new d.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void setCameraPos(int i2, PrivacyCert privacyCert) {
        g b2;
        if (this.f42913m != null) {
            if (i2 == 1) {
                b2 = g.a();
            } else {
                b2 = g.b();
            }
            ((com.bytedance.creativex.recorder.b.a.d) H().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null)).a(b2, privacyCert, (String) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        boolean z;
        boolean z2;
        if (this.f42913m != null && "livestreaming".equals(str)) {
            com.bytedance.creativex.recorder.gesture.api.b I = I();
            if (com.ss.android.ugc.tools.utils.k.a(faceSticker.tags) || !faceSticker.tags.contains("transfer_touch")) {
                if (faceSticker.types == null || !faceSticker.types.contains("AR")) {
                    z = false;
                } else {
                    z = true;
                }
                if (faceSticker.requirements == null || !faceSticker.requirements.contains("AR")) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || z2) {
                    I.a(new com.ss.android.ugc.aweme.shortvideo.d.a.b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((VideoRecordNewActivity) this.f42913m).F.G().getLayoutParams())));
                } else if (com.ss.android.ugc.tools.utils.k.a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                    I.a(new d.a());
                } else {
                    I.a(new com.ss.android.ugc.aweme.shortvideo.d.a.b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((VideoRecordNewActivity) this.f42913m).F.G().getLayoutParams())));
                }
            } else {
                I.a(new com.ss.android.ugc.aweme.shortvideo.sticker.d(this.f42913m, videoRecorder()));
            }
        }
    }
}
