package com.ss.android.ugc.aweme.comment;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f71773a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71774b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71775c;

    static {
        Covode.recordClassIndex(44136);
    }

    d(b bVar, String str, String str2) {
        this.f71773a = bVar;
        this.f71774b = str;
        this.f71775c = str2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f71773a.a(this.f71774b, this.f71775c, view, motionEvent);
    }
}
