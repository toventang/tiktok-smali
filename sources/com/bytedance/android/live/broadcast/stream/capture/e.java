package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.android.live.effect.model.d;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.filter.IFilterManager;

/* access modifiers changed from: package-private */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    IFilterManager f8545a;

    /* renamed from: b  reason: collision with root package name */
    boolean f8546b;

    static {
        Covode.recordClassIndex(4386);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void b() {
        this.f8546b = true;
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(String str, boolean z) {
        if (!this.f8546b) {
            this.f8545a.setEffect(str, z);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(String str, float f2) {
        if (!this.f8546b) {
            IFilterManager iFilterManager = this.f8545a;
            if (str == null) {
                str = "";
            }
            iFilterManager.setFilter(str, f2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(String str, String str2) {
        if (!this.f8546b) {
            this.f8545a.setCustomEffect(str, str2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(boolean z) {
        if (!this.f8546b) {
            this.f8545a.enableMockFace(z);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(float f2, float f3, float f4, float f5, float f6) {
        if (!this.f8546b) {
            this.f8545a.processPanEvent(f2, f3, f4, f5, f6);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(float f2, float f3, int i2) {
        if (!this.f8546b) {
            this.f8545a.processTouchDownEvent(f2, f3, i2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(long j2, float f2, float f3, float f4, float f5, int i2, int i3) {
        if (!this.f8546b) {
            this.f8545a.processTouchEventWithTouchType(j2, f2, f3, f4, f5, i2, i3);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a() {
        if (!this.f8546b) {
            this.f8545a.setEffect(null, false);
        }
    }

    public e(IFilterManager iFilterManager) {
        this.f8545a = iFilterManager;
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(int i2) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerSetMode(i2, 0);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int b(String[] strArr) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerRemoveNodes(strArr, strArr.length);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String[] strArr) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerAppendNodes(strArr, strArr.length);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void c(float f2, float f3) {
        if (!this.f8546b) {
            this.f8545a.processScaleEvent(f2, f3);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void b(float f2, float f3) {
        if (!this.f8546b) {
            this.f8545a.processLongPressEvent(f2, f3);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String[] strArr, int i2) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerSetNodes(strArr, i2);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String[] strArr, String[] strArr2) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void a(float f2, float f3) {
        if (!this.f8546b) {
            this.f8545a.processTouchEvent(f2, f3);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String str, String str2, float f2) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerUpdateNode(str, str2, f2);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String str, String str2, int[] iArr) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerCheckNodeExclusion(str, str2, iArr);
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final void b(float f2, float f3, int i2) {
        if (!this.f8546b) {
            this.f8545a.processTouchUpEvent(f2, f3, i2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.d
    public final int a(String[] strArr, int i2, String[] strArr2) {
        if (this.f8546b) {
            return 0;
        }
        return this.f8545a.composerSetNodesWithTags(strArr, i2, strArr2);
    }
}
