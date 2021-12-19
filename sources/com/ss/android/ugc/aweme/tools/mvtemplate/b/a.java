package com.ss.android.ugc.aweme.tools.mvtemplate.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.b.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C3723a f140800c = new C3723a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    b.a f140801a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f140802b;

    static {
        Covode.recordClassIndex(91930);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b
    public final void a(Intent intent) {
        l.d(intent, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a$a  reason: collision with other inner class name */
    public static final class C3723a {
        static {
            Covode.recordClassIndex(91931);
        }

        private C3723a() {
        }

        public /* synthetic */ C3723a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b f140804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f140805c;

        static {
            Covode.recordClassIndex(91932);
        }

        b(a aVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar, String str) {
            this.f140803a = aVar;
            this.f140804b = bVar;
            this.f140805c = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
            if (r1 == null) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 291
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.b.a.b.run():void");
        }
    }

    public a(Activity activity) {
        this.f140802b = activity;
        if (activity != null && !activity.isFinishing()) {
            b.a aVar = new b.a(activity);
            aVar.f33328l = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            aVar.A = true;
            this.f140801a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b
    public final boolean a(Context context, com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar, MediaModel mediaModel, boolean z) {
        CutSameVideoImageExtraData b2;
        if (bVar == null || mediaModel == null || !mediaModel.b() || (b2 = bVar.b()) == null || mediaModel.f109396h >= b2.f129203a) {
            return true;
        }
        if (context == null) {
            return false;
        }
        Activity activity = this.f140802b;
        if (activity == null) {
            l.b();
        }
        String string = activity.getString(R.string.ddb, new Object[]{Float.valueOf(((float) b2.f129203a) / 1000.0f)});
        l.b(string, "");
        if (!z) {
            d.a(context, string, 1).b();
            return false;
        }
        bVar.d();
        new Handler(Looper.getMainLooper()).postDelayed(new b(this, bVar, string), 300);
        return false;
    }
}
