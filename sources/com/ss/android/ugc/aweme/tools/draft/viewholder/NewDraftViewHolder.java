package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.draft.model.k;
import com.ss.android.ugc.aweme.experiment.cd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.draft.d.m;
import com.zhiliaoapp.musically.R;
import h.j.h;
import h.m.p;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Objects;

public final class NewDraftViewHolder extends a<m> implements l {

    /* renamed from: a  reason: collision with root package name */
    public final String f139890a = "NewDraftViewHolder";

    /* renamed from: b  reason: collision with root package name */
    public Context f139891b;

    /* renamed from: c  reason: collision with root package name */
    TuxCheckBox f139892c;

    /* renamed from: d  reason: collision with root package name */
    public SimpleDraweeView f139893d;

    /* renamed from: e  reason: collision with root package name */
    public m f139894e;

    /* renamed from: f  reason: collision with root package name */
    long f139895f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.f.a f139896g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.viewmodel.a f139897h;

    /* renamed from: i  reason: collision with root package name */
    private TuxTextView f139898i;

    /* renamed from: j  reason: collision with root package name */
    private View f139899j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f139900k;

    /* renamed from: l  reason: collision with root package name */
    private ViewGroup f139901l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f139902m;
    private ViewGroup n;
    private TuxIconView o;
    private TextView p;
    private k q;

    static {
        Covode.recordClassIndex(91425);
    }

    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public static final /* synthetic */ m a(NewDraftViewHolder newDraftViewHolder) {
        m mVar = newDraftViewHolder.f139894e;
        if (mVar == null) {
            h.f.b.l.a("mData");
        }
        return mVar;
    }

    public static final /* synthetic */ SimpleDraweeView b(NewDraftViewHolder newDraftViewHolder) {
        SimpleDraweeView simpleDraweeView = newDraftViewHolder.f139893d;
        if (simpleDraweeView == null) {
            h.f.b.l.a("mCover");
        }
        return simpleDraweeView;
    }

    public static final class c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDraftViewHolder f139906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f139907b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139908c;

        static {
            Covode.recordClassIndex(91428);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            bj.b(this.f139906a.f139890a + " :onGetVideoCoverFailed: errorCode = " + i2);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            h.f.b.l.d(bitmap, "");
            bj.b(this.f139906a.f139890a + " : bindDraftCover -> creationId = " + ((com.ss.android.ugc.aweme.tools.draft.d.c) this.f139907b).f139480c);
            bj.a(this.f139906a.f139890a + " : onGetVideoCoverSuccess: ");
            if (!bitmap.isRecycled() && NewDraftViewHolder.b(this.f139906a).getTag() != null && !(!h.f.b.l.a(NewDraftViewHolder.b(this.f139906a).getTag(), (Object) this.f139908c.r()))) {
                SimpleDraweeView b2 = NewDraftViewHolder.b(this.f139906a);
                if (!bitmap.isRecycled()) {
                    b2.setImageBitmap(bitmap);
                }
            }
        }

        c(NewDraftViewHolder newDraftViewHolder, m mVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139906a = newDraftViewHolder;
            this.f139907b = mVar;
            this.f139908c = cVar;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDraftViewHolder f139904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f139905b;

        static {
            Covode.recordClassIndex(91427);
        }

        b(NewDraftViewHolder newDraftViewHolder, m mVar) {
            this.f139904a = newDraftViewHolder;
            this.f139905b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!g.a().o().c()) {
                cr.a();
                h.f.b.l.b(view, "");
                if (!cr.a(view.getContext())) {
                    return;
                }
            }
            com.ss.android.ugc.aweme.tools.draft.f.a aVar = this.f139904a.f139896g;
            h.f.b.l.b(view, "");
            aVar.a(view, this.f139904a.f139891b, ((com.ss.android.ugc.aweme.tools.draft.d.c) this.f139905b).f139480c);
        }
    }

    static final class e implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDraftViewHolder f139910a;

        static {
            Covode.recordClassIndex(91430);
        }

        e(NewDraftViewHolder newDraftViewHolder) {
            this.f139910a = newDraftViewHolder;
        }

        public final boolean onLongClick(View view) {
            NewDraftViewHolder newDraftViewHolder = this.f139910a;
            if (view == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(view, "");
            cr.a();
            if (!cr.a(view.getContext())) {
                return true;
            }
            com.ss.android.ugc.aweme.tools.draft.f.a aVar = newDraftViewHolder.f139896g;
            m mVar = newDraftViewHolder.f139894e;
            if (mVar == null) {
                h.f.b.l.a("mData");
            }
            aVar.a(view, mVar);
            return true;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDraftViewHolder f139909a;

        static {
            Covode.recordClassIndex(91429);
        }

        d(NewDraftViewHolder newDraftViewHolder) {
            this.f139909a = newDraftViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            NewDraftViewHolder newDraftViewHolder = this.f139909a;
            if (view == null) {
                h.f.b.l.b();
            }
            m mVar = newDraftViewHolder.f139894e;
            if (mVar == null) {
                h.f.b.l.a("mData");
            }
            if (mVar.f139476a) {
                TuxCheckBox tuxCheckBox = newDraftViewHolder.f139892c;
                if (tuxCheckBox == null) {
                    h.f.b.l.a("mCheckBox");
                }
                m mVar2 = newDraftViewHolder.f139894e;
                if (mVar2 == null) {
                    h.f.b.l.a("mData");
                }
                tuxCheckBox.setChecked(!mVar2.f139482e);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - newDraftViewHolder.f139895f >= 500) {
                newDraftViewHolder.f139895f = currentTimeMillis;
                com.ss.android.ugc.aweme.tools.draft.f.a aVar = newDraftViewHolder.f139896g;
                int adapterPosition = newDraftViewHolder.getAdapterPosition();
                m mVar3 = newDraftViewHolder.f139894e;
                if (mVar3 == null) {
                    h.f.b.l.a("mData");
                }
                aVar.a(adapterPosition, mVar3);
            }
        }
    }

    private final void a(m mVar) {
        if (cd.a()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(20);
            View view = this.itemView;
            h.f.b.l.b(view, "");
            int b2 = (int) n.b(view.getContext(), 4.0f);
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            int b3 = (int) n.b(view2.getContext(), 6.0f);
            layoutParams.setMargins(b2, b3, b2, b3);
            ViewGroup viewGroup = this.f139902m;
            if (viewGroup == null) {
                h.f.b.l.a("mTextBottomContainer");
            }
            viewGroup.setLayoutParams(layoutParams);
            TuxIconView tuxIconView = this.o;
            if (tuxIconView == null) {
                h.f.b.l.a("iconView");
            }
            tuxIconView.setIconRes(R.raw.icon_music_note);
            TuxIconView tuxIconView2 = this.o;
            if (tuxIconView2 == null) {
                h.f.b.l.a("iconView");
            }
            tuxIconView2.setTintColorRes(R.attr.aa);
            TuxTextView tuxTextView = this.f139900k;
            if (tuxTextView == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView.setMaxLines(1);
            TuxTextView tuxTextView2 = this.f139900k;
            if (tuxTextView2 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView2.setMinTextSize(13.0f);
            TuxTextView tuxTextView3 = this.f139900k;
            if (tuxTextView3 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView3.setTuxFont(62);
            TuxTextView tuxTextView4 = this.f139900k;
            if (tuxTextView4 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView4.setText(mVar.f139484g);
        } else {
            TuxIconView tuxIconView3 = this.o;
            if (tuxIconView3 == null) {
                h.f.b.l.a("iconView");
            }
            tuxIconView3.setIconRes(R.raw.icon_video);
            TuxIconView tuxIconView4 = this.o;
            if (tuxIconView4 == null) {
                h.f.b.l.a("iconView");
            }
            tuxIconView4.setTintColorRes(R.attr.aa);
            TuxTextView tuxTextView5 = this.f139900k;
            if (tuxTextView5 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView5.setMaxLines(2);
            TuxTextView tuxTextView6 = this.f139900k;
            if (tuxTextView6 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView6.setMinTextSize(10.0f);
            Object a2 = a(com.ss.android.ugc.aweme.port.in.i.f115645a, "window");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
            Point point = new Point();
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            int i3 = point.x / 3;
            View view3 = this.itemView;
            h.f.b.l.b(view3, "");
            int b4 = i3 - ((int) n.b(view3.getContext(), 34.0f));
            TuxTextView tuxTextView7 = this.f139900k;
            if (tuxTextView7 == null) {
                h.f.b.l.a("textBottom");
            }
            TextPaint paint = tuxTextView7.getPaint();
            String string = this.f139891b.getString(R.string.bdg);
            h.f.b.l.b(string, "");
            TuxTextView tuxTextView8 = this.f139900k;
            if (tuxTextView8 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView8.setText(R.string.bdg);
            TuxTextView tuxTextView9 = this.f139900k;
            if (tuxTextView9 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView9.setTuxFont(92);
            float f2 = (float) b4;
            if (paint.measureText(string) > f2) {
                TuxTextView tuxTextView10 = this.f139900k;
                if (tuxTextView10 == null) {
                    h.f.b.l.a("textBottom");
                }
                tuxTextView10.setTuxFont(92);
            } else {
                TuxTextView tuxTextView11 = this.f139900k;
                if (tuxTextView11 == null) {
                    h.f.b.l.a("textBottom");
                }
                tuxTextView11.setTuxFont(62);
            }
            Object[] array = p.c(string, new String[]{" "}).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            if (paint.measureText(string) > f2) {
                try {
                    String str = strArr[0];
                    int length = strArr.length;
                    int i4 = 0;
                    for (int i5 = 1; i5 < length; i5++) {
                        if (paint.measureText(str + " " + strArr[i5]) <= f2) {
                            str = str + " " + strArr[i5];
                        } else {
                            i4 = i5;
                        }
                    }
                    String str2 = strArr[i4];
                    for (int i6 = i4 + 1; i6 < strArr.length; i6++) {
                        str2 = str2 + " " + strArr[i6];
                    }
                    float b5 = h.b(paint.measureText(str), paint.measureText(str2));
                    TuxTextView tuxTextView12 = this.f139900k;
                    if (tuxTextView12 == null) {
                        h.f.b.l.a("textBottom");
                    }
                    tuxTextView12.setWidth((int) (b5 + 1.0f));
                } catch (IndexOutOfBoundsException e2) {
                    e2.printStackTrace();
                } catch (NullPointerException e3) {
                    e3.printStackTrace();
                }
            }
        }
        TuxTextView tuxTextView13 = this.f139900k;
        if (tuxTextView13 == null) {
            h.f.b.l.a("textBottom");
        }
        tuxTextView13.setVisibility(0);
        ViewGroup viewGroup2 = this.f139901l;
        if (viewGroup2 == null) {
            h.f.b.l.a("mVideoInfoContainer");
        }
        viewGroup2.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.a
    public final /* synthetic */ void a(m mVar) {
        m mVar2 = mVar;
        h.f.b.l.d(mVar2, "");
        this.f139894e = mVar2;
        if (mVar2 == null) {
            h.f.b.l.a("mData");
        }
        if (mVar2.f139476a) {
            TuxCheckBox tuxCheckBox = this.f139892c;
            if (tuxCheckBox == null) {
                h.f.b.l.a("mCheckBox");
            }
            tuxCheckBox.setVisibility(0);
        } else {
            TuxCheckBox tuxCheckBox2 = this.f139892c;
            if (tuxCheckBox2 == null) {
                h.f.b.l.a("mCheckBox");
            }
            tuxCheckBox2.setVisibility(8);
            m mVar3 = this.f139894e;
            if (mVar3 == null) {
                h.f.b.l.a("mData");
            }
            mVar3.f139482e = false;
        }
        TuxCheckBox tuxCheckBox3 = this.f139892c;
        if (tuxCheckBox3 == null) {
            h.f.b.l.a("mCheckBox");
        }
        tuxCheckBox3.setOnCheckedChangeListener(null);
        TuxCheckBox tuxCheckBox4 = this.f139892c;
        if (tuxCheckBox4 == null) {
            h.f.b.l.a("mCheckBox");
        }
        m mVar4 = this.f139894e;
        if (mVar4 == null) {
            h.f.b.l.a("mData");
        }
        tuxCheckBox4.setChecked(mVar4.f139482e);
        TuxCheckBox tuxCheckBox5 = this.f139892c;
        if (tuxCheckBox5 == null) {
            h.f.b.l.a("mCheckBox");
        }
        tuxCheckBox5.setOnCheckedChangeListener(new a(this));
        SimpleDraweeView simpleDraweeView = this.f139893d;
        if (simpleDraweeView == null) {
            h.f.b.l.a("mCover");
        }
        m mVar5 = this.f139894e;
        if (mVar5 == null) {
            h.f.b.l.a("mData");
        }
        simpleDraweeView.setTag(((com.ss.android.ugc.aweme.tools.draft.d.c) mVar5).f139480c);
        SimpleDraweeView simpleDraweeView2 = this.f139893d;
        if (simpleDraweeView2 == null) {
            h.f.b.l.a("mCover");
        }
        simpleDraweeView2.setActualImageResource(2131232427);
        m mVar6 = this.f139894e;
        if (mVar6 == null) {
            h.f.b.l.a("mData");
        }
        File file = new File(mVar6.f139481d);
        if (file.exists()) {
            Uri fromFile = Uri.fromFile(file);
            SimpleDraweeView simpleDraweeView3 = this.f139893d;
            if (simpleDraweeView3 == null) {
                h.f.b.l.a("mCover");
            }
            com.ss.android.ugc.tools.c.a.a(simpleDraweeView3, fromFile.toString(), -1, -1);
        } else {
            com.ss.android.ugc.aweme.draft.model.c a2 = this.f139897h.a(((com.ss.android.ugc.aweme.tools.draft.d.c) mVar6).f139480c);
            if (a2 == null) {
                bj.b(this.f139890a + ": bindDraftCover -> draft is null");
                com.bytedance.services.apm.api.a.a("queryNull -> " + this.f139890a + " : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.f139891b.getResources().getDimensionPixelOffset(R.dimen.j6);
                k kVar = new k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
                this.q = kVar;
                com.ss.android.ugc.aweme.draft.model.d.a(a2, kVar, new c(this, mVar6, a2));
            }
        }
        m mVar7 = this.f139894e;
        if (mVar7 == null) {
            h.f.b.l.a("mData");
        }
        if (!mVar7.f139476a) {
            TuxTextView tuxTextView = this.f139898i;
            if (tuxTextView == null) {
                h.f.b.l.a("mTvTop");
            }
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = this.f139898i;
            if (tuxTextView2 == null) {
                h.f.b.l.a("mTvTop");
            }
            m mVar8 = this.f139894e;
            if (mVar8 == null) {
                h.f.b.l.a("mData");
            }
            tuxTextView2.setText(mVar8.f139512i);
        } else {
            TuxTextView tuxTextView3 = this.f139898i;
            if (tuxTextView3 == null) {
                h.f.b.l.a("mTvTop");
            }
            tuxTextView3.setVisibility(8);
        }
        m mVar9 = this.f139894e;
        if (mVar9 == null) {
            h.f.b.l.a("mData");
        }
        if (mVar9.f139477b) {
            ViewGroup viewGroup = this.n;
            if (viewGroup == null) {
                h.f.b.l.a("mSizeContainer");
            }
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f139901l;
            if (viewGroup2 == null) {
                h.f.b.l.a("mVideoInfoContainer");
            }
            viewGroup2.setVisibility(8);
            TextView textView = this.p;
            if (textView == null) {
                h.f.b.l.a("mDraftSize");
            }
            Context context = this.f139891b;
            m mVar10 = this.f139894e;
            if (mVar10 == null) {
                h.f.b.l.a("mData");
            }
            long j2 = mVar10.f139483f;
            h.f.b.l.d(context, "");
            double d2 = (double) j2;
            Double.isNaN(d2);
            String string = context.getString(R.string.fpi, Double.valueOf(d2 / 1048576.0d));
            h.f.b.l.b(string, "");
            textView.setText(string);
            return;
        }
        ViewGroup viewGroup3 = this.n;
        if (viewGroup3 == null) {
            h.f.b.l.a("mSizeContainer");
        }
        viewGroup3.setVisibility(8);
        m mVar11 = this.f139894e;
        if (mVar11 == null) {
            h.f.b.l.a("mData");
        }
        if (mVar11.f139484g.length() > 0) {
            m mVar12 = this.f139894e;
            if (mVar12 == null) {
                h.f.b.l.a("mData");
            }
            a(mVar12);
        } else {
            TuxTextView tuxTextView4 = this.f139900k;
            if (tuxTextView4 == null) {
                h.f.b.l.a("textBottom");
            }
            tuxTextView4.setVisibility(8);
            ViewGroup viewGroup4 = this.f139901l;
            if (viewGroup4 == null) {
                h.f.b.l.a("mVideoInfoContainer");
            }
            viewGroup4.setVisibility(8);
        }
        ViewGroup viewGroup5 = this.f139901l;
        if (viewGroup5 == null) {
            h.f.b.l.a("mVideoInfoContainer");
        }
        viewGroup5.setOnClickListener(new b(this, mVar2));
    }

    static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDraftViewHolder f139903a;

        static {
            Covode.recordClassIndex(91426);
        }

        a(NewDraftViewHolder newDraftViewHolder) {
            this.f139903a = newDraftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewDraftViewHolder.a(this.f139903a).f139482e = z;
            this.f139903a.f139896g.a(NewDraftViewHolder.a(this.f139903a), z);
        }
    }

    private static Object a(Application application, String str) {
        Object obj;
        MethodCollector.i(5207);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(5207);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewDraftViewHolder(View view, com.ss.android.ugc.aweme.tools.draft.f.a aVar, com.ss.android.ugc.aweme.tools.draft.viewmodel.a aVar2) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        this.f139896g = aVar;
        this.f139897h = aVar2;
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.f139891b = context;
        View findViewById = view.findViewById(R.id.ad7);
        h.f.b.l.b(findViewById, "");
        this.f139899j = findViewById;
        View findViewById2 = view.findViewById(R.id.f4l);
        h.f.b.l.b(findViewById2, "");
        this.f139900k = (TuxTextView) findViewById2;
        View c2 = v.c(view, (int) R.id.agf);
        h.f.b.l.b(c2, "");
        this.f139893d = (SimpleDraweeView) c2;
        View findViewById3 = view.findViewById(R.id.f9s);
        h.f.b.l.b(findViewById3, "");
        this.f139898i = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.fgh);
        h.f.b.l.b(findViewById4, "");
        this.f139901l = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.ej9);
        h.f.b.l.b(findViewById5, "");
        this.f139902m = (ViewGroup) findViewById5;
        View c3 = v.c(view, (int) R.id.eyt);
        h.f.b.l.b(c3, "");
        this.p = (TextView) c3;
        View c4 = v.c(view, (int) R.id.e4q);
        h.f.b.l.b(c4, "");
        this.n = (ViewGroup) c4;
        View c5 = v.c(view, (int) R.id.a5_);
        h.f.b.l.b(c5, "");
        this.f139892c = (TuxCheckBox) c5;
        View findViewById6 = view.findViewById(R.id.c0c);
        h.f.b.l.b(findViewById6, "");
        this.o = (TuxIconView) findViewById6;
        View view2 = this.f139899j;
        if (view2 == null) {
            h.f.b.l.a("mContainer");
        }
        view2.setOnClickListener(new d(this));
        View view3 = this.f139899j;
        if (view3 == null) {
            h.f.b.l.a("mContainer");
        }
        view3.setOnLongClickListener(new e(this));
    }
}
