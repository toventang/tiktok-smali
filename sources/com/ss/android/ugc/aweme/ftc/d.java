package com.ss.android.ugc.aweme.ftc;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.asve.e.c;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.port.internal.h;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ev;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.x.k;
import com.ss.android.ugc.aweme.tools.g;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

public abstract class d extends b implements IRecordingOperationPanel {

    /* renamed from: d  reason: collision with root package name */
    public static final String f98403d = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private ShortVideoContextViewModel f98404b;

    /* renamed from: c  reason: collision with root package name */
    private ev f98405c;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f98406e;

    public abstract f E();

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onHidePanel(String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onShowPanel(String str) {
    }

    static {
        Covode.recordClassIndex(62580);
    }

    private com.bytedance.creativex.recorder.gesture.api.b H() {
        return (com.bytedance.creativex.recorder.gesture.api.b) E().a(com.bytedance.creativex.recorder.gesture.api.b.class, (String) null);
    }

    @Override // com.bytedance.scene.group.b
    public final void D() {
        super.D();
        Runnable runnable = this.f98406e;
        if (runnable != null) {
            runnable.run();
        }
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
        if (this.f98404b == null) {
            this.f98404b = (ShortVideoContextViewModel) ae.a((e) this.f42913m, (ad.b) null).a(ShortVideoContextViewModel.class);
        }
        return this.f98404b;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeRecording() {
        if (this.f42913m != null) {
            ((FTCVideoRecordNewActivity) t()).B.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public com.ss.android.ugc.aweme.shortvideo.x.i filterModule() {
        if (this.f98405c == null && (t() instanceof FTCVideoRecordNewActivity)) {
            this.f98405c = new ev(((FTCVideoRecordNewActivity) t()).l());
        }
        return this.f98405c;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public int getCameraPos() {
        int i2 = Build.VERSION.SDK_INT;
        return ((VideoRecordNewActivity) Objects.requireNonNull(this.f42913m)).F.N();
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
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.f42913m;
        if (fTCVideoRecordNewActivity.f97386l == null) {
            layoutParams = null;
        } else {
            layoutParams = (FrameLayout.LayoutParams) fTCVideoRecordNewActivity.f97386l.getLayoutParams();
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

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void closeCamera(PrivacyCert privacyCert) {
        ((FTCVideoRecordNewActivity) t()).A.c(c.a(), privacyCert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void openCamera(PrivacyCert privacyCert) {
        ((FTCVideoRecordNewActivity) t()).A.a(privacyCert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f42913m != null && (this.f42913m instanceof FTCVideoRecordNewActivity)) {
            H().a(new d.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f42913m != null && (this.f42913m instanceof FTCVideoRecordNewActivity)) {
            H().a(new d.a());
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
            ((FTCVideoRecordNewActivity) t()).A.a(b2, privacyCert, (String) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.f42913m != null && (this.f42913m instanceof FTCVideoRecordNewActivity) && "livestreaming".equals(str)) {
            com.bytedance.creativex.recorder.gesture.api.b H = H();
            if (!com.ss.android.ugc.tools.utils.k.a(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                H.a(new com.ss.android.ugc.aweme.shortvideo.sticker.d(this.f42913m, videoRecorder()));
            } else if (!com.ss.android.ugc.tools.utils.k.a(faceSticker.types) && faceSticker.types.contains("AR")) {
                H.a(new com.ss.android.ugc.aweme.shortvideo.d.a.b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.f42913m).A.G().getLayoutParams())));
            } else if (com.ss.android.ugc.tools.utils.k.a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                H.a(new d.a());
            } else {
                H.a(new com.ss.android.ugc.aweme.shortvideo.d.a.b(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.f42913m).A.G().getLayoutParams())));
            }
        }
    }
}
