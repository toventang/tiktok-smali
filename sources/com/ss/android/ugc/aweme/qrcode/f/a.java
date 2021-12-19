package com.ss.android.ugc.aweme.qrcode.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.view.b;
import com.zhiliaoapp.musically.R;

public class a extends b {

    /* renamed from: h  reason: collision with root package name */
    private Context f119744h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f119745i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f119746j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f119747k;

    /* renamed from: l  reason: collision with root package name */
    private View f119748l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f119749m;
    private ImageView n;
    private com.ss.android.ugc.aweme.qrcode.d.a o;

    static {
        Covode.recordClassIndex(77801);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    public void setData(String str) {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    public void setQRCodeCardSubtitleColor(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    public void setQRCodeCardTitleColor(int i2) {
    }

    public com.ss.android.ugc.aweme.qrcode.d.a getQrCodeInfo() {
        return this.o;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a
    public final void a(com.ss.android.ugc.aweme.qrcode.d.a aVar) {
        this.o = aVar;
        b(aVar);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a
    public void a(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a(this.f119744h, (Throwable) exc, (int) R.string.g4j);
        c();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    public final void a(Context context) {
        super.a(context);
        this.f119744h = context;
        com.a.a(LayoutInflater.from(context), R.layout.bk0, this, true);
        this.f119748l = findViewById(R.id.df3);
        this.n = (ImageView) findViewById(R.id.a2o);
        this.f119846b = (RemoteImageView) findViewById(R.id.df2);
        this.f119745i = (TextView) findViewById(R.id.title);
        this.f119746j = (TextView) findViewById(R.id.ak7);
        this.f119747k = (TextView) findViewById(R.id.dcp);
        this.f119749m = (ImageView) findViewById(R.id.cj1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r0 != 23) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r3 != 23) goto L_0x007e;
     */
    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setData(com.ss.android.ugc.aweme.qrcode.j r18) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.f.a.setData(com.ss.android.ugc.aweme.qrcode.j):void");
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private a(Context context, char c2) {
        super(context, null);
        a(context);
    }
}
