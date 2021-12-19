package com.ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.u;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class a extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final c f124237f = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f124238a;

    /* renamed from: b  reason: collision with root package name */
    public QRCodeSquareView f124239b;

    /* renamed from: c  reason: collision with root package name */
    public int f124240c;

    /* renamed from: d  reason: collision with root package name */
    public int f124241d;

    /* renamed from: e  reason: collision with root package name */
    public b f124242e;

    /* renamed from: g  reason: collision with root package name */
    private TextView f124243g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f124244h;

    public interface b {
        static {
            Covode.recordClassIndex(81599);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(81597);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(81600);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a$a  reason: collision with other inner class name */
    public static final class C3237a implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124246b;

        static {
            Covode.recordClassIndex(81598);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
            b bVar;
            this.f124245a.f124240c = 3;
            if (this.f124245a.f124241d == 2 && (bVar = this.f124245a.f124242e) != null) {
                bVar.a();
            }
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
            b bVar;
            this.f124245a.f124240c = 3;
            if (this.f124245a.f124241d == 2 && (bVar = this.f124245a.f124242e) != null) {
                bVar.a();
            }
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            int i2;
            b bVar;
            MethodCollector.i(10624);
            a aVar = this.f124245a;
            if (bitmap != null) {
                ImageView imageView = aVar.f124238a;
                l.d(bitmap, "");
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                float f2 = ((float) min) / 2.0f;
                canvas.drawCircle(f2, f2, f2, paint);
                l.b(createBitmap, "");
                imageView.setImageBitmap(createBitmap);
                i2 = 2;
            } else {
                i2 = 3;
            }
            aVar.f124240c = i2;
            if (this.f124245a.f124241d != 2 || (bVar = this.f124245a.f124242e) == null) {
                MethodCollector.o(10624);
                return;
            }
            bVar.a();
            MethodCollector.o(10624);
        }

        C3237a(a aVar, Context context) {
            this.f124245a = aVar;
            this.f124246b = context;
        }
    }

    public static final class d implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124247a;

        static {
            Covode.recordClassIndex(81601);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a() {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f124247a = aVar;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            int i2;
            b bVar;
            a aVar = this.f124247a;
            if (bitmap != null) {
                aVar.f124239b.setImageBitmap(bitmap);
                if (!(this.f124247a.f124240c == 1 || (bVar = this.f124247a.f124242e) == null)) {
                    bVar.a();
                }
                i2 = 2;
            } else {
                i2 = 3;
            }
            aVar.f124241d = i2;
        }
    }

    public final void setCallback(b bVar) {
        l.d(bVar, "");
        this.f124242e = bVar;
    }

    public final void a(String str) {
        l.d(str, "");
        v a2 = r.a(str);
        a2.f39906b = getContext();
        a2.a(new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        User user;
        List<String> urlList;
        l.d(context, "");
        String str = null;
        MethodCollector.i(10777);
        this.f124240c = 1;
        this.f124241d = 1;
        com.a.a(LayoutInflater.from(context), R.layout.b04, this, true);
        View findViewById = findViewById(R.id.e1c);
        l.b(findViewById, "");
        this.f124238a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.e1d);
        l.b(findViewById2, "");
        this.f124243g = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.e1a);
        l.b(findViewById3, "");
        this.f124244h = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.e1b);
        l.b(findViewById4, "");
        this.f124239b = (QRCodeSquareView) findViewById4;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 != null) {
            user = g2.getCurUser();
        } else {
            user = null;
        }
        UrlModel a2 = u.a(user);
        if (!(a2 == null || (urlList = a2.getUrlList()) == null || !(true ^ urlList.isEmpty()))) {
            v a3 = r.a(urlList.get(0));
            a3.f39906b = context;
            a3.a(new C3237a(this, context));
        }
        this.f124243g.setText(user != null ? user.getNickname() : str);
        MethodCollector.o(10777);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
