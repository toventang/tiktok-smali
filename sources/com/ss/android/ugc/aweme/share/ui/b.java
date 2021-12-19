package com.ss.android.ugc.aweme.share.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.e;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f124385e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f124386a;

    /* renamed from: b  reason: collision with root package name */
    public UrlModel f124387b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC3243b f124388c;

    /* renamed from: d  reason: collision with root package name */
    public Context f124389d;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f124390f;

    /* renamed from: com.ss.android.ugc.aweme.share.ui.b$b  reason: collision with other inner class name */
    public interface AbstractC3243b {
        static {
            Covode.recordClassIndex(81672);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(81670);
    }

    public final View a(int i2) {
        if (this.f124390f == null) {
            this.f124390f = new SparseArray();
        }
        View view = (View) this.f124390f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f124390f.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81671);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Context getMContext() {
        return this.f124389d;
    }

    public final Bitmap getDefaultBitmap() {
        MethodCollector.i(9687);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f124389d.getResources(), R.raw.icon_color_default_avatar);
        if (decodeResource == null) {
            l.b();
        }
        Bitmap a2 = a(decodeResource);
        MethodCollector.o(9687);
        return a2;
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f124391a;

        static {
            Covode.recordClassIndex(81673);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(b bVar) {
            this.f124391a = bVar;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            ((SmartCircleImageView) this.f124391a.a(R.id.cdt)).setImageBitmap(this.f124391a.getDefaultBitmap());
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                ((SmartCircleImageView) this.f124391a.a(R.id.cdt)).setImageBitmap(b.a(bitmap));
                AbstractC3243b bVar = this.f124391a.f124388c;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            ((SmartCircleImageView) this.f124391a.a(R.id.cdt)).setImageBitmap(this.f124391a.getDefaultBitmap());
            AbstractC3243b bVar2 = this.f124391a.f124388c;
            if (bVar2 != null) {
                bVar2.a();
            }
        }
    }

    public final void setMContext(Context context) {
        l.d(context, "");
        this.f124389d = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(9859);
        this.f124389d = context;
        View.inflate(context, R.layout.b05, this);
        MethodCollector.o(9859);
    }

    public static Bitmap a(Bitmap bitmap) {
        MethodCollector.i(9530);
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
        MethodCollector.o(9530);
        return createBitmap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private b(Context context, byte b2) {
        this(context);
        l.d(context, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context, char c2) {
        this(context, (byte) 0);
        l.d(context, "");
    }
}
