package com.ss.android.ugc.aweme.shortvideo.sticker.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bd;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    Effect f130269a;

    /* renamed from: b  reason: collision with root package name */
    public OnUnlockShareFinishListener f130270b;

    /* renamed from: c  reason: collision with root package name */
    String f130271c;

    /* renamed from: d  reason: collision with root package name */
    bd.a f130272d = new bd.a() {
        /* class com.ss.android.ugc.aweme.shortvideo.sticker.e.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(85452);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private Context f130273e;

    /* renamed from: f  reason: collision with root package name */
    private bd.b f130274f = new bd.b() {
        /* class com.ss.android.ugc.aweme.shortvideo.sticker.e.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(85450);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private q<IStickerUtilsService> f130275g = new q<IStickerUtilsService>() {
        /* class com.ss.android.ugc.aweme.shortvideo.sticker.e.b.AnonymousClass2 */

        /* renamed from: a  reason: collision with root package name */
        IStickerUtilsService f130279a;

        static {
            Covode.recordClassIndex(85451);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* synthetic */ IStickerUtilsService b() {
            if (this.f130279a == null) {
                this.f130279a = AVExternalServiceImpl.a().infoService().stickerInfo();
            }
            return this.f130279a;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private boolean f130276h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f130277i = false;

    static {
        Covode.recordClassIndex(85449);
    }

    @Override // com.ss.android.ugc.aweme.sticker.h
    public final void a(Effect effect) {
        this.f130269a = effect;
    }

    public b(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z) {
        this.f130271c = str;
        this.f130273e = context;
        this.f130269a = effect;
        this.f130270b = onUnlockShareFinishListener;
        this.f130276h = true;
        this.f130277i = z;
    }
}
