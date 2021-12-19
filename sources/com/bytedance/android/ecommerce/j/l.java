package com.bytedance.android.ecommerce.j;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.ecommerce.a.a.b;
import com.bytedance.android.ecommerce.c.d;
import com.bytedance.android.ecommerce.k.h;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private String f7100a = "OcrService";

    /* renamed from: b  reason: collision with root package name */
    private Context f7101b;

    /* renamed from: c  reason: collision with root package name */
    private String f7102c;

    /* renamed from: d  reason: collision with root package name */
    private String f7103d;

    /* renamed from: e  reason: collision with root package name */
    private String f7104e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7105f;

    /* renamed from: g  reason: collision with root package name */
    private d f7106g;

    static {
        Covode.recordClassIndex(3416);
    }

    @Override // com.bytedance.android.ecommerce.j.g
    public final b a() {
        b bVar = new b(this.f7103d, this.f7104e);
        TimeZone timeZone = TimeZone.getTimeZone("gmt");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        bVar.f6878b = simpleDateFormat.format(new Date());
        bVar.f6877a = this.f7102c;
        return bVar;
    }

    @Override // com.bytedance.android.ecommerce.j.g
    public final void a(String str) {
        this.f7104e = str;
    }

    public l(Context context) {
        this.f7101b = context;
    }

    @Override // com.bytedance.android.ecommerce.c.d
    public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
        d dVar = this.f7106g;
        if (dVar != null) {
            dVar.a(i2, i3, str, bVar);
        }
        this.f7106g = null;
        this.f7105f = false;
        this.f7102c = "";
        this.f7103d = "";
        this.f7104e = "";
    }

    @Override // com.bytedance.android.ecommerce.j.g
    public final void a(String str, String str2, String str3, d dVar) {
        this.f7106g = dVar;
        if (this.f7105f) {
            a(0, 102, "The ocr service is running, please do not repeat it!", (com.bytedance.android.ecommerce.a.b.b) null);
        } else if (!h.a(this.f7101b)) {
            a(0, 106, "Network un available!", (com.bytedance.android.ecommerce.a.b.b) null);
        } else {
            this.f7105f = true;
            this.f7102c = str;
            this.f7103d = str2;
            this.f7104e = str3;
            try {
                Intent intent = new Intent(this.f7101b, OcrActivity.class);
                intent.setFlags(268435456);
                Context context = this.f7101b;
                a.a(intent, context);
                context.startActivity(intent);
            } catch (Throwable th) {
                a(0, 103, "error to start ocr activity:" + th.getMessage(), (com.bytedance.android.ecommerce.a.b.b) null);
            }
        }
    }
}
