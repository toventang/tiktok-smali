package com.ss.android.ugc.aweme.ad.comment.c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.comment.d;
import com.ss.android.ugc.aweme.commercialize_ad_api.b.b;
import java.lang.ref.WeakReference;

public final class a extends b<d> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ad.comment.d.b f65617a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<com.ss.android.ugc.aweme.ad.comment.a.a> f65618b;

    static {
        Covode.recordClassIndex(40391);
    }

    public a(View view, com.ss.android.ugc.aweme.ad.comment.a.a aVar) {
        super(view);
        this.f65617a = (com.ss.android.ugc.aweme.ad.comment.d.b) view;
        this.f65618b = new WeakReference<>(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, com.ss.android.ugc.aweme.commercialize_ad_api.a.c] */
    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.b.b
    public final /* synthetic */ void a(Context context, d dVar) {
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        d dVar2 = dVar;
        this.f65617a.setData(dVar2.f65624e);
        Rect rect = dVar2.f65625f;
        com.ss.android.ugc.aweme.ad.comment.d.b bVar = this.f65617a;
        if (rect != null) {
            if (rect.top >= 0) {
                paddingTop = rect.top;
            } else {
                paddingTop = bVar.getPaddingTop();
            }
            if (rect.bottom >= 0) {
                paddingBottom = rect.bottom;
            } else {
                paddingBottom = bVar.getPaddingBottom();
            }
            int i2 = Build.VERSION.SDK_INT;
            if (rect.left >= 0) {
                paddingStart = rect.left;
            } else {
                paddingStart = bVar.getPaddingStart();
            }
            if (rect.right >= 0) {
                paddingEnd = rect.right;
            } else {
                paddingEnd = bVar.getPaddingEnd();
            }
            bVar.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
        if (this.f65618b.get() != null) {
            this.f65617a.setOnInternalEventListener(this.f65618b.get());
        }
    }
}
