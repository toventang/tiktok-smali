package com.bytedance.scene.group;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.l;

public final class e extends View {

    /* renamed from: a  reason: collision with root package name */
    private String f42878a;

    /* renamed from: b  reason: collision with root package name */
    private String f42879b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f42880c;

    /* renamed from: d  reason: collision with root package name */
    private l f42881d;

    static {
        Covode.recordClassIndex(26312);
    }

    public final Bundle getArguments() {
        return this.f42880c;
    }

    public final l getSceneComponentFactory() {
        return this.f42881d;
    }

    public final String getSceneName() {
        if (!TextUtils.isEmpty(this.f42878a)) {
            return this.f42878a;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
    }

    public final String getSceneTag() {
        if (!TextUtils.isEmpty(this.f42879b)) {
            return this.f42879b;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
    }

    public final void setArguments(Bundle bundle) {
        this.f42880c = bundle;
    }

    public final void setSceneComponentFactory(l lVar) {
        this.f42881d = lVar;
    }

    public final void setSceneName(String str) {
        this.f42878a = k.a(str, "ScenePlaceHolderView name can't be empty");
    }

    public final void setSceneTag(String str) {
        this.f42879b = k.a(str, "ScenePlaceHolderView tag can't be empty");
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i2 : size;
        }
        return Math.min(i2, size);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i2), a(getSuggestedMinimumHeight(), i3));
    }
}
