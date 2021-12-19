package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Init of enum GROUP_1 can be incorrect */
/* JADX WARN: Init of enum GROUP_2 can be incorrect */
public enum d {
    GROUP_1(R.string.bo7, r6, 0, R.string.bo2, 0, false, 20),
    GROUP_2(R.string.bo7, r6, 0, R.string.bo3, 0, true, 20),
    GROUP_3(R.string.bo8, null, 0, R.string.bo4, 0, false, 22),
    GROUP_4(R.string.bo8, null, 0, R.string.bo5, 0, true, 22);
    
    private final boolean btnForceVertical;
    private final int desc;
    private final Integer multiTitle;
    private final int primary;

    /* renamed from: secondary  reason: collision with root package name */
    private final int f133655secondary;
    private final int title;

    public final boolean getBtnForceVertical() {
        return this.btnForceVertical;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final Integer getMultiTitle() {
        return this.multiTitle;
    }

    public final int getPrimary() {
        return this.primary;
    }

    public final int getSecondary() {
        return this.f133655secondary;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Covode.recordClassIndex(87430);
        Integer.valueOf((int) R.string.bo6);
    }

    private d(int i2, Integer num, int i3, int i4, int i5, boolean z) {
        this.title = i2;
        this.multiTitle = num;
        this.desc = i3;
        this.primary = i4;
        this.f133655secondary = i5;
        this.btnForceVertical = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ d(int i2, Integer num, int i3, int i4, int i5, boolean z, int i6) {
        this(i2, (i6 & 2) != 0 ? null : num, (i6 & 4) != 0 ? R.string.bo1 : i3, i4, (i6 & 16) != 0 ? R.string.a9o : i5, z);
    }
}
