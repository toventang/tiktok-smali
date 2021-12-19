package com.ss.android.ugc.aweme.sticker.types.game;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p extends h implements o {

    /* renamed from: c  reason: collision with root package name */
    private TextView f136116c;

    static {
        Covode.recordClassIndex(88914);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.n, com.ss.android.ugc.aweme.sticker.types.game.h
    public final void c() {
        super.c();
        TextView textView = this.f136116c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(FrameLayout frameLayout) {
        super(frameLayout);
        l.d(frameLayout, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.types.game.h
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aio, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.o
    public final void a(String str) {
        if (this.f136116c == null) {
            this.f136116c = (TextView) this.f136109b.findViewById(R.id.ab_);
        }
        TextView textView = this.f136116c;
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
