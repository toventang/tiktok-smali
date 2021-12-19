package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.f.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class KeyboardShadowView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Activity f15800a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15801b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15802c;

    /* renamed from: d  reason: collision with root package name */
    private int f15803d;

    /* renamed from: e  reason: collision with root package name */
    private a f15804e;

    public interface a {
        static {
            Covode.recordClassIndex(8719);
        }
    }

    static {
        Covode.recordClassIndex(8718);
    }

    public void setCallback(a aVar) {
        this.f15804e = aVar;
    }

    public void setShowStatusBar(boolean z) {
        this.f15802c = z;
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity) {
        this.f15800a = activity;
        this.f15801b = d.a(activity);
        this.f15803d = n.e(activity);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10116);
        MethodCollector.o(10116);
    }
}
