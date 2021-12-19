package com.ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.experiment.cd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.view.e.b;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class AwemeDraftNewViewHolder extends com.ss.android.ugc.aweme.tools.draft.a.a<c> implements WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    TextView f139296a;

    /* renamed from: b  reason: collision with root package name */
    TuxCheckBox f139297b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139298c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f139299d;

    /* renamed from: e  reason: collision with root package name */
    final a f139300e;

    /* renamed from: f  reason: collision with root package name */
    final Context f139301f;

    /* renamed from: g  reason: collision with root package name */
    long f139302g;

    /* renamed from: h  reason: collision with root package name */
    final Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f139303h;

    /* renamed from: i  reason: collision with root package name */
    TuxTextView f139304i;

    /* renamed from: j  reason: collision with root package name */
    TuxTextView f139305j;

    /* renamed from: k  reason: collision with root package name */
    ViewGroup f139306k;

    /* renamed from: l  reason: collision with root package name */
    ViewGroup f139307l;

    /* renamed from: m  reason: collision with root package name */
    final int f139308m;
    private b n;
    private View o;
    private ViewGroup p;
    private TuxIconView q;

    public interface a {
        static {
            Covode.recordClassIndex(91077);
        }

        void a(int i2, c cVar);

        void a(View view, c cVar);
    }

    static {
        Covode.recordClassIndex(91074);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a(this.f139301f, (Intent) message.obj);
        b bVar = this.n;
        if (bVar != null && bVar.isShowing()) {
            this.n.dismiss();
            this.n = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar) {
        if (cd.a()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(20);
            int b2 = (int) n.b(this.itemView.getContext(), 4.0f);
            int b3 = (int) n.b(this.itemView.getContext(), 6.0f);
            layoutParams.setMargins(b2, b3, b2, b3);
            this.p.setLayoutParams(layoutParams);
            this.q.setIconRes(R.raw.icon_music_note);
            this.q.setTintColorRes(R.attr.aa);
            this.f139305j.setMaxLines(1);
            this.f139305j.setMinTextSize(13.0f);
            this.f139305j.setTuxFont(62);
            this.f139305j.setText(cVar.f83185f.musicName);
        } else {
            this.q.setIconRes(R.raw.icon_video);
            this.q.setTintColorRes(R.attr.aa);
            this.f139305j.setMaxLines(2);
            this.f139305j.setMinTextSize(10.0f);
            Display defaultDisplay = ((WindowManager) a(com.ss.android.ugc.aweme.port.in.i.f115645a, "window")).getDefaultDisplay();
            Point point = new Point();
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            int b4 = (point.x / 3) - ((int) n.b(this.itemView.getContext(), 34.0f));
            TextPaint paint = this.f139305j.getPaint();
            String string = this.f139301f.getString(R.string.bdg);
            this.f139305j.setText(R.string.bdg);
            this.f139305j.setTuxFont(92);
            float f2 = (float) b4;
            if (paint.measureText(string) > f2) {
                this.f139305j.setTuxFont(92);
            } else {
                this.f139305j.setTuxFont(62);
            }
            String[] split = string.split(" ");
            if (paint.measureText(string) > f2) {
                try {
                    String str = split[0];
                    int i3 = 0;
                    for (int i4 = 1; i4 < split.length; i4++) {
                        if (paint.measureText(str + " " + split[i4]) <= f2) {
                            str = str + " " + split[i4];
                        } else {
                            i3 = i4;
                        }
                    }
                    String str2 = split[i3];
                    for (int i5 = i3 + 1; i5 < split.length; i5++) {
                        str2 = str2 + " " + split[i5];
                    }
                    this.f139305j.setWidth((int) (Math.max(paint.measureText(str), paint.measureText(str2)) + 1.0f));
                } catch (IndexOutOfBoundsException | NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.f139305j.setVisibility(0);
        this.f139306k.setVisibility(0);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static boolean a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    private static Object a(Application application, String str) {
        Object obj;
        MethodCollector.i(1472);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(1472);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    AwemeDraftNewViewHolder(View view, Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, a aVar) {
        super(view);
        Context context = view.getContext();
        this.f139301f = context;
        this.f139308m = (dh.b(context) - (((int) n.b(context, 1.0f)) * 2)) / 3;
        this.o = view.findViewById(R.id.ad7);
        this.u = (SmartImageView) view.findViewById(R.id.agf);
        this.f139305j = (TuxTextView) view.findViewById(R.id.f4l);
        this.f139304i = (TuxTextView) view.findViewById(R.id.f9s);
        this.f139306k = (ViewGroup) view.findViewById(R.id.fgh);
        this.p = (ViewGroup) view.findViewById(R.id.ej9);
        this.f139296a = (TextView) v.c(view, (int) R.id.eyt);
        this.f139307l = (ViewGroup) v.c(view, (int) R.id.e4q);
        this.f139297b = (TuxCheckBox) v.c(view, (int) R.id.a5_);
        this.q = (TuxIconView) view.findViewById(R.id.c0c);
        this.o.setOnClickListener(new o(this));
        this.o.setOnLongClickListener(new p(this));
        this.f139300e = aVar;
        Activity a2 = com.ss.android.ugc.aweme.utils.i.a(context);
        if (a2 instanceof e) {
            ((androidx.core.app.d) a2).getLifecycle().a(this);
        }
        this.f139303h = map;
    }

    public static void a(Context context, String str, String str2, int i2, String str3, boolean z) {
        String uuid = UUID.randomUUID().toString();
        ArrayList<String> a2 = g.a(str3);
        com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", uuid).a("shoot_way", "draft_again").a("shoot_entrance", "draft_again").a("enter_method", "draft_again").a("music_id", str).a("is_ui_shoot", false).a("group_id", dv.a());
        if (!k.a(a2) && !TextUtils.isEmpty(a2.get(0))) {
            a3.a("prop_id", a2.get(0));
        }
        com.ss.android.ugc.aweme.utils.d.a("shoot", a3.f149193a);
        com.ss.android.ugc.aweme.df.e.a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i2 + "]");
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i2);
        intent.putExtra("record_from", 1);
        intent.putExtra("draft_music_legal", z);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("extra_sticker_from", "draft");
        intent.putStringArrayListExtra("reuse_sticker_ids", g.a(str3));
        cr.a().g();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        a(context, intent);
    }
}
