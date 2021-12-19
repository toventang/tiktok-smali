package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.utils.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    public static final ba f132250a = new ba();

    private ba() {
    }

    static {
        Covode.recordClassIndex(86609);
    }

    public static final void a(View view) {
        l.d(view, "");
        Activity a2 = i.a(view.getContext());
        if (a2 != null) {
            l.b(a2, "");
            f132250a.a(view, new a(a2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f132251a;

        static {
            Covode.recordClassIndex(86610);
        }

        a(Activity activity) {
            this.f132251a = activity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            eu.b(this.f132251a);
            return false;
        }
    }

    public final void a(View view, View.OnTouchListener onTouchListener) {
        if (view.getId() != R.id.mw) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    l.b(childAt, "");
                    a(childAt, onTouchListener);
                }
            }
        }
    }
}
