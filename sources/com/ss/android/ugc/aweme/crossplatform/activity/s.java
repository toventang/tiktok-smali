package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.a;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.d.a.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    View f78563a;

    /* renamed from: b  reason: collision with root package name */
    View f78564b;

    /* renamed from: c  reason: collision with root package name */
    View f78565c;

    /* renamed from: d  reason: collision with root package name */
    List<Integer> f78566d;

    /* renamed from: e  reason: collision with root package name */
    Activity f78567e;

    /* renamed from: f  reason: collision with root package name */
    m f78568f;

    /* renamed from: g  reason: collision with root package name */
    private PopupWindow f78569g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnClickListener f78570h = new t(this);

    static {
        Covode.recordClassIndex(48790);
    }

    /* access modifiers changed from: package-private */
    public final PopupWindow a() {
        if (this.f78569g == null) {
            View a2 = a.a(LayoutInflater.from(this.f78567e), R.layout.v4, null, false);
            this.f78563a = a2.findViewById(R.id.dk5);
            this.f78564b = a2.findViewById(R.id.af9);
            this.f78565c = a2.findViewById(R.id.czk);
            this.f78563a.setOnClickListener(this.f78570h);
            this.f78564b.setOnClickListener(this.f78570h);
            this.f78565c.setOnClickListener(this.f78570h);
            PopupWindow popupWindow = new PopupWindow(a2, -2, -2, true);
            this.f78569g = popupWindow;
            popupWindow.setTouchable(true);
            this.f78569g.setAnimationStyle(R.style.w7);
            this.f78569g.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f78569g;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!m.a(str)) {
            c[] values = c.values();
            for (c cVar : values) {
                if (TextUtils.equals(str, cVar.key)) {
                    int i2 = cVar.id;
                    if (i2 > 0) {
                        n.a(this.f78567e.findViewById(i2), 8);
                        if (this.f78566d == null) {
                            this.f78566d = new ArrayList();
                        }
                        if (!this.f78566d.contains(Integer.valueOf(i2))) {
                            this.f78566d.add(Integer.valueOf(i2));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    s(Activity activity, m mVar) {
        this.f78567e = activity;
        this.f78568f = mVar;
        a();
    }
}
