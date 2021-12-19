package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.extract.k;
import com.ss.android.ugc.tools.utils.i;
import f.a.v;
import f.a.w;
import h.f.a.b;
import h.z;
import java.util.Date;
import java.util.Locale;

final /* synthetic */ class m implements w {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114887a;

    /* renamed from: b  reason: collision with root package name */
    private final int f114888b;

    /* renamed from: c  reason: collision with root package name */
    private final int f114889c;

    static {
        Covode.recordClassIndex(73896);
    }

    m(PhotoModule photoModule, int i2, int i3) {
        this.f114887a = photoModule;
        this.f114888b = i2;
        this.f114889c = i3;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        PhotoModule photoModule = this.f114887a;
        int i2 = this.f114888b;
        int i3 = this.f114889c;
        b bVar = photoModule.f114829c;
        String str = bVar.f114839c == Bitmap.CompressFormat.JPEG ? ".jpeg" : ".png";
        Locale locale = Locale.getDefault();
        String concat = "%s/IMG_%s".concat(str);
        StringBuilder append = new StringBuilder().append(bVar.f114840d.format(new Date())).append("_");
        int i4 = b.f114837a + 1;
        b.f114837a = i4;
        String a2 = a.a(locale, concat, new Object[]{bVar.f114838b, append.append(i4).append("_frame").toString()});
        i.b(a2);
        int i5 = k.f140100a[0];
        if (i5 < i2) {
            double d2 = (double) i5;
            double d3 = (double) i3;
            Double.isNaN(d3);
            double d4 = (double) i2;
            Double.isNaN(d4);
            Double.isNaN(d2);
            i3 = (int) (d2 * ((d3 * 1.0d) / d4));
        } else {
            i5 = i2;
        }
        photoModule.f114827a.a(a2, i5, i3, false, Bitmap.CompressFormat.JPEG, (b<? super Integer, z>) new o(vVar, a2), false);
    }
}
