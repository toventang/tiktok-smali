package com.ss.android.ugc.aweme.tools.mvtemplate.view.preview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.db;
import h.f.b.l;

public final class ItemFrameView extends View {

    /* renamed from: b  reason: collision with root package name */
    public static final a f140957b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public db f140958a;

    /* renamed from: c  reason: collision with root package name */
    private String f140959c;

    /* renamed from: d  reason: collision with root package name */
    private String f140960d;

    /* renamed from: e  reason: collision with root package name */
    private Point f140961e;

    /* renamed from: f  reason: collision with root package name */
    private int f140962f;

    /* renamed from: g  reason: collision with root package name */
    private int f140963g;

    /* renamed from: h  reason: collision with root package name */
    private int f140964h;

    /* renamed from: i  reason: collision with root package name */
    private int f140965i;

    /* renamed from: j  reason: collision with root package name */
    private float f140966j;

    /* renamed from: k  reason: collision with root package name */
    private int f140967k;

    /* renamed from: l  reason: collision with root package name */
    private int f140968l;

    /* renamed from: m  reason: collision with root package name */
    private int f140969m;
    private final Rect n;
    private final RectF o;

    static {
        Covode.recordClassIndex(92033);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92034);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final db getFrameCache() {
        db dbVar = this.f140958a;
        if (dbVar == null) {
            l.a("frameCache");
        }
        return dbVar;
    }

    public final void setFrameCache(db dbVar) {
        l.d(dbVar, "");
        this.f140958a = dbVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087 A[LOOP:0: B:6:0x0059->B:17:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed A[EDGE_INSN: B:43:0x00ed->B:40:0x00ed ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.view.preview.ItemFrameView.onDraw(android.graphics.Canvas):void");
    }

    public ItemFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ItemFrameView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6733);
        this.f140959c = "";
        this.f140960d = "video";
        this.f140961e = new Point(0, 0);
        this.f140963g = en.a(30.0d, i.f115645a);
        this.f140964h = en.a(56.0d, i.f115645a);
        this.f140965i = 1000;
        int b3 = n.b(getContext());
        this.f140967k = b3;
        this.f140968l = (-b3) * 2;
        this.f140969m = b3 * 2;
        this.n = new Rect();
        this.o = new RectF();
        MethodCollector.o(6733);
    }
}
