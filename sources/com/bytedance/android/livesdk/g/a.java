package com.bytedance.android.livesdk.g;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f17812a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f17813b;

    /* renamed from: c  reason: collision with root package name */
    protected View f17814c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Dialog> f17815d = new HashSet();

    static {
        Covode.recordClassIndex(9891);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f17812a = false;
        this.f17813b = null;
        this.f17814c = null;
        for (Dialog dialog : this.f17815d) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        this.f17815d.clear();
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, View view) {
        this.f17813b = context;
        this.f17814c = view;
        this.f17812a = true;
    }
}
