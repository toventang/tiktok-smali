package com.ss.android.ugc.aweme.sticker.favorite;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.d;
import com.ss.android.ugc.tools.view.style.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final StickerPreferences f134873a;

    static {
        Covode.recordClassIndex(88164);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.a$a  reason: collision with other inner class name */
    static final class RunnableC3514a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f134875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f134876c;

        static {
            Covode.recordClassIndex(88165);
        }

        RunnableC3514a(a aVar, Activity activity, View view) {
            this.f134874a = aVar;
            this.f134875b = activity;
            this.f134876c = view;
        }

        public final void run() {
            e.a aVar = new e.a(this.f134875b);
            aVar.r = R.string.g76;
            aVar.f150185l = 5000;
            aVar.A = true;
            e eVar = new e(aVar);
            eVar.a();
            View contentView = eVar.getContentView();
            l.b(contentView, "");
            int measuredWidth = contentView.getMeasuredWidth();
            d dVar = eVar.f150165e;
            if (dVar == null) {
                l.a("mDmtBubbleLayout");
            }
            float padding = ((float) ((measuredWidth - (dVar.getPADDING() * 4)) - this.f134876c.getMeasuredWidth())) + r.a(this.f134875b, 8.0f);
            float a2 = r.a(this.f134875b, 3.0f) + padding;
            Activity activity = this.f134875b;
            if (activity != null) {
                int i2 = Build.VERSION.SDK_INT;
                Resources resources = activity.getResources();
                l.b(resources, "");
                Configuration configuration = resources.getConfiguration();
                l.b(configuration, "");
                if (configuration.getLayoutDirection() == 1) {
                    eVar.a(this.f134876c, a2, -((int) padding));
                    this.f134874a.f134873a.setBubbleGuideShown(true);
                }
            }
            eVar.a(this.f134876c, 4.0f, 0);
            this.f134874a.f134873a.setBubbleGuideShown(true);
        }
    }

    public a(StickerPreferences stickerPreferences) {
        l.d(stickerPreferences, "");
        this.f134873a = stickerPreferences;
    }
}
