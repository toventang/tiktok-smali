package com.ss.android.ugc.aweme.choosemusic.a;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.g.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final TextView f70324a;

    /* renamed from: b  reason: collision with root package name */
    final ImageView f70325b;

    /* renamed from: c  reason: collision with root package name */
    private final View f70326c;

    static {
        Covode.recordClassIndex(43375);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.a6o);
        l.b(findViewById, "");
        this.f70326c = findViewById;
        View findViewById2 = view.findViewById(R.id.f36);
        l.b(findViewById2, "");
        this.f70324a = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bhy);
        l.b(findViewById3, "");
        this.f70325b = (ImageView) findViewById3;
        if (Build.VERSION.SDK_INT >= 23) {
            findViewById.setForeground(findViewById.getResources().getDrawable(R.drawable.blp));
        } else {
            a.a(findViewById);
        }
    }
}
