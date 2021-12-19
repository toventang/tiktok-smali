package com.bytedance.android.live.publicscreen.impl.widget.b;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.f.b;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.chatroom.ui.da;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    static d f12558a;

    static {
        Covode.recordClassIndex(6908);
    }

    private static a a(TextView textView) {
        Object obj;
        if (textView != null) {
            obj = textView.getTag(R.id.esv);
        } else {
            obj = null;
        }
        if (obj instanceof a) {
            return (a) obj;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.b.e
    public final void a(TextView textView, ClickableSpan clickableSpan) {
        a a2;
        super.a(textView, clickableSpan);
        if (clickableSpan instanceof da) {
            a a3 = a(textView);
            if (a3 != null) {
                b.a(a3);
            }
        } else if ((clickableSpan instanceof an) && (a2 = a(textView)) != null) {
            b.b(a2);
        }
    }
}
