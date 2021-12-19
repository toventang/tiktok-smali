package com.ss.android.ugc.gamora.editor.sticker.donation.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.b;
import com.ss.android.ugc.tools.view.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends a<b> {

    /* renamed from: a  reason: collision with root package name */
    private a f146514a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.editor.sticker.donation.b f146515b;

    static {
        Covode.recordClassIndex(96408);
    }

    public c(a aVar, com.ss.android.ugc.gamora.editor.sticker.donation.b bVar) {
        l.d(aVar, "");
        this.f146514a = aVar;
        this.f146515b = bVar;
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.a_0, viewGroup, false);
        l.b(a2, "");
        return new b(a2, this.f146515b, this.f146514a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105  */
    @Override // com.ss.android.ugc.tools.view.b.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.donation.a.c.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
