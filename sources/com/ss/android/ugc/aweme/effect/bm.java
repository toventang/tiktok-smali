package com.ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class bm extends com.ss.android.ugc.aweme.effect.a.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public a f88876a;

    /* renamed from: b  reason: collision with root package name */
    public int f88877b = -1;

    public interface a {
        static {
            Covode.recordClassIndex(55909);
        }

        void a(EffectModel effectModel, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(55908);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f88774c == null) {
            return 0;
        }
        return this.f88774c.size();
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        AVDmtImageTextView f88878a;

        /* renamed from: b  reason: collision with root package name */
        AVDmtImageView f88879b;

        /* renamed from: c  reason: collision with root package name */
        ObjectAnimator f88880c;

        /* renamed from: d  reason: collision with root package name */
        int f88881d = 1;

        static {
            Covode.recordClassIndex(55910);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            ObjectAnimator objectAnimator = this.f88880c;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.f88880c.cancel();
            }
            this.f88879b.setRotation(0.0f);
            this.f88879b.setImageResource(2131230946);
        }

        b(View view) {
            super(view);
            this.f88878a = (AVDmtImageTextView) view.findViewById(R.id.eb7);
            this.f88879b = (AVDmtImageView) view.findViewById(R.id.bwk);
            this.f88878a.setOnClickListener(new bn(this));
            this.f88878a.setOnTouchListener(new t(1.1f, 100, this.f88878a));
        }
    }

    public final void a(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            int i2 = this.f88877b;
            if (i2 != -1) {
                this.f88877b = -1;
                notifyItemChanged(i2);
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f88774c.size()) {
                break;
            } else if (this.f88774c.get(i3).key.equals(effectPointModel.getKey())) {
                this.f88877b = i3;
                break;
            } else {
                i3++;
            }
        }
        notifyItemChanged(this.f88877b);
    }

    public bm(RecyclerView recyclerView, com.ss.android.ugc.aweme.effect.b.a aVar) {
        super(recyclerView, aVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1735);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1735);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        b bVar = (b) viewHolder;
        int a2 = a(i2);
        EffectModel effectModel = bm.this.f88774c.get(i2);
        if (effectModel != null) {
            bVar.f88878a.a(effectModel.iconUrl);
            bVar.f88878a.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView = bVar.f88878a;
            if (i2 == bm.this.f88877b) {
                z = true;
            } else {
                z = false;
            }
            aVDmtImageTextView.a(z);
            if (bVar.f88881d != a2) {
                bVar.f88881d = a2;
                if (a2 == 2) {
                    bVar.a();
                    bVar.f88879b.setVisibility(0);
                } else if (a2 == 4) {
                    bVar.f88879b.setVisibility(8);
                } else if (a2 == 8) {
                    bVar.f88879b.setVisibility(0);
                    bVar.f88879b.setImageResource(2131230948);
                    bVar.f88880c = ObjectAnimator.ofFloat(bVar.f88879b, "rotation", 0.0f, 360.0f);
                    bVar.f88880c.setDuration(800L);
                    bVar.f88880c.setRepeatMode(1);
                    bVar.f88880c.setRepeatCount(-1);
                    bVar.f88880c.setInterpolator(new LinearInterpolator());
                    bVar.f88880c.start();
                } else if (a2 == 16) {
                    bVar.a();
                    bVar.f88879b.setVisibility(8);
                } else if (a2 == 32) {
                    bVar.f88879b.setVisibility(0);
                    bVar.a();
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(bm bmVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1753);
        b bVar = new b(com.a.a((LayoutInflater) a(viewGroup.getContext(), "layout_inflater"), R.layout.ab4, viewGroup, false));
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(1753);
        return bVar;
    }
}
