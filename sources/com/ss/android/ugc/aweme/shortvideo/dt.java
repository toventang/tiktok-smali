package com.ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dt extends ArrayList<TimeSpeedModelExtension> {

    /* renamed from: a  reason: collision with root package name */
    transient i f126484a;

    /* renamed from: b  reason: collision with root package name */
    transient FaceStickerBean f126485b;
    private BeautyMetadata beautyMetadata;

    /* renamed from: c  reason: collision with root package name */
    transient List<AVChallenge> f126486c;
    private String cameraLensInfo;

    /* renamed from: d  reason: collision with root package name */
    transient int f126487d = -1;

    /* renamed from: e  reason: collision with root package name */
    private transient int f126488e = -1;
    private float effectIntensity = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private transient int f126489f = -1;
    private boolean isTextTypeSticker;
    private boolean isUploadTypeSticker;
    public String segmentBeginTime;
    private int uploadTypeStickerSelectMediaSize;

    static {
        Covode.recordClassIndex(82967);
    }

    public dt() {
    }

    public final void removeLast() {
        remove(size() - 1);
    }

    public dt(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
    }

    public final long end(long j2, Bundle bundle) {
        return end(j2, null, null, null, null, null, null, bundle);
    }

    public final void begin(i iVar, Bundle bundle) {
        this.f126484a = iVar;
        this.f126485b = (FaceStickerBean) bundle.getParcelable("currentSticker");
        this.isUploadTypeSticker = bundle.getBoolean("is_uploadtype_sticker");
        this.uploadTypeStickerSelectMediaSize = bundle.getInt("upload_type_sticker_media_size");
        this.isTextTypeSticker = bundle.getBoolean("is_texttype_sticker");
        this.f126486c = bundle.getParcelableArrayList("currentChallenge");
        this.f126487d = bundle.getInt("cameraId", -1);
        this.beautyMetadata = (BeautyMetadata) bundle.getSerializable("beautyMetadata");
        this.cameraLensInfo = bundle.getString("cameraLensInfo");
        this.segmentBeginTime = String.valueOf(SystemClock.elapsedRealtime());
        this.f126488e = bundle.getInt("tabOrder", -1);
        this.f126489f = bundle.getInt("imprPosition", -1);
        this.effectIntensity = bundle.getFloat("effect_intensity", -1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r12 != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long end(long r42, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo r44, java.util.List<java.lang.String> r45, java.util.List<java.lang.String> r46, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo r47, com.ss.android.ugc.aweme.sticker.model.a r48, java.lang.String r49, android.os.Bundle r50) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.dt.end(long, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo, java.util.List, java.util.List, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo, com.ss.android.ugc.aweme.sticker.model.a, java.lang.String, android.os.Bundle):long");
    }
}
