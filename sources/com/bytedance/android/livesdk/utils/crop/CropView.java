package com.bytedance.android.livesdk.utils.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.g;
import b.i;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import h.p;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class CropView extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f22259g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PinchImageView f22260a;

    /* renamed from: b  reason: collision with root package name */
    public PreviewBoxView f22261b;

    /* renamed from: c  reason: collision with root package name */
    Bitmap f22262c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f22263d;

    /* renamed from: e  reason: collision with root package name */
    int f22264e;

    /* renamed from: f  reason: collision with root package name */
    int f22265f;

    /* renamed from: h  reason: collision with root package name */
    private SwitchModeFrameLayout f22266h;

    static {
        Covode.recordClassIndex(13149);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13150);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropView f22269a;

        static {
            Covode.recordClassIndex(13153);
        }

        d(CropView cropView) {
            this.f22269a = cropView;
        }

        public final void run() {
            CropView.a(this.f22269a).a();
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropView f22270a;

        static {
            Covode.recordClassIndex(13154);
        }

        e(CropView cropView) {
            this.f22270a = cropView;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            File file;
            p pVar;
            MethodCollector.i(12774);
            CropView cropView = this.f22270a;
            Context context = cropView.getContext();
            String str = null;
            if (!com.bytedance.android.live.core.f.e.a() || !com.bytedance.android.live.core.f.e.b()) {
                file = null;
            } else {
                file = new File(com.bytedance.android.live.core.f.e.a(context), "picture");
                com.bytedance.android.live.core.f.e.a(file);
                com.bytedance.android.live.core.c.a.a(3, "file_path", "picture" + " cache path:" + file.getAbsolutePath());
            }
            File file2 = new File(file, "crop_" + System.currentTimeMillis() + ".png");
            PinchImageView pinchImageView = cropView.f22260a;
            if (pinchImageView == null) {
                l.a("mCoverImage");
            }
            Bitmap bitmap = cropView.f22262c;
            if (bitmap == null) {
                l.a("mOriginalBitmap");
            }
            RectF a2 = pinchImageView.a((RectF) null);
            Rect rect = cropView.f22263d;
            if (rect == null) {
                pVar = new p(bitmap, Integer.valueOf((int) R.string.gme));
            } else {
                float width = ((float) bitmap.getWidth()) / a2.width();
                float height = ((float) bitmap.getHeight()) / a2.height();
                int b2 = h.b((int) ((((float) rect.left) - a2.left) * width), 0);
                int b3 = h.b((int) ((((float) rect.top) - a2.top) * height), 0);
                int c2 = h.c((int) (((float) rect.width()) * width), bitmap.getWidth() - b2);
                int c3 = h.c((int) (((float) rect.height()) * height), bitmap.getHeight() - b3);
                if (c2 < cropView.f22264e || c3 < cropView.f22265f) {
                    pVar = new p(null, Integer.valueOf((int) R.string.gxm));
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, b2, b3, c2, c3);
                    if (createBitmap != null) {
                        CropView.a(bitmap, b2, b3, createBitmap);
                    }
                    pVar = new p(createBitmap, Integer.valueOf((int) R.string.gme));
                }
            }
            Bitmap bitmap2 = (Bitmap) pVar.getFirst();
            if (bitmap2 == null) {
                p pVar2 = new p(null, pVar.getSecond());
                MethodCollector.o(12774);
                return pVar2;
            }
            if (BitmapUtils.saveBitmapToSD(bitmap2, file2.getParent(), file2.getName())) {
                str = file2.getAbsolutePath();
            }
            p pVar3 = new p(str, Integer.valueOf((int) R.string.gme));
            MethodCollector.o(12774);
            return pVar3;
        }
    }

    public static final class b extends SwitchModeFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropView f22267a;

        static {
            Covode.recordClassIndex(13151);
        }

        b(CropView cropView) {
            this.f22267a = cropView;
        }

        @Override // com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.b, com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.a
        public final void a(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                PreviewBoxView a2 = CropView.a(this.f22267a);
                if (a2.f22297b != null && a2.f22297b.isStarted()) {
                    a2.f22297b.cancel();
                }
                if (Math.abs(a2.f22301f - 0.5f) >= Float.MIN_NORMAL) {
                    a2.f22301f = 0.5f;
                    a2.setAlpha(a2.f22301f);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f22267a.f22263d == null) {
                    CropView cropView = this.f22267a;
                    cropView.f22263d = CropView.a(cropView).getVisibleRect();
                }
                CropView.a(this.f22267a).a();
            }
        }
    }

    public static final /* synthetic */ PreviewBoxView a(CropView cropView) {
        PreviewBoxView previewBoxView = cropView.f22261b;
        if (previewBoxView == null) {
            l.a("mCoverWindow");
        }
        return previewBoxView;
    }

    public final void setOriginPath(String str) {
        if (str != null) {
            int readPictureDegree = BitmapUtils.readPictureDegree(str);
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 1080, 1080);
            if (bitmapFromSD != null) {
                a(bitmapFromSD, readPictureDegree);
            }
        }
    }

    static final class f<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f22271a;

        static {
            Covode.recordClassIndex(13155);
        }

        f(h.f.a.b bVar) {
            this.f22271a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            CharSequence charSequence;
            l.b(iVar, "");
            if (iVar.a() && (charSequence = (CharSequence) ((p) iVar.d()).getFirst()) != null && charSequence.length() != 0) {
                h.f.a.b bVar = this.f22271a;
                Object first = ((p) iVar.d()).getFirst();
                if (first == null) {
                    l.b();
                }
                bVar.invoke(first);
                return null;
            } else if (iVar.a()) {
                ao.a(y.e(), ((Number) ((p) iVar.d()).getSecond()).intValue());
                return null;
            } else {
                ao.a(y.e(), (int) R.string.gme);
                return null;
            }
        }
    }

    private final int a(Uri uri) {
        FileDescriptor fileDescriptor;
        MethodCollector.i(12886);
        try {
            Context context = getContext();
            l.b(context, "");
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null || (fileDescriptor = openFileDescriptor.getFileDescriptor()) == null) {
                MethodCollector.o(12886);
                return 0;
            }
            int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                MethodCollector.o(12886);
                return LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (attributeInt == 6) {
                MethodCollector.o(12886);
                return 90;
            } else if (attributeInt != 8) {
                MethodCollector.o(12886);
                return 0;
            } else {
                MethodCollector.o(12886);
                return 270;
            }
        } catch (IOException unused) {
            MethodCollector.o(12886);
            return 0;
        }
    }

    public final void setOriginUri(Uri uri) {
        int i2;
        if (uri != null) {
            try {
                Context context = getContext();
                l.b(context, "");
                Bitmap decodeBitmap = BitmapUtils.decodeBitmap(context.getContentResolver(), uri, 1080, 1080);
                if (decodeBitmap == null) {
                    com.bytedance.android.livesdk.utils.p.a();
                    return;
                }
                String a2 = com.bytedance.android.livesdk.utils.c.a(getContext(), uri);
                if (a2 != null && !h.m.p.a((CharSequence) a2)) {
                    i2 = BitmapUtils.readPictureDegree(a2);
                } else if (Build.VERSION.SDK_INT >= 24) {
                    i2 = a(uri);
                } else {
                    i2 = BitmapUtils.readPictureDegree(uri.getPath());
                }
                a(decodeBitmap, i2);
            } catch (Exception unused) {
                com.bytedance.android.livesdk.utils.p.a();
            }
        }
    }

    private final void a(Bitmap bitmap, int i2) {
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmap, i2);
        l.b(rotateBitmap, "");
        this.f22262c = rotateBitmap;
        PinchImageView pinchImageView = this.f22260a;
        if (pinchImageView == null) {
            l.a("mCoverImage");
        }
        Bitmap bitmap2 = this.f22262c;
        if (bitmap2 == null) {
            l.a("mOriginalBitmap");
        }
        pinchImageView.setImageBitmap(bitmap2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(12986);
        View inflate = View.inflate(getContext(), R.layout.b5w, this);
        View findViewById = inflate.findViewById(R.id.ah6);
        l.b(findViewById, "");
        this.f22266h = (SwitchModeFrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bvt);
        l.b(findViewById2, "");
        this.f22260a = (PinchImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.bw1);
        l.b(findViewById3, "");
        this.f22261b = (PreviewBoxView) findViewById3;
        SwitchModeFrameLayout switchModeFrameLayout = this.f22266h;
        if (switchModeFrameLayout == null) {
            l.a("mCropContainer");
        }
        switchModeFrameLayout.setBackgroundColor(y.b((int) R.color.xj));
        switchModeFrameLayout.setIntercepter(new b(this));
        PreviewBoxView previewBoxView = this.f22261b;
        if (previewBoxView == null) {
            l.a("mCoverWindow");
        }
        previewBoxView.f22299d = 0;
        previewBoxView.f22300e = 1.0f;
        previewBoxView.f22298c = (int) ap.a(previewBoxView.getContext(), 16.0f);
        previewBoxView.addOnLayoutChangeListener(new c(this));
        previewBoxView.postDelayed(new d(this), 1000);
        MethodCollector.o(12986);
    }

    static boolean a(Bitmap bitmap, int i2, int i3, Bitmap bitmap2) {
        int c2 = h.c(bitmap2.getWidth(), bitmap.getWidth() - i2);
        int c3 = h.c(bitmap2.getHeight(), bitmap.getHeight() - i3);
        for (int i4 = 0; i4 < c2; i4++) {
            for (int b2 = h.b(c3 - 10, 0); b2 < c3; b2++) {
                try {
                    if (bitmap.getPixel(i2 + i4, i3 + b2) != bitmap2.getPixel(i4, b2)) {
                        return false;
                    }
                } catch (IllegalArgumentException | IllegalStateException unused) {
                }
            }
        }
        return true;
    }

    static final class c implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CropView f22268a;

        static {
            Covode.recordClassIndex(13152);
        }

        c(CropView cropView) {
            this.f22268a = cropView;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.f22268a.f22263d == null) {
                CropView cropView = this.f22268a;
                cropView.f22263d = CropView.a(cropView).getVisibleRect();
                PinchImageView pinchImageView = this.f22268a.f22260a;
                if (pinchImageView == null) {
                    l.a("mCoverImage");
                }
                pinchImageView.setDisplayWindowRect(this.f22268a.f22263d);
            }
        }
    }
}
