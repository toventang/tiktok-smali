package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.sysemoji.i;
import com.ss.android.ugc.aweme.emoji.utils.e;
import com.zhiliaoapp.musically.R;
import java.util.List;

final /* synthetic */ class j implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final List f89263a;

    /* renamed from: b  reason: collision with root package name */
    private final p f89264b;

    /* renamed from: c  reason: collision with root package name */
    private final m f89265c;

    /* renamed from: d  reason: collision with root package name */
    private final int f89266d;

    static {
        Covode.recordClassIndex(56100);
    }

    j(List list, p pVar, m mVar, int i2) {
        this.f89263a = list;
        this.f89264b = pVar;
        this.f89265c = mVar;
        this.f89266d = i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        List list = this.f89263a;
        p pVar = this.f89264b;
        m mVar = this.f89265c;
        int i3 = this.f89266d;
        a aVar = (a) list.get(i2);
        if (aVar == null) {
            return;
        }
        if (aVar.f89103a == 2131231984) {
            pVar.b();
        } else if (aVar.f89103a == 2131231993) {
            pVar.c();
        } else if (aVar.f89103a == R.drawable.a7k) {
            pVar.a();
        } else if (aVar.a()) {
            if (aVar.f89106d instanceof i) {
                i iVar = (i) aVar.f89106d;
                pVar.a(iVar.getPreviewEmoji() == null ? "" : iVar.getPreviewEmoji());
                return;
            }
            pVar.a(view.findViewById(R.id.av9), aVar, e.a(mVar, i3));
        } else if (!TextUtils.isEmpty(aVar.f89105c)) {
            pVar.a(aVar.f89105c);
        }
    }
}
